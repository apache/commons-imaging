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
 * Constants for TIFF directory types.
 */
public final class TiffDirectoryConstants {

    /** Directory type: Unknown. */
    public static final int DIRECTORY_TYPE_UNKNOWN = -1;

    /** Directory type: Root. */
    public static final int DIRECTORY_TYPE_ROOT = 0;

    /** Directory type: Sub. */
    public static final int DIRECTORY_TYPE_SUB = 1;

    /** Directory type: Sub0. */
    public static final int DIRECTORY_TYPE_SUB0 = 1;

    /** Directory type: Sub1. */
    public static final int DIRECTORY_TYPE_SUB1 = 2;

    /** Directory type: Sub2. */
    public static final int DIRECTORY_TYPE_SUB2 = 3;

    /** Directory type: Thumbnail. */
    public static final int DIRECTORY_TYPE_THUMBNAIL = 2;

    /** Directory type: EXIF. */
    public static final int DIRECTORY_TYPE_EXIF = -2;

    /** Directory type: GPS. */
    public static final int DIRECTORY_TYPE_GPS = -3;

    /** Directory type: Interoperability. */
    public static final int DIRECTORY_TYPE_INTEROPERABILITY = -4;

    /** Directory type: Maker Notes. */
    public static final int DIRECTORY_TYPE_MAKER_NOTES = -5;

    /** Directory type: Directory 0. */
    public static final int DIRECTORY_TYPE_DIR_0 = 0;

    /** Directory type: Directory 1. */
    public static final int DIRECTORY_TYPE_DIR_1 = 1;

    /** Directory type: Directory 2. */
    public static final int DIRECTORY_TYPE_DIR_2 = 2;

    /** Directory type: Directory 3. */
    public static final int DIRECTORY_TYPE_DIR_3 = 3;

    /** Directory type: Directory 4. */
    public static final int DIRECTORY_TYPE_DIR_4 = 4;

    // TODO: this should really be an enum
    private TiffDirectoryConstants() {
    }
}
