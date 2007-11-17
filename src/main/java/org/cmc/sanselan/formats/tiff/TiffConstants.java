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
package org.cmc.sanselan.formats.tiff;

import org.cmc.sanselan.SanselanConstants;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldType;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeASCII;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeByte;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeDouble;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeFloat;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeLong;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeRational;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeShort;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeUnknown;

public interface TiffConstants extends SanselanConstants
{
	public static final int TIFF_HEADER_SIZE = 8;
	public static final int TIFF_DIRECTORY_HEADER_LENGTH = 4;
	public static final int TIFF_DIRECTORY_FOOTER_LENGTH = 2;
	public static final int TIFF_ENTRY_LENGTH = 12;

	public static final int TIFF_COMPRESSION_UNCOMPRESSED_1 = 1;
	public static final int TIFF_COMPRESSION_UNCOMPRESSED = TIFF_COMPRESSION_UNCOMPRESSED_1;
	public static final int TIFF_COMPRESSION_CCITT_1D = 2;
	public static final int TIFF_COMPRESSION_CCITT_GROUP_3 = 3;
	public static final int TIFF_COMPRESSION_CCITT_GROUP_4 = 4;
	public static final int TIFF_COMPRESSION_LZW = 5;
	public static final int TIFF_COMPRESSION_JPEG = 6;
	public static final int TIFF_COMPRESSION_UNCOMPRESSED_2 = 32771;
	public static final int TIFF_COMPRESSION_PACKBITS = 32773;

	//	public static final Tag TIFF_TAG_NewSubfileType = new Tag(254, "NewSubfileType");
	public static final TagInfo TIFF_TAG_SubfileType = new TagInfo(255,
			"SubfileType");
	//	public static final Tag TIFF_TAG_ImageWidth = new Tag(256, "ImageWidth");
	//	public static final Tag TIFF_TAG_ImageLength = new Tag(257, "ImageLength");
	//	public static final Tag TIFF_TAG_BitsPerSample = new Tag(258, "BitsPerSample");
	//	public static final Tag TIFF_TAG_Compression = new Tag(259, "Compression");

	//	public static final Tag TIFF_TAG_PhotometricInterpretation = new Tag(262, "PhotometricInterpretation");

	public static final TagInfo TIFF_TAG_Threshholding = new TagInfo(263,
			"Threshholding");
	public static final TagInfo TIFF_TAG_CellWidth = new TagInfo(264,
			"CellWidth");
	public static final TagInfo TIFF_TAG_CellLength = new TagInfo(265,
			"CellLength");
	//	public static final Tag TIFF_TAG_FillOrder = new Tag(266, "FillOrder");
	public static final TagInfo TIFF_TAG_DocumentName = new TagInfo(269,
			"DocumentName");
	//	public static final Tag TIFF_TAG_ImageDescription = new Tag(270, "ImageDescription");
	//	public static final Tag TIFF_TAG_Make = new Tag(271, "Make");
	//	public static final Tag TIFF_TAG_Model = new Tag(272, "Model");
	//	public static final Tag TIFF_TAG_StripOffsets = new Tag(273, "StripOffsets");
	//	public static final Tag TIFF_TAG_Orientation = new Tag(274, "Orientation");
	//	public static final Tag TIFF_TAG_SamplesPerPixel = new Tag(277, "SamplesPerPixel");
	//	public static final Tag TIFF_TAG_RowsPerStrip = new Tag(278, "RowsPerStrip");
	//	public static final Tag TIFF_TAG_StripByteCounts = new Tag(279, "StripByteCounts");
	public static final TagInfo TIFF_TAG_MinSampleValue = new TagInfo(280,
			"MinSampleValue");
	public static final TagInfo TIFF_TAG_MaxSampleValue = new TagInfo(281,
			"MaxSampleValue");
	//	public static final Tag TIFF_TAG_XResolution = new Tag(282, "XResolution");
	//	public static final Tag TIFF_TAG_YResolution = new Tag(283, "YResolution");
	//	public static final Tag TIFF_TAG_PlanarConfiguration = new Tag(284, "PlanarConfiguration");
	public static final TagInfo TIFF_TAG_PageName = new TagInfo(285, "PageName");
	public static final TagInfo TIFF_TAG_XPosition = new TagInfo(286,
			"XPosition");
	public static final TagInfo TIFF_TAG_YPosition = new TagInfo(287,
			"YPosition");
	//	public static final Tag TIFF_TAG_FreeOffsets = new Tag(288, "FreeOffsets");
	//	public static final Tag TIFF_TAG_FreeByteCounts = new Tag(289, "FreeByteCounts");
	public static final TagInfo TIFF_TAG_GrayResponseUnit = new TagInfo(290,
			"GrayResponseUnit");

	public static final TagInfo TIFF_TAG_GrayResponseCurve = new TagInfo(291,
			"GrayResponseCurve");
	public static final TagInfo TIFF_TAG_T4Options = new TagInfo(292,
			"T4Options");
	public static final TagInfo TIFF_TAG_T6Options = new TagInfo(293,
			"T6Options");
	//	public static final Tag TIFF_TAG_ResolutionUnit = new Tag(296, "ResolutionUnit");
	//	public static final Tag TIFF_TAG_PageNumber = new Tag(297, "PageNumber");
	//	public static final Tag TIFF_TAG_TransferFunction = new Tag(301, "TransferFunction");

	//	public static final Tag TIFF_TAG_Software = new Tag(305, "Software");
	//	public static final Tag TIFF_TAG_DateTime = new Tag(306, "DateTime");
	//	public static final Tag TIFF_TAG_Artist = new Tag(315, "Artist");
	//	public static final Tag TIFF_TAG_HostComputer = new Tag(316, "HostComputer");
	//	public static final Tag TIFF_TAG_Predictor = new Tag(317, "Predictor");
	//	public static final Tag TIFF_TAG_WhitePoint = new Tag(318, "WhitePoint");
	//	public static final Tag TIFF_TAG_PrimaryChromaticities = new Tag(319, "PrimaryChromaticities");
	//	public static final Tag TIFF_TAG_ColorMap = new Tag(320, "ColorMap");
	//	public static final Tag TIFF_TAG_HalftoneHints = new Tag(321, "HalftoneHints");
	//	public static final Tag TIFF_TAG_TileWidth = new Tag(322, "TileWidth");
	//	public static final Tag TIFF_TAG_TileLength = new Tag(323, "TileLength");
	//	public static final Tag TIFF_TAG_TileOffsets = new Tag(324, "TileOffsets");
	//	public static final Tag TIFF_TAG_TileByteCounts = new Tag(325, "TileByteCounts");
	//	public static final Tag TIFF_TAG_InkSet = new Tag(332, "InkSet");
	//	public static final Tag TIFF_TAG_InkNames = new Tag(333, "InkNames");

	//	public static final Tag TIFF_TAG_NumberOfInks = new Tag(334, "NumberOfInks");
	//	public static final Tag TIFF_TAG_DotRange = new Tag(336, "DotRange");

	//	public static final Tag TIFF_TAG_TargetPrinter = new Tag(337, "TargetPrinter");
	//	public static final Tag TIFF_TAG_ExtraSamples = new Tag(338, "ExtraSamples");

	//	public static final Tag TIFF_TAG_SampleFormat = new Tag(339, "SampleFormat");
	//	public static final Tag TIFF_TAG_SMinSampleValue = new Tag(340, "SMinSampleValue");
	//	public static final Tag TIFF_TAG_SMaxSampleValue = new Tag(341, "SMaxSampleValue");
	//	public static final Tag TIFF_TAG_TransferRange = new Tag(342, "TransferRange");
	//	public static final Tag TIFF_TAG_JPEGProc = new Tag(512, "JPEGProc");
	//	public static final Tag TIFF_TAG_JPEGInterchangeFormat = new Tag(513, "JPEGInterchangeFormat");
	//	public static final Tag TIFF_TAG_JPEGInterchangeFormatLngth = new Tag(514, "JPEGInterchangeFormatLngth");
	//	public static final Tag TIFF_TAG_JPEGRestartInterval = new Tag(515, "JPEGRestartInterval");
	//	public static final Tag TIFF_TAG_JPEGLosslessPredictors = new Tag(517, "JPEGLosslessPredictors");
	//	public static final Tag TIFF_TAG_JPEGPointTransforms = new Tag(518, "JPEGPointTransforms");
	//	public static final Tag TIFF_TAG_JPEGQTables = new Tag(519, "JPEGQTables");
	//	public static final Tag TIFF_TAG_JPEGDCTables = new Tag(520, "JPEGDCTables");
	//	public static final Tag TIFF_TAG_JPEGACTables = new Tag(521, "JPEGACTables");
	//	public static final Tag TIFF_TAG_YCbCrCoefficients = new Tag(529, "YCbCrCoefficients");
	//	public static final Tag TIFF_TAG_YCbCrSubSampling = new Tag(530, "YCbCrSubSampling");
	//	public static final Tag TIFF_TAG_YCbCrPositioning = new Tag(531, "YCbCrPositioning");
	//	public static final Tag TIFF_TAG_ReferenceBlackWhite = new Tag(532, "ReferenceBlackWhite");

	//-----
	public static final TagInfo TIFF_TAG_FreeByteCounts = new TagInfo(289,
			"FreeByteCounts");
	public static final TagInfo TIFF_TAG_FreeOffsets = new TagInfo(288,
			"FreeByteCounts");

	public static final TagInfo TIFF_TAG_ImageWidth = new TagInfo(256,
			"ImageWidth");
	public static final TagInfo TIFF_TAG_ImageLength = new TagInfo(257,
			"ImageLength");
	public static final TagInfo TIFF_TAG_DateTime = new TagInfo(306,
			"DateTime", true);

	public static final TagInfo TIFF_TAG_BitsPerSample = new TagInfo(258,
			"BitsPerSample");
	public static final TagInfo TIFF_TAG_Compression = new TagInfo(259,
			"Compression");
	public static final TagInfo TIFF_TAG_PhotometricInterpretation = new TagInfo(
			262, "PhotometricInterpretation");
	public static final TagInfo TIFF_TAG_ImageDescription = new TagInfo(270,
			"ImageDescription");
	public static final TagInfo TIFF_TAG_Make = new TagInfo(271, "Make");
	public static final TagInfo TIFF_TAG_Model = new TagInfo(272, "Model");
	public static final TagInfo TIFF_TAG_StripOffsets = new TagInfo(273,
			"StripOffsets");
	//--
	public static final TagInfo TIFF_TAG_Artist = new TagInfo(315, "Artist");
	public static final TagInfo TIFF_TAG_ColorMap = new TagInfo(320, "ColorMap");
	//	public static final Tag TIFF_TAG_DateTime = new Tag(306, "DateTime");
	public static final TagInfo TIFF_TAG_HostComputer = new TagInfo(316,
			"HostComputer");
	public static final TagInfo TIFF_TAG_NewSubfileType = new TagInfo(254,
			"NewSubfileType");
	public static final TagInfo TIFF_TAG_Predictor = new TagInfo(317,
			"Predictor");
	public static final TagInfo TIFF_TAG_PrimaryChromaticities = new TagInfo(
			319, "PrimaryChromaticities");
	public static final TagInfo TIFF_TAG_Software = new TagInfo(305, "Software");
	public static final TagInfo TIFF_TAG_WhitePoint = new TagInfo(318,
			"WhitePoint");
	public static final TagInfo TIFF_TAG_Copyright = new TagInfo(33432,
			"Copyright");
	public static final TagInfo TIFF_TAG_DotRange = new TagInfo(336, "DotRange");
	public static final TagInfo TIFF_TAG_ExtraSamples = new TagInfo(338,
			"ExtraSamples");
	public static final TagInfo TIFF_TAG_HalftoneHints = new TagInfo(321,
			"HalftoneHints");
	public static final TagInfo TIFF_TAG_InkNames = new TagInfo(333, "InkNames");
	public static final TagInfo TIFF_TAG_InkSet = new TagInfo(332, "InkSet");
	public static final TagInfo TIFF_TAG_JPEGACTables = new TagInfo(521,
			"JPEGACTables");
	public static final TagInfo TIFF_TAG_JPEGDCTables = new TagInfo(520,
			"JPEGDCTables");
	public static final TagInfo TIFF_TAG_JPEGInterchangeFormat = new TagInfo(
			513, "JPEGInterchangeFormat");
	public static final TagInfo TIFF_TAG_JPEGInterchangeFormatLength = new TagInfo(
			514, "JPEGInterchangeFormatLength");
	public static final TagInfo TIFF_TAG_JPEGLosslessPredictors = new TagInfo(
			517, "JPEGLosslessPredictors");
	public static final TagInfo TIFF_TAG_JPEGPointTransforms = new TagInfo(518,
			"JPEGPointTransforms");
	public static final TagInfo TIFF_TAG_JPEGProc = new TagInfo(512, "JPEGProc");
	public static final TagInfo TIFF_TAG_JPEGRestartInterval = new TagInfo(515,
			"JPEGRestartInterval");
	public static final TagInfo TIFF_TAG_JPEGQTables = new TagInfo(519,
			"JPEGQTables");
	public static final TagInfo TIFF_TAG_NumberOfInks = new TagInfo(334,
			"NumberOfInks");
	public static final TagInfo TIFF_TAG_ReferenceBlackWhite = new TagInfo(532,
			"ReferenceBlackWhite");
	public static final TagInfo TIFF_TAG_SampleFormat = new TagInfo(339,
			"SampleFormat");
	public static final TagInfo TIFF_TAG_SMinSampleValue = new TagInfo(340,
			"SMinSampleValue");
	public static final TagInfo TIFF_TAG_SMaxSampleValue = new TagInfo(341,
			"SMaxSampleValue");
	public static final TagInfo TIFF_TAG_TargetPrinter = new TagInfo(337,
			"TargetPrinter");
	public static final TagInfo TIFF_TAG_TileLength = new TagInfo(323,
			"TileLength");
	public static final TagInfo TIFF_TAG_TileOffsets = new TagInfo(324,
			"TileOffsets");
	public static final TagInfo TIFF_TAG_TileWidth = new TagInfo(322,
			"TileWidth");
	public static final TagInfo TIFF_TAG_TileByteCounts = new TagInfo(325,
			"TileByteCounts");
	public static final TagInfo TIFF_TAG_TransferRange = new TagInfo(342,
			"TransferRange");
	public static final TagInfo TIFF_TAG_YCbCrCoefficients = new TagInfo(529,
			"YCbCrCoefficients");
	public static final TagInfo TIFF_TAG_YCbCrPositioning = new TagInfo(531,
			"YCbCrPositioning");
	public static final TagInfo TIFF_TAG_YCbCrSubSampling = new TagInfo(530,
			"YCbCrSubSampling");
	//	--
	public static final TagInfo TIFF_TAG_RowsPerStrip = new TagInfo(278,
			"RowsPerStrip");
	public static final TagInfo TIFF_TAG_StripByteCounts = new TagInfo(279,
			"StripByteCounts");
	public static final TagInfo TIFF_TAG_XResolution = new TagInfo(282,
			"XResolution");
	public static final TagInfo TIFF_TAG_YResolution = new TagInfo(283,
			"YResolution");
	public static final TagInfo TIFF_TAG_ResolutionUnit = new TagInfo(296,
			"ResolutionUnit");
	public static final TagInfo TIFF_TAG_SamplesPerPixel = new TagInfo(277,
			"SamplesPerPixel");
	public static final TagInfo TIFF_TAG_Orientation = new TagInfo(274,
			"Orientation");
	public static final TagInfo TIFF_TAG_PlanarConfiguration = new TagInfo(284,
			"PlanarConfiguration");
	public static final TagInfo TIFF_TAG_CFARepeatPatternDim = new TagInfo(
			37341, "CFARepeatPatternDim");
	public static final TagInfo TIFF_TAG_CFAPattern = new TagInfo(37342,
			"CFAPattern");
	public static final TagInfo TIFF_TAG_DateTimeOriginal = new TagInfo(36867,
			"DateTimeOriginal", true);
	public static final TagInfo TIFF_TAG_TIFF_EPStandardID = new TagInfo(37398,
			"TIFF/EPStandardID");
	public static final TagInfo TIFF_TAG_SensingMethod = new TagInfo(37399,
			"SensingMethod");
	//	public static final Tag TIFF_TAG_ExifIFD = new Tag(34665, "ExifIFD");
	public static final TagInfo TIFF_TAG_ExifVersion = new TagInfo(36864,
			"ExifVersion");
	public static final TagInfo TIFF_TAG_FlashpixVersion = new TagInfo(40960,
			"FlashpixVersion");
	public static final TagInfo TIFF_TAG_ColorSpace = new TagInfo(40961,
			"ColorSpace");
	public static final TagInfo TIFF_TAG_GeoKeyDirectoryTag = new TagInfo(
			34735, "GeoKeyDirectoryTag");
	public static final TagInfo TIFF_TAG_FillOrder = new TagInfo(266,
			"FillOrder");
	//	public static final Tag TIFF_TAG_Group3Options = new Tag(292, "Group3Options");
	//	public static final Tag TIFF_TAG_Group4Options = new Tag(293, "Group4Options");
	public static final TagInfo TIFF_TAG_PageNumber = new TagInfo(297,
			"PageNumber");
	//--
	//	public static final Tag TIFF_TAG_GPSInfoIFDPointer = new Tag(34853,
	//			"GPSInfoIFDPointer");
	public static final TagInfo TIFF_TAG_EXIF_SubjectDistance = new TagInfo(
			0x692, "SubjectDistance");
	//--

	//	public static final Tag TIFF_TAG_ImageWidth = new Tag(256, "ImageWidth");
	//	public static final Tag TIFF_TAG_ImageLength = new Tag(257, "ImageLength");
	//	public static final Tag TIFF_TAG_BitsPerSample = new Tag(258 =");
	//	public static final Tag TIFF_TAG_Compression = new Tag(259, "Compression");
	//	public static final Tag TIFF_TAG_PhotometricInterpretation = new Tag(262, "PhotometricInterpretation");
	//	public static final Tag TIFF_TAG_Orientation = new Tag(274, "Orientation");
	//	public static final Tag TIFF_TAG_SamplesPerPixel = new Tag(277, "SamplesPerPixel");
	//	public static final Tag TIFF_TAG_PlanarConfiguration = new Tag(284, "PlanarConfiguration");
	//	public static final Tag TIFF_TAG_YCbCrSubSampling = new Tag(530, "YCbCrSubSampling");
	//	public static final Tag TIFF_TAG_YCbCrPositioning = new Tag(531, "YCbCrPositioning");
	//	public static final Tag TIFF_TAG_XResolution = new Tag(282, "XResolution");
	//	public static final Tag TIFF_TAG_YResolution = new Tag(283, "YResolution");
	//	public static final Tag TIFF_TAG_ResolutionUnit = new Tag(296, "ResolutionUnit");
	//	public static final Tag TIFF_TAG_StripOffsets = new Tag(273, "StripOffsets");
	//	public static final Tag TIFF_TAG_RowsPerStrip = new Tag(278, "RowsPerStrip");
	//	public static final Tag TIFF_TAG_StripByteCounts = new Tag(279, "StripByteCounts");
	//	public static final Tag TIFF_TAG_JPEGInterchangeFormat = new Tag(513, "JPEGInterchangeFormat");
	//	public static final Tag TIFF_TAG_JPEGInterchangeFormatLength = new Tag(514, "JPEGInterchangeFormatLength");
	public static final TagInfo TIFF_TAG_TransferFunction = new TagInfo(301,
			"TransferFunction");
	//	public static final Tag TIFF_TAG_WhitePoint = new Tag(318, "WhitePoint");
	//	public static final Tag TIFF_TAG_PrimaryChromaticities = new Tag(319, "PrimaryChromaticities");
	//	public static final Tag TIFF_TAG_YCbCrCoefficients = new Tag(529, "YCbCrCoefficients");
	//	public static final Tag TIFF_TAG_ReferenceBlackWhite = new Tag(532, "ReferenceBlackWhite");
	//	public static final Tag TIFF_TAG_DateTime = new Tag(306, "DateTime");
	//	public static final Tag TIFF_TAG_ImageDescription = new Tag(270, "ImageDescription");
	//	public static final Tag TIFF_TAG_Make = new Tag(271, "Make");
	//	public static final Tag TIFF_TAG_Model = new Tag(272, "Model");
	//	public static final Tag TIFF_TAG_Software = new Tag(305, "Software");
	//	public static final Tag TIFF_TAG_Artist = new Tag(315, "Artist");
	//	public static final Tag TIFF_TAG_Copyright = new Tag(33432 =");
	//	public static final Tag TIFF_TAG_ExifVersion = new Tag(36864, "ExifVersion");
	//	public static final Tag TIFF_TAG_FlashpixVersion = new Tag(40960, "FlashpixVersion");
	//	public static final Tag TIFF_TAG_ColorSpace = new Tag(40961, "ColorSpace");
	public static final TagInfo TIFF_TAG_ComponentsConfiguration = new TagInfo(
			37121, "ComponentsConfiguration");
	public static final TagInfo TIFF_TAG_CompressedBitsPerPixel = new TagInfo(
			37122, "CompressedBitsPerPixel");
	public static final TagInfo TIFF_TAG_PixelXDimension = new TagInfo(40962,
			"PixelXDimension");
	public static final TagInfo TIFF_TAG_PixelYDimension = new TagInfo(40963,
			"PixelYDimension");
	public static final TagInfo TIFF_TAG_MakerNote = new TagInfo(37500,
			"MakerNote");
	public static final TagInfo TIFF_TAG_UserComment = new TagInfo(37510,
			"UserComment");
	public static final TagInfo TIFF_TAG_RelatedSoundFile = new TagInfo(40964,
			"RelatedSoundFile");
	//	public static final Tag TIFF_TAG_DateTimeOriginal = new Tag(36867, "DateTimeOriginal");
	public static final TagInfo TIFF_TAG_DateTimeDigitized = new TagInfo(36868,
			"DateTimeDigitized ", true);
	public static final TagInfo TIFF_TAG_SubSecTime = new TagInfo(37520,
			"SubSecTime");
	public static final TagInfo TIFF_TAG_SubSecTimeOriginal = new TagInfo(
			37521, "SubSecTimeOriginal");
	public static final TagInfo TIFF_TAG_SubSecTimeDigitized = new TagInfo(
			37522, "SubSecTimeDigitized");
	public static final TagInfo TIFF_TAG_ImageUniqueID = new TagInfo(42016,
			"ImageUniqueID");
	public static final TagInfo TIFF_TAG_ExposureTime = new TagInfo(33434,
			"ExposureTime");
	public static final TagInfo TIFF_TAG_FNumber = new TagInfo(33437, "FNumber");
	public static final TagInfo TIFF_TAG_ExposureProgram = new TagInfo(34850,
			"ExposureProgram");
	public static final TagInfo TIFF_TAG_SpectralSensitivity = new TagInfo(
			34852, "SpectralSensitivity");
	public static final TagInfo TIFF_TAG_ISOSpeedRatings = new TagInfo(34855,
			"ISOSpeedRatings");
	public static final TagInfo TIFF_TAG_OECF = new TagInfo(34856, "OECF");
	public static final TagInfo TIFF_TAG_ShutterSpeedValue = new TagInfo(37377,
			"ShutterSpeedValue");
	public static final TagInfo TIFF_TAG_ApertureValue = new TagInfo(37378,
			"ApertureValue");
	public static final TagInfo TIFF_TAG_BrightnessValue = new TagInfo(37379,
			"BrightnessValue");
	//	public static final Tag TIFF_TAG_ExposureBiasValue = new Tag(37380, "ExposureBiasValue");
	public static final TagInfo TIFF_TAG_MaxApertureValue = new TagInfo(37381,
			"MaxApertureValue");
	public static final TagInfo TIFF_TAG_SubjectDistance = new TagInfo(37382,
			"SubjectDistance");
	public static final TagInfo TIFF_TAG_MeteringMode = new TagInfo(37383,
			"MeteringMode");
	public static final TagInfo TIFF_TAG_LightSource = new TagInfo(37384,
			"LightSource");
	public static final TagInfo TIFF_TAG_Flash = new TagInfo(37385, "Flash");
	public static final TagInfo TIFF_TAG_FocalLength = new TagInfo(37386,
			"FocalLength");
	public static final TagInfo TIFF_TAG_SubjectArea = new TagInfo(37396,
			"SubjectArea");
	public static final TagInfo TIFF_TAG_FlashEnergy = new TagInfo(41483,
			"FlashEnergy");
	public static final TagInfo TIFF_TAG_SpatialFrequencyResponse = new TagInfo(
			41484, "SpatialFrequencyResponse");
	public static final TagInfo TIFF_TAG_FocalPlaneXResolution = new TagInfo(
			41486, "FocalPlaneXResolution");
	public static final TagInfo TIFF_TAG_FocalPlaneYResolution = new TagInfo(
			41487, "FocalPlaneYResolution");
	public static final TagInfo TIFF_TAG_FocalPlaneResolutionUnit = new TagInfo(
			41488, "FocalPlaneResolutionUnit");
	public static final TagInfo TIFF_TAG_SubjectLocation = new TagInfo(41492,
			"SubjectLocation");
	public static final TagInfo TIFF_TAG_ExposureIndex = new TagInfo(41493,
			"ExposureIndex");
	//	public static final Tag TIFF_TAG_SensingMethod = new Tag(41495, "SensingMethod");
	public static final TagInfo TIFF_TAG_FileSource = new TagInfo(41728,
			"FileSource");
	public static final TagInfo TIFF_TAG_SceneType = new TagInfo(41729,
			"SceneType");
	//	public static final Tag TIFF_TAG_CFAPattern = new Tag(41730, "CFAPattern");
	public static final TagInfo TIFF_TAG_CustomRendered = new TagInfo(41985,
			"CustomRendered");
	public static final TagInfo TIFF_TAG_ExposureMode = new TagInfo(41986,
			"ExposureMode");
	public static final TagInfo TIFF_TAG_WhiteBalance = new TagInfo(41987,
			"WhiteBalance");
	public static final TagInfo TIFF_TAG_DigitalZoomRatio = new TagInfo(41988,
			"DigitalZoomRatio");
	public static final TagInfo TIFF_TAG_FocalLengthIn35mmFilm = new TagInfo(
			41989, "FocalLengthIn35mmFilm");
	public static final TagInfo TIFF_TAG_SceneCaptureType = new TagInfo(41990,
			"SceneCaptureType");
	public static final TagInfo TIFF_TAG_GainControl = new TagInfo(41991,
			"GainControl");
	public static final TagInfo TIFF_TAG_Contrast = new TagInfo(41992,
			"Contrast");
	public static final TagInfo TIFF_TAG_Saturation = new TagInfo(41993,
			"Saturation");
	public static final TagInfo TIFF_TAG_Sharpness = new TagInfo(41994,
			"Sharpness");
	public static final TagInfo TIFF_TAG_DeviceSettingDescription = new TagInfo(
			41995, "DeviceSettingDescription");
	public static final TagInfo TIFF_TAG_SubjectDistanceRange = new TagInfo(
			41996, "SubjectDistanceRange");
	//	public static final Tag TIFF_TAG_BitsPerSample = new Tag(258, "BitsPerSample");
	//	public static final Tag TIFF_TAG_Copyright = new Tag(33432, "Copyright");
	public static final TagInfo TIFF_TAG_Exif_IFD_Pointer = new TagInfo(34665,
			"Exif_IFD_Pointer");
	public static final TagInfo TIFF_TAG_GPSInfo_IFD_Pointer = new TagInfo(
			34853, "GPSInfo_IFD_Pointer");
	public static final TagInfo TIFF_TAG_ExposureBiasValue = new TagInfo(37380,
			"ExposureBiasValue");
	public static final TagInfo TIFF_TAG_Interoperability_IFD_Pointer = new TagInfo(
			40965, "Interoperability_IFD_Pointer");

	public static final TagInfo TIFF_TAG_GPSVersionID = new TagInfo(0,
			"GPSVersionID");
	public static final TagInfo TIFF_TAG_GPSLatitudeRef = new TagInfo(1,
			"GPSLatitudeRef");
	public static final TagInfo TIFF_TAG_GPSLatitude = new TagInfo(2,
			"GPSLatitude");
	public static final TagInfo TIFF_TAG_GPSLongitudeRef = new TagInfo(3,
			"GPSLongitudeRef");
	public static final TagInfo TIFF_TAG_GPSLongitude = new TagInfo(4,
			"GPSLongitude");
	public static final TagInfo TIFF_TAG_GPSAltitudeRef = new TagInfo(5,
			"GPSAltitudeRef");
	public static final TagInfo TIFF_TAG_GPSAltitude = new TagInfo(6,
			"GPSAltitude");
	public static final TagInfo TIFF_TAG_GPSTimeStamp = new TagInfo(7,
			"GPSTimeStamp");
	public static final TagInfo TIFF_TAG_GPSSatellites = new TagInfo(8,
			"GPSSatellites");
	public static final TagInfo TIFF_TAG_GPSStatus = new TagInfo(9, "GPSStatus");
	public static final TagInfo TIFF_TAG_GPSMeasureMode = new TagInfo(10,
			"GPSMeasureMode");
	public static final TagInfo TIFF_TAG_GPSDOP = new TagInfo(11, "GPSDOP");
	public static final TagInfo TIFF_TAG_GPSSpeedRef = new TagInfo(12,
			"GPSSpeedRef");
	public static final TagInfo TIFF_TAG_GPSSpeed = new TagInfo(13, "GPSSpeed");
	public static final TagInfo TIFF_TAG_GPSTrackRef = new TagInfo(14,
			"GPSTrackRef");
	public static final TagInfo TIFF_TAG_GPSTrack = new TagInfo(15, "GPSTrack");
	public static final TagInfo TIFF_TAG_GPSImgDirectionRef = new TagInfo(16,
			"GPSImgDirectionRef");
	public static final TagInfo TIFF_TAG_GPSImgDirection = new TagInfo(17,
			"GPSImgDirection");
	public static final TagInfo TIFF_TAG_GPSMapDatum = new TagInfo(18,
			"GPSMapDatum");
	public static final TagInfo TIFF_TAG_GPSDestLatitudeRef = new TagInfo(19,
			"GPSDestLatitudeRef");
	public static final TagInfo TIFF_TAG_GPSDestLatitude = new TagInfo(20,
			"GPSDestLatitude");
	public static final TagInfo TIFF_TAG_GPSDestLongitudeRef = new TagInfo(21,
			"GPSDestLongitudeRef");
	public static final TagInfo TIFF_TAG_GPSDestLongitude = new TagInfo(22,
			"GPSDestLongitude");
	public static final TagInfo TIFF_TAG_GPSDestBearingRef = new TagInfo(23,
			"GPSDestBearingRef");
	public static final TagInfo TIFF_TAG_GPSDestBearing = new TagInfo(24,
			"GPSDestBearing");
	public static final TagInfo TIFF_TAG_GPSDestDistanceRef = new TagInfo(25,
			"GPSDestDistanceRef");
	public static final TagInfo TIFF_TAG_GPSDestDistance = new TagInfo(26,
			"GPSDestDistance");
	public static final TagInfo TIFF_TAG_GPSProcessingMethod = new TagInfo(27,
			"GPSProcessingMethod");
	public static final TagInfo TIFF_TAG_GPSAreaInformation = new TagInfo(28,
			"GPSAreaInformation");
	public static final TagInfo TIFF_TAG_GPSDateStamp = new TagInfo(29,
			"GPSDateStamp");
	public static final TagInfo TIFF_TAG_GPSDifferential = new TagInfo(30,
			"GPSDifferential");

	//	public static final Tag TIFF_TAG_ = new Tag(, "Unknown");
	//--
	public static final TagInfo TIFF_TAG_Unknown = new TagInfo(-1, "Unknown");

	public static final TagInfo TIFF_TAGS[] = {
			TIFF_TAG_SubfileType,
			TIFF_TAG_Threshholding,
			TIFF_TAG_CellWidth,
			TIFF_TAG_CellLength,
			TIFF_TAG_DocumentName,
			TIFF_TAG_MinSampleValue,
			TIFF_TAG_MaxSampleValue,
			TIFF_TAG_PageName,
			TIFF_TAG_XPosition,
			TIFF_TAG_YPosition,
			TIFF_TAG_GrayResponseUnit,
			TIFF_TAG_GrayResponseCurve,
			TIFF_TAG_T4Options,
			TIFF_TAG_T6Options,
			TIFF_TAG_FreeByteCounts,
			TIFF_TAG_FreeOffsets,
			TIFF_TAG_ImageWidth,
			TIFF_TAG_ImageLength,
			TIFF_TAG_DateTime,
			TIFF_TAG_BitsPerSample,
			TIFF_TAG_Compression,
			TIFF_TAG_PhotometricInterpretation,
			TIFF_TAG_ImageDescription,
			TIFF_TAG_Make,
			TIFF_TAG_Model,
			TIFF_TAG_StripOffsets,
			TIFF_TAG_Artist,
			TIFF_TAG_ColorMap,
			TIFF_TAG_HostComputer,
			TIFF_TAG_NewSubfileType,
			TIFF_TAG_Predictor,
			TIFF_TAG_PrimaryChromaticities,
			TIFF_TAG_Software,
			TIFF_TAG_WhitePoint,
			TIFF_TAG_Copyright,
			TIFF_TAG_DotRange,
			TIFF_TAG_ExtraSamples,
			TIFF_TAG_HalftoneHints,
			TIFF_TAG_InkNames,
			TIFF_TAG_InkSet,
			TIFF_TAG_JPEGACTables,
			TIFF_TAG_JPEGDCTables,
			TIFF_TAG_JPEGInterchangeFormat,
			TIFF_TAG_JPEGInterchangeFormatLength,
			TIFF_TAG_JPEGLosslessPredictors,
			TIFF_TAG_JPEGPointTransforms,
			TIFF_TAG_JPEGProc,
			TIFF_TAG_JPEGRestartInterval,
			TIFF_TAG_JPEGQTables,
			TIFF_TAG_NumberOfInks,
			TIFF_TAG_ReferenceBlackWhite,
			TIFF_TAG_SampleFormat,
			TIFF_TAG_SMinSampleValue,
			TIFF_TAG_SMaxSampleValue,
			TIFF_TAG_TargetPrinter,
			TIFF_TAG_TileLength,
			TIFF_TAG_TileOffsets,
			TIFF_TAG_TileWidth,
			TIFF_TAG_TileByteCounts,
			TIFF_TAG_TransferRange,
			TIFF_TAG_YCbCrCoefficients,
			TIFF_TAG_YCbCrPositioning,
			TIFF_TAG_YCbCrSubSampling,
			TIFF_TAG_RowsPerStrip,
			TIFF_TAG_StripByteCounts,
			TIFF_TAG_XResolution,
			TIFF_TAG_YResolution,
			TIFF_TAG_ResolutionUnit,
			TIFF_TAG_SamplesPerPixel,
			TIFF_TAG_Orientation,
			TIFF_TAG_PlanarConfiguration,
			TIFF_TAG_CFARepeatPatternDim,
			TIFF_TAG_CFAPattern,
			TIFF_TAG_DateTimeOriginal,
			TIFF_TAG_TIFF_EPStandardID,
			TIFF_TAG_SensingMethod,
			//			TIFF_TAG_ExifIFD,
			TIFF_TAG_ExifVersion,
			TIFF_TAG_FlashpixVersion,
			TIFF_TAG_ColorSpace,
			TIFF_TAG_GeoKeyDirectoryTag,
			TIFF_TAG_FillOrder,
			//			TIFF_TAG_Group3Options,
			//			TIFF_TAG_Group4Options,
			TIFF_TAG_PageNumber,
			//			TIFF_TAG_GPSInfoIFDPointer,
			TIFF_TAG_SubjectDistance, TIFF_TAG_TransferFunction,
			TIFF_TAG_ComponentsConfiguration, TIFF_TAG_CompressedBitsPerPixel,
			TIFF_TAG_PixelXDimension, TIFF_TAG_PixelYDimension,
			TIFF_TAG_MakerNote, TIFF_TAG_UserComment,
			TIFF_TAG_RelatedSoundFile, TIFF_TAG_DateTimeDigitized,
			TIFF_TAG_SubSecTime, TIFF_TAG_SubSecTimeOriginal,
			TIFF_TAG_SubSecTimeDigitized, TIFF_TAG_ImageUniqueID,
			TIFF_TAG_ExposureTime, TIFF_TAG_FNumber, TIFF_TAG_ExposureProgram,
			TIFF_TAG_SpectralSensitivity, TIFF_TAG_ISOSpeedRatings,
			TIFF_TAG_OECF, TIFF_TAG_ShutterSpeedValue, TIFF_TAG_ApertureValue,
			TIFF_TAG_BrightnessValue, TIFF_TAG_MaxApertureValue,
			TIFF_TAG_MeteringMode, TIFF_TAG_LightSource, TIFF_TAG_Flash,
			TIFF_TAG_FocalLength, TIFF_TAG_SubjectArea, TIFF_TAG_FlashEnergy,
			TIFF_TAG_SpatialFrequencyResponse, TIFF_TAG_FocalPlaneXResolution,
			TIFF_TAG_FocalPlaneYResolution, TIFF_TAG_FocalPlaneResolutionUnit,
			TIFF_TAG_SubjectLocation, TIFF_TAG_ExposureIndex,
			TIFF_TAG_FileSource, TIFF_TAG_SceneType, TIFF_TAG_CustomRendered,
			TIFF_TAG_ExposureMode, TIFF_TAG_WhiteBalance,
			TIFF_TAG_DigitalZoomRatio, TIFF_TAG_FocalLengthIn35mmFilm,
			TIFF_TAG_SceneCaptureType, TIFF_TAG_GainControl, TIFF_TAG_Contrast,
			TIFF_TAG_Saturation, TIFF_TAG_Sharpness,
			TIFF_TAG_DeviceSettingDescription, TIFF_TAG_SubjectDistanceRange,
			TIFF_TAG_Exif_IFD_Pointer, TIFF_TAG_GPSInfo_IFD_Pointer,
			TIFF_TAG_ExposureBiasValue, TIFF_TAG_Interoperability_IFD_Pointer,
			TIFF_TAG_GPSVersionID, TIFF_TAG_GPSLatitudeRef,
			TIFF_TAG_GPSLatitude, TIFF_TAG_GPSLongitudeRef,
			TIFF_TAG_GPSLongitude, TIFF_TAG_GPSAltitudeRef,
			TIFF_TAG_GPSAltitude, TIFF_TAG_GPSTimeStamp,
			TIFF_TAG_GPSSatellites, TIFF_TAG_GPSStatus,
			TIFF_TAG_GPSMeasureMode, TIFF_TAG_GPSDOP, TIFF_TAG_GPSSpeedRef,
			TIFF_TAG_GPSSpeed, TIFF_TAG_GPSTrackRef, TIFF_TAG_GPSTrack,
			TIFF_TAG_GPSImgDirectionRef, TIFF_TAG_GPSImgDirection,
			TIFF_TAG_GPSMapDatum, TIFF_TAG_GPSDestLatitudeRef,
			TIFF_TAG_GPSDestLatitude, TIFF_TAG_GPSDestLongitudeRef,
			TIFF_TAG_GPSDestLongitude, TIFF_TAG_GPSDestBearingRef,
			TIFF_TAG_GPSDestBearing, TIFF_TAG_GPSDestDistanceRef,
			TIFF_TAG_GPSDestDistance, TIFF_TAG_GPSProcessingMethod,
			TIFF_TAG_GPSAreaInformation, TIFF_TAG_GPSDateStamp,
			TIFF_TAG_GPSDifferential,

			TIFF_TAG_EXIF_SubjectDistance,

	};

	public static final FieldTypeByte FIELD_TYPE_BYTE = new FieldTypeByte(1,
			"Byte");

	public static final FieldTypeASCII FIELD_TYPE_ASCII = new FieldTypeASCII(2,
			"ASCII");

	public static final FieldTypeShort FIELD_TYPE_SHORT = new FieldTypeShort(3,
			"Short");

	public static final FieldTypeLong FIELD_TYPE_LONG = new FieldTypeLong(4,
			"Long");

	public static final FieldTypeRational FIELD_TYPE_RATIONAL = new FieldTypeRational(
			5, "Rational");

	public static final FieldType FIELD_TYPE_SBYTE = new FieldTypeByte(6,
			"SByte");
	public static final FieldType FIELD_TYPE_UNDEFINED = new FieldTypeByte(7,
			"Undefined");
	public static final FieldType FIELD_TYPE_SSHORT = new FieldTypeShort(8,
			"SShort");

	public static final FieldType FIELD_TYPE_SLONG = new FieldTypeLong(9,
			"SLong");

	public static final FieldType FIELD_TYPE_SRATIONAL = new FieldTypeRational(
			10, "SRational");

	public static final FieldType FIELD_TYPE_FLOAT = new FieldTypeFloat();

	public static final FieldType FIELD_TYPE_DOUBLE = new FieldTypeDouble();

	public static final FieldType FIELD_TYPE_UNKNOWN = new FieldTypeUnknown();

	public static final FieldType FIELD_TYPES[] = {
			FIELD_TYPE_BYTE, FIELD_TYPE_ASCII, FIELD_TYPE_SHORT,
			FIELD_TYPE_LONG, FIELD_TYPE_RATIONAL, FIELD_TYPE_SBYTE,
			FIELD_TYPE_UNDEFINED, FIELD_TYPE_SSHORT, FIELD_TYPE_SLONG,
			FIELD_TYPE_SRATIONAL, FIELD_TYPE_FLOAT, FIELD_TYPE_DOUBLE,

	};

}