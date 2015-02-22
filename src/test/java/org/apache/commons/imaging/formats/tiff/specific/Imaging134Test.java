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
 *
 * Added 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.formats.tiff.specific;

import java.io.File;
import java.io.IOException;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTestConstants;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael Groﬂ, mgmechanics@mgmechanics.de, http://sourceforge.net/users/mgmechanics
 */
public final class Imaging134Test {
    /**
     * The purpose of this test is to reproduce the exception described in issue IMAGING-134.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Test(expected=ImageReadException.class)
    public void testGetBufferedImage134() throws ImageReadException, IOException {
        final File imageFile = new File (ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/1/image.jpeg");
        Imaging.getBufferedImage(imageFile);
    }
    
    /**
     * The purpose of this test is to reproduce the exception described in issue IMAGING-97
     * to see if it has the same cause as IMAGING-134.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Test(expected=ImageReadException.class)
    public void testGetBufferedImage097() throws ImageReadException, IOException {
        final File imageFile = new File (ImagingTestConstants.TEST_SPECIFIC_FOLDER, "jpg/2/_DSC6099.jpg");
        Imaging.getBufferedImage(imageFile);
    }
}