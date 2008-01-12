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
package org.apache.sanselan.formats.jpeg.exifRewrite;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryFileFunctions;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.jpeg.JpegConstants;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.formats.jpeg.segments.GenericSegment;
import org.apache.sanselan.formats.jpeg.segments.UnknownSegment;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterBase;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossless;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossy;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.util.Debug;

public class ExifRewriter extends BinaryFileParser implements JpegConstants
{
	public ExifRewriter()
	{
		setByteOrder(BYTE_ORDER_NETWORK);
	}

	private static class JFIFPieces
	{
		public final ArrayList pieces;
		public final GenericSegment exifSegment;

		public JFIFPieces(final ArrayList pieces,
				final GenericSegment exifSegment)
		{
			this.pieces = pieces;
			this.exifSegment = exifSegment;
		}
	}

	private JFIFPieces analyzeJFIF(ByteSource byteSource)
			throws ImageReadException, IOException
	//			, ImageWriteException
	{
		final ArrayList pieces = new ArrayList();
		final GenericSegment exifSegmentArray[] = new GenericSegment[]{
			null,
		};

		JpegUtils.Visitor visitor = new JpegUtils.Visitor()
		{
			// return false to exit before reading image data.
			public boolean beginSOS()
			{
				return true;
			}

			public void visitSOS(int marker, byte markerBytes[],
					byte imageData[])
			{
				pieces.add(markerBytes);
				pieces.add(imageData);
			}

			// return false to exit traversal.
			public boolean visitSegment(int marker, byte markerBytes[],
					int markerLength, byte markerLengthBytes[],
					byte segmentData[]) throws
			//					ImageWriteException,
					ImageReadException, IOException
			{
				if (marker != JPEG_APP1_Marker)
				{
					pieces.add(markerBytes);
					pieces.add(markerLengthBytes);
					pieces.add(segmentData);
				}
				else if (!byteArrayHasPrefix(segmentData, ExifIdentifierCode))
				{
					pieces.add(markerBytes);
					pieces.add(markerLengthBytes);
					pieces.add(segmentData);
				}
				else if (exifSegmentArray[0] != null)
				{
					// TODO: add support for multiple segments
					throw new ImageReadException(
							"More than one APP1 EXIF segment.");
				}
				else
				{
					UnknownSegment segment = new UnknownSegment(marker,
							segmentData);

					exifSegmentArray[0] = segment;
					pieces.add(segment);
				}
				return true;
			}
		};

		new JpegUtils().traverseJFIF(byteSource, visitor);

		GenericSegment exifSegment = exifSegmentArray[0];
		if (exifSegment == null)
		{
			// TODO: add support for adding, not just replacing.
			throw new ImageReadException("No APP1 EXIF segment found.");
		}

		return new JFIFPieces(pieces, exifSegment);
	}

	public void removeExifMetadata(ByteSource byteSource, OutputStream os,
			Map params) throws ImageReadException, IOException,
			ImageWriteException
	{
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;

		pieces.remove(jfifPieces.exifSegment);
		//		List filtered = new ArrayList();

		writeSegmentsReplacingExif(os, pieces, null);
	}

	//	private static final int MODE_LOSSY = -1;
	//	private static final int MODE_LOSSLESS = -2;

	public void updateExifMetadataLossless(ByteSource byteSource,
			OutputStream os, TiffOutputSet outputSet)
			throws ImageReadException, IOException, ImageWriteException
	{
		//		List outputDirectories = outputSet.getDirectories();
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;
		GenericSegment exifSegment = jfifPieces.exifSegment;

		byte exifBytes[] = exifSegment.bytes;
		exifBytes = getByteArrayTail("trimmed exif bytes", exifBytes, 6);

		TiffImageWriterBase writer = new TiffImageWriterLossless(
				outputSet.byteOrder, exifBytes);

		boolean includeEXIFPrefix = true;
		byte newBytes[] = writeExifSegment(writer, outputSet, includeEXIFPrefix);

//		Debug.debug("oldBytes", exifBytes.length);
//		Debug.debug("newBytes", newBytes.length);
//		Debug.debug("oldBytes", BinaryFileFunctions.head(exifBytes, 10));
//		Debug.debug("newBytes", newBytes);

		writeSegmentsReplacingExif(os, pieces, newBytes);
	}

	public void updateExifMetadataLossy(ByteSource byteSource, OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;

		TiffImageWriterBase writer = new TiffImageWriterLossy(
				outputSet.byteOrder);

		boolean includeEXIFPrefix = true;
		byte newBytes[] = writeExifSegment(writer, outputSet, includeEXIFPrefix);

		writeSegmentsReplacingExif(os, pieces, newBytes);
	}

	private void writeSegmentsReplacingExif(OutputStream os,
			ArrayList segments, byte newBytes[]) throws ImageWriteException,
			IOException
	{
		int byteOrder = getByteOrder();

		try
		{
			os.write(SOI);

			for (int i = 0; i < segments.size(); i++)
			{
				Object o = segments.get(i);
				if (o instanceof byte[])
				{
					byte bytes[] = (byte[]) o;
					os.write(bytes);
				}
				else if (o instanceof GenericSegment)
				{
					byte markerBytes[] = convertShortToByteArray(
							JPEG_APP1_Marker, byteOrder);
					os.write(markerBytes);

					if (newBytes.length > 0xffff)
						throw new ImageWriteException(
								"APP1 Segment is too long: " + newBytes.length);

					int markerLength = newBytes.length + 2;
					byte markerLengthBytes[] = convertShortToByteArray(
							markerLength, byteOrder);
					os.write(markerLengthBytes);

					os.write(newBytes);
				}
				else
					throw new ImageWriteException("Unknown data: " + o);
			}
		}
		finally
		{
			try
			{
				os.close();
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}
		}
	}

	//
	//	private byte[] writeExifSegment(int mode, TiffOutputSet outputSet,
	//			boolean includeEXIFPrefix) throws IOException, ImageWriteException
	//	{
	//		TiffImageWriterBase writer;
	//		if (mode == MODE_LOSSLESS)
	//			writer = new TiffImageWriterLossless(outputSet.byteOrder);
	//		else if (mode == MODE_LOSSY)
	//			writer = new TiffImageWriterLossy(outputSet.byteOrder);
	//		//		writer = new TiffImageWriterLossy(outputSet.byteOrder);
	//		else
	//			throw new ImageWriteException("Unknown TIFF write mode.");
	//
	//		return writeExifSegment(writer, outputSet, includeEXIFPrefix);
	//	}

	private byte[] writeExifSegment(TiffImageWriterBase writer,
			TiffOutputSet outputSet, boolean includeEXIFPrefix)
			throws IOException, ImageWriteException
	{
		ByteArrayOutputStream os = new ByteArrayOutputStream();

		if (includeEXIFPrefix)
		{
			os.write(ExifIdentifierCode);
			os.write(0);
			os.write(0);
		}

		writer.write(os, outputSet);

		return os.toByteArray();
	}

	//	private TiffOutputDirectory translate(TiffImageMetadata.Directory srcDir,
	//			int byteOrder) throws ImageWriteException
	//	{
	//		TiffOutputDirectory dstDir = new TiffOutputDirectory(srcDir.type);
	//
	//		ArrayList entries = srcDir.getItems();
	//		for (int i = 0; i < entries.size(); i++)
	//		{
	//			TiffImageMetadata.Item item = (TiffImageMetadata.Item) entries
	//					.get(i);
	//			TiffField srcField = item.getTiffField();
	//
	//			TagInfo tag = srcField.tagInfo;
	//			FieldType tagtype = srcField.fieldType;
	//			int count = srcField.length;
	//			//			byte bytes[] = srcField.fieldType.getRawBytes(srcField);
	//
	//			//			Debug.debug("\t" + "srcField", srcField);
	//			//			Debug.debug("\t" + "bytes", bytes);
	//
	//			Object value = srcField.getValue();
	//			byte bytes2[];
	//			if (tag.isDate)
	//				bytes2 = tagtype.getRawBytes(srcField);
	//			else
	//				bytes2 = tagtype.writeData(value, byteOrder);
	//			//			Debug.debug("\t" + "bytes2", bytes2);
	//
	//			TiffOutputField dstField = new TiffOutputField(tag, tagtype, count,
	//					bytes2);
	//			dstDir.add(dstField);
	//		}
	//
	//		dstDir.setRawTiffImageData(srcDir.getRawTiffImageData());
	//		dstDir.setRawJpegImageData(srcDir.getRawJpegImageData());
	//
	//		return dstDir;
	//	}
}