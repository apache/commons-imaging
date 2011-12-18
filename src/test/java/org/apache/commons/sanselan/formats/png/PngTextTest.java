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

package org.apache.commons.sanselan.formats.png;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.ImageFormat;
import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.formats.png.PngConstants;
import org.apache.commons.sanselan.formats.png.PngImageInfo;
import org.apache.commons.sanselan.formats.png.PngText;
import org.apache.commons.sanselan.util.IOUtils;

public class PngTextTest extends PngBaseTest
{

    public void test() throws IOException, ImageReadException,
            ImageWriteException
    {
        int width = 1;
        int height = 1;
        BufferedImage srcImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        srcImage.setRGB(0, 0, Color.red.getRGB());

        Map writeParams = new HashMap();

        List writeTexts = new ArrayList();
        {
            String keyword = "a";
            String text = "b";
            writeTexts.add(new PngText.tEXt(keyword, text));
        }
        {
            String keyword = "c";
            String text = "d";
            writeTexts.add(new PngText.zTXt(keyword, text));
        }
        {
            String keyword = "e";
            String text = "f";
            String languageTag = "g";
            String translatedKeyword = "h";
            writeTexts.add(new PngText.iTXt(keyword, text, languageTag,
                    translatedKeyword));
        }

        writeParams.put(PngConstants.PARAM_KEY_PNG_TEXT_CHUNKS, writeTexts);

        byte bytes[] = Sanselan.writeImageToBytes(srcImage,
                ImageFormat.IMAGE_FORMAT_PNG, writeParams);

        File tempFile = createTempFile("temp", ".png");
        IOUtils.writeToFile(bytes, tempFile);

        PngImageInfo imageInfo = (PngImageInfo) Sanselan.getImageInfo(bytes);
        assertNotNull(imageInfo);

        List readTexts = imageInfo.getTextChunks();
        assertEquals(readTexts.size(), 3);
        for (int i = 0; i < readTexts.size(); i++)
        {
            PngText text = (PngText) readTexts.get(i);
            if (text.keyword.equals("a"))
                assertEquals(text.text, "b");
            else if (text.keyword.equals("c"))
                assertEquals(text.text, "d");
            else if (text.keyword.equals("e"))
                assertEquals(text.text, "f");
            else
                fail("unknown text chunk.");
        }
    }

}
