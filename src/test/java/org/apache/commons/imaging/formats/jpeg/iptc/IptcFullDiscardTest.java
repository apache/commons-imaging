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

package org.apache.commons.imaging.formats.jpeg.iptc;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Collections;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.junit.Test;

public class IptcFullDiscardTest {
    
    private byte[] addMetaData(final byte[] bytes) throws Exception {
        IptcRecord record = new IptcRecord(IptcTypes.KEYWORDS, "meta; data");
        PhotoshopApp13Data data = new PhotoshopApp13Data(Collections.singletonList(record), Collections.<IptcBlock> emptyList());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new JpegIptcRewriter().writeIPTC(bytes, byteArrayOutputStream, data);
        return byteArrayOutputStream.toByteArray();
    }
    
    private byte[] generateImage() throws Exception {
        BufferedImage image = new BufferedImage(100, 50, BufferedImage.TYPE_3BYTE_BGR); // was TYPE_INT_ARGB but that fails on Continuum
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.drawString("Hello World!", 10, 10);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
    
    private byte[] removeMetaData(final byte[] bytes, final boolean removeApp13Segment) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new JpegIptcRewriter().removeIPTC(bytes, byteArrayOutputStream, removeApp13Segment);
        return byteArrayOutputStream.toByteArray();
    }

    @Test
    public void leaveApp13Segment() throws Exception {
        byte[] originalImage = generateImage();
        byte[] taggedImage = addMetaData(originalImage);
        byte[] untaggedImage = removeMetaData(taggedImage, false);
        Assert.assertEquals(18, untaggedImage.length - originalImage.length);
    }
    
    @Test
    public void removeApp13Segment() throws Exception {
        byte[] originalImage = generateImage();
        byte[] taggedImage = addMetaData(originalImage);
        byte[] untaggedImage = removeMetaData(taggedImage, true);
        Assert.assertEquals(originalImage.length, untaggedImage.length);
    }
}
