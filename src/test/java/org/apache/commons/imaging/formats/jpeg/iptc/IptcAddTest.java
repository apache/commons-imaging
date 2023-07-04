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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class IptcAddTest extends IptcBaseTest {

    public static Stream<File> data() throws Exception {
        return getJpegImages().stream();
    }

    /*
         * Add a few IPTC values to JPEG images, whether or not they have existing
         * IPTC data.
         */
    @ParameterizedTest
    @MethodSource("data")
    public void testAddIptcData(final File imageFile) throws Exception {
        final ByteSource byteSource = ByteSource.file(imageFile);

        final JpegImagingParameters params = new JpegImagingParameters();

        final JpegPhotoshopMetadata metadata = new JpegImageParser().getPhotoshopMetadata(byteSource, params);
        if (metadata == null) {
            // FIXME select only files with meta for this test
            return;
        }

        final List<IptcBlock> newBlocks = new ArrayList<>(metadata.photoshopApp13Data.getNonIptcBlocks());
        final List<IptcRecord> oldRecords = metadata.photoshopApp13Data.getRecords();

        final List<IptcRecord> newRecords = new ArrayList<>();
        for (final IptcRecord record : oldRecords) {
            if (record.iptcType != IptcTypes.CITY
                    && record.iptcType != IptcTypes.CREDIT) {
                newRecords.add(record);
            }
        }

        newRecords.add(new IptcRecord(IptcTypes.CITY, "Albany, NY"));
        newRecords.add(new IptcRecord(IptcTypes.CREDIT, "William Sorensen"));

        final PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords, newBlocks);

        byte[] bytes;
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            new JpegIptcRewriter().writeIptc(byteSource, os, newData);
            bytes = os.toByteArray();
        }

        final ByteSource updateByteSource = ByteSource.array(bytes, "test.jpg");
        final JpegPhotoshopMetadata outMetadata = new JpegImageParser().getPhotoshopMetadata(
                updateByteSource, params);

        assertNotNull(outMetadata);
        assertEquals(outMetadata.getItems().size(), newRecords.size());
    }
}
