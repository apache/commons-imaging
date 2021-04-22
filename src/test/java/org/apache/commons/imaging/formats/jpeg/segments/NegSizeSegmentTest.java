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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;
import org.junit.jupiter.api.Test;

public class NegSizeSegmentTest {

    @Test
    public void testCreatesNegSizeSegment() throws IOException {
        final byte[] bytes = new byte[8];
        bytes[0] = (byte) 0xff;
        bytes[1] = (byte) 0xd8;
        bytes[2] = (byte) 0xe1;
        bytes[3] = (byte) 0xff;
        bytes[4] = (byte) 0x01;
        bytes[5] = (byte) 0x00;
        bytes[6] = (byte) 0x00;
        bytes[7] = (byte) 0x00;

        try {
            final InputStream inputStream = new ByteArrayInputStream(bytes);
            final ByteSource bs = new ByteSourceInputStream(inputStream, "NegSizeSegment");
            final JpegImageParser p = new JpegImageParser();
            p.getBufferedImage(bs, new JpegImagingParameters());
            fail("Expecting exception: ImageReadException");
        } catch (final ImageReadException e) {
            assertEquals("Invalid segment size", e.getMessage());
            assertEquals(JpegUtils.class.getName(), e.getStackTrace()[0].getClassName());
        }

    }

}
