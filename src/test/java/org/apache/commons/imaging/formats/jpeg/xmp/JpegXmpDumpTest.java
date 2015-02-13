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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.formats.jpeg.xmp;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.Collection;
import org.apache.commons.imaging.ImagingParameters;

import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JpegXmpDumpTest extends JpegXmpBaseTest {

    private final File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return getImagesWithXmpData();
    }

    public JpegXmpDumpTest(File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void test() throws Exception {
        final ByteSource byteSource = new ByteSourceFile(imageFile);
        final ImagingParameters params = new ImagingParameters();
        final String xmpXml = new JpegImageParser().getXmpXml(byteSource, params);

        // TODO assert more
        assertNotNull(xmpXml);
    }

}
