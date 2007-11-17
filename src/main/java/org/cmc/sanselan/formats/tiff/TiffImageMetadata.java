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
package org.cmc.sanselan.formats.tiff;

import java.awt.image.BufferedImage;
import java.util.Vector;

import org.cmc.sanselan.common.ImageMetadata;

public class TiffImageMetadata extends ImageMetadata
{
	public final TiffContents contents;

	public TiffImageMetadata(final TiffContents contents)
	{
		this.contents = contents;
	}

	public static class Directory extends ImageMetadata
			implements
				ImageMetadata.IImageMetadataItem
	{
		private BufferedImage thumbnail = null;

		public final int type;

		private final TiffDirectory directory;

		public Directory(final TiffDirectory directory)
		{
			this.type = directory.type;
			this.directory = directory;
		}

		public void add(TiffField entry)
		{
			add(new TiffImageMetadata.Item(entry));
		}

		public void setThumbnail(BufferedImage thumbnail)
		{
			this.thumbnail = thumbnail;
		}

		public BufferedImage getThumbnail()
		{
			return thumbnail;
		}

		private RawTiffImageData rawTiffImageData = null;

		public void setRawTiffImageData(RawTiffImageData rawImageData)
		{
			this.rawTiffImageData = rawImageData;
		}

		public RawTiffImageData getRawTiffImageData()
		{
			return rawTiffImageData;
		}

		private byte rawJpegImageData[] = null;

		public void setRawJpegImageData(byte bytes[])
		{
			this.rawJpegImageData = bytes;
		}

		public byte[] getRawJpegImageData()
		{
			return rawJpegImageData;
		}

		public String toString(String prefix)
		{
			return (prefix != null ? prefix : "") + directory.description()
					+ ": " //
					+ (rawTiffImageData != null ? " (rawImageData)" : "") //
					+ "\n" + super.toString(prefix) + "\n";
		}
	}

	public Vector getDirectories()
	{
		return super.getItems();
	}

	public Vector getItems()
	{
		Vector result = new Vector();

		Vector items = super.getItems();
		for (int i = 0; i < items.size(); i++)
		{
			Directory dir = (Directory) items.get(i);
			result.addAll(dir.getItems());
		}

		return result;
	}

	public static class Item extends ImageMetadata.Item
	{
		private final TiffField entry;

		public Item(TiffField entry)
		{
			//			super(entry.getTagName() + " (" + entry.getFieldTypeName() + ")",
			super(entry.getTagName(), entry.getValueDescription());
			this.entry = entry;
		}

		public TiffField getTiffField()
		{
			return entry;
		}

	}

}