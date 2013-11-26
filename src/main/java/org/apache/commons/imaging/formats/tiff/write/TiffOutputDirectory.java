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
package org.apache.commons.imaging.formats.tiff.write;

import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.constants.TagConstantsUtils;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

public final class TiffOutputDirectory extends TiffOutputItem implements
        TiffConstants {
    public final int type;
    private final List<TiffOutputField> fields = new ArrayList<TiffOutputField>();
    private final ByteOrder byteOrder;
    private TiffOutputDirectory nextDirectory = null;
    public static final Comparator<TiffOutputDirectory> COMPARATOR = new Comparator<TiffOutputDirectory>() {
        public int compare(final TiffOutputDirectory o1, final TiffOutputDirectory o2) {
            if (o1.type < o2.type) {
                return -1;
            } else if (o1.type > o2.type) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    private JpegImageData jpegImageData = null;
    private TiffImageData tiffImageData = null;

    public void setNextDirectory(final TiffOutputDirectory nextDirectory) {
        this.nextDirectory = nextDirectory;
    }

    public TiffOutputDirectory(final int type, final ByteOrder byteOrder) {
        this.type = type;
        this.byteOrder = byteOrder;
    }

    public void add(final TagInfoByte tagInfo, final byte... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.BYTE, values.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAscii tagInfo, final String... values)
            throws ImageWriteException {
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.ASCII, bytes.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShort tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoLong tagInfo, final int... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.LONG, values.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoRational tagInfo, final RationalNumber... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.RATIONAL,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSByte tagInfo, final byte... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SBYTE,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSShort tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SSHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSLong tagInfo, final int... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SLONG,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoSRational tagInfo, final RationalNumber... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SRATIONAL,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoFloat tagInfo, final float... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.FLOAT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoDouble tagInfo, final double... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.DOUBLE,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoByteOrShort tagInfo, final byte... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.BYTE, values.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoByteOrShort tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLong tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLong tagInfo, final int... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.LONG, values.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo, final int... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.LONG, values.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrLongOrRational tagInfo,
            final RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.RATIONAL,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrRational tagInfo, final short... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.SHORT,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoShortOrRational tagInfo, final RationalNumber... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.RATIONAL,
                values.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoGpsText tagInfo, final String value)
            throws ImageWriteException {
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.UNDEFINED, value, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, tagInfo.dataTypes.get(0), bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoXpString tagInfo, final String value)
            throws ImageWriteException {
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.BYTE, value, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.BYTE, bytes.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrByte tagInfo, final String... values)
            throws ImageWriteException {
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.ASCII, bytes.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrRational tagInfo, final String... values)
            throws ImageWriteException {
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " byte(s), not " + values.length);
        }
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.ASCII, bytes.length,
                bytes);
        add(tiffOutputField);
    }

    public void add(final TagInfoAsciiOrRational tagInfo, final RationalNumber... values)
            throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length
                    + " value(s), not " + values.length);
        }
        final byte[] bytes = tagInfo.encodeValue(
                FieldType.RATIONAL, values, byteOrder);
        final TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag,
                tagInfo, FieldType.RATIONAL,
                bytes.length, bytes);
        add(tiffOutputField);
    }

    public void add(final TiffOutputField field) {
        fields.add(field);
    }

    public List<TiffOutputField> getFields() {
        return new ArrayList<TiffOutputField>(fields);
    }

    public void removeField(final TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public void removeField(final int tag) {
        final List<TiffOutputField> matches = new ArrayList<TiffOutputField>();
        for (TiffOutputField field : fields) {
            if (field.tag == tag) {
                matches.add(field);
            }
        }
        fields.removeAll(matches);
    }

    public TiffOutputField findField(final TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public TiffOutputField findField(final int tag) {
        for (TiffOutputField field : fields) {
            if (field.tag == tag) {
                return field;
            }
        }
        return null;
    }

    public void sortFields() {
        final Comparator<TiffOutputField> comparator = new Comparator<TiffOutputField>() {
            public int compare(final TiffOutputField e1, final TiffOutputField e2) {
                if (e1.tag != e2.tag) {
                    return e1.tag - e2.tag;
                }
                return e1.getSortHint() - e2.getSortHint();
            }
        };
        Collections.sort(fields, comparator);
    }

    public String description() {
        return TiffDirectory.description(type);
    }

    @Override
    public void writeItem(final BinaryOutputStream bos) throws IOException,
            ImageWriteException {
        // Write Directory Field Count
        bos.write2Bytes(fields.size()); // DirectoryFieldCount

        // Write Fields
        for (TiffOutputField field : fields) {
            field.writeField(bos);

            // Debug.debug("\t" + "writing field (" + field.tag + ", 0x" +
            // Integer.toHexString(field.tag) + ")", field.tagInfo);
            // if(field.tagInfo.isOffset())
            // Debug.debug("\t\tOFFSET!", field.bytes);
        }

        long nextDirectoryOffset = 0;
        if (nextDirectory != null) {
            nextDirectoryOffset = nextDirectory.getOffset();
        }

        // Write nextDirectoryOffset
        if (nextDirectoryOffset == UNDEFINED_VALUE) {
            bos.write4Bytes(0);
        } else {
            bos.write4Bytes((int)nextDirectoryOffset);
        }
    }

    public void setJpegImageData(final JpegImageData rawJpegImageData) {
        this.jpegImageData = rawJpegImageData;
    }

    public JpegImageData getRawJpegImageData() {
        return jpegImageData;
    }

    public void setTiffImageData(final TiffImageData rawTiffImageData) {
        this.tiffImageData = rawTiffImageData;
    }

    public TiffImageData getRawTiffImageData() {
        return tiffImageData;
    }

    @Override
    public int getItemLength() {
        return TIFF_ENTRY_LENGTH * fields.size() + TIFF_DIRECTORY_HEADER_LENGTH
                + TIFF_DIRECTORY_FOOTER_LENGTH;
    }

    @Override
    public String getItemDescription() {
        final TiffDirectoryType dirType = TagConstantsUtils
                .getExifDirectoryType(type);
        return "Directory: " + dirType.name + " (" + type + ")";
    }

    private void removeFieldIfPresent(final TagInfo tagInfo) {
        final TiffOutputField field = findField(tagInfo);
        if (null != field) {
            fields.remove(field);
        }
    }

    protected List<TiffOutputItem> getOutputItems(
            final TiffOutputSummary outputSummary) throws ImageWriteException {
        // first validate directory fields.

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

        TiffOutputField jpegOffsetField = null;
        if (null != jpegImageData) {
            jpegOffsetField = new TiffOutputField(
                    TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT,
                    FieldType.LONG, 1, new byte[TIFF_ENTRY_MAX_VALUE_LENGTH]);
            add(jpegOffsetField);

            final byte[] lengthValue = FieldType.LONG.writeData(
                    jpegImageData.length,
                    outputSummary.byteOrder);

            final TiffOutputField jpegLengthField = new TiffOutputField(
                    TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH,
                    FieldType.LONG, 1, lengthValue);
            add(jpegLengthField);

        }

        // --------------------------------------------------------------

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);

        TiffOutputField imageDataOffsetField;
        ImageDataOffsets imageDataInfo = null;
        if (null != tiffImageData) {
            final boolean stripsNotTiles = tiffImageData.stripsNotTiles();

            TagInfo offsetTag;
            TagInfo byteCountsTag;
            if (stripsNotTiles) {
                offsetTag = TiffTagConstants.TIFF_TAG_STRIP_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS;
            } else {
                offsetTag = TiffTagConstants.TIFF_TAG_TILE_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
            }

            // --------

            final TiffElement.DataElement[] imageData = tiffImageData.getImageData();

            // TiffOutputField imageDataOffsetsField = null;

            int[] imageDataOffsets = new int[imageData.length];
            int[] imageDataByteCounts = new int[imageData.length];
            for (int i = 0; i < imageData.length; i++) {
                imageDataByteCounts[i] = imageData[i].length;
            }

            // --------

            // Append imageData-related fields to first directory
            imageDataOffsetField = new TiffOutputField(offsetTag,
                    FieldType.LONG, imageDataOffsets.length,
                    FieldType.LONG.writeData(imageDataOffsets,
                            outputSummary.byteOrder));
            add(imageDataOffsetField);

            // --------

            final byte[] data = FieldType.LONG.writeData(imageDataByteCounts, outputSummary.byteOrder);
            final TiffOutputField byteCountsField = new TiffOutputField(
                    byteCountsTag, FieldType.LONG, imageDataByteCounts.length,
                    data);
            add(byteCountsField);

            // --------

            imageDataInfo = new ImageDataOffsets(imageData, imageDataOffsets, imageDataOffsetField);
        }

        // --------------------------------------------------------------

        final List<TiffOutputItem> result = new ArrayList<TiffOutputItem>();
        result.add(this);
        sortFields();

        for (TiffOutputField field : fields) {
            if (field.isLocalValue()) {
                continue;
            }

            final TiffOutputItem item = field.getSeperateValue();
            result.add(item);
            // outputSummary.add(item, field);
        }

        if (null != imageDataInfo) {
            Collections.addAll(result, imageDataInfo.outputItems);

            outputSummary.addTiffImageData(imageDataInfo);
        }

        if (null != jpegImageData) {
            final TiffOutputItem item = new TiffOutputItem.Value("JPEG image data",
                    jpegImageData.data);
            result.add(item);
            outputSummary.add(item, jpegOffsetField);
        }

        return result;
    }
}
