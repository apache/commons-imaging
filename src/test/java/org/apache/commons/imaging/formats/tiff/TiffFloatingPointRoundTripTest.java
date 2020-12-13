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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.file.Path;
import java.util.HashMap;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Performs a test in which a TIFF file with the special-purpose floating-point
 * sample type is used to store data to a file. The file is then read to see if
 * it matches the original values.
 * <p>
 * At this time, Commons Imaging does not fully implement the floating-point
 * specification. Currently, this class only tests the use of uncompressed
 * floating point values in the Strips format. The Tiles format is not
 * exercised.
 */
public class TiffFloatingPointRoundTripTest extends TiffBaseTest {

    @TempDir
    Path tempDir;

    final int width = 48;
    final int height = 23;
    final float f0 = 0.0F;
    final float f1 = 1.0F;
    final float[] f = new float[width * height];
    final int[] argb = new int[width * height];

    public TiffFloatingPointRoundTripTest() {
        // populate the image data
        for (int iCol = 0; iCol < width; iCol++) {
            final float s = iCol / (float) (width - 1);
            for (int iRow = 0; iRow < height; iRow++) {
                final int index = iRow * width + iCol;
                f[index] = s;
            }
        }

        // apply the photometric interpreter to assign colors to the
        // floating-point input data.  The ultimate goal of the test is to verify
        // that the values read back from the TIFF file match the input.
        try {
            final PhotometricInterpreterFloat pi = getPhotometricInterpreter();
            final ImageBuilder builder = new ImageBuilder(width, height, false);
            final int samples[] = new int[1];
            for (int iCol = 0; iCol < width; iCol++) {
                for (int iRow = 0; iRow < height; iRow++) {
                    final int index = iRow * width + iCol;
                    samples[0] = Float.floatToRawIntBits(f[index]);
                    pi.interpretPixel(builder, samples, iCol, iRow);
                    argb[index] = builder.getRGB(iCol, iRow);
                }
            }

        } catch (final ImageReadException | IOException ex) {
            fail("Exception initializing data " + ex.getMessage());
        }

    }

    /**
     * Construct a photometric interpreter. This initialization is performed in
     * a dedicated method to ensure consistency throughout different phases of
     * the test.
     *
     * @return a valid instance.
     */
    private PhotometricInterpreterFloat getPhotometricInterpreter() {
        return new PhotometricInterpreterFloat(f0, f1 + 1.0e-5f);
    }

    @Test
    public void test() throws Exception {
        // we set up the 32 and 64 bit test cases.  At this time,
        // the Tile format is not supported for floating-point samples by the
        // TIFF datareaders classes.  So that format is not yet exercised.
        // Note also that the compressed floating-point with predictor=3
        // is processed in other tests, but not here.
        final File[] testFile = new File[8];
        testFile[0] = writeFile(32, ByteOrder.LITTLE_ENDIAN, false);
        testFile[1] = writeFile(64, ByteOrder.LITTLE_ENDIAN, false);
        testFile[2] = writeFile(32, ByteOrder.BIG_ENDIAN, false);
        testFile[3] = writeFile(64, ByteOrder.BIG_ENDIAN, false);
        testFile[4] = writeFile(32, ByteOrder.LITTLE_ENDIAN, true);
        testFile[5] = writeFile(64, ByteOrder.LITTLE_ENDIAN, true);
        testFile[6] = writeFile(32, ByteOrder.BIG_ENDIAN, true);
        testFile[7] = writeFile(64, ByteOrder.BIG_ENDIAN, true);
        for (int i = 0; i < testFile.length; i++) {
            final String name = testFile[i].getName();
            final ByteSourceFile byteSource = new ByteSourceFile(testFile[i]);
            final TiffReader tiffReader = new TiffReader(true);
            final TiffContents contents = tiffReader.readDirectories(
                byteSource,
                true, // indicates that application should read image data, if present
                FormatCompliance.getDefault());
            final TiffDirectory directory = contents.directories.get(0);
            final PhotometricInterpreterFloat pi = getPhotometricInterpreter();
            final HashMap<String, Object> params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pi);
            final ByteOrder byteOrder = tiffReader.getByteOrder();
            final BufferedImage bImage = directory.getTiffImage(byteOrder, params);
            assertNotNull(bImage, "Failed to get image from " + name);
            final int[] pixel = new int[width * height];
            bImage.getRGB(0, 0, width, height, pixel, 0, width);
            for (int k = 0; k < pixel.length; k++) {
                assertEquals(argb[k], pixel[k],
                    "Extracted data does not match original, test "
                    + i + ", index " + k);
            }
            final float meanValue = pi.getMeanFound();
            assertEquals(0.5, meanValue, 1.0e-5, "Invalid numeric values in " + name);
            // To write out an image file for inspection, use the following
            // (with appropriate adjustments for path and OS)
            //File imFile = new File("C:/Users/public", testFile[i].getName() + ".png");
            //ImageIO.write(bImage, "PNG", imFile);

        }
    }

    private File writeFile(final int bitsPerSample, final ByteOrder byteOrder, final boolean useTiles)
        throws IOException, ImageWriteException {
        final String name = String.format("FpRoundTrip_%2d_%s_%s.tiff",
            bitsPerSample,
            byteOrder == ByteOrder.LITTLE_ENDIAN ? "LE" : "BE",
            useTiles ? "Tiles" : "Strips");
        final File outputFile = new File(tempDir.toFile(), name);

        final int bytesPerSample = bitsPerSample / 8;
        final int nRowsInBlock;
        final int nColsInBlock;
        final int nBytesInBlock;
        if (useTiles) {
            // Define the tiles so that they will not evenly subdivide
            // the image.  This will allow the test to evaluate how the
            // data reader processes tiles that are only partially used.
            nRowsInBlock = 12;
            nColsInBlock = 20;
        } else {
            // Define the strips so that they will not evenly subdivide
            // the image.  This will allow the test to evaluate how the
            // data reader processes strips that are only partially used.
            nRowsInBlock = 2;
            nColsInBlock = width;
        }
        nBytesInBlock = nRowsInBlock * nColsInBlock * bytesPerSample;

        final byte[][] blocks;
        if (bitsPerSample == 32) {
            blocks = this.getBytesForOutput32(
                f, width, height, nRowsInBlock, nColsInBlock, byteOrder);
        } else {
            blocks = getBytesForOutput64(
                f, width, height, nRowsInBlock, nColsInBlock, byteOrder);
        }

        // NOTE:  At this time, Tile format is not supported.
        // When it is, modify the tags below to populate
        // TIFF_TAG_TILE_* appropriately.
        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory outDir = outputSet.addRootDirectory();
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT,
            (short) TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) 1);
        outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) bitsPerSample);
        outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION,
            (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO);
        outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION,
            (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);

        outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION,
            (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);

        if (useTiles) {
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_WIDTH, nColsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_LENGTH, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS, nBytesInBlock);
        } else {
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, 2);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesInBlock);
        }

        final TiffElement.DataElement[] imageData = new TiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new TiffImageData.Data(0, blocks[i].length, blocks[i]);
        }

        final TiffImageData tiffImageData;
        if (useTiles) {
            tiffImageData
                = new TiffImageData.Tiles(imageData, nColsInBlock, nRowsInBlock);
        } else {
            tiffImageData
                = new TiffImageData.Strips(imageData, nRowsInBlock);
        }
        outDir.setTiffImageData(tiffImageData);

        try (FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            final TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
            writer.write(bos, outputSet);
            bos.flush();
        }
        return outputFile;
    }

    /**
     * Gets the bytes for output for a 32 bit floating point format. Note that
     * this method operates over "blocks" of data which may represent either
     * TIFF Strips or Tiles. When processing strips, there is always one column
     * of blocks and each strip is exactly the full width of the image. When
     * processing tiles, there may be one or more columns of blocks and the
     * block coverage may extend beyond both the last row and last column.
     *
     * @param f an array of the grid of output values in row major order
     * @param width the width of the overall image
     * @param height the height of the overall image
     * @param nRowsInBlock the number of rows in the Strip or Tile
     * @param nColsInBlock the number of columns in the Strip or Tile
     * @param byteOrder little endian or big endian
     * @return a valid array of equally sized array.
     */
    private byte[][] getBytesForOutput32(
        final float[] f, final int width, final int height,
        final int nRowsInBlock, final int nColsInBlock,
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
                final int sample = Float.floatToRawIntBits(f[i * width + j]);
                final int blockCol = j / nColsInBlock;
                final int colInBlock = j - blockCol * nColsInBlock;
                final int index = blockOffset + colInBlock;
                final int offset = index * bytesPerPixel;
                final byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    b[offset] = (byte) (sample & 0xff);
                    b[offset + 1] = (byte) ((sample >> 8) & 0xff);
                    b[offset + 2] = (byte) ((sample >> 16) & 0xff);
                    b[offset + 3] = (byte) ((sample >> 24) & 0xff);
                } else {
                    b[offset] = (byte) ((sample >> 24) & 0xff);
                    b[offset + 1] = (byte) ((sample >> 16) & 0xff);
                    b[offset + 2] = (byte) ((sample >> 8) & 0xff);
                    b[offset + 3] = (byte) (sample & 0xff);
                }
            }
        }

        return blocks;
    }

    /**
     * Gets the bytes for output for a 64 bit floating point format. Note that
     * this method operates over "blocks" of data which may represent either
     * TIFF Strips or Tiles. When processing strips, there is always one column
     * of blocks and each strip is exactly the full width of the image. When
     * processing tiles, there may be one or more columns of blocks and the
     * block coverage may extend beyond both the last row and last column.
     *
     * @param f an array of the grid of output values in row major order
     * @param width the width of the overall image
     * @param height the height of the overall image
     * @param nRowsInBlock the number of rows in the Strip or Tile
     * @param nColsInBlock the number of columns in the Strip or Tile
     * @param byteOrder little endian or big endian
     * @return a valid array of equally sized array.
     */
    private byte[][] getBytesForOutput64(
        final float[] f, final int width, final int height,
        final int nRowsInBlock, final int nColsInBlock,
        final ByteOrder byteOrder) {
        final int nColsOfBlocks = (width + nColsInBlock - 1) / nColsInBlock;
        final int nRowsOfBlocks = (height + nRowsInBlock + 1) / nRowsInBlock;
        final int bytesPerPixel = 8;
        final int nBlocks = nRowsOfBlocks * nColsOfBlocks;
        final int nBytesInBlock = bytesPerPixel * nRowsInBlock * nColsInBlock;
        final byte[][] blocks = new byte[nBlocks][nBytesInBlock];
        for (int i = 0; i < height; i++) {
            final int blockRow = i / nRowsInBlock;
            final int rowInBlock = i - blockRow * nRowsInBlock;
            final int blockOffset = rowInBlock * nColsInBlock;
            for (int j = 0; j < width; j++) {
                final long sample = Double.doubleToRawLongBits(f[i * width + j]);
                final int blockCol = j / nColsInBlock;
                final int colInBlock = j - blockCol * nColsInBlock;
                final int index = blockOffset + colInBlock;
                final int offset = index * bytesPerPixel;
                final byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    b[offset] = (byte) (sample & 0xff);
                    b[offset + 1] = (byte) ((sample >> 8) & 0xff);
                    b[offset + 2] = (byte) ((sample >> 16) & 0xff);
                    b[offset + 3] = (byte) ((sample >> 24) & 0xff);
                    b[offset + 4] = (byte) ((sample >> 32) & 0xff);
                    b[offset + 5] = (byte) ((sample >> 40) & 0xff);
                    b[offset + 6] = (byte) ((sample >> 48) & 0xff);
                    b[offset + 7] = (byte) ((sample >> 56) & 0xff);
                } else {
                    b[offset] = (byte) ((sample >> 56) & 0xff);
                    b[offset + 1] = (byte) ((sample >> 48) & 0xff);
                    b[offset + 2] = (byte) ((sample >> 40) & 0xff);
                    b[offset + 3] = (byte) ((sample >> 32) & 0xff);
                    b[offset + 4] = (byte) ((sample >> 24) & 0xff);
                    b[offset + 5] = (byte) ((sample >> 16) & 0xff);
                    b[offset + 6] = (byte) ((sample >> 8) & 0xff);
                    b[offset + 7] = (byte) (sample & 0xff);
                }
            }
        }

        return blocks;
    }
}
