/*
 * Copyright 2015 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.jpeg.specific;

import java.io.File;
import java.io.IOException;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for image files with restart marker.
 */
public final class RestartMarkerTest {
    /**
     * Assert that image files with restart marker cause a proper exception.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Test
    public void testGetBufferedImageRst() throws ImageReadException, IOException {
        final File imageFile = new File (ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/1/image.jpeg");
        // manual check of exception to make sure we got the ImageReadException from expected place
        try {
            Imaging.getBufferedImage(imageFile);
            fail("Expected an ImageReadException here but didn't get one.");
        }
        catch (ImageReadException ex) {
            assertTrue(ex.getLocalizedMessage().matches(".*Found RST marker in entropy data.*"));
        }
    }
}