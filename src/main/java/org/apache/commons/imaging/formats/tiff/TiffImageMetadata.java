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
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.AllTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
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
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

public class TiffImageMetadata extends ImageMetadata implements
        TiffDirectoryConstants {
    public final TiffContents contents;
    private static final Map<Object, Integer> tagCounts = countTags(AllTagConstants.ALL_TAGS);

    public TiffImageMetadata(final TiffContents contents) {
        this.contents = contents;
    }

    private static final Map<Object, Integer> countTags(final List<TagInfo> tags) {
        final Map<Object, Integer> map = new Hashtable<Object, Integer>();

        for (int i = 0; i < tags.size(); i++) {
            final TagInfo tag = tags.get(i);

            final Integer count = map.get(tag.tag);
            if (count == null) {
                map.put(tag.tag, 1);
            } else {
                map.put(tag.tag, count + 1);
            }
        }

        return map;
    }

    public static class Directory extends ImageMetadata implements
            ImageMetadata.IImageMetadataItem {
        // private BufferedImage thumbnail = null;

        public final int type;

        private final TiffDirectory directory;
        private final ByteOrder byteOrder;

        public Directory(final ByteOrder byteOrder, final TiffDirectory directory) {
            this.type = directory.type;
            this.directory = directory;
            this.byteOrder = byteOrder;
        }

        public void add(final TiffField entry) {
            add(new TiffImageMetadata.Item(entry));
        }

        public BufferedImage getThumbnail() throws ImageReadException,
                IOException {
            return directory.getTiffImage(byteOrder);
        }

        public TiffImageData getTiffImageData() {
            return directory.getTiffImageData();
        }

        public TiffField findField(final TagInfo tagInfo) throws ImageReadException {
            return directory.findField(tagInfo);
        }

        public List<TiffField> getAllFields() {
            return directory.getDirectoryEntries();
        }

        public JpegImageData getJpegImageData() {
            return directory.getJpegImageData();
        }

        @Override
        public String toString(final String prefix) {
            return (prefix != null ? prefix : "") + directory.description()
                    + ": " //
                    + (getTiffImageData() != null ? " (tiffImageData)" : "") //
                    + (getJpegImageData() != null ? " (jpegImageData)" : "") //
                    + "\n" + super.toString(prefix) + "\n";
        }

        public TiffOutputDirectory getOutputDirectory(final ByteOrder byteOrder)
                throws ImageWriteException {
            try {
                final TiffOutputDirectory dstDir = new TiffOutputDirectory(type,
                        byteOrder);

                final List<? extends IImageMetadataItem> entries = getItems();
                for (int i = 0; i < entries.size(); i++) {
                    final TiffImageMetadata.Item item = (TiffImageMetadata.Item) entries
                            .get(i);
                    final TiffField srcField = item.getTiffField();

                    if (null != dstDir.findField(srcField.getTag())) {
                        // ignore duplicate tags in a directory.
                        continue;
                    } else if (srcField.getTagInfo().isOffset()) {
                        // ignore offset fields.
                        continue;
                    }

                    final TagInfo tagInfo = srcField.getTagInfo();
                    final FieldType fieldType = srcField.getFieldType();
                    // byte bytes[] = srcField.fieldType.getRawBytes(srcField);

                    // Debug.debug("tagInfo", tagInfo);

                    final Object value = srcField.getValue();

                    // Debug.debug("value", Debug.getType(value));

                    final byte bytes[] = tagInfo.encodeValue(fieldType, value,
                            byteOrder);

                    // if (tagInfo.isUnknown())
                    // Debug.debug(
                    // "\t" + "unknown tag(0x"
                    // + Integer.toHexString(srcField.tag)
                    // + ") bytes", bytes);

                    final int count = bytes.length / fieldType.getSize();
                    final TiffOutputField dstField = new TiffOutputField(
                            srcField.getTag(), tagInfo, fieldType, count, bytes);
                    dstField.setSortHint(srcField.getSortHint());
                    dstDir.add(dstField);
                }

                dstDir.setTiffImageData(getTiffImageData());
                dstDir.setJpegImageData(getJpegImageData());

                return dstDir;
            } catch (final ImageReadException e) {
                throw new ImageWriteException(e.getMessage(), e);
            }
        }

    }

    public List<? extends IImageMetadataItem> getDirectories() {
        return super.getItems();
    }

    @Override
    public List<? extends IImageMetadataItem> getItems() {
        final List<IImageMetadataItem> result = new ArrayList<IImageMetadataItem>();

        final List<? extends IImageMetadataItem> items = super.getItems();
        for (int i = 0; i < items.size(); i++) {
            final Directory dir = (Directory) items.get(i);
            result.addAll(dir.getItems());
        }

        return result;
    }

    public static class Item extends ImageMetadata.Item {
        private final TiffField entry;

        public Item(final TiffField entry) {
            // super(entry.getTagName() + " (" + entry.getFieldTypeName() + ")",
            super(entry.getTagName(), entry.getValueDescription());
            this.entry = entry;
        }

        public TiffField getTiffField() {
            return entry;
        }

    }

    public TiffOutputSet getOutputSet() throws ImageWriteException {
        final ByteOrder byteOrder = contents.header.byteOrder;
        final TiffOutputSet result = new TiffOutputSet(byteOrder);

        final List<? extends IImageMetadataItem> srcDirs = getDirectories();
        for (int i = 0; i < srcDirs.size(); i++) {
            final TiffImageMetadata.Directory srcDir = (TiffImageMetadata.Directory) srcDirs
                    .get(i);

            if (null != result.findDirectory(srcDir.type)) {
                // Certain cameras right directories more than once.
                // This is a bug.
                // Ignore second directory of a given type.
                continue;
            }

            final TiffOutputDirectory outputDirectory = srcDir
                    .getOutputDirectory(byteOrder);
            result.addDirectory(outputDirectory);
        }

        return result;
    }

    public TiffField findField(final TagInfo tagInfo) throws ImageReadException {
        return findField(tagInfo, false);
    }

    public TiffField findField(final TagInfo tagInfo, final boolean exactDirectoryMatch)
            throws ImageReadException {
        // Please keep this method in sync with TiffField's getTag()
        final Integer tagCount = tagCounts.get(tagInfo.tag);
        final int tagsMatching = tagCount == null ? 0 : tagCount;

        final List<? extends IImageMetadataItem> directories = getDirectories();
        if (exactDirectoryMatch
                || tagInfo.directoryType != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
            for (int i = 0; i < directories.size(); i++) {
                final Directory directory = (Directory) directories.get(i);
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
            for (int i = 0; i < directories.size(); i++) {
                final Directory directory = (Directory) directories.get(i);
                if (tagInfo.directoryType.isImageDirectory()
                        && directory.type >= 0) {
                    final TiffField field = directory.findField(tagInfo);
                    if (field != null) {
                        return field;
                    }
                } else if (!tagInfo.directoryType.isImageDirectory()
                        && directory.type < 0) {
                    final TiffField field = directory.findField(tagInfo);
                    if (field != null) {
                        return field;
                    }
                }
            }
        }

        for (int i = 0; i < directories.size(); i++) {
            final Directory directory = (Directory) directories.get(i);
            final TiffField field = directory.findField(tagInfo);
            if (field != null) {
                return field;
            }
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

    public byte[] getFieldValue(final TagInfoByte tag) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
    }

    public String[] getFieldValue(final TagInfoAscii tag) throws ImageReadException {
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

    public short[] getFieldValue(final TagInfoShort tag) throws ImageReadException {
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

    public int[] getFieldValue(final TagInfoLong tag) throws ImageReadException {
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

    public RationalNumber[] getFieldValue(final TagInfoRational tag)
            throws ImageReadException {
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

    public byte[] getFieldValue(final TagInfoSByte tag) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        if (!tag.dataTypes.contains(field.getFieldType())) {
            return null;
        }
        return field.getByteArrayValue();
    }

    public short[] getFieldValue(final TagInfoSShort tag) throws ImageReadException {
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

    public int[] getFieldValue(final TagInfoSLong tag) throws ImageReadException {
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

    public RationalNumber[] getFieldValue(final TagInfoSRational tag)
            throws ImageReadException {
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

    public float[] getFieldValue(final TagInfoFloat tag) throws ImageReadException {
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

    public double[] getFieldValue(final TagInfoDouble tag) throws ImageReadException {
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

    public String getFieldValue(final TagInfoGpsText tag) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    public String getFieldValue(final TagInfoXpString tag) throws ImageReadException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    public TiffDirectory findDirectory(final int directoryType) {
        final List<? extends IImageMetadataItem> directories = getDirectories();
        for (int i = 0; i < directories.size(); i++) {
            final Directory directory = (Directory) directories.get(i);
            if (directory.type == directoryType) {
                return directory.directory;
            }
        }
        return null;
    }

    public List<TiffField> getAllFields() {
        final List<TiffField> result = new ArrayList<TiffField>();
        final List<? extends IImageMetadataItem> directories = getDirectories();
        for (int i = 0; i < directories.size(); i++) {
            final Directory directory = (Directory) directories.get(i);
            result.addAll(directory.getAllFields());
        }
        return result;
    }

    public GPSInfo getGPS() throws ImageReadException {
        final TiffDirectory gpsDirectory = findDirectory(DIRECTORY_TYPE_GPS);
        if (null == gpsDirectory) {
            return null;
        }

        // more specific example of how to access GPS values.
        final TiffField latitudeRefField = gpsDirectory
                .findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        final TiffField latitudeField = gpsDirectory
                .findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE);
        final TiffField longitudeRefField = gpsDirectory
                .findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        final TiffField longitudeField = gpsDirectory
                .findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE);

        if (latitudeRefField == null || latitudeField == null
                || longitudeRefField == null || longitudeField == null) {
            return null;
        }

        // all of these values are strings.
        final String latitudeRef = latitudeRefField.getStringValue();
        final RationalNumber latitude[] = (RationalNumber[]) latitudeField.getValue();
        final String longitudeRef = longitudeRefField.getStringValue();
        final RationalNumber longitude[] = (RationalNumber[]) longitudeField
                .getValue();

        if (latitude.length != 3 || longitude.length != 3) {
            throw new ImageReadException(
                    "Expected three values for latitude and longitude.");
        }

        final RationalNumber latitudeDegrees = latitude[0];
        final RationalNumber latitudeMinutes = latitude[1];
        final RationalNumber latitudeSeconds = latitude[2];

        final RationalNumber longitudeDegrees = longitude[0];
        final RationalNumber longitudeMinutes = longitude[1];
        final RationalNumber longitudeSeconds = longitude[2];

        return new GPSInfo(latitudeRef, longitudeRef, latitudeDegrees,
                latitudeMinutes, latitudeSeconds, longitudeDegrees,
                longitudeMinutes, longitudeSeconds);
    }

    public static class GPSInfo {
        public final String latitudeRef;
        public final String longitudeRef;

        public final RationalNumber latitudeDegrees;
        public final RationalNumber latitudeMinutes;
        public final RationalNumber latitudeSeconds;
        public final RationalNumber longitudeDegrees;
        public final RationalNumber longitudeMinutes;
        public final RationalNumber longitudeSeconds;

        public GPSInfo(final String latitudeRef, final String longitudeRef,
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

        @Override
        public String toString() {
            // This will format the gps info like so:
            //
            // latitude: 8 degrees, 40 minutes, 42.2 seconds S
            // longitude: 115 degrees, 26 minutes, 21.8 seconds E

            final StringBuilder result = new StringBuilder(88);
            result.append("[GPS. Latitude: " + latitudeDegrees.toDisplayString()
                    + " degrees, " + latitudeMinutes.toDisplayString()
                    + " minutes, " + latitudeSeconds.toDisplayString()
                    + " seconds " + latitudeRef);
            result.append(", Longitude: " + longitudeDegrees.toDisplayString()
                    + " degrees, " + longitudeMinutes.toDisplayString()
                    + " minutes, " + longitudeSeconds.toDisplayString()
                    + " seconds " + longitudeRef);
            result.append(']');

            return result.toString();
        }

        public double getLongitudeAsDegreesEast() throws ImageReadException {
            final double result = longitudeDegrees.doubleValue()
                    + (longitudeMinutes.doubleValue() / 60.0)
                    + (longitudeSeconds.doubleValue() / 3600.0);

            if (longitudeRef.trim().equalsIgnoreCase("e")) {
                return result;
            } else if (longitudeRef.trim().equalsIgnoreCase("w")) {
                return -result;
            } else {
                throw new ImageReadException("Unknown longitude ref: \""
                        + longitudeRef + "\"");
            }
        }

        public double getLatitudeAsDegreesNorth() throws ImageReadException {
            final double result = latitudeDegrees.doubleValue()
                    + (latitudeMinutes.doubleValue() / 60.0)
                    + (latitudeSeconds.doubleValue() / 3600.0);

            if (latitudeRef.trim().equalsIgnoreCase("n")) {
                return result;
            } else if (latitudeRef.trim().equalsIgnoreCase("s")) {
                return -result;
            } else {
                throw new ImageReadException("Unknown latitude ref: \""
                        + latitudeRef + "\"");
            }
        }

    }

}
