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
package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.PrintWriter;

import org.apache.commons.imaging.common.BinaryFileParser;

/**
 * Abstracts segment implementations.
 */
public abstract class AbstractSegment extends BinaryFileParser {

    /** Segment marker. */
    public final int marker;

    /** Segment length. */
    public final int length;

    /**
     * Constructs a new instance.
     *
     * @param marker segment marker.
     * @param length segment length.
     */
    public AbstractSegment(final int marker, final int length) {
        this.marker = marker;
        this.length = length;
    }

    public void dump(final PrintWriter pw) {
        // empty
    }

    /**
     * Gets the description.
     *
     * @return the description.
     */
    public abstract String getDescription();

    /**
     * Gets the type.
     *
     * @return the type.
     */
    public String getSegmentType() {
        switch (marker) {
        case 0xffc0:
            return "Start Of Frame, Baseline Dct, Huffman coding";
        case 0xffc1:
            return "Start Of Frame, Extended sequential Dct, Huffman coding";
        case 0xffc2:
            return "Start Of Frame, Progressive Dct, Huffman coding";
        case 0xffc3:
            return "Start Of Frame, Lossless (sequential), Huffman coding";
        case 0xffc5:
            return "Start Of Frame, Differential sequential Dct, Huffman coding";
        case 0xffc6:
            return "Start Of Frame, Differential progressive Dct, Huffman coding";
        case 0xffc7:
            return "Start Of Frame, Differential lossless (sequential), Huffman coding";
        case 0xffc8:
            return "Start Of Frame, Reserved for JPEG extensions, arithmetic coding";
        case 0xffc9:
            return "Start Of Frame, Extended sequential Dct, arithmetic coding";
        case 0xffca:
            return "Start Of Frame, Progressive Dct, arithmetic coding";
        case 0xffcb:
            return "Start Of Frame, Lossless (sequential), arithmetic coding";
        case 0xffcd:
            return "Start Of Frame, Differential sequential Dct, arithmetic coding";
        case 0xffce:
            return "Start Of Frame, Differential progressive Dct, arithmetic coding";
        case 0xffcf:
            return "Start Of Frame, Differential lossless (sequential), arithmetic coding";
        case 0xffc4:
            return "Define Huffman table(s)";
        case 0xffcc:
            return "Define arithmetic coding conditioning(s)";
        case 0xffd0:
            return "Restart with modulo 8 count 0";
        case 0xffd1:
            return "Restart with modulo 8 count 1";
        case 0xffd2:
            return "Restart with modulo 8 count 2";
        case 0xffd3:
            return "Restart with modulo 8 count 3";
        case 0xffd4:
            return "Restart with modulo 8 count 4";
        case 0xffd5:
            return "Restart with modulo 8 count 5";
        case 0xffd6:
            return "Restart with modulo 8 count 6";
        case 0xffd7:
            return "Restart with modulo 8 count 7";
        case 0xffd8:
            return "Start of image";
        case 0xffd9:
            return "End of image";
        case 0xffda:
            return "Start of scan";
        case 0xffdb:
            return "Define quantization table(s)";
        case 0xffdc:
            return "Define number of lines";
        case 0xffdd:
            return "Define restart interval";
        case 0xffde:
            return "Define hierarchical progression";
        case 0xffdf:
            return "Expand reference component(s)";
        // case 0xffd8 :
        // return "Reserved for application segments";
        // case 0xffd8 :
        // return "Reserved for JPEG extensions";
        case 0xfffe:
            return "Comment";
        case 0xff01:
            return "For temporary private use in arithmetic coding";
        // case 0xffd8 :
        // return "Reserved";
        default:
        }
        if (marker >= 0xff02 && marker <= 0xffbf) {
            return "Reserved";
        }
        if (marker >= 0xffe0 && marker <= 0xffef) {
            return "APP" + (marker - 0xffe0);
        }
        if (marker >= 0xfff0 && marker <= 0xfffd) {
            return "JPG" + (marker - 0xffe0);
        }
        return "Unknown";
    }

    @Override
    public String toString() {
        return "[Segment: " + getDescription() + "]";
    }

}
