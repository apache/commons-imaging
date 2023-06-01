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

package org.apache.commons.imaging.formats.tiff;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.apache.commons.imaging.ImagingFormatException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.junit.jupiter.api.Test;

/**
 * Tests Google oss-fuzz issue 53669.
 */
public class TiffImageParserTest {

    @Test
    public void testOssFuzzIssue53669() {
        assertThrows(ImagingFormatException.class,
                () -> new TiffImageParser().getBufferedImage(
                        ByteSource.file(new File(
                                "src/test/resources/images/tiff/oss-fuzz-53669/clusterfuzz-testcase-minimized-ImagingTiffFuzzer-5965016805539840.tiff")),
                        null));
    }
}
