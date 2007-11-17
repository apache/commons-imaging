package org.cmc.sanselan.formats.tiff.debug;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.cmc.sanselan.formats.tiff.TiffField;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldType;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeASCII;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeByte;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeDouble;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeFloat;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeLong;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeRational;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeShort;
import org.cmc.sanselan.formats.tiff.fieldtypes.FieldTypeUnknown;
import org.cmc.sanselan.util.Debug;

public class TiffConst
{
	public static class ExifDirectory
	{
		public final String name;

		public ExifDirectory(final String name)
		{
			this.name = name;
		}
	}

	public static final int TIFF_COMPRESSION_UNCOMPRESSED_1 = 1;
	public static final int TIFF_COMPRESSION_UNCOMPRESSED = TIFF_COMPRESSION_UNCOMPRESSED_1;
	public static final int TIFF_COMPRESSION_CCITT_1D = 2;
	public static final int TIFF_COMPRESSION_CCITT_GROUP_3 = 3;
	public static final int TIFF_COMPRESSION_CCITT_GROUP_4 = 4;
	public static final int TIFF_COMPRESSION_LZW = 5;
	public static final int TIFF_COMPRESSION_JPEG = 6;
	public static final int TIFF_COMPRESSION_UNCOMPRESSED_2 = 32771;
	public static final int TIFF_COMPRESSION_PACKBITS = 32773;

	public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
	public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
	public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
	public static final int PHOTOMETRIC_INTERPRETATION_RGB_PALETTE = 3;
	public static final int PHOTOMETRIC_INTERPRETATION_TRANSPARENCY_MASK = 4;
	public static final int PHOTOMETRIC_INTERPRETATION_CMYK = 5;
	public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
	public static final int PHOTOMETRIC_INTERPRETATION_CIELAB = 8;

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

	public static final FieldType FIELD_TYPE_ANY[] = FIELD_TYPES;

	public static class TagInfo2
	{
		protected static final int LENGTH_UNKNOWN = -1;

		public TagInfo2(String name, int tag, FieldType dataType, int length,
				ExifDirectory exifDirectory)
		{
			this(name, tag, dataType, length);
		}

		public TagInfo2(String name, int tag, FieldType dataType, int length)
		{
			this(name, tag, new FieldType[]{
				dataType
			}, length, null);
		}

		public TagInfo2(String name, int tag, FieldType dataType,
				String lengthDescription)
		{
			this(name, tag, new FieldType[]{
				dataType
			}, LENGTH_UNKNOWN, lengthDescription);
		}

		public TagInfo2(String name, int tag, FieldType dataTypes[], int length)
		{
			this(name, tag, dataTypes, length, null);
		}

		public TagInfo2(String name, int tag, FieldType dataTypes[],
				String lengthDescription)
		{
			this(name, tag, dataTypes, LENGTH_UNKNOWN, lengthDescription);
		}

		public TagInfo2(String name, int tag, FieldType dataType)
		{
			this(name, tag, dataType, LENGTH_UNKNOWN);
		}

		public final String name;
		public final int tag;
		public final FieldType dataTypes[];
		public final int length;
		public final String lengthDescription;

		public TagInfo2(String name, int tag, FieldType dataTypes[],
				int length, String lengthDescription)
		{
			this.name = name;
			this.tag = tag;
			this.dataTypes = dataTypes;
			this.length = length;
			this.lengthDescription = lengthDescription;
		}

		public Object getValue(TiffField entry)
		{
			Object o = entry.fieldType.getSimpleValue(entry);
			return o;
		}

		public String toString()
		{
			return "[TagInfo. tag: " + tag + ", name: " + name + "]";
		}

	}

	public static class TagInfo2Date extends TagInfo2
	{
		public TagInfo2Date(String name, int tag, FieldType dataType, int length)
		{
			super(name, tag, dataType, length);
		}
		//
		//		public TagInfo2Date(String name, int tag, FieldType dataType,
		//				String lengthDescription)
		//		{
		//			this(name, tag, new FieldType[]{
		//				dataType
		//			}, LENGTH_UNKNOWN, lengthDescription);
		//		}
		//
		//		public TagInfo2Date(String name, int tag, FieldType dataTypes[], int length)
		//		{
		//			this(name, tag, dataTypes, length, null);
		//		}
		//
		//		public TagInfo2Date(String name, int tag, FieldType dataTypes[],
		//				String lengthDescription)
		//		{
		//			this(name, tag, dataTypes, LENGTH_UNKNOWN, lengthDescription);
		//		}
		//
		//		public TagInfo2Date(String name, int tag, FieldType dataType)
		//		{
		//			this(name, tag, dataType, LENGTH_UNKNOWN);
		//		}

		private static final DateFormat DATE_FORMAT_1 = new SimpleDateFormat(
				"yyyy:MM:dd HH:mm:ss");
		private static final DateFormat DATE_FORMAT_2 = new SimpleDateFormat(
				"yyyy:MM:dd:HH:mm:ss");

		public Object getValue(TiffField entry)
		{
			Object o = entry.fieldType.getSimpleValue(entry);

			String s = (String) o;
			try
			{
				Date date = DATE_FORMAT_1.parse(s);
				return date;
			}
			catch (Exception e)
			{
				//		Debug.debug(e);
			}
			try
			{
				Date date = DATE_FORMAT_2.parse(s);
				return date;
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}

			return o;
		}

		public String toString()
		{
			return "[TagInfo. tag: " + tag + ", name: " + name + " (data)"
					+ "]";
		}
	}

}
