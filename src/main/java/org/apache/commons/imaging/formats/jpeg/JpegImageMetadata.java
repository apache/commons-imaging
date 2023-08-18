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

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.AbstractTiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.internal.Debug;

public class JpegImageMetadata implements ImageMetadata {
    private static final String NEWLINE = System.lineSeparator();
    private final JpegPhotoshopMetadata photoshop;
    private final TiffImageMetadata exif;

    public JpegImageMetadata(final JpegPhotoshopMetadata photoshop,
            final TiffImageMetadata exif) {
        this.photoshop = photoshop;
        this.exif = exif;
    }

    public void dump() {
        Debug.debug(this.toString());
    }

    public TiffField findExifValue(final TagInfo tagInfo) {
        try {
            return exif != null ? exif.findField(tagInfo) : null;
        } catch (final ImagingException cannotHappen) {
            return null;
        }
    }

    public TiffField findExifValueWithExactMatch(final TagInfo tagInfo) {
        try {
            return exif != null ? exif.findField(tagInfo, true) : null;
        } catch (final ImagingException cannotHappen) {
            return null;
        }
    }

    public TiffImageMetadata getExif() {
        return exif;
    }

    /**
     * Get the thumbnail image if available.
     *
     * @return the thumbnail image. May be {@code null} if no image could
     *         be found.
     * @throws ImagingException if it fails to read the image
     * @throws IOException if it fails to get the thumbnail or to read the image data
     */
    public BufferedImage getExifThumbnail() throws ImagingException,
            IOException {

        if (exif == null) {
            return null;
        }

        final List<? extends ImageMetadataItem> dirs = exif.getDirectories();
        for (final ImageMetadataItem d : dirs) {
            final TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) d;
            // Debug.debug("dir", dir);
            BufferedImage image = dir.getThumbnail();
            if (null != image) {
                return image;
            }

            final JpegImageData jpegImageData = dir.getJpegImageData();
            if (jpegImageData != null) {
                // JPEG thumbnail as JPEG or other format; try to parse.
                boolean imageSucceeded = false;
                try {
                    image = Imaging.getBufferedImage(jpegImageData.getData());
                    imageSucceeded = true;
                } catch (final IOException ignored) { // NOPMD
                } finally {
                    // our JPEG reading is still a bit buggy -
                    // fall back to ImageIO on error
                    if (!imageSucceeded) {
                        final ByteArrayInputStream input = new ByteArrayInputStream(
                                jpegImageData.getData());
                        image = ImageIO.read(input);
                    }
                }
                if (image != null) {
                    return image;
                }
            }
        }

        return null;
    }

    /**
     * Returns the data of the first JPEG thumbnail found in the EXIF metadata.
     *
     * @return JPEG data or null if no thumbnail.
     */
    public byte[] getExifThumbnailData() {
        if (exif == null) {
            return null;
        }
        final List<? extends ImageMetadataItem> dirs = exif.getDirectories();
        for (final ImageMetadataItem d : dirs) {
            final TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) d;

            byte[] data = null;
            if (dir.getJpegImageData() != null) {
                data = dir.getJpegImageData().getData();
            }
            // Support other image formats here.

            if (data != null) {
                // already cloned, safe to return this copy
                return data;
            }
        }
        return null;
    }

    /**
     * Returns the size of the first JPEG thumbnail found in the EXIF metadata.
     *
     * @return Thumbnail width and height or null if no thumbnail.
     * @throws ImagingException if it fails to read the image
     * @throws IOException if it fails to read the image size
     */
    public Dimension getExifThumbnailSize() throws ImagingException,
            IOException {
        final byte[] data = getExifThumbnailData();

        if (data != null) {
            return Imaging.getImageSize(data);
        }
        return null;
    }

    @Override
    public List<ImageMetadataItem> getItems() {
        final List<ImageMetadataItem> result = new ArrayList<>();

        if (null != exif) {
            result.addAll(exif.getItems());
        }

        if (null != photoshop) {
            result.addAll(photoshop.getItems());
        }

        return result;
    }

    public JpegPhotoshopMetadata getPhotoshop() {
        return photoshop;
    }

    public AbstractTiffImageData getRawImageData() {
        if (exif == null) {
            return null;
        }
        final List<? extends ImageMetadataItem> dirs = exif.getDirectories();
        for (final ImageMetadataItem d : dirs) {
            final TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) d;
            // Debug.debug("dir", dir);
            final AbstractTiffImageData rawImageData = dir.getTiffImageData();
            if (null != rawImageData) {
                return rawImageData;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return toString(null);
    }

    @Override
    public String toString(String prefix) {
        if (prefix == null) {
            prefix = "";
        }

        final StringBuilder result = new StringBuilder();

        result.append(prefix);
        if (null == exif) {
            result.append("No Exif metadata.");
        } else {
            result.append("Exif metadata:");
            result.append(NEWLINE);
            result.append(exif.toString("\t"));
        }

        // if (null != exif && null != photoshop)
        result.append(NEWLINE);

        result.append(prefix);
        if (null == photoshop) {
            result.append("No Photoshop (IPTC) metadata.");
        } else {
            result.append("Photoshop (IPTC) metadata:");
            result.append(NEWLINE);
            result.append(photoshop.toString("\t"));
        }

        return result.toString();
    }

}
