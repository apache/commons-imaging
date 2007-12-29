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
package org.apache.sanselan.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.formats.jpeg.IptcElement;
import org.apache.sanselan.formats.jpeg.IptcType;
import org.apache.sanselan.formats.jpeg.JpegImageParser;

public class App13Segment extends APPNSegment
{
	protected final JpegImageParser parser;
	public final ArrayList elements = new ArrayList();

	public App13Segment(JpegImageParser parser, int marker, byte segmentData[])
			throws ImageReadException, IOException
	{
		this(parser, marker, segmentData.length, new ByteArrayInputStream(
				segmentData));
	}

	// TODO:
	public App13Segment(JpegImageParser parser, int marker, int marker_length,
			InputStream is) throws ImageReadException, IOException
	{
		super(marker, marker_length, is);
		this.parser = parser;

		//			InputStream bais = new ByteArrayInputStream(bytes);
		//			dump();

		//		Debug.debug("bytes", bytes);
		boolean verbose = false;

		if (!compareByteArrays(bytes, 0,
				JpegImageParser.PhotoshopIdentificationString, 0,
				JpegImageParser.PhotoshopIdentificationString.length))
			throw new ImageReadException("Invalid App13 Segment");
		//			readAndVerifyBytes("Photoshop Identification String", bais,
		//					kPhotoshopIdentificationString, "Invalid App13 Segment");

		int index = JpegImageParser.PhotoshopIdentificationString.length;
		while (index < bytes.length)
		{
			if (!compareByteArrays(bytes, index, JpegImageParser.CONST_8BIM, 0,
					JpegImageParser.CONST_8BIM.length))
			{
				//					dump(index);
				throw new ImageReadException("Invalid .CONST_8BIM Segment");
			}
			index += JpegImageParser.CONST_8BIM.length;

			int segmentType = convertByteArrayToShort("SegmentType", index,
					bytes);
			if (verbose)
				debugNumber("SegmentType", segmentType, 2);
			index += 2;

			// padding
			index += 4;

			int segmentSize = convertByteArrayToShort("SegmentSize", index,
					bytes);
			if (verbose)
				debugNumber("fSegmentSize", segmentSize, 2);
			index += 2;

			int index2 = index;

			index += segmentSize;
			if ((segmentSize % 2) != 0)
				index++;

			while (index2 < index)
			{
				int iptcPrefix = convertByteArrayToShort("IPTCPrefix", index2,
						bytes);
				if (verbose)
					debugNumber("fIPTCPrefix", iptcPrefix, 2);
				index2 += 2;

				if (iptcPrefix == 0x1c02)
				{
					//						System.out.println("								TEXTBLOCK:  "
					//								+ fSegmentType);
				}
				else
				{
					//						System.out.println("								!TEXTBLOCK: " + fSegmentType);
					break;
				}

				byte iptcSegmentType = bytes[index2];
				//					debugNumber("fIPTCSegmentType", fIPTCSegmentType);
				index2++;

				int iptcSegmentSize = convertByteArrayToShort(
						"IPTCSegmentSize", index2, bytes);
				//					debugNumber("fIPTCegmentSize", fIPTCegmentSize, 2);
				index2 += 2;

				byte iptcData[] = readBytearray("iptc_data", bytes, index2,
						iptcSegmentSize);
				index2 += iptcSegmentSize;

				String value = new String(iptcData);
				//					System.out.println("iptc_data: '" + value + "' ("
				//							+ fIPTCegmentSize + ")");

				IptcType iptcType = IptcType.getIptcType(iptcSegmentType);
				IptcElement element = new IptcElement(iptcType, value);
				elements.add(element);
			}

		}

	}

}