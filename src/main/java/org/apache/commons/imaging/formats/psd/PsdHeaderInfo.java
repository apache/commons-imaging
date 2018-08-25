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
package org.apache.commons.imaging.formats.psd;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PsdHeaderInfo {

    private static final Logger LOGGER = Logger.getLogger(PsdHeaderInfo.class.getName());

    public final int version;
    private final byte[] reserved;
    public final int channels;
    public final int rows;
    public final int columns;
    public final int depth;
    public final int mode;

    public PsdHeaderInfo(final int version, final byte[] reserved, final int channels, final int rows, final int columns, final int depth, final int mode) {
        this.version = version;
        this.reserved = reserved.clone();
        this.channels = channels;
        this.rows = rows;
        this.columns = columns;
        this.depth = depth;
        this.mode = mode;

    }

    public byte[] getReserved() {
        return reserved.clone();
    }

    public void dump() {
        try (StringWriter sw = new StringWriter(); PrintWriter pw = new PrintWriter(sw)) {
            dump(pw);
            pw.flush();
            sw.flush();
            LOGGER.fine(sw.toString());
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public void dump(final PrintWriter pw) {
        pw.println("");
        pw.println("Header");
        pw.println("Version: " + version + " (" + Integer.toHexString(version) + ")");
        pw.println("Channels: " + channels + " (" + Integer.toHexString(channels) + ")");
        pw.println("Rows: " + rows + " (" + Integer.toHexString(rows) + ")");
        pw.println("Columns: " + columns + " (" + Integer.toHexString(columns) + ")");
        pw.println("Depth: " + depth + " (" + Integer.toHexString(depth) + ")");
        pw.println("Mode: " + mode + " (" + Integer.toHexString(mode) + ")");
        pw.println("Reserved: " + reserved.length);
        pw.println("");
        pw.flush();
    }

}
