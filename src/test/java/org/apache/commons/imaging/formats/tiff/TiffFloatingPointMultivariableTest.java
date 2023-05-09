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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.tiff.constants.TiffPlanarConfiguration;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
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
public class TiffFloatingPointMultivariableTest extends TiffBaseTest {

    @TempDir
    Path tempDir;

    int width = 48;
    int height = 23;
    int samplesPerPixel = 2;
    float f0 = 0.0F;
    float f1 = 1.0F;
    float[] fSample = new float[width * height * samplesPerPixel];
    public TiffFloatingPointMultivariableTest() {
        for(int iPlane = 0; iPlane<2; iPlane++){
            final int pOffset = iPlane*width*height;
            for(int iRow=0; iRow<height; iRow++){
                for(int iCol=0; iCol<width; iCol++){
                    final int index = pOffset + iRow*width +iCol;
                    fSample[index] = index;
                }
            }
        }
    }

    private void applyTilePredictor(final int nRowsInBlock, final int nColsInBlock, final byte[] bytes) {
        // The floating-point horizonal predictor breaks the samples into
        // separate sets of bytes.  The first set contains the high-order bytes.
        // The second the second-highest order bytes, etc.  Once the bytes are
        // separated, differencing is applied.  This treatment improves the
        // statistical predictability of the data. By doing so, it improves
        // its compressibility.
        //     More extensive discussions of this technique are given in the
        // Javadoc for the TIFF-specific ImageDataReader class.
        final byte[] b = new byte[bytes.length];
        final int bytesInRow = nColsInBlock * 4;
        for (int iPlane = 0; iPlane < samplesPerPixel; iPlane++) {
            // separate out the groups of bytes
            final int planarByteOffset = iPlane * nRowsInBlock * nColsInBlock * 4;
            for (int i = 0; i < nRowsInBlock; i++) {
                final int aOffset = planarByteOffset + i * bytesInRow;
                final int bOffset = aOffset + nColsInBlock;
                final int cOffset = bOffset + nColsInBlock;
                final int dOffset = cOffset + nColsInBlock;
                for (int j = 0; j < nColsInBlock; j++) {
                    b[aOffset + j] = bytes[aOffset + j * 4];
                    b[bOffset + j] = bytes[aOffset + j * 4 + 1];
                    b[cOffset + j] = bytes[aOffset + j * 4 + 2];
                    b[dOffset + j] = bytes[aOffset + j * 4 + 3];
                }
                // apply differencing
                for (int j = bytesInRow - 1; j > 0; j--) {
                    b[aOffset + j] -= b[aOffset + j - 1];
                }
            }
        }
        // copy the results back over the input byte array
        System.arraycopy(b, 0, bytes, 0, bytes.length);
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
        final int nRowsInBlock, final int nColsInBlock,
        final ByteOrder byteOrder,
        final boolean useTiles, final TiffPlanarConfiguration planarConfiguration ) {
        final int nColsOfBlocks = (width + nColsInBlock - 1) / nColsInBlock;
        final int nRowsOfBlocks = (height + nRowsInBlock + 1) / nRowsInBlock;
        final int bytesPerPixel = 4 * samplesPerPixel;
        final int nBlocks = nRowsOfBlocks * nColsOfBlocks;
        final int nBytesInBlock = bytesPerPixel * nRowsInBlock * nColsInBlock;
        final byte[][] blocks = new byte[nBlocks][nBytesInBlock];
        if(planarConfiguration == TiffPlanarConfiguration.CHUNKY){
            for (int i = 0; i < height; i++) {
                final int blockRow = i / nRowsInBlock;
                final int rowInBlock = i - blockRow * nRowsInBlock;
                for (int j = 0; j < width; j++) {
                    final int blockCol = j / nColsInBlock;
                    final int colInBlock = j - blockCol * nColsInBlock;
                    final byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];  // reference to relevant block
                    for(int k=0; k<2; k++){
                        final float sValue = fSample[k*width*height + i * width + j];
                        final int sample = Float.floatToRawIntBits(sValue);
                        final int offset = (rowInBlock * nColsInBlock + colInBlock) * 8 + k * 4;
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
            }
        }else{
            for (int i = 0; i < height; i++) {
                final int blockRow = i / nRowsInBlock;
                final int rowInBlock = i - blockRow * nRowsInBlock;
                int blockPlanarOffset = nRowsInBlock*nColsInBlock;
                if(!useTiles && (blockRow+1)*nRowsInBlock>height){
                    // For TIFF files using the Strip format, the convention
                    // is to not include any extra padding in the data.  So if the
                    // height of the image is not evenly divided by the number
                    // of rows per strip, an adjustmnet is made to the size of the block.
                    // However, the TIFF specification calls for tiles to always be padded.
                     final int nRowsAdjusted = height - blockRow*nRowsInBlock;
                     blockPlanarOffset = nRowsAdjusted * nColsInBlock;
                }
                for (int j = 0; j < width; j++) {
                    final int blockCol = j / nColsInBlock;
                    final int colInBlock = j - blockCol * nColsInBlock;
                    final byte[] b = blocks[blockRow * nColsOfBlocks + blockCol];  // reference to relevant block
                    for(int k=0; k<2; k++){
                        final float sValue = fSample[k*width*height + i * width + j];
                        final int sample = Float.floatToRawIntBits(sValue);
                        final int offset = (k * blockPlanarOffset + rowInBlock * nColsInBlock + colInBlock)* 4;
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
            }
        }

        return blocks;
    }

    @Test
    public void test() throws Exception {
        // we set up the 32 and 64 bit test cases.  At this time,
        // the Tile format is not supported for floating-point samples by the
        // TIFF datareaders classes.  So that format is not yet exercised.
        // Note also that the compressed floating-point with predictor=3
        // is processed in other tests, but not here.
        final List<File>testFiles = new ArrayList<>();
        testFiles.add(writeFile(ByteOrder.LITTLE_ENDIAN, false, false, TiffPlanarConfiguration.CHUNKY));
        testFiles.add(writeFile(ByteOrder.BIG_ENDIAN,    false, false, TiffPlanarConfiguration.CHUNKY));
        testFiles.add(writeFile(ByteOrder.LITTLE_ENDIAN, true, false, TiffPlanarConfiguration.CHUNKY));
        testFiles.add(writeFile(ByteOrder.BIG_ENDIAN,    true, false, TiffPlanarConfiguration.CHUNKY));
        testFiles.add(writeFile(ByteOrder.LITTLE_ENDIAN, false, false, TiffPlanarConfiguration.PLANAR));
        testFiles.add(writeFile(ByteOrder.BIG_ENDIAN,    false, false, TiffPlanarConfiguration.PLANAR));
        testFiles.add(writeFile(ByteOrder.LITTLE_ENDIAN, true, false, TiffPlanarConfiguration.PLANAR));
        testFiles.add(writeFile(ByteOrder.BIG_ENDIAN,    true, false, TiffPlanarConfiguration.PLANAR));

        // To exercise the horizontal-differencing-predictor logic, we include a writer that will
        // reorganize the bytes into the form used by the floating-pont horizontal predictor.
        // This test does not apply data compression, but it does apply the predictor.
        // Note that although the TIFF predictor does not require big-endian formats, per se,
        // the test logic implemented here does.
        testFiles.add(writeFile(ByteOrder.BIG_ENDIAN, true, true, TiffPlanarConfiguration.PLANAR));

        for(final File testFile : testFiles){
            final String name = testFile.getName();
            final ByteSourceFile byteSource = new ByteSourceFile(testFile);
            final TiffReader tiffReader = new TiffReader(true);
            final TiffContents contents = tiffReader.readDirectories(
                byteSource,
                true, // indicates that application should read image data, if present
                FormatCompliance.getDefault());
            final TiffDirectory directory = contents.directories.get(0);
            final TiffRasterData raster = directory.getRasterData(new TiffImagingParameters());
            assertNotNull(raster, "Failed to get raster from " + name);
            assertEquals(2, raster.getSamplesPerPixel(), "Invalid samples per pixel in " + name);
            for(int iPlane = 0; iPlane<2; iPlane++){
                final int pOffset = iPlane*width*height;
                for(int iRow=0; iRow<height; iRow++){
                    for(int iCol=0; iCol<width; iCol++){
                        final int index = pOffset + iRow*width +iCol;
                        final float tValue = fSample[index];
                        final float rValue = raster.getValue(iCol, iRow, iPlane);
                        assertEquals(tValue, rValue, "Failed at index x="+iCol+", y="+iRow+", iPlane="+iPlane);
                    }
                }
            }
        }
    }

    private File writeFile(
        final ByteOrder byteOrder,
        final boolean useTiles,
        final boolean usePredictorForTiles,
        final TiffPlanarConfiguration planarConfiguration ) throws IOException, ImageWriteException {

        final String name = String.format("FpMultiVarRoundTrip_%s_%s%s.tiff",
            planarConfiguration==TiffPlanarConfiguration.CHUNKY ? "Chunky" : "Planar",
            useTiles ? "Tiles" : "Strips",
            usePredictorForTiles ? "_Predictor" : "");
        final File outputFile = new File(tempDir.toFile(), name);

        final int bytesPerSample = 4 * samplesPerPixel;
        final int bitsPerSample =  8 * bytesPerSample;

        int nRowsInBlock;
        int nColsInBlock;
        int nBytesInBlock;
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

        byte[][] blocks;
            blocks = this.getBytesForOutput32(nRowsInBlock, nColsInBlock, byteOrder,
            useTiles, planarConfiguration);

        final TiffOutputSet outputSet = new TiffOutputSet(byteOrder);
        final TiffOutputDirectory outDir = outputSet.addRootDirectory();
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_WIDTH, width);
        outDir.add(TiffTagConstants.TIFF_TAG_IMAGE_LENGTH, height);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT,
            (short) TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT);
        outDir.add(TiffTagConstants.TIFF_TAG_SAMPLES_PER_PIXEL, (short) samplesPerPixel);
        outDir.add(TiffTagConstants.TIFF_TAG_BITS_PER_SAMPLE, (short) bitsPerSample);
        outDir.add(TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION,
            (short) TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO);
        outDir.add(TiffTagConstants.TIFF_TAG_COMPRESSION,
            (short) TiffTagConstants.COMPRESSION_VALUE_UNCOMPRESSED);

        if(useTiles && usePredictorForTiles){
            outDir.add(TiffTagConstants.TIFF_TAG_PREDICTOR,
            (short) TiffTagConstants.PREDICTOR_VALUE_FLOATING_POINT_DIFFERENCING);
              for (final byte[] block : blocks) {
                  applyTilePredictor(nRowsInBlock, nColsInBlock, block);
              }
        }

        if(planarConfiguration==TiffPlanarConfiguration.CHUNKY){
        outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION,
            (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_CHUNKY);
        }else{
               outDir.add(TiffTagConstants.TIFF_TAG_PLANAR_CONFIGURATION,
            (short) TiffTagConstants.PLANAR_CONFIGURATION_VALUE_PLANAR);
        }

        if (useTiles) {
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_WIDTH, nColsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_LENGTH, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS, nBytesInBlock);
        } else {
            outDir.add(TiffTagConstants.TIFF_TAG_ROWS_PER_STRIP, nRowsInBlock);
            outDir.add(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS, nBytesInBlock);
        }

        final TiffElement.DataElement[] imageData = new TiffElement.DataElement[blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            imageData[i] = new TiffImageData.Data(0, blocks[i].length, blocks[i]);
        }

        TiffImageData tiffImageData;
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

}
