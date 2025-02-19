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
package org.apache.commons.imaging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.apache.commons.imaging.formats.tiff.TiffCoverageLogger;

public class ImageDumpTest {

    @Test
    public void testDump() throws IOException {
        final ImageDump imageDump = new ImageDump();
        final BufferedImage bufferedImage = new BufferedImage(10, 10, 10);
        imageDump.dump(bufferedImage);

        assertEquals(10, bufferedImage.getHeight());
    }

    @Test
    public void testDumpColorSpace() throws IOException {
        final ImageDump imageDump = new ImageDump();
        final ColorSpace colorSpace = ColorSpace.getInstance(1004);
        imageDump.dumpColorSpace("Ku&]N>!4'C#Jzn+", colorSpace);

        assertEquals(3, colorSpace.getNumComponents());
    }

    @AfterAll
    static void printFinalReport() {
        TiffCoverageLogger.printCoverageReport();
    }
}
