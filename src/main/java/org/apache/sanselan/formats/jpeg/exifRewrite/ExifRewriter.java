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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.common.byteSources.ByteSourceInputStream;
import org.apache.sanselan.formats.jpeg.JpegConstants;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.formats.jpeg.segments.GenericSegment;
import org.apache.sanselan.formats.jpeg.segments.UnknownSegment;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterBase;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossless;
import org.apache.sanselan.formats.tiff.write.TiffImageWriterLossy;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.util.Debug;

/**
 * Interface for Exif write/update/remove functionality for Jpeg/JFIF images.
 * <p>
 * <p>
 * See the source of the ExifMetadataUpdateExample class for example usage.
 * 
 * @see org.apache.sanselan.sampleUsage.WriteExifMetadataExample
 */
public class ExifRewriter extends BinaryFileParser implements JpegConstants
{
	/** 
	 * Constructor. to guess whether a file contains an image based on its file extension.
	 */
	public ExifRewriter()
	{
		setByteOrder(BYTE_ORDER_NETWORK);
	}

	/** 
	 * Constructor. 
	 * <p>
	 * @param  byteOrder  byte order of EXIF segment.  Optional.  See BinaryConstants class.
	 *
	 * @see org.apache.sanselan.common.BinaryConstants
	 */
	public ExifRewriter(int byteOrder)
	{
		setByteOrder(byteOrder);
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

	/** 
	 * Reads a Jpeg image, removes all EXIF metadata (by removing the APP1 segment),
	 * and writes the result to a stream.
	 * <p>
	 * @param  src  Image file.
	 * @param  os  OutputStream to write the image to.
	 * 
	 * @see java.io.File
	 * @see java.io.OutputStream
	 * @see java.io.File
	 * @see java.io.OutputStream
	 */
	public void removeExifMetadata(File src, OutputStream os)
			throws ImageReadException, IOException, ImageWriteException
	{
		ByteSource byteSource = new ByteSourceFile(src);
		removeExifMetadata(byteSource, os);
	}

	/** 
	 * Reads a Jpeg image, removes all EXIF metadata (by removing the APP1 segment),
	 * and writes the result to a stream.
	 * <p>
	 * @param  src  Byte array containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 */
	public void removeExifMetadata(byte src[], OutputStream os)
			throws ImageReadException, IOException, ImageWriteException
	{
		ByteSource byteSource = new ByteSourceArray(src);
		removeExifMetadata(byteSource, os);
	}

	/** 
	 * Reads a Jpeg image, removes all EXIF metadata (by removing the APP1 segment),
	 * and writes the result to a stream.
	 * <p>
	 * @param  src  InputStream containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 */
	public void removeExifMetadata(InputStream src, OutputStream os)
			throws ImageReadException, IOException, ImageWriteException
	{
		ByteSource byteSource = new ByteSourceInputStream(src, null);
		removeExifMetadata(byteSource, os);
	}

	/** 
	 * Reads a Jpeg image, removes all EXIF metadata (by removing the APP1 segment),
	 * and writes the result to a stream.
	 * <p>
	 * @param  byteSource  ByteSource containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 */
	public void removeExifMetadata(ByteSource byteSource, OutputStream os)
			throws ImageReadException, IOException, ImageWriteException
	{
		JFIFPieces jfifPieces = analyzeJFIF(byteSource);
		ArrayList pieces = jfifPieces.pieces;

		pieces.remove(jfifPieces.exifSegment);

		writeSegmentsReplacingExif(os, pieces, null);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossless" approach - in order to preserve data embedded in the EXIF 
	 * segment that it can't parse (such as Maker Notes), this algorithm avoids overwriting
	 * any part of the original segment that it couldn't parse.  This can cause the EXIF segment to 
	 * grow with each update, which is a serious issue, since all EXIF data must fit in a single APP1
	 * segment of the Jpeg image.  
	 * <p>
	 * @param  src  Image file.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossless(File src, OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceFile(src);
		updateExifMetadataLossless(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossless" approach - in order to preserve data embedded in the EXIF 
	 * segment that it can't parse (such as Maker Notes), this algorithm avoids overwriting
	 * any part of the original segment that it couldn't parse.  This can cause the EXIF segment to 
	 * grow with each update, which is a serious issue, since all EXIF data must fit in a single APP1
	 * segment of the Jpeg image.  
	 * <p>
	 * @param  src  Byte array containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossless(byte src[], OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceArray(src);
		updateExifMetadataLossless(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossless" approach - in order to preserve data embedded in the EXIF 
	 * segment that it can't parse (such as Maker Notes), this algorithm avoids overwriting
	 * any part of the original segment that it couldn't parse.  This can cause the EXIF segment to 
	 * grow with each update, which is a serious issue, since all EXIF data must fit in a single APP1
	 * segment of the Jpeg image.  
	 * <p>
	 * @param  src  InputStream containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossless(InputStream src, OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceInputStream(src, null);
		updateExifMetadataLossless(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossless" approach - in order to preserve data embedded in the EXIF 
	 * segment that it can't parse (such as Maker Notes), this algorithm avoids overwriting
	 * any part of the original segment that it couldn't parse.  This can cause the EXIF segment to 
	 * grow with each update, which is a serious issue, since all EXIF data must fit in a single APP1
	 * segment of the Jpeg image.  
	 * <p>
	 * @param  byteSource  ByteSource containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
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

		writeSegmentsReplacingExif(os, pieces, newBytes);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossy" approach - the algorithm overwrites the entire EXIF segment,
	 * ignoring the possibility that it may be discarding data it couldn't parse (such as Maker Notes).
	 * <p>
	 * @param  src  Byte array containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossy(byte src[], OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceArray(src);
		updateExifMetadataLossy(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossy" approach - the algorithm overwrites the entire EXIF segment,
	 * ignoring the possibility that it may be discarding data it couldn't parse (such as Maker Notes).
	 * <p>
	 * @param  src  InputStream containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossy(InputStream src, OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceInputStream(src, null);
		updateExifMetadataLossy(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossy" approach - the algorithm overwrites the entire EXIF segment,
	 * ignoring the possibility that it may be discarding data it couldn't parse (such as Maker Notes).
	 * <p>
	 * @param  src  Image file.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
	public void updateExifMetadataLossy(File src, OutputStream os,
			TiffOutputSet outputSet) throws ImageReadException, IOException,
			ImageWriteException
	{
		ByteSource byteSource = new ByteSourceFile(src);
		updateExifMetadataLossy(byteSource, os, outputSet);
	}

	/** 
	 * Reads a Jpeg image, replaces the EXIF metadata and writes the result to a stream.
	 * <p>
	 * Note that this uses the "Lossy" approach - the algorithm overwrites the entire EXIF segment,
	 * ignoring the possibility that it may be discarding data it couldn't parse (such as Maker Notes).
	 * <p>
	 * @param  byteSource  ByteSource containing Jpeg image data.
	 * @param  os  OutputStream to write the image to.
	 * @param  outputSet  TiffOutputSet containing the EXIF data to write.
	 */
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
						throw new ExifOverflowException(
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

	public static class ExifOverflowException extends ImageWriteException
	{
		public ExifOverflowException(String s)
		{
			super(s);
		}
	}

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

}