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
package org.cmc.sanselan.formats.tiff.write;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import org.cmc.sanselan.ImageWriteException;
import org.cmc.sanselan.common.BinaryConstants;
import org.cmc.sanselan.common.BinaryOutputStream;
import org.cmc.sanselan.common.PackBits;
import org.cmc.sanselan.common.mylzw.MyLZWCompressor;
import org.cmc.sanselan.formats.tiff.RawTiffImageData;
import org.cmc.sanselan.formats.tiff.TagInfo;
import org.cmc.sanselan.formats.tiff.TiffConstants;
import org.cmc.sanselan.formats.tiff.TiffDirectory;
import org.cmc.sanselan.util.Debug;
import org.cmc.sanselan.util.DebugOutputStream;

public class TiffImageWriter implements TiffConstants, BinaryConstants
{
	//	public static final int WRITE_BYTE_ORDER = BYTE_ORDER_INTEL;
	public static final int DEFAULT_WRITE_BYTE_ORDER = BYTE_ORDER_INTEL;

	private final int byteOrder;

	public TiffImageWriter()
	{
		this.byteOrder = DEFAULT_WRITE_BYTE_ORDER;
	}

	public TiffImageWriter(int byteOrder)
	{
		this.byteOrder = byteOrder;
	}

	public byte[][] getStrips(BufferedImage src, int fSamplesPerPixel,
			int bitsPerSample, int rowsPerStrip)
	{
		int width = src.getWidth();
		int height = src.getHeight();

		int stripCount = (height + rowsPerStrip - 1) / rowsPerStrip;

		byte result[][] = null;
		{ // Write Strips
			result = new byte[stripCount][];

			int remaining_rows = height;

			for (int i = 0; i < stripCount; i++)
			{
				int rowsInStrip = Math.min(rowsPerStrip, remaining_rows);
				remaining_rows -= rowsInStrip;

				int bitsInStrip = bitsPerSample * rowsInStrip * width
						* fSamplesPerPixel;
				int bytesInStrip = (bitsInStrip + 7) / 8;

				byte uncompressed[] = new byte[bytesInStrip];

				int counter = 0;
				int y = i * rowsPerStrip;
				int stop = i * rowsPerStrip + rowsPerStrip;

				for (; (y < height) && (y < stop); y++)
				{
					for (int x = 0; x < width; x++)
					{
						int rgb = src.getRGB(x, y);
						int red = 0xff & (rgb >> 16);
						int green = 0xff & (rgb >> 8);
						int blue = 0xff & (rgb >> 0);

						uncompressed[counter++] = (byte) red;
						uncompressed[counter++] = (byte) green;
						uncompressed[counter++] = (byte) blue;
					}
				}

				result[i] = uncompressed;
			}

		}

		return result;
	}

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		//		writeImageNew(src, os, params);
		//	}
		//
		//	public void writeImageNew(BufferedImage src, OutputStream os, Map params)
		//			throws ImageWriteException, IOException
		//	{

		// make copy of params; we'll clear keys as we consume them.
		params = new Hashtable(params);

		// clear format key.
		if (params.containsKey(PARAM_KEY_FORMAT))
			params.remove(PARAM_KEY_FORMAT);

		int width = src.getWidth();
		int height = src.getHeight();

		//		BinaryOutputStream bos = new BinaryOutputStream(os, WRITE_BYTE_ORDER);
		//
		//		writeImageFileHeader(bos, WRITE_BYTE_ORDER);

		//		Vector directoryFields = new Vector();

		final int photometricInterpretation = 2; // TODO: 

		int compression = TIFF_COMPRESSION_LZW; // LZW is default
		if (params.containsKey(PARAM_KEY_COMPRESSION))
		{
			Object value = params.get(PARAM_KEY_COMPRESSION);
			if (value != null)
			{
				if (!(value instanceof Number))
					throw new ImageWriteException(
							"Invalid compression parameter: " + value);
				compression = ((Number) value).intValue();
			}
			params.remove(PARAM_KEY_COMPRESSION);
		}

		final int samplesPerPixel = 3; // TODO: 
		final int bitsPerSample = 8; // TODO: 

		//		int fRowsPerStrip; // TODO: 
		int rowsPerStrip = 8000 / (width * samplesPerPixel); // TODO: 
		rowsPerStrip = Math.max(1, rowsPerStrip); // must have at least one.

		byte strips[][] = getStrips(src, samplesPerPixel, bitsPerSample,
				rowsPerStrip);

		//		int stripCount = (height + fRowsPerStrip - 1) / fRowsPerStrip;
		//		int stripCount = strips.length;

		if (params.size() > 0)
		{
			Object firstKey = params.keySet().iterator().next();
			throw new ImageWriteException("Unknown parameter: " + firstKey);
		}

		//		System.out.println("width: " + width);
		//		System.out.println("height: " + height);
		//		System.out.println("fRowsPerStrip: " + fRowsPerStrip);
		//		System.out.println("fSamplesPerPixel: " + fSamplesPerPixel);
		//		System.out.println("stripCount: " + stripCount);

		if (compression == TIFF_COMPRESSION_PACKBITS)
		{
			for (int i = 0; i < strips.length; i++)
				strips[i] = new PackBits().compress(strips[i]);
		}
		else if (compression == TIFF_COMPRESSION_LZW)
		{
			for (int i = 0; i < strips.length; i++)
			{
				byte uncompressed[] = strips[i];

				int LZWMinimumCodeSize = 8;

				MyLZWCompressor compressor = new MyLZWCompressor(
						LZWMinimumCodeSize, BYTE_ORDER_MSB, true);
				byte compressed[] = compressor.compress(uncompressed);

				strips[i] = compressed;
			}
		}
		else if (compression == TIFF_COMPRESSION_UNCOMPRESSED)
		{
			// do nothing.
		}
		else
			throw new ImageWriteException(
					"Invalid compression parameter (Only LZW, Packbits and uncompressed supported).");

		//		int stripOffsets[] = new int[stripCount];
		//		int stripByteCounts[] = new int[stripCount];
		//
		//		for (int i = 0; i < strips.length; i++)
		//			stripByteCounts[i] = strips[i].length;

		Directory directory = new Directory(TiffDirectory.DIRECTORY_TYPE_ROOT);

		//		WriteField stripOffsetsField;

		{
			{
				WriteField field = new WriteField(TIFF_TAG_ImageWidth,
						FIELD_TYPE_LONG, 1, FIELD_TYPE_LONG.writeData(
								new int[]{
									width,
								}, byteOrder));
				directory.add(field);
			}
			{
				WriteField field = new WriteField(TIFF_TAG_ImageLength,
						FIELD_TYPE_LONG, 1, FIELD_TYPE_LONG.writeData(
								new int[]{
									height,
								}, byteOrder));
				directory.add(field);
			}
			{
				WriteField field = new WriteField(
						TIFF_TAG_PhotometricInterpretation, FIELD_TYPE_SHORT,
						1, FIELD_TYPE_SHORT.writeData(new int[]{
							photometricInterpretation,
						}, byteOrder));
				directory.add(field);
			}
			{
				WriteField field = new WriteField(TIFF_TAG_Compression,
						FIELD_TYPE_SHORT, 1, FIELD_TYPE_SHORT.writeData(
								new int[]{
									compression,
								}, byteOrder));
				directory.add(field);
			}
			{
				WriteField field = new WriteField(TIFF_TAG_SamplesPerPixel,
						FIELD_TYPE_SHORT, 1, FIELD_TYPE_SHORT.writeData(
								new int[]{
									samplesPerPixel,
								}, byteOrder));
				directory.add(field);
			}
			{
				WriteField field = new WriteField(TIFF_TAG_BitsPerSample,
						FIELD_TYPE_SHORT, 3, FIELD_TYPE_SHORT.writeData(
								new int[]{
										bitsPerSample, bitsPerSample,
										bitsPerSample,
								}, byteOrder));
				directory.add(field);
			}
			//			{
			//				stripOffsetsField = new WriteField(TIFF_TAG_StripOffsets,
			//						FIELD_TYPE_LONG, stripOffsets.length, FIELD_TYPE_LONG
			//								.writeData(stripOffsets, byteOrder));
			//				directory.add(stripOffsetsField);
			//			}
			//			{
			//				WriteField field = new WriteField(TIFF_TAG_StripByteCounts,
			//						FIELD_TYPE_LONG, stripByteCounts.length,
			//						FIELD_TYPE_LONG.writeData(stripByteCounts,
			//								WRITE_BYTE_ORDER));
			//				directory.add(field);
			//			}
			{
				WriteField field = new WriteField(TIFF_TAG_RowsPerStrip,
						FIELD_TYPE_LONG, 1, FIELD_TYPE_LONG.writeData(
								new int[]{
									rowsPerStrip,
								}, byteOrder));
				directory.add(field);
			}

			{
				int resolutionUnit = 2;// inches.
				WriteField field = new WriteField(TIFF_TAG_ResolutionUnit,
						FIELD_TYPE_SHORT, 1, FIELD_TYPE_SHORT.writeData(
								new int[]{
									resolutionUnit,
								}, byteOrder));
				directory.add(field);
			}

			{
				int xResolution = 72;
				WriteField field = new WriteField(TIFF_TAG_XResolution,
						FIELD_TYPE_RATIONAL, 1, FIELD_TYPE_RATIONAL.writeData(
								xResolution, 1, byteOrder));
				directory.add(field);
			}

			{
				int yResolution = 72;
				WriteField field = new WriteField(TIFF_TAG_YResolution,
						FIELD_TYPE_RATIONAL, 1, FIELD_TYPE_RATIONAL.writeData(
								yResolution, 1, byteOrder));
				directory.add(field);
			}

		}

		RawTiffImageData rawTiffImageData = new RawTiffImageData.Strips(strips);
		directory.setRawTiffImageData(rawTiffImageData);

		Vector directories = new Vector();
		directories.add(directory);

		writeDirectories(os, directories);
	}

	private void writeImageFileHeader(BinaryOutputStream bos)
			throws IOException, ImageWriteException
	{
		bos.write(byteOrder);
		bos.write(byteOrder);

		bos.write2Bytes(42); // tiffVersion

		int foffsetToFirstIFD = TIFF_HEADER_SIZE;

		bos.write4Bytes(foffsetToFirstIFD);
	}

	public static final class Directory
	{
		public static final int UNDEFINED_VALUE = -1;

		public final int type;
		public int internalLength = UNDEFINED_VALUE;
		public int totalLength = UNDEFINED_VALUE;
		public int offset = UNDEFINED_VALUE;
		public int nextDirectoryOffset = UNDEFINED_VALUE;
		private final Vector fields = new Vector();

		public Directory(final int type)
		{
			this.type = type;
		}

		public void add(WriteField field)
		{
			fields.add(field);
		}

		public Vector getFields()
		{
			return new Vector(fields);
		}

		public WriteField findField(TagInfo tagInfo)
		{
			for (int i = 0; i < fields.size(); i++)
			{
				WriteField field = (WriteField) fields.get(i);
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
					WriteField e1 = (WriteField) o1;
					WriteField e2 = (WriteField) o2;

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

			internalLength = TIFF_ENTRY_LENGTH * fields.size()
					+ TIFF_DIRECTORY_HEADER_LENGTH
					+ TIFF_DIRECTORY_FOOTER_LENGTH;

			totalLength = internalLength;

			for (int i = 0; i < fields.size(); i++)
			{
				WriteField field = (WriteField) fields.get(i);
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
				totalLength += imageDataPaddingLength(rawJpegImageData.length);
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
				WriteField field = (WriteField) fields.get(i);
				//				checkOffset("ifd [" + i + "]", fOffsetToSeperateValues);
				nextSeperateValueOffset += field.writeDirectoryEntry(bos,
						nextSeperateValueOffset);
			}

			// Write nextDirectoryOffset
			if (nextDirectoryOffset == UNDEFINED_VALUE)
				bos.write4Bytes(0);
			else
				bos.write4Bytes(nextDirectoryOffset);

			// Write Seperate Values
			for (int i = 0; i < fields.size(); i++)
			{
				WriteField field = (WriteField) fields.get(i);
				field.writeSeperateValue(bos);
			}

			if (null != rawTiffImageData)
			{
				byte imageData[][] = rawTiffImageData.getRawImageData();
				for (int i = 0; i < imageData.length; i++)
				{
					bos.writeByteArray(imageData[i]);
					int imageDataByteCount = imageData[i].length;

					int remainder = imageDataPaddingLength(imageDataByteCount);
					for (int j = 0; j < remainder; j++)
						bos.write(0);
				}
			}

			if (null != rawJpegImageData)
			{
				//				byte imageData[][] = rawJpegImageData.getRawImageData();
				bos.writeByteArray(rawJpegImageData);
				int remainder = imageDataPaddingLength(rawJpegImageData.length);
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
			WriteField imageDataOffsetsField = null;

			imageDataOffsets = new int[imageData.length];
			imageDataByteCounts = new int[imageData.length];

			int totalLength = 0;
			for (int i = 0; i < imageData.length; i++)
			{
				imageDataByteCounts[i] = imageData[i].length;
				totalLength += imageData[i].length;

				totalLength += imageDataPaddingLength(imageData[i].length);
			}

			// Append imageData-related fields to first directory
			{
				TagInfo tagInfo;
				if (stripsNotTiles)
					tagInfo = TIFF_TAG_StripOffsets;
				else
					tagInfo = TIFF_TAG_TileOffsets;

				imageDataOffsetsField = findField(tagInfo);
				if (null == imageDataOffsetsField)
				{
					imageDataOffsetsField = new WriteField(tagInfo,
							FIELD_TYPE_LONG, imageDataOffsets.length,
							FIELD_TYPE_LONG.writeData(imageDataOffsets,
									byteOrder));
					add(imageDataOffsetsField);
				}
			}
			{
				TagInfo tagInfo;
				if (stripsNotTiles)
					tagInfo = TIFF_TAG_StripByteCounts;
				else
					tagInfo = TIFF_TAG_TileByteCounts;

				byte data[] = FIELD_TYPE_LONG.writeData(imageDataByteCounts,
						byteOrder);

				WriteField field = findField(tagInfo);
				if (null == field)
					add(new WriteField(tagInfo, FIELD_TYPE_LONG,
							imageDataByteCounts.length, data));
				else
					field.setData(data);

			}

			imageDataInfo = new ImageDataInfo(imageData, imageDataOffsets,
					imageDataByteCounts, imageDataOffsetsField, totalLength);
		}

		WriteField jpegImageDataOffsetField = null;

		private void jpegImageDataInfoStep(int byteOrder)
		{
			if (null == rawJpegImageData)
				return;

			//			int totalLength = 0;
			//			totalLength += rawJpegImageData.length;
			//			totalLength += imageDataPaddingLength(rawJpegImageData.length);

			// Append imageData-related fields to first directory
			{
				TagInfo tagInfo = TIFF_TAG_JPEGInterchangeFormat;

				jpegImageDataOffsetField = findField(tagInfo);
				if (null == jpegImageDataOffsetField)
				{
					jpegImageDataOffsetField = new WriteField(tagInfo,
							FIELD_TYPE_LONG, 1, FIELD_TYPE_LONG.writeData(
									new int[]{
										0,
									}, byteOrder));
					add(jpegImageDataOffsetField);
				}
			}
			{
				TagInfo tagInfo = TIFF_TAG_JPEGInterchangeFormatLength;

				byte data[] = FIELD_TYPE_LONG.writeData(new int[]{
					rawJpegImageData.length,
				}, byteOrder);

				WriteField field = findField(tagInfo);
				if (null == field)
					add(new WriteField(tagInfo, FIELD_TYPE_LONG, 1, data));
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

				currentOffset += imageDataPaddingLength(imageDataInfo.imageDataByteCounts[i]);
			}

			imageDataInfo.imageDataOffsetsField.setData(FIELD_TYPE_LONG
					.writeData(imageDataInfo.imageDataOffsets, byteOrder));
			//			}
		}

		private void updateJpegImageDataOffsetsStep(final int imageDataOffset,
				int byteOrder) throws IOException, ImageWriteException
		{
			jpegImageDataOffsetField.setData(FIELD_TYPE_LONG.writeData(
					new int[]{
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

	private static int imageDataPaddingLength(int dataLength)
	{
		return (4 - (dataLength % 4)) % 4;
	}

	private Directory findDirectoryByType(Vector directories, int type)
	{
		for (int i = 0; i < directories.size(); i++)
		{
			Directory directory = (Directory) directories.get(i);
			if (directory.type == type)
				return directory;
		}
		return null;
	}

	public void writeDirectories(OutputStream os, Vector directories
	//			,
	//			byte imageData[][], boolean stripsNotTiles
	) throws IOException, ImageWriteException
	{
		//		Collections.sort(directories, Directory.COMPARATOR);

		/**/

		//		ImageDataInfo imageDataInfo = imageDataInfoStep(directories, imageData,
		//				stripsNotTiles);
		/**/

		PointerDirectoriesInfo pointerDirectoriesInfo = pointerDirectoriesStep(directories);

		/**/

		//		final int imageDataOffset = 
		calculateLengthsAndOffsetsStep(directories);

		/**/

		updateDirectoryPointersStep(pointerDirectoriesInfo);

		/**/

		//		updateImageDataOffsetsStep(imageDataInfo, imageDataOffset);
		/**/

		DebugOutputStream dos = null;
		//		DebugOutputStream dos = new DebugOutputStream(os);
		//		os = dos;
		BinaryOutputStream bos = new BinaryOutputStream(os, byteOrder);

		/**/

		writeStep(bos, directories, dos);

		/**/

		//		writeImageDataStep(bos, directories, imageDataInfo);
		/**/
	}

	private static class PointerDirectoriesInfo
	{
		public final WriteField exifDirectoryOffsetField;
		public final Directory exifDirectory;
		public final WriteField gpsDirectoryOffsetField;
		public final Directory gpsDirectory;
		public final WriteField iteroperabilityDirectoryOffsetField;
		public final Directory iteroperabilityDirectory;

		public PointerDirectoriesInfo(
				final WriteField exifDirectoryOffsetField,
				final Directory exifDirectory,
				final WriteField gpsDirectoryOffsetField,
				final Directory gpsDirectory,
				final WriteField iteroperabilityDirectoryOffsetField,
				final Directory iteroperabilityDirectory)
		{
			this.exifDirectoryOffsetField = exifDirectoryOffsetField;
			this.exifDirectory = exifDirectory;
			this.gpsDirectoryOffsetField = gpsDirectoryOffsetField;
			this.gpsDirectory = gpsDirectory;
			this.iteroperabilityDirectoryOffsetField = iteroperabilityDirectoryOffsetField;
			this.iteroperabilityDirectory = iteroperabilityDirectory;
		}

	}

	private PointerDirectoriesInfo pointerDirectoriesStep(Vector directories)
			throws ImageWriteException
	{
		Directory firstDirectory = (Directory) directories.get(0);

		WriteField exifDirectoryOffsetField = null;
		Directory exifDirectory = findDirectoryByType(directories,
				TiffDirectory.DIRECTORY_TYPE_EXIF);
		if (null != exifDirectory)
		{
			exifDirectoryOffsetField = firstDirectory
					.findField(TIFF_TAG_Exif_IFD_Pointer);

			if (null == exifDirectoryOffsetField)
			{
				exifDirectoryOffsetField = new WriteField(
						TIFF_TAG_Exif_IFD_Pointer, FIELD_TYPE_LONG, 1,
						FIELD_TYPE_LONG.writeData(new int[]{
							0,
						}, byteOrder));
				firstDirectory.add(exifDirectoryOffsetField);
			}
		}

		WriteField gpsDirectoryOffsetField = null;
		Directory gpsDirectory = findDirectoryByType(directories,
				TiffDirectory.DIRECTORY_TYPE_GPS);
		if (null != gpsDirectory)
		{
			gpsDirectoryOffsetField = firstDirectory
					.findField(TIFF_TAG_GPSInfo_IFD_Pointer);
			if (null == gpsDirectoryOffsetField)
			{
				gpsDirectoryOffsetField = new WriteField(
						TIFF_TAG_GPSInfo_IFD_Pointer, FIELD_TYPE_LONG, 1,
						FIELD_TYPE_LONG.writeData(new int[]{
							0,
						}, byteOrder));
				firstDirectory.add(gpsDirectoryOffsetField);
			}
		}

		WriteField iteroperabilityDirectoryOffsetField = null;
		Directory iteroperabilityDirectory = findDirectoryByType(directories,
				TiffDirectory.DIRECTORY_TYPE_INTEROPERABILITY);
		if (null != iteroperabilityDirectory)
		{
			if (null == exifDirectory)
				throw new ImageWriteException(
						"Can't write iteroperability directory without EXIF directory.");

			iteroperabilityDirectoryOffsetField = exifDirectory
					.findField(TIFF_TAG_Interoperability_IFD_Pointer);
			if (null == iteroperabilityDirectoryOffsetField)
			{
				iteroperabilityDirectoryOffsetField = new WriteField(
						TIFF_TAG_Interoperability_IFD_Pointer, FIELD_TYPE_LONG,
						1, FIELD_TYPE_LONG.writeData(new int[]{
							0,
						}, byteOrder));
				exifDirectory.add(iteroperabilityDirectoryOffsetField);
			}
		}

		return new PointerDirectoriesInfo(exifDirectoryOffsetField,
				exifDirectory, gpsDirectoryOffsetField, gpsDirectory,
				iteroperabilityDirectoryOffsetField, iteroperabilityDirectory);

	}
	private static class ImageDataInfo
	{
		public final byte imageData[][];
		public final int imageDataOffsets[];
		public final int imageDataByteCounts[];
		public final WriteField imageDataOffsetsField;
		public final int totalLength;

		public ImageDataInfo(final byte[][] imageData,
				final int[] imageDataOffsets, final int[] imageDataByteCounts,
				final WriteField imageDataOffsetsField, final int totalLength)
		{
			this.imageData = imageData;
			this.imageDataOffsets = imageDataOffsets;
			this.imageDataByteCounts = imageDataByteCounts;
			this.imageDataOffsetsField = imageDataOffsetsField;
			this.totalLength = totalLength;
		}

	}

	private void calculateLengthsAndOffsetsStep(Vector directories)
			throws IOException, ImageWriteException
	//	private int calculateLengthsAndOffsetsStep(Vector directories)
	{
		// Calculate lengths and offsets
		int offset = TIFF_HEADER_SIZE;

		Directory previousDirectory = null;
		for (int i = 0; i < directories.size(); i++)
		{
			Directory directory = (Directory) directories.get(i);

			// fields must be written in ascending order.
			directory.sortFields();

			directory.offset = offset;

			if (directory.type == TiffDirectory.DIRECTORY_TYPE_EXIF
					|| directory.type == TiffDirectory.DIRECTORY_TYPE_GPS
					|| directory.type == TiffDirectory.DIRECTORY_TYPE_INTEROPERABILITY)
			{
				// "pointer" directories don't partcipate in normal TIFF directory chain.
				directory.calculateLengths(byteOrder);
				offset += directory.totalLength;
			}
			else
			{
				if (null != previousDirectory)
					previousDirectory.nextDirectoryOffset = offset;

				directory.calculateLengths(byteOrder);
				offset += directory.totalLength;

				previousDirectory = directory;
			}
		}
		//		return offset;
	}

	private void updateDirectoryPointersStep(
			PointerDirectoriesInfo pointerDirectoriesInfo)
	{
		if (null != pointerDirectoriesInfo.exifDirectory)
		{
			byte value[] = FIELD_TYPE_LONG.writeData(new int[]{
				pointerDirectoriesInfo.exifDirectory.offset,
			}, byteOrder);
			pointerDirectoriesInfo.exifDirectoryOffsetField.setData(value);
		}

		if (null != pointerDirectoriesInfo.gpsDirectory)
		{
			byte value[] = FIELD_TYPE_LONG.writeData(new int[]{
				pointerDirectoriesInfo.gpsDirectory.offset,
			}, byteOrder);
			pointerDirectoriesInfo.gpsDirectoryOffsetField.setData(value);
		}

		if (null != pointerDirectoriesInfo.iteroperabilityDirectory)
		{
			byte value[] = FIELD_TYPE_LONG.writeData(new int[]{
				pointerDirectoriesInfo.iteroperabilityDirectory.offset,
			}, byteOrder);
			pointerDirectoriesInfo.iteroperabilityDirectoryOffsetField
					.setData(value);
		}
	}

	private void writeStep(BinaryOutputStream bos, Vector directories,
			DebugOutputStream dos) throws IOException, ImageWriteException
	{
		writeImageFileHeader(bos);

		long count, lastCount = 0;

		if (null != dos)
		{
			count = dos.count();
			Debug.debug("image header" + " start: " + lastCount + ", end: "
					+ dos.count() + ", length: " + (count - lastCount));
			lastCount = count;
		}

		for (int i = 0; i < directories.size(); i++)
		{
			Directory directory = (Directory) directories.get(i);
			directory.write(bos);

			if (null != dos)
			{
				count = dos.count();
				Debug.debug("directory("
						+ TiffDirectory.description(directory.type) + ")"
						+ " start: " + lastCount + ", end: " + dos.count()
						+ ", length: " + (count - lastCount)
						+ ", expected length: " + directory.totalLength);
				lastCount = count;
			}
		}
	}

}
