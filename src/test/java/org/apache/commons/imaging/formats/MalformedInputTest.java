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
package org.apache.commons.imaging.formats;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Base64;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.wbmp.WbmpImageParser;
import org.apache.commons.imaging.formats.xpm.XpmImageParser;
import org.junit.jupiter.api.Test;

/**
 * Malformed inputs must be reported with {@link ImagingException}, not with unchecked exceptions.
 */
class MalformedInputTest {

    private static byte[] b64(final String s) {
        return Base64.getDecoder().decode(s);
    }

    @Test
    void testWbmpHugeDimensions() {
        // width 0x0fffffff, height 0x40: row length * height overflows int
        final byte[] bytes = b64("AAD///9/QAAAAAAAAAAAAAAAAAAAAAA=");
        assertThrows(ImagingException.class, () -> new WbmpImageParser().getBufferedImage(ByteSource.array(bytes), null));
    }

    @Test
    void testPngEmptyScalChunk() {
        // 1x1 PNG with a zero-length sCAL chunk
        final byte[] bytes = b64("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAIAAACQd1PeAAAAAHNDQUy8GpAIAAAADElEQVR4nGPgEpEDAABoAD1UCKP3AAAAAElFTkSuQmCC");
        assertThrows(ImagingException.class, () -> Imaging.getImageInfo(bytes));
    }

    @Test
    void testXpmEndsAfterArrayOpen() {
        // "/* XPM */\nstatic char *x[] = {\n" and nothing else
        final byte[] bytes = b64("LyogWFBNICovCnN0YXRpYyBjaGFyICp4W10gPSB7Cg==");
        assertThrows(ImagingException.class, () -> new XpmImageParser().getBufferedImage(ByteSource.array(bytes), null));
    }

    @Test
    void testIptcTruncatedRecordHeader() {
        // JPEG with an APP13 IPTC block that ends right after the record type / one size byte
        for (final String s : new String[] { "/9j/7QAgUGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAAMcAQUA/9k=",
                "/9j/7QAgUGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAAQcAQUA/9k=" }) {
            // the truncated record is ignored
            assertDoesNotThrow(() -> Imaging.getMetadata(b64(s)));
        }
    }
}
