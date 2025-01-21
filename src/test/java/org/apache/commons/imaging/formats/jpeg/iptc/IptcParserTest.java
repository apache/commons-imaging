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

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.GenericImageMetadata.GenericImageMetadataItem;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;
import org.apache.commons.imaging.formats.jpeg.JpegImagingParameters;
import org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata;
import org.apache.commons.imaging.test.TestResources;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Tests for the {#link {@link IptcParser} class.
 */
public class IptcParserTest {

    /**
     * Tests for IptcParser encoding support. See IMAGING-168 and pull request #124 for more.
     *
     * @throws IOException      when reading input
     * @throws ImagingException when parsing file
     */
    @Test
    public void testEncodingSupport() throws IOException, ImagingException {
        // NOTE: We use the JpegParser, so it will send only the block/segment that IptcParser needs for the test image
        final File file = TestResources.resourceToFile("/images/jpeg/iptc/IMAGING-168/111083453-c07f1880-851e-11eb-8b61-2757f7d934bf.jpg");
        final JpegImageParser parser = new JpegImageParser();
        final JpegImageMetadata metadata = (JpegImageMetadata) parser.getMetadata(file);
        final JpegPhotoshopMetadata photoshopMetadata = metadata.getPhotoshop();
        @SuppressWarnings("unchecked")
        final List<GenericImageMetadataItem> items = (List<GenericImageMetadataItem>) photoshopMetadata.getItems();
        final GenericImageMetadataItem thanksInMandarin = items.get(3);
        // converted the thank-you in chinese characters to unicode for comparison here
        assertArrayEquals("\u8c22\u8c22".getBytes(StandardCharsets.UTF_8), thanksInMandarin.getText().getBytes(StandardCharsets.UTF_8));
    }

    /**
     * Tests the correct encoding when writing IptcRecords with method {@link IptcParser#writeIptcBlock(List, boolean)}. <br />
     * The encoding has to be UTF-8, if either the parameter {@code forceUtf8Encoding} is set to true or if a value from the passed {@link IptcRecord} instances
     * cannot be represented in charset ISO-8859-1.
     *
     * @param value     the value to test
     * @param forceUtf8 if UTF-8 encoding should be forced
     *
     */
    @ParameterizedTest
    @CsvSource({ "äöü ÄÖÜß, true", "äöü ÄÖÜß €, true", "äöü ÄÖÜß, false", "äöü ÄÖÜß €, false" })
    public void testEncoding(final String value, final boolean forceUtf8) throws IOException {

        final IptcParser parser = new IptcParser();
        final List<IptcRecord> records = new ArrayList<>();
        records.add(new IptcRecord(IptcTypes.CAPTION_ABSTRACT, value));
        final Charset charset;

        //
        final byte[] actualBytes = parser.writeIptcBlock(records, forceUtf8);

        // Write prefix including (optional)
        final byte[] prefix;
        try (ByteArrayOutputStream envelopeRecordStream = new ByteArrayOutputStream();
                BinaryOutputStream bos = BinaryOutputStream.create(envelopeRecordStream, parser.getByteOrder())) {
            if (forceUtf8 || value.contains("€")) {
                // Either using UTF-8 is forced of the value contains € (which isn't a character defined in ISO-8859-1):
                bos.write(IptcConstants.IPTC_RECORD_TAG_MARKER);
                bos.write(IptcConstants.IPTC_ENVELOPE_RECORD_NUMBER);
                bos.write(90); // Constant for "Coded Character Set" record
                final byte[] codedCharset = { '\u001B', '%', 'G' };
                bos.write2Bytes(codedCharset.length);
                bos.write(codedCharset);
                charset = StandardCharsets.UTF_8;
            } else {
                // Use ISO-8859-1 as default charset
                charset = StandardCharsets.ISO_8859_1;
            }

            // Write version record
            bos.write(IptcConstants.IPTC_RECORD_TAG_MARKER);
            bos.write(IptcConstants.IPTC_APPLICATION_2_RECORD_NUMBER);
            bos.write(IptcTypes.RECORD_VERSION.type); // record version record
                                                      // type.
            bos.write2Bytes(2); // record version record size
            bos.write2Bytes(2); // record version value
            prefix = envelopeRecordStream.toByteArray();
        }

        final byte[] applicationRecord;
        try (ByteArrayOutputStream applicationRecordStream = new ByteArrayOutputStream();
                BinaryOutputStream bos = BinaryOutputStream.create(applicationRecordStream, parser.getByteOrder())) {
            bos.write(IptcConstants.IPTC_RECORD_TAG_MARKER);
            bos.write(IptcConstants.IPTC_APPLICATION_2_RECORD_NUMBER);
            bos.write(IptcTypes.CAPTION_ABSTRACT.type);
            final byte[] valueBytes = value.getBytes(charset);
            bos.write2Bytes(valueBytes.length);
            bos.write(valueBytes);
            applicationRecord = applicationRecordStream.toByteArray();
        }

        final byte[] actualPrefix = ArrayUtils.subarray(actualBytes, 0, prefix.length);
        final byte[] actualApplicationRecord = ArrayUtils.subarray(actualBytes, prefix.length, prefix.length + applicationRecord.length);

        assertArrayEquals(prefix, actualPrefix);
        assertArrayEquals(applicationRecord, actualApplicationRecord);
    }

    /**
     * Some block types (or Image Resource Blocks in Photoshop specification) have a recommendation to not be interpreted by parsers, as they are handled by
     * Photoshop in a special way, that varies by platform (e.g. Mac, Windows, etc).
     *
     * IMAGING-246 provided a test image with APP13 segments, with some of the block types, such as 1084. When the IptcParser is reading this block, the 4-bytes
     * length record may give a value that is larger than the block size.
     *
     * When such a case happens, the IptcParser fails with an exception, to avoid a memory error. To prevent that, the parser must be able to skip these blocks
     * that the specification says "It is recommended that you do not interpret or use this data".
     *
     * @throws IOException      when reading input
     * @throws ImagingException when parsing file
     * @see <a href="https://www.adobe.com/devnet-apps/photoshop/fileformatashtml/">Adobe Photoshop File Formats Specification</a>
     */
    @Test
    public void testSkipBlockTypes() throws ImagingException, IOException {
        final File imageFile = TestResources.resourceToFile("/images/jpeg/photoshop/IMAGING-246/FallHarvestKitKat_07610.jpg");
        final JpegImageMetadata metadata = (JpegImageMetadata) new JpegImageParser().getMetadata(ByteSource.file(imageFile), new JpegImagingParameters());
        final JpegPhotoshopMetadata photoshopMetadata = metadata.getPhotoshop();
        final PhotoshopApp13Data photoshopApp13Data = photoshopMetadata.photoshopApp13Data;
        final List<IptcBlock> blocks = photoshopApp13Data.getRawBlocks();
        assertEquals(2, blocks.size());
        for (final IptcBlock block : blocks) {
            if (block.getBlockType() == 1028 || block.getBlockType() == 1061) {
                // 0x0404 IPTC-NAA record
                // 0x0425 (Photoshop 7.0) Caption digest
                final byte[] data = block.getBlockData();
                assertTrue(data.length > 0);
            } else {
                fail("Unexpected block type found: " + block.getBlockType());
            }
        }
    }
}
