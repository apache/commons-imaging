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

package org.apache.commons.imaging.roundtrip;

import java.awt.image.BufferedImage;
import java.io.File;

import org.apache.commons.imaging.Imaging;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(Theories.class)
public class NullParametersRoundtripTest extends RoundtripBase {

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.readableWriteableFormatInfos;

    @Theory
    public void testNullParametersRoundtrip(final FormatInfo formatInfo) throws Exception {
        final BufferedImage testImage = createFullColorImage(1, 1);
        final File temp1 = createTempFile("nullParameters.", "." + formatInfo.format.getExtension());
        Imaging.writeImage(testImage, temp1, formatInfo.format, null);
        Imaging.getImageInfo(temp1, null);
        Imaging.getImageSize(temp1, null);
        Imaging.getMetadata(temp1, null);
        Imaging.getICCProfile(temp1, null);
        BufferedImage imageRead = Imaging.getBufferedImage(temp1, null);

        assertNotNull(imageRead);
    }

}
