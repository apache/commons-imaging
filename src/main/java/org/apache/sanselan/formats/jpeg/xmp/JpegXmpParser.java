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

package org.apache.sanselan.formats.jpeg.xmp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.SanselanConstants;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.ParamMap;

public class JpegXmpParser extends BinaryFileParser
{

	public JpegXmpParser()
	{
		setByteOrder(BYTE_ORDER_NETWORK);
	}

	public static final String XMP_NAMESPACE_URI = "http://ns.adobe.com/xap/1.0/";

	public static final byte XMP_IDENTIFIER[] = { //
	0x68, // h
			0x74, // t
			0x74, // t
			0x70, // p
			0x3A, // :
			0x2F, // /
			0x2F, // /
			0x6E, // n
			0x73, // s
			0x2E, // .
			0x61, // a
			0x64, // d
			0x6F, // o
			0x62, // b
			0x65, // e
			0x2E, // .
			0x63, // c
			0x6F, // o
			0x6D, // m
			0x2F, // /
			0x78, // x
			0x61, // a
			0x70, // p
			0x2F, // /
			0x31, // 1
			0x2E, // .
			0x30, // 0
			0x2F, // /
			0, // 0-terminated us-ascii string.
	};

	public boolean isXmpJpegSegment(byte segmentData[])
	{
		int index = 0;

		if (segmentData.length < XMP_IDENTIFIER.length)
			return false;
		for (; index < XMP_IDENTIFIER.length; index++)
			if (segmentData[index] < XMP_IDENTIFIER[index])
				return false;

		return true;
	}

	public String parseXmpJpegSegment(byte segmentData[])
			throws ImageReadException
	{
		int index = 0;

		if (segmentData.length < XMP_IDENTIFIER.length)
			throw new ImageReadException("Invalid JPEG XMP Segment.");
		for (; index < XMP_IDENTIFIER.length; index++)
			if (segmentData[index] < XMP_IDENTIFIER[index])
				throw new ImageReadException("Invalid JPEG XMP Segment.");

		try
		{
			// segment data is UTF-8 encoded xml.
			String xml = new String(segmentData, index, segmentData.length
					- index, "utf-8");
			return xml;
		} catch (UnsupportedEncodingException e)
		{
			throw new ImageReadException("Invalid JPEG XMP Segment.");
		}
	}

}
