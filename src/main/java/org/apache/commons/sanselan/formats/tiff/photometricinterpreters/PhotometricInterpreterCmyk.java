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

import java.io.IOException;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.color.ColorConversions;
import org.apache.commons.sanselan.common.ImageBuilder;

public class PhotometricInterpreterCmyk extends PhotometricInterpreter
{
    public PhotometricInterpreterCmyk(int fSamplesPerPixel,
            int fBitsPerSample[], int Predictor, int width, int height)
    {
        super(fSamplesPerPixel, fBitsPerSample, Predictor, width, height);
    }

    public void interpretPixel(ImageBuilder imageBuilder, int samples[], int x, int y)
            throws ImageReadException, IOException
    {

        int sc = samples[0];
        int sm = samples[1];
        int sy = samples[2];
        int sk = samples[3];

        int rgb = ColorConversions.convertCMYKtoRGB(sc, sm, sy, sk);
        imageBuilder.setRGB(x, y, rgb);
    }

}