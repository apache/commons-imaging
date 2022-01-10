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

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;
import static org.apache.commons.imaging.common.BinaryFunctions.readBytes;
import static org.apache.commons.imaging.common.BinaryFunctions.skipBytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

public class JfifSegment extends Segment {
    public final int jfifMajorVersion;
    public final int jfifMinorVersion;
    public final int densityUnits;
    public final int xDensity;
    public final int yDensity;

    public final int xThumbnail;
    public final int yThumbnail;
    public final int thumbnailSize;

    @Override
    public String getDescription() {
        return "JFIF (" + getSegmentType() + ")";
    }

    public JfifSegment(final int marker, final byte[] segmentData)
            throws ImageReadException, IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public JfifSegment(final int marker, final int markerLength, final InputStream is)
            throws ImageReadException, IOException {
        super(marker, markerLength);

        final byte[] signature = readBytes(is, JpegConstants.JFIF0_SIGNATURE.size());
        if (!JpegConstants.JFIF0_SIGNATURE.equals(signature)
                && !JpegConstants.JFIF0_SIGNATURE_ALTERNATIVE.equals(signature)
                && !JpegConstants.JFXX0_EXTENSION_SIGNATURE.equals(signature)) {
            throw new ImageReadException(
                    "Not a Valid JPEG File: missing JFIF string");
        }

        jfifMajorVersion = readByte("JFIF_major_version", is,
                "Not a Valid JPEG File");
        jfifMinorVersion = readByte("JFIF_minor_version", is,
                "Not a Valid JPEG File");
        densityUnits = readByte("density_units", is, "Not a Valid JPEG File");
        xDensity = read2Bytes("x_density", is, "Not a Valid JPEG File", getByteOrder());
        yDensity = read2Bytes("y_density", is, "Not a Valid JPEG File", getByteOrder());

        xThumbnail = readByte("x_thumbnail", is, "Not a Valid JPEG File");
        yThumbnail = readByte("y_thumbnail", is, "Not a Valid JPEG File");
        thumbnailSize = xThumbnail * yThumbnail;
        if (thumbnailSize > 0) {
            skipBytes(is, thumbnailSize,
                    "Not a Valid JPEG File: missing thumbnail");

        }
    }

}
