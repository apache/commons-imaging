/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.apache.commons.imaging.formats.wbmp;

import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.IndexColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;

public class WbmpImageParser extends ImageParser<WbmpImagingParameters> {
    private static final String DEFAULT_EXTENSION = ImageFormats.WBMP.getDefaultExtension();
    private static final String[] ACCEPTED_EXTENSIONS = ImageFormats.WBMP.getExtensions();

    @Override
    public WbmpImagingParameters getDefaultParameters() {
        return new WbmpImagingParameters();
    }

    @Override
    public String getName() {
        return "Wireless Application Protocol Bitmap Format";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormats.WBMP, //
        };
    }

    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        final WbmpHeader wbmpHeader = readWbmpHeader(byteSource);
        return new ImageInfo("WBMP", 1, new ArrayList<String>(),
                ImageFormats.WBMP,
                "Wireless Application Protocol Bitmap", wbmpHeader.height,
                "image/vnd.wap.wbmp", 1, 0, 0, 0, 0, wbmpHeader.width, false,
                false, false, ImageInfo.ColorType.BW,
                ImageInfo.CompressionAlgorithm.NONE);
    }

    @Override
    public Dimension getImageSize(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        final WbmpHeader wbmpHeader = readWbmpHeader(byteSource);
        return new Dimension(wbmpHeader.width, wbmpHeader.height);
    }

    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final WbmpImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    static class WbmpHeader {
        final int typeField;
        final byte fixHeaderField;
        final int width;
        final int height;

        WbmpHeader(final int typeField, final byte fixHeaderField, final int width,
                final int height) {
            this.typeField = typeField;
            this.fixHeaderField = fixHeaderField;
            this.width = width;
            this.height = height;
        }

        public void dump(final PrintWriter pw) {
            pw.println("WbmpHeader");
            pw.println("TypeField: " + typeField);
            pw.println("FixHeaderField: 0x"
                    + Integer.toHexString(0xff & fixHeaderField));
            pw.println("Width: " + width);
            pw.println("Height: " + height);
        }
    }

    private int readMultiByteInteger(final InputStream is) throws ImageReadException,
            IOException {
        int value = 0;
        int nextByte;
        int totalBits = 0;
        do {
            nextByte = readByte("Header", is, "Error reading WBMP header");
            value <<= 7;
            value |= nextByte & 0x7f;
            totalBits += 7;
            if (totalBits > 31) {
                throw new ImageReadException(
                        "Overflow reading WBMP multi-byte field");
            }
        } while ((nextByte & 0x80) != 0);
        return value;
    }

    private void writeMultiByteInteger(final OutputStream os, final int value)
            throws IOException {
        boolean wroteYet = false;
        for (int position = 4 * 7; position > 0; position -= 7) {
            final int next7Bits = 0x7f & (value >>> position);
            if (next7Bits != 0 || wroteYet) {
                os.write(0x80 | next7Bits);
                wroteYet = true;
            }
        }
        os.write(0x7f & value);
    }

    private WbmpHeader readWbmpHeader(final ByteSource byteSource)
            throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            return readWbmpHeader(is);
        }
    }

    private WbmpHeader readWbmpHeader(final InputStream is)
            throws ImageReadException, IOException {
        final int typeField = readMultiByteInteger(is);
        if (typeField != 0) {
            throw new ImageReadException("Invalid/unsupported WBMP type "
                    + typeField);
        }

        final byte fixHeaderField = readByte("FixHeaderField", is,
                "Invalid WBMP File");
        if ((fixHeaderField & 0x9f) != 0) {
            throw new ImageReadException(
                    "Invalid/unsupported WBMP FixHeaderField 0x"
                            + Integer.toHexString(0xff & fixHeaderField));
        }

        final int width = readMultiByteInteger(is);

        final int height = readMultiByteInteger(is);

        return new WbmpHeader(typeField, fixHeaderField, width, height);
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        readWbmpHeader(byteSource).dump(pw);
        return true;
    }

    private BufferedImage readImage(final WbmpHeader wbmpHeader, final InputStream is)
            throws IOException {
        final int rowLength = (wbmpHeader.width + 7) / 8;
        final byte[] image = readBytes("Pixels", is,
                rowLength * wbmpHeader.height, "Error reading image pixels");
        final DataBufferByte dataBuffer = new DataBufferByte(image, image.length);
        final WritableRaster raster = Raster.createPackedRaster(dataBuffer,
                wbmpHeader.width, wbmpHeader.height, 1, null);
        final int[] palette = { 0x000000, 0xffffff };
        final IndexColorModel colorModel = new IndexColorModel(1, 2, palette, 0,
                false, -1, DataBuffer.TYPE_BYTE);
        return new BufferedImage(colorModel, raster,
                colorModel.isAlphaPremultiplied(), new Properties());
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final WbmpImagingParameters params) throws ImageReadException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            final WbmpHeader wbmpHeader = readWbmpHeader(is);
            return readImage(wbmpHeader, is);
        }
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, WbmpImagingParameters params)
            throws ImageWriteException, IOException {
        writeMultiByteInteger(os, 0); // typeField
        os.write(0); // fixHeaderField
        writeMultiByteInteger(os, src.getWidth());
        writeMultiByteInteger(os, src.getHeight());

        for (int y = 0; y < src.getHeight(); y++) {
            int pixel = 0;
            int nextBit = 0x80;
            for (int x = 0; x < src.getWidth(); x++) {
                final int argb = src.getRGB(x, y);
                final int red = 0xff & (argb >> 16);
                final int green = 0xff & (argb >> 8);
                final int blue = 0xff & (argb >> 0);
                final int sample = (red + green + blue) / 3;
                if (sample > 127) {
                    pixel |= nextBit;
                }
                nextBit >>>= 1;
                if (nextBit == 0) {
                    os.write(pixel);
                    pixel = 0;
                    nextBit = 0x80;
                }
            }
            if (nextBit != 0x80) {
                os.write(pixel);
            }
        }
    }
}
