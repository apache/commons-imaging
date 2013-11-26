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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.util.Debug;

public final class TiffOutputSet implements TiffConstants {
    public final ByteOrder byteOrder;
    private final List<TiffOutputDirectory> directories = new ArrayList<TiffOutputDirectory>();
    private static final String NEWLINE = System.getProperty("line.separator");

    public TiffOutputSet() {
        this(TiffConstants.DEFAULT_TIFF_BYTE_ORDER);
    }

    public TiffOutputSet(final ByteOrder byteOrder) {
        super();
        this.byteOrder = byteOrder;
    }

    protected List<TiffOutputItem> getOutputItems(
            final TiffOutputSummary outputSummary) throws ImageWriteException {
        final List<TiffOutputItem> result = new ArrayList<TiffOutputItem>();

        for (TiffOutputDirectory directory : directories) {
            result.addAll(directory.getOutputItems(outputSummary));
        }

        return result;
    }

    public void addDirectory(final TiffOutputDirectory directory)
            throws ImageWriteException {
        if (null != findDirectory(directory.type)) {
            throw new ImageWriteException(
                    "Output set already contains a directory of that type.");
        }
        directories.add(directory);
    }

    public List<TiffOutputDirectory> getDirectories() {
        return new ArrayList<TiffOutputDirectory>(directories);
    }

    public TiffOutputDirectory getRootDirectory() {
        return findDirectory(DIRECTORY_TYPE_ROOT);
    }

    public TiffOutputDirectory getExifDirectory() {
        return findDirectory(DIRECTORY_TYPE_EXIF);
    }

    public TiffOutputDirectory getOrCreateRootDirectory()
            throws ImageWriteException {
        final TiffOutputDirectory result = findDirectory(DIRECTORY_TYPE_ROOT);
        if (null != result) {
            return result;
        }
        return addRootDirectory();
    }

    public TiffOutputDirectory getOrCreateExifDirectory()
            throws ImageWriteException {
        // EXIF directory requires root directory.
        getOrCreateRootDirectory();

        final TiffOutputDirectory result = findDirectory(DIRECTORY_TYPE_EXIF);
        if (null != result) {
            return result;
        }
        return addExifDirectory();
    }

    public TiffOutputDirectory getOrCreateGPSDirectory()
            throws ImageWriteException {
        // GPS directory requires EXIF directory
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = findDirectory(DIRECTORY_TYPE_GPS);
        if (null != result) {
            return result;
        }
        return addGPSDirectory();
    }

    public TiffOutputDirectory getGPSDirectory() {
        return findDirectory(DIRECTORY_TYPE_GPS);
    }

    public TiffOutputDirectory getInteroperabilityDirectory() {
        return findDirectory(DIRECTORY_TYPE_INTEROPERABILITY);
    }

    public TiffOutputDirectory findDirectory(final int directoryType) {
        for (TiffOutputDirectory directory : directories) {
            if (directory.type == directoryType) {
                return directory;
            }
        }
        return null;
    }

    /**
     * A convenience method to update GPS values in EXIF metadata.
     * 
     * @param longitude
     *            Longitude in degrees E, negative values are W.
     * @param latitude
     *            latitude in degrees N, negative values are S.
     * @throws ImageWriteException
     */
    public void setGPSInDegrees(double longitude, double latitude)
            throws ImageWriteException {
        final TiffOutputDirectory gpsDirectory = getOrCreateGPSDirectory();

        final String longitudeRef = longitude < 0 ? "W" : "E";
        longitude = Math.abs(longitude);
        final String latitudeRef = latitude < 0 ? "S" : "N";
        latitude = Math.abs(latitude);

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF,
                longitudeRef);

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF,
                latitudeRef);

        {
            double value = longitude;
            final double longitudeDegrees = (long) value;
            value %= 1;
            value *= 60.0;
            final double longitudeMinutes = (long) value;
            value %= 1;
            value *= 60.0;
            final double longitudeSeconds = value;

            gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE);
            gpsDirectory
                    .add(GpsTagConstants.GPS_TAG_GPS_LONGITUDE,
                            RationalNumber.valueOf(longitudeDegrees),
                            RationalNumber.valueOf(longitudeMinutes),
                            RationalNumber.valueOf(longitudeSeconds));
        }

        {
            double value = latitude;
            final double latitudeDegrees = (long) value;
            value %= 1;
            value *= 60.0;
            final double latitudeMinutes = (long) value;
            value %= 1;
            value *= 60.0;
            final double latitudeSeconds = value;

            gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LATITUDE);
            gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LATITUDE,
                    RationalNumber.valueOf(latitudeDegrees),
                    RationalNumber.valueOf(latitudeMinutes),
                    RationalNumber.valueOf(latitudeSeconds));
        }

    }

    public void removeField(final TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public void removeField(final int tag) {
        for (TiffOutputDirectory directory : directories) {
            directory.removeField(tag);
        }
    }

    public TiffOutputField findField(final TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public TiffOutputField findField(final int tag) {
        for (TiffOutputDirectory directory : directories) {
            final TiffOutputField field = directory.findField(tag);
            if (null != field) {
                return field;
            }
        }
        return null;
    }

    public TiffOutputDirectory addRootDirectory() throws ImageWriteException {
        final TiffOutputDirectory result = new TiffOutputDirectory(
                DIRECTORY_TYPE_ROOT, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addExifDirectory() throws ImageWriteException {
        final TiffOutputDirectory result = new TiffOutputDirectory(
                DIRECTORY_TYPE_EXIF, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addGPSDirectory() throws ImageWriteException {
        final TiffOutputDirectory result = new TiffOutputDirectory(
                DIRECTORY_TYPE_GPS, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addInteroperabilityDirectory()
            throws ImageWriteException {
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = new TiffOutputDirectory(
                DIRECTORY_TYPE_INTEROPERABILITY, byteOrder);
        addDirectory(result);
        return result;
    }

    @Override
    public String toString() {
        return toString(null);
    }

    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        final StringBuilder result = new StringBuilder(39);

        result.append(prefix);
        result.append("TiffOutputSet {");
        result.append(NEWLINE);

        result.append(prefix);
        result.append("byteOrder: ");
        result.append(byteOrder);
        result.append(NEWLINE);

        for (int i = 0; i < directories.size(); i++) {
            final TiffOutputDirectory directory = directories.get(i);
            result.append(String.format("%s\tdirectory %d: %s (%d)%n",
                    prefix, i, directory.description(), directory.type));

            final List<TiffOutputField> fields = directory.getFields();
            for (TiffOutputField field : fields) {
                result.append(prefix);
                result.append("\t\tfield " + i + ": " + field.tagInfo);
                result.append(NEWLINE);
            }
        }
        result.append(prefix);

        result.append('}');
        result.append(NEWLINE);

        return result.toString();
    }

    public void dump() {
        Debug.debug(this.toString());
    }

}
