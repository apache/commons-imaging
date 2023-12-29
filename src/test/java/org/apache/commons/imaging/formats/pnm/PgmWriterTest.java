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
package org.apache.commons.imaging.formats.pnm;

import org.apache.commons.imaging.ImagingException;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PgmWriterTest {

    @Test
    public void testWriteImage() throws ImagingException, IOException {
        // Create a simple grayscale image
        BufferedImage image = new BufferedImage(3, 2, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0xFFFFFF); // white
        image.setRGB(1, 0, 0x000000); // black
        image.setRGB(2, 0, 0x808080); // gray
        image.setRGB(0, 1, 0xFF0000); // red
        image.setRGB(1, 1, 0x00FF00); // green
        image.setRGB(2, 1, 0x0000FF); // blue

        // Create an instance of PgmWriter
        PgmWriter pgmWriter = new PgmWriter(false); // Use raw bits

        // Prepare the expected PGM content
        String expectedPgmContent = "P2\n" +
                "3 2\n" +
                "255\n" +
                "255 0 128\n" +
                "85 85 85\n";

        // Create an output stream to capture the PGM content
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Invoke the writeImage method
        pgmWriter.writeImage(image, outputStream, null);

        // Check whether the output stream contains the expected content
        String actualPgmContent = new String(outputStream.toByteArray(), StandardCharsets.US_ASCII);
        assertEquals(expectedPgmContent, actualPgmContent);
    }
}
