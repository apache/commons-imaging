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
package org.cmc.sanselan.formats.jpeg.segments;

import java.io.IOException;
import java.io.InputStream;

import org.cmc.sanselan.ImageReadException;

public class JFIFSegment extends Segment
{
	public final int JFIF_major_version;
	public final int JFIF_minor_version;
	public final int density_units;
	public final int xDensity;
	public final int yDensity;

	public final int xThumbnail;
	public final int yThumbnail;
	public final int thumbnailSize;

	public String getDescription()
	{
		return "JFIF (" + getSegmentType() + ")";
	}

	private static final byte JFIF0_SIGNATURE[] = new byte[]{
			(byte) 'J', (byte) 'F', (byte) 'I', (byte) 'F', (byte) 0,
	};

	public JFIFSegment(int marker, int marker_length, InputStream is)
			throws ImageReadException, IOException
	{
		super(marker, marker_length);

		{
			readAndVerifyBytes(is, JFIF0_SIGNATURE,
					"Not a Valid JPEG File: missing JFIF string");

			JFIF_major_version = readByte("JFIF_major_version", is,
					"Not a Valid JPEG File");
			JFIF_minor_version = readByte("JFIF_minor_version", is,
					"Not a Valid JPEG File");
			density_units = readByte("density_units", is,
					"Not a Valid JPEG File");
			xDensity = read2Bytes("x_density", is, "Not a Valid JPEG File");
			yDensity = read2Bytes("y_density", is, "Not a Valid JPEG File");

			xThumbnail = readByte("x_thumbnail", is, "Not a Valid JPEG File");
			yThumbnail = readByte("y_thumbnail", is, "Not a Valid JPEG File");
			thumbnailSize = xThumbnail * yThumbnail;
			if (thumbnailSize > 0)
			{
				skipBytes(is, thumbnailSize,
						"Not a Valid JPEG File: missing thumbnail");

			}
		}

		if (getDebug())
			System.out.println("");
	}

}