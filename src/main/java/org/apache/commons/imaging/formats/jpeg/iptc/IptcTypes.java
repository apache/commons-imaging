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

public enum IptcTypes implements IptcType {
    RECORD_VERSION(0, "Record Version"), OBJECT_TYPE_REFERENCE(3, "Object Type Reference"), OBJECT_ATTRIBUTE_REFERENCE(4, "Object Attribute Reference"),
    OBJECT_NAME(5, "Object Name"), EDIT_STATUS(7, "Edit Status"), EDITORIAL_UPDATE(8, "Editorial Update"), URGENCY(10, "Urgency"),
    SUBJECT_REFERENCE(12, "Subject Reference"), CATEGORY(15, "Category"), SUPPLEMENTAL_CATEGORY(20, "Supplemental Category"),
    FIXTURE_IDENTIFIER(22, "Fixture Identifier"), KEYWORDS(25, "Keywords"), CONTENT_LOCATION_CODE(26, "Content Location Code"),
    CONTENT_LOCATION_NAME(27, "Content Location Name"), RELEASE_DATE(30, "Release Date"), RELEASE_TIME(35, "Release Time"),
    EXPIRATION_DATE(37, "Expiration Date"), EXPIRATION_TIME(38, "Expiration Time"), SPECIAL_INSTRUCTIONS(40, "Special Instructions"),
    ACTION_ADVISED(42, "Action Advised"), REFERENCE_SERVICE(45, "Reference Service"), REFERENCE_DATE(47, "Reference Date"),
    REFERENCE_NUMBER(50, "Reference Number"), DATE_CREATED(55, "Date Created"), TIME_CREATED(60, "Time Created"),
    DIGITAL_CREATION_DATE(62, "Digital Creation Date"), DIGITAL_CREATION_TIME(63, "Digital Creation Time"), ORIGINATING_PROGRAM(65, "Originating Program"),
    PROGRAM_VERSION(70, "Program Version"), OBJECT_CYCLE(75, "Object Cycle"), BYLINE(80, "By-line"), BYLINE_TITLE(85, "By-line Title"), CITY(90, "City"),
    SUBLOCATION(92, "Sublocation"), PROVINCE_STATE(95, "Province/State"), COUNTRY_PRIMARY_LOCATION_CODE(100, "Country/Primary Location Code"),
    COUNTRY_PRIMARY_LOCATION_NAME(101, "Country/Primary Location Name"), ORIGINAL_TRANSMISSION_REFERENCE(103, "Original Transmission, Reference"),
    HEADLINE(105, "Headline"), CREDIT(110, "Credit"), SOURCE(115, "Source"), COPYRIGHT_NOTICE(116, "Copyright Notice"), CONTACT(118, "Contact"),
    CAPTION_ABSTRACT(120, "Caption/Abstract"), WRITER_EDITOR(122, "Writer/Editor"), RASTERIZED_CAPTION(125, "Rasterized Caption"), IMAGE_TYPE(130, "ImageType"),
    IMAGE_ORIENTATION(131, "Image Orientation"), LANGUAGE_IDENTIFIER(135, "Language Identifier"), AUDIO_TYPE(150, "Audio Type"),
    AUDIO_SAMPLING_RATE(151, "Audio Sampling Rate"), AUDIO_SAMPLING_RESOLUTION(152, "Audio Sampling Resolution"), AUDIO_DURATION(153, "Audio Duration"),
    AUDIO_OUTCUE(154, "Audio Outcue"), OBJECT_DATA_PREVIEW_FILE_FORMAT(200, "Object Data Preview, File Format"),
    OBJECT_DATA_PREVIEW_FILE_FORMAT_VERSION(201, "Object Data Preview, File Format Version"), OBJECT_DATA_PREVIEW_DATA(202, "Object Data Preview Data");

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

    public final int type;

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
