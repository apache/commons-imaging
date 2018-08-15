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
package org.apache.commons.imaging.icc;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImageReadException;

public class IccProfileInfo {

    private static final Logger LOGGER = Logger.getLogger(IccProfileInfo.class.getName());

    private final byte[] data;
    public final int profileSize;
    public final int cmmTypeSignature;
    public final int profileVersion;
    public final int profileDeviceClassSignature;
    public final int colorSpace;
    public final int profileConnectionSpace;
    public final int profileFileSignature;
    public final int primaryPlatformSignature;
    public final int variousFlags;
    public final int deviceManufacturer;
    public final int deviceModel;
    public final int renderingIntent;
    public final int profileCreatorSignature;
    private final byte[] profileId;
    private final IccTag[] tags;

    public IccProfileInfo(final byte[] data, final int profileSize, final int cmmTypeSignature,
            final int profileVersion, final int profileDeviceClassSignature,
            final int colorSpace, final int profileConnectionSpace,
            final int profileFileSignature, final int primaryPlatformSignature,
            final int variousFlags, final int deviceManufacturer, final int deviceModel,
            final int renderingIntent, final int profileCreatorSignature, final byte[] profileId,
            final IccTag[] tags) {
        this.data = data;

        this.profileSize = profileSize;
        this.cmmTypeSignature = cmmTypeSignature;
        this.profileVersion = profileVersion;
        this.profileDeviceClassSignature = profileDeviceClassSignature;
        this.colorSpace = colorSpace;
        this.profileConnectionSpace = profileConnectionSpace;
        this.profileFileSignature = profileFileSignature;
        this.primaryPlatformSignature = primaryPlatformSignature;
        this.variousFlags = variousFlags;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceModel = deviceModel;
        this.renderingIntent = renderingIntent;
        this.profileCreatorSignature = profileCreatorSignature;
        this.profileId = profileId;

        this.tags = tags;
    }

    public byte[] getData() {
        return data; // TODO clone? does not appear to be used
    }

    public byte[] getProfileId() {
        return profileId; // TODO clone? does not appear to be used
    }

    public IccTag[] getTags() {
        return tags;
    }

    public boolean issRGB() {
        return deviceManufacturer == IccConstants.IEC 
                && deviceModel == IccConstants.sRGB;
    }

    private void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");
    }

    public void dump(final String prefix) {
        LOGGER.fine(toString());
    }

    @Override
    public String toString() {
        try {
            return toString("");
        } catch (final Exception e) {
            return "IccProfileInfo: Error";
        }
    }

    public String toString(final String prefix) throws ImageReadException,
            IOException {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);

        pw.println(prefix + ": " + "data length: " + data.length);

        printCharQuad(pw, prefix + ": " + "ProfileDeviceClassSignature", profileDeviceClassSignature);
        printCharQuad(pw, prefix + ": " + "CMMTypeSignature", cmmTypeSignature);
        printCharQuad(pw, prefix + ": " + "ProfileDeviceClassSignature", profileDeviceClassSignature);
        printCharQuad(pw, prefix + ": " + "ColorSpace", colorSpace);
        printCharQuad(pw, prefix + ": " + "ProfileConnectionSpace", profileConnectionSpace);
        printCharQuad(pw, prefix + ": " + "ProfileFileSignature", profileFileSignature);
        printCharQuad(pw, prefix + ": " + "PrimaryPlatformSignature", primaryPlatformSignature);
        printCharQuad(pw, prefix + ": " + "ProfileFileSignature", profileFileSignature);
        printCharQuad(pw, prefix + ": " + "DeviceManufacturer", deviceManufacturer);
        printCharQuad(pw, prefix + ": " + "DeviceModel", deviceModel);
        printCharQuad(pw, prefix + ": " + "RenderingIntent", renderingIntent);
        printCharQuad(pw, prefix + ": " + "ProfileCreatorSignature", profileCreatorSignature);

        for (int i = 0; i < tags.length; i++) {
            final IccTag tag = tags[i];
            tag.dump(pw, "\t" + i + ": ");
        }

        pw.println(prefix + ": " + "issRGB: " + issRGB());
        pw.flush();

        return sw.getBuffer().toString();
    }

}
