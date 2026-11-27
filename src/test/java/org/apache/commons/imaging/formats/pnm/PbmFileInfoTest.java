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
package org.apache.commons.imaging.formats.pnm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.imaging.Imaging;
import org.junit.jupiter.api.Test;

class PbmFileInfoTest {

    @Test
    void testGetRGBThrowsIOException() throws IOException {
        final PbmFileInfo pbmFileInfo = new PbmFileInfo(2764, 354, true);
        final byte[] byteArray = new byte[2];
        final InputStream inputStream = new ByteArrayInputStream(byteArray);
        inputStream.read(byteArray);

        try {
            pbmFileInfo.getRgb(inputStream);
            fail("Expecting exception: IOException");
        } catch (final IOException e) {
            assertEquals("PBM: Unexpected EOF", e.getMessage());
            assertEquals(PbmFileInfo.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }


    /**
     * Tests that the plain (P1) and raw (P4) formats decode the same bits to the same colors: 1 is black, 0 is white.
     */
    @Test
    void testPlainAndRawPolarity() throws IOException {
        final byte[] plain = "P1\n2 1\n0 1\n".getBytes(StandardCharsets.US_ASCII);
        final byte[] raw = { 'P', '4', '\n', '2', ' ', '1', '\n', 0x40 };
        for (final byte[] bytes : new byte[][] { plain, raw }) {
            final BufferedImage image = Imaging.getBufferedImage(bytes);
            assertEquals(0xffffffff, image.getRGB(0, 0));
            assertEquals(0xff000000, image.getRGB(1, 0));
        }
    }
}
