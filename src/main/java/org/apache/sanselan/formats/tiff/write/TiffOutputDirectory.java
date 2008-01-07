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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.RawTiffImageData;
import org.apache.sanselan.formats.tiff.TiffDirectory;
import org.apache.sanselan.formats.tiff.constants.AllTagConstants;
import org.apache.sanselan.formats.tiff.constants.TagInfo;

public final class TiffOutputDirectory implements AllTagConstants
{
	public static final int UNDEFINED_VALUE = -1;

	public final int type;
	public int internalLength = UNDEFINED_VALUE;
	public int totalLength = UNDEFINED_VALUE;
	public int offset = UNDEFINED_VALUE;
	private final ArrayList fields = new ArrayList();

	private TiffOutputDirectory nextDirectory = null;

	public void setNextDirectory(TiffOutputDirectory nextDirectory)
	{
		this.nextDirectory = nextDirectory;
	}

	public TiffOutputDirectory(final int type)
	{
		this.type = type;
	}

	public void add(TiffOutputField field)
	{
		fields.add(field);
	}

	public ArrayList getFields()
	{
		return new ArrayList(fields);
	}

	public TiffOutputField findField(TagInfo tagInfo)
	{
		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			if (field.tagInfo.tag == tagInfo.tag)
				return field;
		}
		return null;
	}

	public void sortFields()
	{
		Comparator comparator = new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				TiffOutputField e1 = (TiffOutputField) o1;
				TiffOutputField e2 = (TiffOutputField) o2;

				return e1.tagInfo.tag - e2.tagInfo.tag;
			}
		};
		Collections.sort(fields, comparator);
		//			Debug.debug("first field", ((WriteField) fields.get(0)).tagInfo);
		//			Debug.debug("last field", ((WriteField) fields.get(fields.size()-1)).tagInfo);
		//			for(int i=0;i<fields.size();i++)
		//			{
		//				WriteField field = (WriteField) fields.get(i);
		//				Debug.debug(" field", field.tagInfo);
		//			}
	}

	public void calculateLengths(int byteOrder) throws IOException,
			ImageWriteException
	{
		tiffImageDataInfoStep(byteOrder);
		jpegImageDataInfoStep(byteOrder);

		internalLength = TiffImageWriterLossy.TIFF_ENTRY_LENGTH * fields.size()
				+ TiffImageWriterLossy.TIFF_DIRECTORY_HEADER_LENGTH
				+ TiffImageWriterLossy.TIFF_DIRECTORY_FOOTER_LENGTH;

		totalLength = internalLength;

		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			totalLength += field.getSeperateValueLength();
		}

		if (null != imageDataInfo)
		{
			int imageDataOffset = offset + totalLength;
			totalLength += imageDataInfo.totalLength;
			updateTiffImageDataOffsetsStep(imageDataOffset, byteOrder);
		}

		if (null != rawJpegImageData)
		{
			int imageDataOffset = offset + totalLength;
			totalLength += rawJpegImageData.length;
			totalLength += TiffImageWriterLossy
					.imageDataPaddingLength(rawJpegImageData.length);
			updateJpegImageDataOffsetsStep(imageDataOffset, byteOrder);
		}

	}

	public String description()
	{
		return TiffDirectory.description(type);
	}

	public void write(BinaryOutputStream bos) throws IOException,
			ImageWriteException
	{

		//			Debug.debug("dir write");
		//			Debug.debug("dir write offset", offset);
		//			Debug.debug("dir write internalLength", internalLength);
		//			Debug.debug("dir write totalLength", totalLength);
		//			Debug.debug("dir write fields", fields.size());
		//			Debug.debug("dir write nextDirectoryOffset", nextDirectoryOffset);

		int nextSeperateValueOffset = offset + internalLength;

		//			Debug.debug("writing directory", description());
		//			Debug.debug("writing fields.size()", fields.size());

		// Write Directory Field Count
		bos.write2Bytes(fields.size()); // DirectoryFieldCount

		// Write Fields
		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			//				checkOffset("ifd [" + i + "]", fOffsetToSeperateValues);
			nextSeperateValueOffset += field.writeDirectoryEntry(bos,
					nextSeperateValueOffset);
		}

		int nextDirectoryOffset = 0;
		if(nextDirectory!=null)
			nextDirectoryOffset = nextDirectory.offset;
		
		// Write nextDirectoryOffset
		if (nextDirectoryOffset == UNDEFINED_VALUE)
			bos.write4Bytes(0);
		else
			bos.write4Bytes(nextDirectoryOffset);

		// Write Seperate Values
		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			field.writeSeperateValue(bos);
		}

		if (null != rawTiffImageData)
		{
			byte imageData[][] = rawTiffImageData.getRawImageData();
			for (int i = 0; i < imageData.length; i++)
			{
				bos.writeByteArray(imageData[i]);
				int imageDataByteCount = imageData[i].length;

				int remainder = TiffImageWriterLossy
						.imageDataPaddingLength(imageDataByteCount);
				for (int j = 0; j < remainder; j++)
					bos.write(0);
			}
		}

		if (null != rawJpegImageData)
		{
			//				byte imageData[][] = rawJpegImageData.getRawImageData();
			bos.writeByteArray(rawJpegImageData);
			int remainder = TiffImageWriterLossy
					.imageDataPaddingLength(rawJpegImageData.length);
			for (int j = 0; j < remainder; j++)
				bos.write(0);
		}

	}

	private ImageDataInfo imageDataInfo = null;

	private void tiffImageDataInfoStep(int byteOrder)
	{
		if (null == rawTiffImageData)
			return;

		byte imageData[][] = rawTiffImageData.getRawImageData();
		boolean stripsNotTiles = rawTiffImageData.stripsNotTiles();

		int imageDataOffsets[] = null;
		int imageDataByteCounts[] = null;
		TiffOutputField imageDataOffsetsField = null;

		imageDataOffsets = new int[imageData.length];
		imageDataByteCounts = new int[imageData.length];

		int totalLength = 0;
		for (int i = 0; i < imageData.length; i++)
		{
			imageDataByteCounts[i] = imageData[i].length;
			totalLength += imageData[i].length;

			totalLength += TiffImageWriterLossy
					.imageDataPaddingLength(imageData[i].length);
		}

		// Append imageData-related fields to first directory
		{
			TagInfo tagInfo;
			if (stripsNotTiles)
				tagInfo = TiffImageWriterLossy.TIFF_TAG_STRIP_OFFSETS;
			else
				tagInfo = TiffImageWriterLossy.TIFF_TAG_TILE_OFFSETS;

			imageDataOffsetsField = findField(tagInfo);
			if (null == imageDataOffsetsField)
			{
				imageDataOffsetsField = new TiffOutputField(tagInfo,
						TiffImageWriterLossy.FIELD_TYPE_LONG,
						imageDataOffsets.length,
						TiffImageWriterLossy.FIELD_TYPE_LONG.writeData(
								imageDataOffsets, byteOrder));
				add(imageDataOffsetsField);
			}
		}
		{
			TagInfo tagInfo;
			if (stripsNotTiles)
				tagInfo = TiffImageWriterLossy.TIFF_TAG_STRIP_BYTE_COUNTS;
			else
				tagInfo = TiffImageWriterLossy.TIFF_TAG_TILE_BYTE_COUNTS;

			byte data[] = TiffImageWriterLossy.FIELD_TYPE_LONG.writeData(
					imageDataByteCounts, byteOrder);

			TiffOutputField field = findField(tagInfo);
			if (null == field)
				add(new TiffOutputField(tagInfo,
						TiffImageWriterLossy.FIELD_TYPE_LONG,
						imageDataByteCounts.length, data));
			else
				field.setData(data);

		}

		imageDataInfo = new ImageDataInfo(imageData, imageDataOffsets,
				imageDataByteCounts, imageDataOffsetsField, totalLength);
	}

	TiffOutputField jpegImageDataOffsetField = null;

	private void jpegImageDataInfoStep(int byteOrder)
	{
		if (null == rawJpegImageData)
			return;

		//			int totalLength = 0;
		//			totalLength += rawJpegImageData.length;
		//			totalLength += imageDataPaddingLength(rawJpegImageData.length);

		// Append imageData-related fields to first directory
		{
			TagInfo tagInfo = TiffImageWriterLossy.TIFF_TAG_JPEG_INTERCHANGE_FORMAT;

			jpegImageDataOffsetField = findField(tagInfo);
			if (null == jpegImageDataOffsetField)
			{
				jpegImageDataOffsetField = new TiffOutputField(tagInfo,
						TiffImageWriterLossy.FIELD_TYPE_LONG, 1,
						TiffImageWriterLossy.FIELD_TYPE_LONG.writeData(
								new int[]{
									0,
								}, byteOrder));
				add(jpegImageDataOffsetField);
			}
		}
		{
			TagInfo tagInfo = TiffImageWriterLossy.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;

			byte data[] = TiffImageWriterLossy.FIELD_TYPE_LONG.writeData(
					new int[]{
						rawJpegImageData.length,
					}, byteOrder);

			TiffOutputField field = findField(tagInfo);
			if (null == field)
				add(new TiffOutputField(tagInfo,
						TiffImageWriterLossy.FIELD_TYPE_LONG, 1, data));
			else
				field.setData(data);
		}
	}

	private void updateTiffImageDataOffsetsStep(final int imageDataOffset,
			int byteOrder) throws IOException, ImageWriteException
	{
		int currentOffset = imageDataOffset;

		for (int i = 0; i < imageDataInfo.imageData.length; i++)
		{
			imageDataInfo.imageDataOffsets[i] = currentOffset;
			currentOffset += imageDataInfo.imageDataByteCounts[i];

			currentOffset += TiffImageWriterLossy
					.imageDataPaddingLength(imageDataInfo.imageDataByteCounts[i]);
		}

		imageDataInfo.imageDataOffsetsField
				.setData(TiffImageWriterLossy.FIELD_TYPE_LONG.writeData(
						imageDataInfo.imageDataOffsets, byteOrder));
		//			}
	}

	private void updateJpegImageDataOffsetsStep(final int imageDataOffset,
			int byteOrder) throws IOException, ImageWriteException
	{
		jpegImageDataOffsetField.setData(TiffImageWriterLossy.FIELD_TYPE_LONG
				.writeData(new int[]{
					imageDataOffset,
				}, byteOrder));
	}

	private RawTiffImageData rawTiffImageData = null;

	public void setRawTiffImageData(RawTiffImageData rawTiffImageData)
	{
		this.rawTiffImageData = rawTiffImageData;
	}

	public RawTiffImageData getRawTiffImageData()
	{
		return rawTiffImageData;
	}

	private byte rawJpegImageData[] = null;

	public void setRawJpegImageData(byte rawJpegImageData[])
	{
		this.rawJpegImageData = rawJpegImageData;
	}

	public byte[] getRawJpegImageData()
	{
		return rawJpegImageData;
	}

	//		public static final Comparator COMPARATOR = new Comparator()
	//		{
	//			public int compare(Object o1, Object o2)
	//			{
	//				Directory e1 = (Directory) o1;
	//				Directory e2 = (Directory) o2;
	//				return e1.offset - e2.offset;
	//			}
	//		};
}