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
package org.cmc.sanselan.formats.tiff.fieldtypes;

import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.formats.tiff.TiffField;

public class FieldTypeFloat extends FieldType
{
	public FieldTypeFloat()
	{
		super(11, 4, "Float");
	}

	//	= new FieldType(11, 4, "Float")

	public Object getSimpleValue(TiffField entry)
	{
		if (entry.length == 1)
			return new Float(convertByteArrayToFloat(name + " ("
					+ entry.tagInfo.name + ")", entry.valueOffsetBytes,
					entry.byteOrder));

		return convertByteArrayToFloatArray(name + " (" + entry.tagInfo.name
				+ ")", getRawBytes(entry), 0, entry.length, entry.byteOrder);
	}

	public byte[] writeData(Object o, int byteOrder) throws ImageWriteException
	{
		if (o instanceof Float)
			return convertFloatToByteArray(((Float) o).floatValue(), byteOrder);

		return convertFloatArrayToByteArray((float[]) o, byteOrder);
	}

	//	public byte[] writeData(Object o, float byteOrder)
	//	{
	//		if (o instanceof Float)
	//			return writeData(new float[]{
	//				((Float) o).floatValue(),
	//			}, byteOrder);
	//
	//		return writeData((float[]) o, byteOrder);
	//	}
	//	
	//	
	//	
	//	public byte[] writeData(float values[], int byteOrder)
	//	{
	//		return convertIntArrayToByteArray(values, byteOrder);
	//	}

}