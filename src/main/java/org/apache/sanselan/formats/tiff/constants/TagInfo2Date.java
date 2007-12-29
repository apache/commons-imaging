///**
// * 
// */
//package org.apache.sanselan.formats.tiff.constants;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.sanselan.formats.tiff.TiffField;
//import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
//import org.apache.sanselan.util.Debug;
//
//public class TagInfo2Date extends TagInfo2
//{
//	public TagInfo2Date(String name, int tag, FieldType dataType, int length)
//	{
//		super(name, tag, dataType, length);
//	}
//
//	private static final DateFormat DATE_FORMAT_1 = new SimpleDateFormat(
//			"yyyy:MM:dd HH:mm:ss");
//	private static final DateFormat DATE_FORMAT_2 = new SimpleDateFormat(
//			"yyyy:MM:dd:HH:mm:ss");
//
//	public Object getValue(TiffField entry)
//	{
//		Object o = entry.fieldType.getSimpleValue(entry);
//
//		String s = (String) o;
//		try
//		{
//			Date date = DATE_FORMAT_1.parse(s);
//			return date;
//		}
//		catch (Exception e)
//		{
//			//		Debug.debug(e);
//		}
//		try
//		{
//			Date date = DATE_FORMAT_2.parse(s);
//			return date;
//		}
//		catch (Exception e)
//		{
//			Debug.debug(e);
//		}
//
//		return o;
//	}
//
//	public String toString()
//	{
//		return "[TagInfo. tag: " + tag + ", name: " + name + " (data)"
//				+ "]";
//	}
//}