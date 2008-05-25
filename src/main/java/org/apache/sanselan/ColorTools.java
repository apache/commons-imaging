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

package org.apache.sanselan;

import java.awt.RenderingHints;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;

/**
 * This class is a mess and needs to be cleaned up.
 */
public class ColorTools {

	public BufferedImage correctImage(BufferedImage src, File file)
			throws ImageReadException, IOException {
		ICC_Profile icc = Sanselan.getICCProfile(file);
		if (icc == null)
			return src;

		ICC_ColorSpace cs = new ICC_ColorSpace(icc);

		BufferedImage dst = convertFromColorSpace(src, cs);
		return dst;
	}

	public BufferedImage relabelColorSpace(BufferedImage bi, ICC_Profile profile)
			throws ImagingOpException {
		ICC_ColorSpace cs = new ICC_ColorSpace(profile);

		return relabelColorSpace(bi, cs);
	}

	public BufferedImage relabelColorSpace(BufferedImage bi, ColorSpace cs)
			throws ImagingOpException {
		// This does not do the conversion. It tries to relabel the
		// BufferedImage
		// with its actual (presumably correct) Colorspace.
		// use this when the image is mislabeled, presumably having been
		// wrongly assumed to be sRGB

		ColorModel cm = deriveColorModel(bi, cs);

		return relabelColorSpace(bi, cm);

	}

	public BufferedImage relabelColorSpace(BufferedImage bi, ColorModel cm)
			throws ImagingOpException {
		// This does not do the conversion. It tries to relabel the
		// BufferedImage
		// with its actual (presumably correct) Colorspace.
		// use this when the image is mislabeled, presumably having been
		// wrongly assumed to be sRGB

		BufferedImage result = new BufferedImage(cm, bi.getRaster(), false,
				null);

		return result;
	}

	public ColorModel deriveColorModel(BufferedImage bi, ColorSpace cs)
			throws ImagingOpException {
		// boolean hasAlpha = (bi.getAlphaRaster() != null);
		return deriveColorModel(bi, cs, false);
	}

	public ColorModel deriveColorModel(BufferedImage bi, ColorSpace cs,
			boolean force_no_alpha) throws ImagingOpException {
		return deriveColorModel(bi.getColorModel(), cs, force_no_alpha);
	}

	public ColorModel deriveColorModel(ColorModel old_cm, ColorSpace cs,
			boolean force_no_alpha) throws ImagingOpException {

		if (old_cm instanceof ComponentColorModel) {
			ComponentColorModel ccm = (ComponentColorModel) old_cm;
			// ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
			if (force_no_alpha)
				return new ComponentColorModel(cs, false, false,
						ComponentColorModel.OPAQUE, ccm.getTransferType());
			else
				return new ComponentColorModel(cs, ccm.hasAlpha(), ccm
						.isAlphaPremultiplied(), ccm.getTransparency(), ccm
						.getTransferType());
		} else if (old_cm instanceof DirectColorModel) {
			DirectColorModel dcm = (DirectColorModel) old_cm;

			int old_mask = dcm.getRedMask() | dcm.getGreenMask()
					| dcm.getBlueMask() | dcm.getAlphaMask();

			int old_bits = count_bits_in_mask(old_mask);

			return new DirectColorModel(cs, old_bits, dcm.getRedMask(), dcm
					.getGreenMask(), dcm.getBlueMask(), dcm.getAlphaMask(), dcm
					.isAlphaPremultiplied(), dcm.getTransferType());
		}
		// else if (old_cm instanceof PackedColorModel)
		// {
		// PackedColorModel pcm = (PackedColorModel) old_cm;
		//
		// // int old_mask = dcm.getRedMask() | dcm.getGreenMask()
		// // | dcm.getBlueMask() | dcm.getAlphaMask();
		//
		// int old_masks[] = pcm.getMasks();
		// // System.out.println("old_mask: " + old_mask);
		// int old_bits = count_bits_in_mask(old_masks);
		// // System.out.println("old_bits: " + old_bits);
		//
		// // PackedColorModel(ColorSpace space, int bits, int rmask, int gmask,
		// int bmask, int amask, boolean isAlphaPremultiplied, int trans, int
		// transferType)
		// cm = new PackedColorModel(cs, old_bits, pcm.getMasks(),
		//
		// pcm.isAlphaPremultiplied(), pcm.getTransparency(), pcm
		// .getTransferType());
		// }

		throw new ImagingOpException("Could not clone unknown ColorModel Type.");
	}

	private int count_bits_in_mask(int i) {
		int count = 0;
		while (i != 0) {
			count += (i & 1);
			// uses the unsigned version of java's right shift operator,
			// so that left hand bits are zeroed.
			i >>>= 1;
		}
		return count;
	}

	public BufferedImage convertToColorSpace(BufferedImage bi, ColorSpace to) {
		ColorSpace from = bi.getColorModel().getColorSpace();

		RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_COLOR_RENDERING,
				RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_DITHERING,
				RenderingHints.VALUE_DITHER_ENABLE);

		ColorConvertOp op = new ColorConvertOp(from, to, hints);

		BufferedImage result = op.filter(bi, null);

		result = relabelColorSpace(result, to);

		return result;
	}

	public BufferedImage convertTosRGB(BufferedImage bi) {
		ColorSpace cs_sRGB = ColorSpace.getInstance(ColorSpace.CS_sRGB);

		ColorModel srgbCM = ColorModel.getRGBdefault();
		cs_sRGB = srgbCM.getColorSpace();

		return convertToColorSpace(bi, cs_sRGB);
	}

	protected BufferedImage convertFromColorSpace(BufferedImage bi,
			ColorSpace from) {
		ColorSpace cs_sRGB;

		ColorModel srgbCM = ColorModel.getRGBdefault();
		cs_sRGB = srgbCM.getColorSpace();

		return convertBetweenColorSpaces(bi, from, cs_sRGB);

	}

	public BufferedImage convertBetweenICCProfiles(BufferedImage bi,
			ICC_Profile from, ICC_Profile to) {
		ICC_ColorSpace cs_from = new ICC_ColorSpace(from);
		ICC_ColorSpace cs_to = new ICC_ColorSpace(to);

		return convertBetweenColorSpaces(bi, cs_from, cs_to);
	}

	public BufferedImage convertToICCProfile(BufferedImage bi, ICC_Profile to) {
		ICC_ColorSpace cs_to = new ICC_ColorSpace(to);

		return convertToColorSpace(bi, cs_to);
	}

	public BufferedImage convertBetweenColorSpacesX2(BufferedImage bi,
			ColorSpace from, ColorSpace to) {
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_COLOR_RENDERING,
				RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_DITHERING,
				RenderingHints.VALUE_DITHER_ENABLE);

		// bi = relabelColorSpace(bi, cs);
		// dumpColorSpace("\tcs_sRGB", cs_sRGB);
		// dumpColorSpace("\tColorModel.getRGBdefaultc",
		// ColorModel.getRGBdefault().getColorSpace());

		bi = relabelColorSpace(bi, from);
		ColorConvertOp op = new ColorConvertOp(from, to, hints);
		bi = op.filter(bi, null);

		bi = relabelColorSpace(bi, from);

		bi = op.filter(bi, null);

		bi = relabelColorSpace(bi, to);

		return bi;

	}

	public BufferedImage convertBetweenColorSpaces(BufferedImage bi,
			ColorSpace from, ColorSpace to) {
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_COLOR_RENDERING,
				RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		hints.put(RenderingHints.KEY_DITHERING,
				RenderingHints.VALUE_DITHER_ENABLE);

		ColorConvertOp op = new ColorConvertOp(from, to, hints);

		bi = relabelColorSpace(bi, from);

		BufferedImage result = op.filter(bi, null);

		result = relabelColorSpace(result, to);

		return result;
	}

}