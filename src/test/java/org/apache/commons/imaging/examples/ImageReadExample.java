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
package org.apache.commons.imaging.examples;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.common.BufferedImageFactory;

public class ImageReadExample {
    public static BufferedImage imageReadExample(final File file)
            throws ImageReadException, IOException {
        final ImagingParameters params = new ImagingParameters();

        // set optional parameters if you like
        params.setBufferedImageFactory(new ManagedImageBufferedImageFactory());

        // params.enableVerbose();

        // read image
        final BufferedImage image = Imaging.getBufferedImage(file, params);

        return image;
    }

    public static class ManagedImageBufferedImageFactory implements
            BufferedImageFactory {

        public BufferedImage getColorBufferedImage(final int width, final int height,
                final boolean hasAlpha) {
            final GraphicsEnvironment ge = GraphicsEnvironment
                    .getLocalGraphicsEnvironment();
            final GraphicsDevice gd = ge.getDefaultScreenDevice();
            final GraphicsConfiguration gc = gd.getDefaultConfiguration();
            return gc.createCompatibleImage(width, height,
                    Transparency.TRANSLUCENT);
        }

        public BufferedImage getGrayscaleBufferedImage(final int width, final int height,
                final boolean hasAlpha) {
            return getColorBufferedImage(width, height, hasAlpha);
        }
    }

}
