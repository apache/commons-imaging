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

/**
 * TIFF image metadata.
 */
public class TiffImageMetadata extends GenericImageMetadata {

    /**
     * Represents a TIFF directory as metadata.
     */
    public static class Directory extends GenericImageMetadata implements ImageMetadataItem {
        // private BufferedImage thumbnail;

        /**
         * The directory type.
         */
        public final int type;

        private final TiffDirectory directory;
        private final ByteOrder byteOrder;

        /**
         * Constructs a new instance.
         *
         * @param byteOrder the byte order.
         * @param directory the TIFF directory.
         */
        public Directory(final ByteOrder byteOrder, final TiffDirectory directory) {
            this.type = directory.type;
            this.directory = directory;
            this.byteOrder = byteOrder;
        }

        /**
         * Adds a TIFF field as a metadata item.
         *
         * @param entry the TIFF field to add.
         */
        public void add(final TiffField entry) {
            add(new TiffMetadataItem(entry));
        }

        /**
         * Finds a field by tag.
         *
         * @param tagInfo the tag information.
         * @return the field, or null if not found.
         * @throws ImagingException if an error occurs.
         */
        public TiffField findField(final TagInfo tagInfo) throws ImagingException {
            return directory.findField(tagInfo);
        }

        /**
         * Gets all fields in this directory.
         *
         * @return the list of fields.
         */
        public List<TiffField> getAllFields() {
            return directory.getDirectoryEntries();
        }

        /**
         * Gets JPEG image data if present.
         *
         * @return the JPEG image data, or null.
         */
        public JpegImageData getJpegImageData() {
            return directory.getJpegImageData();
        }

        /**
         * Gets the output directory for writing.
         *
         * @param byteOrder the byte order to use.
         * @return the output directory.
         * @throws ImagingException if an error occurs.
         */
        public TiffOutputDirectory getOutputDirectory(final ByteOrder byteOrder) throws ImagingException {
            try {
                final TiffOutputDirectory dstDir = new TiffOutputDirectory(type, byteOrder);

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

                    final byte[] bytes = tagInfo.encodeValue(abstractFieldType, value, byteOrder);

                    // if (tagInfo.isUnknown())
                    // Debug.debug(
                    // "\tunknown tag(0x"
                    // + Integer.toHexString(srcField.tag)
                    // + ") bytes", bytes);

                    final int count = bytes.length / abstractFieldType.getSize();
                    final TiffOutputField dstField = new TiffOutputField(srcField.getTag(), tagInfo, abstractFieldType, count, bytes);
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

        /**
         * Gets the thumbnail image.
         *
         * @return the thumbnail image.
         * @throws ImagingException if an imaging error occurs.
         * @throws IOException if an I/O error occurs.
         */
        public BufferedImage getThumbnail() throws ImagingException, IOException {
            return directory.getTiffImage(byteOrder);
        }

        /**
         * Gets the TIFF image data.
         *
         * @return the TIFF image data.
         */
        public AbstractTiffImageData getTiffImageData() {
            return directory.getTiffImageData();
        }

        @Override
        public String toString(final String prefix) {
            return (prefix != null ? prefix : "") + directory.description() + ": " //
                    + (getTiffImageData() != null ? " (tiffImageData)" : "") //
                    + (getJpegImageData() != null ? " (jpegImageData)" : "") //
                    + "\n" + super.toString(prefix) + "\n";
        }

    }

    /**
     * Contains GPS location information from TIFF metadata.
     */
    public static class GpsInfo {

        /**
         * Latitude reference (N or S).
         */
        public final String latitudeRef;

        /**
         * Longitude reference (E or W).
         */
        public final String longitudeRef;

        /**
         * Latitude degrees.
         */
        public final RationalNumber latitudeDegrees;

        /**
         * Latitude minutes.
         */
        public final RationalNumber latitudeMinutes;

        /**
         * Latitude seconds.
         */
        public final RationalNumber latitudeSeconds;

        /**
         * Longitude degrees.
         */
        public final RationalNumber longitudeDegrees;

        /**
         * Longitude minutes.
         */
        public final RationalNumber longitudeMinutes;

        /**
         * Longitude seconds.
         */
        public final RationalNumber longitudeSeconds;

        /**
         * Constructs a new instance.
         *
         * @param latitudeRef the latitude reference.
         * @param longitudeRef the longitude reference.
         * @param latitudeDegrees the latitude degrees.
         * @param latitudeMinutes the latitude minutes.
         * @param latitudeSeconds the latitude seconds.
         * @param longitudeDegrees the longitude degrees.
         * @param longitudeMinutes the longitude minutes.
         * @param longitudeSeconds the longitude seconds.
         */
        public GpsInfo(final String latitudeRef, final String longitudeRef, final RationalNumber latitudeDegrees, final RationalNumber latitudeMinutes,
                final RationalNumber latitudeSeconds, final RationalNumber longitudeDegrees, final RationalNumber longitudeMinutes,
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

        /**
         * Gets the latitude as degrees north.
         *
         * @return the latitude in degrees north (negative for south).
         * @throws ImagingException if the latitude reference is invalid.
         */
        public double getLatitudeAsDegreesNorth() throws ImagingException {
            final double result = latitudeDegrees.doubleValue() + latitudeMinutes.doubleValue() / 60.0 + latitudeSeconds.doubleValue() / 3600.0;
            /* Due to some HEIC file converters to JPG longitude and latitude strings gets converted from UNICODE 
             * with wrong UTF-8 coding. e.g. North "N" have hex bytes hex:4e ef bf bd<br/>
             * For that reason latitudeRef.trim().equalsIgnoreCase("n") fails. My suggestion 
             * is to use substring(0, 1) instead of trim()
             */
            if (latitudeRef.substring(0, 1).equalsIgnoreCase("n")) {
                return result;
            }
            if (latitudeRef.substring(0, 1).equalsIgnoreCase("s")) {
                return -result;
            }
            throw new ImagingException("Unknown latitude ref: \"" + latitudeRef + "\"");
        }

        /**
         * Gets the longitude as degrees east.
         *
         * @return the longitude in degrees east (negative for west).
         * @throws ImagingException if the longitude reference is invalid.
         */
        public double getLongitudeAsDegreesEast() throws ImagingException {
            final double result = longitudeDegrees.doubleValue() + longitudeMinutes.doubleValue() / 60.0 + longitudeSeconds.doubleValue() / 3600.0;

            if (longitudeRef.substring(0, 1).equalsIgnoreCase("e")) {
                return result;
            }
            if (longitudeRef.substring(0, 1).equalsIgnoreCase("w")) {
                return -result;
            }
            throw new ImagingException("Unknown longitude ref: \"" + longitudeRef + "\"");
        }

        @Override
        public String toString() {
            // This will format the gps info like so:
            //
            // latitude: 8 degrees, 40 minutes, 42.2 seconds S
            // longitude: 115 degrees, 26 minutes, 21.8 seconds E

            return "[GPS. Latitude: " + latitudeDegrees.toDisplayString() + " degrees, " + latitudeMinutes.toDisplayString() + " minutes, "
                    + latitudeSeconds.toDisplayString() + " seconds " + latitudeRef + ", Longitude: " + longitudeDegrees.toDisplayString() + " degrees, "
                    + longitudeMinutes.toDisplayString() + " minutes, " + longitudeSeconds.toDisplayString() + " seconds " + longitudeRef + ']';
        }

    }

    /**
     * Represents a single TIFF metadata item.
     */
    public static class TiffMetadataItem extends GenericImageMetadataItem {
        private final TiffField entry;

        /**
         * Constructs a new instance.
         *
         * @param entry the TIFF field.
         */
        public TiffMetadataItem(final TiffField entry) {
            // super(entry.getTagName() + " (" + entry.getFieldTypeName() + ")",
            super(entry.getTagName(), entry.getValueDescription());
            this.entry = entry;
        }

        /**
         * Gets the TIFF field.
         *
         * @return the TIFF field.
         */
        public TiffField getTiffField() {
            return entry;
        }

    }

    /**
     * The TIFF contents.
     */
    public final TiffContents contents;

    /**
     * Constructs a new instance.
     *
     * @param contents the TIFF contents.
     */
    public TiffImageMetadata(final TiffContents contents) {
        this.contents = contents;
    }

    /**
     * Finds a directory by type.
     *
     * @param directoryType the directory type.
     * @return the directory, or null if not found.
     */
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

    /**
     * Finds a field by tag.
     *
     * @param tagInfo the tag information.
     * @return the field, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public TiffField findField(final TagInfo tagInfo) throws ImagingException {
        return findField(tagInfo, false);
    }

    /**
     * Finds a field by tag with directory matching option.
     *
     * @param tagInfo the tag information.
     * @param exactDirectoryMatch whether to require exact directory match.
     * @return the field, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public TiffField findField(final TagInfo tagInfo, final boolean exactDirectoryMatch) throws ImagingException {
        // Please keep this method in sync with TiffField's getTag()
        final Integer tagCount = TiffTags.getTagCount(tagInfo.tag);
        final int tagsMatching = tagCount == null ? 0 : tagCount;

        final List<? extends ImageMetadataItem> directories = getDirectories();
        if (exactDirectoryMatch || tagInfo.directoryType != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
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
                if (tagInfo.directoryType.isImageDirectory() && directory.type >= 0 || !tagInfo.directoryType.isImageDirectory() && directory.type < 0) {
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

    /**
     * Gets all fields from all directories.
     *
     * @return the list of all fields.
     */
    public List<TiffField> getAllFields() {
        final List<TiffField> result = new ArrayList<>();
        final List<? extends ImageMetadataItem> directories = getDirectories();
        for (final ImageMetadataItem directory1 : directories) {
            final Directory directory = (Directory) directory1;
            result.addAll(directory.getAllFields());
        }
        return result;
    }

    /**
     * Gets all directories.
     *
     * @return the list of directories.
     */
    public List<? extends ImageMetadataItem> getDirectories() {
        return super.getItems();
    }

    /**
     * Gets the value of a field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public Object getFieldValue(final TagInfo tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return field.getValue();
    }

    /**
     * Gets the value of an ASCII field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a byte field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a doubles field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a floats field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a GPS text field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public String getFieldValue(final TagInfoGpsText tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    /**
     * Gets the value of a longs field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a rationals field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public RationalNumber[] getFieldValue(final TagInfoRationals tag) throws ImagingException {
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

    /**
     * Gets the value of a signed bytes field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a shorts field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a signed longs field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of a signed rationals field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public RationalNumber[] getFieldValue(final TagInfoSRationals tag) throws ImagingException {
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

    /**
     * Gets the value of a signed shorts field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
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

    /**
     * Gets the value of an XP string field.
     *
     * @param tag the tag.
     * @return the field value, or null if not found.
     * @throws ImagingException if an error occurs.
     */
    public String getFieldValue(final TagInfoXpString tag) throws ImagingException {
        final TiffField field = findField(tag);
        if (field == null) {
            return null;
        }
        return tag.getValue(field);
    }

    /**
     * Gets GPS information from metadata.
     *
     * @return the GPS info, or null if not available.
     * @throws ImagingException if an error occurs.
     */
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

        if (latitudeRefField == null || latitudeField == null || longitudeRefField == null || longitudeField == null) {
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

        return new GpsInfo(latitudeRef, longitudeRef, latitudeDegrees, latitudeMinutes, latitudeSeconds, longitudeDegrees, longitudeMinutes, longitudeSeconds);
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

    /**
     * Gets an output set for writing.
     *
     * @return the output set.
     * @throws ImagingException if an error occurs.
     */
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
