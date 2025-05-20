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
package org.apache.commons.imaging.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryFileParser {

    private static final Logger LOGGER = Logger.getLogger(BinaryFileParser.class.getName());

    /**
     * The default {@link ByteOrder} for parsers is {@link ByteOrder#BIG_ENDIAN}.
     */
    private ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;

    /**
     * Constructs a new instance with the default, big-endian, byte order.
     */
    public BinaryFileParser() {
        // empty
    }

    public BinaryFileParser(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    protected final void debugNumber(final PrintWriter pw, final String msg, final int data, final int bytes) {
        pw.print(msg + ": " + data + " (");
        int byteData = data;
        for (int i = 0; i < bytes; i++) {
            if (i > 0) {
                pw.print(",");
            }
            final int singleByte = 0xff & byteData;
            pw.print((char) singleByte + " [" + singleByte + "]");
            byteData >>= 8;
        }
        pw.println(") [0x" + Integer.toHexString(data) + ", " + Integer.toBinaryString(data) + "]");
        pw.flush();
    }

    protected final void debugNumber(final String msg, final int data, final int bytes) {
        try (StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw)) {
            debugNumber(pw, msg, data, bytes);
            pw.flush();
            sw.flush();
            LOGGER.fine(sw.toString());
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    protected void setByteOrder(final ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }
}
