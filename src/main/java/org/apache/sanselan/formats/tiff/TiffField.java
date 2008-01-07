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
package org.apache.sanselan.formats.tiff;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;

public class TiffField implements TiffConstants
{
	public final TagInfo tagInfo;
	public final FieldType fieldType;

	public final int tag;
	public final int directoryType;
	public final int type;
	public final int length;
	public final int valueOffset;
	public final byte valueOffsetBytes[];

	public byte oversizeValue[] = null;
	public final int byteOrder;

	public TiffField(int tag, int directoryType, int type, int Length,
			int ValueOffset, byte ValueOffsetBytes[], int byteOrder)
	{

		this.tag = tag;
		this.directoryType = directoryType;
		this.type = type;
		this.length = Length;
		this.valueOffset = ValueOffset;
		this.valueOffsetBytes = ValueOffsetBytes;
		this.byteOrder = byteOrder;

		fieldType = getFieldType(type);
		tagInfo = getTag(directoryType, tag);
	}

	public boolean isLocalValue()
	{
		return fieldType.isLocalValue(this);
	}

	public final class OversizeValueElement extends TiffElement
	{
		public OversizeValueElement(int offset, int length)
		{
			super(offset, length);
		}

		public String getElementDescription(boolean verbose)
		{
			if (verbose)
				return null;

			return "OversizeValueElement, tag: " + tagInfo.name
					+ ", fieldType: " + fieldType.name;
		}
	}

	public TiffElement getOversizeValueElement()
	{
		if (fieldType.isLocalValue(this))
			return null;

		return new OversizeValueElement(valueOffset, oversizeValue.length);
	}

	public void setOversizeValue(byte bytes[])
	{
		this.oversizeValue = bytes;
	}

	private static FieldType getFieldType(int value)
	{
		for (int i = 0; i < FIELD_TYPES.length; i++)
		{
			FieldType fieldType = FIELD_TYPES[i];
			if (fieldType.type == value)
				return fieldType;
		}

		return FIELD_TYPE_UNKNOWN;
	}

	private static TagInfo getTag(int directoryType, int value)
	{
		Object key = new Integer(value);

		if (directoryType == DIRECTORY_TYPE_EXIF
				|| directoryType == DIRECTORY_TYPE_INTEROPERABILITY)
		{
			if (EXIF_TAG_MAP.containsKey(key))
				return (TagInfo) EXIF_TAG_MAP.get(key);
		}
		else if (directoryType == DIRECTORY_TYPE_GPS)
		{
			if (GPS_TAG_MAP.containsKey(key))
				return (TagInfo) GPS_TAG_MAP.get(key);
		}
		else
		{
			if (TIFF_TAG_MAP.containsKey(key))
				return (TagInfo) TIFF_TAG_MAP.get(key);
		}

		if (ALL_TAG_MAP.containsKey(key))
			return (TagInfo) ALL_TAG_MAP.get(key);

		//		public static final int DIRECTORY_TYPE_EXIF = -2;
		//		//	public static final int DIRECTORY_TYPE_SUB = 5;
		//		public static final int DIRECTORY_TYPE_GPS = -3;
		//		public static final int DIRECTORY_TYPE_INTEROPERABILITY = -4;
		//
		//		private static final Map GPS_TAG_MAP = makeTagMap(ALL_GPS_TAGS, false);
		//		private static final Map TIFF_TAG_MAP = makeTagMap(ALL_TIFF_TAGS, false);
		//		private static final Map EXIF_TAG_MAP = makeTagMap(ALL_EXIF_TAGS, false);
		//		private static final Map ALL_TAG_MAP = makeTagMap(ALL_TAGS, true);
		//
		//		for (int i = 0; i < ALL_TAGS.length; i++)
		//		{
		//			TagInfo2 tag = ALL_TAGS[i];
		//			if (tag.tag == value)
		//				return tag;
		//		}

		return TIFF_TAG_UNKNOWN;
	}

	private int getValueLengthInBytes()
	{
		int unit_length = fieldType.length;
		int valueLength = unit_length * length;
		return valueLength;
	}

	public void fillInValue(ByteSource byteSource) throws ImageReadException,
			IOException
	{
		if (fieldType.isLocalValue(this))
			return;

		int valueLength = getValueLengthInBytes();

		byte bytes[] = byteSource.getBlock(valueOffset, valueLength);
		setOversizeValue(bytes);
	}

	public String getValueDescription()
	{
		return getValueDescription(getValue());
	}

	private String getValueDescription(Object o)
	{
		if (o == null)
			return null;

		if (o instanceof Number)
		{
			return o.toString();
			//			try
			//			{
			//				return o.toString();
			//			}
			//			catch (ArithmeticException e)
			//			{
			//				errorDump();
			//				
			//				//				Debug.debug(toString());
			//				//				Debug.debug(e);
			//
			//				throw e;
			//			}
		}
		else if (o instanceof String)
		{
			return "'" + o.toString().trim() + "'";
		}
		else if (o instanceof Date)
		{
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
			return df.format((Date) o);
		}
		else if (o instanceof Object[])
		{
			Object objects[] = (Object[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < objects.length; i++)
			{
				Object object = objects[i];

				if (i > 50)
				{
					result.append("... (" + objects.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + object);
			}
			return result.toString();
		}
		//		else if (o instanceof Number[])
		//		{
		//			Number numbers[] = (Number[]) o;
		//			StringBuffer result = new StringBuffer();
		//
		//			for (int i = 0; i < numbers.length; i++)
		//			{
		//				Number number = numbers[i];
		//
		//				if (i > 0)
		//					result.append(", ");
		//				result.append("" + number);
		//			}
		//			return result.toString();
		//		}
		else if (o instanceof int[])
		{
			int values[] = (int[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				int value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		else if (o instanceof long[])
		{
			long values[] = (long[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				long value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		else if (o instanceof double[])
		{
			double values[] = (double[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				double value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		else if (o instanceof byte[])
		{
			byte values[] = (byte[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				byte value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		else if (o instanceof char[])
		{
			char values[] = (char[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				char value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		else if (o instanceof float[])
		{
			float values[] = (float[]) o;
			StringBuffer result = new StringBuffer();

			for (int i = 0; i < values.length; i++)
			{
				float value = values[i];

				if (i > 50)
				{
					result.append("... (" + values.length + ")");
					break;
				}
				if (i > 0)
					result.append(", ");
				result.append("" + value);
			}
			return result.toString();
		}
		//		else if (o instanceof short[])
		//		{
		//			short numbers[] = (short[]) o;
		//			StringBuffer result = new StringBuffer();
		//
		//			for (int i = 0; i < numbers.length; i++)
		//			{
		//				short number = numbers[i];
		//
		//				if (i > 0)
		//					result.append(", ");
		//				result.append("" + number);
		//			}
		//			return result.toString();
		//		}

		return "Unknown: " + o.getClass().getName();
	}

	public void dump()
	{
		dump(new PrintWriter(new OutputStreamWriter(System.out)));
	}

	public void dump(PrintWriter pw)
	{
		dump(pw, null);
	}

	public void dump(PrintWriter pw, String prefix)
	{
		if (prefix != null)
			pw.print(prefix + ": ");

		pw.println(toString());
		pw.flush();
	}

	//	private void errorDump()
	//	{
	//		Debug.debug("tagInfo", tagInfo);
	//		Debug.debug("fieldType", fieldType);
	//		Debug.debug("tag", tag);
	//		Debug.debug("type", type);
	//		Debug.debug("length", length);
	//		Debug.debug("valueOffset", valueOffset);
	//		Debug.debug("valueOffsetBytes", valueOffsetBytes);
	//		Debug.debug("oversizeValue", oversizeValue);
	//		Debug.debug("byteOrder", byteOrder);
	//	}

	public String getDescriptionWithoutValue()
	{
		return tag + " (0x" + Integer.toHexString(tag) + ": " + tagInfo.name
				+ "): ";
	}

	public String toString()
	{
		StringBuffer result = new StringBuffer();

		result.append(tag + " (0x" + Integer.toHexString(tag) + ": "
				+ tagInfo.name + "): ");
		result.append(getValueDescription(getValue()) + " (" + length + " "
				+ fieldType.name + ")");

		return result.toString();
	}

	public String getTagName()
	{
		if (tagInfo == TIFF_TAG_UNKNOWN)
			return tagInfo.name + " (0x" + Integer.toHexString(tag) + ")";
		return tagInfo.name;
	}

	public String getFieldTypeName()
	{
		return fieldType.name;
	}

	public static final String Attribute_Tag = "Tag";

	public Object getValue()
	{
		//		System.out.print("getValue");
		return tagInfo.getValue(this);
	}

	private static final Map makeTagMap(TagInfo tags[],
			boolean ignoreDuplicates, String name)
	{
		// make sure to use the thread-safe version; this is shared state.
		Map map = new Hashtable();

		for (int i = 0; i < tags.length; i++)
		{
			TagInfo tag = tags[i];
			Object key = new Integer(tag.tag);

			if (map.get(key) == null)
				map.put(key, tag);
			else if (!ignoreDuplicates)
			{
				System.out.println("Duplicate tag in " + name + ": " + tag.tag
						+ " (0x" + Integer.toHexString(tag.tag) + ")");
				System.out.println("\t" + "New name: " + tag.name);
				System.out.println("\t" + "Old name: "
						+ ((TagInfo) map.get(key)).name);
			}
		}

		return map;
	}

	private static final Map GPS_TAG_MAP = makeTagMap(ALL_GPS_TAGS, false,
			"GPS");
	private static final Map TIFF_TAG_MAP = makeTagMap(ALL_TIFF_TAGS, false,
			"TIFF");
	private static final Map EXIF_TAG_MAP = makeTagMap(ALL_EXIF_TAGS, true,
			"EXIF");
	private static final Map ALL_TAG_MAP = makeTagMap(ALL_TAGS, true, "All");

	//	static
	//	{
	//		Map map = new HashMap();
	//
	//		for (int i = 0; i < ALL_TAGS.length; i++)
	//		{
	//			TagInfo2 tag = ALL_TAGS[i];
	//			Object o = map.get("" + tag.tag);
	//			if (o == null)
	//				map.put("" + tag.tag, tag);
	//			else
	//			{
	//				System.out.println("Duplicate tag: " + tag.tag);
	//				System.out.println("\t" + "New name: " + tag.name);
	//				System.out.println("\t" + "Old name: " + ((TagInfo2) o).name);
	//			}
	//		}
	//
	//	}

	//	public static final TagInfo2 ALL_TAGS[] = TagConstantsUtils
	//			.mergeTagLists(new TagInfo2[][]{
	//					ALL_EXIF_TAGS, ALL_TIFF_TAGS, ALL_GPS_TAGS,
	//			});
	//
	//	
	public int[] getValueAsIntArray()
	{
		Object o = getValue();
		if (o == null)
			return null;

		if (o instanceof Number)
			return new int[]{
				((Number) o).intValue()
			};
		else if (o instanceof Number[])
		{
			Number numbers[] = (Number[]) o;
			int result[] = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i].intValue();
			return result;
		}
		else if (o instanceof int[])
		{
			int numbers[] = (int[]) o;
			int result[] = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i];
			return result;
		}

		return null;
	}
}