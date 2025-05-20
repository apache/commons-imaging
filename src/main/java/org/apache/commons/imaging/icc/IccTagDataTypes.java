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

import static org.apache.commons.imaging.common.BinaryFunctions.read4Bytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;

public enum IccTagDataTypes implements IccTagDataType {
    DESC_TYPE("descType", 0x64657363) {
        @Override
        public void dump(final String prefix, final byte[] bytes) throws ImagingException, IOException {
            try (InputStream bis = new ByteArrayInputStream(bytes)) {
                read4Bytes("type_signature", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);

                // bis.setDebug(true);
                read4Bytes("ignore", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                final int stringLength = read4Bytes("stringLength", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);

                // bis.readByteArray("ignore", bytes.length -12, "none");
                final String s = new String(bytes, 12, stringLength - 1, StandardCharsets.US_ASCII);
                LOGGER.fine(prefix + "s: '" + s + "'");
            }
        }

    },

    DATA_TYPE("dataType", 0x64617461) {
        @Override
        public void dump(final String prefix, final byte[] bytes) throws ImagingException, IOException {
            try (InputStream bis = new ByteArrayInputStream(bytes)) {
                read4Bytes("type_signature", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
            }
        }

    },

    MULTI_LOCALIZED_UNICODE_TYPE("multiLocalizedUnicodeType", 0x6D6C7563) {
        @Override
        public void dump(final String prefix, final byte[] bytes) throws ImagingException, IOException {
            try (InputStream bis = new ByteArrayInputStream(bytes)) {
                read4Bytes("type_signature", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
            }
        }

    },

    SIGNATURE_TYPE("signatureType", 0x73696720) {
        @Override
        public void dump(final String prefix, final byte[] bytes) throws ImagingException, IOException {
            try (InputStream bis = new ByteArrayInputStream(bytes)) {
                read4Bytes("type_signature", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                read4Bytes("ignore", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                final int theSignature = read4Bytes("theSignature ", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                LOGGER.fine(prefix + "theSignature: " + Integer.toHexString(theSignature) + " ("
                        + new String(new byte[] { (byte) (0xff & theSignature >> 24), (byte) (0xff & theSignature >> 16),
                                (byte) (0xff & theSignature >> 8), (byte) (0xff & theSignature >> 0), }, StandardCharsets.US_ASCII)
                        + ")");
            }
        }

    },

    TEXT_TYPE("textType", 0x74657874) {
        @Override
        public void dump(final String prefix, final byte[] bytes) throws ImagingException, IOException {
            try (InputStream bis = new ByteArrayInputStream(bytes)) {
                read4Bytes("type_signature", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                read4Bytes("ignore", bis, "ICC: corrupt tag data", ByteOrder.BIG_ENDIAN);
                final String s = new String(bytes, 8, bytes.length - 8, StandardCharsets.US_ASCII);
                LOGGER.fine(prefix + "s: '" + s + "'");
            }
        }

    };

    private static final Logger LOGGER = Logger.getLogger(IccTagDataTypes.class.getName());

    public final String name;
    public final int signature;

    IccTagDataTypes(final String name, final int signature) {
        this.name = name;
        this.signature = signature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSignature() {
        return signature;
    }
}
