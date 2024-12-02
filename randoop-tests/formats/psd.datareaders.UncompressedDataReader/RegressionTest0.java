import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser0 = null;
        org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader uncompressedDataReader1 = new org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader(dataParser0);
        java.io.InputStream inputStream2 = null;
        java.awt.image.BufferedImage bufferedImage3 = null;
        org.apache.commons.imaging.formats.psd.PsdImageContents psdImageContents4 = null;
        org.apache.commons.imaging.common.BinaryFileParser binaryFileParser5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uncompressedDataReader1.readData(inputStream2, bufferedImage3, psdImageContents4, binaryFileParser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.commons.imaging.formats.psd.dataparsers.DataParser dataParser0 = null;
        org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader uncompressedDataReader1 = new org.apache.commons.imaging.formats.psd.datareaders.UncompressedDataReader(dataParser0);
        java.lang.Class<?> wildcardClass2 = uncompressedDataReader1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

