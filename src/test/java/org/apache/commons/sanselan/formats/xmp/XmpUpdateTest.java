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

package org.apache.commons.sanselan.formats.xmp;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.SanselanTest;
import org.apache.commons.sanselan.util.Debug;

public class XmpUpdateTest extends SanselanTest
{

    public void test() throws Exception
    {
        List images = getTestImages();
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);

            if (imageFile.getName().toLowerCase().endsWith(".png")
                    && isInvalidPNGTestFile(imageFile))
                continue;

            Debug.debug("imageFile", imageFile);
            Debug.debug();

            ImageFormat imageFormat = Sanselan.guessFormat(imageFile);

            String xmpXml = Sanselan.getXmpXml(imageFile);
            if (null == xmpXml
                    && imageFormat.equals(ImageFormat.IMAGE_FORMAT_GIF))
                xmpXml = "temporary test until I can locate a GIF with XMP in the wild.";
            if (null == xmpXml)
                continue;

            assertNotNull(xmpXml);

            if (imageFormat.equals(ImageFormat.IMAGE_FORMAT_PNG))
            { /* do nothing */ }
            else if (imageFormat.equals(ImageFormat.IMAGE_FORMAT_TIFF))
            { /* do nothing */ }
            else if (imageFormat.equals(ImageFormat.IMAGE_FORMAT_GIF))
            { /* do nothing */ }
            else
                continue;

            File tempFile = this.createTempFile(imageFile.getName() + ".", "."
                    + imageFormat.extension);
            BufferedImage image = Sanselan.getBufferedImage(imageFile);

            // ----

            Map params = new HashMap();
            params.put(PARAM_KEY_XMP_XML, xmpXml);
            Sanselan.writeImage(image, tempFile, imageFormat, params);

            String xmpXmlOut = Sanselan.getXmpXml(tempFile);

            assertNotNull(xmpXmlOut);

            assertEquals(xmpXmlOut, xmpXml);

//            Debug.debug("xmpXmlOut", xmpXmlOut.length());
            // Debug.debug("xmpXml", xmpXml);
            // Debug.debug();
        }
    }
}
