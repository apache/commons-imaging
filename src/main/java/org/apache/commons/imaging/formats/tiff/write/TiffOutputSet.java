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

/**
 * Represents a complete TIFF output set containing multiple directories.
 */
public final class TiffOutputSet implements Iterable<TiffOutputDirectory> {

    private static final String NEWLINE = System.lineSeparator();

    /**
     * The byte order for this output set.
     */
    public final ByteOrder byteOrder;

    private final List<TiffOutputDirectory> directories = new ArrayList<>();

    /**
     * Constructs a new instance with default byte order.
     */
    public TiffOutputSet() {
        this(DEFAULT_TIFF_BYTE_ORDER);
    }

    /**
     * Constructs a new instance with the specified byte order.
     *
     * @param byteOrder the byte order.
     */
    public TiffOutputSet(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    /**
     * Adds a directory to this output set.
     *
     * @param directory the directory to add.
     * @throws ImagingException if a directory of that type already exists.
     */
    public void addDirectory(final TiffOutputDirectory directory) throws ImagingException {
        if (null != findDirectory(directory.getType())) {
            throw new ImagingException("Output set already contains a directory of that type.");
        }
        directories.add(directory);
    }

    /**
     * Adds an EXIF directory to this output set.
     *
     * @return the new EXIF directory.
     * @throws ImagingException if an EXIF directory already exists.
     */
    public TiffOutputDirectory addExifDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF, byteOrder);
        addDirectory(result);
        return result;
    }

    /**
     * Adds a GPS directory to this output set.
     *
     * @return the new GPS directory.
     * @throws ImagingException if a GPS directory already exists.
     */
    public TiffOutputDirectory addGpsDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS, byteOrder);
        addDirectory(result);
        return result;
    }

    /**
     * Adds an Interoperability directory to this output set.
     *
     * @return the new Interoperability directory.
     * @throws ImagingException if an Interoperability directory already exists.
     */
    public TiffOutputDirectory addInteroperabilityDirectory() throws ImagingException {
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY, byteOrder);
        addDirectory(result);
        return result;
    }

    /**
     * Adds a Root directory to this output set.
     *
     * @return the new Root directory.
     * @throws ImagingException if a Root directory already exists.
     */
    public TiffOutputDirectory addRootDirectory() throws ImagingException {
        final TiffOutputDirectory result = new TiffOutputDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT, byteOrder);
        addDirectory(result);
        return result;
    }

    /**
     * Dumps the content of this TIFF output set to the debug output.
     */
    public void dump() {
        Debug.debug(this.toString());
    }

    /**
     * Finds a directory of the specified type in this output set.
     *
     * @param directoryType the type of the directory to find.
     * @return the found directory, or null if no such directory exists.
     */
    public TiffOutputDirectory findDirectory(final int directoryType) {
        for (final TiffOutputDirectory directory : directories) {
            if (directory.getType() == directoryType) {
                return directory;
            }
        }
        return null;
    }

    /**
     * Finds a field with the specified tag in this output set.
     *
     * @param tag the tag of the field to find.
     * @return the found field, or null if no such field exists.
     */
    public TiffOutputField findField(final int tag) {
        for (final TiffOutputDirectory directory : directories) {
            final TiffOutputField field = directory.findField(tag);
            if (null != field) {
                return field;
            }
        }
        return null;
    }

    /**
     * Finds a field with the specified tag info in this output set.
     *
     * @param tagInfo the tag info of the field to find.
     * @return the found field, or null if no such field exists.
     */
    public TiffOutputField findField(final TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    /**
     * Gets a list of all directories in this output set.
     *
     * @return a list of all directories.
     */
    public List<TiffOutputDirectory> getDirectories() {
        return new ArrayList<>(directories);
    }

    /**
     * Gets the EXIF directory in this output set.
     *
     * @return the EXIF directory, or null if no EXIF directory exists.
     */
    public TiffOutputDirectory getExifDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF);
    }

    /**
     * Gets the GPS directory in this output set.
     *
     * @return the GPS directory, or null if no GPS directory exists.
     */
    public TiffOutputDirectory getGpsDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
    }

    /**
     * Gets the Interoperability directory in this output set.
     *
     * @return the Interoperability directory, or null if no Interoperability directory exists.
     */
    public TiffOutputDirectory getInteroperabilityDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY);
    }

    /**
     * Gets the EXIF directory in this output set, creating it if it doesn't exist.
     *
     * @return the EXIF directory.
     * @throws ImagingException if it fails to create the directory.
     */
    public TiffOutputDirectory getOrCreateExifDirectory() throws ImagingException {
        // EXIF directory requires root directory.
        getOrCreateRootDirectory();

        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_EXIF);
        if (null != result) {
            return result;
        }
        return addExifDirectory();
    }

    /**
     * Gets the GPS directory in this output set, creating it if it doesn't exist.
     *
     * @return the GPS directory.
     * @throws ImagingException if it fails to create the directory.
     */
    public TiffOutputDirectory getOrCreateGpsDirectory() throws ImagingException {
        // GPS directory requires EXIF directory
        getOrCreateExifDirectory();

        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_GPS);
        if (null != result) {
            return result;
        }
        return addGpsDirectory();
    }

    /**
     * Gets the Root directory in this output set, creating it if it doesn't exist.
     *
     * @return the Root directory.
     * @throws ImagingException if it fails to create the directory.
     */
    public TiffOutputDirectory getOrCreateRootDirectory() throws ImagingException {
        final TiffOutputDirectory result = findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT);
        if (null != result) {
            return result;
        }
        return addRootDirectory();
    }

    /**
     * Gets all output items from all directories in this output set.
     *
     * @param outputSummary the output summary.
     * @return the list of all output items.
     * @throws ImagingException if an error occurs.
     */
    protected List<AbstractTiffOutputItem> getOutputItems(final TiffOutputSummary outputSummary) throws ImagingException {
        final List<AbstractTiffOutputItem> result = new ArrayList<>();

        for (final TiffOutputDirectory directory : directories) {
            result.addAll(directory.getOutputItems(outputSummary));
        }

        return result;
    }

    /**
     * Gets the Root directory in this output set.
     *
     * @return the Root directory.
     */
    public TiffOutputDirectory getRootDirectory() {
        return findDirectory(TiffDirectoryConstants.DIRECTORY_TYPE_ROOT);
    }

    /**
     * Checks if this output set is empty (i.e., contains no directories).
     *
     * @return true if this output set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return directories.isEmpty();
    }

    @Override
    public Iterator<TiffOutputDirectory> iterator() {
        return directories.iterator();
    }

    /**
     * Removes a field with the specified tag from all directories in this output set.
     *
     * @param tag the tag of the field to remove.
     */
    public void removeField(final int tag) {
        for (final TiffOutputDirectory directory : directories) {
            directory.removeField(tag);
        }
    }

    /**
     * Removes a field with the specified tag info from all directories in this output set.
     *
     * @param tagInfo the tag info of the field to remove.
     */
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

    /**
     * Gets a string representation with optional prefix.
     *
     * @param prefix the prefix, or null.
     * @return the string representation.
     */
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
