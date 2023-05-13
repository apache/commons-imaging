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

import static org.apache.commons.imaging.common.BinaryFunctions.printCharQuad;
import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;

import java.awt.color.ICC_Profile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.common.AllocationChecker;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;

public class IccProfileParser extends BinaryFileParser {

    private static final Logger LOGGER = Logger.getLogger(IccProfileParser.class.getName());

    public IccProfileParser() {
        this.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public IccProfileInfo getICCProfileInfo(final byte[] bytes) {
        if (bytes == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceArray(bytes));
    }

    public IccProfileInfo getICCProfileInfo(final ByteSource byteSource) {
        // TODO Throw instead of logging?
        final IccProfileInfo result;
        try (InputStream is = byteSource.getInputStream()) {
            result = readICCProfileInfo(is);
        } catch (final Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            return null;
        }
        //
        try {
            for (final IccTag tag : result.getTags()) {
                final byte[] bytes = byteSource.getBlock(tag.offset, tag.length);
                // Debug.debug("bytes: " + bytes.length);
                tag.setData(bytes);
                // tag.dump("\t" + i + ": ");
            }
            // result.fillInTagData(byteSource);
            return result;
        } catch (final Exception e) {
            // Debug.debug("Error: " + file.getAbsolutePath());
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
        return null;
    }

    public IccProfileInfo getICCProfileInfo(final File file) {
        if (file == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceFile(file));
    }

    public IccProfileInfo getICCProfileInfo(final ICC_Profile iccProfile) {
        if (iccProfile == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceArray(iccProfile.getData()));
    }

    private IccTagType getIccTagType(final int quad) {
        for (final IccTagType iccTagType : IccTagTypes.values()) {
            if (iccTagType.getSignature() == quad) {
                return iccTagType;
            }
        }

        return null;
    }

    public boolean issRGB(final byte[] bytes) throws IOException {
        return issRGB(new ByteSourceArray(bytes));
    }

    public boolean issRGB(final ByteSource byteSource) throws IOException {
        // setDebug(true);

        // long length = byteSource.getLength();
        //
        // if (LOGGER.isLoggable(Level.FINEST))
        // Debug.debug("length: " + length);

        try (InputStream is = byteSource.getInputStream()) {
            read4Bytes("ProfileSize", is, "Not a Valid ICC Profile", getByteOrder());

            // if (length != ProfileSize)
            // return null;

            skipBytes(is, 4 * 5);

            skipBytes(is, 12, "Not a Valid ICC Profile");

            skipBytes(is, 4 * 3);

            final int deviceManufacturer = read4Bytes("ProfileFileSignature", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("DeviceManufacturer", deviceManufacturer);
            }

            final int deviceModel = read4Bytes("DeviceModel", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("DeviceModel", deviceModel);
            }

            return deviceManufacturer == IccConstants.IEC && deviceModel == IccConstants.sRGB;
        }
    }

    public boolean issRGB(final File file) throws IOException {
        return issRGB(new ByteSourceFile(file));
    }

    public boolean issRGB(final ICC_Profile iccProfile) throws IOException {
        return issRGB(new ByteSourceArray(iccProfile.getData()));
    }

    private IccProfileInfo readICCProfileInfo(InputStream is) {
        final CachingInputStream cis = new CachingInputStream(is);
        is = cis;

        // setDebug(true);

        // if (LOGGER.isLoggable(Level.FINEST))
        // Debug.debug("length: " + length);

        try {
            final int profileSize = read4Bytes("ProfileSize", is, "Not a Valid ICC Profile", getByteOrder());

            // if (length != ProfileSize)
            // {
            // // Debug.debug("Unexpected Length data expected: " +
            // Integer.toHexString((int) length)
            // // + ", encoded: " + Integer.toHexString(ProfileSize));
            // // Debug.debug("Unexpected Length data: " + length
            // // + ", length: " + ProfileSize);
            // // throw new Error("asd");
            // return null;
            // }

            final int cmmTypeSignature = read4Bytes("Signature", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("CMMTypeSignature", cmmTypeSignature);
            }

            final int profileVersion = read4Bytes("ProfileVersion", is, "Not a Valid ICC Profile", getByteOrder());

            final int profileDeviceClassSignature = read4Bytes("ProfileDeviceClassSignature", is,
                    "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("ProfileDeviceClassSignature", profileDeviceClassSignature);
            }

            final int colorSpace = read4Bytes("ColorSpace", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("ColorSpace", colorSpace);
            }

            final int profileConnectionSpace = read4Bytes("ProfileConnectionSpace", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("ProfileConnectionSpace", profileConnectionSpace);
            }

            skipBytes(is, 12, "Not a Valid ICC Profile");

            final int profileFileSignature = read4Bytes("ProfileFileSignature", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("ProfileFileSignature", profileFileSignature);
            }

            final int primaryPlatformSignature = read4Bytes("PrimaryPlatformSignature", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("PrimaryPlatformSignature", primaryPlatformSignature);
            }

            final int variousFlags = read4Bytes("VariousFlags", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("VariousFlags", profileFileSignature);
            }

            final int deviceManufacturer = read4Bytes("DeviceManufacturer", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("DeviceManufacturer", deviceManufacturer);
            }

            final int deviceModel = read4Bytes("DeviceModel", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("DeviceModel", deviceModel);
            }

            skipBytes(is, 8, "Not a Valid ICC Profile");

            final int renderingIntent = read4Bytes("RenderingIntent", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("RenderingIntent", renderingIntent);
            }

            skipBytes(is, 12, "Not a Valid ICC Profile");

            final int profileCreatorSignature = read4Bytes("ProfileCreatorSignature", is, "Not a Valid ICC Profile", getByteOrder());
            if (LOGGER.isLoggable(Level.FINEST)) {
                printCharQuad("ProfileCreatorSignature", profileCreatorSignature);
            }

            skipBytes(is, 16, "Not a Valid ICC Profile");
            // readByteArray("ProfileID", 16, is,
            // "Not a Valid ICC Profile");
            // if (LOGGER.isLoggable(Level.FINEST))
            // System.out
            // .println("ProfileID: '" + new String(ProfileID) + "'");

            skipBytes(is, 28, "Not a Valid ICC Profile");

            // this.setDebug(true);

            final int tagCount = read4Bytes("TagCount", is, "Not a Valid ICC Profile", getByteOrder());

            // List tags = new ArrayList();
            final IccTag[] tags = new IccTag[AllocationChecker.check(tagCount)];

            for (int i = 0; i < tagCount; i++) {
                final int tagSignature = read4Bytes("TagSignature[" + i + "]", is, "Not a Valid ICC Profile", getByteOrder());
                // Debug.debug("TagSignature t "
                // + Integer.toHexString(TagSignature));

                // this.printCharQuad("TagSignature", TagSignature);
                final int offsetToData = read4Bytes("OffsetToData[" + i + "]", is, "Not a Valid ICC Profile", getByteOrder());
                final int elementSize = read4Bytes("ElementSize[" + i + "]", is, "Not a Valid ICC Profile", getByteOrder());

                final IccTagType fIccTagType = getIccTagType(tagSignature);
                // if (fIccTagType == null)
                // throw new Error("oops.");

                // System.out
                // .println("\t["
                // + i
                // + "]: "
                // + ((fIccTagType == null)
                // ? "unknown"
                // : fIccTagType.name));
                // Debug.debug();

                final IccTag tag = new IccTag(tagSignature, offsetToData,
                        elementSize, fIccTagType);
                // tag.dump("\t" + i + ": ");
                tags[i] = tag;
                // tags .add(tag);
            }

            {
                // read stream to end, filling cache.
                while (is.read() >= 0) { // NOPMD we're doing nothing with the data
                }
            }

            final byte[] data = cis.getCache();

            if (data.length < profileSize) {
                throw new IOException("Couldn't read ICC Profile.");
            }

            final IccProfileInfo result = new IccProfileInfo(data, profileSize,
                    cmmTypeSignature, profileVersion,
                    profileDeviceClassSignature, colorSpace,
                    profileConnectionSpace, profileFileSignature,
                    primaryPlatformSignature, variousFlags, deviceManufacturer,
                    deviceModel, renderingIntent, profileCreatorSignature,
                    null, tags);

            if (LOGGER.isLoggable(Level.FINEST)) {
                LOGGER.finest("issRGB: " + result.issRGB());
            }

            return result;
        } catch (final Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

        return null;
    }

}
