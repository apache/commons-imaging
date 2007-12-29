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
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.jpeg.JpegConstants;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.formats.jpeg.segments.GenericSegment;
import org.apache.sanselan.formats.jpeg.segments.UnknownSegment;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.TiffImageParser;
import org.apache.sanselan.formats.tiff.write.TiffImageWriter;
import org.apache.sanselan.formats.tiff.write.TiffOutputDirectory;
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

		public JFIFPieces(final ArrayList pieces, final GenericSegment exifSegment)
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

	public void rewriteExifMetadata(ByteSource byteSource, OutputStream os,
			Map params) throws ImageReadException, IOException,
			ImageWriteException
	{
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;
		GenericSegment exifSegment = jfifPieces.exifSegment;

		byte exifBytes[] = exifSegment.bytes;
		exifBytes = getBytearrayTail("trimmed exif bytes", exifBytes, 6);

		TiffImageMetadata exifMetadata = (TiffImageMetadata) new TiffImageParser()
				.getMetadata(exifBytes, params);

		byte newBytes[] = writeExifSegment(exifMetadata, true);
		//		exifSegment.bytes = newBytes;

		//		ArrayList segments = readSegments(byteSource, null, false, true);

		//		TiffImageMetadata exif = getExifMetadata(byteSource, params);

		writeSegmentsReplacingExif(os, pieces, newBytes);
	}

	public void updateExifMetadata(ByteSource byteSource, OutputStream os,
			ArrayList outputDirectories, Map params) throws ImageReadException,
			IOException, ImageWriteException
	{
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;
		GenericSegment exifSegment = jfifPieces.exifSegment;

		byte exifBytes[] = exifSegment.bytes;
		exifBytes = getBytearrayTail("trimmed exif bytes", exifBytes, 6);

		TiffImageMetadata exifMetadata = (TiffImageMetadata) new TiffImageParser()
				.getMetadata(exifBytes, params);
		int byteOrder = exifMetadata.contents.header.byteOrder;

		byte newBytes[] = writeExifSegment(outputDirectories, byteOrder, true);

		writeSegmentsReplacingExif(os, pieces, newBytes);
	}

	private void writeSegmentsReplacingExif(OutputStream os, ArrayList segments,
			byte newBytes[]) throws ImageWriteException, IOException
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

	public byte[] writeExifSegment(TiffImageMetadata exif,
			boolean includeEXIFPrefix) throws IOException, ImageWriteException
	{
		if (exif == null)
			return null;

		int byteOrder = exif.contents.header.byteOrder;

		ArrayList outputDirectories = new ArrayList();
		ArrayList srcDirs = exif.getDirectories();
		for (int i = 0; i < srcDirs.size(); i++)
		{
			TiffImageMetadata.Directory srcDir = (TiffImageMetadata.Directory) srcDirs
					.get(i);
			//			Debug.debug("srcDir", srcDir);

			//			TiffOutputDirectory outputDirectory = translate(srcDir, byteOrder);
			TiffOutputDirectory outputDirectory = srcDir
					.getOutputDirectory(byteOrder);
			outputDirectories.add(outputDirectory);
		}

		return writeExifSegment(outputDirectories, byteOrder, includeEXIFPrefix);
	}
	

	public byte[] writeExifSegment(TiffOutputSet outputSet, 
			boolean includeEXIFPrefix) throws IOException, ImageWriteException
	{
		List outputDirectories = outputSet.getDirectories();
		
		return writeExifSegment( outputDirectories, outputSet.byteOrder,
				 includeEXIFPrefix) ;
	}

	

	public byte[] writeExifSegment(List outputDirectories, int byteOrder,
			boolean includeEXIFPrefix) throws IOException, ImageWriteException
	{
		ByteArrayOutputStream os = new ByteArrayOutputStream();

		if (includeEXIFPrefix)
		{
			os.write(ExifIdentifierCode);
			os.write(0);
			os.write(0);
		}

		new TiffImageWriter(byteOrder).writeDirectories(os, outputDirectories);

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