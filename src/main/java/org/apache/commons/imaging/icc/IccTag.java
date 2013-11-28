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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.util.IoUtils;

public class IccTag {
    public final int signature;
    public final int offset;
    public final int length;
    public final IccTagType fIccTagType;
    public byte[] data;
    private IccTagDataType itdt;
    private int dataTypeSignature;

    // public final byte[] data;

    public IccTag(final int signature, final int offset, final int length, final IccTagType fIccTagType) {
        this.signature = signature;
        this.offset = offset;
        this.length = length;
        this.fIccTagType = fIccTagType;
    }

    public void setData(final byte[] bytes) throws IOException {
        data = bytes;

        InputStream bis = null;
        boolean canThrow = false;
        try {
            bis = new ByteArrayInputStream(bytes);
            dataTypeSignature = BinaryFunctions.read4Bytes("data type signature", bis, 
                    "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
    
            itdt = getIccTagDataType(dataTypeSignature);
            // if (itdt != null)
            // {
            // System.out.println("\t\t\t" + "itdt: " + itdt.name);
            // }
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, bis);
        }
    }

    private IccTagDataType getIccTagDataType(final int quad) {
        for (final IccTagDataType iccTagDataType : IccTagDataTypes.values()) {
            if (iccTagDataType.getSignature() == quad) {
                return iccTagDataType;
            }
        }

        return null;
    }

    public void dump(final String prefix) throws ImageReadException, IOException {
        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));

        dump(pw, prefix);

        pw.flush();
    }

    public void dump(final PrintWriter pw, final String prefix) throws ImageReadException,
            IOException {
        pw.println(prefix
                + "tag signature: "
                + Integer.toHexString(signature)
                + " ("
                + new String(new byte[] {
                        (byte) (0xff & (signature >> 24)),
                        (byte) (0xff & (signature >> 16)),
                        (byte) (0xff & (signature >> 8)),
                        (byte) (0xff & (signature >> 0)), }, "US-ASCII")
                + ")");

        if (data == null) {
            pw.println(prefix + "data: " + Arrays.toString(data));
        } else {
            pw.println(prefix + "data: " + data.length);

            pw.println(prefix
                    + "data type signature: "
                    + Integer.toHexString(dataTypeSignature)
                    + " ("
                    + new String(new byte[] {
                            (byte) (0xff & (dataTypeSignature >> 24)),
                            (byte) (0xff & (dataTypeSignature >> 16)),
                            (byte) (0xff & (dataTypeSignature >> 8)),
                            (byte) (0xff & (dataTypeSignature >> 0)), }, "US-ASCII")
                    + ")");

            if (itdt == null) {
                pw.println(prefix + "IccTagType : " + "unknown");
            } else {
                pw.println(prefix + "IccTagType : " + itdt.getName());
                itdt.dump(prefix, data);
            }

        }

        pw.println("");
        pw.flush();

    }
}
