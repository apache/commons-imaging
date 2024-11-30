import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips17.getImageData();
        boolean boolean23 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips17.getImageData();
        boolean boolean25 = strips17.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory21 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter22 = null;
        int[] intArray24 = new int[] {};
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration30 = null;
        java.nio.ByteOrder byteOrder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader32 = strips15.getDataReader(tiffDirectory21, photometricInterpreter22, (int) (byte) 0, intArray24, (int) (byte) 100, 52, 2, (int) '#', (int) (short) 10, tiffPlanarConfiguration30, byteOrder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(0);
        boolean boolean19 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        int int21 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray23, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertNotNull(dataElementArray23);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) 'a');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips28 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, 6);
        boolean boolean29 = strips28.stripsNotTiles();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement31 = strips28.getImageData(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(0);
        int int19 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        int int21 = strips15.rowsPerStrip;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray4);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data6 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) 1, (int) (short) 10, byteArray4);
        byte[] byteArray7 = data6.getData();
        java.lang.String str8 = data6.getElementDescription();
        byte[] byteArray9 = data6.getData();
        long long10 = data6.offset;
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TIFF image data: 0 bytes" + "'", str8, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (byte) -1, 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray16, (int) '4');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray16, 32);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 32);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray20, (int) ' ');
        boolean boolean23 = strips22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dataElementArray24);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray23, (-1));
        int int26 = strips25.rowsPerStrip;
        boolean boolean27 = strips25.stripsNotTiles();
        boolean boolean28 = strips25.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = strips25.getImageData();
        boolean boolean30 = strips25.stripsNotTiles();
        boolean boolean31 = strips25.stripsNotTiles();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement33 = strips25.getImageData((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = dataElement21.getDataLength();
        int int23 = dataElement21.getDataLength();
        long long24 = dataElement21.offset;
        long long25 = dataElement21.offset;
        byte[] byteArray26 = dataElement21.getData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(0);
        boolean boolean19 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        boolean boolean21 = strips15.stripsNotTiles();
        boolean boolean22 = strips15.stripsNotTiles();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement24 = strips15.getImageData(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray19 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory20 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter21 = null;
        int[] intArray24 = new int[] { (short) 10 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration30 = null;
        java.nio.ByteOrder byteOrder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader32 = strips15.getDataReader(tiffDirectory20, photometricInterpreter21, (int) (short) 1, intArray24, (int) (byte) 100, 1, (int) (byte) 10, (int) (byte) -1, 0, tiffPlanarConfiguration30, byteOrder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertNotNull(dataElementArray19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10 });
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        int int25 = tiles22.getTileHeight();
        int int26 = tiles22.getTileHeight();
        boolean boolean27 = tiles22.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory20 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter21 = null;
        int[] intArray24 = new int[] { 0 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration30 = null;
        java.nio.ByteOrder byteOrder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader32 = strips15.getDataReader(tiffDirectory20, photometricInterpreter21, 2, intArray24, 10, 100, 3, 32, 1, tiffPlanarConfiguration30, byteOrder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0 });
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray4);
        long long6 = data5.offset;
        byte[] byteArray7 = data5.getData();
        byte[] byteArray8 = data5.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) ' ', (int) (short) 100, byteArray8);
        int int10 = data9.getDataLength();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement19 = strips17.getImageData((int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory21 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter22 = null;
        int[] intArray26 = new int[] { 2, 6 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration32 = null;
        java.nio.ByteOrder byteOrder33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader34 = strips17.getDataReader(tiffDirectory21, photometricInterpreter22, (int) (short) 1, intArray26, 3, (int) (byte) 100, 0, (int) ' ', 2, tiffPlanarConfiguration32, byteOrder33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElement19);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 2, 6 });
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, 10, (int) ' ');
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles23.getImageData();
        int int25 = tiles23.getTileHeight();
        int int26 = tiles23.getTileHeight();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles21 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray18, 6, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = tiles21.tiles;
        int int23 = tiles21.getTileWidth();
        int int24 = tiles21.getTileHeight();
        boolean boolean25 = tiles21.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray14);
        long long16 = data15.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data7, data11, data15 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) (short) 1);
        int int20 = strips19.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement22 = strips19.getImageData(1);
        int int23 = dataElement22.length;
        byte[] byteArray24 = dataElement22.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(100L, (int) (short) 100, byteArray24);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 1, (int) (short) 10, byteArray24);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dataElement22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        boolean boolean21 = tiles19.stripsNotTiles();
        int int22 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray23, (int) (short) 100, 100);
        boolean boolean27 = tiles26.stripsNotTiles();
        int int28 = tiles26.getTileHeight();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(1);
        boolean boolean19 = strips15.stripsNotTiles();
        boolean boolean20 = strips15.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        boolean boolean21 = tiles19.stripsNotTiles();
        int int22 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles19.tiles;
        int int24 = tiles19.getTileWidth();
        int int25 = tiles19.getTileHeight();
        int int26 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles19.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(dataElementArray27);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = strips17.getImageData();
        int int24 = strips17.getImageDataLength();
        boolean boolean25 = strips17.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = null;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray0, 2, (int) (short) 100);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray4);
        long long6 = data5.offset;
        byte[] byteArray7 = data5.getData();
        byte[] byteArray8 = data5.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) ' ', (int) (short) 100, byteArray8);
        java.lang.Class<?> wildcardClass10 = data9.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, 10, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles27.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles27.getImageData();
        boolean boolean31 = tiles27.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray32 = tiles27.tiles;
        int int33 = tiles27.getTileHeight();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertNotNull(dataElementArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dataElementArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = tiles19.tiles;
        boolean boolean23 = tiles19.stripsNotTiles();
        boolean boolean24 = tiles19.stripsNotTiles();
        boolean boolean25 = tiles19.stripsNotTiles();
        int int26 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory27 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter28 = null;
        int[] intArray35 = new int[] { 10, (byte) -1, '4', 52, (byte) 100 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration41 = null;
        java.nio.ByteOrder byteOrder42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader43 = tiles19.getDataReader(tiffDirectory27, photometricInterpreter28, 35, intArray35, (int) (byte) -1, (int) (byte) 10, (int) (byte) 1, (int) (byte) 1, 2, tiffPlanarConfiguration41, byteOrder42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 10, (-1), 52, 52, 100 });
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) 'a');
        boolean boolean20 = strips19.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement23 = strips19.getImageData(2);
        int int24 = strips19.rowsPerStrip;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElement23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        long long5 = data3.offset;
        long long6 = data3.offset;
        java.lang.String str7 = data3.getElementDescription();
        int int8 = data3.length;
        byte[] byteArray9 = data3.getData();
        java.lang.String str10 = data3.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TIFF image data: 0 bytes" + "'", str7, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TIFF image data: 0 bytes" + "'", str10, "TIFF image data: 0 bytes");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        byte[] byteArray12 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray12);
        long long14 = data13.offset;
        int int15 = data13.length;
        java.lang.String str16 = data13.getElementDescription();
        byte[] byteArray17 = data13.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data18 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) 0, (int) '4', byteArray17);
        byte[] byteArray19 = data18.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data20 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 100, 1, byteArray19);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data21 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) (short) 1, byteArray19);
        int int22 = data21.length;
        byte[] byteArray23 = data21.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) (byte) 1, byteArray23);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) 'a', byteArray23);
        int int26 = data25.getDataLength();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "TIFF image data: 0 bytes" + "'", str16, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        int int5 = data3.getDataLength();
        long long6 = data3.offset;
        java.lang.String str7 = data3.getElementDescription();
        int int8 = data3.length;
        byte[] byteArray9 = data3.getData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TIFF image data: 0 bytes" + "'", str7, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, 10, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles27.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles27.getImageData();
        boolean boolean31 = tiles27.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray32 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips34 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray32, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips36 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray32, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips38 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray32, 3);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray39 = strips38.getImageData();
        boolean boolean40 = strips38.stripsNotTiles();
        boolean boolean41 = strips38.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement43 = strips38.getImageData(2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertNotNull(dataElementArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dataElementArray32);
        org.junit.Assert.assertNotNull(dataElementArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dataElement43);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        boolean boolean21 = tiles19.stripsNotTiles();
        int int22 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles19.getImageData();
        boolean boolean24 = tiles19.stripsNotTiles();
        int int25 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray26 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips28 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray26, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles31 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray26, (int) (byte) 1, 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray32 = tiles31.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray33 = tiles31.tiles;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(dataElementArray26);
        org.junit.Assert.assertNotNull(dataElementArray32);
        org.junit.Assert.assertNotNull(dataElementArray33);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips17.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray22);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement23 = strips17.getImageData((int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(dataElement23);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.rowsPerStrip;
        int int22 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = strips17.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(dataElementArray23);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = null;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips2 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray0, 2);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory3 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter4 = null;
        int[] intArray8 = new int[] { 100, 3 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration14 = null;
        java.nio.ByteOrder byteOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader16 = strips2.getDataReader(tiffDirectory3, photometricInterpreter4, 0, intArray8, (int) (short) 100, 32, (int) (short) 10, (int) (short) -1, (int) 'a', tiffPlanarConfiguration14, byteOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 100, 3 });
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) -1, (int) '#', byteArray14);
        byte[] byteArray16 = data15.getData();
        byte[] byteArray17 = data15.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data18 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(10L, 3, byteArray17);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '4', 35, byteArray17);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data20 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) -1, 52, byteArray17);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        long long5 = data3.offset;
        java.lang.String str6 = data3.getElementDescription();
        int int7 = data3.getDataLength();
        int int8 = data3.getDataLength();
        java.lang.String str9 = data3.getElementDescription();
        byte[] byteArray10 = data3.getData();
        java.lang.String str11 = data3.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TIFF image data: 0 bytes" + "'", str6, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TIFF image data: 0 bytes" + "'", str9, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TIFF image data: 0 bytes" + "'", str11, "TIFF image data: 0 bytes");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        boolean boolean24 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray26 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dataElementArray25);
        org.junit.Assert.assertNotNull(dataElementArray26);
        org.junit.Assert.assertNotNull(dataElementArray27);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        int int18 = strips17.rowsPerStrip;
        int int19 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, (int) (byte) 1, (int) '#');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, 97, (int) (short) 1);
        int int27 = tiles26.getTileWidth();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) 'a');
        int int20 = strips19.rowsPerStrip;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = strips17.getImageDataLength();
        int int23 = strips17.getImageDataLength();
        boolean boolean24 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = strips17.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dataElementArray25);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        int int17 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray19 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray19, (int) (byte) 100, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray19, 52, 100);
        boolean boolean26 = tiles25.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertNotNull(dataElementArray19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = strips17.getImageDataLength();
        boolean boolean23 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = strips17.getImageData();
        boolean boolean26 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory27 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter28 = null;
        int[] intArray32 = new int[] { (short) 1, 2 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration38 = null;
        java.nio.ByteOrder byteOrder39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader40 = strips17.getDataReader(tiffDirectory27, photometricInterpreter28, (int) (byte) 1, intArray32, (int) (byte) 10, (int) (short) 1, (int) 'a', (int) (byte) 0, 2, tiffPlanarConfiguration38, byteOrder39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 2 });
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray4);
        long long6 = data5.offset;
        long long7 = data5.offset;
        byte[] byteArray8 = data5.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((-1L), (int) '#', byteArray8);
        int int10 = data9.getDataLength();
        int int11 = data9.length;
        int int12 = data9.length;
        long long13 = data9.offset;
        java.lang.Class<?> wildcardClass14 = data9.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        boolean boolean18 = strips15.stripsNotTiles();
        int int19 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        int int21 = strips15.getImageDataLength();
        boolean boolean22 = strips15.stripsNotTiles();
        boolean boolean23 = strips15.stripsNotTiles();
        boolean boolean24 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = strips15.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dataElementArray25);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        boolean boolean25 = tiles22.stripsNotTiles();
        int int26 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles31 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray28, (int) (short) 1, (-1));
        int int32 = tiles31.getTileHeight();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory33 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter34 = null;
        int[] intArray37 = new int[] { (byte) 10 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration43 = null;
        java.nio.ByteOrder byteOrder44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader45 = tiles31.getDataReader(tiffDirectory33, photometricInterpreter34, (int) 'a', intArray37, 0, 32, 0, (int) (byte) 0, (int) (byte) 1, tiffPlanarConfiguration43, byteOrder44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dataElementArray27);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10 });
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (byte) -1, 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray16, (int) '4');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray16, 32);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (byte) -1, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips31 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray16, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray21, 3, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = tiles24.getImageData();
        boolean boolean26 = tiles24.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray0 = null;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray0, 32, 6);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) 'a');
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips19.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory21 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter22 = null;
        int[] intArray24 = new int[] {};
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration30 = null;
        java.nio.ByteOrder byteOrder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader32 = strips19.getDataReader(tiffDirectory21, photometricInterpreter22, 2, intArray24, 3, (int) (byte) 10, (int) (byte) 100, (int) ' ', 35, tiffPlanarConfiguration30, byteOrder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        boolean boolean25 = tiles22.stripsNotTiles();
        int int26 = tiles22.getTileHeight();
        boolean boolean27 = tiles22.stripsNotTiles();
        boolean boolean28 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dataElementArray29);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        byte[] byteArray4 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data5 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray4);
        long long6 = data5.offset;
        long long7 = data5.offset;
        java.lang.String str8 = data5.getElementDescription();
        int int9 = data5.getDataLength();
        int int10 = data5.getDataLength();
        java.lang.String str11 = data5.getElementDescription();
        byte[] byteArray12 = data5.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 10, 35, byteArray12);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TIFF image data: 0 bytes" + "'", str8, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TIFF image data: 0 bytes" + "'", str11, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        int int13 = data11.length;
        java.lang.String str14 = data11.getElementDescription();
        byte[] byteArray15 = data11.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data16 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) 0, (int) '4', byteArray15);
        byte[] byteArray17 = data16.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data18 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 100, 1, byteArray17);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) (short) 1, byteArray17);
        int int20 = data19.length;
        byte[] byteArray21 = data19.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) (byte) 1, byteArray21);
        java.lang.Class<?> wildcardClass23 = data22.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TIFF image data: 0 bytes" + "'", str14, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips17.getImageData();
        boolean boolean23 = strips17.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = tiles19.tiles;
        boolean boolean23 = tiles19.stripsNotTiles();
        boolean boolean24 = tiles19.stripsNotTiles();
        boolean boolean25 = tiles19.stripsNotTiles();
        int int26 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray27, 35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(dataElementArray27);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) 'a');
        boolean boolean20 = strips19.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips19.getImageData();
        int int22 = strips19.getImageDataLength();
        int int23 = strips19.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips19.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory25 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter26 = null;
        int[] intArray33 = new int[] { 100, (short) -1, (byte) 1, (byte) 0, '#' };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration39 = null;
        java.nio.ByteOrder byteOrder40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader41 = strips19.getDataReader(tiffDirectory25, photometricInterpreter26, (-1), intArray33, 0, 32, 97, (int) (byte) 10, 10, tiffPlanarConfiguration39, byteOrder40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 100, (-1), 1, 0, 35 });
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        boolean boolean21 = tiles19.stripsNotTiles();
        int int22 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles19.getImageData();
        int int24 = tiles19.getTileWidth();
        int int25 = tiles19.getTileHeight();
        int int26 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles19.getImageData();
        boolean boolean28 = tiles19.stripsNotTiles();
        boolean boolean29 = tiles19.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(dataElementArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        int int24 = tiles22.getTileWidth();
        boolean boolean25 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray26 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dataElementArray26);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory19 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter20 = null;
        int[] intArray23 = new int[] { 2 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration29 = null;
        java.nio.ByteOrder byteOrder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader31 = strips15.getDataReader(tiffDirectory19, photometricInterpreter20, (int) (byte) -1, intArray23, (int) (short) 0, 52, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100, tiffPlanarConfiguration29, byteOrder30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 2 });
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) (byte) 1);
        int int27 = strips26.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory28 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter29 = null;
        int[] intArray32 = new int[] { '#' };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration38 = null;
        java.nio.ByteOrder byteOrder39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader40 = strips26.getDataReader(tiffDirectory28, photometricInterpreter29, 35, intArray32, 6, 35, 97, (int) (short) 1, (int) (byte) 100, tiffPlanarConfiguration38, byteOrder39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 35 });
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray21, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray21, 35);
        boolean boolean26 = strips25.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        byte[] byteArray14 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray14);
        long long16 = data15.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data7, data11, data15 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) (short) 1);
        int int20 = strips19.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement22 = strips19.getImageData(1);
        int int23 = dataElement22.length;
        byte[] byteArray24 = dataElement22.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(100L, (int) (short) 100, byteArray24);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 32, (int) (short) 0, byteArray24);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dataElement22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, (-1), (int) '4');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles32 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, (int) (byte) 10, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory33 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter34 = null;
        int[] intArray41 = new int[] { (byte) -1, (short) 0, ' ', (byte) 100, 100 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration47 = null;
        java.nio.ByteOrder byteOrder48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader49 = tiles32.getDataReader(tiffDirectory33, photometricInterpreter34, (int) (byte) 0, intArray41, 10, (int) (short) 10, (int) (byte) 1, (int) '#', 2, tiffPlanarConfiguration47, byteOrder48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 0, 32, 100, 100 });
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        boolean boolean25 = tiles22.stripsNotTiles();
        int int26 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dataElementArray27);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertNotNull(dataElementArray29);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray23, (-1));
        int int26 = strips25.rowsPerStrip;
        boolean boolean27 = strips25.stripsNotTiles();
        boolean boolean28 = strips25.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = strips25.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = strips25.getImageData();
        int int31 = strips25.getImageDataLength();
        java.lang.Class<?> wildcardClass32 = strips25.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertNotNull(dataElementArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) -1, (int) '#', byteArray12);
        byte[] byteArray14 = data13.getData();
        byte[] byteArray15 = data13.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data16 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(10L, 3, byteArray15);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '4', 35, byteArray15);
        int int18 = data17.getDataLength();
        long long19 = data17.offset;
        int int20 = data17.length;
        java.lang.Class<?> wildcardClass21 = data17.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, 10, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles27.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles33 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray30, (int) (short) 1, (int) '#');
        boolean boolean34 = tiles33.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray35 = tiles33.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles38 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray35, 2, 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips40 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray35, 52);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips42 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray35, 2);
        java.lang.Class<?> wildcardClass43 = strips42.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertNotNull(dataElementArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dataElementArray35);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray23, (-1));
        int int26 = strips25.rowsPerStrip;
        boolean boolean27 = strips25.stripsNotTiles();
        boolean boolean28 = strips25.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = strips25.getImageData();
        boolean boolean30 = strips25.stripsNotTiles();
        boolean boolean31 = strips25.stripsNotTiles();
        int int32 = strips25.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray33 = strips25.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(dataElementArray33);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data10 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 1, (int) '4', byteArray8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 35, 0, byteArray8);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data12 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) '#', (int) (short) 10, byteArray8);
        java.lang.String str13 = data12.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TIFF image data: 0 bytes" + "'", str13, "TIFF image data: 0 bytes");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = strips17.getImageDataLength();
        boolean boolean23 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) (byte) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips28 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) 'a');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips30 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) (byte) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray31 = strips30.getImageData();
        boolean boolean32 = strips30.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) 'a');
        boolean boolean20 = strips19.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips19.getImageData();
        int int22 = strips19.getImageDataLength();
        boolean boolean23 = strips19.stripsNotTiles();
        java.lang.Class<?> wildcardClass24 = strips19.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = strips17.getImageDataLength();
        boolean boolean23 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = strips17.getImageData();
        boolean boolean26 = strips17.stripsNotTiles();
        int int27 = strips17.rowsPerStrip;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles22.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray23, (-1));
        int int26 = strips25.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = strips25.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(dataElementArray27);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        boolean boolean18 = strips15.stripsNotTiles();
        int int19 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, (int) ' ', (int) (byte) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles23.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray24, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray24);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileWidth();
        boolean boolean24 = tiles22.stripsNotTiles();
        boolean boolean25 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray26 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray26, 35, (-1));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dataElementArray26);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data12 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) -1, (int) (byte) 0, byteArray11);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(0L, (int) (byte) 0, byteArray11);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data14 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(0L, (int) (byte) 0, byteArray11);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        int int25 = tiles22.getTileHeight();
        boolean boolean26 = tiles22.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        boolean boolean23 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray24, 10, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles27.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray29 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles33 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray30, (int) (short) 1, (int) '#');
        boolean boolean34 = tiles33.stripsNotTiles();
        int int35 = tiles33.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray36 = tiles33.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray37 = tiles33.getImageData();
        boolean boolean38 = tiles33.stripsNotTiles();
        int int39 = tiles33.getTileWidth();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory40 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter41 = null;
        int[] intArray45 = new int[] { (short) 100, (-1) };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration51 = null;
        java.nio.ByteOrder byteOrder52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader53 = tiles33.getDataReader(tiffDirectory40, photometricInterpreter41, 35, intArray45, (int) '#', (int) (short) 10, 6, (int) '4', (int) (byte) 0, tiffPlanarConfiguration51, byteOrder52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertNotNull(dataElementArray29);
        org.junit.Assert.assertNotNull(dataElementArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dataElementArray36);
        org.junit.Assert.assertNotNull(dataElementArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 100, (-1) });
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        boolean boolean20 = strips17.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        int int5 = data3.getDataLength();
        long long6 = data3.offset;
        java.lang.String str7 = data3.getElementDescription();
        java.lang.String str8 = data3.getElementDescription();
        byte[] byteArray9 = data3.getData();
        int int10 = data3.getDataLength();
        java.lang.String str11 = data3.getElementDescription();
        long long12 = data3.offset;
        long long13 = data3.offset;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TIFF image data: 0 bytes" + "'", str7, "TIFF image data: 0 bytes");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TIFF image data: 0 bytes" + "'", str8, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "TIFF image data: 0 bytes" + "'", str11, "TIFF image data: 0 bytes");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data8 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 1, (int) '4', byteArray6);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(0L, (int) ' ', byteArray6);
        long long10 = data9.offset;
        int int11 = data9.getDataLength();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) 10, 3, byteArray2);
        int int4 = data3.length;
        java.lang.String str5 = data3.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TIFF image data: 0 bytes" + "'", str5, "TIFF image data: 0 bytes");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        boolean boolean21 = tiles19.stripsNotTiles();
        int int22 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = tiles19.getImageData();
        int int24 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray25 = tiles19.tiles;
        int int26 = tiles19.getTileHeight();
        int int27 = tiles19.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles19.getImageData();
        int int29 = tiles19.getTileWidth();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(dataElementArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(dataElementArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(dataElementArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips15.getImageData(0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray22, (int) (byte) 1);
        int int25 = strips24.rowsPerStrip;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        int int5 = data3.getDataLength();
        long long6 = data3.offset;
        int int7 = data3.getDataLength();
        int int8 = data3.getDataLength();
        int int9 = data3.getDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        long long5 = data3.offset;
        int int6 = data3.getDataLength();
        long long7 = data3.offset;
        long long8 = data3.offset;
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        byte[] byteArray8 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray8);
        long long10 = data9.offset;
        long long11 = data9.offset;
        byte[] byteArray12 = data9.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((-1L), (int) '#', byteArray12);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data14 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 0, (int) (byte) -1, byteArray12);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (short) 10, 2, byteArray12);
        int int16 = data15.length;
        long long17 = data15.offset;
        java.lang.String str18 = data15.getElementDescription();
        java.lang.String str19 = data15.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TIFF image data: 0 bytes" + "'", str18, "TIFF image data: 0 bytes");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "TIFF image data: 0 bytes" + "'", str19, "TIFF image data: 0 bytes");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement18 = strips15.getImageData(0);
        boolean boolean19 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips15.getImageData();
        boolean boolean21 = strips15.stripsNotTiles();
        boolean boolean22 = strips15.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray23 = strips15.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElement18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dataElementArray23);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (byte) 100);
        boolean boolean20 = strips19.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips19.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dataElementArray21);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, (int) (short) 100, (int) (byte) -1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, (int) (byte) 100, 3);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, 35, (int) (byte) 1);
        int int30 = tiles29.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray31 = tiles29.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dataElementArray31);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        long long8 = data7.offset;
        long long9 = data7.offset;
        byte[] byteArray10 = data7.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((-1L), (int) '#', byteArray10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data12 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data(0L, 100, byteArray10);
        long long13 = data12.offset;
        byte[] byteArray14 = data12.getData();
        int int15 = data12.length;
        int int16 = data12.getDataLength();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        boolean boolean25 = tiles22.stripsNotTiles();
        int int26 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles22.getImageData();
        int int28 = tiles22.getTileWidth();
        boolean boolean29 = tiles22.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dataElementArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dataElementArray30);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, 10, (int) (short) 10);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.tiles;
        int int21 = tiles19.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray22, 97, (int) '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(dataElementArray22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips15.getImageData(0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray22, (int) (byte) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement26 = strips24.getImageData((int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = strips24.getImageData();
        java.lang.Class<?> wildcardClass28 = dataElementArray27.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertNotNull(dataElement26);
        org.junit.Assert.assertNotNull(dataElementArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        int int21 = strips17.rowsPerStrip;
        boolean boolean22 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement24 = strips17.getImageData(2);
        boolean boolean25 = strips17.stripsNotTiles();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dataElement24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        boolean boolean19 = strips17.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips17.getImageData(0);
        int int22 = strips17.getImageDataLength();
        boolean boolean23 = strips17.stripsNotTiles();
        int int24 = strips17.getImageDataLength();
        int int25 = strips17.getImageDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data9 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) -1, (int) '#', byteArray8);
        byte[] byteArray10 = data9.getData();
        byte[] byteArray11 = data9.getData();
        long long12 = data9.offset;
        java.lang.String str13 = data9.getElementDescription();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "TIFF image data: 6 bytes" + "'", str13, "TIFF image data: 6 bytes");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        int int25 = tiles22.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray26 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dataElementArray26);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray21, 35);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles26 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray21, (int) (byte) 0, (int) '4');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles29 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray21, (int) (short) 0, 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray30 = tiles29.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray30);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        int int17 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray19 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory20 = null;
        org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter21 = null;
        int[] intArray28 = new int[] { (byte) 10, 52, (short) 10, (byte) 1, 32 };
        org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration tiffPlanarConfiguration34 = null;
        java.nio.ByteOrder byteOrder35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader imageDataReader36 = strips15.getDataReader(tiffDirectory20, photometricInterpreter21, 10, intArray28, 6, (int) (byte) 10, 97, (int) 'a', 35, tiffPlanarConfiguration34, byteOrder35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertNotNull(dataElementArray19);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 10, 52, 10, 1, 32 });
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.getImageDataLength();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement21 = strips15.getImageData(0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips15.getImageData();
        boolean boolean23 = strips15.stripsNotTiles();
        int int24 = strips15.getImageDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(dataElement21);
        org.junit.Assert.assertNotNull(dataElementArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = strips15.getImageData();
        boolean boolean18 = strips15.stripsNotTiles();
        int int19 = strips15.rowsPerStrip;
        boolean boolean20 = strips15.stripsNotTiles();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement dataElement22 = strips15.getImageData((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles22 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) 0, 1);
        int int23 = tiles22.getTileHeight();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray24 = tiles22.tiles;
        int int25 = tiles22.getTileHeight();
        int int26 = tiles22.getTileWidth();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray27 = tiles22.getImageData();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dataElementArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dataElementArray27);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        boolean boolean17 = strips15.stripsNotTiles();
        int int18 = strips15.getImageDataLength();
        int int19 = strips15.getImageDataLength();
        int int20 = strips15.rowsPerStrip;
        int int21 = strips15.getImageDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        int int16 = strips15.rowsPerStrip;
        int int17 = strips15.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray19 = strips15.getImageData();
        int int20 = strips15.getImageDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertNotNull(dataElementArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        long long4 = data3.offset;
        int int5 = data3.getDataLength();
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        int int13 = data11.length;
        java.lang.String str14 = data11.getElementDescription();
        byte[] byteArray15 = data11.getData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data16 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) (byte) 0, (int) '4', byteArray15);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data16 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray17, (int) (short) 10);
        boolean boolean20 = strips19.stripsNotTiles();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = strips19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray22 = strips19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray22, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "TIFF image data: 0 bytes" + "'", str14, "TIFF image data: 0 bytes");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(dataElementArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray22);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips17 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 100);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray18 = strips17.getImageData();
        int int19 = strips17.rowsPerStrip;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = strips17.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles23 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray20, 10, (int) ' ');
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips25 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray20, (int) (byte) 1);
        int int26 = strips25.getImageDataLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        byte[] byteArray2 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data3 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray2);
        byte[] byteArray6 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data7 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray6);
        byte[] byteArray10 = new byte[] {};
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data data11 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Data((long) 100, (int) '#', byteArray10);
        long long12 = data11.offset;
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray13 = new org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] { data3, data7, data11 };
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips15 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray13, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray16 = strips15.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles19 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray16, (int) (short) -1, (int) (byte) 0);
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray20 = tiles19.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray21 = tiles19.tiles;
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles24 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray21, (int) (byte) -1, (int) (short) 1);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles27 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray21, (int) (byte) 10, (int) ' ');
        org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement[] dataElementArray28 = tiles27.getImageData();
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips strips30 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Strips(dataElementArray28, 97);
        org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles tiles33 = new org.apache.commons.imaging.formats.tiff.AbstractTiffImageData.Tiles(dataElementArray28, (int) (short) 0, 3);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(dataElementArray13);
        org.junit.Assert.assertNotNull(dataElementArray16);
        org.junit.Assert.assertNotNull(dataElementArray20);
        org.junit.Assert.assertNotNull(dataElementArray21);
        org.junit.Assert.assertNotNull(dataElementArray28);
    }
}

