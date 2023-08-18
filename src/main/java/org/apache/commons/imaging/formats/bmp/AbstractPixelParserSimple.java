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
package org.apache.commons.imaging.formats.bmp;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageBuilder;

abstract class AbstractPixelParserSimple extends AbstractPixelParser {
    AbstractPixelParserSimple(final BmpHeaderInfo bhi, final byte[] colorTable, final byte[] imageData) {
        super(bhi, colorTable, imageData);
    }

    public abstract int getNextRgb() throws ImagingException, IOException;

    public abstract void newline() throws ImagingException, IOException;

    @Override
    public void processImage(final ImageBuilder imageBuilder) throws ImagingException, IOException {
        for (int y = bhi.height - 1; y >= 0; y--) {
            for (int x = 0; x < bhi.width; x++) {
                final int rgb = getNextRgb();

                imageBuilder.setRgb(x, y, rgb);
                // db.setElem(y * bhi.width + x, rgb);
            }
            newline();
        }
    }
}
