//package org.apache.sanselan.formats.tiff.debug;
//
//import org.apache.sanselan.formats.tiff.constants.TagInfo2;
//import org.apache.sanselan.formats.tiff.constants.TiffDirectoryConstants;
//import org.apache.sanselan.formats.tiff.constants.TiffFieldTypeConstants;
//import org.apache.sanselan.formats.tiff.constants.TiffDirectoryConstants.ExifDirectoryType;
//
//public interface TiffConst3
//		extends
//			TiffDirectoryConstants,
//			TiffFieldTypeConstants
//{
//
//	/**/
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTEROP_INDEX = new TagInfo2(
//			"InteropIndex", 0x0001, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_INTEROP_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTEROP_VERSION = new TagInfo2(
//			"InteropVersion", 0x0002, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_INTEROP_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PROCESSING_SOFTWARE = new TagInfo2(
//			"ProcessingSoftware", 0x000b, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUBFILE_TYPE = new TagInfo2(
//			"SubfileType", 0x00fe, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 0;
//	public static final int SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 1;
//	public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 2;
//	public static final int SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_REDUCED_RESOLUTION_IMAGE = 3;
//	public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK = 4;
//	public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_IMAGE = 5;
//	public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_MULTI_PAGE_IMAGE = 6;
//	public static final int SUBFILE_TYPE_VALUE_TRANSPARENCY_MASK_OF_REDUCED_RESOLUTION_MULTI_PAGE_IMAGE = 7;
//
//	public static final TagInfo2 TAG_INFO_EXIF_OLD_SUBFILE_TYPE = new TagInfo2(
//			"OldSubfileType", 0x00ff, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int OLD_SUBFILE_TYPE_VALUE_FULL_RESOLUTION_IMAGE = 1;
//	public static final int OLD_SUBFILE_TYPE_VALUE_REDUCED_RESOLUTION_IMAGE = 2;
//	public static final int OLD_SUBFILE_TYPE_VALUE_SINGLE_PAGE_OF_MULTI_PAGE_IMAGE = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_WIDTH_IFD0 = new TagInfo2(
//			"ImageWidth", 0x0100, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_HEIGHT_IFD0 = new TagInfo2(
//			"ImageHeight", 0x0101, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BITS_PER_SAMPLE = new TagInfo2(
//			"BitsPerSample", 0x0102, FIELD_TYPE_SHORT, -1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COMPRESSION = new TagInfo2(
//			"Compression", 0x0103, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int COMPRESSION_VALUE_UNCOMPRESSED = 1;
//	public static final int COMPRESSION_VALUE_CCITT_1D = 2;
//	public static final int COMPRESSION_VALUE_T4_GROUP_3_FAX = 3;
//	public static final int COMPRESSION_VALUE_T6_GROUP_4_FAX = 4;
//	public static final int COMPRESSION_VALUE_LZW = 5;
//	public static final int COMPRESSION_VALUE_JPEG_OLD_STYLE = 6;
//	public static final int COMPRESSION_VALUE_JPEG = 7;
//	public static final int COMPRESSION_VALUE_ADOBE_DEFLATE = 8;
//	public static final int COMPRESSION_VALUE_JBIG_B_AND_W = 9;
//	public static final int COMPRESSION_VALUE_JBIG_COLOR = 10;
//	public static final int COMPRESSION_VALUE_NEXT = 32766;
//	public static final int COMPRESSION_VALUE_EPSON_ERF_COMPRESSED = 32769;
//	public static final int COMPRESSION_VALUE_CCIRLEW = 32771;
//	public static final int COMPRESSION_VALUE_PACK_BITS = 32773;
//	public static final int COMPRESSION_VALUE_THUNDERSCAN = 32809;
//	public static final int COMPRESSION_VALUE_IT8CTPAD = 32895;
//	public static final int COMPRESSION_VALUE_IT8LW = 32896;
//	public static final int COMPRESSION_VALUE_IT8MP = 32897;
//	public static final int COMPRESSION_VALUE_IT8BL = 32898;
//	public static final int COMPRESSION_VALUE_PIXAR_FILM = 32908;
//	public static final int COMPRESSION_VALUE_PIXAR_LOG = 32909;
//	public static final int COMPRESSION_VALUE_DEFLATE = 32946;
//	public static final int COMPRESSION_VALUE_DCS = 32947;
//	public static final int COMPRESSION_VALUE_JBIG = 34661;
//	public static final int COMPRESSION_VALUE_SGILOG = 34676;
//	public static final int COMPRESSION_VALUE_SGILOG_24 = 34677;
//	public static final int COMPRESSION_VALUE_JPEG_2000 = 34712;
//	public static final int COMPRESSION_VALUE_NIKON_NEF_COMPRESSED = 34713;
//	public static final int COMPRESSION_VALUE_KODAK_DCR_COMPRESSED = 65000;
//	public static final int COMPRESSION_VALUE_PENTAX_PEF_COMPRESSED = 65535;
//
//	public static final TagInfo2 TAG_INFO_EXIF_PHOTOMETRIC_INTERPRETATION = new TagInfo2(
//			"PhotometricInterpretation", 0x0106, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_WHITE_IS_ZERO = 0;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_BLACK_IS_ZERO = 1;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB = 2;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_RGB_PALETTE = 3;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_TRANSPARENCY_MASK = 4;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CMYK = 5;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_YCB_CR = 6;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_CIELAB = 8;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ICCLAB = 9;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_ITULAB = 10;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_COLOR_FILTER_ARRAY = 32803;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_L = 32844;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_PIXAR_LOG_LUV = 32845;
//	public static final int PHOTOMETRIC_INTERPRETATION_VALUE_LINEAR_RAW = 34892;
//
//	public static final TagInfo2 TAG_INFO_EXIF_THRESHOLDING = new TagInfo2(
//			"Thresholding", 0x0107, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int THRESHOLDING_VALUE_NO_DITHERING_OR_HALFTONING = 1;
//	public static final int THRESHOLDING_VALUE_ORDERED_DITHER_OR_HALFTONE = 2;
//	public static final int THRESHOLDING_VALUE_RANDOMIZED_DITHER = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CELL_WIDTH = new TagInfo2(
//			"CellWidth", 0x0108, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CELL_LENGTH = new TagInfo2(
//			"CellLength", 0x0109, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FILL_ORDER = new TagInfo2(
//			"FillOrder", 0x010a, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int FILL_ORDER_VALUE_NORMAL = 1;
//	public static final int FILL_ORDER_VALUE_REVERSED = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_DOCUMENT_NAME = new TagInfo2(
//			"DocumentName", 0x010d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_DESCRIPTION = new TagInfo2(
//			"ImageDescription", 0x010e, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MAKE = new TagInfo2("Make",
//			0x010f, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODEL = new TagInfo2("Model",
//			0x0110, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	// poly tag
//	public static final TagInfo2 TAG_INFO_EXIF_STRIP_OFFSETS = new TagInfo2(
//			"StripOffsets", 0x0111,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_START_IFD0 = new TagInfo2(
//			"PreviewImageStart", 0x0111, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_START_SUB_IFD1 = new TagInfo2(
//			"PreviewImageStart", 0x0111, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD1);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_START_SUB_IFD2 = new TagInfo2(
//			"JpgFromRawStart", 0x0111, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD2);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ORIENTATION = new TagInfo2(
//			"Orientation", 0x0112, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int ORIENTATION_VALUE_HORIZONTAL_NORMAL = 1;
//	public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL = 2;
//	public static final int ORIENTATION_VALUE_ROTATE_180 = 3;
//	public static final int ORIENTATION_VALUE_MIRROR_VERTICAL = 4;
//	public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 5;
//	public static final int ORIENTATION_VALUE_ROTATE_90_CW = 6;
//	public static final int ORIENTATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 7;
//	public static final int ORIENTATION_VALUE_ROTATE_270_CW = 8;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SAMPLES_PER_PIXEL = new TagInfo2(
//			"SamplesPerPixel", 0x0115, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ROWS_PER_STRIP = new TagInfo2(
//			"RowsPerStrip", 0x0116, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	// poly tag
//	public static final TagInfo2 TAG_INFO_EXIF_STRIP_BYTE_COUNTS = new TagInfo2(
//			"StripByteCounts", 0x0117,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_LENGTH_IFD0 = new TagInfo2(
//			"PreviewImageLength", 0x0117, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_LENGTH_SUB_IFD1 = new TagInfo2(
//			"PreviewImageLength", 0x0117, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD1);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_LENGTH_SUB_IFD2 = new TagInfo2(
//			"JpgFromRawLength", 0x0117, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD2);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MIN_SAMPLE_VALUE = new TagInfo2(
//			"MinSampleValue", 0x0118, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MAX_SAMPLE_VALUE = new TagInfo2(
//			"MaxSampleValue", 0x0119, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XRESOLUTION = new TagInfo2(
//			"XResolution", 0x011a, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YRESOLUTION = new TagInfo2(
//			"YResolution", 0x011b, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PLANAR_CONFIGURATION = new TagInfo2(
//			"PlanarConfiguration", 0x011c, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int PLANAR_CONFIGURATION_VALUE_CHUNKY = 1;
//	public static final int PLANAR_CONFIGURATION_VALUE_PLANAR = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_PAGE_NAME = new TagInfo2(
//			"PageName", 0x011d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPOSITION = new TagInfo2(
//			"XPosition", 0x011e, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YPOSITION = new TagInfo2(
//			"YPosition", 0x011f, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FREE_OFFSETS = new TagInfo2(
//			"FreeOffsets", 0x0120,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FREE_BYTE_COUNTS = new TagInfo2(
//			"FreeByteCounts", 0x0121,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GRAY_RESPONSE_UNIT = new TagInfo2(
//			"GrayResponseUnit", 0x0122, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int GRAY_RESPONSE_UNIT_VALUE_0_1 = 1;
//	public static final int GRAY_RESPONSE_UNIT_VALUE_0_001 = 2;
//	public static final int GRAY_RESPONSE_UNIT_VALUE_0_0001 = 3;
//	public static final int GRAY_RESPONSE_UNIT_VALUE_1E_05 = 4;
//	public static final int GRAY_RESPONSE_UNIT_VALUE_1E_06 = 5;
//
//	public static final TagInfo2 TAG_INFO_EXIF_GRAY_RESPONSE_CURVE = new TagInfo2(
//			"GrayResponseCurve", 0x0123,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_T4OPTIONS = new TagInfo2(
//			"T4Options", 0x0124,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_T6OPTIONS = new TagInfo2(
//			"T6Options", 0x0125,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RESOLUTION_UNIT = new TagInfo2(
//			"ResolutionUnit", 0x0128, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int RESOLUTION_UNIT_VALUE_NONE = 1;
//	public static final int RESOLUTION_UNIT_VALUE_INCHES = 2;
//	public static final int RESOLUTION_UNIT_VALUE_CM = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_PAGE_NUMBER = new TagInfo2(
//			"PageNumber", 0x0129, FIELD_TYPE_SHORT, 2, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_RESPONSE_UNIT = new TagInfo2(
//			"ColorResponseUnit", 0x012c,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TRANSFER_FUNCTION = new TagInfo2(
//			"TransferFunction", 0x012d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SOFTWARE = new TagInfo2(
//			"Software", 0x0131, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODIFY_DATE = new TagInfo2(
//			"ModifyDate", 0x0132, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ARTIST = new TagInfo2("Artist",
//			0x013b, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_HOST_COMPUTER = new TagInfo2(
//			"HostComputer", 0x013c, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREDICTOR = new TagInfo2(
//			"Predictor", 0x013d, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int PREDICTOR_VALUE_NONE = 1;
//	public static final int PREDICTOR_VALUE_HORIZONTAL_DIFFERENCING = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_WHITE_POINT = new TagInfo2(
//			"WhitePoint", 0x013e, FIELD_TYPE_RATIONAL, 2, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PRIMARY_CHROMATICITIES = new TagInfo2(
//			"PrimaryChromaticities", 0x013f, FIELD_TYPE_RATIONAL, 6,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_MAP = new TagInfo2(
//			"ColorMap", 0x0140,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_HALFTONE_HINTS = new TagInfo2(
//			"HalftoneHints", 0x0141, FIELD_TYPE_SHORT, 2, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TILE_WIDTH = new TagInfo2(
//			"TileWidth", 0x0142, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TILE_LENGTH = new TagInfo2(
//			"TileLength", 0x0143, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TILE_OFFSETS = new TagInfo2(
//			"TileOffsets", 0x0144,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TILE_BYTE_COUNTS = new TagInfo2(
//			"TileByteCounts", 0x0145,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BAD_FAX_LINES = new TagInfo2(
//			"BadFaxLines", 0x0146,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CLEAN_FAX_DATA = new TagInfo2(
//			"CleanFaxData", 0x0147,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
//	public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
//	public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CONSECUTIVE_BAD_FAX_LINES = new TagInfo2(
//			"ConsecutiveBadFaxLines", 0x0148,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUB_IFD = new TagInfo2("SubIFD",
//			0x014a,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INK_SET = new TagInfo2("InkSet",
//			0x014c, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int INK_SET_VALUE_CMYK = 1;
//	public static final int INK_SET_VALUE_NOT_CMYK = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_INK_NAMES = new TagInfo2(
//			"InkNames", 0x014d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_NUMBEROF_INKS = new TagInfo2(
//			"NumberofInks", 0x014e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DOT_RANGE = new TagInfo2(
//			"DotRange", 0x0150, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TARGET_PRINTER = new TagInfo2(
//			"TargetPrinter", 0x0151,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXTRA_SAMPLES = new TagInfo2(
//			"ExtraSamples", 0x0152,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SAMPLE_FORMAT = new TagInfo2(
//			"SampleFormat", 0x0153,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int SAMPLE_FORMAT_VALUE_UNSIGNED_INTEGER = 1;
//	public static final int SAMPLE_FORMAT_VALUE_TWOS_COMPLEMENT_SIGNED_INTEGER = 2;
//	public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT = 3;
//	public static final int SAMPLE_FORMAT_VALUE_UNDEFINED = 4;
//	public static final int SAMPLE_FORMAT_VALUE_COMPLEX_INTEGER = 5;
//	public static final int SAMPLE_FORMAT_VALUE_IEEE_FLOATING_POINT_1 = 6;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SMIN_SAMPLE_VALUE = new TagInfo2(
//			"SMinSampleValue", 0x0154,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SMAX_SAMPLE_VALUE = new TagInfo2(
//			"SMaxSampleValue", 0x0155,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TRANSFER_RANGE = new TagInfo2(
//			"TransferRange", 0x0156,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CLIP_PATH = new TagInfo2(
//			"ClipPath", 0x0157,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XCLIP_PATH_UNITS = new TagInfo2(
//			"XClipPathUnits", 0x0158,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YCLIP_PATH_UNITS = new TagInfo2(
//			"YClipPathUnits", 0x0159,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INDEXED = new TagInfo2(
//			"Indexed", 0x015a,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int INDEXED_VALUE_NOT_INDEXED = 0;
//	public static final int INDEXED_VALUE_INDEXED = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGTABLES = new TagInfo2(
//			"JPEGTables", 0x015b,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OPIPROXY = new TagInfo2(
//			"OPIProxy", 0x015f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_DOES_NOT_EXIST = 0;
//	public static final int OPIPROXY_VALUE_HIGHER_RESOLUTION_IMAGE_EXISTS = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_GLOBAL_PARAMETERS_IFD = new TagInfo2(
//			"GlobalParametersIFD", 0x0190,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PROFILE_TYPE = new TagInfo2(
//			"ProfileType", 0x0191,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int PROFILE_TYPE_VALUE_UNSPECIFIED = 0;
//	public static final int PROFILE_TYPE_VALUE_GROUP_3_FAX = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_FAX_PROFILE = new TagInfo2(
//			"FaxProfile", 0x0192,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int FAX_PROFILE_VALUE_UNKNOWN = 0;
//	public static final int FAX_PROFILE_VALUE_MINIMAL_B_AND_W_LOSSLESS_S = 1;
//	public static final int FAX_PROFILE_VALUE_EXTENDED_B_AND_W_LOSSLESS_F = 2;
//	public static final int FAX_PROFILE_VALUE_LOSSLESS_JBIG_B_AND_W_J = 3;
//	public static final int FAX_PROFILE_VALUE_LOSSY_COLOR_AND_GRAYSCALE_C = 4;
//	public static final int FAX_PROFILE_VALUE_LOSSLESS_COLOR_AND_GRAYSCALE_L = 5;
//	public static final int FAX_PROFILE_VALUE_MIXED_RASTER_CONTENT_M = 6;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CODING_METHODS = new TagInfo2(
//			"CodingMethods", 0x0193,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_VERSION_YEAR = new TagInfo2(
//			"VersionYear", 0x0194,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODE_NUMBER = new TagInfo2(
//			"ModeNumber", 0x0195,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DECODE = new TagInfo2("Decode",
//			0x01b1,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DEFAULT_IMAGE_COLOR = new TagInfo2(
//			"DefaultImageColor", 0x01b2,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGPROC = new TagInfo2(
//			"JPEGProc", 0x0200,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int JPEGPROC_VALUE_BASELINE = 1;
//	public static final int JPEGPROC_VALUE_LOSSLESS = 14;
//
//	// poly tag
//	public static final TagInfo2 TAG_INFO_EXIF_THUMBNAIL_OFFSET = new TagInfo2(
//			"ThumbnailOffset", 0x0201, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD1);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_START_MAKER_NOTES = new TagInfo2(
//			"PreviewImageStart", 0x0201, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_MAKER_NOTES);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_START_SUB_IFD = new TagInfo2(
//			"JpgFromRawStart", 0x0201, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_START_IFD2 = new TagInfo2(
//			"JpgFromRawStart", 0x0201, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD2);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OTHER_IMAGE_START = new TagInfo2(
//			"OtherImageStart", 0x0201,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// poly tag
//	public static final TagInfo2 TAG_INFO_EXIF_THUMBNAIL_LENGTH = new TagInfo2(
//			"ThumbnailLength", 0x0202, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD1);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PREVIEW_IMAGE_LENGTH_MAKER_NOTES = new TagInfo2(
//			"PreviewImageLength", 0x0202, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_MAKER_NOTES);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_LENGTH_SUB_IFD = new TagInfo2(
//			"JpgFromRawLength", 0x0202, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPG_FROM_RAW_LENGTH_IFD2 = new TagInfo2(
//			"JpgFromRawLength", 0x0202, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD2);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OTHER_IMAGE_LENGTH = new TagInfo2(
//			"OtherImageLength", 0x0202,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGRESTART_INTERVAL = new TagInfo2(
//			"JPEGRestartInterval", 0x0203,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGLOSSLESS_PREDICTORS = new TagInfo2(
//			"JPEGLosslessPredictors", 0x0205,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGPOINT_TRANSFORMS = new TagInfo2(
//			"JPEGPointTransforms", 0x0206,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGQTABLES = new TagInfo2(
//			"JPEGQTables", 0x0207,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGDCTABLES = new TagInfo2(
//			"JPEGDCTables", 0x0208,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_JPEGACTABLES = new TagInfo2(
//			"JPEGACTables", 0x0209,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YCB_CR_COEFFICIENTS = new TagInfo2(
//			"YCbCrCoefficients", 0x0211, FIELD_TYPE_RATIONAL, 3,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YCB_CR_SUB_SAMPLING = new TagInfo2(
//			"YCbCrSubSampling", 0x0212, FIELD_TYPE_SHORT, 2,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_YCB_CR_POSITIONING = new TagInfo2(
//			"YCbCrPositioning", 0x0213, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int YCB_CR_POSITIONING_VALUE_CENTERED = 1;
//	public static final int YCB_CR_POSITIONING_VALUE_CO_SITED = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_REFERENCE_BLACK_WHITE = new TagInfo2(
//			"ReferenceBlackWhite", 0x0214, FIELD_TYPE_RATIONAL, 6,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_STRIP_ROW_COUNTS = new TagInfo2(
//			"StripRowCounts", 0x022f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_APPLICATION_NOTES = new TagInfo2(
//			"ApplicationNotes", 0x02bc,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RELATED_IMAGE_FILE_FORMAT = new TagInfo2(
//			"RelatedImageFileFormat", 0x1000, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_INTEROP_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RELATED_IMAGE_WIDTH = new TagInfo2(
//			"RelatedImageWidth", 0x1001, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_INTEROP_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RELATED_IMAGE_LENGTH = new TagInfo2(
//			"RelatedImageLength", 0x1002, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_INTEROP_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RATING = new TagInfo2("Rating",
//			0x4746, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RATING_PERCENT = new TagInfo2(
//			"RatingPercent", 0x4749, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_ID = new TagInfo2(
//			"ImageID", 0x800d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_WANG_ANNOTATION = new TagInfo2(
//			"WangAnnotation", 0x80a4,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MATTEING = new TagInfo2(
//			"Matteing", 0x80e3,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DATA_TYPE = new TagInfo2(
//			"DataType", 0x80e4,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_DEPTH = new TagInfo2(
//			"ImageDepth", 0x80e5,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TILE_DEPTH = new TagInfo2(
//			"TileDepth", 0x80e6,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODEL_2 = new TagInfo2("Model2",
//			0x827d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CFAREPEAT_PATTERN_DIM = new TagInfo2(
//			"CFARepeatPatternDim", 0x828d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CFAPATTERN_2 = new TagInfo2(
//			"CFAPattern2", 0x828e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BATTERY_LEVEL = new TagInfo2(
//			"BatteryLevel", 0x828f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COPYRIGHT = new TagInfo2(
//			"Copyright", 0x8298, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_TIME = new TagInfo2(
//			"ExposureTime", 0x829a, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FNUMBER = new TagInfo2(
//			"FNumber", 0x829d, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDFILE_TAG = new TagInfo2(
//			"MDFileTag", 0x82a5,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDSCALE_PIXEL = new TagInfo2(
//			"MDScalePixel", 0x82a6,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDCOLOR_TABLE = new TagInfo2(
//			"MDColorTable", 0x82a7,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDLAB_NAME = new TagInfo2(
//			"MDLabName", 0x82a8,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDSAMPLE_INFO = new TagInfo2(
//			"MDSampleInfo", 0x82a9,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDPREP_DATE = new TagInfo2(
//			"MDPrepDate", 0x82aa,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDPREP_TIME = new TagInfo2(
//			"MDPrepTime", 0x82ab,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MDFILE_UNITS = new TagInfo2(
//			"MDFileUnits", 0x82ac,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PIXEL_SCALE = new TagInfo2(
//			"PixelScale", 0x830e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IPTC_NAA = new TagInfo2(
//			"IPTC-NAA", 0x83bb, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTERGRAPH_PACKET_DATA = new TagInfo2(
//			"IntergraphPacketData", 0x847e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTERGRAPH_FLAG_REGISTERS = new TagInfo2(
//			"IntergraphFlagRegisters", 0x847f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTERGRAPH_MATRIX = new TagInfo2(
//			"IntergraphMatrix", 0x8480,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODEL_TIE_POINT = new TagInfo2(
//			"ModelTiePoint", 0x8482,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SITE = new TagInfo2("Site",
//			0x84e0,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_SEQUENCE = new TagInfo2(
//			"ColorSequence", 0x84e1,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IT8HEADER = new TagInfo2(
//			"IT8Header", 0x84e2,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RASTER_PADDING = new TagInfo2(
//			"RasterPadding", 0x84e3,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BITS_PER_RUN_LENGTH = new TagInfo2(
//			"BitsPerRunLength", 0x84e4,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BITS_PER_EXTENDED_RUN_LENGTH = new TagInfo2(
//			"BitsPerExtendedRunLength", 0x84e5,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_TABLE = new TagInfo2(
//			"ColorTable", 0x84e6,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_COLOR_INDICATOR = new TagInfo2(
//			"ImageColorIndicator", 0x84e7,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BACKGROUND_COLOR_INDICATOR = new TagInfo2(
//			"BackgroundColorIndicator", 0x84e8,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_COLOR_VALUE = new TagInfo2(
//			"ImageColorValue", 0x84e9,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BACKGROUND_COLOR_VALUE = new TagInfo2(
//			"BackgroundColorValue", 0x84ea,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PIXEL_INTENSITY_RANGE = new TagInfo2(
//			"PixelIntensityRange", 0x84eb,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TRANSPARENCY_INDICATOR = new TagInfo2(
//			"TransparencyIndicator", 0x84ec,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_CHARACTERIZATION = new TagInfo2(
//			"ColorCharacterization", 0x84ed,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_HCUSAGE = new TagInfo2(
//			"HCUsage", 0x84ee,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SEMINFO = new TagInfo2(
//			"SEMInfo", 0x8546, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_AFCP_IPTC = new TagInfo2(
//			"AFCP_IPTC", 0x8568,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MODEL_TRANSFORM = new TagInfo2(
//			"ModelTransform", 0x85d8,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_LEAF_DATA = new TagInfo2(
//			"LeafData", 0x8606,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PHOTOSHOP_SETTINGS = new TagInfo2(
//			"PhotoshopSettings", 0x8649,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXIF_OFFSET = new TagInfo2(
//			"ExifOffset", 0x8769,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ICC_PROFILE = new TagInfo2(
//			"ICC_Profile", 0x8773,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_LAYER = new TagInfo2(
//			"ImageLayer", 0x87ac,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GEO_TIFF_DIRECTORY = new TagInfo2(
//			"GeoTiffDirectory", 0x87af,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GEO_TIFF_DOUBLE_PARAMS = new TagInfo2(
//			"GeoTiffDoubleParams", 0x87b0,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GEO_TIFF_ASCII_PARAMS = new TagInfo2(
//			"GeoTiffAsciiParams", 0x87b1,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_PROGRAM = new TagInfo2(
//			"ExposureProgram", 0x8822, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int EXPOSURE_PROGRAM_VALUE_MANUAL = 1;
//	public static final int EXPOSURE_PROGRAM_VALUE_PROGRAM_AE = 2;
//	public static final int EXPOSURE_PROGRAM_VALUE_APERTURE_PRIORITY_AE = 3;
//	public static final int EXPOSURE_PROGRAM_VALUE_SHUTTER_SPEED_PRIORITY_AE = 4;
//	public static final int EXPOSURE_PROGRAM_VALUE_CREATIVE_SLOW_SPEED = 5;
//	public static final int EXPOSURE_PROGRAM_VALUE_ACTION_HIGH_SPEED = 6;
//	public static final int EXPOSURE_PROGRAM_VALUE_PORTRAIT = 7;
//	public static final int EXPOSURE_PROGRAM_VALUE_LANDSCAPE = 8;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SPECTRAL_SENSITIVITY = new TagInfo2(
//			"SpectralSensitivity", 0x8824, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GPSINFO = new TagInfo2(
//			"GPSInfo", 0x8825,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ISO = new TagInfo2("ISO",
//			0x8827, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OPTO__ELECTRIC_CONV_FACTOR = new TagInfo2(
//			"Opto-ElectricConvFactor", 0x8828,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTERLACE = new TagInfo2(
//			"Interlace", 0x8829,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TIME_ZONE_OFFSET = new TagInfo2(
//			"TimeZoneOffset", 0x882a, FIELD_TYPE_SSHORT, -1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SELF_TIMER_MODE = new TagInfo2(
//			"SelfTimerMode", 0x882b, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FAX_RECV_PARAMS = new TagInfo2(
//			"FaxRecvParams", 0x885c,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FAX_SUB_ADDRESS = new TagInfo2(
//			"FaxSubAddress", 0x885d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FAX_RECV_TIME = new TagInfo2(
//			"FaxRecvTime", 0x885e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_LEAF_SUB_IFD = new TagInfo2(
//			"LeafSubIFD", 0x888a,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXIF_VERSION = new TagInfo2(
//			"ExifVersion", 0x9000, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DATE_TIME_ORIGINAL = new TagInfo2(
//			"DateTimeOriginal", 0x9003, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CREATE_DATE = new TagInfo2(
//			"CreateDate", 0x9004, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COMPONENTS_CONFIGURATION = new TagInfo2(
//			"ComponentsConfiguration", 0x9101, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COMPRESSED_BITS_PER_PIXEL = new TagInfo2(
//			"CompressedBitsPerPixel", 0x9102, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SHUTTER_SPEED_VALUE = new TagInfo2(
//			"ShutterSpeedValue", 0x9201, FIELD_TYPE_SRATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_APERTURE_VALUE = new TagInfo2(
//			"ApertureValue", 0x9202, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BRIGHTNESS_VALUE = new TagInfo2(
//			"BrightnessValue", 0x9203, FIELD_TYPE_SRATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_COMPENSATION = new TagInfo2(
//			"ExposureCompensation", 0x9204, FIELD_TYPE_SRATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MAX_APERTURE_VALUE = new TagInfo2(
//			"MaxApertureValue", 0x9205, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUBJECT_DISTANCE = new TagInfo2(
//			"SubjectDistance", 0x9206, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_METERING_MODE = new TagInfo2(
//			"MeteringMode", 0x9207, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int METERING_MODE_VALUE_AVERAGE = 1;
//	public static final int METERING_MODE_VALUE_CENTER_WEIGHTED_AVERAGE = 2;
//	public static final int METERING_MODE_VALUE_SPOT = 3;
//	public static final int METERING_MODE_VALUE_MULTI_SPOT = 4;
//	public static final int METERING_MODE_VALUE_MULTI_SEGMENT = 5;
//	public static final int METERING_MODE_VALUE_PARTIAL = 6;
//	public static final int METERING_MODE_VALUE_OTHER = 255;
//
//	public static final TagInfo2 TAG_INFO_EXIF_LIGHT_SOURCE = new TagInfo2(
//			"LightSource", 0x9208, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int LIGHT_SOURCE_VALUE_DAYLIGHT = 1;
//	public static final int LIGHT_SOURCE_VALUE_FLUORESCENT = 2;
//	public static final int LIGHT_SOURCE_VALUE_TUNGSTEN = 3;
//	public static final int LIGHT_SOURCE_VALUE_FLASH = 4;
//	public static final int LIGHT_SOURCE_VALUE_FINE_WEATHER = 9;
//	public static final int LIGHT_SOURCE_VALUE_CLOUDY = 10;
//	public static final int LIGHT_SOURCE_VALUE_SHADE = 11;
//	public static final int LIGHT_SOURCE_VALUE_DAYLIGHT_FLUORESCENT = 12;
//	public static final int LIGHT_SOURCE_VALUE_DAY_WHITE_FLUORESCENT = 13;
//	public static final int LIGHT_SOURCE_VALUE_COOL_WHITE_FLUORESCENT = 14;
//	public static final int LIGHT_SOURCE_VALUE_WHITE_FLUORESCENT = 15;
//	public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_A = 17;
//	public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_B = 18;
//	public static final int LIGHT_SOURCE_VALUE_STANDARD_LIGHT_C = 19;
//	public static final int LIGHT_SOURCE_VALUE_D55 = 20;
//	public static final int LIGHT_SOURCE_VALUE_D65 = 21;
//	public static final int LIGHT_SOURCE_VALUE_D75 = 22;
//	public static final int LIGHT_SOURCE_VALUE_D50 = 23;
//	public static final int LIGHT_SOURCE_VALUE_ISO_STUDIO_TUNGSTEN = 24;
//	public static final int LIGHT_SOURCE_VALUE_OTHER = 255;
//
//	public static final TagInfo2 TAG_INFO_EXIF_FLASH = new TagInfo2("Flash",
//			0x9209, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int FLASH_VALUE_NO_FLASH = 0x0;
//	public static final int FLASH_VALUE_FIRED = 0x1;
//	public static final int FLASH_VALUE_FIRED_RETURN_NOT_DETECTED = 0x5;
//	public static final int FLASH_VALUE_FIRED_RETURN_DETECTED = 0x7;
//	public static final int FLASH_VALUE_ON_DID_NOT_FIRE = 0x8;
//	public static final int FLASH_VALUE_ON = 0x9;
//	public static final int FLASH_VALUE_ON_RETURN_NOT_DETECTED = 0xd;
//	public static final int FLASH_VALUE_ON_RETURN_DETECTED = 0xf;
//	public static final int FLASH_VALUE_OFF = 0x10;
//	public static final int FLASH_VALUE_OFF_DID_NOT_FIRE_RETURN_NOT_DETECTED = 0x14;
//	public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE = 0x18;
//	public static final int FLASH_VALUE_AUTO_FIRED = 0x19;
//	public static final int FLASH_VALUE_AUTO_FIRED_RETURN_NOT_DETECTED = 0x1d;
//	public static final int FLASH_VALUE_AUTO_FIRED_RETURN_DETECTED = 0x1f;
//	public static final int FLASH_VALUE_NO_FLASH_FUNCTION = 0x20;
//	public static final int FLASH_VALUE_OFF_NO_FLASH_FUNCTION = 0x30;
//	public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION = 0x41;
//	public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x45;
//	public static final int FLASH_VALUE_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x47;
//	public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION = 0x49;
//	public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x4d;
//	public static final int FLASH_VALUE_ON_RED_EYE_REDUCTION_RETURN_DETECTED = 0x4f;
//	public static final int FLASH_VALUE_OFF_RED_EYE_REDUCTION = 0x50;
//	public static final int FLASH_VALUE_AUTO_DID_NOT_FIRE_RED_EYE_REDUCTION = 0x58;
//	public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION = 0x59;
//	public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_NOT_DETECTED = 0x5d;
//	public static final int FLASH_VALUE_AUTO_FIRED_RED_EYE_REDUCTION_RETURN_DETECTED = 0x5f;
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_LENGTH = new TagInfo2(
//			"FocalLength", 0x920a, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FLASH_ENERGY = new TagInfo2(
//			"FlashEnergy", 0x920b,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SPATIAL_FREQUENCY_RESPONSE_1 = new TagInfo2(
//			"SpatialFrequencyResponse", 0x920c,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_NOISE_1 = new TagInfo2("Noise",
//			0x920d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_XRESOLUTION = new TagInfo2(
//			"FocalPlaneXResolution", 0x920e,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_YRESOLUTION = new TagInfo2(
//			"FocalPlaneYResolution", 0x920f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_RESOLUTION_UNIT = new TagInfo2(
//			"FocalPlaneResolutionUnit", 0x9210,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_NONE = 1;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_INCHES = 2;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_CM = 3;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_MM = 4;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_VALUE_UM = 5;
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_NUMBER_EXIF_IFD = new TagInfo2(
//			"ImageNumber", 0x9211, FIELD_TYPE_LONG, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SECURITY_CLASSIFICATION_EXIF_IFD = new TagInfo2(
//			"SecurityClassification", 0x9212, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_HISTORY_EXIF_IFD = new TagInfo2(
//			"ImageHistory", 0x9213, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUBJECT_LOCATION_1 = new TagInfo2(
//			"SubjectLocation", 0x9214, FIELD_TYPE_SHORT, 4,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_INDEX = new TagInfo2(
//			"ExposureIndex", 0x9215,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TIFF_EPSTANDARD_ID_1 = new TagInfo2(
//			"TIFF-EPStandardID", 0x9216,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SENSING_METHOD = new TagInfo2(
//			"SensingMethod", 0x9217,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int SENSING_METHOD_VALUE_MONOCHROME_AREA = 1;
//	public static final int SENSING_METHOD_VALUE_ONE_CHIP_COLOR_AREA = 2;
//	public static final int SENSING_METHOD_VALUE_TWO_CHIP_COLOR_AREA = 3;
//	public static final int SENSING_METHOD_VALUE_THREE_CHIP_COLOR_AREA = 4;
//	public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
//	public static final int SENSING_METHOD_VALUE_MONOCHROME_LINEAR = 6;
//	public static final int SENSING_METHOD_VALUE_TRILINEAR = 7;
//	public static final int SENSING_METHOD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
//
//	public static final TagInfo2 TAG_INFO_EXIF_STO_NITS = new TagInfo2(
//			"StoNits", 0x923f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// skipping Maker Note!
//	public static final TagInfo2 TAG_INFO_EXIF_USER_COMMENT = new TagInfo2(
//			"UserComment", 0x9286, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUB_SEC_TIME = new TagInfo2(
//			"SubSecTime", 0x9290, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUB_SEC_TIME_ORIGINAL = new TagInfo2(
//			"SubSecTimeOriginal", 0x9291, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUB_SEC_TIME_DIGITIZED = new TagInfo2(
//			"SubSecTimeDigitized", 0x9292, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_SOURCE_DATA = new TagInfo2(
//			"ImageSourceData", 0x935c, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPTITLE = new TagInfo2(
//			"XPTitle", 0x9c9b, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPCOMMENT = new TagInfo2(
//			"XPComment", 0x9c9c, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPAUTHOR = new TagInfo2(
//			"XPAuthor", 0x9c9d, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPKEYWORDS = new TagInfo2(
//			"XPKeywords", 0x9c9e, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_XPSUBJECT = new TagInfo2(
//			"XPSubject", 0x9c9f, FIELD_TYPE_BYTE, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FLASHPIX_VERSION = new TagInfo2(
//			"FlashpixVersion", 0xa000, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_SPACE = new TagInfo2(
//			"ColorSpace", 0xa001, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int COLOR_SPACE_VALUE_SRGB = 1;
//	public static final int COLOR_SPACE_VALUE_ADOBE_RGB = 2;
//	public static final int COLOR_SPACE_VALUE_UNCALIBRATED = 65535;
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXIF_IMAGE_WIDTH = new TagInfo2(
//			"ExifImageWidth", 0xa002, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXIF_IMAGE_LENGTH = new TagInfo2(
//			"ExifImageLength", 0xa003, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RELATED_SOUND_FILE = new TagInfo2(
//			"RelatedSoundFile", 0xa004, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_INTEROP_OFFSET = new TagInfo2(
//			"InteropOffset", 0xa005,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FLASH_ENERGY_EXIF_IFD = new TagInfo2(
//			"FlashEnergy", 0xa20b, FIELD_TYPE_RATIONAL, -1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SPATIAL_FREQUENCY_RESPONSE_2 = new TagInfo2(
//			"SpatialFrequencyResponse", 0xa20c,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_NOISE_2 = new TagInfo2("Noise",
//			0xa20d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_XRESOLUTION_EXIF_IFD = new TagInfo2(
//			"FocalPlaneXResolution", 0xa20e, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_YRESOLUTION_EXIF_IFD = new TagInfo2(
//			"FocalPlaneYResolution", 0xa20f, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD = new TagInfo2(
//			"FocalPlaneResolutionUnit", 0xa210, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_NONE = 1;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_INCHES = 2;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_CM = 3;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_MM = 4;
//	public static final int FOCAL_PLANE_RESOLUTION_UNIT_EXIF_IFD_VALUE_UM = 5;
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_NUMBER = new TagInfo2(
//			"ImageNumber", 0xa211,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SECURITY_CLASSIFICATION = new TagInfo2(
//			"SecurityClassification", 0xa212,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_HISTORY = new TagInfo2(
//			"ImageHistory", 0xa213,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUBJECT_LOCATION_2 = new TagInfo2(
//			"SubjectLocation", 0xa214, FIELD_TYPE_SHORT, 2,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_INDEX_EXIF_IFD = new TagInfo2(
//			"ExposureIndex", 0xa215, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_TIFF_EPSTANDARD_ID_2 = new TagInfo2(
//			"TIFF-EPStandardID", 0xa216,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SENSING_METHOD_EXIF_IFD = new TagInfo2(
//			"SensingMethod", 0xa217, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_NOT_DEFINED = 1;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_ONE_CHIP_COLOR_AREA = 2;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_TWO_CHIP_COLOR_AREA = 3;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_THREE_CHIP_COLOR_AREA = 4;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_AREA = 5;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_TRILINEAR = 7;
//	public static final int SENSING_METHOD_EXIF_IFD_VALUE_COLOR_SEQUENTIAL_LINEAR = 8;
//
//	public static final TagInfo2 TAG_INFO_EXIF_FILE_SOURCE = new TagInfo2(
//			"FileSource", 0xa300, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int FILE_SOURCE_VALUE_FILM_SCANNER = 1;
//	public static final int FILE_SOURCE_VALUE_REFLECTION_PRINT_SCANNER = 2;
//	public static final int FILE_SOURCE_VALUE_DIGITAL_CAMERA = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SCENE_TYPE = new TagInfo2(
//			"SceneType", 0xa301, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CFAPATTERN = new TagInfo2(
//			"CFAPattern", 0xa302, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CUSTOM_RENDERED = new TagInfo2(
//			"CustomRendered", 0xa401, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int CUSTOM_RENDERED_VALUE_NORMAL = 0;
//	public static final int CUSTOM_RENDERED_VALUE_CUSTOM = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE_MODE = new TagInfo2(
//			"ExposureMode", 0xa402, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int EXPOSURE_MODE_VALUE_AUTO = 0;
//	public static final int EXPOSURE_MODE_VALUE_MANUAL = 1;
//	public static final int EXPOSURE_MODE_VALUE_AUTO_BRACKET = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_WHITE_BALANCE_1 = new TagInfo2(
//			"WhiteBalance", 0xa403, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int WHITE_BALANCE_1_VALUE_AUTO = 0;
//	public static final int WHITE_BALANCE_1_VALUE_MANUAL = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_DIGITAL_ZOOM_RATIO = new TagInfo2(
//			"DigitalZoomRatio", 0xa404, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_FOCAL_LENGTH_IN_35MM_FORMAT = new TagInfo2(
//			"FocalLengthIn35mmFormat", 0xa405, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SCENE_CAPTURE_TYPE = new TagInfo2(
//			"SceneCaptureType", 0xa406, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int SCENE_CAPTURE_TYPE_VALUE_STANDARD = 0;
//	public static final int SCENE_CAPTURE_TYPE_VALUE_LANDSCAPE = 1;
//	public static final int SCENE_CAPTURE_TYPE_VALUE_PORTRAIT = 2;
//	public static final int SCENE_CAPTURE_TYPE_VALUE_NIGHT = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_GAIN_CONTROL = new TagInfo2(
//			"GainControl", 0xa407, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int GAIN_CONTROL_VALUE_NONE = 0;
//	public static final int GAIN_CONTROL_VALUE_LOW_GAIN_UP = 1;
//	public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_UP = 2;
//	public static final int GAIN_CONTROL_VALUE_LOW_GAIN_DOWN = 3;
//	public static final int GAIN_CONTROL_VALUE_HIGH_GAIN_DOWN = 4;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CONTRAST_1 = new TagInfo2(
//			"Contrast", 0xa408, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int CONTRAST_1_VALUE_NORMAL = 0;
//	public static final int CONTRAST_1_VALUE_LOW = 1;
//	public static final int CONTRAST_1_VALUE_HIGH = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SATURATION_1 = new TagInfo2(
//			"Saturation", 0xa409, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int SATURATION_1_VALUE_NORMAL = 0;
//	public static final int SATURATION_1_VALUE_LOW = 1;
//	public static final int SATURATION_1_VALUE_HIGH = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_SHARPNESS_1 = new TagInfo2(
//			"Sharpness", 0xa40a, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int SHARPNESS_1_VALUE_NORMAL = 0;
//	public static final int SHARPNESS_1_VALUE_SOFT = 1;
//	public static final int SHARPNESS_1_VALUE_HARD = 2;
//
//	public static final TagInfo2 TAG_INFO_EXIF_DEVICE_SETTING_DESCRIPTION = new TagInfo2(
//			"DeviceSettingDescription", 0xa40b,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SUBJECT_DISTANCE_RANGE = new TagInfo2(
//			"SubjectDistanceRange", 0xa40c, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	// tag constants
//	public static final int SUBJECT_DISTANCE_RANGE_VALUE_MACRO = 1;
//	public static final int SUBJECT_DISTANCE_RANGE_VALUE_CLOSE = 2;
//	public static final int SUBJECT_DISTANCE_RANGE_VALUE_DISTANT = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_UNIQUE_ID = new TagInfo2(
//			"ImageUniqueID", 0xa420, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GDALMETADATA = new TagInfo2(
//			"GDALMetadata", 0xa480,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GDALNO_DATA = new TagInfo2(
//			"GDALNoData", 0xa481,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_GAMMA = new TagInfo2("Gamma",
//			0xa500, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PIXEL_FORMAT = new TagInfo2(
//			"PixelFormat", 0xbc01,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int PIXEL_FORMAT_VALUE_BLACK_AND_WHITE = 0x5;
//	public static final int PIXEL_FORMAT_VALUE_8_BIT_GRAY = 0x8;
//	public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR555 = 0x9;
//	public static final int PIXEL_FORMAT_VALUE_16_BIT_BGR565 = 0xa;
//	public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY = 0xb;
//	public static final int PIXEL_FORMAT_VALUE_24_BIT_BGR = 0xc;
//	public static final int PIXEL_FORMAT_VALUE_24_BIT_RGB = 0xd;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR = 0xe;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_BGRA = 0xf;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_PBGRA = 0x10;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FLOAT = 0x11;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_FIXED_POINT = 0x12;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_BGR101010 = 0x13;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB = 0x15;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA = 0x16;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_PRGBA = 0x17;
//	public static final int PIXEL_FORMAT_VALUE_96_BIT_RGB_FIXED_POINT = 0x18;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FLOAT = 0x19;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_PRGBA_FLOAT = 0x1a;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_RGB_FLOAT = 0x1b;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_CMYK = 0x1c;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_FIXED_POINT = 0x1d;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_RGBA_FIXED_POINT = 0x1e;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_CMYK = 0x1f;
//	public static final int PIXEL_FORMAT_VALUE_24_BIT_3_CHANNELS = 0x20;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_4_CHANNELS = 0x21;
//	public static final int PIXEL_FORMAT_VALUE_40_BIT_5_CHANNELS = 0x22;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_6_CHANNELS = 0x23;
//	public static final int PIXEL_FORMAT_VALUE_56_BIT_7_CHANNELS = 0x24;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_8_CHANNELS = 0x25;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_3_CHANNELS = 0x26;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_4_CHANNELS = 0x27;
//	public static final int PIXEL_FORMAT_VALUE_80_BIT_5_CHANNELS = 0x28;
//	public static final int PIXEL_FORMAT_VALUE_96_BIT_6_CHANNELS = 0x29;
//	public static final int PIXEL_FORMAT_VALUE_112_BIT_7_CHANNELS = 0x2a;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_8_CHANNELS = 0x2b;
//	public static final int PIXEL_FORMAT_VALUE_40_BIT_CMYK_ALPHA = 0x2c;
//	public static final int PIXEL_FORMAT_VALUE_80_BIT_CMYK_ALPHA = 0x2d;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_3_CHANNELS_ALPHA = 0x2e;
//	public static final int PIXEL_FORMAT_VALUE_40_BIT_4_CHANNELS_ALPHA = 0x2f;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_5_CHANNELS_ALPHA = 0x30;
//	public static final int PIXEL_FORMAT_VALUE_56_BIT_6_CHANNELS_ALPHA = 0x31;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_7_CHANNELS_ALPHA = 0x32;
//	public static final int PIXEL_FORMAT_VALUE_72_BIT_8_CHANNELS_ALPHA = 0x33;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_3_CHANNELS_ALPHA = 0x34;
//	public static final int PIXEL_FORMAT_VALUE_80_BIT_4_CHANNELS_ALPHA = 0x35;
//	public static final int PIXEL_FORMAT_VALUE_96_BIT_5_CHANNELS_ALPHA = 0x36;
//	public static final int PIXEL_FORMAT_VALUE_112_BIT_6_CHANNELS_ALPHA = 0x37;
//	public static final int PIXEL_FORMAT_VALUE_128_BIT_7_CHANNELS_ALPHA = 0x38;
//	public static final int PIXEL_FORMAT_VALUE_144_BIT_8_CHANNELS_ALPHA = 0x39;
//	public static final int PIXEL_FORMAT_VALUE_64_BIT_RGBA_HALF = 0x3a;
//	public static final int PIXEL_FORMAT_VALUE_48_BIT_RGB_HALF = 0x3b;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_RGBE = 0x3d;
//	public static final int PIXEL_FORMAT_VALUE_16_BIT_GRAY_HALF = 0x3e;
//	public static final int PIXEL_FORMAT_VALUE_32_BIT_GRAY_FIXED_POINT = 0x3f;
//
//	public static final TagInfo2 TAG_INFO_EXIF_TRANSFOMATION = new TagInfo2(
//			"Transfomation", 0xbc02,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int TRANSFOMATION_VALUE_HORIZONTAL_NORMAL = 0;
//	public static final int TRANSFOMATION_VALUE_MIRROR_VERTICAL = 1;
//	public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL = 2;
//	public static final int TRANSFOMATION_VALUE_ROTATE_180 = 3;
//	public static final int TRANSFOMATION_VALUE_ROTATE_90_CW = 4;
//	public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_90_CW = 5;
//	public static final int TRANSFOMATION_VALUE_MIRROR_HORIZONTAL_AND_ROTATE_270_CW = 6;
//	public static final int TRANSFOMATION_VALUE_ROTATE_270_CW = 7;
//
//	public static final TagInfo2 TAG_INFO_EXIF_UNCOMPRESSED = new TagInfo2(
//			"Uncompressed", 0xbc03,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int UNCOMPRESSED_VALUE_NO = 0;
//	public static final int UNCOMPRESSED_VALUE_YES = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_TYPE = new TagInfo2(
//			"ImageType", 0xbc04,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_WIDTH = new TagInfo2(
//			"ImageWidth", 0xbc80,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_HEIGHT = new TagInfo2(
//			"ImageHeight", 0xbc81,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_WIDTH_RESOLUTION = new TagInfo2(
//			"WidthResolution", 0xbc82,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_HEIGHT_RESOLUTION = new TagInfo2(
//			"HeightResolution", 0xbc83,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_OFFSET = new TagInfo2(
//			"ImageOffset", 0xbcc0,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_BYTE_COUNT = new TagInfo2(
//			"ImageByteCount", 0xbcc1,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ALPHA_OFFSET = new TagInfo2(
//			"AlphaOffset", 0xbcc2,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ALPHA_BYTE_COUNT = new TagInfo2(
//			"AlphaByteCount", 0xbcc3,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_IMAGE_DATA_DISCARD = new TagInfo2(
//			"ImageDataDiscard", 0xbcc4,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int IMAGE_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
//	public static final int IMAGE_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
//	public static final int IMAGE_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
//	public static final int IMAGE_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_ALPHA_DATA_DISCARD = new TagInfo2(
//			"AlphaDataDiscard", 0xbcc5,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int ALPHA_DATA_DISCARD_VALUE_FULL_RESOLUTION = 0;
//	public static final int ALPHA_DATA_DISCARD_VALUE_FLEXBITS_DISCARDED = 1;
//	public static final int ALPHA_DATA_DISCARD_VALUE_HIGH_PASS_FREQUENCY_DATA_DISCARDED = 2;
//	public static final int ALPHA_DATA_DISCARD_VALUE_HIGHPASS_AND_LOW_PASS_FREQUENCY_DATA_DISCARDED = 3;
//
//	public static final TagInfo2 TAG_INFO_EXIF_OCE_SCANJOB_DESC = new TagInfo2(
//			"OceScanjobDesc", 0xc427,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OCE_APPLICATION_SELECTOR = new TagInfo2(
//			"OceApplicationSelector", 0xc428,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OCE_IDNUMBER = new TagInfo2(
//			"OceIDNumber", 0xc429,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OCE_IMAGE_LOGIC = new TagInfo2(
//			"OceImageLogic", 0xc42a,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ANNOTATIONS = new TagInfo2(
//			"Annotations", 0xc44f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_PRINT_IM = new TagInfo2(
//			"PrintIM", 0xc4a5, FIELD_TYPE_UNDEFINED, 1, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGVERSION = new TagInfo2(
//			"DNGVersion", 0xc612, FIELD_TYPE_BYTE, 4, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGBACKWARD_VERSION = new TagInfo2(
//			"DNGBackwardVersion", 0xc613, FIELD_TYPE_BYTE, 4,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_UNIQUE_CAMERA_MODEL = new TagInfo2(
//			"UniqueCameraModel", 0xc614, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_LOCALIZED_CAMERA_MODEL = new TagInfo2(
//			"LocalizedCameraModel", 0xc615, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CFAPLANE_COLOR = new TagInfo2(
//			"CFAPlaneColor", 0xc616,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CFALAYOUT = new TagInfo2(
//			"CFALayout", 0xc617,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	// tag constants
//	public static final int CFALAYOUT_VALUE_RECTANGULAR = 1;
//	public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_DOWN_1_2_ROW = 2;
//	public static final int CFALAYOUT_VALUE_EVEN_COLUMNS_OFFSET_UP_1_2_ROW = 3;
//	public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_RIGHT_1_2_COLUMN = 4;
//	public static final int CFALAYOUT_VALUE_EVEN_ROWS_OFFSET_LEFT_1_2_COLUMN = 5;
//
//	public static final TagInfo2 TAG_INFO_EXIF_LINEARIZATION_TABLE = new TagInfo2(
//			"LinearizationTable", 0xc618,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BLACK_LEVEL_REPEAT_DIM = new TagInfo2(
//			"BlackLevelRepeatDim", 0xc619,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BLACK_LEVEL = new TagInfo2(
//			"BlackLevel", 0xc61a,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BLACK_LEVEL_DELTA_H = new TagInfo2(
//			"BlackLevelDeltaH", 0xc61b,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BLACK_LEVEL_DELTA_V = new TagInfo2(
//			"BlackLevelDeltaV", 0xc61c,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_WHITE_LEVEL = new TagInfo2(
//			"WhiteLevel", 0xc61d,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DEFAULT_SCALE = new TagInfo2(
//			"DefaultScale", 0xc61e, FIELD_TYPE_RATIONAL, 2,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DEFAULT_CROP_ORIGIN = new TagInfo2(
//			"DefaultCropOrigin", 0xc61f, FIELD_TYPE_LONG, 2,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DEFAULT_CROP_SIZE = new TagInfo2(
//			"DefaultCropSize", 0xc620, FIELD_TYPE_LONG, 2,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_MATRIX_1 = new TagInfo2(
//			"ColorMatrix1", 0xc621,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_COLOR_MATRIX_2 = new TagInfo2(
//			"ColorMatrix2", 0xc622,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CAMERA_CALIBRATION_1 = new TagInfo2(
//			"CameraCalibration1", 0xc623,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CAMERA_CALIBRATION_2 = new TagInfo2(
//			"CameraCalibration2", 0xc624,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_REDUCTION_MATRIX_1 = new TagInfo2(
//			"ReductionMatrix1", 0xc625,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_REDUCTION_MATRIX_2 = new TagInfo2(
//			"ReductionMatrix2", 0xc626,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ANALOG_BALANCE = new TagInfo2(
//			"AnalogBalance", 0xc627,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_AS_SHOT_NEUTRAL = new TagInfo2(
//			"AsShotNeutral", 0xc628,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_AS_SHOT_WHITE_XY = new TagInfo2(
//			"AsShotWhiteXY", 0xc629, FIELD_TYPE_RATIONAL, 2,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BASELINE_EXPOSURE = new TagInfo2(
//			"BaselineExposure", 0xc62a, FIELD_TYPE_SRATIONAL, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BASELINE_NOISE = new TagInfo2(
//			"BaselineNoise", 0xc62b, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BASELINE_SHARPNESS = new TagInfo2(
//			"BaselineSharpness", 0xc62c, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BAYER_GREEN_SPLIT = new TagInfo2(
//			"BayerGreenSplit", 0xc62d, FIELD_TYPE_LONG, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_LINEAR_RESPONSE_LIMIT = new TagInfo2(
//			"LinearResponseLimit", 0xc62e, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CAMERA_SERIAL_NUMBER = new TagInfo2(
//			"CameraSerialNumber", 0xc62f, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGLENS_INFO = new TagInfo2(
//			"DNGLensInfo", 0xc630, FIELD_TYPE_RATIONAL, 4, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CHROMA_BLUR_RADIUS = new TagInfo2(
//			"ChromaBlurRadius", 0xc631, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ANTI_ALIAS_STRENGTH = new TagInfo2(
//			"AntiAliasStrength", 0xc632, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SHADOW_SCALE = new TagInfo2(
//			"ShadowScale", 0xc633, FIELD_TYPE_RATIONAL, 1, EXIF_DIRECTORY_IFD0);
//
//	// poly tag
//	public static final TagInfo2 TAG_INFO_EXIF_SR2PRIVATE = new TagInfo2(
//			"SR2Private", 0xc634,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGADOBE_DATA = new TagInfo2(
//			"DNGAdobeData", 0xc634,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGPENTAX_DATA = new TagInfo2(
//			"DNGPentaxData", 0xc634,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_DNGPRIVATE_DATA = new TagInfo2(
//			"DNGPrivateData", 0xc634,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MAKER_NOTE_SAFETY = new TagInfo2(
//			"MakerNoteSafety", 0xc635, FIELD_TYPE_SHORT, 1, EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int MAKER_NOTE_SAFETY_VALUE_UNSAFE = 0;
//	public static final int MAKER_NOTE_SAFETY_VALUE_SAFE = 1;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CALIBRATION_ILLUMINANT_1 = new TagInfo2(
//			"CalibrationIlluminant1", 0xc65a, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT = 1;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLUORESCENT = 2;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_TUNGSTEN = 3;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_FLASH = 4;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_FINE_WEATHER = 9;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_CLOUDY = 10;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_SHADE = 11;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAYLIGHT_FLUORESCENT = 12;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_DAY_WHITE_FLUORESCENT = 13;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_COOL_WHITE_FLUORESCENT = 14;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_WHITE_FLUORESCENT = 15;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_A = 17;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_B = 18;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_STANDARD_LIGHT_C = 19;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_D55 = 20;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_D65 = 21;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_D75 = 22;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_D50 = 23;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_ISO_STUDIO_TUNGSTEN = 24;
//	public static final int CALIBRATION_ILLUMINANT_1_VALUE_OTHER = 255;
//
//	public static final TagInfo2 TAG_INFO_EXIF_CALIBRATION_ILLUMINANT_2 = new TagInfo2(
//			"CalibrationIlluminant2", 0xc65b, FIELD_TYPE_SHORT, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	// tag constants
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT = 1;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLUORESCENT = 2;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_TUNGSTEN = 3;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_FLASH = 4;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_FINE_WEATHER = 9;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_CLOUDY = 10;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_SHADE = 11;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAYLIGHT_FLUORESCENT = 12;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_DAY_WHITE_FLUORESCENT = 13;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_COOL_WHITE_FLUORESCENT = 14;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_WHITE_FLUORESCENT = 15;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_A = 17;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_B = 18;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_STANDARD_LIGHT_C = 19;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_D55 = 20;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_D65 = 21;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_D75 = 22;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_D50 = 23;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_ISO_STUDIO_TUNGSTEN = 24;
//	public static final int CALIBRATION_ILLUMINANT_2_VALUE_OTHER = 255;
//
//	public static final TagInfo2 TAG_INFO_EXIF_BEST_QUALITY_SCALE = new TagInfo2(
//			"BestQualityScale", 0xc65c, FIELD_TYPE_RATIONAL, 1,
//			EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RAW_DATA_UNIQUE_ID = new TagInfo2(
//			"RawDataUniqueID", 0xc65d, FIELD_TYPE_BYTE, 16, EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ALIAS_LAYER_METADATA = new TagInfo2(
//			"AliasLayerMetadata", 0xc660,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ORIGINAL_RAW_FILE_NAME = new TagInfo2(
//			"OriginalRawFileName", 0xc68b, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ORIGINAL_RAW_FILE_DATA = new TagInfo2(
//			"OriginalRawFileData", 0xc68c, FIELD_TYPE_UNDEFINED, 1,
//			EXIF_DIRECTORY_IFD0);
//
//	public static final TagInfo2 TAG_INFO_EXIF_ACTIVE_AREA = new TagInfo2(
//			"ActiveArea", 0xc68d, FIELD_TYPE_LONG, 4, EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MASKED_AREAS = new TagInfo2(
//			"MaskedAreas", 0xc68e, FIELD_TYPE_LONG, 4, EXIF_DIRECTORY_SUB_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_AS_SHOT_ICCPROFILE = new TagInfo2(
//			"AsShotICCProfile", 0xc68f,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_AS_SHOT_PRE_PROFILE_MATRIX = new TagInfo2(
//			"AsShotPreProfileMatrix", 0xc690,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CURRENT_ICCPROFILE = new TagInfo2(
//			"CurrentICCProfile", 0xc691,FIELD_TYPE_DESCRIPTION_UNKNOWN, 1, EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CURRENT_PRE_PROFILE_MATRIX = new TagInfo2(
//			"CurrentPreProfileMatrix", 0xc692, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
//			EXIF_DIRECTORY_UNKNOWN);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OFFSET_SCHEMA = new TagInfo2(
//			"OffsetSchema", 0xea1d, FIELD_TYPE_SLONG, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_OWNER_NAME = new TagInfo2(
//			"OwnerName", 0xfde8, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SERIAL_NUMBER = new TagInfo2(
//			"SerialNumber", 0xfde9, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_LENS = new TagInfo2("Lens",
//			0xfdea, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_RAW_FILE = new TagInfo2(
//			"RawFile", 0xfe4c, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CONVERTER = new TagInfo2(
//			"Converter", 0xfe4d, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_WHITE_BALANCE_2 = new TagInfo2(
//			"WhiteBalance", 0xfe4e, FIELD_TYPE_ASCII, 1,
//			EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_EXPOSURE = new TagInfo2(
//			"Exposure", 0xfe51, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SHADOWS = new TagInfo2(
//			"Shadows", 0xfe52, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_BRIGHTNESS = new TagInfo2(
//			"Brightness", 0xfe53, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_CONTRAST_2 = new TagInfo2(
//			"Contrast", 0xfe54, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SATURATION_2 = new TagInfo2(
//			"Saturation", 0xfe55, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SHARPNESS_2 = new TagInfo2(
//			"Sharpness", 0xfe56, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_SMOOTHNESS = new TagInfo2(
//			"Smoothness", 0xfe57, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//	public static final TagInfo2 TAG_INFO_EXIF_MOIRE_FILTER = new TagInfo2(
//			"MoireFilter", 0xfe58, FIELD_TYPE_ASCII, 1, EXIF_DIRECTORY_EXIF_IFD);
//
//}
