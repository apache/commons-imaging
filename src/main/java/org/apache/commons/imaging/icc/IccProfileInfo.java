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
package org.apache.commons.imaging.icc;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;

/**
 * Provides information about an ICC color profile.
 */
public class IccProfileInfo {

    private static final Logger LOGGER = Logger.getLogger(IccProfileInfo.class.getName());

    private final byte[] data;

    /** The profile size in bytes. */
    public final int profileSize;

    /** The CMM type signature. */
    public final int cmmTypeSignature;

    /** The profile version. */
    public final int profileVersion;

    /** The profile/device class signature. */
    public final int profileDeviceClassSignature;

    /** The color space signature. */
    public final int colorSpace;

    /** The profile connection space signature. */
    public final int profileConnectionSpace;

    /** The profile file signature. */
    public final int profileFileSignature;

    /** The primary platform signature. */
    public final int primaryPlatformSignature;

    /** Various profile flags. */
    public final int variousFlags;

    /** The device manufacturer signature. */
    public final int deviceManufacturer;

    /** The device model signature. */
    public final int deviceModel;

    /** The rendering intent. */
    public final int renderingIntent;

    /** The profile creator signature. */
    public final int profileCreatorSignature;
    private final byte[] profileId;
    private final IccTag[] tags;

    /**
     * Constructs a new ICC profile information object.
     *
     * @param data the raw profile data.
     * @param profileSize the profile size in bytes.
     * @param cmmTypeSignature the CMM type signature.
     * @param profileVersion the profile version.
     * @param profileDeviceClassSignature the profile/device class signature.
     * @param colorSpace the color space signature.
     * @param profileConnectionSpace the profile connection space signature.
     * @param profileFileSignature the profile file signature.
     * @param primaryPlatformSignature the primary platform signature.
     * @param variousFlags various profile flags.
     * @param deviceManufacturer the device manufacturer signature.
     * @param deviceModel the device model signature.
     * @param renderingIntent the rendering intent.
     * @param profileCreatorSignature the profile creator signature.
     * @param profileId the profile ID.
     * @param tags the ICC tags.
     */
    public IccProfileInfo(final byte[] data, final int profileSize, final int cmmTypeSignature, final int profileVersion, final int profileDeviceClassSignature,
            final int colorSpace, final int profileConnectionSpace, final int profileFileSignature, final int primaryPlatformSignature, final int variousFlags,
            final int deviceManufacturer, final int deviceModel, final int renderingIntent, final int profileCreatorSignature, final byte[] profileId,
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

    /**
     * Dumps the profile information to the logger.
     *
     * @param prefix the prefix to use for output lines.
     */
    public void dump(final String prefix) {
        LOGGER.fine(toString());
    }

    /**
     * Gets a copy of the raw profile data.
     *
     * @return a copy of the profile data bytes.
     */
    public byte[] getData() {
        return data.clone();
    }

    /**
     * Gets a copy of the profile ID.
     *
     * @return a copy of the profile ID bytes.
     */
    public byte[] getProfileId() {
        return profileId.clone();
    }

    /**
     * Gets the ICC tags.
     *
     * @return the array of ICC tags.
     */
    public IccTag[] getTags() {
        return tags;
    }

    /**
     * Checks if this profile is an sRGB profile.
     *
     * @return true if this is an sRGB profile, false otherwise.
     */
    public boolean isSrgb() {
        return deviceManufacturer == IccConstants.IEC && deviceModel == IccConstants.sRGB;
    }

    private void printCharQuad(final PrintWriter pw, final String msg, final int i) {
        pw.println(msg + ": '" + (char) (0xff & i >> 24) + (char) (0xff & i >> 16) + (char) (0xff & i >> 8) + (char) (0xff & i >> 0) + "'");
    }

    @Override
    public String toString() {
        try {
            return toString("");
        } catch (final Exception e) {
            return "IccProfileInfo: Error";
        }
    }

    /**
     * Gets a string representation of this ICC profile information with a prefix.
     *
     * @param prefix the prefix to use for output lines.
     * @return a string representation of the profile information.
     * @throws ImagingException if an imaging error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public String toString(final String prefix) throws ImagingException, IOException {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);

        pw.println(prefix + ": data length: " + data.length);

        printCharQuad(pw, prefix + ": ProfileDeviceClassSignature", profileDeviceClassSignature);
        printCharQuad(pw, prefix + ": CMMTypeSignature", cmmTypeSignature);
        printCharQuad(pw, prefix + ": ProfileDeviceClassSignature", profileDeviceClassSignature);
        printCharQuad(pw, prefix + ": ColorSpace", colorSpace);
        printCharQuad(pw, prefix + ": ProfileConnectionSpace", profileConnectionSpace);
        printCharQuad(pw, prefix + ": ProfileFileSignature", profileFileSignature);
        printCharQuad(pw, prefix + ": PrimaryPlatformSignature", primaryPlatformSignature);
        printCharQuad(pw, prefix + ": ProfileFileSignature", profileFileSignature);
        printCharQuad(pw, prefix + ": DeviceManufacturer", deviceManufacturer);
        printCharQuad(pw, prefix + ": DeviceModel", deviceModel);
        printCharQuad(pw, prefix + ": RenderingIntent", renderingIntent);
        printCharQuad(pw, prefix + ": ProfileCreatorSignature", profileCreatorSignature);

        for (int i = 0; i < tags.length; i++) {
            final IccTag tag = tags[i];
            tag.dump(pw, "\t" + i + ": ");
        }

        pw.println(prefix + ": isSrgb: " + isSrgb());
        pw.flush();

        return sw.getBuffer().toString();
    }

}
