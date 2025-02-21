/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.file.Path;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import org.apache.commons.imaging.formats.tiff.TiffCoverageLogger;

/**
 * Performs a test in which a TIFF file with the special-purpose 32-bit integer sample type is used to store data to a file. The file is then read to see if it
 * matches the original values. The primary purpose of this test is to verify that the TIFF data reader classes behave correctly when reading raster data in
 * various formats.
 */
public class TiffRoundTripInt32Test extends TiffBaseTest {

    @TempDir
    Path tempDir;

    int width = 48;
    int height = 23;

    int[] sample = new int[width * height];

    public TiffRoundTripInt32Test() {
        // populate the image data
        for (int iCol = 0; iCol < width; iCol++) {
            for (int iRow = 0; iRow < height; iRow++) {
                final int index = iRow * width + iCol;
                sample[index] = index - 10; // -10 so at least some are negative
            }
        }
    }

    /**
     * Gets the bytes for output for a 16 bit floating point format. Note that this method operates over "blocks" of data which may represent either TIFF Strips
     * or Tiles. When processing strips, there is always one column of blocks and each strip is exactly the full width of the image. When processing tiles,
     * there may be one or more columns of blocks and the block coverage may extend beyond both the last row and last column.
     *
     * @param s            an array of the grid of output values in row major order
     * @param width        the width of the overall image
     * @param height       the height of the overall image
     * @param nRowsInBlock the number of rows in the Strip or Tile
     * @param nColsInBlock the number of columns in the Strip or Tile
     * @param byteOrder    little-endian or big-endian
     * @return a two-dimensional array of bytes dimensioned by the number of blocks and samples
     */
    private byte[][] getBytesForOutput32(final int[] s, final int width, final int height, final int nRowsInBlock, final int nColsInBlock,
            final ByteOrder byteOrder) {
        final int nColsOfBlocks = (width + nColsInBlock - 1) / nColsInBlock;
        final int nRowsOfBlocks = (height + nRowsInBlock + 1) / nRowsInBlock;
        final int bytesPerPixel = 4;
        final int nBlocks = nRowsOfBlocks * nColsOfBlocks;
        final int nBytesInBlock = bytesPerPixel * nRowsInBlock * nColsInBlock;
        final byte[][] blocks = new byte[nBlocks][nBytesInBlock];
        for (int i = 0; i < height; i++) {
            final int blockRow = i / nRowsInBlock;
            final int rowInBlock = i - blockRow * nRowsInBlock;
            final int blockOffset = rowInBlock * nColsInBlock;
            for (int j = 0; j < width; j++) {
                final int value = s[i * width + j];
                final int blockCol = j / nColsInBlock;
                final int colInBlock = j - blockCol * nColsInBlock;
                final int index = blockOffset + colInBlock;
                final int offset = index * bytesPerPixel;
                final byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    b[offset] = (byte) (value & 0xff);
                    b[offset + 1] = (byte) (value >> 8 & 0xff);
                    b[offset + 2] = (byte) (value >> 16 & 0xff);
                    b[offset + 3] = (byte) (value >> 24 & 0xff);
                } else {
                    b[offset] = (byte) (value >> 24 & 0xff);
                    b[offset + 1] = (byte) (value >> 16 & 0xff);
                    b[offset + 2] = (byte) (value >> 8 & 0xff);
                    b[offset + 3] = (byte) (value & 0xff);
                }
            }
        }

        return blocks;
    }

    @Test
    public void test() throws Exception {
        final File[] testFile = new File[4];
        testFile[0] = writeFile(32, ByteOrder.LITTLE_ENDIAN, false);
        testFile[1] = writeFile(32, ByteOrder.BIG_ENDIAN, false);
        testFile[2] = writeFile(32, ByteOrder.LITTLE_ENDIAN, true);
        testFile[3] = writeFile(32, ByteOrder.BIG_ENDIAN, true);
        for (int i = 0; i < testFile.length; i++) {
            final String name = testFile[i].getName();
            final ByteSource byteSource = ByteSource.file(testFile[i]);
            final TiffReader tiffReader = new TiffReader(true);
            final TiffContents contents = tiffReader.readDirectories(byteSource, true, // indicates that application should read image data, if present
                    FormatCompliance.getDefault());
            final TiffDirectory directory = contents.directories.get(0);
            final TiffRasterData rdInt = directory.getRasterData(null);
            final int[] test = rdInt.getIntData();
            for (int j = 0; j < sample.length; j++) {
                assertEquals(sample[j], test[j], "Extracted data does not match original, test " + name + ": " + i + ", index " + j);
            }
            final TiffImagingParameters params = new TiffImagingParameters();
            params.setSubImage(2, 2, width - 4, height - 4);
            final TiffRasterData rdSub = directory.getRasterData(params);
            assertEquals(width - 4, rdSub.getWidth(), "Invalid sub-image width");
            assertEquals(height - 4, rdSub.getHeight(), "Invalid sub-image height");
            for (int x = 2; x < width - 2; x++) {
                for (int y = 2; y < height - 2; y++) {
                    final int a = rdInt.getIntValue(x, y);
                    final int b = rdSub.getIntValue(x - 2, y - 2);
                    assertEquals(a, b, "Sub Image test failed at (" + x + "," + y + ")");
                }
            }
            final TiffImagingParameters xparams = new TiffImagingParameters();
            xparams.setSubImage(2, 2, width, height);
            assertThrows(ImagingException.class, () -> directory.getRasterData(xparams), "Failed to catch bad subimage for test " + name);
        }
    }

    private File writeFile(final int bitsPerSample, final ByteOrder byteOrder, final boolean useTiles) throws IOException, ImagingException {
        final String name = String.format("Int32RoundTrip_%2d_%s_%s.tiff", bitsPerSample, byteOrder == ByteOrder.LITTLE_ENDIAN ? "LE" : "BE",
                useTiles ? "Tiles" : "Strips");
        final File outputFile = new File(tempDir.toFile(), name);

        final int bytesPerSample = bitsPerSample / 8;
        final int nRowsInBlock;
        final int nColsInBlock;
        final int nBytesInBlock;
        if (useTiles) {
            // Define the tiles so that they will not evenly subdivide
            // the image. This will allow the test to evaluate how the
            // data reader processes tiles that are only partially used.
            nRowsInBlock = 12;
            nColsInBlock = 20;
        } else {
            // Define the strips so that they will not evenly subdivide
            // the image. This will allow the test to evaluate how the
            // data reader processes strips that are only partially used.
            nRowsInBlock = 2;
            nColsInBlock = width;
        }
        nBytesInBlock = nRowsInBlock * nColsInBlock * bytesPerSample;

        final byte[][] blocks = getBytesForOutput32(sample, width, height, nRowsInBlock, nColsInBlock, byteOrder);

        // NOTE: At this time, Tile format is not supported.
        // When it is, modify the tags below to populate
        // TIFF_TAG_TILE_* appropriately.
        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory outDir = outputSet.addRootDirectory();
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, (short) TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) 1);
        outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) bitsPerSample);
        outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO);
        outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION, (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);

        outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION, (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);

        if (useTiles) {
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_WIDTH, nColsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_LENGTH, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS, nBytesInBlock);
        } else {
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesInBlock);
        }

        final AbstractTiffElement.DataElement[] imageData = new AbstractTiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new AbstractTiffImageData.Data(0, blocks[i].length, blocks[i]);
        }

        final AbstractTiffImageData abstractTiffImageData;
        if (useTiles) {
            abstractTiffImageData = new AbstractTiffImageData.Tiles(imageData, nColsInBlock, nRowsInBlock);
        } else {
            abstractTiffImageData = new AbstractTiffImageData.Strips(imageData, nRowsInBlock);
        }
        outDir.setTiffImageData(abstractTiffImageData);

        try (FileOutputStream fos = new FileOutputStream(outputFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            final TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
            writer.write(bos, outputSet);
            bos.flush();
        }
        return outputFile;
    }



    private File my_writeFile(final int bitsPerSample, final ByteOrder byteOrder, final boolean useTiles, final int predict, final int set_TIFF_TAG_SAMPLES_PER_PIXEL, final boolean a_991a) throws IOException, ImagingException {
        final String name = String.format("Int32RoundTrip_%2d_%s_%s.tiff", bitsPerSample, byteOrder == ByteOrder.LITTLE_ENDIAN ? "LE" : "BE",
                useTiles ? "Tiles" : "Strips");
        final File outputFile = new File(tempDir.toFile(), name);

        final int bytesPerSample = bitsPerSample / 8;
        final int nRowsInBlock;
        final int nColsInBlock;
        final int nBytesInBlock;
        if (useTiles) {
            // Define the tiles so that they will not evenly subdivide
            // the image. This will allow the test to evaluate how the
            // data reader processes tiles that are only partially used.
            nRowsInBlock = 12;
            nColsInBlock = 20;
        } else {
            // Define the strips so that they will not evenly subdivide
            // the image. This will allow the test to evaluate how the
            // data reader processes strips that are only partially used.
            nRowsInBlock = 2;
            nColsInBlock = width;
        }
        nBytesInBlock = nRowsInBlock * nColsInBlock * bytesPerSample;

        final byte[][] blocks = getBytesForOutput32(sample, width, height, nRowsInBlock, nColsInBlock, byteOrder);

        // NOTE: At this time, Tile format is not supported.
        // When it is, modify the tags below to populate
        // TIFF_TAG_TILE_* appropriately.
        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory outDir = outputSet.addRootDirectory();
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        if(a_991a == true){
            outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, (short) 111);
        }else{
            outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, (short) TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER);
        }
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) set_TIFF_TAG_SAMPLES_PER_PIXEL);
        outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) bitsPerSample);
        outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO);
        outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION, (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);

        outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION, (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);

        outDir.add(TiffTagConstants.TIFF_TAG_PREDICTOR, (short) predict);

        if (useTiles) {
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_WIDTH, nColsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_LENGTH, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS, nBytesInBlock);
        } else {
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesInBlock);
        }

        final AbstractTiffElement.DataElement[] imageData = new AbstractTiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new AbstractTiffImageData.Data(0, blocks[i].length, blocks[i]);
        }

        final AbstractTiffImageData abstractTiffImageData;
        if (useTiles) {
            abstractTiffImageData = new AbstractTiffImageData.Tiles(imageData, nColsInBlock, nRowsInBlock);
        } else {
            abstractTiffImageData = new AbstractTiffImageData.Strips(imageData, nRowsInBlock);
        }
        outDir.setTiffImageData(abstractTiffImageData);

        try (FileOutputStream fos = new FileOutputStream(outputFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            final TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
            writer.write(bos, outputSet);
            bos.flush();
        }
        return outputFile;
    }



    @Test
    public void testGetRasterData_1() throws Exception {
        // Branch 62
        //
        //    Requirements:
        //        Directory
        //            TiffTagConstants
        //                TIFF_TAG_SAMPLE_FORMAT                  = SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER    // Constant
        //                TIFF_TAG_SAMPLES_PER_PIXEL              = 1
        //                TIFF_TAG_BITS_PER_SAMPLE                = bitsPerSample = 32 
        //                TIFF_TAG_COMPRESSION                    = COMPRESSION_VALUE_UNCOMPRESSED                        // Constant   
        //                TIFF_TAG_IMAGE_WIDTH                    = 48 
        //                TIFF_TAG_IMAGE_LENGTH                   = 23
        //                TIFF_TAG_PLANAR_CONFIGURATION           = PLANAR_CONFIGURATION_VALUE_CHUNKY                     // Constant
        //                TIFF_TAG_SAMPLE_FORMAT                  = 
        //                
        //                PREDICTOR_VALUE = 1 
        //
//


        final File testFile = my_writeFile(32, ByteOrder.LITTLE_ENDIAN, false, 1, 1, false);
        final ByteSource byteSource = ByteSource.file(testFile);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource, 
            true,
            FormatCompliance.getDefault()
        );

        final TiffDirectory directory = contents.directories.get(0);
        final TiffRasterData rasterData = directory.getRasterData(null);
        final int[] intData = rasterData.getIntData();
        assertEquals(sample.length, intData.length);
        for (int i = 0; i < sample.length; i++) {
            assertEquals(sample[i], intData[i]);
        }
    }

    @Test
    public void testGetRasterData_2() throws Exception {
        // Branch 52
        //    
        //    Requirements:
        //        Directory
        //            TiffTagConstants
        //                TIFF_TAG_SAMPLE_FORMAT                  = SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER    // Constant
        //                TIFF_TAG_SAMPLES_PER_PIXEL              = 16
        //                TIFF_TAG_BITS_PER_SAMPLE                = bitsPerSample = 32 
        //                TIFF_TAG_COMPRESSION                    = COMPRESSION_VALUE_UNCOMPRESSED                        // Constant   
        //                TIFF_TAG_IMAGE_WIDTH                    = 48 
        //                TIFF_TAG_IMAGE_LENGTH                   = 23
        //                TIFF_TAG_PLANAR_CONFIGURATION           = PLANAR_CONFIGURATION_VALUE_CHUNKY                     // Constant
        //                
        //                
        //                PREDICTOR_VALUE = 1 
        //
        final File testFile = my_writeFile(32, ByteOrder.LITTLE_ENDIAN, false, 1, 16, false);
        final ByteSource byteSource = ByteSource.file(testFile);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource, 
            true,
            FormatCompliance.getDefault()
        );

        final TiffDirectory directory = contents.directories.get(0);
        Exception exception = assertThrows(ImagingException.class, () -> {
            directory.getRasterData(null);
        });

        assertEquals("TIFF integer data uses unsupported samples per pixel: 16", exception.getMessage());

    }

    @Test
    public void testGetRasterData_3() throws Exception {
        // Branch 55

        //
        //    Requirements:
        //        Directory
        //            TiffTagConstants
        //                TIFF_TAG_SAMPLE_FORMAT                  = SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER    // Constant
        //                TIFF_TAG_SAMPLES_PER_PIXEL              = 16
        //                TIFF_TAG_BITS_PER_SAMPLE                = bitsPerSample = 33 
        //                TIFF_TAG_COMPRESSION                    = COMPRESSION_VALUE_UNCOMPRESSED                        // Constant   
        //                TIFF_TAG_IMAGE_WIDTH                    = 48 
        //                TIFF_TAG_IMAGE_LENGTH                   = 23
        //                TIFF_TAG_PLANAR_CONFIGURATION           = PLANAR_CONFIGURATION_VALUE_CHUNKY                     // Constant
        //                
        //                
        //                PREDICTOR_VALUE = 1 
        //
        final File testFile = my_writeFile(33, ByteOrder.LITTLE_ENDIAN, false, 1, 1, false);
        final ByteSource byteSource = ByteSource.file(testFile);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource, 
            true,
            FormatCompliance.getDefault()
        );

        final TiffDirectory directory = contents.directories.get(0);
        Exception exception = assertThrows(ImagingException.class, () -> {
            directory.getRasterData(null);
        });
        assertEquals("TIFF integer data uses unsupported bits-per-pixel: 33", exception.getMessage());
    }

    
    @Test
    public void testGetRasterData_4() throws Exception {
        //
        //    Requirements:
        //        Directory
        //            TiffTagConstants
        //                TIFF_TAG_SAMPLE_FORMAT                  = 111
        //                TIFF_TAG_SAMPLES_PER_PIXEL              = 16
        //                TIFF_TAG_BITS_PER_SAMPLE                = bitsPerSample = 65 
        //                TIFF_TAG_COMPRESSION                    = COMPRESSION_VALUE_UNCOMPRESSED                        // Constant   
        //                TIFF_TAG_IMAGE_WIDTH                    = 48 
        //                TIFF_TAG_IMAGE_LENGTH                   = 23
        //                TIFF_TAG_PLANAR_CONFIGURATION           = PLANAR_CONFIGURATION_VALUE_CHUNKY                     // Constant
        //                
        //                
        //                PREDICTOR_VALUE = 1 
        //
        // Branch 64
        final File testFile = my_writeFile(65, ByteOrder.LITTLE_ENDIAN, false, 1, 16, true);
        final ByteSource byteSource = ByteSource.file(testFile);
        final TiffReader tiffReader = new TiffReader(true);
        final TiffContents contents = tiffReader.readDirectories(
            byteSource, 
            true,
            FormatCompliance.getDefault()
        );

        final TiffDirectory directory = contents.directories.get(0);
        Exception exception = assertThrows(ImagingException.class, () -> {
            directory.getRasterData(null);
        });
        
        assertEquals("TIFF does not provide a supported raster-data format", exception.getMessage());
    }

    private File my1_writeFile(final int bitsPerSample, final ByteOrder byteOrder, final boolean useTiles) throws IOException, ImagingException {
        final String name = String.format("Int32RoundTrip_%2d_%s_%s.tiff", bitsPerSample, 
            byteOrder == ByteOrder.LITTLE_ENDIAN ? "LE" : "BE",
            useTiles ? "Tiles" : "Strips");
        final File outputFile = new File(tempDir.toFile(), name);
    
        final int bytesPerSample = bitsPerSample / 8;
        final int nRowsInBlock;
        final int nColsInBlock;
        final int nBytesInBlock;
        
        if (useTiles) {
            nRowsInBlock = 12;
            nColsInBlock = 20;
        } else {
            nRowsInBlock = 2;
            nColsInBlock = width;
        }
        nBytesInBlock = nRowsInBlock * nColsInBlock * bytesPerSample;
    
        final byte[][] blocks = getBytesForOutput32(sample, width, height, nRowsInBlock, nColsInBlock, byteOrder);
    
        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory outDir = outputSet.addRootDirectory();
        
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, (short) TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER);
        
        // Introduce a mismatch in TIFF metadata
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) 3);  // Changed from 1 to 3
        outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, new short[]{8, 8});  // Should have 3 values, but only 2 provided (mismatch)
        
    
        outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION, (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO);
        outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION, (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);
        outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION, (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);
    
        if (useTiles) {
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_WIDTH, nColsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_LENGTH, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS, nBytesInBlock);
        } else {
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesInBlock);
        }
    
        final AbstractTiffElement.DataElement[] imageData = new AbstractTiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new AbstractTiffImageData.Data(0, blocks[i].length, blocks[i]);
        }
    
        final AbstractTiffImageData abstractTiffImageData;
        if (useTiles) {
            abstractTiffImageData = new AbstractTiffImageData.Tiles(imageData, nColsInBlock, nRowsInBlock);
        } else {
            abstractTiffImageData = new AbstractTiffImageData.Strips(imageData, nRowsInBlock);
        }
        outDir.setTiffImageData(abstractTiffImageData);
    
        try (FileOutputStream fos = new FileOutputStream(outputFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            final TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
            writer.write(bos, outputSet);
            bos.flush();
        }
        return outputFile;
    }
    @Test
    public void testSamplesPerPixelMismatch() throws Exception {
    // branch 25
    // Arrange: Create a TIFF file with a mismatch using the modified writer
    final File testFile = my1_writeFile(16, ByteOrder.LITTLE_ENDIAN, false); // 16-bit, little-endian, strips

    // Act & Assert: Calling getBufferedImage() should trigger the error
    assertThrows(ImagingException.class, () -> {
        Imaging.getBufferedImage(testFile); // This internally checks samplesPerPixel != bitsPerSample.length
    }, "Expected ImagingException due to SAMPLES_PER_PIXEL mismatch with BITS_PER_SAMPLE.");
}
    

}
