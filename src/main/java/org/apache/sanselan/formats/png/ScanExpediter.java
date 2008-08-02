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
package org.apache.sanselan.formats.png;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.BinaryFileParser;
import org.apache.sanselan.formats.png.chunks.PNGChunkPLTE;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilter;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilterAverage;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilterNone;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilterPaeth;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilterSub;
import org.apache.sanselan.formats.png.scanlinefilters.ScanlineFilterUp;
import org.apache.sanselan.formats.transparencyfilters.TransparencyFilter;
import org.apache.sanselan.util.Debug;

public abstract class ScanExpediter extends BinaryFileParser
{
	protected final int width;
	protected final int height;
	protected final InputStream is;
	protected final BufferedImage bi;
	protected final int colorType;
	protected final int bitDepth;
	protected final int bytesPerPixel;
	protected final int bitsPerPixel;
	protected final PNGChunkPLTE pngChunkPLTE;
	protected final GammaCorrection gammaCorrection;
	protected final TransparencyFilter transparencyFilter;

	public ScanExpediter(int width, int height, InputStream is,
			BufferedImage bi, int color_type, int bitDepth, int bitsPerPixel,
			PNGChunkPLTE pngChunkPLTE, GammaCorrection gammaCorrection,
			TransparencyFilter transparencyFilter)

	{
		this.width = width;
		this.height = height;
		this.is = is;
		this.bi = bi;
		this.colorType = color_type;
		this.bitDepth = bitDepth;
		this.bytesPerPixel = this.getBitsToBytesRoundingUp(bitsPerPixel);
		this.bitsPerPixel = bitsPerPixel;
		this.pngChunkPLTE = pngChunkPLTE;
		this.gammaCorrection = gammaCorrection;
		this.transparencyFilter = transparencyFilter;
	}

	protected int getBitsToBytesRoundingUp(int bits)
	{
		int bytes = bits / 8;
		if ((bits % 8 > 0))
			bytes++;
		return bytes;
	}

	protected final int getPixelARGB(int alpha, int red, int green, int blue)
	{
		int rgb = ((0xff & alpha) << 24) | ((0xff & red) << 16)
				| ((0xff & green) << 8) | ((0xff & blue) << 0);

		return rgb;
	}

	protected final int getPixelRGB(int red, int green, int blue)
	{
		return getPixelARGB(0xff, red, green, blue);
	}

	public abstract void drive() throws ImageReadException, IOException;

	protected int getRGB(BitParser bitParser, int pixelIndexInScanline)
			throws ImageReadException, IOException
	{

		switch (colorType)
		{
		case 0: // 1,2,4,8,16 Each pixel is a grayscale sample.
		{
			int sample = bitParser.getSampleAsByte(pixelIndexInScanline, 0);

			if (gammaCorrection != null)
			{
				sample = gammaCorrection.correctSample(sample);
			}

			int rgb = getPixelRGB(sample, sample, sample);

			if (transparencyFilter != null)
				rgb = transparencyFilter.filter(rgb, sample);

			return rgb;

		}
		case 2: // 8,16 Each pixel is an R,G,B triple.
		{
			int red = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
			int green = bitParser.getSampleAsByte(pixelIndexInScanline, 1);
			int blue = bitParser.getSampleAsByte(pixelIndexInScanline, 2);

			int rgb = getPixelRGB(red, green, blue);

			if (transparencyFilter != null)
				rgb = transparencyFilter.filter(rgb, -1);

			if (gammaCorrection != null)
			{
				int alpha = (0xff000000 & rgb) >> 24; // make sure to preserve
				// transparency
				red = gammaCorrection.correctSample(red);
				green = gammaCorrection.correctSample(green);
				blue = gammaCorrection.correctSample(blue);
				rgb = getPixelARGB(alpha, red, green, blue);
			}

			return rgb;
		}
			//					   
		case 3: // 1,2,4,8 Each pixel is a palette index;
			// a PLTE chunk must appear.
		{
			int index = bitParser.getSample(pixelIndexInScanline, 0);

			int rgb = pngChunkPLTE.getRGB(index);

			if (transparencyFilter != null)
				rgb = transparencyFilter.filter(rgb, index);

			return rgb;
		}
		case 4: // 8,16 Each pixel is a grayscale sample,
			// followed by an alpha sample.
		{
			int sample = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
			int alpha = bitParser.getSampleAsByte(pixelIndexInScanline, 1);

			if (gammaCorrection != null)
				sample = gammaCorrection.correctSample(sample);

			int rgb = getPixelARGB(alpha, sample, sample, sample);
			return rgb;

		}
		case 6: // 8,16 Each pixel is an R,G,B triple,
		{
			int red = bitParser.getSampleAsByte(pixelIndexInScanline, 0);
			int green = bitParser.getSampleAsByte(pixelIndexInScanline, 1);
			int blue = bitParser.getSampleAsByte(pixelIndexInScanline, 2);
			int alpha = bitParser.getSampleAsByte(pixelIndexInScanline, 3);

			if (gammaCorrection != null)
			{
				red = gammaCorrection.correctSample(red);
				green = gammaCorrection.correctSample(green);
				blue = gammaCorrection.correctSample(blue);
			}

			int rgb = getPixelARGB(alpha, red, green, blue);
			return rgb;
		}
		default:
			throw new ImageReadException("PNG: unknown color type: "
					+ colorType);
		}
	}

	protected ScanlineFilter getScanlineFilter(int filter_type,
			int BytesPerPixel) throws ImageReadException, IOException
	{
		ScanlineFilter filter;

		switch (filter_type)
		{
		case 0: // None
			filter = new ScanlineFilterNone();
			break;

		case 1: // Sub
			filter = new ScanlineFilterSub(BytesPerPixel);
			break;

		case 2: // Up
			filter = new ScanlineFilterUp(BytesPerPixel);
			break;

		case 3: // Average
			filter = new ScanlineFilterAverage(BytesPerPixel);
			break;

		case 4: // Paeth
			filter = new ScanlineFilterPaeth(BytesPerPixel);
			break;

		default:
			throw new ImageReadException("PNG: unknown filter_type: "
					+ filter_type);

		}

		return filter;
	}

	protected byte[] unfilterScanline(int filter_type, byte src[], byte prev[],
			int BytesPerPixel) throws ImageReadException, IOException
	{
		ScanlineFilter filter = getScanlineFilter(filter_type, BytesPerPixel);

		byte dst[] = new byte[src.length];
		filter.unfilter(src, dst, prev);
		return dst;
	}

	protected byte[] getNextScanline(InputStream is, int length, byte prev[],
			int BytesPerPixel) throws ImageReadException, IOException
	{
		int filterType = is.read();
		if (filterType < 0)
			throw new ImageReadException("PNG: missing filter type");

		byte scanline[] = this.readByteArray("scanline", length, is,
				"PNG: missing image data");

		byte unfiltered[] = unfilterScanline(filterType, scanline, prev,
				BytesPerPixel);

		return unfiltered;
	}

}