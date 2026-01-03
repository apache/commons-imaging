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
package org.apache.commons.imaging.formats.jpeg.iptc;

/**
 * Enumeration of IPTC (International Press Telecommunications Council) metadata record types.
 */
public enum IptcTypes implements IptcType {
    /** Record version type. */
    RECORD_VERSION(0, "Record Version"),
    /** Object type reference type. */
    OBJECT_TYPE_REFERENCE(3, "Object Type Reference"),
    /** Object attribute reference type. */
    OBJECT_ATTRIBUTE_REFERENCE(4, "Object Attribute Reference"),
    /** Object name type. */
    OBJECT_NAME(5, "Object Name"),
    /** Edit status type. */
    EDIT_STATUS(7, "Edit Status"),
    /** Editorial update type. */
    EDITORIAL_UPDATE(8, "Editorial Update"),
    /** Urgency type. */
    URGENCY(10, "Urgency"),
    /** Subject reference type. */
    SUBJECT_REFERENCE(12, "Subject Reference"),
    /** Category type. */
    CATEGORY(15, "Category"),
    /** Supplemental category type. */
    SUPPLEMENTAL_CATEGORY(20, "Supplemental Category"),
    /** Fixture identifier type. */
    FIXTURE_IDENTIFIER(22, "Fixture Identifier"),
    /** Keywords type. */
    KEYWORDS(25, "Keywords"),
    /** Content location code type. */
    CONTENT_LOCATION_CODE(26, "Content Location Code"),
    /** Content location name type. */
    CONTENT_LOCATION_NAME(27, "Content Location Name"),
    /** Release date type. */
    RELEASE_DATE(30, "Release Date"),
    /** Release time type. */
    RELEASE_TIME(35, "Release Time"),
    /** Expiration date type. */
    EXPIRATION_DATE(37, "Expiration Date"),
    /** Expiration time type. */
    EXPIRATION_TIME(38, "Expiration Time"),
    /** Special instructions type. */
    SPECIAL_INSTRUCTIONS(40, "Special Instructions"),
    /** Action advised type. */
    ACTION_ADVISED(42, "Action Advised"),
    /** Reference service type. */
    REFERENCE_SERVICE(45, "Reference Service"),
    /** Reference date type. */
    REFERENCE_DATE(47, "Reference Date"),
    /** Reference number type. */
    REFERENCE_NUMBER(50, "Reference Number"),
    /** Date created type. */
    DATE_CREATED(55, "Date Created"),
    /** Time created type. */
    TIME_CREATED(60, "Time Created"),
    /** Digital creation date type. */
    DIGITAL_CREATION_DATE(62, "Digital Creation Date"),
    /** Digital creation time type. */
    DIGITAL_CREATION_TIME(63, "Digital Creation Time"),
    /** Originating program type. */
    ORIGINATING_PROGRAM(65, "Originating Program"),
    /** Program version type. */
    PROGRAM_VERSION(70, "Program Version"),
    /** Object cycle type. */
    OBJECT_CYCLE(75, "Object Cycle"),
    /** By-line type. */
    BYLINE(80, "By-line"),
    /** By-line title type. */
    BYLINE_TITLE(85, "By-line Title"),
    /** City type. */
    CITY(90, "City"),
    /** Sublocation type. */
    SUBLOCATION(92, "Sublocation"),
    /** Province/State type. */
    PROVINCE_STATE(95, "Province/State"),
    /** Country/Primary location code type. */
    COUNTRY_PRIMARY_LOCATION_CODE(100, "Country/Primary Location Code"),
    /** Country/Primary location name type. */
    COUNTRY_PRIMARY_LOCATION_NAME(101, "Country/Primary Location Name"),
    /** Original transmission reference type. */
    ORIGINAL_TRANSMISSION_REFERENCE(103, "Original Transmission, Reference"),
    /** Headline type. */
    HEADLINE(105, "Headline"),
    /** Credit type. */
    CREDIT(110, "Credit"),
    /** Source type. */
    SOURCE(115, "Source"),
    /** Copyright notice type. */
    COPYRIGHT_NOTICE(116, "Copyright Notice"),
    /** Contact type. */
    CONTACT(118, "Contact"),
    /** Caption/Abstract type. */
    CAPTION_ABSTRACT(120, "Caption/Abstract"),
    /** Writer/Editor type. */
    WRITER_EDITOR(122, "Writer/Editor"),
    /** Rasterized caption type. */
    RASTERIZED_CAPTION(125, "Rasterized Caption"),
    /** Image type. */
    IMAGE_TYPE(130, "ImageType"),
    /** Image orientation type. */
    IMAGE_ORIENTATION(131, "Image Orientation"),
    /** Language identifier type. */
    LANGUAGE_IDENTIFIER(135, "Language Identifier"),
    /** Audio type. */
    AUDIO_TYPE(150, "Audio Type"),
    /** Audio sampling rate type. */
    AUDIO_SAMPLING_RATE(151, "Audio Sampling Rate"),
    /** Audio sampling resolution type. */
    AUDIO_SAMPLING_RESOLUTION(152, "Audio Sampling Resolution"),
    /** Audio duration type. */
    AUDIO_DURATION(153, "Audio Duration"),
    /** Audio outcue type. */
    AUDIO_OUTCUE(154, "Audio Outcue"),
    /** Object data preview file format type. */
    OBJECT_DATA_PREVIEW_FILE_FORMAT(200, "Object Data Preview, File Format"),
    /** Object data preview file format version type. */
    OBJECT_DATA_PREVIEW_FILE_FORMAT_VERSION(201, "Object Data Preview, File Format Version"),
    /** Object data preview data type. */
    OBJECT_DATA_PREVIEW_DATA(202, "Object Data Preview Data");

    /**
     * Gets an unknown IPTC type for the specified type number.
     *
     * @param type the type number.
     * @return an unknown IPTC type.
     */
    public static IptcType getUnknown(final int type) {
        return new IptcType() {
            @Override
            public String getName() {
                return "Unknown";
            }

            @Override
            public int getType() {
                return type;
            }

            @Override
            public String toString() {
                return "Unknown (" + type + ")";
            }
        };
    }

    /** The IPTC type number. */
    public final int type;

    /** The IPTC type name. */
    public final String name;

    IptcTypes(final int type, final String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}
