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
package org.cmc.sanselan.formats.jpeg;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

import org.cmc.sanselan.ImageFormat;
import org.cmc.sanselan.ImageInfo;
import org.cmc.sanselan.ImageParser;
import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.common.IImageMetadata;
import org.cmc.sanselan.common.byteSources.ByteSource;
import org.cmc.sanselan.formats.jpeg.segments.App13Segment;
import org.cmc.sanselan.formats.jpeg.segments.App2Segment;
import org.cmc.sanselan.formats.jpeg.segments.GenericSegment;
import org.cmc.sanselan.formats.jpeg.segments.JFIFSegment;
import org.cmc.sanselan.formats.jpeg.segments.SOFNSegment;
import org.cmc.sanselan.formats.jpeg.segments.Segment;
import org.cmc.sanselan.formats.jpeg.segments.UnknownSegment;
import org.cmc.sanselan.formats.tiff.TiffField;
import org.cmc.sanselan.formats.tiff.TiffImageMetadata;
import org.cmc.sanselan.formats.tiff.TiffImageParser;
import org.cmc.sanselan.util.Debug;

public class JpegImageParser extends ImageParser implements JpegConstants
{
	public JpegImageParser()
	{
		setByteOrder(BYTE_ORDER_NETWORK);
		//		setDebug(true);
	}

	protected ImageFormat[] getAcceptedTypes()
	{
		return new ImageFormat[]{
			ImageFormat.IMAGE_FORMAT_JPEG, //
		};
	}

	public String getName()
	{
		return "Jpeg-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".jpg";

	public static final String AcceptedExtensions[] = {
			".jpg", ".jpeg",
	};

	protected String[] getAcceptedExtensions()
	{
		return AcceptedExtensions;
	}

	public final BufferedImage getBufferedImage(ByteSource byteSource,
			Map params) throws ImageReadException, IOException
	{
		throw new ImageReadException(
				"Sanselan cannot read or write JPEG images.");
	}

	private boolean keepMarker(int marker, int markers[])
	{
		if (markers == null)
			return true;

		for (int i = 0; i < markers.length; i++)
		{
			if (markers[i] == marker)
				return true;
		}

		return false;
	}

	private Vector readMarkers(InputStream is, int markers[],
			boolean return_after_first, boolean readEverything)
			throws ImageReadException, IOException
	{
		Vector result = new Vector();

		for (int markerCount = 0; true; markerCount++)
		{
			int marker = read2Bytes("marker", is, "Not a Valid JPEG File");

			if (marker == 0xffd9)
				break;
			else
			{

				int markerLength = read2Bytes("markerLength", is,
						"Not a Valid JPEG File");

				if (keepMarker(marker, markers))
				{
					if (marker == JPEG_APP13_Marker)
					{
						result.add(new App13Segment(this, marker,
								markerLength - 2, is));
					}
					else if (marker == JPEG_APP2_Marker)
					{
						result
								.add(new App2Segment(marker, markerLength - 2,
										is));
					}
					//					else if (marker == JPEG_APP14_Marker)
					//					{
					//						result.add(new Segment(markerLength - 2, is));
					//					}
					else if (marker == JFIFMarker)
					{
						result
								.add(new JFIFSegment(marker, markerLength - 2,
										is));
					}
					else if ((marker >= SOF0Marker) && (marker <= SOF15Marker))
					{
						result
								.add(new SOFNSegment(marker, markerLength - 2,
										is));
					}
					else if ((marker >= JPEG_APP1_Marker)
							&& (marker <= JPEG_APP15_Marker))
					{
						result.add(new UnknownSegment(marker, markerLength - 2,
								is));
					}
					else if (marker == SOS_Marker)
					{
						result.add(new UnknownSegment(marker, markerLength - 2,
								is));

						return result;
					}
					else
					{
						skipBytes(is, markerLength - 2,
								"Not a Valid JPEG File: missing marker data");
					}

					if (debug)
					{
						System.out
								.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						System.out
								.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						System.out
								.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
						System.out
								.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
					}

					if (return_after_first)
						return result;
				}
				else
				{
					skipBytes(is, markerLength - 2,
							"Not a Valid JPEG File: missing marker data");
				}

				if (marker == SOS_Marker)
				{
					//					Debug.debug("SOS");
					return result;
				}

			}
			if (debug)
				System.out.println("");
		}

		return result;
	}

	public static final boolean permissive = true;

	private byte[] assembleSegments(Vector v) throws ImageReadException,
			IOException
	{
		try
		{
			return assembleSegments(v, false);
		}
		catch (ImageReadException e)
		{
			return assembleSegments(v, true);
		}
	}

	private byte[] assembleSegments(Vector v, boolean start_with_zero)
			throws ImageReadException, IOException
	{
		if (v.size() < 1)
			throw new ImageReadException("No App2 Segments Found.");

		int markerCount = ((App2Segment) v.get(0)).num_markers;

		//		if (permissive && (markerCount == 0))
		//			markerCount = v.size();

		if (v.size() != markerCount)
			throw new ImageReadException("App2 Segments Missing.  Found: "
					+ v.size() + ", Expected: " + markerCount + ".");

		Collections.sort(v);

		int offset = start_with_zero ? 0 : 1;

		int total = 0;
		for (int i = 0; i < v.size(); i++)
		{
			App2Segment segment = (App2Segment) v.get(i);

			if ((i + offset) != segment.cur_marker)
			{
				dumpSegments(v);
				throw new ImageReadException(
						"Incoherent App2 Segment Ordering.  i: " + i
								+ ", segment[" + i + "].cur_marker: "
								+ segment.cur_marker + ".");
			}

			if (markerCount != segment.num_markers)
			{
				dumpSegments(v);
				throw new ImageReadException(
						"Inconsistent App2 Segment Count info.  markerCount: "
								+ markerCount + ", segment[" + i
								+ "].num_markers: " + segment.num_markers + ".");
			}

			total += segment.icc_bytes.length;
		}

		byte result[] = new byte[total];
		int progress = 0;

		for (int i = 0; i < v.size(); i++)
		{
			App2Segment segment = (App2Segment) v.get(i);

			System.arraycopy(segment.icc_bytes, 0, result, progress,
					segment.icc_bytes.length);
			progress += segment.icc_bytes.length;
		}

		return result;
	}

	private void dumpSegments(Vector v)
	{
		Debug.debug();
		Debug.debug("dumpSegments", v.size());

		for (int i = 0; i < v.size(); i++)
		{
			App2Segment segment = (App2Segment) v.get(i);

			Debug.debug((i) + ": " + segment.cur_marker + " / "
					+ segment.num_markers);
		}
		Debug.debug();
	}

	private Vector readSegments(ByteSource byteSource, int markers[],
			boolean return_after_first) throws ImageReadException, IOException
	{
		return readSegments(byteSource, markers, return_after_first, false);
	}

	private Vector readSegments(ByteSource byteSource, int markers[],
			boolean return_after_first, boolean readEverything)
			throws ImageReadException, IOException
	{
		InputStream is = null;

		try
		{
			is = byteSource.getInputStream();

			readAndVerifyBytes(is, SOI,
					"Not a Valid JPEG File: doesn't begin with 0xffd8");

			return readMarkers(is, markers, return_after_first, readEverything);
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
	}

	public byte[] getICCProfileBytes(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector segments = readSegments(byteSource, new int[]{
			JPEG_APP2_Marker,
		}, false);

		if (segments != null)
		{
			// throw away non-icc profile app2 segments.
			Vector filtered = new Vector();
			for (int i = 0; i < segments.size(); i++)
			{
				App2Segment segment = (App2Segment) segments.get(i);
				if (segment.icc_bytes != null)
					filtered.add(segment);
			}
			segments = filtered;
		}

		if ((segments == null) || (segments.size() < 1))
			return null;

		byte bytes[] = assembleSegments(segments);

		if (debug)
			System.out.println("bytes" + ": "
					+ ((bytes == null) ? null : "" + bytes.length));

		if (debug)
			System.out.println("");

		return (bytes);
	}

	public IImageMetadata getMetadata(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		TiffImageMetadata exif = getExifMetadata(byteSource, params);

		JpegImageMetadata.Photoshop photoshop = getPhotoshopMetadata(byteSource);

		if (null == exif && null == photoshop)
			return null;

		JpegImageMetadata result = new JpegImageMetadata(photoshop, exif);

		return result;
	}

	public static boolean isExifAPP1Segment(GenericSegment segment)
	{
		byte bytes[] = segment.bytes;

		if ((bytes == null) || (bytes.length < 4))
			return false;

		for (int i = 0; i < 4 && i < bytes.length; i++)
			if (bytes[i] != ExifIdentifierCode[i])
				return false;

		return true;
	}

	private Vector filterAPP1Segments(Vector v)
	{
		Vector result = new Vector();

		for (int i = 0; i < v.size(); i++)
		{
			GenericSegment segment = (GenericSegment) v.get(i);
			if (isExifAPP1Segment(segment))
				result.add(segment);
		}

		return result;
	}

	public TiffImageMetadata getExifMetadata(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		byte bytes[] = getExifRawData(byteSource);
		if (null == bytes)
			return null;

		return (TiffImageMetadata) new TiffImageParser().getMetadata(bytes,
				params);
	}

	public byte[] getExifRawData(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector segments = readSegments(byteSource, new int[]{
			JPEG_APP1_Marker,
		}, false);

		if ((segments == null) || (segments.size() < 1))
			return null;

		Vector exifSegments = filterAPP1Segments(segments);
		if (debug)
			System.out.println("exif_segments.size" + ": "
					+ exifSegments.size());

		// TODO: concatenate if multiple segments, need example.
		if (exifSegments.size() > 1)
			throw new ImageReadException(
					"Sanselan currently can't parse EXIF metadata split across multiple APP1 segments.  "
							+ "Please send this image to the Sanselan project.");

		GenericSegment segment = (GenericSegment) exifSegments.get(0);
		byte bytes[] = segment.bytes;

		//		byte head[] = readBytearray("exif head", bytes, 0, 6);
		//
		//		Debug.debug("head", head);

		return getBytearrayTail("trimmed exif bytes", bytes, 6);
	}

	private JpegImageMetadata.Photoshop getPhotoshopMetadata(
			ByteSource byteSource) throws ImageReadException, IOException
	{
		Vector segments = readSegments(byteSource, new int[]{
			JPEG_APP13_Marker,
		}, false);

		if ((segments == null) || (segments.size() < 1))
			return null;

		JpegImageMetadata.Photoshop result = new JpegImageMetadata.Photoshop();

		for (int i = 0; i < segments.size(); i++)
		{
			App13Segment segment = (App13Segment) segments.get(i);

			Vector elements = segment.elements;

			for (int j = 0; j < elements.size(); j++)
			{
				IptcElement element = (IptcElement) elements.get(j);
				result.add(element.getIptcTypeName(), element.getValue());
			}
		}

		return result;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		Vector segments = readSegments(byteSource, new int[]{
				//			kJFIFMarker,
				SOF0Marker,

				SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker, SOF6Marker,
				SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker, SOF13Marker,
				SOF14Marker, SOF15Marker,

		}, true);

		if ((segments == null) || (segments.size() < 1))
			throw new ImageReadException("No JFIF Data Found.");

		if (segments.size() > 1)
			throw new ImageReadException("Redundant JFIF Data Found.");

		SOFNSegment fSOFNSegment = (SOFNSegment) segments.get(0);

		return new Dimension(fSOFNSegment.width, fSOFNSegment.height);
	}

	public byte[] embedICCProfile(byte image[], byte profile[])
	{
		return null;
	}

	public boolean embedICCProfile(File src, File dst, byte profile[])
	{
		return false;
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{

		Vector SOF_segments = readSegments(byteSource, new int[]{
				//				kJFIFMarker,

				SOF0Marker, SOF1Marker, SOF2Marker, SOF3Marker, SOF5Marker,
				SOF6Marker, SOF7Marker, SOF9Marker, SOF10Marker, SOF11Marker,
				SOF13Marker, SOF14Marker, SOF15Marker,

		}, false);

		if (SOF_segments == null)
			throw new ImageReadException("No SOFN Data Found.");

		//		if (SOF_segments.size() != 1)
		//			System.out.println("Incoherent SOFN Data Found: "
		//					+ SOF_segments.size());

		Vector JFIF_segments = readSegments(byteSource, new int[]{
			JFIFMarker,
		}, true);

		SOFNSegment fSOFNSegment = (SOFNSegment) SOF_segments.get(0);
		//		SOFNSegment fSOFNSegment = (SOFNSegment) findSegment(segments, SOFNmarkers);

		if (fSOFNSegment == null)
			throw new ImageReadException("No SOFN Data Found.");

		int Width = fSOFNSegment.width;
		int Height = fSOFNSegment.height;

		JFIFSegment fTheJFIFSegment = null;

		if ((JFIF_segments != null) && (JFIF_segments.size() > 0))
			fTheJFIFSegment = (JFIFSegment) JFIF_segments.get(0);

		//		JFIFSegment fTheJFIFSegment = (JFIFSegment) findSegment(segments,
		//				kJFIFMarker);

		double x_density = -1.0;
		double y_density = -1.0;
		double units_per_inch = -1.0;
		//		int JFIF_major_version;
		//		int JFIF_minor_version;
		String FormatDetails;

		if (fTheJFIFSegment != null)
		{
			x_density = fTheJFIFSegment.xDensity;
			y_density = fTheJFIFSegment.yDensity;
			int density_units = fTheJFIFSegment.density_units;
			//			JFIF_major_version = fTheJFIFSegment.JFIF_major_version;
			//			JFIF_minor_version = fTheJFIFSegment.JFIF_minor_version;

			FormatDetails = "Jpeg/JFIF v." + fTheJFIFSegment.JFIF_major_version
					+ "." + fTheJFIFSegment.JFIF_minor_version;

			switch (density_units)
			{
				case 0 :
					break;
				case 1 : // inches
					units_per_inch = 1.0;
					break;
				case 2 : // cms
					units_per_inch = 2.54;
					break;
				default :
					break;
			}
		}
		else
		{
			JpegImageMetadata metadata = (JpegImageMetadata) getMetadata(byteSource);

			{
				TiffField field = metadata
						.findEXIFValue(TiffField.TIFF_TAG_XResolution);
				if (field == null)
					throw new ImageReadException("No XResolution");

				x_density = ((Number) field.getValue()).doubleValue();
			}
			{
				TiffField field = metadata
						.findEXIFValue(TiffField.TIFF_TAG_YResolution);
				if (field == null)
					throw new ImageReadException("No YResolution");

				y_density = ((Number) field.getValue()).doubleValue();
			}
			{
				TiffField field = metadata
						.findEXIFValue(TiffField.TIFF_TAG_ResolutionUnit);
				if (field == null)
					throw new ImageReadException("No ResolutionUnits");

				int density_units = ((Number) field.getValue()).intValue();

				switch (density_units)
				{
					case 1 :
						break;
					case 2 : // inches
						units_per_inch = 1.0;
						break;
					case 3 : // cms
						units_per_inch = 2.54;
						break;
					default :
						break;
				}

			}

			FormatDetails = "Jpeg/DCM";

		}

		int PhysicalHeightDpi = -1;
		float PhysicalHeightInch = -1;
		int PhysicalWidthDpi = -1;
		float PhysicalWidthInch = -1;

		if (units_per_inch > 0)
		{
			PhysicalWidthDpi = (int) Math.round((double) x_density
					/ units_per_inch);
			PhysicalWidthInch = (float) ((double) Width / (x_density * units_per_inch));
			PhysicalHeightDpi = (int) Math.round((double) y_density
					* units_per_inch);
			PhysicalHeightInch = (float) ((double) Height / (y_density * units_per_inch));
		}

		Vector Comments = new Vector();
		// TODO: comments...

		int Number_of_components = fSOFNSegment.Number_of_components;
		int Precision = fSOFNSegment.Precision;

		int BitsPerPixel = Number_of_components * Precision;
		ImageFormat Format = ImageFormat.IMAGE_FORMAT_JPEG;
		String FormatName = "JPEG (Joint Photographic Experts Group) Format";
		String MimeType = "image/jpeg";
		// we ought to count images, but don't yet.
		int NumberOfImages = -1;
		// not accurate ... only reflects first
		boolean isProgressive = fSOFNSegment.marker == SOF2Marker;

		boolean isTransparent = false; // TODO: inaccurate.
		boolean usesPalette = false; // TODO: inaccurate.
		int ColorType;
		if (Number_of_components == 1)
			ColorType = ImageInfo.COLOR_TYPE_BW;
		else if (Number_of_components == 3)
			ColorType = ImageInfo.COLOR_TYPE_RGB;
		else if (Number_of_components == 4)
			ColorType = ImageInfo.COLOR_TYPE_CMYK;
		else
			ColorType = ImageInfo.COLOR_TYPE_UNKNOWN;

		String compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_JPEG;

		ImageInfo result = new ImageInfo(FormatDetails, BitsPerPixel, Comments,
				Format, FormatName, Height, MimeType, NumberOfImages,
				PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
				PhysicalWidthInch, Width, isProgressive, isTransparent,
				usesPalette, ColorType, compressionAlgorithm);

		return result;
	}

	public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		pw.println("tiff.dumpImageFile");

		{
			ImageInfo imageInfo = getImageInfo(byteSource);
			if (imageInfo == null)
				return false;

			imageInfo.toString(pw, "");
		}

		pw.println("");

		{
			Vector segments = readSegments(byteSource, null, false);

			if (segments == null)
				throw new ImageReadException("No Segments Found.");

			for (int d = 0; d < segments.size(); d++)
			{

				Segment segment = (Segment) segments.get(d);

				NumberFormat nf = NumberFormat.getIntegerInstance();
				//			this.debugNumber("found, marker: ", marker, 4);
				pw.println(d + ": marker: "
						+ Integer.toHexString(segment.marker) + ", "
						+ segment.getDescription() + " (length: "
						+ nf.format(segment.length) + ")");
				segment.dump(pw);
			}

			pw.println("");
		}

		return true;
	}

}