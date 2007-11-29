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
package org.apache.sanselan.formats.tiff.write;

import java.io.IOException;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.TagInfo;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;

public class WriteField
{
	public final TagInfo tagInfo;
	public final FieldType fieldType;
	public final int count;

	public byte bytes[];

	public WriteField(TagInfo tag, FieldType tagtype, int count, byte bytes[])
	{
		this.tagInfo = tag;
		this.fieldType = tagtype;
		this.count = count;
		this.bytes = bytes;
	}

	public int writeDirectoryEntry(BinaryOutputStream bos,
			int seperateValuesOffset) throws ImageWriteException, IOException
	{
		bos.write2Bytes(tagInfo.tag);
		bos.write2Bytes(fieldType.type);
		bos.write4Bytes(count);

		//		if(fieldType.type == TiffConstants.FIELD_TYPE_ASCII.type)
		//			Debug.debug("ascii bytes", bytes);

		if (bytes.length <= 4)
		{
			bos.writeByteArray(bytes);
			int remainder = 4 - bytes.length;
			for (int i = 0; i < remainder; i++)
				bos.write(0);
			return 0;
		}
		else
		{
			bos.write4Bytes(seperateValuesOffset);

			int written = bytes.length;
			if ((written % 2) != 0)
				written++;

			return written;
		}
	}

	public int getSeperateValueLength()
	{
		if (bytes.length <= 4)
			return 0;
		else
		{
			int written = bytes.length;
			if ((written % 2) != 0)
				written++;

			return written;
		}
	}

	public int writeSeperateValue(BinaryOutputStream bos)
			throws ImageWriteException, IOException
	{
		if (bytes.length <= 4)
			return 0;

		bos.writeByteArray(bytes);

		int written = bytes.length;
		if ((written % 2) != 0)
		{
			bos.write(0);
			written++;
		}
		return written;
	}

	public void setData(byte bytes[])
	{
		this.bytes = bytes;
	}
}