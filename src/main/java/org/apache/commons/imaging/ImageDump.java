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
package org.apache.commons.imaging;

import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.imaging.icc.IccProfileInfo;
import org.apache.commons.imaging.icc.IccProfileParser;

/**
 * Used to store metadata and descriptive information extracted from image files.
 */
public class ImageDump {

    private static final Logger LOGGER = Logger.getLogger(ImageDump.class.getName());

    private String colorSpaceTypeToName(final ColorSpace cs) {
        // System.out.println(prefix + ": " + "type: "
        // + cs.getType() );
        switch (cs.getType()) {
        case ColorSpace.TYPE_CMYK:
            return "TYPE_CMYK";
        case ColorSpace.TYPE_RGB:
            return "TYPE_RGB";
        case ColorSpace.CS_sRGB:
            return "CS_sRGB";
        case ColorSpace.CS_GRAY:
            return "CS_GRAY";
        case ColorSpace.CS_CIEXYZ:
            return "CS_CIEXYZ";
        case ColorSpace.CS_LINEAR_RGB:
            return "CS_LINEAR_RGB";
        case ColorSpace.CS_PYCC:
            return "CS_PYCC";
        default:
            return "unknown";
        }
    }

    public void dump(final BufferedImage src) throws IOException {
        dump("", src);
    }

    public void dump(final String prefix, final BufferedImage src) throws IOException {
        LOGGER.fine(prefix + ": " + "dump");
        dumpColorSpace(prefix, src.getColorModel().getColorSpace());
        dumpBiProps(prefix, src);
    }

    public void dumpBiProps(final String prefix, final BufferedImage src) {
        final String[] keys = src.getPropertyNames();
        if (keys == null) {
            LOGGER.fine(prefix + ": no props");
            return;
        }
        for (final String key : keys) {
            LOGGER.fine(prefix + ": " + key + ": " + src.getProperty(key));
        }
    }

    public void dumpColorSpace(final String prefix, final ColorSpace cs) throws IOException {
        LOGGER.fine(prefix + ": " + "type: " + cs.getType() + " (" + colorSpaceTypeToName(cs) + ")");

        if (!(cs instanceof ICC_ColorSpace)) {
            LOGGER.fine(prefix + ": " + "Unknown ColorSpace: " + cs.getClass().getName());
            return;
        }

        final ICC_ColorSpace iccColorSpace = (ICC_ColorSpace) cs;
        final ICC_Profile iccProfile = iccColorSpace.getProfile();

        final byte[] bytes = iccProfile.getData();

        final IccProfileParser parser = new IccProfileParser();

        final IccProfileInfo info = parser.getIccProfileInfo(bytes);
        info.dump(prefix);
    }

}
