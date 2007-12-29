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

package org.apache.sanselan.formats.jpeg;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.SanselanTest;
import org.apache.sanselan.SanselanTest.ImageFilter;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata.Photoshop;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.IOUtils;

public abstract class ExifBaseTest extends SanselanTest
{
	public ExifBaseTest(String name)
	{
		super(name);
	}

	protected static boolean hasExifData(File file) throws IOException,
			ImageReadException
	{
		ImageFormat format = Sanselan.guessFormat(file);
		if (format != ImageFormat.IMAGE_FORMAT_JPEG)
			return false;

		JpegImageMetadata metadata = (JpegImageMetadata) Sanselan
				.getMetadata(file);
		if (null == metadata)
			return false;

		if (null == metadata.getExif())
			return false;

		return true;
	}

	private static final ImageFilter imageFilter = new ImageFilter()
	{
		public boolean accept(File file) throws IOException, ImageReadException
		{
			return hasExifData(file);
		}
	};

	protected File getImageWithExifData() throws IOException,
			ImageReadException
	{
		return getTestImage(imageFilter);
	}

	protected List getImagesWithExifData() throws IOException,
			ImageReadException
	{
		return getTestImages(imageFilter);
	}

}
