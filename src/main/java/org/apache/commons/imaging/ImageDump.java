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

import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;
import java.awt.image.BufferedImage;

import org.apache.commons.imaging.icc.IccProfileInfo;
import org.apache.commons.imaging.icc.IccProfileParser;

/**
 * Used to store metadata and descriptive information extracted from
 * image files.
 */
public class ImageDump {
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

    public void dumpColorSpace(final String prefix, final ColorSpace cs) {
        System.out.println(prefix + ": " + "type: " + cs.getType() + " ("
                + colorSpaceTypeToName(cs) + ")");

        if (!(cs instanceof ICC_ColorSpace)) {
            System.out.println(prefix + ": " + "Unknown ColorSpace: "
                    + cs.getClass().getName());
            return;
        }

        final ICC_ColorSpace fICC_ColorSpace = (ICC_ColorSpace) cs;
        final ICC_Profile fICC_Profile = fICC_ColorSpace.getProfile();

        final byte[] bytes = fICC_Profile.getData();

        final IccProfileParser parser = new IccProfileParser();

        final IccProfileInfo info = parser.getICCProfileInfo(bytes);
        info.dump(prefix);
    }

    public void dump(final BufferedImage src) {
        dump("", src);
    }

    public void dump(final String prefix, final BufferedImage src) {
        System.out.println(prefix + ": " + "dump");
        dumpColorSpace(prefix, src.getColorModel().getColorSpace());
        dumpBIProps(prefix, src);
    }

    public void dumpBIProps(final String prefix, final BufferedImage src) {
        final String[] keys = src.getPropertyNames();
        if (keys == null) {
            System.out.println(prefix + ": no props");
            return;
        }
        for (final String key : keys) {
            System.out.println(prefix + ": " + key + ": "
                    + src.getProperty(key));
        }
    }

}
