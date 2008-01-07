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

public class GammaCorrection
{
	private static final boolean DEBUG = false;

	//		private final double src_gamma, dst_gamma;
	private final int lookup_table[];

	public GammaCorrection(double src_gamma, double dst_gamma)
	{
		//			this.src_gamma = src_gamma;
		//			this.dst_gamma = dst_gamma;
		if (DEBUG)
		{
			System.out.println("src_gamma: " + src_gamma);
			System.out.println("dst_gamma: " + dst_gamma);
		}

		lookup_table = new int[256];
		for (int i = 0; i < 256; i++)
		{
			lookup_table[i] = correctSample(i, src_gamma, dst_gamma);
			if (DEBUG)
			{
				System.out.println("lookup_table[" + i + "]: "
						+ lookup_table[i]);
			}
		}
	}

	public int correctSample(int sample)
	{
		return lookup_table[sample];
	}

	public int correctARGB(int pixel)
	{
		int alpha = (0xff000000) & pixel;
		int red = (pixel & 0xff) >> 16;
		int green = (pixel & 0xff) >> 8;
		int blue = (pixel & 0xff) >> 0;

		red = correctSample(red);
		green = correctSample(green);
		blue = correctSample(blue);

		int rgb = alpha | ((0xff & red) << 16) | ((0xff & green) << 8)
				| ((0xff & blue) << 0);

		return rgb;
	}

	private int correctSample(int sample, double src_gamma, double dst_gamma)
	{
		//			if (kUseAdobeGammaMethod && val <= 32)
		//			{
		//				double slope = Math.round(255.0d * Math.pow((32.0 / 255.0d),
		//						src_gamma / dst_gamma)) / 32.d;
		//				return (int) (sample * slope);
		//			}

		return (int) Math.round(255.0d * Math.pow((sample / 255.0d), src_gamma
				/ dst_gamma));
	}

}