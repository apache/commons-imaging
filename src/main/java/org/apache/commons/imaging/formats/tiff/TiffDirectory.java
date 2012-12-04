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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
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
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

public class TiffDirectory extends TiffElement implements TiffConstants
// extends BinaryFileFunctions
{

    public String description() {
        return TiffDirectory.description(type);
    }

    @Override
    public String getElementDescription(final boolean verbose) {
        if (!verbose) {
            return "TIFF Directory (" + description() + ")";
        }

        int entryOffset = offset + TIFF_DIRECTORY_HEADER_LENGTH;

        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < entries.size(); i++) {
            final TiffField entry = entries.get(i);

            result.append("\t");
            result.append("[" + entryOffset + "]: ");
            result.append(entry.tagInfo.name);
            result.append(" (" + entry.tag + ", 0x"
                    + Integer.toHexString(entry.tag) + ")");
            result.append(", " + entry.fieldType.name);
            result.append(", " + entry.fieldType.getRawBytes(entry).length);
            result.append(": " + entry.getValueDescription());

            result.append("\n");

            entryOffset += TIFF_ENTRY_LENGTH;
            // entry.fillInValue(byteSource);
        }
        return result.toString();
    }

    public static final String description(final int type) {
        switch (type) {
        case DIRECTORY_TYPE_UNKNOWN:
            return "Unknown";
        case DIRECTORY_TYPE_ROOT:
            return "Root";
        case DIRECTORY_TYPE_SUB:
            return "Sub";
        case DIRECTORY_TYPE_THUMBNAIL:
            return "Thumbnail";
        case DIRECTORY_TYPE_EXIF:
            return "Exif";
        case DIRECTORY_TYPE_GPS:
            return "Gps";
        case DIRECTORY_TYPE_INTEROPERABILITY:
            return "Interoperability";
        default:
            return "Bad Type";
        }
    }

    public final int type;
    public final List<TiffField> entries;
    // public final int offset;
    public final int nextDirectoryOffset;

    public TiffDirectory(final int type, final List<TiffField> entries, final int offset,
            final int nextDirectoryOffset) {
        super(offset, TIFF_DIRECTORY_HEADER_LENGTH + entries.size()
                * TIFF_ENTRY_LENGTH + TIFF_DIRECTORY_FOOTER_LENGTH);

        this.type = type;
        this.entries = entries;
        this.nextDirectoryOffset = nextDirectoryOffset;
    }

    public List<TiffField> getDirectoryEntrys() {
        return new ArrayList<TiffField>(entries);
    }

    public void dump() {
        for (int i = 0; i < entries.size(); i++) {
            final TiffField entry = entries.get(i);
            entry.dump();
        }

    }

    public boolean hasJpegImageData() throws ImageReadException {
        if (null != findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT)) {
            return true;
        }

        return false;
    }

    public boolean hasTiffImageData() throws ImageReadException {
        if (null != findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS)) {
            return true;
        }

        if (null != findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS)) {
            return true;
        }

        return false;
    }

    public BufferedImage getTiffImage(final ByteOrder byteOrder) throws ImageReadException,
            IOException {
        final Map<String,Object> params = null;
        return getTiffImage(byteOrder, params);
    }

    public BufferedImage getTiffImage(final ByteOrder byteOrder, final Map<String,Object> params)
            throws ImageReadException, IOException {
        if (null == tiffImageData) {
            return null;
        }

        return new TiffImageParser().getBufferedImage(this, byteOrder, params);
    }

    public TiffField findField(final TagInfo tag) throws ImageReadException {
        final boolean failIfMissing = false;
        return findField(tag, failIfMissing);
    }

    public TiffField findField(final TagInfo tag, final boolean failIfMissing)
            throws ImageReadException {
        if (entries == null) {
            return null;
        }

        for (int i = 0; i < entries.size(); i++) {
            final TiffField field = entries.get(i);
            if (field.tag == tag.tag) {
                return field;
            }
        }

        if (failIfMissing) {
            throw new ImageReadException("Missing expected field: "
                    + tag.getDescription());
        }

        return null;
    }

    public Object getFieldValue(final TagInfo tag) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    public byte getSingleFieldValue(final TagInfoByte tag) throws ImageReadException {
        final byte[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public String getSingleFieldValue(final TagInfoAscii tag)
            throws ImageReadException {
        final String[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public short getSingleFieldValue(final TagInfoShort tag)
            throws ImageReadException {
        final short[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public int getSingleFieldValue(final TagInfoLong tag) throws ImageReadException {
        final int[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public RationalNumber getSingleFieldValue(final TagInfoRational tag)
            throws ImageReadException {
        final RationalNumber[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public byte getSingleFieldValue(final TagInfoSByte tag) throws ImageReadException {
        final byte[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public short getSingleFieldValue(final TagInfoSShort tag)
            throws ImageReadException {
        final short[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public int getSingleFieldValue(final TagInfoSLong tag) throws ImageReadException {
        final int[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public RationalNumber getSingleFieldValue(final TagInfoSRational tag)
            throws ImageReadException {
        final RationalNumber[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public float getSingleFieldValue(final TagInfoFloat tag)
            throws ImageReadException {
        final float[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public double getSingleFieldValue(final TagInfoDouble tag)
            throws ImageReadException {
        final double[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImageReadException("Field \"" + tag.name
                    + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public byte[] getFieldValue(final TagInfoByte tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        return field.fieldType.getRawBytes(field);
    }

    public String[] getFieldValue(final TagInfoAscii tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public short[] getFieldValue(final TagInfoShort tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public int[] getFieldValue(final TagInfoLong tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoRational tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public byte[] getFieldValue(final TagInfoSByte tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        return field.fieldType.getRawBytes(field);
    }

    public short[] getFieldValue(final TagInfoSShort tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public int[] getFieldValue(final TagInfoSLong tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoSRational tag,
            final boolean mustExist) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public float[] getFieldValue(final TagInfoFloat tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public double[] getFieldValue(final TagInfoDouble tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        if (!tag.dataTypes.contains(field.fieldType)) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" has incorrect type " + field.fieldType.name);
            } else {
                return null;
            }
        }
        final byte[] bytes = field.fieldType.getRawBytes(field);
        return tag.getValue(field.byteOrder, bytes);
    }

    public String getFieldValue(final TagInfoGpsText tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        return tag.getValue(field);
    }

    public String getFieldValue(final TagInfoXpString tag, final boolean mustExist)
            throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImageReadException("Required field \"" + tag.name
                        + "\" is missing");
            } else {
                return null;
            }
        }
        return tag.getValue(field);
    }

    public static final class ImageDataElement extends TiffElement {
        public ImageDataElement(final int offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription(final boolean verbose) {
            if (verbose) {
                return null;
            }
            return "ImageDataElement";
        }
    }

    private List<ImageDataElement> getRawImageDataElements(
            final TiffField offsetsField, final TiffField byteCountsField)
            throws ImageReadException {
        final int offsets[] = offsetsField.getIntArrayValue();
        final int byteCounts[] = byteCountsField.getIntArrayValue();

        if (offsets.length != byteCounts.length) {
            throw new ImageReadException("offsets.length(" + offsets.length
                    + ") != byteCounts.length(" + byteCounts.length + ")");
        }

        final List<ImageDataElement> result = new ArrayList<ImageDataElement>();
        for (int i = 0; i < offsets.length; i++) {
            result.add(new ImageDataElement(offsets[i], byteCounts[i]));
        }
        return result;
    }

    public List<ImageDataElement> getTiffRawImageDataElements()
            throws ImageReadException {
        final TiffField tileOffsets = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        final TiffField tileByteCounts = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        final TiffField stripOffsets = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        final TiffField stripByteCounts = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);

        if ((tileOffsets != null) && (tileByteCounts != null)) {
            return getRawImageDataElements(tileOffsets, tileByteCounts);
        } else if ((stripOffsets != null) && (stripByteCounts != null)) {
            return getRawImageDataElements(stripOffsets, stripByteCounts);
        } else {
            throw new ImageReadException("Couldn't find image data.");
        }
    }

    public boolean imageDataInStrips() throws ImageReadException {
        final TiffField tileOffsets = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        final TiffField tileByteCounts = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        final TiffField stripOffsets = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        final TiffField stripByteCounts = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);

        if ((tileOffsets != null) && (tileByteCounts != null)) {
            return false;
        } else if ((stripOffsets != null) && (stripByteCounts != null)) {
            return true;
        } else if ((stripOffsets != null) && (stripByteCounts != null)) {
            return true;
        } else {
            throw new ImageReadException("Couldn't find image data.");
        }
    }

    public ImageDataElement getJpegRawImageDataElement()
            throws ImageReadException {
        final TiffField jpegInterchangeFormat = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        final TiffField jpegInterchangeFormatLength = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

        if ((jpegInterchangeFormat != null)
                && (jpegInterchangeFormatLength != null)) {
            final int offset = jpegInterchangeFormat.getIntArrayValue()[0];
            final int byteCount = jpegInterchangeFormatLength.getIntArrayValue()[0];

            return new ImageDataElement(offset, byteCount);
        } else {
            throw new ImageReadException("Couldn't find image data.");
        }
    }

    private TiffImageData tiffImageData = null;

    public void setTiffImageData(final TiffImageData rawImageData) {
        this.tiffImageData = rawImageData;
    }

    public TiffImageData getTiffImageData() {
        return tiffImageData;
    }

    private JpegImageData jpegImageData = null;

    public void setJpegImageData(final JpegImageData value) {
        this.jpegImageData = value;
    }

    public JpegImageData getJpegImageData() {
        return jpegImageData;
    }

}
