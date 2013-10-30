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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;

public class JpegUtils extends BinaryFileParser implements JpegConstants {
    public JpegUtils() {
        setByteOrder(ByteOrder.NETWORK);
    }

    public static interface Visitor {
        // return false to exit before reading image data.
        public boolean beginSOS();

        public void visitSOS(int marker, byte markerBytes[], byte imageData[]);

        // return false to exit traversal.
        public boolean visitSegment(int marker, byte markerBytes[],
                int segmentLength, byte segmentLengthBytes[],
                byte segmentData[]) throws ImageReadException,
                IOException;
    }

    public void traverseJFIF(final ByteSource byteSource, final Visitor visitor)
            throws ImageReadException,
            IOException {
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = byteSource.getInputStream();

            readAndVerifyBytes(is, SOI,
                    "Not a Valid JPEG File: doesn't begin with 0xffd8");

            int markerCount;
            for (markerCount = 0; true; markerCount++) {
                final byte[] markerBytes = new byte[2];
                do {
                    markerBytes[0] = markerBytes[1];
                    markerBytes[1] = readByte("marker", is,
                            "Could not read marker");
                } while ((0xff & markerBytes[0]) != 0xff
                        || (0xff & markerBytes[1]) == 0xff);
                final int marker = ((0xff & markerBytes[0]) << 8)
                        | (0xff & markerBytes[1]);

                if (marker == EOIMarker || marker == SOS_Marker) {
                    if (!visitor.beginSOS()) {
                        canThrow = true;
                        return;
                    }

                    final byte imageData[] = getStreamBytes(is);
                    visitor.visitSOS(marker, markerBytes, imageData);
                    break;
                }

                final byte segmentLengthBytes[] = readBytes("segmentLengthBytes",
                        is, 2, "segmentLengthBytes");
                final int segmentLength = toUInt16(segmentLengthBytes);

                final byte segmentData[] = readBytes("Segment Data",
                        is, segmentLength - 2,
                        "Invalid Segment: insufficient data");

                if (!visitor.visitSegment(marker, markerBytes, segmentLength,
                        segmentLengthBytes, segmentData)) {
                    canThrow = true;
                    return;
                }
            }
            
            Debug.debug("" + markerCount + " markers");
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    public static String getMarkerName(final int marker) {
        switch (marker) {
        case SOS_Marker:
            return "SOS_Marker";
            // case JPEG_APP0 :
            // return "JPEG_APP0";
            // case JPEG_APP0_Marker :
            // return "JPEG_APP0_Marker";
        case JPEG_APP1_Marker:
            return "JPEG_APP1_Marker";
        case JPEG_APP2_Marker:
            return "JPEG_APP2_Marker";
        case JPEG_APP13_Marker:
            return "JPEG_APP13_Marker";
        case JPEG_APP14_Marker:
            return "JPEG_APP14_Marker";
        case JPEG_APP15_Marker:
            return "JPEG_APP15_Marker";
        case JFIFMarker:
            return "JFIFMarker";
        case SOF0Marker:
            return "SOF0Marker";
        case SOF1Marker:
            return "SOF1Marker";
        case SOF2Marker:
            return "SOF2Marker";
        case SOF3Marker:
            return "SOF3Marker";
        case DHTMarker:
            return "SOF4Marker";
        case SOF5Marker:
            return "SOF5Marker";
        case SOF6Marker:
            return "SOF6Marker";
        case SOF7Marker:
            return "SOF7Marker";
        case SOF8Marker:
            return "SOF8Marker";
        case SOF9Marker:
            return "SOF9Marker";
        case SOF10Marker:
            return "SOF10Marker";
        case SOF11Marker:
            return "SOF11Marker";
        case DACMarker:
            return "DACMarker";
        case SOF13Marker:
            return "SOF13Marker";
        case SOF14Marker:
            return "SOF14Marker";
        case SOF15Marker:
            return "SOF15Marker";
        case DQTMarker:
            return "DQTMarker";
        default:
            return "Unknown";
        }
    }

    public void dumpJFIF(final ByteSource byteSource) throws ImageReadException,
            IOException {
        final Visitor visitor = new Visitor() {
            // return false to exit before reading image data.
            public boolean beginSOS() {
                return true;
            }

            public void visitSOS(final int marker, final byte markerBytes[],
                    final byte imageData[]) {
                Debug.debug("SOS marker.  " + imageData.length
                        + " bytes of image data.");
                Debug.debug("");
            }

            // return false to exit traversal.
            public boolean visitSegment(final int marker, final byte markerBytes[],
                    final int segmentLength, final byte segmentLengthBytes[],
                    final byte segmentData[]) {
                Debug.debug("Segment marker: " + Integer.toHexString(marker)
                        + " (" + getMarkerName(marker) + "), "
                        + segmentData.length + " bytes of segment data.");
                return true;
            }
        };

        traverseJFIF(byteSource, visitor);
    }
}
