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
package org.apache.commons.sanselan.formats.tiff.photometricinterpreters;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.apache.commons.sanselan.ImageReadException;

public class PhotometricInterpreterRGB extends PhotometricInterpreter
{
    public PhotometricInterpreterRGB(int fSamplesPerPixel,
            int fBitsPerSample[], int Predictor, int width, int height)
    {
        super(fSamplesPerPixel, fBitsPerSample, Predictor, width, height);
    }

    public void interpretPixel(BufferedImage bi, int samples[], int x, int y)
            throws ImageReadException, IOException
    {
        int red = samples[0];
        int green = samples[1];
        int blue = samples[2];

        int alpha = 0xff;
        int rgb = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);
        bi.setRGB(x, y, rgb);

    }
}