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
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

public class TiffImageMetadata extends GenericImageMetadata {
    public static class Directory extends GenericImageMetadata implements
            ImageMetadataItem {
        // private BufferedImage thumbnail;

        public final int type;

        private final TiffDirectory directory;
        private final ByteOrder byteOrder;

        public Directory(final ByteOrder byteOrder, final TiffDirectory directory) {
            this.type = directory.type;
            this.directory = directory;
            this.byteOrder = byteOrder;
        }

        public void add(final TiffField entry) {
            add(new TiffMetadataItem(entry));
        }

        public TiffField findField(final TagInfo tagInfo) throws ImagingException {
            return directory.findField(tagInfo);
        }

        public List<TiffField> getAllFields() {
            return directory.getDirectoryEntries();
        }

        public JpegImageData getJpegImageData() {
            return directory.getJpegImageData();
        }

        public TiffOutputDirectory getOutputDirectory(final ByteOrder byteOrder)
                throws ImagingException {
            try {
                final TiffOutputDirectory dstDir = new TiffOutputDirectory(type,
                        byteOrder);

                final List<? extends ImageMetadataItem> entries = getItems();
                for (final ImageMetadataItem entry : entries) {
                    final TiffMetadataItem item = (TiffMetadataItem) entry;
                    final TiffField srcField = item.getTiffField();

                    if (null != dstDir.findField(srcField.getTag())) {
                        // ignore duplicate tags in a directory.
                        continue;
                    }
                    if (srcField.getTagInfo().isOffset()) {
                        // ignore offset fields.
                        continue;
                    }

                    final TagInfo tagInfo = srcField.getTagInfo();
                    final AbstractFieldType abstractFieldType = srcField.getFieldType();
                    // byte[] bytes = srcField.fieldType.getRawBytes(srcField);

                    // Debug.debug("tagInfo", tagInfo);

                    final Object value = srcField.getValue();

                    // Debug.debug("value", Debug.getType(value));

                    final byte[] bytes = tagInfo.encodeValue(abstractFieldType, value,
                            byteOrder);

                    // if (tagInfo.isUnknown())
                    // Debug.debug(
                    // "\t" + "unknown tag(0x"
                    // + Integer.toHexString(srcField.tag)
                    // + ") bytes", bytes);

                    final int count = bytes.length / abstractFieldType.getSize();
                    final TiffOutputField dstField = new TiffOutputField(
                            srcField.getTag(), tagInfo, abstractFieldType, count, bytes);
                    dstField.setSortHint(srcField.getSortHint());
                    dstDir.add(dstField);
                }

                dstDir.setTiffImageData(getTiffImageData());
                dstDir.setJpegImageData(getJpegImageData());

                return dstDir;
            } catch (final ImagingException e) {
                throw new ImagingException(e.getMessage(), e);
            }
        }

        public BufferedImage getThumbnail() throws ImagingException,
                IOException {
            return directory.getTiffImage(byteOrder);
        }

        public AbstractTiffImageData getTiffImageData() {
            return directory.getTiffImageData();
        }

        @Override
        public String toString(final String prefix) {
            return (prefix != null ? prefix : "") + directory.description()
                    + ": " //
                    + (getTiffImageData() != null ? " (tiffImageData)" : "") //
                    + (getJpegImageData() != null ? " (jpegImageData)" : "") //
                    + "\n" + super.toString(prefix) + "\n";
        }

    }

    public static class GpsInfo {
        public final String latitudeRef;
        public final String longitudeRef;

        public final RationalNumber latitudeDegrees;
        public final RationalNumber latitudeMinutes;
        public final RationalNumber latitudeSeconds;
        public final RationalNumber longitudeDegrees;
        public final RationalNumber longitudeMinutes;
        public final RationalNumber longitudeSeconds;

        public GpsInfo(final String latitudeRef, final String longitudeRef,
                final RationalNumber latitudeDegrees,
                final RationalNumber latitudeMinutes,
                final RationalNumber latitudeSeconds,
                final RationalNumber longitudeDegrees,
                final RationalNumber longitudeMinutes,
                final RationalNumber longitudeSeconds) {
            this.latitudeRef = latitudeRef;
            this.longitudeRef = longitudeRef;
            this.latitudeDegrees = latitudeDegrees;
            this.latitudeMinutes = latitudeMinutes;
            this.latitudeSeconds = latitudeSeconds;
            this.longitudeDegrees = longitudeDegrees;
            this.longitudeMinutes = longitudeMinutes;
            this.longitudeSeconds = longitudeSeconds;
        }

        public double getLatitudeAsDegreesNorth() throws ImagingException {
            final double result = latitudeDegrees.doubleValue()
                    + (latitudeMinutes.doubleValue() / 60.0)
                    + (latitudeSeconds.doubleValue() / 3600.0);

            if (latitudeRef.trim().equalsIgnoreCase("n")) {
                return result;
            }
            if (latitudeRef.trim().equalsIgnoreCase("s")) {
                return -result;
            }
            throw new ImagingException("Unknown latitude ref: \""
                    + latitudeRef + "\"");
        }

        public double getLongitudeAsDegreesEast() throws ImagingException {
            final double result = longitudeDegrees.doubleValue()
                    + (longitudeMinutes.doubleValue() / 60.0)
                    + (longitudeSeconds.doubleValue() / 3600.0);

            if (longitudeRef.trim().equalsIgnoreCase("e")) {
                return result;
            }
            if (longitudeRef.trim().equalsIgnoreCase("w")) {
                return -result;
            }
            throw new ImagingException("Unknown longitude ref: \""
                    + longitudeRef + "\"");
        }

        @Override
        public String toString() {
            // This will format the gps info like so:
            //
            // latitude: 8 degrees, 40 minutes, 42.2 seconds S
            // longitude: 115 degrees, 26 minutes, 21.8 seconds E

            return "[GPS. Latitude: " +
                    latitudeDegrees.toDisplayString() +
                    " degrees, " +
                    latitudeMinutes.toDisplayString() +
                    " minutes, " +
                    latitudeSeconds.toDisplayString() +
                    " seconds " +
                    latitudeRef +
                    ", Longitude: " +
                    longitudeDegrees.toDisplayString() +
                    " degrees, " +
                    longitudeMinutes.toDisplayString() +
                    " minutes, " +
                    longitudeSeconds.toDisplayString() +
                    " seconds " +
                    longitudeRef +
                    ']';
        }

    }

    public static class TiffMetadataItem extends GenericImageMetadataItem {
        private final TiffField entry;

        public TiffMetadataItem(final TiffField entry) {
            // super(entry.getTagName() + " (" + entry.getFieldTypeName() + ")",
            super(entry.getTagName(), entry.getValueDescription());
            this.entry = entry;
        }

        public TiffField getTiffField() {
            return entry;
        }

    }

    public final TiffContents contents;

    public TiffImageMetadata(final TiffContents contents) {
        this.contents = contents;
    }

    public TiffDirectory findDirectory(final int directoryType) {
        final List<? extends ImageMetadataItem> directories = getDirectories();
        for (final ImageMetadataItem directory1 : directories) {
            final Directory directory = (Directory) directory1;
            if (directory.type == directoryType) {
                return directory.directory;
            }
        }
        return null;
    }

    public TiffField findField(final TagInfo tagInfo) throws ImagingException {
        return findField(tagInfo, false);
    }

    public TiffField findField(final TagInfo tagInfo, final boolean exactDirectoryMatch)
            throws ImagingException {
        // Please keep this method in sync with TiffField's getTag()
        final Integer tagCount = TiffTags.getTagCount(tagInfo.tag);
        final int tagsMatching = tagCount == null ? 0 : tagCount;

        final List<? extends ImageMetadataItem> directories = getDirectories();
        if (exactDirectoryMatch
                || tagInfo.directoryType != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
            for (final ImageMetadataItem directory1 : directories) {
                final Directory directory = (Directory) directory1;
                if (directory.type == tagInfo.directoryType.directoryType) {
                    final TiffField field = directory.findField(tagInfo);
                    if (field != null) {
                        return field;
                    }
                }
            }
            if (exactDirectoryMatch || tagsMatching > 1) {
                return null;
            }
            for (final ImageMetadataItem directory1 : directories) {
                final Directory directory = (Directory) directory1;
                if ((tagInfo.directoryType.isImageDirectory()
                        && directory.type >= 0) || (!tagInfo.directoryType.isImageDirectory()
                        && directory.type < 0)) {
                    final TiffField field = directory.findField(tagInfo);
                    if (field != null) {
                        return field;
                    }
                }
            }
        }

        for (final ImageMetadataItem directory1 : directories) {
            final Directory directory = (Directory) directory1;
            final TiffField field = directory.findField(tagInfo);
            if (field != null) {
                return field;
            }
        }

        return null;
    }

    public List<TiffField> getAllFields() {
        final List<TiffField> result = new ArrayList<>();
        final List<? extends ImageMetadataItem> directories = getDirectories();
        for (final ImageMetadataItem directory1 : directories) {
            final Directory directory = (Directory) directory1;
            result.addAll(directory.getAllFields());
        }
        return result;
    }

    public List<? extends ImageMetadataItem> getDirectories() {
        return super.getItems();
    }

    public Object getFieldValue(final TagInfo tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    public String[] getFieldValue(final TagInfoAscii tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public byte[] getFieldValue(final TagInfoByte tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
    }

    public double[] getFieldValue(final TagInfoDoubles tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public float[] getFieldValue(final TagInfoFloats tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public String getFieldValue(final TagInfoGpsText tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    public int[] getFieldValue(final TagInfoLongs tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoRationals tag)
            throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public byte[] getFieldValue(final TagInfoSBytes tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
    }

    public short[] getFieldValue(final TagInfoShorts tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public int[] getFieldValue(final TagInfoSLongs tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public RationalNumber[] getFieldValue(final TagInfoSRationals tag)
            throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public short[] getFieldValue(final TagInfoSShorts tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        final byte[] bytes = field.getByteArrayValue();
        return tag.getValue(field.getByteOrder(), bytes);
    }

    public String getFieldValue(final TagInfoXpString tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    public GpsInfo getGpsInfo() throws ImagingException {
        final TiffDirectory gpsDirectory = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
        if (null == gpsDirectory) {
            return null;
        }

        // more specific example of how to access GPS values.
        final TiffField latitudeRefField = gpsDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        final TiffField latitudeField = gpsDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE);
        final TiffField longitudeRefField = gpsDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        final TiffField longitudeField = gpsDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE);

        if (latitudeRefField == null || latitudeField == null
                || longitudeRefField == null || longitudeField == null) {
            return null;
        }

        // all of these values are strings.
        final String latitudeRef = latitudeRefField.getStringValue();
        final RationalNumber[] latitude = (RationalNumber[]) latitudeField.getValue();
        final String longitudeRef = longitudeRefField.getStringValue();
        final RationalNumber[] longitude = (RationalNumber[]) longitudeField.getValue();

        if (latitude.length != 3 || longitude.length != 3) {
            throw new ImagingException("Expected three values for latitude and longitude.");
        }

        final RationalNumber latitudeDegrees = latitude[0];
        final RationalNumber latitudeMinutes = latitude[1];
        final RationalNumber latitudeSeconds = latitude[2];

        final RationalNumber longitudeDegrees = longitude[0];
        final RationalNumber longitudeMinutes = longitude[1];
        final RationalNumber longitudeSeconds = longitude[2];

        return new GpsInfo(latitudeRef, longitudeRef, latitudeDegrees,
                latitudeMinutes, latitudeSeconds, longitudeDegrees,
                longitudeMinutes, longitudeSeconds);
    }

    @Override
    public List<? extends ImageMetadataItem> getItems() {
        final List<ImageMetadataItem> result = new ArrayList<>();

        final List<? extends ImageMetadataItem> items = super.getItems();
        for (final ImageMetadataItem item : items) {
            final Directory dir = (Directory) item;
            result.addAll(dir.getItems());
        }

        return result;
    }

    public TiffOutputSet getOutputSet() throws ImagingException {
        final ByteOrder byteOrder = contents.header.byteOrder;
        final TiffOutputSet result = new TiffOutputSet(byteOrder);

        final List<? extends ImageMetadataItem> srcDirs = getDirectories();
        for (final ImageMetadataItem srcDir1 : srcDirs) {
            final Directory srcDir = (Directory) srcDir1;

            if (null != result.findDirectory(srcDir.type)) {
                // Certain cameras right directories more than once.
                // This is a bug.
                // Ignore second directory of a given type.
                continue;
            }

            final TiffOutputDirectory outputDirectory = srcDir.getOutputDirectory(byteOrder);
            result.addDirectory(outputDirectory);
        }

        return result;
    }

}
