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
package org.apache.sanselan.formats.jpeg;

public interface JpegConstants
{

	public static final byte ExifIdentifierCode[] = {
			0xff & 'E', 0xff & 'x', 0xff & 'i', 0xff & 'f',
	};

	public static final byte SOI[] = new byte[]{
			(byte) 0xff, (byte) 0xd8
	};
	public static final byte EOI[] = new byte[]{
			(byte) 0xff, (byte) 0xd9
	};
	public static final int SOS_Marker = (0xff00) | (0xda);

	public static final int JPEG_APP0 = 0xE0;
	//	public static final  int JPEG_APP1 = JPEG_APP0 + 1;
	//	public static final  int JPEG_APP1_Marker = (0xff00) | JPEG_APP1;
	public static final int JPEG_APP0_Marker = (0xff00) | (JPEG_APP0);
	public static final int JPEG_APP1_Marker = (0xff00) | (JPEG_APP0 + 1);
	//	public static final  int JPEG_APP2 = ;
	public static final int JPEG_APP2_Marker = (0xff00) | (JPEG_APP0 + 2);
	public static final int JPEG_APP13_Marker = (0xff00) | (JPEG_APP0 + 13);
	public static final int JPEG_APP14_Marker = (0xff00) | (JPEG_APP0 + 14);
	public static final int JPEG_APP15_Marker = (0xff00) | (JPEG_APP0 + 15);

	public static final int JFIFMarker = 0xFFE0;
	public static final int SOF0Marker = 0xFFc0;
	public static final int SOF1Marker = 0xFFc0 + 0x1;
	public static final int SOF2Marker = 0xFFc0 + 0x2;
	public static final int SOF3Marker = 0xFFc0 + 0x3;
	public static final int SOF4Marker = 0xFFc0 + 0x4;
	public static final int SOF5Marker = 0xFFc0 + 0x5;
	public static final int SOF6Marker = 0xFFc0 + 0x6;
	public static final int SOF7Marker = 0xFFc0 + 0x7;
	public static final int SOF8Marker = 0xFFc0 + 0x8;
	public static final int SOF9Marker = 0xFFc0 + 0x9;
	public static final int SOF10Marker = 0xFFc0 + 0xa;
	public static final int SOF11Marker = 0xFFc0 + 0xb;
	public static final int SOF12Marker = 0xFFc0 + 0xc;
	public static final int SOF13Marker = 0xFFc0 + 0xd;
	public static final int SOF14Marker = 0xFFc0 + 0xe;
	public static final int SOF15Marker = 0xFFc0 + 0xf;

	public static final byte icc_profile_label[] = {
			0x49, 0x43, 0x43, 0x5F, 0x50, 0x52, 0x4F, 0x46, 0x49, 0x4C, 0x45,
			0x0
	};

	//	public static final byte PhotoshopIdentificationString[] = "Photoshop 3.0"
	//		.getBytes();
	public static final byte PhotoshopIdentificationString[] = {
			0xff & 'P', 0xff & 'h', 0xff & 'o', 0xff & 't', 0xff & 'o',
			0xff & 's', 0xff & 'h', 0xff & 'o', 0xff & 'p', 0xff & ' ',
			0xff & '3', 0xff & '.', 0xff & '0', 0,
	};
	public static final byte CONST_8BIM[] = {
			0xff & '8', 0xff & 'B', 0xff & 'I', 0xff & 'M',
	};

	public static final byte IPTCPrefix[] = {
			0x1C, 0x02,
	};

	public static final IptcType IPTC_TYPE_RecordVersion = new IptcType(0,
			"RecordVersion");
	public static final IptcType IPTC_TYPE_ObjectTypeReference = new IptcType(
			3, "ObjectTypeReference");
	public static final IptcType IPTC_TYPE_ObjectAttributeReference = new IptcType(
			4, "ObjectAttributeReference");
	public static final IptcType IPTC_TYPE_ObjectName = new IptcType(5,
			"ObjectName");
	public static final IptcType IPTC_TYPE_EditStatus = new IptcType(7,
			"EditStatus");
	public static final IptcType IPTC_TYPE_EditorialUpdate = new IptcType(8,
			"EditorialUpdate");
	public static final IptcType IPTC_TYPE_Urgency = new IptcType(10, "Urgency");
	public static final IptcType IPTC_TYPE_SubjectReference = new IptcType(12,
			"SubjectReference");
	public static final IptcType IPTC_TYPE_Category = new IptcType(15,
			"Category");
	public static final IptcType IPTC_TYPE_SupplementalCategory = new IptcType(
			20, "SupplementalCategory");
	public static final IptcType IPTC_TYPE_FixtureIdentifier = new IptcType(22,
			"FixtureIdentifier");
	public static final IptcType IPTC_TYPE_Keywords = new IptcType(25,
			"Keywords");
	public static final IptcType IPTC_TYPE_ContentLocationCode = new IptcType(
			26, "ContentLocationCode");
	public static final IptcType IPTC_TYPE_ContentLocationName = new IptcType(
			27, "ContentLocationName");
	public static final IptcType IPTC_TYPE_ReleaseDate = new IptcType(30,
			"ReleaseDate");
	public static final IptcType IPTC_TYPE_ReleaseTime = new IptcType(35,
			"ReleaseTime");
	public static final IptcType IPTC_TYPE_ExpirationDate = new IptcType(37,
			"ExpirationDate");
	public static final IptcType IPTC_TYPE_ExpirationTime = new IptcType(38,
			"ExpirationTime");
	public static final IptcType IPTC_TYPE_SpecialInstructions = new IptcType(
			40, "SpecialInstructions");
	public static final IptcType IPTC_TYPE_ActionAdvised = new IptcType(42,
			"ActionAdvised");
	public static final IptcType IPTC_TYPE_ReferenceService = new IptcType(45,
			"ReferenceService");
	public static final IptcType IPTC_TYPE_ReferenceDate = new IptcType(47,
			"ReferenceDate");
	public static final IptcType IPTC_TYPE_ReferenceNumber = new IptcType(50,
			"ReferenceNumber");
	public static final IptcType IPTC_TYPE_DateCreated = new IptcType(55,
			"DateCreated");
	public static final IptcType IPTC_TYPE_TimeCreated = new IptcType(60,
			"TimeCreated");
	public static final IptcType IPTC_TYPE_DigitalCreationDate = new IptcType(
			62, "DigitalCreationDate");
	public static final IptcType IPTC_TYPE_DigitalCreationTime = new IptcType(
			63, "DigitalCreationTime");
	public static final IptcType IPTC_TYPE_OriginatingProgram = new IptcType(
			65, "OriginatingProgram");
	public static final IptcType IPTC_TYPE_ProgramVersion = new IptcType(70,
			"ProgramVersion");
	public static final IptcType IPTC_TYPE_ObjectCycle = new IptcType(75,
			"ObjectCycle");
	public static final IptcType IPTC_TYPE_Byline = new IptcType(80, "By-line");
	public static final IptcType IPTC_TYPE_BylineTitle = new IptcType(85,
			"By-lineTitle");
	public static final IptcType IPTC_TYPE_City = new IptcType(90, "City");
	public static final IptcType IPTC_TYPE_Sublocation = new IptcType(92,
			"Sublocation");
	public static final IptcType IPTC_TYPE_Province_State = new IptcType(95,
			"Province/State");
	public static final IptcType IPTC_TYPE_Country_PrimaryLocationCode = new IptcType(
			100, "Country/PrimaryLocationCode");
	public static final IptcType IPTC_TYPE_Country_PrimaryLocationName = new IptcType(
			101, "Country/PrimaryLocationName");
	public static final IptcType IPTC_TYPE_OriginalTransmission_Reference = new IptcType(
			103, "OriginalTransmission,Reference");
	public static final IptcType IPTC_TYPE_Headline = new IptcType(105,
			"Headline");
	public static final IptcType IPTC_TYPE_Credit = new IptcType(110, "Credit");
	public static final IptcType IPTC_TYPE_Source = new IptcType(115, "Source");
	public static final IptcType IPTC_TYPE_CopyrightNotice = new IptcType(116,
			"CopyrightNotice");
	public static final IptcType IPTC_TYPE_Contact = new IptcType(118,
			"Contact");
	public static final IptcType IPTC_TYPE_Caption_Abstract = new IptcType(120,
			"Caption/Abstract");
	public static final IptcType IPTC_TYPE_Writer_Editor = new IptcType(122,
			"Writer/Editor");
	public static final IptcType IPTC_TYPE_RasterizedCaption = new IptcType(
			125, "RasterizedCaption");
	public static final IptcType IPTC_TYPE_ImageType = new IptcType(130,
			"ImageType");
	public static final IptcType IPTC_TYPE_ImageOrientation = new IptcType(131,
			"ImageOrientation");
	public static final IptcType IPTC_TYPE_LanguageIdentifier = new IptcType(
			135, "LanguageIdentifier");
	public static final IptcType IPTC_TYPE_AudioType = new IptcType(150,
			"AudioType");
	public static final IptcType IPTC_TYPE_AudioSamplingRate = new IptcType(
			151, "AudioSamplingRate");
	public static final IptcType IPTC_TYPE_AudioSamplingResolution = new IptcType(
			152, "AudioSamplingResolution");
	public static final IptcType IPTC_TYPE_AudioDuration = new IptcType(153,
			"AudioDuration");
	public static final IptcType IPTC_TYPE_AudioOutcue = new IptcType(154,
			"AudioOutcue");
	public static final IptcType IPTC_TYPE_ObjectDataPreview_FileFormat = new IptcType(
			200, "ObjectDataPreview,FileFormat");
	public static final IptcType IPTC_TYPE_ObjectDataPreview_FileFormatVersion = new IptcType(
			201, "ObjectDataPreview,FileFormatVersion");
	public static final IptcType IPTC_TYPE_ObjectDataPreviewData = new IptcType(
			202, "ObjectDataPreviewData");
	//--
	public static final IptcType IPTC_TYPE_Unknown = new IptcType(-1, "Unknown");

	public static final IptcType IPTC_TYPES[] = {
			IPTC_TYPE_RecordVersion, IPTC_TYPE_ObjectTypeReference,
			IPTC_TYPE_ObjectAttributeReference, IPTC_TYPE_ObjectName,
			IPTC_TYPE_EditStatus, IPTC_TYPE_EditorialUpdate, IPTC_TYPE_Urgency,
			IPTC_TYPE_SubjectReference, IPTC_TYPE_Category,
			IPTC_TYPE_SupplementalCategory, IPTC_TYPE_FixtureIdentifier,
			IPTC_TYPE_Keywords, IPTC_TYPE_ContentLocationCode,
			IPTC_TYPE_ContentLocationName, IPTC_TYPE_ReleaseDate,
			IPTC_TYPE_ReleaseTime, IPTC_TYPE_ExpirationDate,
			IPTC_TYPE_ExpirationTime, IPTC_TYPE_SpecialInstructions,
			IPTC_TYPE_ActionAdvised, IPTC_TYPE_ReferenceService,
			IPTC_TYPE_ReferenceDate, IPTC_TYPE_ReferenceNumber,
			IPTC_TYPE_DateCreated, IPTC_TYPE_TimeCreated,
			IPTC_TYPE_DigitalCreationDate, IPTC_TYPE_DigitalCreationTime,
			IPTC_TYPE_OriginatingProgram, IPTC_TYPE_ProgramVersion,
			IPTC_TYPE_ObjectCycle, IPTC_TYPE_Byline, IPTC_TYPE_BylineTitle,
			IPTC_TYPE_City, IPTC_TYPE_Sublocation, IPTC_TYPE_Province_State,
			IPTC_TYPE_Country_PrimaryLocationCode,
			IPTC_TYPE_Country_PrimaryLocationName,
			IPTC_TYPE_OriginalTransmission_Reference, IPTC_TYPE_Headline,
			IPTC_TYPE_Credit, IPTC_TYPE_Source, IPTC_TYPE_CopyrightNotice,
			IPTC_TYPE_Contact, IPTC_TYPE_Caption_Abstract,
			IPTC_TYPE_Writer_Editor, IPTC_TYPE_RasterizedCaption,
			IPTC_TYPE_ImageType, IPTC_TYPE_ImageOrientation,
			IPTC_TYPE_LanguageIdentifier, IPTC_TYPE_AudioType,
			IPTC_TYPE_AudioSamplingRate, IPTC_TYPE_AudioSamplingResolution,
			IPTC_TYPE_AudioDuration, IPTC_TYPE_AudioOutcue,
			IPTC_TYPE_ObjectDataPreview_FileFormat,
			IPTC_TYPE_ObjectDataPreview_FileFormatVersion,
			IPTC_TYPE_ObjectDataPreviewData,
	};
}
