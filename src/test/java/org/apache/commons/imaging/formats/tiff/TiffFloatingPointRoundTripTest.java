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


import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.file.Path;
import java.util.HashMap;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.fp.PhotometricInterpreterFloat;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
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


    @Test
    public void test() throws Exception {
        // we set up the 32 and 64 bit test cases.  At this time,
        // the Tile format is not supported for floating-point samples by the
        // TIFF datareaders classes.  So that format is not yet exercised.
        // Note also that the compressed floating-point with predictor=3
        // is processed in other tests, but not here.
        File[] testFile = new File[4];
        testFile[0] = writeFile(32, ByteOrder.LITTLE_ENDIAN, false);
        testFile[1] = writeFile(64, ByteOrder.LITTLE_ENDIAN, false);
        testFile[2] = writeFile(32, ByteOrder.BIG_ENDIAN, false);
        testFile[3] = writeFile(64, ByteOrder.BIG_ENDIAN, false);
        for (int i = 0; i < testFile.length; i++) {
            String name = testFile[i].getName();
            ByteSourceFile byteSource = new ByteSourceFile(testFile[i]);
            TiffReader tiffReader = new TiffReader(true);
            TiffContents contents = tiffReader.readDirectories(
                byteSource,
                true, // indicates that application should read image data, if present
                FormatCompliance.getDefault());
            TiffDirectory directory = contents.directories.get(0);
            PhotometricInterpreterFloat pi
                = new PhotometricInterpreterFloat(directory, -0.0001f, 1.0001f);
            HashMap<String, Object> params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_CUSTOM_PHOTOMETRIC_INTERPRETER, pi);
            ByteOrder byteOrder = tiffReader.getByteOrder();
            BufferedImage bImage = directory.getTiffImage(byteOrder, params);
            assertNotNull(bImage, "Failed to get image from " + name);
            float meanValue = pi.getMeanFound();
            assertEquals(0.5, meanValue, 1.0e-5, "Invalid numeric values in " + name);
        }

    }

    private File writeFile(int bitsPerSample, ByteOrder byteOrder, boolean useTiles)
        throws IOException, ImageWriteException {
        String name = String.format("FpRoundTrip_%2d_%s_%s.tiff",
            bitsPerSample,
            byteOrder == ByteOrder.LITTLE_ENDIAN ? "LE" : "BE",
            useTiles ? "Tiles" : "Strips");
        File outputFile = new File(tempDir.toFile(), name);

        int width = 48;
        int height = 23;
        int nRowsInBlock;
        int nColsInBlock;
        float[] f = new float[width * height];
        // note that Use Tiles is not yet implemented
        if (useTiles) {
            nRowsInBlock = 12;
            nColsInBlock = 24;
        } else {
            nRowsInBlock = 2;
            nColsInBlock = width;
        }

        // populate the image data
        for (int iCol = 0; iCol < width; iCol++) {
            float s = iCol / (float) (width - 1);
            for (int iRow = 0; iRow < height; iRow++) {
                int index = iRow * width + iCol;
                f[index] = s;
            }
        }
        byte[][] blocks;
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
        TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        TiffOutputDirectory outDir = outputSet.addRootDirectory();
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

        outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, 2);
        outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, 2 * 48 * 4);

        final TiffElement.DataElement[] imageData = new TiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new TiffImageData.Data(0, blocks[i].length, blocks[i]);
        }

        final TiffImageData tiffImageData = new TiffImageData.Strips(imageData,
            nRowsInBlock);
        outDir.setTiffImageData(tiffImageData);

        try (FileOutputStream fos = new FileOutputStream(outputFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            TiffImageWriterLossy writer = new TiffImageWriterLossy(byteOrder);
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
        float[] f, int width, int height,
        int nRowsInBlock, int nColsInBlock,
        ByteOrder byteOrder) {
        int nColsOfBlocks = (width + nColsInBlock - 1) / nColsInBlock;
        int nRowsOfBlocks = (height + nRowsInBlock + 1) / nRowsInBlock;
        int bytesPerPixel = 4;
        int nBlocks = nRowsOfBlocks * nColsOfBlocks;
        int nBytesInBlock = bytesPerPixel * nRowsInBlock * nColsInBlock;
        byte[][] blocks = new byte[nBlocks][nBytesInBlock];
        for (int i = 0; i < height; i++) {
            int blockRow = i / nRowsInBlock;
            int rowInBlock = i - blockRow * nRowsInBlock;
            int blockOffset = rowInBlock * nColsInBlock;
            for (int j = 0; j < width; j++) {
                int sample = Float.floatToRawIntBits(f[i * width + j]);
                int blockCol = j / nColsInBlock;
                int colInBlock = j - blockCol * nColsInBlock;
                int index = blockOffset + colInBlock;
                int offset = index * bytesPerPixel;
                byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];
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
        float[] f, int width, int height,
        int nRowsInBlock, int nColsInBlock,
        ByteOrder byteOrder) {
        int nColsOfBlocks = (width + nColsInBlock - 1) / nColsInBlock;
        int nRowsOfBlocks = (height + nRowsInBlock + 1) / nRowsInBlock;
        int bytesPerPixel = 8;
        int nBlocks = nRowsOfBlocks * nColsOfBlocks;
        int nBytesInBlock = bytesPerPixel * nRowsInBlock * nColsInBlock;
        byte[][] blocks = new byte[nBlocks][nBytesInBlock];
        for (int i = 0; i < height; i++) {
            int blockRow = i / nRowsInBlock;
            int rowInBlock = i - blockRow * nRowsInBlock;
            int blockOffset = rowInBlock * nColsInBlock;
            for (int j = 0; j < width; j++) {
                long sample = Double.doubleToRawLongBits((double) f[i * width + j]);
                int blockCol = j / nColsInBlock;
                int colInBlock = j - blockCol * nColsInBlock;
                int index = blockOffset + colInBlock;
                int offset = index * bytesPerPixel;
                byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];
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
