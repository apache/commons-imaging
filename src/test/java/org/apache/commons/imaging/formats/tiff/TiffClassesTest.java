/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort;
import org.junit.jupiter.api.Test;

public class TiffClassesTest {

    @Test
    public void testTiffHeader() {
        final ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        final int tiffVersion = 42;
        final long offsetToFirstIFD = 8;
        final boolean bigTiff = false;
        final TiffHeader header = new TiffHeader(byteOrder, tiffVersion, offsetToFirstIFD, bigTiff);

        assertEquals(byteOrder, header.byteOrder);
        assertEquals(tiffVersion, header.tiffVersion);
        assertEquals(offsetToFirstIFD, header.offsetToFirstIFD);
        assertEquals(bigTiff, header.bigTiff);
        assertEquals("TIFF Header", header.getElementDescription());
        assertEquals(0, header.offset);
    }

    @Test
    public void testTiffContents() throws ImagingException {
        final TiffHeader header = new TiffHeader(ByteOrder.LITTLE_ENDIAN, 42, 8, false);
        final List<TiffDirectory> directories = new ArrayList<>();
        final List<TiffField> fields = new ArrayList<>();
        final TiffContents contents = new TiffContents(header, directories, fields);

        assertEquals(header, contents.header);
        assertEquals(0, contents.directories.size());
        assertEquals(0, contents.tiffFields.size());

        assertNull(contents.findField(TiffTagConstants.TIFF_TAG_COMPRESSION));
        assertNotNull(contents.getElements());
        assertEquals(1, contents.getElements().size()); // Only header

        // Test dissect (should not throw exception)
        contents.dissect();
    }

    @Test
    public void testTiffRasterDataType() {
        assertEquals(TiffRasterDataType.INTEGER, TiffRasterDataType.valueOf("INTEGER"));
        assertEquals(TiffRasterDataType.FLOAT, TiffRasterDataType.valueOf("FLOAT"));
        assertEquals(2, TiffRasterDataType.values().length);
    }

    @Test
    public void testTiffRasterStatistics() {
        final float[] data = { 1.0f, 2.0f, Float.NaN, 3.0f, 4.0f, 5.0f };
        final TiffRasterDataFloat raster = new TiffRasterDataFloat(2, 3, data);
        final TiffRasterStatistics stats = new TiffRasterStatistics(raster, 5.0f);

        assertEquals(1, stats.getCountOfNulls());
        assertEquals(4, stats.getCountOfSamples());
        assertEquals(5.0f, stats.getExcludedValue());
        assertEquals(4.0f, stats.getMaxValue());
        assertEquals(1.0f, stats.getMinValue());
        assertEquals(2.5f, stats.getMeanValue(), 0.001f);
        assertTrue(stats.isAnExcludedValueSet());

        final TiffRasterStatistics statsNoExcluded = new TiffRasterStatistics(raster, Float.NaN);
        assertEquals(5, statsNoExcluded.getCountOfSamples());
        assertFalse(statsNoExcluded.isAnExcludedValueSet());
    }

    @Test
    public void testTiffRasterStatisticsAllNaN() {
        final float[] data = { Float.NaN, Float.NaN };
        final TiffRasterDataFloat raster = new TiffRasterDataFloat(1, 2, data);
        final TiffRasterStatistics stats = new TiffRasterStatistics(raster, Float.NaN);

        assertEquals(2, stats.getCountOfNulls());
        assertEquals(0, stats.getCountOfSamples());
        assertEquals(0.0f, stats.getMeanValue());
        assertEquals(Float.POSITIVE_INFINITY, stats.getMinValue());
        assertEquals(Float.NEGATIVE_INFINITY, stats.getMaxValue());
    }

    @Test
    public void testTiffTags() {
        assertNotNull(TiffTags.getTag(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, TiffTagConstants.TIFF_TAG_COMPRESSION.tag));
        assertEquals(TiffTagConstants.TIFF_TAG_COMPRESSION.name, TiffTags.getTag(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, TiffTagConstants.TIFF_TAG_COMPRESSION.tag).name);

        // Unknown tag
        assertEquals(TiffTagConstants.TIFF_TAG_UNKNOWN.name, TiffTags.getTag(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, -1).name);

        assertNotNull(TiffTags.getTagCount(TiffTagConstants.TIFF_TAG_COMPRESSION.tag));
    }

    @Test
    public void testTiffField() throws ImagingException {
        final FieldTypeShort fieldTypeShort = new FieldTypeShort(3, "Short");
        final TiffField field = new TiffField(TiffTagConstants.TIFF_TAG_COMPRESSION.tag, TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, fieldTypeShort, 1, 0, new byte[] { 1, 0 },
                ByteOrder.LITTLE_ENDIAN, 0);

        assertEquals(TiffTagConstants.TIFF_TAG_COMPRESSION.tag, field.getTag());
        assertEquals(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, field.getDirectoryType());
        assertEquals(fieldTypeShort, field.getFieldType());
        assertEquals(1, field.getCount());
        assertEquals(0, field.getOffset());
        assertEquals(ByteOrder.LITTLE_ENDIAN, field.getByteOrder());
        assertEquals(1, field.getIntValue());
        assertNotNull(field.getTagName());
        assertNotNull(field.getValueDescription());
        assertNotNull(field.toString());
    }

    @Test
    public void testTiffDirectory() {
        final List<TiffField> entries = new ArrayList<>();
        final TiffDirectory directory = new TiffDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, entries, 0, 0, ByteOrder.LITTLE_ENDIAN);

        assertEquals(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, directory.type);
        assertEquals(0, directory.offset);
        assertEquals(0, directory.getNextDirectoryOffset());
        assertEquals(ByteOrder.LITTLE_ENDIAN, directory.getByteOrder());
        assertNotNull(directory.getElementDescription());
        assertEquals(0, directory.size());
        assertFalse(directory.iterator().hasNext());
    }

    @Test
    public void testTiffImagingParameters() {
        final TiffImagingParameters params = new TiffImagingParameters();
        assertNull(params.getCompression());
        params.setCompression(TiffTagConstants.COMPRESSION_VALUE_LZW);
        assertEquals(TiffTagConstants.COMPRESSION_VALUE_LZW, params.getCompression());

        assertFalse(params.isSubImageSet());
        params.setSubImage(1, 2, 3, 4);
        assertTrue(params.isSubImageSet());
        assertEquals(1, params.getSubImageX());
        assertEquals(2, params.getSubImageY());
        assertEquals(3, params.getSubImageWidth());
        assertEquals(4, params.getSubImageHeight());

        params.clearSubImage();
        assertFalse(params.isSubImageSet());
    }

    @Test
    public void testTiffRasterDataFloat() {
        final TiffRasterDataFloat raster = new TiffRasterDataFloat(2, 2);
        assertEquals(2, raster.getWidth());
        assertEquals(2, raster.getHeight());
        assertEquals(1, raster.getSamplesPerPixel());
        assertEquals(TiffRasterDataType.FLOAT, raster.getDataType());

        raster.setValue(0, 0, 1.0f);
        assertEquals(1.0f, raster.getValue(0, 0));
        assertEquals(1, raster.getIntValue(0, 0));

        raster.setIntValue(1, 1, 42);
        assertEquals(42.0f, raster.getValue(1, 1));
        assertEquals(42, raster.getIntValue(1, 1));

        final float[] data = raster.getData();
        assertEquals(4, data.length);
        assertEquals(1.0f, data[0]);
        assertEquals(42.0f, data[3]);

        assertNotNull(raster.getIntData());
        assertNotNull(raster.getSimpleStatistics());
    }

    @Test
    public void testTiffRasterDataInt() {
        final TiffRasterDataInt raster = new TiffRasterDataInt(2, 2);
        assertEquals(2, raster.getWidth());
        assertEquals(2, raster.getHeight());
        assertEquals(1, raster.getSamplesPerPixel());
        assertEquals(TiffRasterDataType.INTEGER, raster.getDataType());

        raster.setIntValue(0, 0, 10);
        assertEquals(10, raster.getIntValue(0, 0));
        assertEquals(10.0f, raster.getValue(0, 0));

        raster.setValue(1, 1, 20.5f);
        assertEquals(20, raster.getIntValue(1, 1)); // Truncated
        assertEquals(20.0f, raster.getValue(1, 1));

        final int[] intData = raster.getIntData();
        assertEquals(4, intData.length);
        assertEquals(10, intData[0]);
        assertEquals(20, intData[3]);

        assertNotNull(raster.getData());
        assertNotNull(raster.getSimpleStatistics());
    }
}
