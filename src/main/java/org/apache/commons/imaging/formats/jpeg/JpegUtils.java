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
package org.apache.commons.imaging.formats.jpeg;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.internal.Debug;
import org.apache.commons.io.IOUtils;

public class JpegUtils extends BinaryFileParser {
    public interface Visitor {
        // return false to exit before reading image data.
        boolean beginSos();

        // return false to exit traversal.
        boolean visitSegment(int marker, byte[] markerBytes, int segmentLength, byte[] segmentLengthBytes, byte[] segmentData)
                throws ImagingException, IOException;

        void visitSos(int marker, byte[] markerBytes, byte[] imageData);
    }

    public static String getMarkerName(final int marker) {
        switch (marker) {
        case JpegConstants.SOS_MARKER:
            return "SOS_MARKER";
        // case JPEG_APP0 :
        // return "JPEG_APP0";
        // case JPEG_APP0_MARKER :
        // return "JPEG_APP0_MARKER";
        case JpegConstants.JPEG_APP1_MARKER:
            return "JPEG_APP1_MARKER";
        case JpegConstants.JPEG_APP2_MARKER:
            return "JPEG_APP2_MARKER";
        case JpegConstants.JPEG_APP13_MARKER:
            return "JPEG_APP13_MARKER";
        case JpegConstants.JPEG_APP14_MARKER:
            return "JPEG_APP14_MARKER";
        case JpegConstants.JPEG_APP15_MARKER:
            return "JPEG_APP15_MARKER";
        case JpegConstants.JFIF_MARKER:
            return "JFIF_MARKER";
        case JpegConstants.SOF0_MARKER:
            return "SOF0_MARKER";
        case JpegConstants.SOF1_MARKER:
            return "SOF1_MARKER";
        case JpegConstants.SOF2_MARKER:
            return "SOF2_MARKER";
        case JpegConstants.SOF3_MARKER:
            return "SOF3_MARKER";
        case JpegConstants.DHT_MARKER:
            return "SOF4_MARKER";
        case JpegConstants.SOF5_MARKER:
            return "SOF5_MARKER";
        case JpegConstants.SOF6_MARKER:
            return "SOF6_MARKER";
        case JpegConstants.SOF7_MARKER:
            return "SOF7_MARKER";
        case JpegConstants.SOF8_MARKER:
            return "SOF8_MARKER";
        case JpegConstants.SOF9_MARKER:
            return "SOF9_MARKER";
        case JpegConstants.SOF10_MARKER:
            return "SOF10_MARKER";
        case JpegConstants.SOF11_MARKER:
            return "SOF11_MARKER";
        case JpegConstants.DAC_MARKER:
            return "DAC_MARKER";
        case JpegConstants.SOF13_MARKER:
            return "SOF13_MARKER";
        case JpegConstants.SOF14_MARKER:
            return "SOF14_MARKER";
        case JpegConstants.SOF15_MARKER:
            return "SOF15_MARKER";
        case JpegConstants.DQT_MARKER:
            return "DQT_MARKER";
        case JpegConstants.DRI_MARKER:
            return "DRI_MARKER";
        case JpegConstants.RST0_MARKER:
            return "RST0_MARKER";
        case JpegConstants.RST1_MARKER:
            return "RST1_MARKER";
        case JpegConstants.RST2_MARKER:
            return "RST2_MARKER";
        case JpegConstants.RST3_MARKER:
            return "RST3_MARKER";
        case JpegConstants.RST4_MARKER:
            return "RST4_MARKER";
        case JpegConstants.RST5_MARKER:
            return "RST5_MARKER";
        case JpegConstants.RST6_MARKER:
            return "RST6_MARKER";
        case JpegConstants.RST7_MARKER:
            return "RST7_MARKER";
        default:
            return "Unknown";
        }
    }

    public JpegUtils() {
        super(ByteOrder.BIG_ENDIAN);
    }

    public void dumpJfif(final ByteSource byteSource) throws ImagingException, IOException {
        final Visitor visitor = new Visitor() {
            // return false to exit before reading image data.
            @Override
            public boolean beginSos() {
                return true;
            }

            // return false to exit traversal.
            @Override
            public boolean visitSegment(final int marker, final byte[] markerBytes, final int segmentLength, final byte[] segmentLengthBytes,
                    final byte[] segmentData) {
                Debug.debug("Segment marker: " + Integer.toHexString(marker) + " (" + getMarkerName(marker) + "), " + segmentData.length
                        + " bytes of segment data.");
                return true;
            }

            @Override
            public void visitSos(final int marker, final byte[] markerBytes, final byte[] imageData) {
                Debug.debug("SOS marker.  " + imageData.length + " bytes of image data.");
                Debug.debug("");
            }
        };

        traverseJfif(byteSource, visitor);
    }

    public void traverseJfif(final ByteSource byteSource, final Visitor visitor) throws ImagingException, IOException {
        try (InputStream is = byteSource.getInputStream()) {
            BinaryFunctions.readAndVerifyBytes(is, JpegConstants.SOI, "Not a Valid JPEG File: doesn't begin with 0xffd8");

            int markerCount;
            for (markerCount = 0; true; markerCount++) {
                final byte[] markerBytes = new byte[2];
                do {
                    markerBytes[0] = markerBytes[1];
                    markerBytes[1] = BinaryFunctions.readByte("marker", is, "Could not read marker");
                } while ((0xff & markerBytes[0]) != 0xff || (0xff & markerBytes[1]) == 0xff);
                final int marker = (0xff & markerBytes[0]) << 8 | 0xff & markerBytes[1];

                if (marker == JpegConstants.EOI_MARKER || marker == JpegConstants.SOS_MARKER) {
                    if (!visitor.beginSos()) {
                        return;
                    }

                    final byte[] imageData = IOUtils.toByteArray(is);
                    visitor.visitSos(marker, markerBytes, imageData);
                    break;
                }

                final byte[] segmentLengthBytes = BinaryFunctions.readBytes("segmentLengthBytes", is, 2, "segmentLengthBytes");
                final int segmentLength = ByteConversions.toUInt16(segmentLengthBytes, getByteOrder());
                if (segmentLength < 2) {
                    throw new ImagingException("Invalid segment size");
                }

                final byte[] segmentData = BinaryFunctions.readBytes("Segment Data", is, segmentLength - 2, "Invalid Segment: insufficient data");

                if (!visitor.visitSegment(marker, markerBytes, segmentLength, segmentLengthBytes, segmentData)) {
                    return;
                }
            }

            Debug.debug(markerCount + " markers");
        }
    }
}
