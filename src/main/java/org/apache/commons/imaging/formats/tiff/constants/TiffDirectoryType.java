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
package org.apache.commons.imaging.formats.tiff.constants;

/**
 * TIFF directory types.
 */
public enum TiffDirectoryType {

    /** TIFF directory: IFD0. */
    TIFF_DIRECTORY_IFD0(true, TiffDirectoryConstants.DIRECTORY_TYPE_DIR_0, "IFD0"),

    /** TIFF directory: IFD1. */
    TIFF_DIRECTORY_IFD1(true, TiffDirectoryConstants.DIRECTORY_TYPE_DIR_1, "IFD1"),

    /** TIFF directory: IFD2. */
    TIFF_DIRECTORY_IFD2(true, TiffDirectoryConstants.DIRECTORY_TYPE_DIR_2, "IFD2"),

    /** TIFF directory: IFD3. */
    TIFF_DIRECTORY_IFD3(true, TiffDirectoryConstants.DIRECTORY_TYPE_DIR_3, "IFD3"),

    /** EXIF directory: Interoperability IFD. */
    EXIF_DIRECTORY_INTEROP_IFD(false, TiffDirectoryConstants.DIRECTORY_TYPE_INTEROPERABILITY, "Interop IFD"),

    /** EXIF directory: Maker Notes. */
    EXIF_DIRECTORY_MAKER_NOTES(false, TiffDirectoryConstants.DIRECTORY_TYPE_MAKER_NOTES, "Maker Notes"),

    /** EXIF directory: EXIF IFD. */
    EXIF_DIRECTORY_EXIF_IFD(false, TiffDirectoryConstants.DIRECTORY_TYPE_EXIF, "Exif IFD"),

    /** EXIF directory: GPS IFD. */
    EXIF_DIRECTORY_GPS(false, TiffDirectoryConstants.DIRECTORY_TYPE_GPS, "GPS IFD");

    /** EXIF directory: IFD0 (alias). */
    public static final TiffDirectoryType EXIF_DIRECTORY_IFD0 = TIFF_DIRECTORY_IFD0;

    /** TIFF directory: Root (alias for IFD0). */
    public static final TiffDirectoryType TIFF_DIRECTORY_ROOT = TIFF_DIRECTORY_IFD0;

    /** EXIF directory: IFD1 (alias). */
    public static final TiffDirectoryType EXIF_DIRECTORY_IFD1 = TIFF_DIRECTORY_IFD1;

    /** EXIF directory: IFD2 (alias). */
    public static final TiffDirectoryType EXIF_DIRECTORY_IFD2 = TIFF_DIRECTORY_IFD2;

    /** EXIF directory: IFD3 (alias). */
    public static final TiffDirectoryType EXIF_DIRECTORY_IFD3 = TIFF_DIRECTORY_IFD3;

    /** EXIF directory: Sub IFD (alias for IFD1). */
    public static final TiffDirectoryType EXIF_DIRECTORY_SUB_IFD = TIFF_DIRECTORY_IFD1;

    /** EXIF directory: Sub IFD1 (alias for IFD2). */
    public static final TiffDirectoryType EXIF_DIRECTORY_SUB_IFD1 = TIFF_DIRECTORY_IFD2;

    /** EXIF directory: Sub IFD2 (alias for IFD3). */
    public static final TiffDirectoryType EXIF_DIRECTORY_SUB_IFD2 = TIFF_DIRECTORY_IFD3;

    /** EXIF directory: Unknown. */
    public static final TiffDirectoryType EXIF_DIRECTORY_UNKNOWN = null;

    /**
     * Gets the EXIF directory type for the given type code.
     *
     * @param type the directory type code.
     * @return the directory type, or {@link #EXIF_DIRECTORY_UNKNOWN} if not found.
     */
    public static TiffDirectoryType getExifDirectoryType(final int type) {

        for (final TiffDirectoryType tiffDirectoryType : values()) {
            if (tiffDirectoryType.directoryType == type) {
                return tiffDirectoryType;
            }
        }
        return EXIF_DIRECTORY_UNKNOWN;
    }

    private final boolean isImageDirectory;

    /** The directory type code. */
    public final int directoryType;

    /** The directory name. */
    public final String name;

    TiffDirectoryType(final boolean isImageDirectory, final int directoryType, final String name) {
        this.isImageDirectory = isImageDirectory;
        this.directoryType = directoryType;
        this.name = name;
    }

    /**
     * Checks if this is an image directory.
     *
     * @return {@code true} if this is an image directory.
     */
    public boolean isImageDirectory() {
        return isImageDirectory;
    }
}
