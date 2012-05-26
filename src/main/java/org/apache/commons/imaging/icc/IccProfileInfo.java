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

import org.apache.commons.imaging.ImageReadException;

public class IccProfileInfo implements IccConstants {

    public final byte data[];
    public final int ProfileSize;
    public final int CMMTypeSignature;
    public final int ProfileVersion;
    public final int ProfileDeviceClassSignature;
    public final int ColorSpace;
    public final int ProfileConnectionSpace;
    public final int ProfileFileSignature;
    public final int PrimaryPlatformSignature;
    public final int VariousFlags;
    public final int DeviceManufacturer;
    public final int DeviceModel;
    public final int RenderingIntent;
    public final int ProfileCreatorSignature;
    public final byte ProfileID[];
    public final IccTag tags[];

    public IccProfileInfo(byte data[], int ProfileSize, int CMMTypeSignature,
            int ProfileVersion, int ProfileDeviceClassSignature,
            int ColorSpace, int ProfileConnectionSpace,
            int ProfileFileSignature, int PrimaryPlatformSignature,
            int VariousFlags, int DeviceManufacturer, int DeviceModel,
            int RenderingIntent, int ProfileCreatorSignature, byte ProfileID[],
            IccTag tags[]) {
        this.data = data;

        this.ProfileSize = ProfileSize;
        this.CMMTypeSignature = CMMTypeSignature;
        this.ProfileVersion = ProfileVersion;
        this.ProfileDeviceClassSignature = ProfileDeviceClassSignature;
        this.ColorSpace = ColorSpace;
        this.ProfileConnectionSpace = ProfileConnectionSpace;
        this.ProfileFileSignature = ProfileFileSignature;
        this.PrimaryPlatformSignature = PrimaryPlatformSignature;
        this.VariousFlags = VariousFlags;
        this.DeviceManufacturer = DeviceManufacturer;
        this.DeviceModel = DeviceModel;
        this.RenderingIntent = RenderingIntent;
        this.ProfileCreatorSignature = ProfileCreatorSignature;
        this.ProfileID = ProfileID;

        this.tags = tags;
    }

    public boolean issRGB() {
        boolean result = ((DeviceManufacturer == IEC) && (DeviceModel == sRGB));
        return result;
    }

    private void printCharQuad(PrintWriter pw, String msg, int i) {
        pw.println(msg + ": '" + (char) (0xff & (i >> 24))
                + (char) (0xff & (i >> 16)) + (char) (0xff & (i >> 8))
                + (char) (0xff & (i >> 0)) + "'");
    }

    public void dump(String prefix) {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        try {
            return toString("");
        } catch (Exception e) {
            return "IccProfileInfo: Error";
        }
    }

    public String toString(String prefix) throws ImageReadException,
            IOException {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        // StringBuffer result = new StringBuffer();
        pw.println(prefix + ": " + "data length: " + data.length);

        printCharQuad(pw, prefix + ": " + "ProfileDeviceClassSignature",
                ProfileDeviceClassSignature);

        printCharQuad(pw, prefix + ": " + "CMMTypeSignature", CMMTypeSignature);

        printCharQuad(pw, prefix + ": " + "ProfileDeviceClassSignature",
                ProfileDeviceClassSignature);
        printCharQuad(pw, prefix + ": " + "ColorSpace", ColorSpace);
        printCharQuad(pw, prefix + ": " + "ProfileConnectionSpace",
                ProfileConnectionSpace);

        printCharQuad(pw, prefix + ": " + "ProfileFileSignature",
                ProfileFileSignature);

        printCharQuad(pw, prefix + ": " + "PrimaryPlatformSignature",
                PrimaryPlatformSignature);

        printCharQuad(pw, prefix + ": " + "ProfileFileSignature",
                ProfileFileSignature);

        printCharQuad(pw, prefix + ": " + "DeviceManufacturer",
                DeviceManufacturer);

        printCharQuad(pw, prefix + ": " + "DeviceModel", DeviceModel);

        printCharQuad(pw, prefix + ": " + "RenderingIntent", RenderingIntent);

        printCharQuad(pw, prefix + ": " + "ProfileCreatorSignature",
                ProfileCreatorSignature);

        for (int i = 0; i < tags.length; i++) {
            IccTag tag = tags[i];
            tag.dump(pw, "\t" + i + ": ");
        }

        pw.println(prefix + ": " + "issRGB: " + issRGB());
        pw.flush();

        return sw.getBuffer().toString();
    }

}
