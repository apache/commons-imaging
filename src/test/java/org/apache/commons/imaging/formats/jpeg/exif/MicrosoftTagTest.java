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

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

public class MicrosoftTagTest extends ExifBaseTest {
    private static final String author = "author";
    private static final String comment = "comment";
    private static final String subject = "subject";
    private static final String title = "title";

    public void testWrite() throws Exception {
        final BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        final TiffOutputSet exifSet = new TiffOutputSet();
        final TiffOutputDirectory exif = exifSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, author);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, comment);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, subject);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, title);
        final Map<String,Object> params = new TreeMap<String,Object>();
        params.put(TiffConstants.PARAM_KEY_EXIF, exifSet);
        final byte[] bytes = Imaging.writeImageToBytes(image, ImageFormat.IMAGE_FORMAT_TIFF, params);
        checkFields(bytes);
    }
    
    private TiffImageMetadata toTiffMetadata(final IImageMetadata metadata) throws Exception {
        if (metadata instanceof JpegImageMetadata) {
            return ((JpegImageMetadata)metadata).getExif();
        } else if (metadata instanceof TiffImageMetadata) {
            return ((TiffImageMetadata)metadata);
        } else {
            throw new Exception("bad metadata format");
        }
    }
    
    public void testRewrite() throws Exception {
        final File imageWithExif = getImageWithExifData();
        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(imageWithExif));
        final ExifRewriter rewriter = new ExifRewriter();
        final TiffOutputSet outputSet = metadata.getOutputSet();
        final TiffOutputDirectory exif = outputSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, author);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, comment);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, subject);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, title);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        rewriter.updateExifMetadataLossy(imageWithExif, baos, outputSet);
        checkFields(baos.toByteArray());
    }
    
    private void checkFields(final byte[] file) throws Exception {
        final TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(file));
        assertEquals(author, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR));
        assertEquals(comment, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT));
        assertEquals(subject, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT));
        assertEquals(title, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPTITLE));
       
    }
}
