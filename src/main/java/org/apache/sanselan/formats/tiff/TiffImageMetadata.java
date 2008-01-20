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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.ImageMetadata;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
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
		//		private BufferedImage thumbnail = null;

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

		public BufferedImage getThumbnail() throws ImageReadException,
				IOException
		{
			return directory.getTiffImage();
		}

		public TiffImageData getTiffImageData()
		{
			return directory.getTiffImageData();
		}

		public JpegImageData getJpegImageData()
		{
			return directory.getJpegImageData();
		}

		public String toString(String prefix)
		{
			return (prefix != null ? prefix : "") + directory.description()
					+ ": " //
					+ (getTiffImageData() != null ? " (tiffImageData)" : "") //
					+ (getJpegImageData() != null ? " (jpegImageData)" : "") //
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

				if (null != dstDir.findField(srcField.tag))
				{
					// ignore duplicate tags in a directory.
					continue;
				}
				else if (srcField.tagInfo instanceof TagInfo.Offset)
				{
					// ignore offset fields.
					continue;
				}

				TagInfo tagInfo = srcField.tagInfo;
				FieldType fieldType = srcField.fieldType;
				int count = srcField.length;
				//			byte bytes[] = srcField.fieldType.getRawBytes(srcField);

				Object value = srcField.getValue();
				byte bytes2[];
				if (tagInfo.isDate())
					bytes2 = fieldType.getRawBytes(srcField);
				else
					bytes2 = fieldType.writeData(value, byteOrder);
				//			Debug.debug("\t" + "bytes2", bytes2);

				TiffOutputField dstField = new TiffOutputField(srcField.tag,
						tagInfo, fieldType, count, bytes2);
				dstDir.add(dstField);
			}

			dstDir.setTiffImageData(getTiffImageData());
			dstDir.setJpegImageData(getJpegImageData());

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

			if (null != result.findDirectory(srcDir.type))
			{
				// Certain cameras right directories more than once.  
				// This is a bug.
				// Ignore second directory of a given type.
				continue;
			}

			TiffOutputDirectory outputDirectory = srcDir
					.getOutputDirectory(byteOrder);
			result.addDirectory(outputDirectory);
		}

		return result;
	}

}