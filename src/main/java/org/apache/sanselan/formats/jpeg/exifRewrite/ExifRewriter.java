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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Vector;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.formats.jpeg.JpegConstants;
import org.apache.sanselan.formats.jpeg.JpegImageParser;
import org.apache.sanselan.formats.jpeg.segments.GenericSegment;
import org.apache.sanselan.formats.jpeg.segments.UnknownSegment;
import org.apache.sanselan.formats.tiff.TagInfo;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.TiffImageParser;
import org.apache.sanselan.formats.tiff.fieldtypes.FieldType;
import org.apache.sanselan.formats.tiff.write.TiffImageWriter;
import org.apache.sanselan.formats.tiff.write.WriteField;
import org.apache.sanselan.util.Debug;

public class ExifRewriter extends BinaryFileParser implements JpegConstants
{
	public ExifRewriter()
	{
		setByteOrder(BYTE_ORDER_NETWORK);
	}

	public void rewriteEXIFMetadata(ByteSource byteSource, OutputStream os,
			Map params) throws ImageReadException, IOException,
			ImageWriteException
	{
		Vector pieces = new Vector();
		InputStream is = null;
		GenericSegment exifSegment = null;

		try
		{
			is = byteSource.getInputStream();

			readAndVerifyBytes(is, SOI,
					"Not a Valid JPEG File: doesn't begin with 0xffd8");

			int byteOrder = getByteOrder();

			for (int markerCount = 0; true; markerCount++)
			{
				byte markerBytes[] = readByteArray("markerBytes", 2, is,
						"markerBytes");
				int marker = convertByteArrayToShort("marker", markerBytes,
						byteOrder);

				//					private boolean isExifAPP1Segment(GenericSegment segment)

				if (marker == 0xffd9 || marker == SOS_Marker)
				{
					pieces.add(markerBytes);
					pieces.add(getStreamBytes(is));
					break;
				}

				byte markerLengthBytes[] = readByteArray("markerLengthBytes",
						2, is, "markerLengthBytes");
				int markerLength = convertByteArrayToShort("markerLength",
						markerLengthBytes, byteOrder);

				UnknownSegment segment = new UnknownSegment(marker,
						markerLength - 2, is);

				if (marker != JPEG_APP1_Marker)
				{
					pieces.add(markerBytes);
					pieces.add(markerLengthBytes);
					pieces.add(segment.bytes);
					continue;
				}

				if (!JpegImageParser.isExifAPP1Segment(segment))
				{
					pieces.add(markerBytes);
					pieces.add(markerLengthBytes);
					pieces.add(segment.bytes);
					continue;
				}

				if (exifSegment != null)
				{
					// TODO: add support for multiple segments
					throw new ImageWriteException(
							"More than one APP1 EXIF segment.");
				}

				exifSegment = segment;
				pieces.add(segment);
			}

		}
		finally
		{
			try
			{
				is.close();
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}
		}

		if (exifSegment == null)
		{
			// TODO: add support for adding, not just replacing.
			throw new ImageWriteException("No APP1 EXIF segment found.");
		}

		byte exifBytes[] = exifSegment.bytes;
		exifBytes = getBytearrayTail("trimmed exif bytes", exifBytes, 6);

		TiffImageMetadata exifMetadata = (TiffImageMetadata) new TiffImageParser()
				.getMetadata(exifBytes, params);

		byte newBytes[] = rewriteExif(exifMetadata, true);
		//		exifSegment.bytes = newBytes;

		//		Vector segments = readSegments(byteSource, null, false, true);

		//		TiffImageMetadata exif = getExifMetadata(byteSource, params);

		writeSegments(os, pieces, newBytes);
	}

	private void writeSegments(OutputStream os, Vector segments,
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
					//					byte markerBytes[] = readByteArray("markerBytes", 2, is,
					//					"markerBytes");
					//			int marker = convertByteArrayToShort("marker", markerBytes,
					//					byteOrder);
					byte markerBytes[] = convertShortToByteArray(
							JPEG_APP1_Marker, byteOrder);
					os.write(markerBytes);

					int markerLength = newBytes.length + 2;
					byte markerLengthBytes[] = convertShortToByteArray(
							markerLength, byteOrder);
					os.write(markerLengthBytes);

					//
					//			pieces.add(markerBytes);
					//					pieces.add(markerLengthBytes);

					os.write(newBytes);
					//					GenericSegment segment = (GenericSegment) o;
					//					os.write(segment.bytes);
				}
				else
					throw new ImageWriteException("Unknown data: " + o);
			}
			//			readAndVerifyBytes(is, SOI,
			//					"Not a Valid JPEG File: doesn't begin with 0xffd8");
			//
			//			return readMarkers(is, markers, return_after_first);
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

	public byte[] rewriteExif(TiffImageMetadata exif, boolean includeEXIFPrefix)
			throws IOException, ImageWriteException
	{
		if (exif == null)
			return null;

		int byteOrder = exif.contents.header.byteOrder;

		Vector dstDirs = new Vector();
		Vector srcDirs = exif.getDirectories();
		for (int i = 0; i < srcDirs.size(); i++)
		{
			TiffImageMetadata.Directory srcDir = (TiffImageMetadata.Directory) srcDirs
					.get(i);
			//			Debug.debug("srcDir", srcDir);

			TiffImageWriter.Directory dstDir = translate(srcDir, byteOrder);
			dstDirs.add(dstDir);
		}

		ByteArrayOutputStream os = new ByteArrayOutputStream();

		if (includeEXIFPrefix)
		{
			os.write(ExifIdentifierCode);
			os.write(0);
			os.write(0);
		}

		new TiffImageWriter(byteOrder).writeDirectories(os, dstDirs);

		return os.toByteArray();
	}

	private TiffImageWriter.Directory translate(
			TiffImageMetadata.Directory srcDir, int byteOrder)
			throws ImageWriteException
	{
		TiffImageWriter.Directory dstDir = new TiffImageWriter.Directory(
				srcDir.type);

		Vector entries = srcDir.getItems();
		for (int i = 0; i < entries.size(); i++)
		{
			TiffImageMetadata.Item item = (TiffImageMetadata.Item) entries
					.get(i);
			TiffField srcField = item.getTiffField();

			TagInfo tag = srcField.tagInfo;
			FieldType tagtype = srcField.fieldType;
			int count = srcField.length;
			byte bytes[] = srcField.fieldType.getRawBytes(srcField);

			//			Debug.debug("\t" + "srcField", srcField);
			//			Debug.debug("\t" + "bytes", bytes);

			Object value = srcField.getValue();
			byte bytes2[];
			if (tag.isDate)
				bytes2 = tagtype.getRawBytes(srcField);
			else
				bytes2 = tagtype.writeData(value, byteOrder);
			//			Debug.debug("\t" + "bytes2", bytes2);

			WriteField dstField = new WriteField(tag, tagtype, count, bytes2);
			dstDir.add(dstField);
		}

		dstDir.setRawTiffImageData(srcDir.getRawTiffImageData());
		dstDir.setRawJpegImageData(srcDir.getRawJpegImageData());

		return dstDir;
	}
}