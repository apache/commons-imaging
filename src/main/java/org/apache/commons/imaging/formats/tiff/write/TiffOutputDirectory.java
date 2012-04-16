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
import org.apache.commons.imaging.formats.tiff.constants.TiffFieldTypeConstants;
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
        TiffConstants
{
    public final int type;
    private final List<TiffOutputField> fields = new ArrayList<TiffOutputField>();
    private final int byteOrder;
    private TiffOutputDirectory nextDirectory = null;
    public static final Comparator<TiffOutputDirectory> COMPARATOR = new Comparator<TiffOutputDirectory>() {
        public int compare(TiffOutputDirectory o1, TiffOutputDirectory o2) {
            if (o1.type < o2.type) {
                return -1;
            } else if (o1.type > o2.type) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public void setNextDirectory(TiffOutputDirectory nextDirectory)
    {
        this.nextDirectory = nextDirectory;
    }

    public TiffOutputDirectory(final int type, final int byteOrder)
    {
        this.type = type;
        this.byteOrder = byteOrder;
    }
    
    public void add(TagInfoByte tagInfo, byte... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_BYTE, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoAscii tagInfo, String... values) throws ImageWriteException {
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " byte(s), not " + values.length);
        }
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoShort tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SHORT, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoLong tagInfo, int... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_LONG, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoRational tagInfo, RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoSByte tagInfo, byte... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SBYTE, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoSShort tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SSHORT, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoSLong tagInfo, int... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SLONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoSRational tagInfo, RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SRATIONAL, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoFloat tagInfo, float... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_FLOAT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoDouble tagInfo, double... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_DOUBLE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoByteOrShort tagInfo, byte... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_BYTE, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoByteOrShort tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoShortOrLong tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoShortOrLong tagInfo, int... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_LONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoShortOrLongOrRational tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SHORT, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoShortOrLongOrRational tagInfo, int... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_LONG, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoShortOrLongOrRational tagInfo, RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoShortOrRational tagInfo, short... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_SHORT, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoShortOrRational tagInfo, RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(byteOrder, values);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_RATIONAL, values.length, bytes);
        add(tiffOutputField);
    }

    public void add(TagInfoGpsText tagInfo, String value) throws ImageWriteException {
        byte[] bytes = tagInfo.encodeValue(TiffFieldTypeConstants.FIELD_TYPE_UNKNOWN, value, byteOrder);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                tagInfo.dataTypes.get(0), bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoXpString tagInfo, String value) throws ImageWriteException {
        byte[] bytes = tagInfo.encodeValue(TiffFieldTypeConstants.FIELD_TYPE_BYTE, value, byteOrder);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_BYTE, bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoAsciiOrByte tagInfo, String... values) throws ImageWriteException {
        byte[] bytes = tagInfo.encodeValue(TiffFieldTypeConstants.FIELD_TYPE_ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " byte(s), not " + values.length);
        }
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoAsciiOrRational tagInfo, String... values) throws ImageWriteException {
        byte[] bytes = tagInfo.encodeValue(TiffFieldTypeConstants.FIELD_TYPE_ASCII, values, byteOrder);
        if (tagInfo.length > 0 && tagInfo.length != bytes.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " byte(s), not " + values.length);
        }
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_ASCII, bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TagInfoAsciiOrRational tagInfo, RationalNumber... values) throws ImageWriteException {
        if (tagInfo.length > 0 && tagInfo.length != values.length) {
            throw new ImageWriteException("Tag expects " + tagInfo.length +
                    " value(s), not " + values.length);
        }
        byte[] bytes = tagInfo.encodeValue(TiffFieldTypeConstants.FIELD_TYPE_RATIONAL, values, byteOrder);
        TiffOutputField tiffOutputField = new TiffOutputField(tagInfo.tag, tagInfo,
                TiffFieldTypeConstants.FIELD_TYPE_RATIONAL, bytes.length, bytes);
        add(tiffOutputField);
    }
    
    public void add(TiffOutputField field)
    {
        fields.add(field);
    }

    public List<TiffOutputField> getFields()
    {
        return new ArrayList<TiffOutputField>(fields);
    }

    public void removeField(TagInfo tagInfo)
    {
        removeField(tagInfo.tag);
    }

    public void removeField(int tag)
    {
        List<TiffOutputField> matches = new ArrayList<TiffOutputField>();
        for (int i = 0; i < fields.size(); i++)
        {
            TiffOutputField field = fields.get(i);
            if (field.tag == tag)
                matches.add(field);
        }
        fields.removeAll(matches);
    }

    public TiffOutputField findField(TagInfo tagInfo)
    {
        return findField(tagInfo.tag);
    }

    public TiffOutputField findField(int tag)
    {
        for (int i = 0; i < fields.size(); i++)
        {
            TiffOutputField field = fields.get(i);
            if (field.tag == tag)
                return field;
        }
        return null;
    }

    public void sortFields()
    {
        Comparator<TiffOutputField> comparator = new Comparator<TiffOutputField>() {
            public int compare(TiffOutputField e1, TiffOutputField e2)
            {
                if (e1.tag != e2.tag)
                    return e1.tag - e2.tag;
                return e1.getSortHint() - e2.getSortHint();
            }
        };
        Collections.sort(fields, comparator);
    }

    public String description()
    {
        return TiffDirectory.description(type);
    }

    @Override
    public void writeItem(BinaryOutputStream bos) throws IOException,
            ImageWriteException
    {
        // Write Directory Field Count
        bos.write2Bytes(fields.size()); // DirectoryFieldCount

        // Write Fields
        for (int i = 0; i < fields.size(); i++)
        {
            TiffOutputField field = fields.get(i);
            field.writeField(bos);

//             Debug.debug("\t" + "writing field (" + field.tag + ", 0x" +
//             Integer.toHexString(field.tag) + ")", field.tagInfo);
//             if(field.tagInfo.isOffset())
//             Debug.debug("\t\tOFFSET!", field.bytes);
        }

        int nextDirectoryOffset = 0;
        if (nextDirectory != null)
            nextDirectoryOffset = nextDirectory.getOffset();

        // Write nextDirectoryOffset
        if (nextDirectoryOffset == UNDEFINED_VALUE)
            bos.write4Bytes(0);
        else
            bos.write4Bytes(nextDirectoryOffset);
    }

    private JpegImageData jpegImageData = null;

    public void setJpegImageData(JpegImageData rawJpegImageData)
    {
        this.jpegImageData = rawJpegImageData;
    }

    public JpegImageData getRawJpegImageData()
    {
        return jpegImageData;
    }

    private TiffImageData tiffImageData = null;

    public void setTiffImageData(TiffImageData rawTiffImageData)
    {
        this.tiffImageData = rawTiffImageData;
    }

    public TiffImageData getRawTiffImageData()
    {
        return tiffImageData;
    }

    @Override
    public int getItemLength()
    {
        return TIFF_ENTRY_LENGTH * fields.size() + TIFF_DIRECTORY_HEADER_LENGTH
                + TIFF_DIRECTORY_FOOTER_LENGTH;
    }

    @Override
    public String getItemDescription()
    {
        TiffDirectoryType dirType = TagConstantsUtils
                .getExifDirectoryType(type);
        return "Directory: " + dirType.name + " (" + type + ")";
    }

    private void removeFieldIfPresent(TagInfo tagInfo)
    {
        TiffOutputField field = findField(tagInfo);
        if (null != field)
            fields.remove(field);
    }

    protected List<TiffOutputItem> getOutputItems(TiffOutputSummary outputSummary)
            throws ImageWriteException
    {
        // first validate directory fields.

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

        TiffOutputField jpegOffsetField = null;
        if (null != jpegImageData)
        {
            jpegOffsetField = new TiffOutputField(
                    TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT, FIELD_TYPE_LONG, 1,
                    FieldType.getStubLocalValue());
            add(jpegOffsetField);

            byte lengthValue[] = FIELD_TYPE_LONG.writeData(
                    new int[] { jpegImageData.length, },
                    outputSummary.byteOrder);

            TiffOutputField jpegLengthField = new TiffOutputField(
                    TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, FIELD_TYPE_LONG,
                    1, lengthValue);
            add(jpegLengthField);

        }

        // --------------------------------------------------------------

        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        removeFieldIfPresent(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);

        TiffOutputField imageDataOffsetField;
        ImageDataOffsets imageDataInfo = null;
        if (null != tiffImageData)
        {
            boolean stripsNotTiles = tiffImageData.stripsNotTiles();

            TagInfo offsetTag;
            TagInfo byteCountsTag;
            if (stripsNotTiles)
            {
                offsetTag = TiffTagConstants.TIFF_TAG_STRIP_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS;
            } else
            {
                offsetTag = TiffTagConstants.TIFF_TAG_TILE_OFFSETS;
                byteCountsTag = TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
            }

            // --------

            TiffElement.DataElement imageData[] = tiffImageData.getImageData();

            int imageDataOffsets[] = null;
            int imageDataByteCounts[] = null;
            // TiffOutputField imageDataOffsetsField = null;

            imageDataOffsets = new int[imageData.length];
            imageDataByteCounts = new int[imageData.length];
            for (int i = 0; i < imageData.length; i++)
            {
                imageDataByteCounts[i] = imageData[i].length;
            }

            // --------

            // Append imageData-related fields to first directory
            imageDataOffsetField = new TiffOutputField(offsetTag,
                    FIELD_TYPE_LONG, imageDataOffsets.length, FIELD_TYPE_LONG
                            .writeData(imageDataOffsets,
                                    outputSummary.byteOrder));
            add(imageDataOffsetField);

            // --------

            byte data[] = FIELD_TYPE_LONG.writeData(imageDataByteCounts,
                    outputSummary.byteOrder);
            TiffOutputField byteCountsField = new TiffOutputField(
                    byteCountsTag, FIELD_TYPE_LONG, imageDataByteCounts.length,
                    data);
            add(byteCountsField);

            // --------

            imageDataInfo = new ImageDataOffsets(imageData, imageDataOffsets,
                    imageDataOffsetField);
        }

        // --------------------------------------------------------------

        List<TiffOutputItem> result = new ArrayList<TiffOutputItem>();
        result.add(this);
        sortFields();

        for (int i = 0; i < fields.size(); i++)
        {
            TiffOutputField field = fields.get(i);
            if (field.isLocalValue())
                continue;

            TiffOutputItem item = field.getSeperateValue();
            result.add(item);
            // outputSummary.add(item, field);
        }

        if (null != imageDataInfo)
        {
            for (int i = 0; i < imageDataInfo.outputItems.length; i++)
                result.add(imageDataInfo.outputItems[i]);

            outputSummary.addTiffImageData(imageDataInfo);
        }

        if (null != jpegImageData)
        {
            TiffOutputItem item = new TiffOutputItem.Value("JPEG image data",
                    jpegImageData.data);
            result.add(item);
            outputSummary.add(item, jpegOffsetField);
        }

        return result;
    }
}