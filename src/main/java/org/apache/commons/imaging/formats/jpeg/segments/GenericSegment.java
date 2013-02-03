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
package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public abstract class GenericSegment extends Segment {
    public final byte bytes[];

    public GenericSegment(final int marker, final int marker_length, final InputStream is)
            throws IOException {
        super(marker, marker_length);

        bytes = readBytes("Segment Data", is, marker_length,
                "Invalid Segment: insufficient data");
    }

    public GenericSegment(final int marker, final byte bytes[]) {
        super(marker, bytes.length);

        this.bytes = bytes;
    }

    @Override
    public void dump(final PrintWriter pw) {
        dump(pw, 0);
    }

    public void dump(final PrintWriter pw, final int start) {
        for (int i = 0; (i < 50) && ((i + start) < bytes.length); i++) {
            debugNumber(pw, "\t" + (i + start), bytes[i + start]);
        }
    }

    // public String getDescription()
    // {
    // return "Unknown";
    // }
}
