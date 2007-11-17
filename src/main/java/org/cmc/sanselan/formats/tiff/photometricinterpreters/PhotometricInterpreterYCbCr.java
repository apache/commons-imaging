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
package org.cmc.sanselan.formats.tiff.photometricinterpreters;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.cmc.sanselan.ImageReadException;

public class PhotometricInterpreterYCbCr extends PhotometricInterpreter
{

	public PhotometricInterpreterYCbCr(double[] fYCbCrCoefficients,
			int[] fYCbCrPositioning, int[] fYCbCrSubSampling,
			double[] fReferenceBlackWhite, int fSamplesPerPixel,
			int fBitsPerSample[], int Predictor, int width, int height)
	{
		super(fSamplesPerPixel, fBitsPerSample, Predictor, width, height);
	}

	public int limit(int value, int min, int max)
	{
		return Math.min(max, Math.max(min, value));
	}

	/**
	 * This method converts a YUV (aka YCbCr) colorspace to a RGB colorspace.
	 * This is handy when trying to reconstruct an image in Java from YCbCr transmitted
	 * data. This routine expects the data to fall in the standard PC 0..255 range
	 * per pixel, with the array dimensions corresponding to the imageWidth and imageHeight.
	 * These variables are either set manually in the case of a null constructor,
	 * or they are automatically calculated from the image parameter constructor.
	 * @param Y The Y component set.
	 * @param Cb The Cb component set.
	 * @param Cr The Cr component set.
	 * @return R The R component.
	 */
	public int convertYCbCrtoRGB(int Y, int Cb, int Cr)
	{
		double r1 = (((1.164 * ((double) Y - 16.0))) + (1.596 * ((double) Cr - 128.0)));
		double g1 = (((1.164 * ((double) Y - 16.0)))
				- (0.813 * ((double) Cr - 128.0)) - (0.392 * ((double) Cb - 128.0)));
		double b1 = (((1.164 * ((double) Y - 16.0))) + (2.017 * ((double) Cb - 128.0)));

		int r = limit((int) r1, 0, 255);
		int g = limit((int) g1, 0, 255);
		int b = limit((int) b1, 0, 255);

		int alpha = 0xff;
		int rgb = (alpha << 24) | (r << 16) | (g << 8) | (b << 0);
		return rgb;
	}

	public void interpretPixel(BufferedImage bi, int samples[], int x, int y)
			throws ImageReadException, IOException
	{
		int Y = samples[0];
		int Cb = samples[1];
		int Cr = samples[2];
		double R = Y + 1.402 * (Cr - 128.0);
		double G = Y - 0.34414 * (Cb - 128.0) - 0.71414 * (Cr - 128.0);
		double B = Y + 1.772 * (Cb - 128.0);

		int red = limit((int) R, 0, 255);
		int green = limit((int) G, 0, 255);
		int blue = limit((int) B, 0, 255);

		int alpha = 0xff;
		int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
		bi.setRGB(x, y, rgb);

	}
}