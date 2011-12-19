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
package org.apache.commons.sanselan.formats.psd;

import java.io.PrintWriter;

public class PsdHeaderInfo
{
    public final int Version;
    public final byte Reserved[];
    public final int Channels;
    public final int Rows;
    public final int Columns;
    public final int Depth;
    public final int Mode;

    public PsdHeaderInfo(int Version, byte Reserved[], int Channels, int Rows,
            int Columns, int Depth, int Mode)
    {
        this.Version = Version;
        this.Reserved = Reserved;
        this.Channels = Channels;
        this.Rows = Rows;
        this.Columns = Columns;
        this.Depth = Depth;
        this.Mode = Mode;

    }

    public void dump()
    {
        PrintWriter pw = new PrintWriter(System.out);
        dump(pw);
        pw.flush();
    }

    public void dump(PrintWriter pw)
    {
        pw.println("");
        pw.println("Header");
        pw.println("Version: " + Version + " (" + Integer.toHexString(Version)
                + ")");
        pw.println("Channels: " + Channels + " ("
                + Integer.toHexString(Channels) + ")");
        pw.println("Rows: " + Rows + " (" + Integer.toHexString(Rows) + ")");
        pw.println("Columns: " + Columns + " (" + Integer.toHexString(Columns)
                + ")");
        pw.println("Depth: " + Depth + " (" + Integer.toHexString(Depth) + ")");
        pw.println("Mode: " + Mode + " (" + Integer.toHexString(Mode) + ")");
        pw.println("Reserved: " + Reserved.length);
        pw.println("");
        pw.flush();

    }

}