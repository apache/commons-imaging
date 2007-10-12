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
package org.apache.sanselan.formats.tiff.fieldtypes;

import org.apache.sanselan.formats.tiff.TiffField;

public class FieldTypeLong extends FieldType
{
	public FieldTypeLong(int type, String name)
	{
		super(type, 4, name);
	}

	public Object getSimpleValue(TiffField entry)
	{
		if (entry.length == 1)
			return new Integer(convertByteArrayToInt(name + " ("
					+ entry.tagInfo.name + ")", entry.valueOffsetBytes,
					entry.byteOrder));

		return convertByteArrayToIntArray(name + " (" + entry.tagInfo.name
				+ ")", getRawBytes(entry), 0, entry.length, entry.byteOrder);
	}

	public byte[] writeData(Object o, int byteOrder)
	{
		if (o instanceof Integer)
			return writeData(new int[]{
				((Integer) o).intValue(),
			}, byteOrder);

		return writeData((int[]) o, byteOrder);
	}

	public byte[] writeData(int values[], int byteOrder)
	{
		return convertIntArrayToByteArray(values, byteOrder);
	}
}