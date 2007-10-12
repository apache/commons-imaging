package org.apache.sanselan.formats.tiff.debug;

import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;

public class TiffConst1 extends TiffConst
{

	public static final TagInfo2 TAG_INFO_NEW_SUB_FILE_TYPE = new TagInfo2(
			"NewSubfileType", 254, FIELD_TYPE_LONG, 1);
	public static final TagInfo2 TAG_INFO_SUB_FILE_TYPE = new TagInfo2(
			"SubfileType", 255, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_IMAGE_WIDTH = new TagInfo2(
			"ImageWidth", 256, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, 1);
	public static final TagInfo2 TAG_INFO_IMAGE_LENGTH = new TagInfo2(
			"ImageLength", 257, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, 1);
	public static final TagInfo2 TAG_INFO_BITS_PER_SAMPLE = new TagInfo2(
			"BitsPerSample", 258, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_COMPRESSION = new TagInfo2(
			"Compression", 259, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_PHOTOMETRIC_INTERPRETATION = new TagInfo2(
			"PhotometricInterpretation", 262, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_THRESHHOLDING = new TagInfo2(
			"Threshholding", 263, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_CELL_WIDTH = new TagInfo2(
			"CellWidth", 264, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_CELL_LENGTH = new TagInfo2(
			"CellLength", 265, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_FILL_ORDER = new TagInfo2(
			"FillOrder", 266, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_DOCUMENT_NAME = new TagInfo2(
			"DocumentName", 269, FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_IMAGE_DESCRIPTION = new TagInfo2(
			"ImageDescription", 270, FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_MAKE = new TagInfo2("Make", 271,
			FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_MODEL = new TagInfo2("Model", 272,
			FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_STRIP_OFFSETS = new TagInfo2(
			"StripOffsets", 273, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, "StripsPerImage");
	public static final TagInfo2 TAG_INFO_ORIENTATION = new TagInfo2(
			"Orientation", 274, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_SAMPLES_PER_PIXEL = new TagInfo2(
			"SamplesPerPixel", 277, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_ROWS_PER_STRIP = new TagInfo2(
			"RowsPerStrip", 278, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, 1);
	public static final TagInfo2 TAG_INFO_STRIP_BYTE_COUNTS = new TagInfo2(
			"StripByteCounts", 279, new FieldType[]{
					FIELD_TYPE_LONG, FIELD_TYPE_SHORT
			}, "StripsPerImage");
	public static final TagInfo2 TAG_INFO_MIN_SAMPLE_VALUE = new TagInfo2(
			"MinSampleValue", 280, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_MAX_SAMPLE_VALUE = new TagInfo2(
			"MaxSampleValue", 281, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_X_RESOLUTION = new TagInfo2(
			"XResolution", 282, FIELD_TYPE_RATIONAL, 1);
	public static final TagInfo2 TAG_INFO_Y_RESOLUTION = new TagInfo2(
			"YResolution", 283, FIELD_TYPE_RATIONAL, 1);
	public static final TagInfo2 TAG_INFO_PLANAR_CONFIGURATION = new TagInfo2(
			"PlanarConfiguration", 284, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_PAGE_NAME = new TagInfo2("PageName",
			285, FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_X_POSITION = new TagInfo2(
			"XPosition", 286, FIELD_TYPE_RATIONAL);
	public static final TagInfo2 TAG_INFO_Y_POSITION = new TagInfo2(
			"YPosition", 287, FIELD_TYPE_RATIONAL);
	public static final TagInfo2 TAG_INFO_FREE_OFFSETS = new TagInfo2(
			"FreeOffsets", 288, FIELD_TYPE_LONG);
	public static final TagInfo2 TAG_INFO_FREE_BYTE_COUNTS = new TagInfo2(
			"FreeByteCounts", 289, FIELD_TYPE_LONG);
	public static final TagInfo2 TAG_INFO_GRAY_RESPONSE_UNIT = new TagInfo2(
			"GrayResponseUnit", 290, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_GRAY_RESPONSE_CURVE = new TagInfo2(
			"GrayResponseCurve", 291, FIELD_TYPE_SHORT, "2**BitsPerSample");
	public static final TagInfo2 TAG_INFO_T4_OPTIONS = new TagInfo2(
			"T4Options", 292, FIELD_TYPE_LONG, 1);
	public static final TagInfo2 TAG_INFO_T6_OPTIONS = new TagInfo2(
			"T6Options", 293, FIELD_TYPE_LONG, 1);
	public static final TagInfo2 TAG_INFO_RESOLUTION_UNIT = new TagInfo2(
			"ResolutionUnit", 296, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_PAGE_NUMBER = new TagInfo2(
			"PageNumber", 297, FIELD_TYPE_SHORT, 2);
	public static final TagInfo2 TAG_INFO_TRANSFER_FUNCTION = new TagInfo2(
			"TransferFunction", 301, FIELD_TYPE_SHORT,
			"{1 or SamplesPerPixel}* 2** BitsPerSample");
	public static final TagInfo2 TAG_INFO_SOFTWARE = new TagInfo2("Software",
			305, FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_DATE_TIME = new TagInfo2Date(
			"DateTime", 306, FIELD_TYPE_ASCII, 20);
	public static final TagInfo2 TAG_INFO_ARTIST = new TagInfo2("Artist", 315,
			FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_HOST_COMPUTER = new TagInfo2(
			"HostComputer", 316, FIELD_TYPE_ASCII);
	public static final TagInfo2 TAG_INFO_PREDICTOR = new TagInfo2("Predictor",
			317, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_WHITE_POINT = new TagInfo2(
			"WhitePoint", 318, FIELD_TYPE_RATIONAL, 2);
	public static final TagInfo2 TAG_INFO_PRIMARY_CHROMATICITIES = new TagInfo2(
			"PrimaryChromaticities", 319, FIELD_TYPE_RATIONAL, 6);
	public static final TagInfo2 TAG_INFO_COLOR_MAP = new TagInfo2("ColorMap",
			320, FIELD_TYPE_SHORT, "3 * (2**BitsPerSample)");
	public static final TagInfo2 TAG_INFO_HALFTONE_HINTS = new TagInfo2(
			"HalftoneHints", 321, FIELD_TYPE_SHORT, 2);
	public static final TagInfo2 TAG_INFO_TILE_WIDTH = new TagInfo2(
			"TileWidth", 322, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, 1);
	public static final TagInfo2 TAG_INFO_TILE_LENGTH = new TagInfo2(
			"TileLength", 323, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, 1);
	public static final TagInfo2 TAG_INFO_TILE_OFFSETS = new TagInfo2(
			"TileOffsets", 324, FIELD_TYPE_LONG, "TilesPerImage");
	public static final TagInfo2 TAG_INFO_TILE_BYTE_COUNTS = new TagInfo2(
			"TileByteCounts", 325, new FieldType[]{
					FIELD_TYPE_SHORT, FIELD_TYPE_LONG
			}, "TilesPerImage");
	public static final TagInfo2 TAG_INFO_INK_SET = new TagInfo2("InkSet", 332,
			FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_INK_NAMES = new TagInfo2("InkNames",
			333, FIELD_TYPE_ASCII,
			"total number of characters in all ink name strings, including zeros");
	public static final TagInfo2 TAG_INFO_NUMBER_OF_INKS = new TagInfo2(
			"NumberOfInks", 334, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_DOT_RANGE = new TagInfo2("DotRange",
			336, new FieldType[]{
					FIELD_TYPE_BYTE, FIELD_TYPE_SHORT
			}, "2, or 2* NumberOfInks");
	public static final TagInfo2 TAG_INFO_TARGET_PRINTER = new TagInfo2(
			"TargetPrinter", 337, FIELD_TYPE_ASCII, "any");
	public static final TagInfo2 TAG_INFO_EXTRA_SAMPLES = new TagInfo2(
			"ExtraSamples", 338, FIELD_TYPE_BYTE,
			"number of extra components per pixel");
	public static final TagInfo2 TAG_INFO_SAMPLE_FORMAT = new TagInfo2(
			"SampleFormat", 339, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_S_MIN_SAMPLE_VALUE = new TagInfo2(
			"SMinSampleValue", 340, FIELD_TYPE_ANY, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_S_MAX_SAMPLE_VALUE = new TagInfo2(
			"SMaxSampleValue", 341, FIELD_TYPE_ANY, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_TRANSFER_RANGE = new TagInfo2(
			"TransferRange", 342, FIELD_TYPE_SHORT, 6);
	public static final TagInfo2 TAG_INFO_JPEG_PROC = new TagInfo2("JPEGProc",
			512, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_JPEG_INTERCHANGE_FORMAT = new TagInfo2(
			"JPEGInterchangeFormat", 513, FIELD_TYPE_LONG, 1);
	public static final TagInfo2 TAG_INFO_JPEG_INTERCHANGE_FORMAT_LENGTH = new TagInfo2(
			"JPEGInterchangeFormatLength", 514, FIELD_TYPE_LONG, 1);
	public static final TagInfo2 TAG_INFO_JPEG_RESTART_INTERVAL = new TagInfo2(
			"JPEGRestartInterval", 515, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_JPEG_LOSSLESS_PREDICTORS = new TagInfo2(
			"JPEGLosslessPredictors", 517, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_JPEG_POINT_TRANSFORMS = new TagInfo2(
			"JPEGPointTransforms", 518, FIELD_TYPE_SHORT, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_JPEG_Q_TABLES = new TagInfo2(
			"JPEGQTables", 519, FIELD_TYPE_LONG, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_JPEG_DC_TABLES = new TagInfo2(
			"JPEGDCTables", 520, FIELD_TYPE_LONG, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_JPEG_AC_TABLES = new TagInfo2(
			"JPEGACTables", 521, FIELD_TYPE_LONG, "SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_YCBCR_COEFFICIENTS = new TagInfo2(
			"YCbCrCoefficients", 529, FIELD_TYPE_RATIONAL, 3);
	public static final TagInfo2 TAG_INFO_YCBCR_SUBSAMPLING = new TagInfo2(
			"YCbCrSubSampling", 530, FIELD_TYPE_SHORT, 2);
	public static final TagInfo2 TAG_INFO_YCBCR_POSITIONING = new TagInfo2(
			"YCbCrPositioning", 531, FIELD_TYPE_SHORT, 1);
	public static final TagInfo2 TAG_INFO_REFERENCE_BLACK_WHITE = new TagInfo2(
			"ReferenceBlackWhite", 532, FIELD_TYPE_LONG, "2*SamplesPerPixel");
	public static final TagInfo2 TAG_INFO_COPYRIGHT = new TagInfo2("Copyright",
			33432, FIELD_TYPE_ASCII, "Any");

}

/**/
