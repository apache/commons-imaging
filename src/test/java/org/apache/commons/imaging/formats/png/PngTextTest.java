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

package org.apache.commons.imaging.formats.png;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

public class PngTextTest extends PngBaseTest {

    @Test
    public void test() throws Exception {
        final int width = 1;
        final int height = 1;
        final BufferedImage srcImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);
        srcImage.setRGB(0, 0, Color.red.getRGB());

        final PngImagingParameters writeParams = new PngImagingParameters();

        final List<PngText> writeTexts = new ArrayList<>();
        {
            final String keyword = "a";
            final String text = "b";
            writeTexts.add(new PngText.Text(keyword, text));
        }
        {
            final String keyword = "c";
            final String text = "d";
            writeTexts.add(new PngText.Ztxt(keyword, text));
        }
        {
            final String keyword = "e";
            final String text = "f";
            final String languageTag = "g";
            final String translatedKeyword = "h";
            writeTexts.add(new PngText.Itxt(keyword, text, languageTag,
                    translatedKeyword));
        }

        writeParams.setTextChunks(writeTexts);

        final byte[] bytes = Imaging.writeImageToBytes(srcImage, writeParams);

        final File tempFile = File.createTempFile("temp", ".png");
        FileUtils.writeByteArrayToFile(tempFile, bytes);

        final PngImageInfo imageInfo = (PngImageInfo) Imaging.getImageInfo(bytes);
        assertNotNull(imageInfo);

        final List<PngText> readTexts = imageInfo.getTextChunks();
        assertEquals(readTexts.size(), 3);
        for (final PngText text : readTexts) {
            if (text.keyword.equals("a")) {
                assertEquals(text.text, "b");
            } else if (text.keyword.equals("c")) {
                assertEquals(text.text, "d");
            } else if (text.keyword.equals("e")) {
                assertEquals(text.text, "f");
            } else {
                fail("unknown text chunk.");
            }
        }
    }

}
