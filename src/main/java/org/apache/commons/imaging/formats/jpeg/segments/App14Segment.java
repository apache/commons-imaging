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

import static org.apache.commons.imaging.common.BinaryFunctions.startsWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @see <a href="https://web.archive.org/web/20220122061015/http://www.lprng.com/RESOURCES/ADOBE/5116.DCT_Filter.pdf">Supporting the DCT Filters in PostScript Level 2</a>
 */
public class App14Segment extends AppnSegment {
    private static final byte[] ADOBE_PREFIX;
    public static final int ADOBE_COLOR_TRANSFORM_UNKNOWN = 0;
    public static final int ADOBE_COLOR_TRANSFORM_YCbCr = 1;
    public static final int ADOBE_COLOR_TRANSFORM_YCCK = 2;

    static {
        ADOBE_PREFIX = "Adobe".getBytes(StandardCharsets.US_ASCII);
    }

    public App14Segment(final int marker, final byte[] segmentData) throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public App14Segment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength, is);
    }

    public boolean isAdobeJpegSegment() {
        return startsWith(getSegmentData(), ADOBE_PREFIX);
    }

    public int getAdobeColorTransform() {
        return 0xff & getSegmentData(11);
    }
}
