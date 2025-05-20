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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.DEFAULT_TIFF_BYTE_ORDER;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryConstants;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.internal.Debug;

public final class TiffOutputSet implements Iterable<TiffOutputDirectory> {

    private static final String NEWLINE = System.lineSeparator();
    public final ByteOrder byteOrder;
    private final List<TiffOutputDirectory> directories = new ArrayList<>();

    public TiffOutputSet() {
        this(DEFAULT_TIFF_BYTE_ORDER);
    }

    public TiffOutputSet(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public void addDirectory(final TiffOutputDirectory directory) throws ImagingException {
        if (null != findDirectory(directory.getType())) {
            throw new ImagingException("Output set already contains a directory of that type.");
        }
        directories.add(directory);
    }

    public TiffOutputDirectory addExifDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addGpsDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addInteroperabilityDirectory() throws ImagingException {
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY, byteOrder);
        addDirectory(result);
        return result;
    }

    public TiffOutputDirectory addRootDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, byteOrder);
        addDirectory(result);
        return result;
    }

    public void dump() {
        Debug.debug(this.toString());
    }

    public TiffOutputDirectory findDirectory(final int directoryType) {
        for (final TiffOutputDirectory directory : directories) {
            if (directory.getType() == directoryType) {
                return directory;
            }
        }
        return null;
    }

    public TiffOutputField findField(final int tag) {
        for (final TiffOutputDirectory directory : directories) {
            final TiffOutputField field = directory.findField(tag);
            if (null != field) {
                return field;
            }
        }
        return null;
    }

    public TiffOutputField findField(final TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public List<TiffOutputDirectory> getDirectories() {
        return new ArrayList<>(directories);
    }

    public TiffOutputDirectory getExifDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF);
    }

    public TiffOutputDirectory getGpsDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
    }

    public TiffOutputDirectory getInteroperabilityDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY);
    }

    public TiffOutputDirectory getOrCreateExifDirectory() throws ImagingException {
        // EXIF directory requires root directory.
        getOrCreateRootDirectory();

        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF);
        if (null != result) {
            return result;
        }
        return addExifDirectory();
    }

    public TiffOutputDirectory getOrCreateGpsDirectory() throws ImagingException {
        // GPS directory requires EXIF directory
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
        if (null != result) {
            return result;
        }
        return addGpsDirectory();
    }

    public TiffOutputDirectory getOrCreateRootDirectory() throws ImagingException {
        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT);
        if (null != result) {
            return result;
        }
        return addRootDirectory();
    }

    protected List<AbstractTiffOutputItem> getOutputItems(final TiffOutputSummary outputSummary) throws ImagingException {
        final List<AbstractTiffOutputItem> result = new ArrayList<>();

        for (final TiffOutputDirectory directory : directories) {
            result.addAll(directory.getOutputItems(outputSummary));
        }

        return result;
    }

    public TiffOutputDirectory getRootDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT);
    }

    public boolean isEmpty() {
        return directories.isEmpty();
    }

    @Override
    public Iterator<TiffOutputDirectory> iterator() {
        return directories.iterator();
    }

    public void removeField(final int tag) {
        for (final TiffOutputDirectory directory : directories) {
            directory.removeField(tag);
        }
    }

    public void removeField(final TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    /**
     * A convenience method to update GPS values in EXIF metadata.
     *
     * @param longitude Longitude in degrees E, negative values are W.
     * @param latitude  latitude in degrees N, negative values are S.
     * @throws ImagingException if it fails to write the new data to the GPS directory
     */
    public void setGpsInDegrees(double longitude, double latitude) throws ImagingException {
        final TiffOutputDirectory gpsDirectory = getOrCreateGpsDirectory();

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_VERSION_ID);
        gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_VERSION_ID, GpsTagConstants.gpsVersion());

        final String longitudeRef = longitude < 0 ? "W" : "E";
        longitude = Math.abs(longitude);
        final String latitudeRef = latitude < 0 ? "S" : "N";
        latitude = Math.abs(latitude);

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF, longitudeRef);

        gpsDirectory.removeField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF, latitudeRef);

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
            gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LONGITUDE, RationalNumber.valueOf(longitudeDegrees), RationalNumber.valueOf(longitudeMinutes),
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
            gpsDirectory.add(GpsTagConstants.GPS_TAG_GPS_LATITUDE, RationalNumber.valueOf(latitudeDegrees), RationalNumber.valueOf(latitudeMinutes),
                    RationalNumber.valueOf(latitudeSeconds));
        }

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
            result.append(String.format("%s\tdirectory %d: %s (%d)%n", prefix, i, directory.description(), directory.getType()));

            for (final TiffOutputField field : directory) {
                result.append(prefix);
                result.append("\t\tfield ").append(i).append(": ").append(field.tagInfo);
                result.append(NEWLINE);
            }
        }
        result.append(prefix);

        result.append('}');
        result.append(NEWLINE);

        return result.toString();
    }

}
