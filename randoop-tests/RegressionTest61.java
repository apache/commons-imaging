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
            org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement3 = tiffField0.new OversizeValueElement((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        java.lang.Class<?> wildcardClass18 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Comparator<org.apache.commons.imaging.formats.tiff.AbstractTiffElement> abstractTiffElementComparator0 = org.apache.commons.imaging.formats.tiff.AbstractTiffElement.COMPARATOR;
        org.junit.Assert.assertNotNull(abstractTiffElementComparator0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement15 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement18 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement3 = tiffField0.new OversizeValueElement((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = tiffField12.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass16 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = tiffField12.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement17 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter18, "Unknown Tag (0x61)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement18 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass18 = tagInfo17.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        java.io.PrintWriter printWriter47 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = tiffField22.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType2, (long) 1, (long) (byte) 100, byteArray16, byteOrder20, 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = tiffField22.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement20 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = tiffField12.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        java.lang.Class<?> wildcardClass18 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        java.lang.String str13 = tiffField12.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = tiffField12.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str13, "-1 (0xffffffff: Unknown Tag): ");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tiffField38.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = tiffField46.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.io.PrintWriter printWriter50 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = tiffField12.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        int int13 = tiffField12.getTag();
        java.lang.Class<?> wildcardClass14 = tiffField12.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        java.io.PrintWriter printWriter51 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter51, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement19 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = tiffField22.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray17 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType2, (long) 1, (long) (byte) 100, byteArray16, byteOrder20, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = tiffField22.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        java.io.PrintWriter printWriter51 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter51, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        java.io.PrintWriter printWriter40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump(printWriter40, "Unknown Tag (0x34)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField12.dump(printWriter13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter16, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass19 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double double40 = tiffField38.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        java.lang.String str13 = tiffField12.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = tiffField12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str13, "-1 (0xffffffff: Unknown Tag): ");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray18 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = oversizeValueElement22.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        java.lang.Class<?> wildcardClass24 = tiffField22.getClass();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = oversizeValueElement49.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            long long40 = tiffField38.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter16, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        int int13 = tiffField12.getTag();
        // The following exception was thrown during execution in test generation
        try {
            tiffField12.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement24 = tiffField22.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        long long20 = oversizeValueElement18.offset;
        java.lang.Class<?> wildcardClass21 = oversizeValueElement18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tiffField8.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement17 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        long long20 = oversizeValueElement18.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement19 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        int int23 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        java.lang.Class<?> wildcardClass17 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        java.lang.String str13 = tiffField12.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = tiffField12.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 (0xffffffff: Unknown Tag): " + "'", str13, "-1 (0xffffffff: Unknown Tag): ");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement19 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter16, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = tiffField22.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getTagName();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = tiffField22.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType20);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = tiffField22.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType7, (long) 100, 0L, byteArray36, byteOrder49, (int) (short) 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType2, (long) (short) 100, 1L, byteArray36, byteOrder52, (int) (short) 100);
        java.lang.Class<?> wildcardClass55 = tiffField54.getClass();
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double50 = tiffField46.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement19 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = tiffField30.getFieldType();
        java.io.PrintWriter printWriter33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField30.dump(printWriter33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNull(abstractFieldType32);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = tiffField38.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType2, (long) 1, (long) (byte) 100, byteArray16, byteOrder20, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField22.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = tiffField30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = tiffField30.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNull(abstractFieldType32);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement39 = tiffField38.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement23 = tiffField22.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = tiffField22.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(abstractFieldType24);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray17 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = tiffField12.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tiffField8.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray31 = tiffField30.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        int int26 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffField22.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = tiffField38.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            double double51 = tiffField46.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType2, (long) 1, (long) (byte) 100, byteArray16, byteOrder20, 100);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = tiffField22.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tiffField8.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = tiffField22.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        long long22 = oversizeValueElement18.offset;
        long long23 = oversizeValueElement18.offset;
        long long24 = oversizeValueElement18.offset;
        java.lang.Class<?> wildcardClass25 = oversizeValueElement18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        int int13 = tiffField12.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = tiffField12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField12.dump(printWriter13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = tiffField22.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        int int19 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement20 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter25, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType40 = tiffField38.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = tiffField38.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(abstractFieldType40);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType40 = tiffField38.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = tiffField38.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(abstractFieldType40);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass21 = tagInfo20.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(tagInfo23);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        int int21 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray13 = tiffField12.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray20 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType48 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray49 = tiffField46.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(abstractFieldType48);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = tiffField46.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType47 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = tiffField46.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType47);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        java.lang.String str21 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(tagInfo19);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        int int21 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray22 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement3 = tiffField0.new OversizeValueElement(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType20 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement19 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType47 = tiffField46.getFieldType();
        int int48 = tiffField46.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = tiffField46.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement21 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = tiffField8.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        long long50 = oversizeValueElement49.offset;
        java.lang.Class<?> wildcardClass51 = oversizeValueElement49.getClass();
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19, "52 (0x34: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        long long19 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType48 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray49 = tiffField46.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(abstractFieldType48);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder18 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder18);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray16 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.lang.String str20 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str20, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tiffField38.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        int int24 = tiffField22.getSortHint();
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter25, "Unknown Tag (0x34)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        long long25 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tiffField22.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        int int21 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = oversizeValueElement19.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType40 = tiffField38.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray41 = tiffField38.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(abstractFieldType40);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement20 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        java.lang.String str23 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray24 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x61)" + "'", str23, "Unknown Tag (0x61)");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        int int19 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(tagInfo20);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder18 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray19 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder18);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType7, (long) 35, (long) ' ', byteArray31, byteOrder41, (-1));
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) '4', abstractFieldType2, 0L, (long) 52, byteArray31, byteOrder44, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = tiffField46.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement24 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(tagInfo23);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        long long19 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement20 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter17, "97 (0x61: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement(97, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType2, 0L, 10L, byteArray21, byteOrder28, 97);
        int int31 = tiffField30.getOffset();
        int int32 = tiffField30.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray33 = tiffField30.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo20 = tiffField14.getTagInfo();
        int int21 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray24 = tiffField22.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(tagInfo23);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        int int18 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump(printWriter24, "52 (0x34: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        int int26 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffField22.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) '#', abstractFieldType2, (long) ' ', (long) (byte) 10, byteArray21, byteOrder28, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = tiffField30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray50 = tiffField46.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter18, "97 (0x61: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        long long23 = tiffField22.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = tiffField22.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(abstractFieldType24);
        org.junit.Assert.assertNull(byteOrder25);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        long long19 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement20 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType47 = tiffField46.getFieldType();
        java.io.PrintWriter printWriter48 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump(printWriter48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType47);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType2, (long) 10, (long) (-1), byteArray21, byteOrder28, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = tiffField30.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = tiffField22.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType7, (long) 10, (long) (-1), byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType2, (long) (short) 100, (long) (short) 10, byteArray26, byteOrder36, 0);
        java.io.PrintWriter printWriter39 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump(printWriter39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (int) '#', abstractFieldType2, 0L, (long) (short) 0, byteArray21, byteOrder28, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = tiffField30.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getTag();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = tiffField22.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType2, (long) '#', (long) 1, byteArray16, byteOrder20, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement23 = tiffField22.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        long long19 = tiffField14.getCount();
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter20, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField22.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType32 = tiffField30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double double33 = tiffField30.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNull(abstractFieldType32);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType7, (long) 10, (long) (-1), byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType2, (long) (short) 100, (long) (short) 10, byteArray26, byteOrder36, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = tiffField38.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        java.lang.String str26 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = tiffField22.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str26, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        java.lang.String str26 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = tiffField22.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str26, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType2, (long) 1, (long) (byte) 100, byteArray16, byteOrder20, 100);
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType48 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = tiffField46.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(abstractFieldType48);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass16 = tagInfo15.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.Class<?> wildcardClass18 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement21 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType2, (long) (byte) 1, (long) (byte) 0, byteArray21, byteOrder28, (int) '4');
        java.io.PrintWriter printWriter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField30.dump(printWriter31, "Unknown Tag (0x23)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        java.nio.ByteOrder byteOrder50 = tiffField46.getByteOrder();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo51 = tiffField46.getTagInfo();
        int int52 = tiffField46.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType53 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = tiffField46.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(byteOrder50);
        org.junit.Assert.assertNotNull(tagInfo51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(abstractFieldType53);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        int int21 = oversizeValueElement20.length;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = oversizeValueElement20.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str19 = tiffField14.getTagName();
        int int20 = tiffField14.getTag();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21, "97 (0x61: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = tiffField30.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        int int26 = tiffField22.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffField22.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray22 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(32, (int) ' ');
        long long23 = oversizeValueElement22.offset;
        int int24 = oversizeValueElement22.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        int int21 = tiffField14.getTag();
        java.lang.Class<?> wildcardClass22 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(32, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement17 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder16 = tiffField14.getByteOrder();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertNull(byteOrder16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        long long22 = oversizeValueElement18.offset;
        long long23 = oversizeValueElement18.offset;
        long long24 = oversizeValueElement18.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType2, (long) '#', 0L, byteArray31, byteOrder44, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray47 = tiffField46.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType48 = tiffField46.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            double double49 = tiffField46.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(abstractFieldType48);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        java.lang.String str28 = tiffField22.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str28, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray21 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        int int20 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        int int20 = tiffField14.getOffset();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNotNull(tagInfo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        long long20 = oversizeValueElement18.offset;
        int int21 = oversizeValueElement18.length;
        java.lang.Class<?> wildcardClass22 = oversizeValueElement18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = oversizeValueElement20.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) (short) 1, (-1));
        long long21 = oversizeValueElement20.offset;
        int int22 = oversizeValueElement20.length;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = oversizeValueElement20.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement(1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tiffField8.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        int int23 = tiffField22.getSortHint();
        int int24 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField22.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement(97, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement(0, (int) (byte) 0);
        int int27 = oversizeValueElement26.length;
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType12, (long) 1, (long) (byte) 100, byteArray26, byteOrder30, 100);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType7, (long) 10, (long) (-1), byteArray26, byteOrder33, 0);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, (-1), abstractFieldType2, (long) (short) 100, (long) (short) 10, byteArray26, byteOrder36, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = tiffField38.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = tiffField30.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        java.lang.String str21 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        long long20 = oversizeValueElement18.offset;
        int int21 = oversizeValueElement18.length;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        int int21 = tiffField14.getTag();
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        int int16 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str20 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement49 = tiffField46.new OversizeValueElement(100, (int) '#');
        long long50 = oversizeValueElement49.offset;
        long long51 = oversizeValueElement49.offset;
        int int52 = oversizeValueElement49.length;
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        int int23 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray24 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        java.lang.String str27 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            tiffField22.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str27, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        int int20 = tiffField14.getDirectoryType();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = tiffField14.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        int int22 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter23, "Unknown Tag (0x23)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.nio.ByteOrder byteOrder10 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField12 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) '#', abstractFieldType2, (long) (byte) -1, 1L, byteArray9, byteOrder10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tiffField12.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement((int) ' ', 32);
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        java.nio.ByteOrder byteOrder9 = tiffField8.getByteOrder();
        java.lang.String str10 = tiffField8.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tiffField8.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNull(byteOrder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str10, "10 (0xa: Unknown Tag): ");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        int int18 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        java.lang.String str20 = tiffField14.getTagName();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Unknown Tag (0x61)" + "'", str20, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        int int39 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = tiffField38.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        java.lang.Class<?> wildcardClass20 = tiffField14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(tagInfo23);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNotNull(tagInfo19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        int int18 = tiffField14.getDirectoryType();
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        int int18 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement16 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        java.lang.String str18 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(abstractFieldType19);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement21 = tiffField14.new OversizeValueElement((int) ' ', 32);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType47 = tiffField46.getFieldType();
        int int48 = tiffField46.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            tiffField46.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement30 = tiffField22.new OversizeValueElement(97, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int48 = tiffField46.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray40 = tiffField38.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        int int16 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        int int39 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray40 = tiffField38.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType7, (long) (short) -1, (long) (short) -1, byteArray21, byteOrder25, 1);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType2, (long) '4', (long) 1, byteArray21, byteOrder28, (int) (short) 100);
        long long31 = tiffField30.getCount();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray32 = tiffField30.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = oversizeValueElement23.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType7, (long) 100, 0L, byteArray36, byteOrder49, (int) (short) 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType2, (long) (short) 100, 1L, byteArray36, byteOrder52, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = tiffField54.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement(32, (int) ' ');
        java.lang.String str23 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str23, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        java.lang.String str22 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.getStringValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Unknown Tag (0x61)" + "'", str22, "Unknown Tag (0x61)");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        int int16 = tiffField14.getDirectoryType();
        int int17 = tiffField14.getDirectoryType();
        int int18 = tiffField14.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType12, (long) 35, (long) ' ', byteArray36, byteOrder46, (-1));
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(0, (int) '4', abstractFieldType7, 0L, (long) 52, byteArray36, byteOrder49, 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, (int) (short) 1, abstractFieldType2, 97L, (long) 1, byteArray36, byteOrder52, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = tiffField54.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        java.lang.Class<?> wildcardClass21 = oversizeValueElement18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter17, "Unknown Tag (0x23)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = tiffField22.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) '#', abstractFieldType7, (long) ' ', (long) (byte) 10, byteArray26, byteOrder33, 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 0, abstractFieldType2, (long) (short) -1, (long) (short) 0, byteArray26, byteOrder36, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement39 = tiffField38.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertNull(byteOrder20);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        long long25 = tiffField22.getCount();
        java.lang.Class<?> wildcardClass26 = tiffField22.getClass();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 32, abstractFieldType2, (long) (short) -1, (long) 32, byteArray36, byteOrder52, (int) '#');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement57 = tiffField54.new OversizeValueElement(100, (int) '4');
        long long58 = oversizeValueElement57.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = oversizeValueElement57.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo21 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray22 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(tagInfo21);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType7, (long) 100, 0L, byteArray36, byteOrder49, (int) (short) 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType2, (long) (short) 100, 1L, byteArray36, byteOrder52, (int) (short) 100);
        int int55 = tiffField54.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = tiffField54.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        int int19 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        int int16 = tiffField14.getDirectoryType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(tagInfo17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType31 = tiffField30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray32 = tiffField30.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType31);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray20 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        int int20 = oversizeValueElement18.length;
        int int21 = oversizeValueElement18.length;
        java.lang.Class<?> wildcardClass22 = oversizeValueElement18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(0, 32, abstractFieldType2, (long) (short) -1, (long) 32, byteArray36, byteOrder52, (int) '#');
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement57 = tiffField54.new OversizeValueElement(100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = oversizeValueElement57.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType7, (long) '#', 0L, byteArray36, byteOrder49, (int) ' ');
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 0, abstractFieldType2, (long) 'a', (long) (byte) -1, byteArray36, byteOrder52, 0);
        java.lang.String str55 = tiffField54.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "10 (0xa: Unknown Tag): " + "'", str55, "10 (0xa: Unknown Tag): ");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        int int21 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement22 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertNull(byteOrder19);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((-1), (int) (byte) 100, abstractFieldType2, 0L, 10L, byteArray21, byteOrder28, 97);
        int int31 = tiffField30.getOffset();
        java.io.PrintWriter printWriter32 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField30.dump(printWriter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        java.io.PrintWriter printWriter40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump(printWriter40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType2, (long) '#', (long) 1, byteArray16, byteOrder20, 1);
        java.lang.String str23 = tiffField22.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tiffField22.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x23)" + "'", str23, "Unknown Tag (0x23)");
        org.junit.Assert.assertNull(abstractFieldType24);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement28 = tiffField22.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType2, (long) 100, 0L, byteArray31, byteOrder44, (int) (short) 0);
        int int47 = tiffField46.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray48 = tiffField46.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement abstractTiffElement18 = tiffField14.getOversizeValueElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement23 = tiffField14.new OversizeValueElement(97, (int) (short) -1);
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement26 = tiffField14.new OversizeValueElement(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray5 = new byte[] {};
        java.nio.ByteOrder byteOrder6 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField8 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) 10, (int) ' ', abstractFieldType2, (long) 97, (long) (short) 10, byteArray5, byteOrder6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tiffField8.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.nio.ByteOrder byteOrder19 = tiffField14.getByteOrder();
        int int20 = tiffField14.getDirectoryType();
        java.nio.ByteOrder byteOrder21 = tiffField14.getByteOrder();
        java.lang.String str22 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNull(byteOrder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str22, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType27 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder37 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField39 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType27, (long) 0, 10L, byteArray36, byteOrder37, (int) (byte) -1);
        java.nio.ByteOrder byteOrder40 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField42 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType22, (long) (short) -1, (long) (short) -1, byteArray36, byteOrder40, 1);
        java.nio.ByteOrder byteOrder43 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField45 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType17, (long) '4', (long) 1, byteArray36, byteOrder43, (int) (short) 100);
        java.nio.ByteOrder byteOrder46 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField48 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType12, (long) (byte) 100, (long) '#', byteArray36, byteOrder46, (int) (short) 1);
        java.nio.ByteOrder byteOrder49 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField51 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 1, (-1), abstractFieldType7, (long) 100, 0L, byteArray36, byteOrder49, (int) (short) 0);
        java.nio.ByteOrder byteOrder52 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField54 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) (byte) 0, abstractFieldType2, (long) (short) 100, 1L, byteArray36, byteOrder52, (int) (short) 100);
        int int55 = tiffField54.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray56 = tiffField54.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray39 = tiffField38.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType7, (long) (short) 100, (long) 52, byteArray21, byteOrder25, (int) (byte) 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) (short) 0, abstractFieldType2, (long) (byte) 1, (long) (byte) 0, byteArray21, byteOrder28, (int) '4');
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType31 = tiffField30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = tiffField30.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType31);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.imaging.formats.tiff.TiffField tiffField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement3 = tiffField0.new OversizeValueElement((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        long long20 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo21 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(abstractFieldType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(tagInfo21);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = tiffField38.getIntValueOrArraySum();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1 };
        java.nio.ByteOrder byteOrder8 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField10 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, 100, abstractFieldType2, 52L, 100L, byteArray7, byteOrder8, 1);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray11 = tiffField10.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType22 = null;
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder32 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField34 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType22, (long) 0, 10L, byteArray31, byteOrder32, (int) (byte) -1);
        java.nio.ByteOrder byteOrder35 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField37 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType17, (long) (short) -1, (long) (short) -1, byteArray31, byteOrder35, 1);
        java.nio.ByteOrder byteOrder38 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField40 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType12, (long) '4', (long) 1, byteArray31, byteOrder38, (int) (short) 100);
        java.nio.ByteOrder byteOrder41 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField43 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType7, (long) (byte) 100, (long) '#', byteArray31, byteOrder41, (int) (short) 1);
        java.nio.ByteOrder byteOrder44 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField46 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 97, abstractFieldType2, (long) '#', 0L, byteArray31, byteOrder44, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = tiffField46.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        int int20 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = tiffField14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        int int18 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = tiffField14.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(35, (int) (byte) 1, abstractFieldType2, (long) '#', (long) 1, byteArray16, byteOrder20, 1);
        java.lang.String str23 = tiffField22.getTagName();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType24 = tiffField22.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = abstractFieldType24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x23)" + "'", str23, "Unknown Tag (0x23)");
        org.junit.Assert.assertNull(abstractFieldType24);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = tiffField14.getIntArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray31 = tiffField30.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 0, abstractFieldType2, (long) (short) 100, (long) '4', byteArray21, byteOrder28, 0);
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType31 = tiffField30.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = tiffField30.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNull(abstractFieldType31);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        int int17 = tiffField14.getSortHint();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getSortHint();
        long long16 = tiffField14.getCount();
        long long17 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement20 = tiffField14.new OversizeValueElement((int) 'a', (int) (short) 1);
        java.lang.String str21 = tiffField14.getTagName();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement24 = tiffField14.new OversizeValueElement((int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double25 = tiffField14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Unknown Tag (0x61)" + "'", str21, "Unknown Tag (0x61)");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        java.lang.String str18 = tiffField14.getTagName();
        java.lang.String str19 = tiffField14.getDescriptionWithoutValue();
        int int20 = tiffField14.getOffset();
        int int21 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray22 = tiffField14.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Unknown Tag (0x61)" + "'", str18, "Unknown Tag (0x61)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str19, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) -1, (int) (short) 1, abstractFieldType2, (long) (byte) 100, (long) '#', byteArray26, byteOrder36, (int) (short) 1);
        int int39 = tiffField38.getSortHint();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType40 = tiffField38.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = tiffField38.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(abstractFieldType40);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        int int20 = tiffField14.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo19 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tiffField14.getBytesLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNotNull(tagInfo19);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = tiffField22.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        java.lang.String str21 = tiffField14.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = tiffField14.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str21, "97 (0x61: Unknown Tag): ");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = tiffField14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo15 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement18 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long19 = oversizeValueElement18.offset;
        long long20 = oversizeValueElement18.offset;
        long long21 = oversizeValueElement18.offset;
        long long22 = oversizeValueElement18.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = oversizeValueElement18.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', 1, abstractFieldType7, (long) '4', (long) 1, byteArray26, byteOrder33, (int) (short) 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 0, 10, abstractFieldType2, (long) 35, (long) ' ', byteArray26, byteOrder36, (-1));
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo39 = tiffField38.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            tiffField38.dump();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(tagInfo39);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        int int18 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = tiffField14.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder22 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField24 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType12, (long) 0, 10L, byteArray21, byteOrder22, (int) (byte) -1);
        java.nio.ByteOrder byteOrder25 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField27 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (byte) 10, 10, abstractFieldType7, (long) 1, (long) (byte) 100, byteArray21, byteOrder25, 100);
        java.nio.ByteOrder byteOrder28 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField30 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (byte) 100, abstractFieldType2, (long) 10, (long) (-1), byteArray21, byteOrder28, 0);
        java.lang.Class<?> wildcardClass31 = byteArray21.getClass();
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        java.nio.ByteOrder byteOrder18 = tiffField14.getByteOrder();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNull(byteOrder18);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType12 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder27 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField29 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType17, (long) 0, 10L, byteArray26, byteOrder27, (int) (byte) -1);
        java.nio.ByteOrder byteOrder30 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField32 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType12, (long) (short) -1, (long) (short) -1, byteArray26, byteOrder30, 1);
        java.nio.ByteOrder byteOrder33 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField35 = new org.apache.commons.imaging.formats.tiff.TiffField(97, (int) '#', abstractFieldType7, (long) ' ', (long) (byte) 10, byteArray26, byteOrder33, 100);
        java.nio.ByteOrder byteOrder36 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField38 = new org.apache.commons.imaging.formats.tiff.TiffField(10, 0, abstractFieldType2, (long) (short) -1, (long) (short) 0, byteArray26, byteOrder36, 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray39 = tiffField38.getByteArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        java.nio.ByteOrder byteOrder20 = tiffField14.getByteOrder();
        int int21 = tiffField14.getTag();
        int int22 = tiffField14.getSortHint();
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        java.lang.String str18 = tiffField14.getDescriptionWithoutValue();
        java.lang.String str19 = tiffField14.getTagName();
        int int20 = tiffField14.getOffset();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str18, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown Tag (0x61)" + "'", str19, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray28 = tiffField22.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        long long16 = tiffField14.getCount();
        int int17 = tiffField14.getTag();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        long long26 = tiffField22.getCount();
        int int27 = tiffField22.getOffset();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement30 = tiffField22.new OversizeValueElement(97, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long31 = tiffField22.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        java.lang.String str15 = tiffField14.getTagName();
        long long16 = tiffField14.getCount();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType17 = tiffField14.getFieldType();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = tiffField14.getDoubleArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown Tag (0x61)" + "'", str15, "Unknown Tag (0x61)");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(abstractFieldType17);
        org.junit.Assert.assertNotNull(tagInfo18);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        java.lang.String str26 = tiffField22.getDescriptionWithoutValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = tiffField22.isLocalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str26, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = tiffField22.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        java.lang.String str17 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo18 = tiffField14.getTagInfo();
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType19 = tiffField14.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = tiffField14.getValueDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str17, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertNotNull(tagInfo18);
        org.junit.Assert.assertNull(abstractFieldType19);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        long long20 = tiffField14.getCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tiffField14.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        int int15 = tiffField14.getDirectoryType();
        java.lang.String str16 = tiffField14.getDescriptionWithoutValue();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement19 = tiffField14.new OversizeValueElement((-1), (int) (byte) 100);
        long long20 = oversizeValueElement19.offset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = oversizeValueElement19.getElementDescription();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 (0x61: Unknown Tag): " + "'", str16, "97 (0x61: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField(52, (int) (byte) 10, abstractFieldType2, (long) (short) 100, (long) 52, byteArray16, byteOrder20, (int) (byte) 100);
        java.lang.String str23 = tiffField22.getTagName();
        int int24 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder25 = tiffField22.getByteOrder();
        java.lang.String str26 = tiffField22.getDescriptionWithoutValue();
        long long27 = tiffField22.getCount();
        java.lang.String str28 = tiffField22.getDescriptionWithoutValue();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Unknown Tag (0x34)" + "'", str23, "Unknown Tag (0x34)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str26, "52 (0x34: Unknown Tag): ");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "52 (0x34: Unknown Tag): " + "'", str28, "52 (0x34: Unknown Tag): ");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            tiffField14.dump(printWriter23, "-1 (0xffffffff: Unknown Tag): ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) '4', 100, abstractFieldType2, (long) (short) -1, (long) (short) -1, byteArray16, byteOrder20, 1);
        int int23 = tiffField22.getTag();
        java.nio.ByteOrder byteOrder24 = tiffField22.getByteOrder();
        int int25 = tiffField22.getDirectoryType();
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray26 = tiffField22.getLongArrayValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType7 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder17 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField19 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType7, (long) 0, 10L, byteArray16, byteOrder17, (int) (byte) -1);
        java.nio.ByteOrder byteOrder20 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField22 = new org.apache.commons.imaging.formats.tiff.TiffField((int) (short) -1, (int) (short) 0, abstractFieldType2, 10L, (long) (byte) 10, byteArray16, byteOrder20, (int) ' ');
        int int23 = tiffField22.getSortHint();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = tiffField22.getFieldTypeName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType abstractFieldType2 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.nio.ByteOrder byteOrder12 = null;
        org.apache.commons.imaging.formats.tiff.TiffField tiffField14 = new org.apache.commons.imaging.formats.tiff.TiffField((int) 'a', (int) 'a', abstractFieldType2, (long) 0, 10L, byteArray11, byteOrder12, (int) (byte) -1);
        long long15 = tiffField14.getCount();
        int int16 = tiffField14.getOffset();
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo17 = tiffField14.getTagInfo();
        int int18 = tiffField14.getDirectoryType();
        int int19 = tiffField14.getTag();
        org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement oversizeValueElement22 = tiffField14.new OversizeValueElement((int) (short) 0, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo23 = tiffField14.getTagInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = tiffField14.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(tagInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(tagInfo23);
    }
}

