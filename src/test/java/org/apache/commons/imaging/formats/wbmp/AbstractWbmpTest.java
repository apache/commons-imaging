/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package org.apache.commons.imaging.formats.wbmp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.ImagingException;

public abstract class AbstractWbmpTest extends AbstractImagingTest {
    private static final ImageFilter IMAGE_FILTER = AbstractWbmpTest::isWbmp;

    private static boolean isWbmp(final File file) {
        return file.getName().toLowerCase().endsWith(".wbmp");
    }

    protected List<File> getWbmpImages() throws IOException, ImagingException {
        return getTestImages(IMAGE_FILTER);
    }
}
