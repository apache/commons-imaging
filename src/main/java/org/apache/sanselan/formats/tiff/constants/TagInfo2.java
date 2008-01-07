/**
 * 
 */
package org.apache.sanselan.formats.tiff.constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.util.Debug;

public class TagInfo2 implements TiffDirectoryConstants
{
	protected static final int LENGTH_UNKNOWN = -1;

	public TagInfo2(String name, int tag, FieldType dataType, int length,
			ExifDirectoryType exifDirectory)
	{
		this(name, tag, new FieldType[]{
			dataType
		}, length, exifDirectory);
	}

	public TagInfo2(String name, int tag, FieldType dataType, int length)
	{
		this(name, tag, new FieldType[]{
			dataType
		}, length, EXIF_DIRECTORY_UNKNOWN);
	}

	public TagInfo2(String name, int tag, FieldType dataType,
			String lengthDescription)
	{
		this(name, tag, new FieldType[]{
			dataType
		}, LENGTH_UNKNOWN, EXIF_DIRECTORY_UNKNOWN);
	}

	public TagInfo2(String name, int tag, FieldType dataTypes[],
			String lengthDescription)
	{
		this(name, tag, dataTypes, LENGTH_UNKNOWN, EXIF_DIRECTORY_UNKNOWN);
	}

	public TagInfo2(String name, int tag, FieldType dataType)
	{
		this(name, tag, dataType, LENGTH_UNKNOWN, EXIF_DIRECTORY_UNKNOWN);
	}

	public TagInfo2(String name, int tag, FieldType dataTypes[], int length,
			String lengthDescription)
	{
		this(name, tag, dataTypes, length, EXIF_DIRECTORY_UNKNOWN);
	}
	public final String name;
	public final int tag;
	public final FieldType dataTypes[];
	public final int length;
	public final ExifDirectoryType exifDirectory;

	//	public final String lengthDescription;

	public TagInfo2(String name, int tag, FieldType dataTypes[], int length,
			ExifDirectoryType exifDirectory
	//			, String lengthDescription
	)
	{
		this.name = name;
		this.tag = tag;
		this.dataTypes = dataTypes;
		this.length = length;
		//		this.lengthDescription = lengthDescription;
		this.exifDirectory = exifDirectory;
	}

	public Object getValue(TiffField entry)
	{
		Object o = entry.fieldType.getSimpleValue(entry);
		return o;
	}

	public String toString()
	{
		return "[TagInfo. tag: " + tag + " (0x" + Integer.toHexString(tag)
				+ ", name: " + name + "]";
	}

	public boolean isDate()
	{
		return false;
	}

	public boolean isOffset()
	{
		return false;
	}

	public static class Offset extends TagInfo2
	{
		public Offset(String name, int tag, FieldType dataTypes[], int length,
				ExifDirectoryType exifDirectory)
		{
			super(name, tag, dataTypes, length, exifDirectory);
		}

		public Offset(String name, int tag, FieldType dataType, int length)
		{
			super(name, tag, dataType, length);
		}

		//		"Exif Offset", 0x8769, FIELD_TYPE_DESCRIPTION_UNKNOWN, 1,
		//		EXIF_DIRECTORY_UNKNOWN);
		public boolean isOffset()
		{
			return true;
		}
	}

	public static class Date extends TagInfo2
	{
		public Date(String name, int tag, FieldType dataType, int length)
		{
			super(name, tag, dataType, length);
		}

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
				java.util.Date date = DATE_FORMAT_1.parse(s);
				return date;
			}
			catch (Exception e)
			{
				//		Debug.debug(e);
			}
			try
			{
				java.util.Date date = DATE_FORMAT_2.parse(s);
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

		// TODO: use polymorphism
		public boolean isDate()
		{
			return true;
		}

	}
}