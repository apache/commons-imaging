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

package org.apache.commons.sanselan.formats.jpeg;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.SanselanTest;
import org.apache.commons.sanselan.common.IImageMetadata;
import org.apache.commons.sanselan.formats.jpeg.JpegImageMetadata;

public class JpegWithJpegThumbnailTest extends SanselanTest {

    public void testSingleImage() throws Exception
    {
        File imageFile = getTestImageByName("img_F028c_small.jpg");

        Map params = new HashMap();
        IImageMetadata metadata = Sanselan.getMetadata(imageFile, params);
        assertNotNull(metadata);
        JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;
        BufferedImage image = jpegMetadata.getEXIFThumbnail();
        assertNotNull(image);
    }
}

