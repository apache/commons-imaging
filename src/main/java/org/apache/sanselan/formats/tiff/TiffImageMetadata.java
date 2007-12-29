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

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.ImageMetadata;
import org.apache.sanselan.formats.tiff.constants.TagInfo2;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
import org.apache.sanselan.formats.tiff.write.TiffOutputField;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;

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
					+ (rawTiffImageData != null ? " (tiffImageData)" : "") //
					+ (rawJpegImageData != null ? " (jpegImageData)" : "") //
					+ "\n" + super.toString(prefix) + "\n";
		}

		public TiffOutputDirectory getOutputDirectory(int byteOrder)
				throws ImageWriteException
		{
			TiffOutputDirectory dstDir = new TiffOutputDirectory(type);

			ArrayList entries = getItems();
			for (int i = 0; i < entries.size(); i++)
			{
				TiffImageMetadata.Item item = (TiffImageMetadata.Item) entries
						.get(i);
				TiffField srcField = item.getTiffField();

				TagInfo2 tag = srcField.tagInfo;
				FieldType tagtype = srcField.fieldType;
				int count = srcField.length;
				//			byte bytes[] = srcField.fieldType.getRawBytes(srcField);

				//			Debug.debug("\t" + "srcField", srcField);
				//			Debug.debug("\t" + "bytes", bytes);

				Object value = srcField.getValue();
				byte bytes2[];
				if (tag.isDate())
					bytes2 = tagtype.getRawBytes(srcField);
				else
					bytes2 = tagtype.writeData(value, byteOrder);
				//			Debug.debug("\t" + "bytes2", bytes2);

				TiffOutputField dstField = new TiffOutputField(tag, tagtype,
						count, bytes2);
				dstDir.add(dstField);
			}

			dstDir.setRawTiffImageData(getRawTiffImageData());
			dstDir.setRawJpegImageData(getRawJpegImageData());

			return dstDir;
		}
	}

	public ArrayList getDirectories()
	{
		return super.getItems();
	}

	public ArrayList getItems()
	{
		ArrayList result = new ArrayList();

		ArrayList items = super.getItems();
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

	public TiffOutputSet getOutputSet() throws ImageWriteException
	{
		int byteOrder = contents.header.byteOrder;
		TiffOutputSet result = new TiffOutputSet(byteOrder);

		ArrayList srcDirs = getDirectories();
		for (int i = 0; i < srcDirs.size(); i++)
		{
			TiffImageMetadata.Directory srcDir = (TiffImageMetadata.Directory) srcDirs
					.get(i);
			TiffOutputDirectory outputDirectory = srcDir
					.getOutputDirectory(byteOrder);
			result.addDirectory(outputDirectory);
		}

		return result;
	}

}