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

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class BitmapRoundtripTest extends RoundtripBase {

    @DataPoints
    public static BufferedImage[] images = new BufferedImage[] {
            TestImages.createArgbBitmapImage(1, 1), // minimal
            TestImages.createArgbBitmapImage(2, 2), //
            TestImages.createArgbBitmapImage(10, 10), // larger than 8
            TestImages.createArgbBitmapImage(300, 300), // larger than 256

            TestImages.createBitmapBitmapImage(1, 1), // minimal
            TestImages.createBitmapBitmapImage(2, 2), //
            TestImages.createBitmapBitmapImage(10, 10), // larger than 8
            TestImages.createBitmapBitmapImage(300, 300), // larger than 256
    };

    @DataPoints
    public static FormatInfo[] formatInfos = FormatInfo.READ_WRITE_FORMATS;

    @Theory
    public void testBitmapRoundtrip(BufferedImage testImage, FormatInfo formatInfo) throws Exception {
        roundtrip(formatInfo, testImage, "bitmap", true);
    }
}
