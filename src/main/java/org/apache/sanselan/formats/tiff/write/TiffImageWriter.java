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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.common.PackBits;
import org.apache.sanselan.common.mylzw.MyLZWCompressor;
import org.apache.sanselan.formats.tiff.RawTiffImageData;
import org.apache.sanselan.formats.tiff.TiffDirectory;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.constants.TagInfo2;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.DebugOutputStream;

public class TiffImageWriter extends TiffImageWriterBase
{

	public TiffImageWriter()
	{
	}

	public TiffImageWriter(int byteOrder)
	{
		super(byteOrder);
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
		//        writeImageNew(src, os, params);
		//    }
		//
		//    public void writeImageNew(BufferedImage src, OutputStream os, Map params)
		//            throws ImageWriteException, IOException
		//    {

		// make copy of params; we'll clear keys as we consume them.
		params = new HashMap(params);

		// clear format key.
		if (params.containsKey(PARAM_KEY_FORMAT))
			params.remove(PARAM_KEY_FORMAT);

		int width = src.getWidth();
		int height = src.getHeight();

		//        BinaryOutputStream bos = new BinaryOutputStream(os, WRITE_BYTE_ORDER);
		//
		//        writeImageFileHeader(bos, WRITE_BYTE_ORDER);

		//        ArrayList directoryFields = new ArrayList();

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

		//        int fRowsPerStrip; // TODO: 
		int rowsPerStrip = 8000 / (width * samplesPerPixel); // TODO: 
		rowsPerStrip = Math.max(1, rowsPerStrip); // must have at least one.

		byte strips[][] = getStrips(src, samplesPerPixel, bitsPerSample,
				rowsPerStrip);

		//        int stripCount = (height + fRowsPerStrip - 1) / fRowsPerStrip;
		//        int stripCount = strips.length;

		if (params.size() > 0)
		{
			Object firstKey = params.keySet().iterator().next();
			throw new ImageWriteException("Unknown parameter: " + firstKey);
		}

		//        System.out.println("width: " + width);
		//        System.out.println("height: " + height);
		//        System.out.println("fRowsPerStrip: " + fRowsPerStrip);
		//        System.out.println("fSamplesPerPixel: " + fSamplesPerPixel);
		//        System.out.println("stripCount: " + stripCount);

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

		//        int stripOffsets[] = new int[stripCount];
		//        int stripByteCounts[] = new int[stripCount];
		//
		//        for (int i = 0; i < strips.length; i++)
		//            stripByteCounts[i] = strips[i].length;

		TiffOutputDirectory directory = new TiffOutputDirectory(
				TiffDirectory.DIRECTORY_TYPE_ROOT);

		//        WriteField stripOffsetsField;

		{
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_IMAGE_WIDTH, FIELD_TYPE_LONG, 1,
						FIELD_TYPE_LONG.writeData(new int[]{
							width,
						}, byteOrder));
				directory.add(field);
			}
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_IMAGE_LENGTH, FIELD_TYPE_LONG, 1,
						FIELD_TYPE_LONG.writeData(new int[]{
							height,
						}, byteOrder));
				directory.add(field);
			}
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_PHOTOMETRIC_INTERPRETATION, FIELD_TYPE_SHORT,
						1, FIELD_TYPE_SHORT.writeData(new int[]{
							photometricInterpretation,
						}, byteOrder));
				directory.add(field);
			}
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_COMPRESSION, FIELD_TYPE_SHORT, 1,
						FIELD_TYPE_SHORT.writeData(new int[]{
							compression,
						}, byteOrder));
				directory.add(field);
			}
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_SAMPLES_PER_PIXEL, FIELD_TYPE_SHORT, 1,
						FIELD_TYPE_SHORT.writeData(new int[]{
							samplesPerPixel,
						}, byteOrder));
				directory.add(field);
			}
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_BITS_PER_SAMPLE, FIELD_TYPE_SHORT, 3,
						FIELD_TYPE_SHORT.writeData(new int[]{
								bitsPerSample, bitsPerSample, bitsPerSample,
						}, byteOrder));
				directory.add(field);
			}
			//            {
			//                stripOffsetsField = new WriteField(TIFF_TAG_STRIP_OFFSETS,
			//                        FIELD_TYPE_LONG, stripOffsets.length, FIELD_TYPE_LONG
			//                                .writeData(stripOffsets, byteOrder));
			//                directory.add(stripOffsetsField);
			//            }
			//            {
			//                WriteField field = new WriteField(TIFF_TAG_STRIP_BYTE_COUNTS,
			//                        FIELD_TYPE_LONG, stripByteCounts.length,
			//                        FIELD_TYPE_LONG.writeData(stripByteCounts,
			//                                WRITE_BYTE_ORDER));
			//                directory.add(field);
			//            }
			{
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_ROWS_PER_STRIP, FIELD_TYPE_LONG, 1,
						FIELD_TYPE_LONG.writeData(new int[]{
							rowsPerStrip,
						}, byteOrder));
				directory.add(field);
			}

			{
				int resolutionUnit = 2;// inches.
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_RESOLUTION_UNIT, FIELD_TYPE_SHORT, 1,
						FIELD_TYPE_SHORT.writeData(new int[]{
							resolutionUnit,
						}, byteOrder));
				directory.add(field);
			}

			{
				int xResolution = 72;
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_XRESOLUTION, FIELD_TYPE_RATIONAL, 1,
						FIELD_TYPE_RATIONAL
								.writeData(xResolution, 1, byteOrder));
				directory.add(field);
			}

			{
				int yResolution = 72;
				TiffOutputField field = new TiffOutputField(
						TIFF_TAG_YRESOLUTION, FIELD_TYPE_RATIONAL, 1,
						FIELD_TYPE_RATIONAL
								.writeData(yResolution, 1, byteOrder));
				directory.add(field);
			}

		}

		RawTiffImageData rawTiffImageData = new RawTiffImageData.Strips(strips);
		directory.setRawTiffImageData(rawTiffImageData);

		ArrayList directories = new ArrayList();
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

	static int imageDataPaddingLength(int dataLength)
	{
		return (4 - (dataLength % 4)) % 4;
	}

	private TiffOutputDirectory findDirectoryByType(List directories, int type)
	{
		for (int i = 0; i < directories.size(); i++)
		{
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);
			if (directory.type == type)
				return directory;
		}
		return null;
	}

	private PointerDirectoriesInfo validateDirectories(List directories)
			throws ImageWriteException
	{
		if (1 > directories.size())
			throw new ImageWriteException("No directories.");

		TiffOutputDirectory exifDirectory = null;
		TiffOutputDirectory gpsDirectory = null;
		TiffOutputDirectory interoperabilityDirectory = null;
		TiffOutputField exifDirectoryOffsetField = null;
		TiffOutputField gpsDirectoryOffsetField = null;
		TiffOutputField interoperabilityDirectoryOffsetField = null;

		ArrayList directoryIndices = new ArrayList();
		Map dirMap = new HashMap();
		for (int i = 0; i < directories.size(); i++)
		{
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);
			int dirType = directory.type;
			Integer key = new Integer(dirType);
			dirMap.put(key, directory);
			//			Debug.debug("validating dirType", dirType + " ("
			//					+ directory.getFields().size() + " fields)");

			if (dirType < 0)
			{
				switch (dirType)
				{
					case DIRECTORY_TYPE_EXIF :
						if (exifDirectory != null)
							throw new ImageWriteException(
									"More than one EXIF directory.");
						exifDirectory = directory;
						break;

					case DIRECTORY_TYPE_GPS :
						if (gpsDirectory != null)
							throw new ImageWriteException(
									"More than one GPS directory.");
						gpsDirectory = directory;
						break;

					case DIRECTORY_TYPE_INTEROPERABILITY :
						if (interoperabilityDirectory != null)
							throw new ImageWriteException(
									"More than one Interoperability directory.");
						interoperabilityDirectory = directory;
						break;
					default :
						throw new ImageWriteException("Unknown directory: "
								+ dirType);
				}
			}
			else
			{
				if (directoryIndices.contains(key))
					throw new ImageWriteException(
							"More than one directory with index: " + dirType
									+ ".");
				directoryIndices.add(new Integer(dirType));
				//				dirMap.put(arg0, arg1)
			}

			ArrayList fields = directory.getFields();
			for (int j = 0; j < fields.size(); j++)
			{
				TiffOutputField field = (TiffOutputField) fields.get(j);
				if (field.tagInfo.tag == EXIF_TAG_EXIF_OFFSET.tag)
				{
					if (exifDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one Exif directory offset field.");
					exifDirectoryOffsetField = field;
				}
				else if (field.tagInfo.tag == EXIF_TAG_INTEROP_OFFSET.tag)
				{
					if (interoperabilityDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one Interoperability directory offset field.");
					interoperabilityDirectoryOffsetField = field;
				}
				else if (field.tagInfo.tag == EXIF_TAG_GPSINFO.tag)
				{
					if (gpsDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one GPS directory offset field.");
					gpsDirectoryOffsetField = field;
				}
			}
			//			directory.
		}

		if (directoryIndices.size() < 1)
			throw new ImageWriteException("Missing root directory.");

		// "normal" TIFF directories should have continous indices starting with 0, ie. 0, 1, 2...
		Collections.sort(directoryIndices);
		for (int i = 0; i < directoryIndices.size(); i++)
		{
			Integer index = (Integer) directoryIndices.get(i);
			if (index.intValue() != i)
				throw new ImageWriteException("Missing directory: " + i + ".");
		}

		TiffOutputDirectory rootDirectory = (TiffOutputDirectory) dirMap
				.get(new Integer(DIRECTORY_TYPE_ROOT));


		if (exifDirectory == null && exifDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has Exif Directory Offset field, but no Exif Directory");
		}
		else if (exifDirectory != null && exifDirectoryOffsetField == null)
		{
			exifDirectoryOffsetField = TiffOutputField.createOffsetField(
					EXIF_TAG_EXIF_OFFSET, byteOrder);
			rootDirectory.add(exifDirectoryOffsetField);
		}

		if (gpsDirectory == null && gpsDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has GPS Directory Offset field, but no GPS Directory");
		}
		else if (gpsDirectory != null && gpsDirectoryOffsetField == null)
		{
			gpsDirectoryOffsetField = TiffOutputField.createOffsetField(
					EXIF_TAG_GPSINFO, byteOrder);
			rootDirectory.add(gpsDirectoryOffsetField);
		}
		

		if (interoperabilityDirectory == null && interoperabilityDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has Interoperability Directory Offset field, but no Interoperability Directory");
		}
		else if (interoperabilityDirectory != null && interoperabilityDirectoryOffsetField == null)
		{
			interoperabilityDirectoryOffsetField = TiffOutputField.createOffsetField(
					EXIF_TAG_INTEROP_OFFSET, byteOrder);
			rootDirectory.add(interoperabilityDirectoryOffsetField);
		}
		
		return new PointerDirectoriesInfo(exifDirectoryOffsetField,
				exifDirectory, gpsDirectoryOffsetField, gpsDirectory,
				interoperabilityDirectoryOffsetField, interoperabilityDirectory);

		//		Debug.debug();
	}

	public void writeDirectories(OutputStream os, List directories)
			throws IOException, ImageWriteException
	{

		PointerDirectoriesInfo pointerDirectoriesInfo = 	validateDirectories(directories);

		//        Collections.sort(directories, Directory.COMPARATOR);

		/**/

		//        ImageDataInfo imageDataInfo = imageDataInfoStep(directories, imageData,
		//                stripsNotTiles);
		/**/

//		PointerDirectoriesInfo pointerDirectoriesInfo = pointerDirectoriesStep(directories);

		/**/

		//        final int imageDataOffset = 
		calculateLengthsAndOffsetsStep(directories);

		/**/

		updateDirectoryPointersStep(pointerDirectoriesInfo);

		/**/

		//        updateImageDataOffsetsStep(imageDataInfo, imageDataOffset);
		/**/

		DebugOutputStream dos = null;
		//        DebugOutputStream dos = new DebugOutputStream(os);
		//        os = dos;
		BinaryOutputStream bos = new BinaryOutputStream(os, byteOrder);

		/**/

		writeStep(bos, directories, dos);

		/**/

		//        writeImageDataStep(bos, directories, imageDataInfo);
		/**/
	}



	private void calculateLengthsAndOffsetsStep(List directories)
			throws IOException, ImageWriteException
	//    private int calculateLengthsAndOffsetsStep(ArrayList directories)
	{
		// Calculate lengths and offsets
		int offset = TIFF_HEADER_SIZE;

		TiffOutputDirectory previousDirectory = null;
		for (int i = 0; i < directories.size(); i++)
		{
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);

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
		//        return offset;
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

		if (null != pointerDirectoriesInfo.interoperabilityDirectory)
		{
			byte value[] = FIELD_TYPE_LONG.writeData(new int[]{
				pointerDirectoriesInfo.interoperabilityDirectory.offset,
			}, byteOrder);
			pointerDirectoriesInfo.interoperabilityDirectoryOffsetField
					.setData(value);
		}
	}

	private void writeStep(BinaryOutputStream bos, List directories,
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
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);
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
