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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.util.Debug;

public class JpegImageMetadata implements IImageMetadata {
    private final JpegPhotoshopMetadata photoshop;
    private final TiffImageMetadata exif;

    public JpegImageMetadata(final JpegPhotoshopMetadata photoshop,
            final TiffImageMetadata exif) {
        this.photoshop = photoshop;
        this.exif = exif;
    }

    public TiffImageMetadata getExif() {
        return exif;
    }

    public JpegPhotoshopMetadata getPhotoshop() {
        return photoshop;
    }

    public TiffField findEXIFValue(TagInfo tagInfo) {
        try {
            if (exif != null) {
                return exif.findField(tagInfo);
            } else {
                return null;
            }
        } catch (ImageReadException cannotHappen) {
            return null;
        }
    }

    public TiffField findEXIFValueWithExactMatch(TagInfo tagInfo) {
        try {
            if (exif != null) {
                return exif.findField(tagInfo, true);
            } else {
                return null;
            }
        } catch (ImageReadException cannotHappen) {
            return null;
        }
    }

    /**
     * Returns the size of the first JPEG thumbnail found in the EXIF metadata.
     * 
     * @return Thumbnail width and height or null if no thumbnail.
     * @throws ImageReadException
     * @throws IOException
     */
    public Dimension getEXIFThumbnailSize() throws ImageReadException,
            IOException {
        byte[] data = getEXIFThumbnailData();

        if (data != null) {
            return Imaging.getImageSize(data);
        }
        return null;
    }

    /**
     * Returns the data of the first JPEG thumbnail found in the EXIF metadata.
     * 
     * @return JPEG data or null if no thumbnail.
     * @throws ImageReadException
     * @throws IOException
     */
    public byte[] getEXIFThumbnailData() throws ImageReadException, IOException {
        if (exif == null) {
            return null;
        }
        List<? extends IImageMetadataItem> dirs = exif.getDirectories();
        for (int i = 0; i < dirs.size(); i++) {
            TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) dirs
                    .get(i);

            byte[] data = null;
            if (dir.getJpegImageData() != null) {
                data = dir.getJpegImageData().data;
            }
            // Support other image formats here.

            if (data != null) {
                return data;
            }
        }
        return null;
    }

    /**
     * Get the thumbnail image if available.
     * 
     * @return the thumbnail image. May be <code>null</code> if no image could
     *         be found.
     * @throws ImageReadException
     * @throws IOException
     */
    public BufferedImage getEXIFThumbnail() throws ImageReadException,
            IOException {

        if (exif == null) {
            return null;
        }

        List<? extends IImageMetadataItem> dirs = exif.getDirectories();
        for (int i = 0; i < dirs.size(); i++) {
            TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) dirs
                    .get(i);
            // Debug.debug("dir", dir);
            BufferedImage image = dir.getThumbnail();
            if (null != image) {
                return image;
            }

            JpegImageData jpegImageData = dir.getJpegImageData();
            if (jpegImageData != null) {
                ByteArrayInputStream input = new ByteArrayInputStream(
                        jpegImageData.data);
                // JPEG thumbnail as JPEG or other format; try to parse.
                image = ImageIO.read(input);
                if (image != null) {
                    return image;
                }
            }
        }

        return null;
    }

    public TiffImageData getRawImageData() {
        if (exif == null) {
            return null;
        }
        List<? extends IImageMetadataItem> dirs = exif.getDirectories();
        for (int i = 0; i < dirs.size(); i++) {
            TiffImageMetadata.Directory dir = (TiffImageMetadata.Directory) dirs
                    .get(i);
            // Debug.debug("dir", dir);
            TiffImageData rawImageData = dir.getTiffImageData();
            if (null != rawImageData)
                return rawImageData;
        }

        return null;
    }

    public List<IImageMetadataItem> getItems() {
        List<IImageMetadataItem> result = new ArrayList<IImageMetadataItem>();

        if (null != exif)
            result.addAll(exif.getItems());

        if (null != photoshop)
            result.addAll(photoshop.getItems());

        return result;
    }

    private static final String newline = System.getProperty("line.separator");

    @Override
    public String toString() {
        return toString(null);
    }

    public String toString(String prefix) {
        if (prefix == null)
            prefix = "";

        StringBuilder result = new StringBuilder();

        result.append(prefix);
        if (null == exif)
            result.append("No Exif metadata.");
        else {
            result.append("Exif metadata:");
            result.append(newline);
            result.append(exif.toString("\t"));
        }

        // if (null != exif && null != photoshop)
        result.append(newline);

        result.append(prefix);
        if (null == photoshop)
            result.append("No Photoshop (IPTC) metadata.");
        else {
            result.append("Photoshop (IPTC) metadata:");
            result.append(newline);
            result.append(photoshop.toString("\t"));
        }

        return result.toString();
    }

    public void dump() {
        Debug.debug(this.toString());
    }

}
