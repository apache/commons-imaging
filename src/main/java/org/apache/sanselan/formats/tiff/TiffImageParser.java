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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Vector;

import org.apache.sanselan.FormatCompliance;
import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;
import org.apache.sanselan.ImageParser;
import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.formats.tiff.TiffDirectory.ImageDataElement;
import org.apache.sanselan.formats.tiff.datareaders.DataReader;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderStrips;
import org.apache.sanselan.formats.tiff.datareaders.DataReaderTiled;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterCIELAB;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterCMYK;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLUV;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterRGB;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr;
import org.apache.sanselan.formats.tiff.write.TiffImageWriter;
import org.apache.sanselan.util.Debug;

public class TiffImageParser extends ImageParser implements TiffConstants
{
	public TiffImageParser()
	{
		//		setDebug(true);
	}

	public String getName()
	{
		return "Tiff-Custom";
	}

	public String getDefaultExtension()
	{
		return DEFAULT_EXTENSION;
	}

	private static final String DEFAULT_EXTENSION = ".tif";

	private static final String ACCEPTED_EXTENSIONS[] = {
			".tif", ".tiff",
	};

	protected String[] getAcceptedExtensions()
	{
		return ACCEPTED_EXTENSIONS;
	}

	protected ImageFormat[] getAcceptedTypes()
	{
		return new ImageFormat[]{
			ImageFormat.IMAGE_FORMAT_TIFF, //
		};
	}

	private TiffHeader readTiffHeader(InputStream is,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		int BYTE_ORDER_1 = readByte("BYTE_ORDER_1", is, "Not a Valid TIFF File");
		int BYTE_ORDER_2 = readByte("BYTE_ORDER_2", is, "Not a Valid TIFF File");
		setByteOrder(BYTE_ORDER_1, BYTE_ORDER_2);

		int tiffVersion = read2Bytes("tiffVersion", is, "Not a Valid TIFF File");
		if (tiffVersion != 42)
			throw new ImageReadException("Unknown Tiff Version: " + tiffVersion);

		int offsetToFirstIFD = read4Bytes("offsetToFirstIFD", is,
				"Not a Valid TIFF File");

		skipBytes(is, offsetToFirstIFD - 8,
				"Not a Valid TIFF File: couldn't find IFDs");

		if (debug)
			System.out.println("");

		return new TiffHeader(BYTE_ORDER_1, tiffVersion, offsetToFirstIFD);

	}

	private boolean keepField(int Tag, int tags[])
	{
		if (tags == null)
			return true;

		for (int i = 0; i < tags.length; i++)
		{
			if (tags[i] == Tag)
				return true;
		}

		return false;
	}

	private static final int TAG_ICC_PROFILE = 34675;

	private TiffDirectory readDirectory(InputStream is, int dirType,
			int offset, int tags[], int maxEntriesToMatch)
			throws ImageReadException, IOException
	{
		Vector result = new Vector();

		int entryCount = read2Bytes("DirectoryEntryCount", is,
				"Not a Valid TIFF File");

		//		Debug.debug();
		//		Debug.debug("readDirectory entryCount", entryCount);

		for (int i = 0; i < entryCount; i++)
		{
			int tag = read2Bytes("Tag", is, "Not a Valid TIFF File");
			int type = read2Bytes("Type", is, "Not a Valid TIFF File");
			int length = read4Bytes("Length", is, "Not a Valid TIFF File");

			byte valueOffsetBytes[] = readByteArray("ValueOffset", 4, is,
					"Not a Valid TIFF File");
			int valueOffset = convertByteArrayToInt("ValueOffset",
					valueOffsetBytes);

			if (keepField(tag, tags))
			{
				TiffField entry = new TiffField(tag, type, length, valueOffset,
						valueOffsetBytes, getByteOrder());
				result.add(entry);

				//				Debug.debug("read field tag", tag + ", 0x"
				//						+ Integer.toHexString(tag));

				if (debug)
					for (int j = 0; j < 4; j++)
						System.out
								.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

				if ((maxEntriesToMatch > 0)
						&& (result.size() >= maxEntriesToMatch))
				{
					return new TiffDirectory(dirType, result, offset, -1);
				}
			}

		}

		int nextDirectoryOffset = read4Bytes("nextDirectoryOffset", is,
				"Not a Valid TIFF File");
		if (debug)
			System.out.println("");

		return new TiffDirectory(dirType, result, offset, nextDirectoryOffset);
	}

	private TiffContents readDirectories(ByteSource byteSource, int tags[],
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		return readDirectories(byteSource, tags, -1, -1, formatCompliance);
	}

	private TiffContents readDirectories(ByteSource byteSource, int tags[],
			int maxDirectoriesToRead, int maxEntriesToMatch,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		TiffHeader tiffHeader;
		InputStream is = null;
		try
		{
			is = byteSource.getInputStream();
			tiffHeader = readTiffHeader(is, formatCompliance);
		}
		finally
		{
			try
			{
				if (is != null)
					is.close();
			}
			catch (Exception e)
			{
				Debug.debug(e);
			}
		}

		Vector directories = new Vector();

		int offset = tiffHeader.offsetToFirstIFD;
		for (int count = 0; (offset > 0)
				&& ((maxDirectoriesToRead < 1) || (directories.size() < maxDirectoriesToRead)); count++)
		{
			int dirType;
			if (0 == count)
				dirType = TiffDirectory.DIRECTORY_TYPE_ROOT;
			else
				dirType = TiffDirectory.DIRECTORY_TYPE_SUB;

			TiffDirectory directory = readSingleDirectory(byteSource, dirType,
					offset, formatCompliance);
			if (directory.entries.size() > 0)
				directories.add(directory);
			offset = directory.nextDirectoryOffset;
		}

		return new TiffContents(tiffHeader, directories);

	}

	private TiffDirectory readSingleDirectory(ByteSource byteSource,
			int dirType, int offset, FormatCompliance formatCompliance)
			throws ImageReadException, IOException
	{
		int tags[] = null;
		int maxEntriesToMatch = -1;
		return readSingleDirectory(byteSource, dirType, offset, tags,
				maxEntriesToMatch, formatCompliance);
	}

	private TiffDirectory readSingleDirectory(ByteSource byteSource,
			int dirType, int offset, int tags[], int maxEntriesToMatch,
			FormatCompliance formatCompliance) throws ImageReadException,
			IOException
	{
		InputStream is = null;
		try
		{
			is = byteSource.getInputStream();
			//			Debug.debug("readSingleDirectory offset", offset);
			if (offset > 0)
				is.skip(offset);

			TiffDirectory directory = readDirectory(is, dirType, offset, tags,
					maxEntriesToMatch);

			directory.fillInValues(byteSource);

			return directory;
		}
		finally
		{
			try
			{
				if (is != null)
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
		int FieldTypes[] = new int[]{
			TAG_ICC_PROFILE,
		};

		TiffContents contents = readDirectories(byteSource, FieldTypes, -1, 1,
				getDefaultFormatCompliance());
		if (contents == null)
			throw new ImageReadException("TIFF missing contents");

		Vector directories = contents.directories;

		if ((directories == null) || (directories.size() < 1))
			return null;
		//			throw new ImageReadException("TIFF missing directories");

		TiffDirectory directory = (TiffDirectory) directories.get(0);
		Vector entries = directory.entries;

		if ((entries == null) || (entries.size() != 1))
			throw new ImageReadException("TIFF missing entries");

		TiffField de = (TiffField) entries.get(0);
		byte bytes[] = de.oversizeValue;
		return (bytes);

	}

	private TiffField findField(Vector directories, int tag)
			throws ImageReadException, IOException
	{
		if ((directories == null) || (directories.size() < 1))
			throw new ImageReadException("TIFF missing directories");

		TiffDirectory directory = (TiffDirectory) directories.get(0);
		Vector entries = directory.entries;

		if ((entries == null) || (entries.size() < 1))
			throw new ImageReadException("TIFF missing entries");

		for (int i = 0; i < entries.size(); i++)
		{
			TiffField field = (TiffField) entries.get(i);
			if (field.tag == tag)
				return field;
		}

		return null;
	}

	private TiffField findField(Vector entries, TagInfo tag)
	{
		if (entries == null)
			return null;

		for (int i = 0; i < entries.size(); i++)
		{
			TiffField field = (TiffField) entries.get(i);
			if (field.tag == tag.tag)
				return field;
		}

		return null;
	}

	public Dimension getImageSize(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		int fieldTypes[] = new int[]{
				TIFF_TAG_ImageWidth.tag, TIFF_TAG_ImageLength.tag,
		};

		TiffContents contents = readDirectories(byteSource, fieldTypes, -1, 2,
				getDefaultFormatCompliance());
		if (contents == null)
			throw new ImageReadException("TIFF missing contents");

		Vector directories = contents.directories;

		TiffField widthField = findField(directories, TIFF_TAG_ImageWidth.tag);
		TiffField heightField = findField(directories, TIFF_TAG_ImageLength.tag);

		if ((widthField == null) || (heightField == null))
			throw new ImageReadException("TIFF image has invalid size.");

		Number width = (Number) widthField.getValue();
		Number height = (Number) heightField.getValue();

		if ((width == null) || (height == null))
			throw new ImageReadException("TIFF image missing size info.");

		return new Dimension(width.intValue(), height.intValue());
	}

	public byte[] embedICCProfile(byte image[], byte profile[])
	{
		return null;
	}

	public boolean embedICCProfile(File src, File dst, byte profile[])
	{
		return false;
	}

	public TiffContents readDirectories(byte bytes[])
			throws ImageReadException, IOException
	{
		return readDirectories(new ByteSourceArray(bytes), null,
				getDefaultFormatCompliance());
	}

	public TiffContents readDirectories(File file) throws ImageReadException,
			IOException
	{
		return readDirectories(new ByteSourceFile(file), null,
				getDefaultFormatCompliance());
	}

	private boolean readThumbnails(Map params)
	{
		if (params == null)
			return false;
		Object o = params.get(PARAM_KEY_READ_THUMBNAILS);
		if (o == null)
			return false;
		if (!(o instanceof Boolean))
			return false;
		return o.equals(Boolean.TRUE);
	}

	public IImageMetadata getMetadata(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		TiffContents contents = readDirectories(byteSource, null,
				getDefaultFormatCompliance());
		if (contents == null)
			throw new ImageReadException("TIFF missing contents");

		Vector directories = contents.directories;

		TiffImageMetadata result = new TiffImageMetadata(contents);

		for (int i = 0; i < directories.size(); i++)
		{
			TiffDirectory dir = (TiffDirectory) directories.get(i);

			TiffImageMetadata.Directory metadataDirectory = new TiffImageMetadata.Directory(
					dir);

			if (readThumbnails(params))
			{
				if (dir.hasTiffImageData())
				{
					BufferedImage thumbnail = getBufferedImage(byteSource, dir,
							null);
					metadataDirectory.setThumbnail(thumbnail);

					RawTiffImageData rawImageData = getTiffRawImageData(
							byteSource, dir);
					metadataDirectory.setRawTiffImageData(rawImageData);
				}
				if (dir.hasJpegImageData())
				{
					//										BufferedImage thumbnail = getBufferedImage(byteSource, dir,
					//												null);
					//										metadataDirectory.setThumbnail(thumbnail);

					byte rawJpegImageData[] = getJpegRawImageData(byteSource,
							dir);
					metadataDirectory.setRawJpegImageData(rawJpegImageData);
				}
			}

			Vector entries = dir.getDirectoryEntrys();

			for (int j = 0; j < entries.size(); j++)
			{
				TiffField entry = (TiffField) entries.get(j);

				if (entry.tag == TiffConstants.TIFF_TAG_Exif_IFD_Pointer.tag
						|| entry.tag == TiffConstants.TIFF_TAG_GPSInfo_IFD_Pointer.tag
						|| entry.tag == TiffConstants.TIFF_TAG_Interoperability_IFD_Pointer.tag)
				{
					int offset = ((Number) entry.getValue()).intValue();
					int dirType;
					if (entry.tag == TiffConstants.TIFF_TAG_Exif_IFD_Pointer.tag)
						dirType = TiffDirectory.DIRECTORY_TYPE_EXIF;
					else if (entry.tag == TiffConstants.TIFF_TAG_GPSInfo_IFD_Pointer.tag)
						dirType = TiffDirectory.DIRECTORY_TYPE_GPS;
					else if (entry.tag == TiffConstants.TIFF_TAG_Interoperability_IFD_Pointer.tag)
						dirType = TiffDirectory.DIRECTORY_TYPE_INTEROPERABILITY;
					else
						throw new ImageReadException(
								"Unknown subdirectory type.");

					//					Debug.debug();
					//					Debug.debug("extra dir child of ", dir.description());
					//					Debug.debug("extra dir offset", offset);
					//					Debug.debug("extra dir type", TiffDirectory.description(dirType));
					TiffDirectory extraDir = readSingleDirectory(byteSource,
							dirType, offset, getDefaultFormatCompliance());
					//					Debug.debug("extraDir", extraDir);
					//					directories.add(extraDir);
					directories.insertElementAt(extraDir, i + 1);
				}

				metadataDirectory.add(entry);
			}

			result.add(metadataDirectory);
		}

		return result;
	}

	private double[] getValueAsDoubleArray(TiffField field)
	{
		if (field == null)
			return null;

		Object o = field.getValue();
		if (o == null)
			return null;

		if (o instanceof Number)
		{
			return new double[]{
				((Number) o).doubleValue()
			};
		}
		else if (o instanceof Number[])
		{
			Number numbers[] = (Number[]) o;
			double result[] = new double[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i].doubleValue();
			return result;
		}
		else if (o instanceof int[])
		{
			int numbers[] = (int[]) o;
			double result[] = new double[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i];
			return result;
		}
		else if (o instanceof float[])
		{
			float numbers[] = (float[]) o;
			double result[] = new double[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i];
			return result;
		}
		else if (o instanceof double[])
		{
			double numbers[] = (double[]) o;
			double result[] = new double[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i];
			return result;
		}

		return null;
	}

	private int[] getValueAsIntArray(TiffField field)
	{
		if (field == null)
			return null;

		Object o = field.getValue();
		if (o == null)
			return null;

		if (o instanceof Number)
			return new int[]{
				((Number) o).intValue()
			};
		else if (o instanceof Number[])
		{
			Number numbers[] = (Number[]) o;
			int result[] = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i].intValue();
			return result;
		}
		else if (o instanceof int[])
		{
			int numbers[] = (int[]) o;
			int result[] = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++)
				result[i] = numbers[i];
			return result;
		}

		return null;
	}

	private int getValueOrArraySum(TiffField field)
	{
		if (field == null)
			return -1;

		Object o = field.getValue();
		if (o == null)
			return -1;

		if (o instanceof Number)
			return ((Number) o).intValue();
		else if (o instanceof Number[])
		{
			Number numbers[] = (Number[]) o;
			int sum = 0;
			for (int i = 0; i < numbers.length; i++)
				sum += numbers[i].intValue();
			return sum;
		}
		else if (o instanceof int[])
		{
			int numbers[] = (int[]) o;
			int sum = 0;
			for (int i = 0; i < numbers.length; i++)
				sum += numbers[i];
			return sum;
		}

		return -1;
	}

	public ImageInfo getImageInfo(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		int FieldTypes[] = new int[]{
				TIFF_TAG_ImageWidth.tag, TIFF_TAG_ImageLength.tag,
				TIFF_TAG_ResolutionUnit.tag, TIFF_TAG_XResolution.tag,
				TIFF_TAG_YResolution.tag, TIFF_TAG_BitsPerSample.tag,
				TIFF_TAG_ColorMap.tag, TIFF_TAG_SamplesPerPixel.tag,
				TIFF_TAG_Compression.tag,
		};

		TiffContents contents = readDirectories(byteSource, FieldTypes, -1, -1,
				getDefaultFormatCompliance());
		if (contents == null)
			throw new ImageReadException("TIFF missing contents");

		Vector dirs = contents.directories;
		if ((dirs == null) || (dirs.size() < 1))
			throw new ImageReadException("TIFF image missing directories");

		TiffDirectory directory = (TiffDirectory) dirs.get(0);

		Vector entries = directory.entries;

		if (entries == null)
			throw new ImageReadException("TIFF missing entries");

		TiffField widthField = findField(entries, TIFF_TAG_ImageWidth);
		TiffField heightField = findField(entries, TIFF_TAG_ImageLength);

		if ((widthField == null) || (heightField == null))
			throw new ImageReadException("TIFF image missing size info.");

		int height = ((Number) heightField.getValue()).intValue();
		int width = ((Number) widthField.getValue()).intValue();

		//-------------------

		TiffField resolutionUnitField = findField(entries,
				TIFF_TAG_ResolutionUnit);
		int resolutionUnit = 2; // Inch
		if ((resolutionUnitField != null)
				&& (resolutionUnitField.getValue() != null))
		{
			resolutionUnit = ((Number) resolutionUnitField.getValue())
					.intValue();
		}
		double unitsPerInch = -1;
		switch (resolutionUnit)
		{
			case 1 :
				break;
			case 2 : // Inch
				unitsPerInch = 1.0;
				break;
			case 3 : // Meter
				unitsPerInch = 0.0254;
				break;
			default :
				break;

		}
		TiffField xResolutionField = findField(entries, TIFF_TAG_XResolution);
		TiffField yResolutionField = findField(entries, TIFF_TAG_YResolution);

		int physicalWidthDpi = -1;
		float physicalWidthInch = -1;
		int physicalHeightDpi = -1;
		float physicalHeightInch = -1;

		if (unitsPerInch > 0)
		{
			if ((xResolutionField != null)
					&& (xResolutionField.getValue() != null))
			{
				double XResolutionPixelsPerUnit = ((Number) xResolutionField
						.getValue()).doubleValue();
				physicalWidthDpi = (int) (XResolutionPixelsPerUnit / unitsPerInch);
				physicalWidthInch = (float) ((double) width / (XResolutionPixelsPerUnit * unitsPerInch));
			}
			if ((yResolutionField != null)
					&& (yResolutionField.getValue() != null))
			{
				double YResolutionPixelsPerUnit = ((Number) yResolutionField
						.getValue()).doubleValue();
				physicalHeightDpi = (int) (YResolutionPixelsPerUnit / unitsPerInch);
				physicalHeightInch = (float) ((double) height / (YResolutionPixelsPerUnit * unitsPerInch));
			}
		}

		//-------------------

		TiffField bitsPerSampleField = findField(entries,
				TIFF_TAG_BitsPerSample);
//		TiffField samplesPerPixelField = findField(entries,
//				TIFF_TAG_SamplesPerPixel);

		int bitsPerSample = -1;

		if ((bitsPerSampleField != null)
				&& (bitsPerSampleField.getValue() != null))
		{
			bitsPerSample = getValueOrArraySum(bitsPerSampleField);
		}

		int bitsPerPixel = bitsPerSample; // assume grayscale;
		// dunno if this handles colormapped images correctly.

		//-------------------

		Vector comments = new Vector();
		for (int i = 0; i < entries.size(); i++)
		{
			TiffField field = (TiffField) entries.get(i);
			String comment = field.toString();
			comments.add(comment);
		}

		ImageFormat format = ImageFormat.IMAGE_FORMAT_TIFF;
		String formatName = "TIFF Tag-based Image File Format";
		String mimeType = "image/tiff";
		// we ought to count images, but don't yet.
		int numberOfImages = -1;
		// not accurate ... only reflects first
		boolean isProgressive = false;
		// is TIFF ever interlaced/progressive?

		String formatDetails = "Tiff v." + contents.header.tiffVersion;

		boolean isTransparent = false; // TODO: wrong
		boolean usesPalette = false;
		TiffField colorMapField = findField(entries, TIFF_TAG_ColorMap);
		if (colorMapField != null)
			usesPalette = true;

		int colorType = ImageInfo.COLOR_TYPE_RGB;

		int compression = getTagAsNumber(entries, TIFF_TAG_Compression)
				.intValue();
		String compressionAlgorithm;

		switch (compression)
		{
			case TIFF_COMPRESSION_UNCOMPRESSED_1 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_NONE;
				break;
			case TIFF_COMPRESSION_CCITT_1D :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_CCITT_1D;
				break;
			case TIFF_COMPRESSION_CCITT_GROUP_3 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_CCITT_GROUP_3;
				break;
			case TIFF_COMPRESSION_CCITT_GROUP_4 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_CCITT_GROUP_4;
				break;
			case TIFF_COMPRESSION_LZW :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_LZW;
				break;
			case TIFF_COMPRESSION_JPEG :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_JPEG;
				break;
			case TIFF_COMPRESSION_UNCOMPRESSED_2 :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_NONE;
				break;
			case TIFF_COMPRESSION_PACKBITS :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_PACKBITS;
				break;
			default :
				compressionAlgorithm = ImageInfo.COMPRESSION_ALGORITHM_UNKNOWN;
				break;
		}

		ImageInfo result = new ImageInfo(formatDetails, bitsPerPixel, comments,
				format, formatName, height, mimeType, numberOfImages,
				physicalHeightDpi, physicalHeightInch, physicalWidthDpi,
				physicalWidthInch, width, isProgressive, isTransparent,
				usesPalette, colorType, compressionAlgorithm);

		return result;
	}

	public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		pw.println("tiff.dumpImageFile");

		{
			ImageInfo imageData = getImageInfo(byteSource);
			if (imageData == null)
				return false;

			imageData.toString(pw, "");
		}

		pw.println("");

		try
		{
			TiffContents contents = readDirectories(byteSource, null, -1, -1,
					getDefaultFormatCompliance());
			if (contents == null)
				return false;

			Vector directories = contents.directories;

			if (directories == null)
				return false;

			for (int d = 0; d < directories.size(); d++)
			{
				TiffDirectory directory = (TiffDirectory) directories.get(d);

				Vector entries = directory.entries;

				if (entries == null)
					return false;

				Debug.debug("directory offset", directory.offset);
				Debug.debug("directory offset", directory.offset);

				for (int i = 0; i < entries.size(); i++)
				{
					TiffField field = (TiffField) entries.get(i);

					field.dump(pw, d + "");
				}
			}

			pw.println("");
		}
		catch (Exception e)
		{
			Debug.debug(e);
			pw.println("");
			return false;
		}

		return true;
	}

	private Number getTagAsNumber(Vector entries, TagInfo tag)
			throws ImageReadException, IOException
	{
		TiffField entry = findField(entries, tag);
		if (entry == null)
			throw new ImageReadException("Tiff: Missing Tag: " + tag.name
					+ " (" + tag.tag + ")");

		Object o = entry.getValue();

		//		Debug.debug("getTagAsNumber:" + entry.tagInfo.name, o);
		//		Debug.debug("getTagAsNumber:" + entry.tagInfo.name, Debug.getType(o));

		Number result = (Number) o;

		if (debug)
			this.debugNumber(tag.name + " (" + tag.tag + ")",
					result.intValue(), 4);

		return result;
	}

	private int getTagAsValueOrArraySum(Vector entries, TagInfo tag)
			throws ImageReadException, IOException
	{
		TiffField entry = findField(entries, tag);
		if (entry == null)
			throw new ImageReadException("Tiff: Missing Tag: " + tag.name
					+ " (" + tag.tag + ")");

		int result = getValueOrArraySum(entry);

		if (debug)
			this.debugNumber(tag.name + " (" + tag.tag + ")", result, 4);

		return result;
	}

	private double[] getTagAsDoubleArray(Vector entries, TagInfo tag,
			boolean throwExceptionIfMissing) throws ImageReadException,
			IOException
	{
		TiffField entry = findField(entries, tag);
		if (entry == null)
		{
			if (throwExceptionIfMissing)
				throw new ImageReadException("Tiff: Missing Tag: " + tag.name
						+ " (" + tag.tag + ")");
			else
				return null;
		}

		double result[] = getValueAsDoubleArray(entry);

		return result;
	}

	private int[] getTagAsIntArray(Vector entries, TagInfo tag,
			boolean throwExceptionIfMissing) throws ImageReadException,
			IOException
	{
		TiffField entry = findField(entries, tag);
		if (entry == null)
		{
			if (throwExceptionIfMissing)
				throw new ImageReadException("Tiff: Missing Tag: " + tag.name
						+ " (" + tag.tag + ")");
			else
				return null;
		}

		int result[] = getValueAsIntArray(entry);

		if (debug)
			this.debugNumberArray(tag.name + " (" + tag.tag + ")", result, 4);

		return result;
	}

	private int dumpOptionalNumberTag(Vector entries, TagInfo tag)
	{
		TiffField entry = findField(entries, tag);

		if (entry != null)
		{
			Object o = entry.getValue();
			if (o instanceof Number)
			{
				int value = ((Number) o).intValue();
				System.out.println(tag.name + ": " + value);
				return value;
			}
		}
		return -1;
	}

	public FormatCompliance getFormatCompliance(ByteSource byteSource)
			throws ImageReadException, IOException
	{
		FormatCompliance result = new FormatCompliance(byteSource
				.getDescription());

		readDirectories(byteSource, null, -1, -1, result);

		return result;
	}

	public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
			throws ImageReadException, IOException
	{
		TiffContents contents = readDirectories(byteSource, null, -1, -1,
				getDefaultFormatCompliance());
		if (contents == null)
			throw new ImageReadException("TIFF missing contents");

		Vector directories = contents.directories;

		if ((directories == null) || (directories.size() < 1))
			throw new ImageReadException("TIFF missing TiffDirectories");

		TiffDirectory directory = (TiffDirectory) directories.get(0);

		return getBufferedImage(byteSource, directory, params);
	}

	public RawTiffImageData getTiffRawImageData(ByteSource byteSource,
			TiffDirectory directory) throws ImageReadException, IOException
	{
		Vector elements = directory.getTiffRawImageDataElements();
		byte result[][] = new byte[elements.size()][];
		for (int i = 0; i < elements.size(); i++)
		{
			TiffDirectory.ImageDataElement element = (TiffDirectory.ImageDataElement) elements
					.get(i);
			result[i] = byteSource.getBlock(element.offset, element.length);
		}

		if (directory.imageDataInStrips())
			return new RawTiffImageData.Strips(result);
		else
			return new RawTiffImageData.Tiles(result);
	}

	public byte[] getJpegRawImageData(ByteSource byteSource,
			TiffDirectory directory) throws ImageReadException, IOException
	{
		ImageDataElement element = directory.getJpegRawImageDataElement();
		byte result[] = byteSource.getBlock(element.offset, element.length);
		return result;
	}

	public BufferedImage getBufferedImage(ByteSource byteSource,
			TiffDirectory directory, Map params) throws ImageReadException,
			IOException
	{
		Vector entries = directory.entries;

		if (entries == null)
			throw new ImageReadException("TIFF missing entries");

		//			this.setDebug(true);

		TiffField imageWidthField = findField(entries, TIFF_TAG_ImageWidth);
		if (imageWidthField == null)
			throw new ImageReadException(
					"Tiff: Missing Tag: TIFF_TAG_ImageWidth");
		TiffField imageLengthField = findField(entries, TIFF_TAG_ImageLength);
		if (imageLengthField == null)
			throw new ImageReadException(
					"Tiff: Missing Tag: TIFF_TAG_ImageLength");

		int photometricInterpretation = getTagAsNumber(entries,
				TIFF_TAG_PhotometricInterpretation).intValue();
		int compression = getTagAsNumber(entries, TIFF_TAG_Compression)
				.intValue();
		int width = getTagAsNumber(entries, TIFF_TAG_ImageWidth).intValue();
		int height = getTagAsNumber(entries, TIFF_TAG_ImageLength).intValue();
		int samplesPerPixel = getTagAsNumber(entries, TIFF_TAG_SamplesPerPixel)
				.intValue();
		int bitsPerSample[] = getTagAsIntArray(entries, TIFF_TAG_BitsPerSample,
				true);
		int bitsPerPixel = getTagAsValueOrArraySum(entries,
				TIFF_TAG_BitsPerSample);

		int predictor;
		{
			dumpOptionalNumberTag(entries, TIFF_TAG_FillOrder);
			dumpOptionalNumberTag(entries, TIFF_TAG_FreeByteCounts);
			dumpOptionalNumberTag(entries, TIFF_TAG_FreeOffsets);
			dumpOptionalNumberTag(entries, TIFF_TAG_Orientation);
			dumpOptionalNumberTag(entries, TIFF_TAG_PlanarConfiguration);
			predictor = dumpOptionalNumberTag(entries, TIFF_TAG_Predictor);
		}

		if (samplesPerPixel != bitsPerSample.length)
			throw new ImageReadException("Tiff: fSamplesPerPixel ("
					+ samplesPerPixel + ")!=fBitsPerSample.length ("
					+ bitsPerSample.length + ")");

		BufferedImage result = getBufferedImageFactory(params)
				.getColorBufferedImage(width, height);

		PhotometricInterpreter photometricInterpreter = getPhotometricInterpreter(
				entries, photometricInterpretation, bitsPerPixel,
				bitsPerSample, predictor, samplesPerPixel, width, height);

		//			this.setDebug(false);

		DataReader dataReader = getDataReader(entries, photometricInterpreter,
				bitsPerPixel, bitsPerSample, predictor, samplesPerPixel, width,
				height, compression);

		dataReader.readImageData(result, byteSource);

		photometricInterpreter.dumpstats();

		return result;
	}

	private PhotometricInterpreter getPhotometricInterpreter(Vector entries,
			int photometricInterpretation, int bitsPerPixel,
			int bitsPerSample[], int predictor, int samplesPerPixel, int width,
			int height) throws IOException, ImageReadException
	{
		switch (photometricInterpretation)
		{
			case 0 :
			case 1 :
				boolean invert = photometricInterpretation == 0;

				return new PhotometricInterpreterBiLevel(bitsPerPixel,
						samplesPerPixel, bitsPerSample, predictor, width,
						height, invert);
			case 3 : // Palette
			{
				int[] colorMap = getTagAsIntArray(entries, TIFF_TAG_ColorMap,
						false);

				int expected_colormap_size = 3 * (1 << bitsPerPixel);

				if (colorMap.length != expected_colormap_size)
					throw new ImageReadException("Tiff: fColorMap.length ("
							+ colorMap.length + ")!=expected_colormap_size ("
							+ expected_colormap_size + ")");

				return new PhotometricInterpreterPalette(samplesPerPixel,
						bitsPerSample, predictor, width, height, colorMap);
			}
			case 2 : // RGB
				return new PhotometricInterpreterRGB(samplesPerPixel,
						bitsPerSample, predictor, width, height);
			case 5 : // CMYK
				return new PhotometricInterpreterCMYK(samplesPerPixel,
						bitsPerSample, predictor, width, height);
			case 6 : // 
			{
				double[] fYCbCrCoefficients = getTagAsDoubleArray(entries,
						TIFF_TAG_YCbCrCoefficients, false);
				int[] fYCbCrPositioning = getTagAsIntArray(entries,
						TIFF_TAG_YCbCrPositioning, false);
				int[] fYCbCrSubSampling = getTagAsIntArray(entries,
						TIFF_TAG_YCbCrSubSampling, false);
				double[] referenceBlackWhite = getTagAsDoubleArray(entries,
						TIFF_TAG_ReferenceBlackWhite, false);

				return new PhotometricInterpreterYCbCr(fYCbCrCoefficients,
						fYCbCrPositioning, fYCbCrSubSampling,
						referenceBlackWhite, samplesPerPixel, bitsPerSample,
						predictor, width, height);
			}

			case 8 :
				return new PhotometricInterpreterCIELAB(samplesPerPixel,
						bitsPerSample, predictor, width, height);

			case 32844 :
			case 32845 : {
				boolean yonly = (photometricInterpretation == 32844);
				return new PhotometricInterpreterLogLUV(samplesPerPixel,
						bitsPerSample, predictor, width, height, yonly);
			}

			default :
				throw new ImageReadException(
						"TIFF: Unknown fPhotometricInterpretation: "
								+ photometricInterpretation);
		}
	}

	private DataReader getDataReader(Vector entries,
			PhotometricInterpreter photometricInterpreter, int bitsPerPixel,
			int bitsPerSample[], int predictor, int samplesPerPixel, int width,
			int height, int compression) throws IOException, ImageReadException
	{
		int[] tileOffsets = getTagAsIntArray(entries, TIFF_TAG_TileOffsets,
				false);
		int[] tileByteCounts = getTagAsIntArray(entries,
				TIFF_TAG_TileByteCounts, false);

		int[] stripOffsets = getTagAsIntArray(entries, TIFF_TAG_StripOffsets,
				false);
		int[] stripByteCounts = getTagAsIntArray(entries,
				TIFF_TAG_StripByteCounts, false);

		TiffField tileWidthField = findField(entries, TIFF_TAG_TileWidth);
		TiffField tileLengthField = findField(entries, TIFF_TAG_TileLength);

		if ((tileOffsets != null) && (tileByteCounts != null))
		{
			if (tileOffsets.length != tileByteCounts.length)
				throw new ImageReadException("Tiff: fTileOffsets.length ("
						+ tileOffsets.length + ")!=fTileByteCounts.length ("
						+ tileByteCounts.length + ")");

			int tileWidth = getTagAsNumber(entries, TIFF_TAG_TileWidth)
					.intValue();
			int tileLength = getTagAsNumber(entries, TIFF_TAG_TileLength)
					.intValue();

			return new DataReaderTiled(photometricInterpreter, tileOffsets,
					tileByteCounts, tileWidth, tileLength, bitsPerPixel,
					bitsPerSample, predictor, samplesPerPixel, width, height,
					compression, getByteOrder());
		}
		else if ((tileWidthField != null) && (tileLengthField != null)
				&& (stripOffsets != null) && (stripByteCounts != null))
		{
			if (stripOffsets.length != stripByteCounts.length)
				throw new ImageReadException("Tiff: fStripOffsets.length ("
						+ stripOffsets.length + ")!=fStripByteCounts.length ("
						+ stripByteCounts.length + ")");

			int tileWidth = getTagAsNumber(entries, TIFF_TAG_TileWidth)
					.intValue();
			int tileLength = getTagAsNumber(entries, TIFF_TAG_TileLength)
					.intValue();

			return new DataReaderTiled(photometricInterpreter, stripOffsets,
					stripByteCounts, tileWidth, tileLength, bitsPerPixel,
					bitsPerSample, predictor, samplesPerPixel, width, height,
					compression, getByteOrder());
		}
		else if ((stripOffsets != null) && (stripByteCounts != null))
		{
			int rowsPerStrip = getTagAsNumber(entries, TIFF_TAG_RowsPerStrip)
					.intValue();

			if (stripOffsets.length != stripByteCounts.length)
				throw new ImageReadException("Tiff: fStripOffsets.length ("
						+ stripOffsets.length + ")!=fStripByteCounts.length ("
						+ stripByteCounts.length + ")");

			return new DataReaderStrips(photometricInterpreter, bitsPerPixel,
					bitsPerSample, predictor, samplesPerPixel, width, height,
					stripOffsets, stripByteCounts, compression, rowsPerStrip,
					getByteOrder());
		}
		else
			throw new ImageReadException("Tiff: Neither Strip nor Tile.");
	}

	public void writeImage(BufferedImage src, OutputStream os, Map params)
			throws ImageWriteException, IOException
	{
		new TiffImageWriter().writeImage(src, os, params);
	}

}