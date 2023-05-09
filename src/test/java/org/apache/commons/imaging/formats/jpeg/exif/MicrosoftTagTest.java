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
package org.apache.commons.imaging.formats.jpeg.exif;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.jpeg.iptc.JpegIptcRewriter;
import org.apache.commons.imaging.formats.jpeg.xmp.JpegXmpRewriter;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.jupiter.api.Test;

public class MicrosoftTagTest extends ExifBaseTest {
    private static final String AUTHOR = "author";
    private static final String COMMENT = "comment";
    private static final String SUBJECT = "subject";
    private static final String TITLE = "title";

    private void checkFields(final byte[] file) throws Exception {
        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(file));

        // field values may be duplicated between directories, we have to check all
        final List<Object> authorValues = new ArrayList<>();
        final List<Object> commentValues = new ArrayList<>();
        final List<Object> subjectValues = new ArrayList<>();
        final List<Object> titleValues = new ArrayList<>();
        for (final TiffDirectory d : metadata.contents.directories) {
            titleValues.add(d.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPTITLE, false));
            authorValues.add(d.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, false));
            commentValues.add(d.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, false));
            subjectValues.add(d.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, false));
        }

        assertTrue(authorValues.contains(AUTHOR));
        assertTrue(commentValues.contains(COMMENT));
        assertTrue(subjectValues.contains(SUBJECT));
        assertTrue(titleValues.contains(TITLE));
    }

    private byte[] cleanImage(final File imageWithExif) throws ImageReadException, ImageWriteException, IOException {
        // Windows doesn't show XP tags if same-meaning tags exist in IPTC or XMP. Remove them:
        final ByteArrayOutputStream noXmp = new ByteArrayOutputStream();
        new JpegXmpRewriter().removeXmpXml(imageWithExif, noXmp);
        final ByteArrayOutputStream noXmpNoIptc = new ByteArrayOutputStream();
        new JpegIptcRewriter().removeIPTC(noXmp.toByteArray(), noXmpNoIptc);
        return noXmpNoIptc.toByteArray();
    }

    @Test
    public void testRewrite() throws Exception {
        final byte[] imageWithExif = cleanImage(getImageWithExifData());

        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(imageWithExif));
        final ExifRewriter rewriter = new ExifRewriter();
        final TiffOutputSet outputSet = metadata.getOutputSet();
        final TiffOutputDirectory root = outputSet.getOrCreateRootDirectory();

        // In Windows these will also hide XP fields:
        root.removeField(TiffTagConstants.TIFF_TAG_IMAGE_DESCRIPTION);
        root.removeField(TiffTagConstants.TIFF_TAG_ARTIST);

        // Duplicates can be a problem:
        root.removeField(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, AUTHOR);

        root.removeField(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, COMMENT);

        root.removeField(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, SUBJECT);

        root.removeField(MicrosoftTagConstants.EXIF_TAG_XPTITLE);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, TITLE);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        rewriter.updateExifMetadataLossy(imageWithExif, baos, outputSet);
        checkFields(baos.toByteArray());
    }

    @Test
    public void testWrite() throws Exception {
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        final TiffOutputSet exifSet = new TiffOutputSet();
        final TiffOutputDirectory root = exifSet.getOrCreateRootDirectory();
        root.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, AUTHOR);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, COMMENT);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, SUBJECT);
        root.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, TITLE);
        final TiffImagingParameters params = new TiffImagingParameters();
        params.setOutputSet(exifSet);
        final TiffImageParser tiffImageParser = new TiffImageParser();
        final byte[] bytes;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            tiffImageParser.writeImage(image, baos, params);
            bytes = baos.toByteArray();
        }
        checkFields(bytes);
    }

    private TiffImageMetadata toTiffMetadata(final ImageMetadata metadata) throws Exception {
        if (metadata instanceof JpegImageMetadata) {
            return ((JpegImageMetadata)metadata).getExif();
        }
        if (metadata instanceof TiffImageMetadata) {
            return ((TiffImageMetadata)metadata);
        }
        throw new Exception("bad metadata format");
    }
}
