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
package org.apache.commons.imaging.formats.bmp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.imaging.common.BinaryOutputStream;

final class BmpWriterRgb implements BmpWriter {
    // private final boolean alpha;
    //
    // public BmpWriterRgb(boolean alpha)
    // {
    // this.alpha = alpha;
    // }

    @Override
    public int getBitsPerPixel() {
        // return alpha ? 32 : 24;
        return 24;
    }

    @Override
    public byte[] getImageData(final BufferedImage src) {
        final int width = src.getWidth();
        final int height = src.getHeight();

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // BinaryOutputStream bos = new BinaryOutputStream(baos,
        // BYTE_ORDER_Network);

        int bytecount = 0;
        for (int y = height - 1; y >= 0; y--) {
            // for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                final int argb = src.getRGB(x, y);
                final int rgb = 0xffffff & argb;

                final int red = 0xff & (rgb >> 16);
                final int green = 0xff & (rgb >> 8);
                final int blue = 0xff & (rgb >> 0);

                baos.write(blue);
                baos.write(green);
                baos.write(red);
                bytecount += 3;
            }
            while ((bytecount % 4) != 0) {
                baos.write(0);
                bytecount++;
            }
        }

        return baos.toByteArray();
    }

    @Override
    public int getPaletteSize() {
        return 0;
    }

    @Override
    public void writePalette(final BinaryOutputStream bos) throws IOException {
        // no palette
    }
}
