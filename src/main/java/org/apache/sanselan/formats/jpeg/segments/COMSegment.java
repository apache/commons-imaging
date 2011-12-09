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
package org.apache.sanselan.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.sanselan.ImageReadException;

public class COMSegment extends Segment
{
    public final byte[] comment;

    public COMSegment(int marker, byte segmentData[])
            throws ImageReadException, IOException
    {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public COMSegment(int marker, int marker_length, InputStream is)
            throws ImageReadException, IOException
    {
        super(marker, marker_length);

        if (getDebug())
            System.out.println("COMSegment marker_length: " + marker_length);

        comment = readByteArray("Comment", marker_length, is, "Error reading JPEG comment");

        if (getDebug())
            System.out.println("");
    }

    public String getDescription()
    {
        String commentString = "";
        try {
            commentString = new String(comment, "ISO-8859-1");
        } catch (UnsupportedEncodingException cannotHappen) {
        }
        return "COM (" + commentString + ")";
    }

}
