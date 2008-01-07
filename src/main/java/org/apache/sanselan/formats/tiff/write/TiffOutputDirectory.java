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
import java.util.List;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.formats.tiff.RawTiffImageData;
import org.apache.sanselan.formats.tiff.TiffDirectory;
import org.apache.sanselan.formats.tiff.constants.TagConstantsUtils;
import org.apache.sanselan.formats.tiff.constants.TagInfo;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.util.Debug;

public final class TiffOutputDirectory extends TiffOutputItem
		implements
			TiffConstants
{
	public static final int UNDEFINED_VALUE = -1;

	public final int type;
	public int internalLength = UNDEFINED_VALUE;
	public int totalLength = UNDEFINED_VALUE;
	//	public int offset = UNDEFINED_VALUE;
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
			if (field.tag == tagInfo.tag)
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

				return e1.tag - e2.tag;
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

		internalLength = TIFF_ENTRY_LENGTH * fields.size()
				+ TIFF_DIRECTORY_HEADER_LENGTH + TIFF_DIRECTORY_FOOTER_LENGTH;

		totalLength = internalLength;

		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			totalLength += field.getSeperateValueLength();
		}

		if (null != imageDataInfo)
		{
			int imageDataOffset = getOffset() + totalLength;
			totalLength += imageDataInfo.totalLength;
			updateTiffImageDataOffsetsStep(imageDataOffset, byteOrder);
		}

		if (null != rawJpegImageData)
		{
			int imageDataOffset = getOffset() + totalLength;
			totalLength += rawJpegImageData.length;
			totalLength += TiffImageWriterBase
					.imageDataPaddingLength(rawJpegImageData.length);
			updateJpegImageDataOffsetsStep(imageDataOffset, byteOrder);
		}

	}

	public String description()
	{
		return TiffDirectory.description(type);
	}

	public void writeItem(BinaryOutputStream bos) throws IOException,
			ImageWriteException
	{
		// Write Directory Field Count
		bos.write2Bytes(fields.size()); // DirectoryFieldCount

		// Write Fields
		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			field.writeSimple(bos);

//			Debug.debug("\t" + "writing field (" + field.tag + ", 0x" + Integer.toHexString(field.tag) + ")", field.tagInfo);
//			if(field.tagInfo.isOffset())
//				Debug.debug("\t\tOFFSET!", field.bytes);
		}

		int nextDirectoryOffset = 0;
		if (nextDirectory != null)
			nextDirectoryOffset = nextDirectory.getOffset();

		// Write nextDirectoryOffset
		if (nextDirectoryOffset == UNDEFINED_VALUE)
			bos.write4Bytes(0);
		else
			bos.write4Bytes(nextDirectoryOffset);

		//		// Write Seperate Values
		//		for (int i = 0; i < fields.size(); i++)
		//		{
		//			TiffOutputField field = (TiffOutputField) fields.get(i);
		//			field.writeSeperateValue(bos);
		//		}

		//		if (null != rawTiffImageData)
		//		{
		//			byte imageData[][] = rawTiffImageData.getRawImageData();
		//			for (int i = 0; i < imageData.length; i++)
		//			{
		//				bos.writeByteArray(imageData[i]);
		//				int imageDataByteCount = imageData[i].length;
		//
		//				int remainder = TiffImageWriterBase
		//						.imageDataPaddingLength(imageDataByteCount);
		//				for (int j = 0; j < remainder; j++)
		//					bos.write(0);
		//			}
		//		}
		//
		//		if (null != rawJpegImageData)
		//		{
		//			//				byte imageData[][] = rawJpegImageData.getRawImageData();
		//			bos.writeByteArray(rawJpegImageData);
		//			int remainder = TiffImageWriterBase
		//					.imageDataPaddingLength(rawJpegImageData.length);
		//			for (int j = 0; j < remainder; j++)
		//				bos.write(0);
		//		}

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

		int nextSeperateValueOffset = getOffset() + internalLength;

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
		if (nextDirectory != null)
			nextDirectoryOffset = nextDirectory.getOffset();

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

				int remainder = TiffImageWriterBase
						.imageDataPaddingLength(imageDataByteCount);
				for (int j = 0; j < remainder; j++)
					bos.write(0);
			}
		}

		if (null != rawJpegImageData)
		{
			//				byte imageData[][] = rawJpegImageData.getRawImageData();
			bos.writeByteArray(rawJpegImageData);
			int remainder = TiffImageWriterBase
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

			totalLength += TiffImageWriterBase
					.imageDataPaddingLength(imageData[i].length);
		}

		// Append imageData-related fields to first directory
		{
			TagInfo tagInfo;
			if (stripsNotTiles)
				tagInfo = TIFF_TAG_STRIP_OFFSETS;
			else
				tagInfo = TIFF_TAG_TILE_OFFSETS;

			imageDataOffsetsField = findField(tagInfo);
			if (null == imageDataOffsetsField)
			{
				imageDataOffsetsField = new TiffOutputField(tagInfo,
						FIELD_TYPE_LONG, imageDataOffsets.length,
						FIELD_TYPE_LONG.writeData(imageDataOffsets, byteOrder));
				add(imageDataOffsetsField);
			}
		}
		{
			TagInfo tagInfo;
			if (stripsNotTiles)
				tagInfo = TIFF_TAG_STRIP_BYTE_COUNTS;
			else
				tagInfo = TIFF_TAG_TILE_BYTE_COUNTS;

			byte data[] = FIELD_TYPE_LONG.writeData(imageDataByteCounts,
					byteOrder);

			TiffOutputField field = findField(tagInfo);
			if (null == field)
				add(new TiffOutputField(tagInfo, FIELD_TYPE_LONG,
						imageDataByteCounts.length, data));
			else
				field.setData(data);

		}

		imageDataInfo = new ImageDataInfo(imageData, imageDataOffsets,
				imageDataByteCounts, imageDataOffsetsField, totalLength);
	}

	TiffOutputField jpegImageDataOffsetField = null;

	private byte rawJpegImageData[] = null;

	public void setRawJpegImageData(byte rawJpegImageData[])
	{
		this.rawJpegImageData = rawJpegImageData;
	}

	public byte[] getRawJpegImageData()
	{
		return rawJpegImageData;
	}

	private void jpegImageDataInfoStep(int byteOrder)
	{
		if (null == rawJpegImageData)
			return;

		//			int totalLength = 0;
		//			totalLength += rawJpegImageData.length;
		//			totalLength += imageDataPaddingLength(rawJpegImageData.length);

		// Append imageData-related fields to first directory
		{
			TagInfo tagInfo = TIFF_TAG_JPEG_INTERCHANGE_FORMAT;

			jpegImageDataOffsetField = findField(tagInfo);
			if (null == jpegImageDataOffsetField)
			{
				jpegImageDataOffsetField = new TiffOutputField(tagInfo,
						FIELD_TYPE_LONG, 1, FIELD_TYPE_LONG.getStubValue(1));
				add(jpegImageDataOffsetField);
			}
		}
		{
			TagInfo tagInfo = TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH;

			byte data[] = FIELD_TYPE_LONG.writeData(new int[]{
				rawJpegImageData.length,
			}, byteOrder);

			TiffOutputField field = findField(tagInfo);
			if (null == field)
				add(new TiffOutputField(tagInfo, FIELD_TYPE_LONG, 1, data));
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

			currentOffset += TiffImageWriterBase
					.imageDataPaddingLength(imageDataInfo.imageDataByteCounts[i]);
		}

		imageDataInfo.imageDataOffsetsField.setData(FIELD_TYPE_LONG.writeData(
				imageDataInfo.imageDataOffsets, byteOrder));
		//			}
	}

	private void updateJpegImageDataOffsetsStep(final int imageDataOffset,
			int byteOrder) throws IOException, ImageWriteException
	{
		jpegImageDataOffsetField.setData(FIELD_TYPE_LONG.writeData(new int[]{
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

	//		public static final Comparator COMPARATOR = new Comparator()
	//		{
	//			public int compare(Object o1, Object o2)
	//			{
	//				Directory e1 = (Directory) o1;
	//				Directory e2 = (Directory) o2;
	//				return e1.offset - e2.offset;
	//			}
	//		};

	public int getItemLength()
	{
		return TIFF_ENTRY_LENGTH * fields.size() + TIFF_DIRECTORY_HEADER_LENGTH
				+ TIFF_DIRECTORY_FOOTER_LENGTH;
	}

	public String getItemDescription()
	{
		ExifDirectoryType dirType = TagConstantsUtils
				.getExifDirectoryType(type);
		return "Directory: " + dirType.name + " (" + type + ")";
	}

	private void removeFieldIfPresent(TagInfo tagInfo)
	{
		TiffOutputField field = findField(tagInfo);
		if (null != field)
			fields.remove(field);
	}

	protected List getOutputItems(TiffOutputSummary outputSummary)
	{
		// first validate directory fields.
		
		removeFieldIfPresent(TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
		removeFieldIfPresent(TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);

		TiffOutputField jpegOffsetField = null;
		if (null != rawJpegImageData)
		{
			jpegOffsetField = new TiffOutputField(
					TIFF_TAG_JPEG_INTERCHANGE_FORMAT, FIELD_TYPE_LONG, 1,
					FieldType.getStubLocalValue());
			add(jpegOffsetField);

			TiffOutputField jpegLengthField = new TiffOutputField(
					TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, FIELD_TYPE_LONG,
					1, FieldType.getStubLocalValue());
			add(jpegLengthField);

			byte lengthValue[] = FIELD_TYPE_LONG.writeData(new int[]{
				rawJpegImageData.length,
			}, outputSummary.byteOrder);
			jpegLengthField.setData(lengthValue);
		}

		// --------------------------------------------------------------

		removeFieldIfPresent(TIFF_TAG_STRIP_OFFSETS);
		removeFieldIfPresent(TIFF_TAG_STRIP_BYTE_COUNTS);
		removeFieldIfPresent(TIFF_TAG_TILE_OFFSETS);
		removeFieldIfPresent(TIFF_TAG_TILE_BYTE_COUNTS);

		TiffOutputField imageDataOffsetField;
		ImageDataInfo imageDataInfo = null;
		if (null != rawTiffImageData)
		{
			boolean stripsNotTiles = rawTiffImageData.stripsNotTiles();

			TagInfo offsetTag;
			TagInfo byteCountsTag;
			if (stripsNotTiles)
			{
				offsetTag = TIFF_TAG_STRIP_OFFSETS;
				byteCountsTag = TIFF_TAG_STRIP_BYTE_COUNTS;
			}
			else
			{
				offsetTag = TIFF_TAG_TILE_OFFSETS;
				byteCountsTag = TIFF_TAG_TILE_BYTE_COUNTS;
			}

			// --------

			byte imageData[][] = rawTiffImageData.getRawImageData();

			int imageDataOffsets[] = null;
			int imageDataByteCounts[] = null;
			//			TiffOutputField imageDataOffsetsField = null;

			imageDataOffsets = new int[imageData.length];
			imageDataByteCounts = new int[imageData.length];

			int imageDataTotalLength = 0;
			for (int i = 0; i < imageData.length; i++)
			{
				imageDataByteCounts[i] = imageData[i].length;
				imageDataTotalLength += imageData[i].length;

				imageDataTotalLength += TiffImageWriterBase
						.imageDataPaddingLength(imageData[i].length);
			}

			// --------

			// Append imageData-related fields to first directory
			imageDataOffsetField = new TiffOutputField(offsetTag,
					FIELD_TYPE_LONG, imageDataOffsets.length, FIELD_TYPE_LONG
							.writeData(imageDataOffsets,
									outputSummary.byteOrder));
			add(imageDataOffsetField);

			// --------

			byte data[] = FIELD_TYPE_LONG.writeData(imageDataByteCounts,
					outputSummary.byteOrder);
			TiffOutputField byteCountsField = new TiffOutputField(
					byteCountsTag, FIELD_TYPE_LONG, imageDataByteCounts.length,
					data);
			add(byteCountsField);

			// --------

			imageDataInfo = new ImageDataInfo(imageData, imageDataOffsets,
					imageDataByteCounts, imageDataOffsetField,
					imageDataTotalLength);
		}

		// --------------------------------------------------------------

		List result = new ArrayList();
		result.add(this);
		sortFields();

		//		public void calculateLengths(int byteOrder) throws IOException,
		//		ImageWriteException
		//{
		//	tiffImageDataInfoStep(byteOrder);
		//	jpegImageDataInfoStep(byteOrder);
		//
		//	internalLength = TIFF_ENTRY_LENGTH * fields.size()
		//			+ TIFF_DIRECTORY_HEADER_LENGTH
		//			+ TIFF_DIRECTORY_FOOTER_LENGTH;
		//
		//	totalLength = internalLength;
		//
		for (int i = 0; i < fields.size(); i++)
		{
			TiffOutputField field = (TiffOutputField) fields.get(i);
			if (field.isLocalValue())
				continue;

			TiffOutputItem item = field.getSeperateValue();
			result.add(item);
//			outputSummary.add(item, field);
		}

		if (null != imageDataInfo)
		{
			for (int i = 0; i < imageDataInfo.outputItems.length; i++)
				result.add(imageDataInfo.outputItems[i]);

			outputSummary.addTiffImageData(imageDataInfo);
		}

		if (null != rawJpegImageData)
		{
			TiffOutputItem item = new TiffOutputItem.Value("JPEG image data",
					rawJpegImageData);
			result.add(item);
			outputSummary.add(item, jpegOffsetField);
		}

		return result;
	}
}