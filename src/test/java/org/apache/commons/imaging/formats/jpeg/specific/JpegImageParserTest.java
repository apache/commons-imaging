/*
 * Copyright 2015 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.jpeg.specific;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.test.TestResources;
import org.junit.jupiter.api.Test;

/**
 * Basic tests for JpegImageParser.
 */
public class JpegImageParserTest {
    /**
     * Image created with The Gimp 2.8
     *
     * @throws ImagingException
     * @throws IOException
     */
    @Test
    public void testGetBufferedImage10() throws ImagingException, IOException {
        final File imageFile = TestResources.resourceToFile("/IMAGING-136/1402522741337.jpg");
        final JpegImageParser parser = new JpegImageParser();
        final BufferedImage image = parser.getBufferedImage(ByteSource.file(imageFile), null);
        assertEquals(680, image.getWidth());
        assertEquals(241, image.getHeight());
        assertEquals(-16777216, image.getRGB(0, 0));
        assertEquals(-12177367, image.getRGB(198, 13));
    }
}
