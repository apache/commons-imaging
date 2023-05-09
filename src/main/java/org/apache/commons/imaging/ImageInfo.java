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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * ImageInfo represents a collection of basic properties of an image, such as
 * width, height, format, bit depth, etc.
 */
public class ImageInfo {

    public enum ColorType {
        BW("Black and White"),
        GRAYSCALE("Grayscale"),
        RGB("RGB"),
        CMYK("CMYK"),
        YCbCr("YCbCr"),
        YCCK("YCCK"),
        YCC("YCC"),
        OTHER("Other"),
        UNKNOWN("Unknown");

        private final String description;

        ColorType(final String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public enum CompressionAlgorithm {
        UNKNOWN("Unknown"),
        NONE("None"),
        LZW("LZW"),
        PACKBITS("PackBits"),
        JPEG("JPEG"),
        RLE("RLE: Run-Length Encoding"),
        ADAPTIVE_RLE("Adaptive RLE"),
        PSD("Photoshop"),
        PNG_FILTER("PNG Filter"),
        CCITT_GROUP_3("CCITT Group 3 1-Dimensional Modified Huffman run-length encoding."),
        CCITT_GROUP_4("CCITT Group 4"),
        CCITT_1D("CCITT 1D");

        private final String description;

        CompressionAlgorithm(final String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    private static final Logger LOGGER = Logger.getLogger(ImageInfo.class.getName());

    private final String formatDetails; // ie version

    private final int bitsPerPixel;
    private final List<String> comments;

    private final ImageFormat format;
    private final String formatName;
    private final int height;
    private final String mimeType;

    private final int numberOfImages;
    private final int physicalHeightDpi;
    private final float physicalHeightInch;
    private final int physicalWidthDpi;
    private final float physicalWidthInch;
    private final int width;
    private final boolean progressive;
    private final boolean transparent;

    private final boolean usesPalette;

    private final ColorType colorType;

    private final CompressionAlgorithm compressionAlgorithm;

    public ImageInfo(final String formatDetails, final int bitsPerPixel,
            final List<String> comments, final ImageFormat format, final String formatName,
            final int height, final String mimeType, final int numberOfImages,
            final int physicalHeightDpi, final float physicalHeightInch,
            final int physicalWidthDpi, final float physicalWidthInch, final int width,
            final boolean progressive, final boolean transparent, final boolean usesPalette,
            final ColorType colorType, final CompressionAlgorithm compressionAlgorithm) {
        this.formatDetails = formatDetails;

        this.bitsPerPixel = bitsPerPixel;
        this.comments = comments == null ? Collections.emptyList() : Collections.unmodifiableList(comments);

        this.format = format;
        this.formatName = formatName;
        this.height = height;
        this.mimeType = mimeType;

        this.numberOfImages = numberOfImages;
        this.physicalHeightDpi = physicalHeightDpi;
        this.physicalHeightInch = physicalHeightInch;
        this.physicalWidthDpi = physicalWidthDpi;
        this.physicalWidthInch = physicalWidthInch;
        this.width = width;
        this.progressive = progressive;

        this.transparent = transparent;
        this.usesPalette = usesPalette;

        this.colorType = colorType;
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public void dump() {
        LOGGER.fine(toString());
    }

    /**
     * Returns the bits per pixel of the image data.
     *
     * @return bits per pixel of the image data.
     */
    public int getBitsPerPixel() {
        return bitsPerPixel;
    }

    /**
     * Returns the {@link org.apache.commons.imaging.ImageInfo.ColorType} of the image.
     *
     * @return image color type.
     */
    public ColorType getColorType() {
        return colorType;
    }

    /**
     * Returns a list of comments from the image file.
     *
     * <p>This is mostly obsolete.</p>
     *
     * @return A list of comments.
     */
    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    /**
     * Returns a description of the compression algorithm, if any.
     *
     * @return compression algorithm description.
     */
    public CompressionAlgorithm getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    /**
     * Returns the image file format, ie. ImageFormat.IMAGE_FORMAT_PNG.
     *
     * <p>Returns ImageFormat.IMAGE_FORMAT_UNKNOWN if format is unknown.</p>
     *
     * @return a constant defined in ImageFormat.
     * @see ImageFormats
     */
    public ImageFormat getFormat() {
        return format;
    }

    /**
     * Returns a description of the file format, ie. format version.
     *
     * @return file format description.
     */
    public String getFormatDetails() {
        return formatDetails;
    }

    /**
     * Returns a string with the name of the image file format.
     *
     * @return the name of the image file format.
     * @see #getFormat()
     */
    public String getFormatName() {
        return formatName;
    }

    /**
     * Returns the height of the image in pixels.
     *
     * @return image height in pixels.
     * @see #getWidth()
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns the MIME type of the image.
     *
     * @return image MIME type.
     * @see #getFormat()
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Returns the number of images in the file.
     *
     * <p>Applies mostly to GIF and TIFF; reading PSD/Photoshop layers is not
     * supported, and Jpeg/JFIF EXIF thumbnails are not included in this count.</p>
     *
     * @return number of images in the file.
     */
    public int getNumberOfImages() {
        return numberOfImages;
    }

    /**
     * Returns horizontal dpi of the image, if available.
     *
     * <p>Applies to TIFF (optional), BMP (always), GIF (constant: 72), Jpeg
     * (optional), PNG (optional), PNM (constant: 72), PSD/Photoshop (constant:
     * 72).</p>
     *
     * @return returns -1 if not present.
     */
    public int getPhysicalHeightDpi() {
        return physicalHeightDpi;
    }

    /**
     * Returns physical height of the image in inches, if available.
     *
     * <p>Applies to TIFF (optional), BMP (always), GIF (constant: 72), Jpeg
     * (optional), PNG (optional), PNM (constant: 72), PSD/Photoshop (constant:
     * 72).</p>
     *
     * @return returns -1 if not present.
     */
    public float getPhysicalHeightInch() {
        return physicalHeightInch;
    }

    /**
     * Returns vertical dpi of the image, if available.
     *
     * <p>Applies to TIFF (optional), BMP (always), GIF (constant: 72), Jpeg
     * (optional), PNG (optional), PNM (constant: 72), PSD/Photoshop (constant:
     * 72).</p>
     *
     * @return returns -1 if not present.
     */
    public int getPhysicalWidthDpi() {
        return physicalWidthDpi;
    }

    /**
     * Returns physical width of the image in inches, if available.
     *
     * <p>Applies to TIFF (optional), BMP (always), GIF (constant: 72), Jpeg
     * (optional), PNG (optional), PNM (constant: 72), PSD/Photoshop (constant:
     * 72).</p>
     *
     * @return returns -1 if not present.
     */
    public float getPhysicalWidthInch() {
        return physicalWidthInch;
    }

    /**
     * Returns the width of the image in pixels.
     *
     * @return image width in pixels.
     * @see #getHeight()
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns true if the image is progressive or interlaced.
     *
     * @return {@code true} if the image is progressive or interlaced, {@code false} otherwise.
     */
    public boolean isProgressive() {
        return progressive;
    }

    /**
     * Returns true if the image has transparency.
     *
     * @return {@code true} if the image has transparency, {@code false} otherwise.
     */
    public boolean isTransparent() {
        return transparent;
    }

    @Override
    public String toString() {
        try {
            final StringWriter sw = new StringWriter();
            final PrintWriter pw = new PrintWriter(sw);

            toString(pw, "");
            pw.flush();

            return sw.toString();
        } catch (final Exception e) {
            return "Image Data: Error";
        }
    }

    public void toString(final PrintWriter pw, final String prefix) {
        pw.println("Format Details: " + formatDetails);

        pw.println("Bits Per Pixel: " + bitsPerPixel);
        pw.println("Comments: " + comments.size());
        for (int i = 0; i < comments.size(); i++) {
            final String s = comments.get(i);
            pw.println("\t" + i + ": '" + s + "'");

        }
        pw.println("Format: " + format.getName());
        pw.println("Format Name: " + formatName);
        pw.println("Compression Algorithm: " + compressionAlgorithm);
        pw.println("Height: " + height);
        pw.println("MimeType: " + mimeType);
        pw.println("Number Of Images: " + numberOfImages);
        pw.println("Physical Height Dpi: " + physicalHeightDpi);
        pw.println("Physical Height Inch: " + physicalHeightInch);
        pw.println("Physical Width Dpi: " + physicalWidthDpi);
        pw.println("Physical Width Inch: " + physicalWidthInch);
        pw.println("Width: " + width);
        pw.println("Is Progressive: " + progressive);
        pw.println("Is Transparent: " + transparent);

        pw.println("Color Type: " + colorType.toString());
        pw.println("Uses Palette: " + usesPalette);

        pw.flush();

    }

    /**
     * Returns true if the image uses a palette.
     *
     * @return {@code true} if the image uses a palette, {@code false} otherwise.
     */
    public boolean usesPalette() {
        return usesPalette;
    }

}
