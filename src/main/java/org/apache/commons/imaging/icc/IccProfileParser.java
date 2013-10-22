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

import java.awt.color.ICC_Profile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.util.CachingInputStream;
import org.apache.commons.imaging.util.Debug;

public class IccProfileParser extends BinaryFileParser implements IccConstants {
    public IccProfileParser() {
        this.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    public IccProfileInfo getICCProfileInfo(final ICC_Profile icc_profile) {
        if (icc_profile == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceArray(icc_profile.getData()));
    }

    public IccProfileInfo getICCProfileInfo(final byte bytes[]) {
        if (bytes == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceArray(bytes));
    }

    public IccProfileInfo getICCProfileInfo(final File file) {
        if (file == null) {
            return null;
        }

        return getICCProfileInfo(new ByteSourceFile(file));
    }

    public IccProfileInfo getICCProfileInfo(final ByteSource byteSource) {

        InputStream is = null;

        try {

            IccProfileInfo result;
            is = byteSource.getInputStream();

            result = readICCProfileInfo(is);

            if (result == null) {
                return null;
            }

            is.close();
            is = null;

            for (final IccTag tag : result.tags) {
                final byte bytes[] = byteSource.getBlock(tag.offset, tag.length);
                // Debug.debug("bytes: " + bytes.length);
                tag.setData(bytes);
                // tag.dump("\t" + i + ": ");
            }
            // result.fillInTagData(byteSource);

            return result;
        } catch (final Exception e) {
            // Debug.debug("Error: " + file.getAbsolutePath());
            Debug.debug(e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (final Exception e) {
                Debug.debug(e);
            }

        }

        if (getDebug()) {
            Debug.debug();
        }

        return null;
    }

    private IccProfileInfo readICCProfileInfo(InputStream is) {
        final CachingInputStream cis = new CachingInputStream(is);
        is = cis;

        if (getDebug()) {
            Debug.debug();
        }

        // setDebug(true);

        // if (getDebug())
        // Debug.debug("length: " + length);

        try {
            final int ProfileSize = read4Bytes("ProfileSize", is,
                    "Not a Valid ICC Profile");

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

            final int CMMTypeSignature = read4Bytes("Signature", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("CMMTypeSignature", CMMTypeSignature);
            }

            final int ProfileVersion = read4Bytes("ProfileVersion", is,
                    "Not a Valid ICC Profile");

            final int ProfileDeviceClassSignature = read4Bytes(
                    "ProfileDeviceClassSignature", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ProfileDeviceClassSignature",
                        ProfileDeviceClassSignature);
            }

            final int ColorSpace = read4Bytes("ColorSpace", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ColorSpace", ColorSpace);
            }

            final int ProfileConnectionSpace = read4Bytes("ProfileConnectionSpace",
                    is, "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ProfileConnectionSpace", ProfileConnectionSpace);
            }

            skipBytes(is, 12, "Not a Valid ICC Profile");

            final int ProfileFileSignature = read4Bytes("ProfileFileSignature", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ProfileFileSignature", ProfileFileSignature);
            }

            final int PrimaryPlatformSignature = read4Bytes(
                    "PrimaryPlatformSignature", is, "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("PrimaryPlatformSignature",
                        PrimaryPlatformSignature);
            }

            final int VariousFlags = read4Bytes("ProfileFileSignature", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ProfileFileSignature", ProfileFileSignature);
            }

            final int DeviceManufacturer = read4Bytes("ProfileFileSignature", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("DeviceManufacturer", DeviceManufacturer);
            }

            final int DeviceModel = read4Bytes("DeviceModel", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("DeviceModel", DeviceModel);
            }

            skipBytes(is, 8, "Not a Valid ICC Profile");

            final int RenderingIntent = read4Bytes("RenderingIntent", is,
                    "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("RenderingIntent", RenderingIntent);
            }

            skipBytes(is, 12, "Not a Valid ICC Profile");

            final int ProfileCreatorSignature = read4Bytes("ProfileCreatorSignature",
                    is, "Not a Valid ICC Profile");
            if (getDebug()) {
                printCharQuad("ProfileCreatorSignature",
                        ProfileCreatorSignature);
            }

            final byte ProfileID[] = null;
            skipBytes(is, 16, "Not a Valid ICC Profile");
            // readByteArray("ProfileID", 16, is,
            // "Not a Valid ICC Profile");
            // if (getDebug())
            // System.out
            // .println("ProfileID: '" + new String(ProfileID) + "'");

            skipBytes(is, 28, "Not a Valid ICC Profile");

            // this.setDebug(true);

            final int TagCount = read4Bytes("TagCount", is, "Not a Valid ICC Profile");

            // List tags = new ArrayList();
            final IccTag tags[] = new IccTag[TagCount];

            for (int i = 0; i < TagCount; i++) {
                final int TagSignature = read4Bytes("TagSignature[" + i + "]", is,
                        "Not a Valid ICC Profile");
                // Debug.debug("TagSignature t "
                // + Integer.toHexString(TagSignature));

                // this.printCharQuad("TagSignature", TagSignature);
                final int OffsetToData = read4Bytes("OffsetToData[" + i + "]", is,
                        "Not a Valid ICC Profile");
                final int ElementSize = read4Bytes("ElementSize[" + i + "]", is,
                        "Not a Valid ICC Profile");

                final IccTagType fIccTagType = getIccTagType(TagSignature);
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

                final IccTag tag = new IccTag(TagSignature, OffsetToData,
                        ElementSize, fIccTagType);
                // tag.dump("\t" + i + ": ");
                tags[i] = tag;
                // tags .add(tag);
            }

            {
                // read stream to end, filling cache.
                while (is.read() >= 0) { /* do nothing */
                }
            }

            final byte data[] = cis.getCache();

            if (data.length < ProfileSize) {
                throw new IOException("Couldn't read ICC Profile.");
            }

            final IccProfileInfo result = new IccProfileInfo(data, ProfileSize,
                    CMMTypeSignature, ProfileVersion,
                    ProfileDeviceClassSignature, ColorSpace,
                    ProfileConnectionSpace, ProfileFileSignature,
                    PrimaryPlatformSignature, VariousFlags, DeviceManufacturer,
                    DeviceModel, RenderingIntent, ProfileCreatorSignature,
                    ProfileID, tags);

            if (getDebug()) {
                Debug.debug("issRGB: " + result.issRGB());
            }

            return result;
        } catch (final Exception e) {
            Debug.debug(e);
        }

        return null;
    }

    private IccTagType getIccTagType(final int quad) {
        for (final IccTagType iccTagType : IccTagTypes.values()) {
            if (iccTagType.getSignature() == quad) {
                return iccTagType;
            }
        }

        return null;
    }

    public Boolean issRGB(final ICC_Profile icc_profile) {
        if (icc_profile == null) {
            return null;
        }

        return issRGB(new ByteSourceArray(icc_profile.getData()));
    }

    public Boolean issRGB(final byte bytes[]) {
        if (bytes == null) {
            return null;
        }

        return issRGB(new ByteSourceArray(bytes));
    }

    public Boolean issRGB(final File file) {
        if (file == null) {
            return null;
        }

        return issRGB(new ByteSourceFile(file));
    }

    public Boolean issRGB(final ByteSource byteSource) {
        try {
            if (getDebug()) {
                Debug.debug();
            }

            // setDebug(true);

            // long length = byteSource.getLength();
            //
            // if (getDebug())
            // Debug.debug("length: " + length);

            InputStream is = null;
            try {
                is = byteSource.getInputStream();

                read4Bytes("ProfileSize", is, "Not a Valid ICC Profile");

                // if (length != ProfileSize)
                // return null;

                this.skipBytes(is, 4 * 5);

                skipBytes(is, 12, "Not a Valid ICC Profile");

                this.skipBytes(is, 4 * 3);

                final int DeviceManufacturer = read4Bytes("ProfileFileSignature", is,
                        "Not a Valid ICC Profile");
                if (getDebug()) {
                    printCharQuad("DeviceManufacturer", DeviceManufacturer);
                }

                final int DeviceModel = read4Bytes("DeviceModel", is,
                        "Not a Valid ICC Profile");
                if (getDebug()) {
                    printCharQuad("DeviceModel", DeviceModel);
                }

                final boolean result = ((DeviceManufacturer == IEC) && (DeviceModel == sRGB));

                return result;
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (final IOException ignore) {
                    }
                }
            }
        } catch (final Exception e) {
            Debug.debug(e);
        }

        return null;
    }

}
