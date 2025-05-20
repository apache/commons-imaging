/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.png;

import org.apache.commons.imaging.common.BinaryConstant;

public final class PngConstants {

    public static final int COMPRESSION_DEFLATE_INFLATE = 0;

    public static final BinaryConstant PNG_SIGNATURE = new BinaryConstant(new byte[] { (byte) 0x89, 'P', 'N', 'G', '\r', '\n', 0x1A, '\n', });

    public static final byte COMPRESSION_TYPE_INFLATE_DEFLATE = 0;
    public static final byte FILTER_METHOD_ADAPTIVE = 0;

    /*
     * Background color Solid background color to be used when presenting the image if no better option is available. Gamma and chromaticity Gamma
     * characteristic of the image with respect to the desired output intensity, and chromaticity characteristics of the RGB values used in the image. ICC
     * profile Description of the color space (in the form of an International Color Consortium (ICC) profile) to which the samples in the image conform. Image
     * histogram Estimates of how frequently the image uses each palette entry. Physical pixel dimensions Intended pixel size and aspect ratio to be used in
     * presenting the PNG image. Significant bits The number of bits that are significant in the samples. sRGB color space A rendering intent (as defined by the
     * International Color Consortium) and an indication that the image samples conform to this color space. Suggested palette A reduced palette that may be
     * used when the display device is not capable of displaying the full range of colors in the image. Textual data Textual information (which may be
     * compressed) associated with the image. Time The time when the PNG image was last modified. Transparency Alpha information that allows the reference image
     * to be reconstructed when the alpha channel is not retained in the PNG image.
     */

    public static final String XMP_KEYWORD = "XML:com.adobe.xmp";

    /**
     * Parameter key. Used to indicate the PNG compression level to be used.
     *
     * <p>
     * For valid values, see {@link java.util.zip.Deflater}. If no value is specified, it will use the default compression level.
     * </p>
     *
     * @see java.util.zip.Deflater
     */
    public static final String PARAM_KEY_PNG_COMPRESSION_LEVEL = "PNG_COMPRESSION_LEVEL";

    private PngConstants() {
    }
}
