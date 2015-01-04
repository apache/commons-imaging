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

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.junit.Test;

public class MicrosoftTagTest extends ExifBaseTest {
    private static final String AUTHOR = "author";
    private static final String COMMENT = "comment";
    private static final String SUBJECT = "subject";
    private static final String TITLE = "title";

    @Test
    public void testWrite() throws Exception {
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        final TiffOutputSet exifSet = new TiffOutputSet();
        final TiffOutputDirectory exif = exifSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, AUTHOR);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, COMMENT);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, SUBJECT);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, TITLE);
        final Map<String, Object> params = new TreeMap<String, Object>();
        params.put(TiffConstants.PARAM_KEY_EXIF, exifSet);
        final byte[] bytes = Imaging.writeImageToBytes(image, ImageFormats.TIFF, params);
        checkFields(bytes);
    }
    
    private TiffImageMetadata toTiffMetadata(final ImageMetadata metadata) throws Exception {
        if (metadata instanceof JpegImageMetadata) {
            return ((JpegImageMetadata)metadata).getExif();
        } else if (metadata instanceof TiffImageMetadata) {
            return ((TiffImageMetadata)metadata);
        } else {
            throw new Exception("bad metadata format");
        }
    }

    @Test
    public void testRewrite() throws Exception {
        final File imageWithExif = getImageWithExifData();
        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(imageWithExif));
        final ExifRewriter rewriter = new ExifRewriter();
        final TiffOutputSet outputSet = metadata.getOutputSet();
        final TiffOutputDirectory exif = outputSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, AUTHOR);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, COMMENT);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, SUBJECT);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, TITLE);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        rewriter.updateExifMetadataLossy(imageWithExif, baos, outputSet);
        checkFields(baos.toByteArray());
    }
    
    private void checkFields(final byte[] file) throws Exception {
        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(file));
        assertEquals(AUTHOR, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR));
        assertEquals(COMMENT, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT));
        assertEquals(SUBJECT, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT));
        assertEquals(TITLE, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPTITLE));
    }
}
