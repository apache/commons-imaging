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
package org.apache.commons.imaging.formats.png;

import org.apache.commons.imaging.SanselanConstants;
import org.apache.commons.imaging.common.BinaryConstant;
import org.apache.commons.imaging.common.BinaryFileFunctions;

public interface PngConstants extends SanselanConstants
{

    public static final int COMPRESSION_DEFLATE_INFLATE = 0;

    public final static BinaryConstant IHDR_CHUNK_TYPE = new BinaryConstant(new byte[] { 73, 72, 68, 82 });
    public final static BinaryConstant PLTE_CHUNK_TYPE = new BinaryConstant(new byte[] { 80, 76, 84, 69 });
    public final static BinaryConstant IEND_CHUNK_TYPE = new BinaryConstant(new byte[] { 73, 69, 78, 68 });
    public final static BinaryConstant IDAT_CHUNK_TYPE = new BinaryConstant(new byte[] { 73, 68, 65, 84 });
    public final static BinaryConstant iTXt_CHUNK_TYPE = new BinaryConstant(new byte[] { //
            105, //
            84, //
            88, //
            116, //
    });
    public final static BinaryConstant tEXt_CHUNK_TYPE = new BinaryConstant(new byte[] { //
            0x74, //
            0x45, //
            0x58, //
            0x74, //
    });
    public final static BinaryConstant zTXt_CHUNK_TYPE = new BinaryConstant(new byte[] { //
            0x7A, //
            0x54, //
            0x58, //
            0x74, //
    });
    public final static BinaryConstant IPHYS_CHUNK_TYPE = new BinaryConstant(new byte[] {
            'p',
            'H',
            'Y',
            's'
    });

    public final static int IEND = BinaryFileFunctions.charsToQuad('I', 'E', 'N',
            'D');
    public final static int IHDR = BinaryFileFunctions.charsToQuad('I', 'H', 'D',
            'R');
    public final static int iCCP = BinaryFileFunctions.charsToQuad('i', 'C', 'C',
            'P');
    public final static int tEXt = BinaryFileFunctions.charsToQuad('t', 'E', 'X',
            't');
    public final static int zTXt = BinaryFileFunctions.charsToQuad('z', 'T', 'X',
            't');
    public final static int pHYs = BinaryFileFunctions.charsToQuad('p', 'H', 'Y',
            's');
    public final static int PLTE = BinaryFileFunctions.charsToQuad('P', 'L', 'T',
            'E');
    public final static int IDAT = BinaryFileFunctions.charsToQuad('I', 'D', 'A',
            'T');
    public final static int tRNS = BinaryFileFunctions.charsToQuad('t', 'R', 'N',
            'S');
    public final static int gAMA = BinaryFileFunctions.charsToQuad('g', 'A', 'M',
            'A');
    public final static int sRGB = BinaryFileFunctions.charsToQuad('s', 'R', 'G',
            'B');

    // XMP chunk type.
    public final static int iTXt = BinaryFileFunctions.charsToQuad('i', 'T', 'X',
            't');

    public static final BinaryConstant PNG_Signature = new BinaryConstant(new byte[]{
        (byte) 0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A, });

    public static final String PARAM_KEY_PNG_BIT_DEPTH = "PNG_BIT_DEPTH";
    public static final String PARAM_KEY_PNG_FORCE_INDEXED_COLOR = "PNG_FORCE_INDEXED_COLOR";
    public static final String PARAM_KEY_PNG_FORCE_TRUE_COLOR = "PNG_FORCE_TRUE_COLOR";

    // public static final Object PARAM_KEY_PNG_BIT_DEPTH_YES = "YES";
    // public static final Object PARAM_KEY_PNG_BIT_DEPTH_NO = "NO";

    public static final int COLOR_TYPE_GREYSCALE = 0;
    public static final int COLOR_TYPE_TRUE_COLOR = 2;
    public static final int COLOR_TYPE_INDEXED_COLOR = 3;
    public static final int COLOR_TYPE_GREYSCALE_WITH_ALPHA = 4;
    public static final int COLOR_TYPE_TRUE_COLOR_WITH_ALPHA = 6;

    public static final byte COMPRESSION_TYPE_INFLATE_DEFLATE = 0;
    public static final byte FILTER_METHOD_ADAPTIVE = 0;

    public static final byte INTERLACE_METHOD_NONE = 0;
    public static final byte INTERLACE_METHOD_ADAM7 = 1;

    public static final byte FILTER_TYPE_NONE = 0;
    public static final byte FILTER_TYPE_SUB = 1;
    public static final byte FILTER_TYPE_UP = 2;
    public static final byte FILTER_TYPE_AVERAGE = 3;
    public static final byte FILTER_TYPE_PAETH = 4;

    /*
     * Background colour Solid background colour to be used when presenting the
     * image if no better option is available. Gamma and chromaticity Gamma
     * characteristic of the image with respect to the desired output intensity,
     * and chromaticity characteristics of the RGB values used in the image. ICC
     * profile Description of the colour space (in the form of an International
     * Color Consortium (ICC) profile) to which the samples in the image
     * conform. Image histogram Estimates of how frequently the image uses each
     * palette entry. Physical pixel dimensions Intended pixel size and aspect
     * ratio to be used in presenting the PNG image. Significant bits The number
     * of bits that are significant in the samples. sRGB colour space A
     * rendering intent (as defined by the International Color Consortium) and
     * an indication that the image samples conform to this colour space.
     * Suggested palette A reduced palette that may be used when the display
     * device is not capable of displaying the full range of colours in the
     * image. Textual data Textual information (which may be compressed)
     * associated with the image. Time The time when the PNG image was last
     * modified. Transparency Alpha information that allows the reference image
     * to be reconstructed when the alpha channel is not retained in the PNG
     * image.
     */

    public final String XMP_KEYWORD = "XML:com.adobe.xmp";

    /**
     * Parameter key.
     *
     * Only used when writing Png images.
     * <p>
     * Valid values: a list of WriteTexts.
     * <p>
     */
    public static final String PARAM_KEY_PNG_TEXT_CHUNKS = "PNG_TEXT_CHUNKS";

}