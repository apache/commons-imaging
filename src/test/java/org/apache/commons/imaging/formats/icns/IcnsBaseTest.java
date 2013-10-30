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

package org.apache.commons.imaging.formats.icns;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingTest;

public abstract class IcnsBaseTest extends ImagingTest {

    private static boolean isIcns(final File file) throws IOException,
            ImageReadException {
        final ImageFormats format = Imaging.guessFormat(file);
        return format == ImageFormats.ICNS;
    }

    private static final ImageFilter IMAGE_FILTER = new ImageFilter() {
        public boolean accept(final File file) throws IOException, ImageReadException {
            return isIcns(file);
        }
    };

    protected List<File> getIcnsImages() throws IOException, ImageReadException {
        return getTestImages(IMAGE_FILTER);
    }
}
