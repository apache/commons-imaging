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
package org.apache.commons.sanselan.sampleUsage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.SanselanConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffConstants;

public class ImageWriteExample
{
    public static byte[] imageWriteExample(File file)
            throws ImageReadException, ImageWriteException, IOException
    {
        // read image
        BufferedImage image = Sanselan.getBufferedImage(file);

        ImageFormat format = ImageFormat.IMAGE_FORMAT_TIFF;
        Map params = new HashMap();

        // set optional parameters if you like
        params.put(SanselanConstants.PARAM_KEY_COMPRESSION, new Integer(
                TiffConstants.TIFF_COMPRESSION_UNCOMPRESSED));

        byte bytes[] = Sanselan.writeImageToBytes(image, format, params);

        return bytes;
    }

}
