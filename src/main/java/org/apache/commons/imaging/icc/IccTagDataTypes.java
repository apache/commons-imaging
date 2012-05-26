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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryConstants;
import org.apache.commons.imaging.common.BinaryInputStream;

public enum IccTagDataTypes implements IccTagDataType {
    DESC_TYPE(
            "descType", 0x64657363) {
        public void dump(String prefix, byte bytes[])
                throws ImageReadException, IOException
        {
            BinaryInputStream bis = new BinaryInputStream(
                    new ByteArrayInputStream(bytes),
                    BinaryConstants.BYTE_ORDER_NETWORK);
            bis.read4Bytes("type_signature", "ICC: corrupt tag data");

            //            bis.setDebug(true);
            bis.read4Bytes("ignore", "ICC: corrupt tag data");
            int string_length = bis.read4Bytes("string_length",
                    "ICC: corrupt tag data");

            //            bis.readByteArray("ignore", bytes.length -12, "none");
            String s = new String(bytes, 12, string_length - 1);
            System.out.println(prefix + "s: '" + s + "'");
        }

    },

    DATA_TYPE(
            "dataType", 0x64617461) {
        public void dump(String prefix, byte bytes[])
                throws ImageReadException, IOException
        {
            BinaryInputStream bis = new BinaryInputStream(
                    new ByteArrayInputStream(bytes),
                    BinaryConstants.BYTE_ORDER_NETWORK);
            bis.read4Bytes("type_signature", "ICC: corrupt tag data");
        }

    },

    MULTI_LOCALIZED_UNICODE_TYPE(
            "multiLocalizedUnicodeType", (0x6D6C7563)) {
        public void dump(String prefix, byte bytes[])
                throws ImageReadException, IOException
        {
            BinaryInputStream bis = new BinaryInputStream(
                    new ByteArrayInputStream(bytes),
                    BinaryConstants.BYTE_ORDER_NETWORK);
            bis.read4Bytes("type_signature", "ICC: corrupt tag data");
        }

    },

    SIGNATURE_TYPE(
            "signatureType", ((0x73696720))) {
        public void dump(String prefix, byte bytes[])
                throws ImageReadException, IOException
        {
            BinaryInputStream bis = new BinaryInputStream(
                    new ByteArrayInputStream(bytes),
                    BinaryConstants.BYTE_ORDER_NETWORK);
            bis.read4Bytes("type_signature", "ICC: corrupt tag data");
            bis.read4Bytes("ignore", "ICC: corrupt tag data");
            int thesignature = bis.read4Bytes("thesignature ",
                    "ICC: corrupt tag data");
            System.out.println(prefix
                    + "thesignature: "
                    + Integer.toHexString(thesignature)
                    + " ("
                    + new String(new byte[]{
                            (byte) (0xff & (thesignature >> 24)),
                            (byte) (0xff & (thesignature >> 16)),
                            (byte) (0xff & (thesignature >> 8)),
                            (byte) (0xff & (thesignature >> 0)),
                    }) + ")");
        }

    },

    TEXT_TYPE(
            "textType", 0x74657874) {
        public void dump(String prefix, byte bytes[])
                throws ImageReadException, IOException
        {
            BinaryInputStream bis = new BinaryInputStream(
                    new ByteArrayInputStream(bytes),
                    BinaryConstants.BYTE_ORDER_NETWORK);
            bis.read4Bytes("type_signature", "ICC: corrupt tag data");
            bis.read4Bytes("ignore", "ICC: corrupt tag data");
            String s = new String(bytes, 8, bytes.length - 8);
            System.out.println(prefix + "s: '" + s + "'");
        }

    };

    public final String name;
    public final int signature;

    IccTagDataTypes(String name, int signature) {
        this.name = name;
        this.signature = signature;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSignature() {
        return signature;
    }
}
