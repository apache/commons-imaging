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

package org.apache.commons.imaging.formats.jpeg.iptc;

import org.apache.commons.imaging.ImagingTestConstants;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.fail;


@RunWith(Parameterized.class)
public class IptcCodedCharacterSetTest extends IptcBaseTest {

    private File imageFile;

    @Parameterized.Parameters
    public static Collection<File> data() throws Exception {
        return Collections.singleton(new File(ImagingTestConstants.TEST_IMAGE_FOLDER, "iptc/2/test.jpeg"));
    }

    public IptcCodedCharacterSetTest(File imageFile) {
        this.imageFile = imageFile;
    }

    @Test
    public void testCodedCharacterSet() throws Exception {
        byte[] bytePatternToCompare = new byte[]
                {-28,-68,-102,-26,-124,-113,-27,-83,-105};

        String requiredCaption = new String( bytePatternToCompare , "utf8");
        String metadataName = "Caption/Abstract";

        final ByteSource byteSource = new ByteSourceFile(imageFile);
        JpegImageParser jpegImageParser = new JpegImageParser();
        ImageMetadata metadata = jpegImageParser.getMetadata(byteSource, null);
        for (ImageMetadata.ImageMetadataItem item : metadata.getItems()) {
            String metadataVal = item.toString();
            String[] metadataKeyValuePair = metadataVal.split(":", 2);
            if (metadataKeyValuePair.length > 1 && metadataKeyValuePair[0].equalsIgnoreCase(metadataName) && !metadataKeyValuePair[1].trim().equals(requiredCaption)) {
                fail("metadata extraction failed");
            }
        }
    }
}
