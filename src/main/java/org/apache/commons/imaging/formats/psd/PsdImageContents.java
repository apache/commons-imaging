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
package org.apache.commons.imaging.formats.psd;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PsdImageContents {

    private static final Logger LOGGER = Logger.getLogger(PsdImageContents.class.getName());

    public final PsdHeaderInfo header;

    public final int colorModeDataLength;
    public final int imageResourcesLength;
    public final int layerAndMaskDataLength;
    public final int compression;

    public PsdImageContents(final PsdHeaderInfo header,

    final int colorModeDataLength, final int imageResourcesLength,
            final int layerAndMaskDataLength, final int compression) {
        this.header = header;
        this.colorModeDataLength = colorModeDataLength;
        this.imageResourcesLength = imageResourcesLength;
        this.layerAndMaskDataLength = layerAndMaskDataLength;
        this.compression = compression;
    }

    public void dump() {
        try (StringWriter sw = new StringWriter(); PrintWriter pw = new PrintWriter(sw)) {
            dump(pw);
            pw.flush();
            sw.flush();
            LOGGER.fine(sw.toString());
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public void dump(final PrintWriter pw) {
        pw.println("");
        pw.println("ImageContents");
        pw.println("Compression: " + compression + " ("
                + Integer.toHexString(compression) + ")");
        pw.println("ColorModeDataLength: " + colorModeDataLength + " ("
                + Integer.toHexString(colorModeDataLength) + ")");
        pw.println("ImageResourcesLength: " + imageResourcesLength + " ("
                + Integer.toHexString(imageResourcesLength) + ")");
        pw.println("LayerAndMaskDataLength: " + layerAndMaskDataLength + " ("
                + Integer.toHexString(layerAndMaskDataLength) + ")");
        // System.out.println("Depth: " + Depth + " ("
        // + Integer.toHexString(Depth) + ")");
        // System.out.println("Mode: " + Mode + " (" + Integer.toHexString(Mode)
        // + ")");
        // System.out.println("Reserved: " + Reserved.length);
        pw.println("");
        pw.flush();

    }

}
