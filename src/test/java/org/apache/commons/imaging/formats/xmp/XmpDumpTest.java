/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.xmp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.util.List;

import org.apache.commons.imaging.AbstractImagingTest;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.internal.Debug;
import org.junit.jupiter.api.Test;

class XmpDumpTest extends AbstractImagingTest {

    @Test
    void test() throws Exception {
        final List<File> images = getTestImages();
        for (final File imageFile : images) {

            if (imageFile.getName().toLowerCase().endsWith(".png") && isInvalidPngTestFile(imageFile)) {
                continue;
            }

            Debug.debug("imageFile", imageFile);
            Debug.debug();

            final String xmpXml = Imaging.getXmpXml(imageFile);
            if (null == xmpXml) {
                continue;
            }

            assertNotNull(xmpXml);

            Debug.debug("xmpXml: " + xmpXml);
            Debug.debug();
        }
    }

}
