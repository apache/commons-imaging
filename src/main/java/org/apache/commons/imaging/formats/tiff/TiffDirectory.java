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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

/**
 * Provides methods and elements for accessing an Image File Directory (IFD) from a TIFF file. In the TIFF specification, the IFD is the main container for
 * individual images or sets of metadata. While not all Directories contain images, images are always stored in a Directory.
 */
public class TiffDirectory extends AbstractTiffElement implements Iterable<TiffField> {

    public static final class ImageDataElement extends AbstractTiffElement {
        public ImageDataElement(final long offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription() {
            return "ImageDataElement";
        }
    }

    public static String description(final int type) {
        switch (type) {
        case TiffDirectoryConstants.DIRECTORY_TYPE_UNKNOWN:
            return "Unknown";
        case TiffDirectoryConstants.DIRECTORY_TYPE_ROOT:
            return "Root";
        case TiffDirectoryConstants.DIRECTORY_TYPE_SUB:
            return "Sub";
        case TiffDirectoryConstants.DIRECTORY_TYPE_THUMBNAIL:
            return "Thumbnail";
        case TiffDirectoryConstants.DIRECTORY_TYPE_EXIF:
            return "Exif";
        case TiffDirectoryConstants.DIRECTORY_TYPE_GPS:
            return "Gps";
        case TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY:
            return "Interoperability";
        default:
            return "Bad Type";
        }
    }

    private final List<TiffField> entries;

    /**
     * Preserves the byte order derived from the TIFF file header. Some of the legacy methods in this class require byte order as an argument, though that use
     * could be phased out eventually.
     */
    private final ByteOrder headerByteOrder;

    private JpegImageData jpegImageData;

    private final long nextDirectoryOffset;

    private AbstractTiffImageData abstractTiffImageData;

    public final int type;

    public TiffDirectory(final int type, final List<TiffField> entries, final long offset, final long nextDirectoryOffset, final ByteOrder byteOrder) {
        super(offset,
                TiffConstants.DIRECTORY_HEADER_LENGTH + entries.size() * TiffConstants.ENTRY_LENGTH + TiffConstants.DIRECTORY_FOOTER_LENGTH);

        this.type = type;
        this.entries = Collections.unmodifiableList(entries);
        this.nextDirectoryOffset = nextDirectoryOffset;
        this.headerByteOrder = byteOrder;
    }

    public String description() {
        return description(type);
    }

    public void dump() {
        entries.forEach(TiffField::dump);
    }

    public TiffField findField(final TagInfo tag) throws ImagingException {
        final boolean failIfMissing = false;
        return findField(tag, failIfMissing);
    }

    public TiffField findField(final TagInfo tag, final boolean failIfMissing) throws ImagingException {
        for (final TiffField field : entries) {
            if (field.getTag() == tag.tag) {
                return field;
            }
        }

        if (failIfMissing) {
            throw new ImagingException("Missing expected field: " + tag.getDescription());
        }

        return null;
    }

    /**
     * Gets the byte order used by the source file for storing this directory and its content.
     *
     * @return A valid byte order instance.
     */
    public ByteOrder getByteOrder() {
        return headerByteOrder;
    }

    public List<TiffField> getDirectoryEntries() {
        return new ArrayList<>(entries);
    }

    @Override
    public String getElementDescription() {
        long entryOffset = offset + TiffConstants.DIRECTORY_HEADER_LENGTH;

        final StringBuilder result = new StringBuilder();
        for (final TiffField entry : entries) {
            result.append(String.format("\t[%d]: %s (%d, 0x%x), %s, %d: %s%n", entryOffset, entry.getTagInfo().name, entry.getTag(), entry.getTag(),
                    entry.getFieldType().getName(), entry.getBytesLength(), entry.getValueDescription()));

            entryOffset += TiffConstants.ENTRY_LENGTH;
        }
        return result.toString();
    }

    public Object getFieldValue(final TagInfo tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    public String[] getFieldValue(final TagInfoAscii tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public byte getFieldValue(final TagInfoByte tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        return field.getByteArrayValue()[0];
    }

    public byte[] getFieldValue(final TagInfoBytes tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        return field.getByteArrayValue();
    }

    public double getFieldValue(final TagInfoDouble tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public double[] getFieldValue(final TagInfoDoubles tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public float getFieldValue(final TagInfoFloat tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public float[] getFieldValue(final TagInfoFloats tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public String getFieldValue(final TagInfoGpsText tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        return tag.getValue(field);
    }

    public int getFieldValue(final TagInfoLong tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public int[] getFieldValue(final TagInfoLongs tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber getFieldValue(final TagInfoRational tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoRationals tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public byte getFieldValue(final TagInfoSByte tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        return field.getByteArrayValue()[0];
    }

    public byte[] getFieldValue(final TagInfoSBytes tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        return field.getByteArrayValue();
    }

    public short getFieldValue(final TagInfoShort tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public int[] getFieldValue(final TagInfoShortOrLong tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        if (field.getFieldType() == AbstractFieldType.SHORT) {
            return ByteConversions.toUInt16s(bytes, field.getByteOrder());
        }
        return ByteConversions.toInts(bytes, field.getByteOrder());
    }

    public short[] getFieldValue(final TagInfoShorts tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public int getFieldValue(final TagInfoSLong tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public int[] getFieldValue(final TagInfoSLongs tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber getFieldValue(final TagInfoSRational tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoSRationals tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public short getFieldValue(final TagInfoSShort tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            throw new ImagingException("Required field \"" + tag.name + "\" is missing");
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
        }
        if (field.getCount() != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has wrong count " + field.getCount());
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public short[] getFieldValue(final TagInfoSShorts tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" has incorrect type " + field.getFieldType().getName());
            }
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public String getFieldValue(final TagInfoXpString tag, final boolean mustExist) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            if (mustExist) {
                throw new ImagingException("Required field \"" + tag.name + "\" is missing");
            }
            return null;
        }
        return tag.getValue(field);
    }

    public JpegImageData getJpegImageData() {
        return jpegImageData;
    }

    public ImageDataElement getJpegRawImageDataElement() throws ImagingException {
        final TiffField jpegInterchangeFormat = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        final TiffField jpegInterchangeFormatLength = findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

        if (jpegInterchangeFormat != null && jpegInterchangeFormatLength != null) {
            final int offSet = jpegInterchangeFormat.getIntArrayValue()[0];
            final int byteCount = jpegInterchangeFormatLength.getIntArrayValue()[0];

            return new ImageDataElement(offSet, byteCount);
        }
        throw new ImagingException("Couldn't find image data.");
    }

    public long getNextDirectoryOffset() {
        return nextDirectoryOffset;
    }

    /**
     * Reads the numerical data stored in this TIFF directory, if available. Note that this method is defined only for TIFF directories that contain
     * floating-point data or two-byte signed integer data.
     * <p>
     * TIFF directories that provide numerical data do not directly specify images, though it is possible to interpret the data as an image using this library.
     * TIFF files may contain multiple directories which are allowed to have different formats. Thus it is possible for a TIFF file to contain a mix of image
     * and floating-point raster data.
     * <p>
     * If desired, sub-image data can be read from the file by using a Java Map instance to specify the subsection of the image that is required. The following
     * code illustrates the approach:
     *
     * <pre>
     * int x; // coordinate (column) of corner of sub-image
     * int y; // coordinate (row) of corner of sub-image
     * int width; // width of sub-image
     * int height; // height of sub-image
     *
     * Map&lt;String, Object&gt; params = new HashMap&lt;&gt;();
     * params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, x);
     * params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, y);
     * params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, width);
     * params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, height);
     * TiffRasterData raster = directory.readFloatingPointRasterData(params);
     * </pre>
     *
     * @param params an optional parameter map instance
     * @return a valid instance
     * @throws ImagingException in the event of incompatible or malformed data
     * @throws IOException      in the event of an I/O error
     */
    public AbstractTiffRasterData getRasterData(final TiffImagingParameters params) throws ImagingException, IOException {

        final TiffImageParser parser = new TiffImageParser();
        return parser.getRasterData(this, headerByteOrder, params);
    }

    private List<ImageDataElement> getRawImageDataElements(final TiffField offsetsField, final TiffField byteCountsField) throws ImagingException {
        final long[] offsets = offsetsField.getLongArrayValue();
        final int[] byteCounts = byteCountsField.getIntArrayValue();

        if (offsets.length != byteCounts.length) {
            throw new ImagingException("offsets.length(" + offsets.length + ") != byteCounts.length(" + byteCounts.length + ")");
        }

        final List<ImageDataElement> result = Allocator.arrayList(offsets.length);
        for (int i = 0; i < offsets.length; i++) {
            result.add(new ImageDataElement(offsets[i], byteCounts[i]));
        }
        return result;
    }

    public String getSingleFieldValue(final TagInfoAscii tag) throws ImagingException {
        final String[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    public int getSingleFieldValue(final TagInfoShortOrLong tag) throws ImagingException {
        final int[] result = getFieldValue(tag, true);
        if (result.length != 1) {
            throw new ImagingException("Field \"" + tag.name + "\" has incorrect length " + result.length);
        }
        return result[0];
    }

    /**
     * Gets the image associated with the directory, if any. Note that not all directories contain images.
     *
     * @return if successful, a valid BufferedImage instance.
     * @throws ImagingException in the event of an invalid or incompatible data format.
     * @throws IOException      in the event of an I/O error.
     */
    public BufferedImage getTiffImage() throws ImagingException, IOException {
        if (null == abstractTiffImageData) {
            return null;
        }

        return new TiffImageParser().getBufferedImage(this, headerByteOrder, null);
    }

    /**
     * Gets the image associated with the directory, if any. Note that not all directories contain images.
     * <p>
     * This method comes from an older version of this class in which byte order was required from an external source. Developers are encouraged to use the
     * simpler version of getTiffImage that does not require the byte-order argument.
     *
     * @param byteOrder byte-order obtained from the containing TIFF file
     * @return if successful, a valid BufferedImage instance.
     * @throws ImagingException in the event of an invalid or incompatible data format.
     * @throws IOException      in the event of an I/O error.
     */
    public BufferedImage getTiffImage(final ByteOrder byteOrder) throws ImagingException, IOException {
        return getTiffImage(byteOrder, new TiffImagingParameters());
    }

    /**
     * Gets the image associated with the directory, if any. Note that not all directories contain images.
     * <p>
     * This method comes from an older version of this class in which byte order was required from an external source. Developers are encouraged to use the
     * simpler version of getTiffImage that does not require the byte-order argument.
     *
     * @param byteOrder byte-order obtained from the containing TIFF file
     * @param params    an object containing optional parameters to be applied to the read operation.
     * @return if successful, a valid BufferedImage instance.
     * @throws ImagingException in the event of an invalid or incompatible data format.
     * @throws IOException      in the event of an I/O error.
     */
    public BufferedImage getTiffImage(final ByteOrder byteOrder, final TiffImagingParameters params) throws ImagingException, IOException {
        if (null == abstractTiffImageData) {
            return null;
        }

        return new TiffImageParser().getBufferedImage(this, byteOrder, params);
    }

    /**
     * Gets the image associated with the directory, if any. Note that not all directories contain images.
     * <p>
     * The optional parameters object can be used to specify image access or rendering options such as reading only a part of the overall image (i.e. reading a
     * sub-image) or applying a custom photometric interpreter.
     *
     * @param params an object containing optional parameters to be applied to the read operation.
     * @return if successful, a valid BufferedImage instance.
     * @throws ImagingException in the event of an invalid or incompatible data format.
     * @throws IOException      in the event of an I/O error.
     */
    public BufferedImage getTiffImage(final TiffImagingParameters params) throws ImagingException, IOException {
        if (null == abstractTiffImageData) {
            return null;
        }

        return new TiffImageParser().getBufferedImage(this, headerByteOrder, params);
    }

    public AbstractTiffImageData getTiffImageData() {
        return abstractTiffImageData;
    }

    public List<ImageDataElement> getTiffRawImageDataElements() throws ImagingException {
        final TiffField tileOffsets = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        final TiffField tileByteCounts = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        final TiffField stripOffsets = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        final TiffField stripByteCounts = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);

        if (tileOffsets != null && tileByteCounts != null) {
            return getRawImageDataElements(tileOffsets, tileByteCounts);
        }
        if (stripOffsets != null && stripByteCounts != null) {
            return getRawImageDataElements(stripOffsets, stripByteCounts);
        }
        throw new ImagingException("Couldn't find image data.");
    }

    public boolean hasJpegImageData() throws ImagingException {
        return null != findField(TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
    }

    /**
     * Indicates whether the directory definition specifies a float-point data format.
     *
     * @return {@code true} if the directory contains floating point data; otherwise, {@code false}
     * @throws ImagingException in the event of an invalid or malformed specification.
     */
    public boolean hasTiffFloatingPointRasterData() throws ImagingException {
        if (!hasTiffImageData()) {
            return false;
        }
        final short[] s = getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        return s != null && s.length > 0 && s[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT;

    }

    public boolean hasTiffImageData() throws ImagingException {
        if (null != findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS)) {
            return true;
        }

        return null != findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
    }

    /**
     * Indicates whether the content associated with the directory is given in a supported numerical-data format. If this method returns {@code true}, the
     * Imaging API will be able to extract a TiffRasterData instance from the associated TIFF file using this directory.
     *
     * @return {@code true} if the directory contains a supported raster data format; otherwise, {@code false}.
     * @throws ImagingException in the event of an invalid or malformed specification.
     */
    public boolean hasTiffRasterData() throws ImagingException {
        if (!hasTiffImageData()) {
            return false;
        }
        final short[] s = getFieldValue(TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        return s != null && s.length > 0 && (s[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT
                || s[0] == TiffTagConstants.SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER);
    }

    public boolean imageDataInStrips() throws ImagingException {
        final TiffField tileOffsets = findField(TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        final TiffField tileByteCounts = findField(TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        final TiffField stripOffsets = findField(TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        final TiffField stripByteCounts = findField(TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);

        if (tileOffsets != null && tileByteCounts != null) {
            return false;
        }
        if (stripOffsets != null && stripByteCounts != null) {
            return true;
        }
        throw new ImagingException("Couldn't find image data.");
    }

    @Override
    public Iterator<TiffField> iterator() {
        return entries.iterator();
    }

    public void setJpegImageData(final JpegImageData value) {
        this.jpegImageData = value;
    }

    public void setTiffImageData(final AbstractTiffImageData rawImageData) {
        this.abstractTiffImageData = rawImageData;
    }

    public int size() {
        return entries.size();
    }
}
