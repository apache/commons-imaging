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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.sanselan.util.Debug;

public class TagInfo
{
	public final int tag;
	public final String name;
	public final boolean isDate;

	public TagInfo(int tag, String name)
	{
		this(tag, name, false);
	}

	public TagInfo(int tag, String name, boolean is_date)
	{
		this.tag = tag;
		this.name = name.trim();
		this.isDate = is_date;
	}

	private static final DateFormat DATE_FORMAT_1 = new SimpleDateFormat(
			"yyyy:MM:dd HH:mm:ss");
	private static final DateFormat DATE_FORMAT_2 = new SimpleDateFormat(
			"yyyy:MM:dd:HH:mm:ss");

	public Object getValue(TiffField entry)
	{
		Object o = entry.fieldType.getSimpleValue(entry);

		if (isDate)
		{
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

		}

		return o;
	}

	public String toString()
	{
		return "[TagInfo. tag: " + tag + ", name: " + name
				+ (isDate ? " (data)" : "") + "]";
	}

}