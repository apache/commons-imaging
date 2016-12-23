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

package org.apache.commons.imaging;

import java.awt.RenderingHints;
import java.awt.Transparency;
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

/**
 * A selection of tools for evaluating and manipulating color
 * spaces, color values, etc.
 * <p>The Javadoc provided in the original code gave the 
 * following notation:<br><br>
 *
 * &nbsp;&nbsp;&nbsp; "This class is a mess and needs to be cleaned up."
 */
public class ColorTools {

    public BufferedImage correctImage(final BufferedImage src, final File file)
            throws ImageReadException, IOException {
        final ICC_Profile icc = Imaging.getICCProfile(file);
        if (icc == null) {
            return src;
        }

        final ICC_ColorSpace cs = new ICC_ColorSpace(icc);

        return convertFromColorSpace(src, cs);
    }

    public BufferedImage relabelColorSpace(final BufferedImage bi, final ICC_Profile profile)
            throws ImagingOpException {
        final ICC_ColorSpace cs = new ICC_ColorSpace(profile);

        return relabelColorSpace(bi, cs);
    }

    public BufferedImage relabelColorSpace(final BufferedImage bi, final ColorSpace cs)
            throws ImagingOpException {
        // This does not do the conversion. It tries to relabel the
        // BufferedImage
        // with its actual (presumably correct) Colorspace.
        // use this when the image is mislabeled, presumably having been
        // wrongly assumed to be sRGB

        final ColorModel cm = deriveColorModel(bi, cs);

        return relabelColorSpace(bi, cm);

    }

    public BufferedImage relabelColorSpace(final BufferedImage bi, final ColorModel cm)
            throws ImagingOpException {
        // This does not do the conversion. It tries to relabel the
        // BufferedImage
        // with its actual (presumably correct) Colorspace.
        // use this when the image is mislabeled, presumably having been
        // wrongly assumed to be sRGB

        return new BufferedImage(cm, bi.getRaster(), false, null);
    }

    public ColorModel deriveColorModel(final BufferedImage bi, final ColorSpace cs)
            throws ImagingOpException {
        // boolean hasAlpha = (bi.getAlphaRaster() != null);
        return deriveColorModel(bi, cs, false);
    }

    public ColorModel deriveColorModel(final BufferedImage bi, final ColorSpace cs,
            final boolean forceNoAlpha) throws ImagingOpException {
        return deriveColorModel(bi.getColorModel(), cs, forceNoAlpha);
    }

    public ColorModel deriveColorModel(final ColorModel colorModel, final ColorSpace cs,
            final boolean forceNoAlpha) throws ImagingOpException {

        if (colorModel instanceof ComponentColorModel) {
            final ComponentColorModel ccm = (ComponentColorModel) colorModel;
            // ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_sRGB);
            if (forceNoAlpha) {
                return new ComponentColorModel(cs, false, false,
                        Transparency.OPAQUE, ccm.getTransferType());
            }
            return new ComponentColorModel(cs, ccm.hasAlpha(),
                    ccm.isAlphaPremultiplied(), ccm.getTransparency(),
                    ccm.getTransferType());
        } else if (colorModel instanceof DirectColorModel) {
            final DirectColorModel dcm = (DirectColorModel) colorModel;

            final int oldMask = dcm.getRedMask() | dcm.getGreenMask()
                    | dcm.getBlueMask() | dcm.getAlphaMask();

            final int oldBits = countBitsInMask(oldMask);

            return new DirectColorModel(cs, oldBits, dcm.getRedMask(),
                    dcm.getGreenMask(), dcm.getBlueMask(), dcm.getAlphaMask(),
                    dcm.isAlphaPremultiplied(), dcm.getTransferType());
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
        // int old_bits = countBitsInMask(old_masks);
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

    private int countBitsInMask(int i) {
        int count = 0;
        while (i != 0) {
            count += (i & 1);
            // uses the unsigned version of java's right shift operator,
            // so that left hand bits are zeroed.
            i >>>= 1;
        }
        return count;
    }

    public BufferedImage convertToColorSpace(final BufferedImage bi, final ColorSpace to) {
        final ColorSpace from = bi.getColorModel().getColorSpace();

        final RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_COLOR_RENDERING,
                RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_DITHERING,
                RenderingHints.VALUE_DITHER_ENABLE);

        final ColorConvertOp op = new ColorConvertOp(from, to, hints);

        BufferedImage result = op.filter(bi, null);

        result = relabelColorSpace(result, to);

        return result;
    }

    public BufferedImage convertTosRGB(final BufferedImage bi) {
        final ColorModel srgbCM = ColorModel.getRGBdefault();
        return convertToColorSpace(bi, srgbCM.getColorSpace());
    }

    protected BufferedImage convertFromColorSpace(final BufferedImage bi, final ColorSpace from) {
        final ColorModel srgbCM = ColorModel.getRGBdefault();
        return convertBetweenColorSpaces(bi, from, srgbCM.getColorSpace());
    }

    public BufferedImage convertBetweenICCProfiles(final BufferedImage bi, final ICC_Profile from, final ICC_Profile to) {
        final ICC_ColorSpace csFrom = new ICC_ColorSpace(from);
        final ICC_ColorSpace csTo = new ICC_ColorSpace(to);

        return convertBetweenColorSpaces(bi, csFrom, csTo);
    }

    public BufferedImage convertToICCProfile(final BufferedImage bi, final ICC_Profile to) {
        final ICC_ColorSpace csTo = new ICC_ColorSpace(to);
        return convertToColorSpace(bi, csTo);
    }

    public BufferedImage convertBetweenColorSpacesX2(BufferedImage bi,
            final ColorSpace from, final ColorSpace to) {
        final RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
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
        final ColorConvertOp op = new ColorConvertOp(from, to, hints);
        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, from);

        bi = op.filter(bi, null);

        bi = relabelColorSpace(bi, to);

        return bi;

    }

    public BufferedImage convertBetweenColorSpaces(BufferedImage bi,
            final ColorSpace from, final ColorSpace to) {
        final RenderingHints hints = new RenderingHints(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_COLOR_RENDERING,
                RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        hints.put(RenderingHints.KEY_DITHERING,
                RenderingHints.VALUE_DITHER_ENABLE);

        final ColorConvertOp op = new ColorConvertOp(from, to, hints);

        bi = relabelColorSpace(bi, from);

        BufferedImage result = op.filter(bi, null);

        result = relabelColorSpace(result, to);

        return result;
    }

}
