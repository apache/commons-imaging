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

package org.apache.commons.imaging.formats.jpeg;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.junit.jupiter.api.Test;

public class JpegImageParserTest {
    @Test
    public void JpegImageParserTest1() throws ImagingException, IOException {
        final ByteSource bytesource = ByteSource.array("".getBytes());
        final JpegImagingParameters parameters = null;
        final JpegImageParser parser = new JpegImageParser();
        assertThrows(
            ImagingException.class,
            () -> parser.getImageInfo(bytesource, parameters)
        );
    }
    @Test
    public void JpegImageParserTest2() throws ImagingException, IOException {
        final File f = new File("src/test/resources/images/jpeg/invalid/metadata_only.jpeg");
        final ByteSource bytesource = ByteSource.file(f);
        final JpegImagingParameters parameters = null;
        final JpegImageParser parser = new JpegImageParser();
        assertDoesNotThrow(
            () -> parser.getImageInfo(bytesource, parameters)
        );
    }
    @Test
    public void JpegImageParserTest3() throws ImagingException, IOException {
        final File f = new File("src/test/resources/images/jpeg/invalid/FallHarvestKitKat_cm.jpg");
        final ByteSource bytesource = ByteSource.file(f);
        final JpegImagingParameters parameters = null;
        final JpegImageParser parser = new JpegImageParser();
        assertDoesNotThrow(
            () -> parser.getImageInfo(bytesource, parameters)
        );
    }
    @Test
    public void JpegImageParserTest4() throws ImagingException, IOException {
        final File f = new File("src/test/resources/images/jpeg/invalid/FallHarvesetKitKat_no_density_units.jpg");
        final ByteSource bytesource = ByteSource.file(f);
        final JpegImagingParameters parameters = null;
        final JpegImageParser parser = new JpegImageParser();
        assertDoesNotThrow(
            () -> parser.getImageInfo(bytesource, parameters)
        );
    }
}
