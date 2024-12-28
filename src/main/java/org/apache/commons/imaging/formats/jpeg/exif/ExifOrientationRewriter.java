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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.ArrayList;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffHeader;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

public class ExifOrientationRewriter {

    public enum Orientation {
        HORIZONTAL((short)1),
        MIRROR_HORIZONTAL((short)2),
        ROTATE_180((short)3),
        MIRROR_VERTICAL((short)4),
        MIRROR_HORIZONTAL_AND_ROTATE_270((short)5),
        ROTATE_90((short)6),
        MIRROR_HORIZONTAL_AND_ROTATE_90((short)7),
        ROTATE_270((short)8);

        private short val;

        Orientation(short orVal) {
            this.val = orVal;
        }

        public short getVal() {
            return val;
        }
    }

    private ByteSource fileSrc;

    public ExifOrientationRewriter(File imageFile) {
        fileSrc = ByteSource.file(imageFile);
    }
    public ExifOrientationRewriter(byte[] byteArray) {
        fileSrc = ByteSource.array(byteArray);
    }
    public ExifOrientationRewriter(ByteSource byteSource) {
        fileSrc = byteSource;
    }

    /***
     * Get the orientation (enum) of the current image
     * Returns horizontal by default
     * @return Orientation enum
     * @throws IOException
     * @throws ImagingException
     */
    public Orientation getExifOrientation() throws IOException {

        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(this.fileSrc.);

        if (metadata == null) {
            return Orientation.HORIZONTAL;
        }

        final TiffImageMetadata exifMetadata = metadata.getExif();

        if (exifMetadata == null) {
            return Orientation.HORIZONTAL;
        }

        final TiffOutputSet outputSet = exifMetadata.getOutputSet();

        TiffOutputDirectory tod = outputSet.getRootDirectory();
        if (tod == null) {
            return Orientation.HORIZONTAL;
        }

        TiffOutputField tof = tod.findField(TiffTagConstants.TIFF_TAG_ORIENTATION);
        if (tof == null) {
            return Orientation.HORIZONTAL;
        }

        short imageOrientationVal = (short) exifMetadata.getFieldValue(TiffTagConstants.TIFF_TAG_ORIENTATION);

        for (Orientation orientation : Orientation.values()) {
            if(orientation.getVal() == imageOrientationVal) {
                return orientation;
            }
        }

        return Orientation.HORIZONTAL;
    }

    /**
     * A method that sets a new value to the orientation field in the EXIF metadata of a JPEG file.
     * @param orientation the value as a enum of the direction to set as the new EXIF orientation
     */
    public void setExifOrientation(Orientation orientation) throws IOException {

        JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(this.fileSrc.getAll());

        if (metadata == null) {
            metadata = new JpegImageMetadata(null, new TiffImageMetadata(new TiffContents(new TiffHeader(ByteOrder.BIG_ENDIAN, 0, 0, false), new ArrayList<>(), new ArrayList<>())));
        }

        TiffImageMetadata exifMetadata = metadata.getExif();

        if (exifMetadata == null) {
            exifMetadata = new TiffImageMetadata(new TiffContents(new TiffHeader(ByteOrder.BIG_ENDIAN, 0, 0, false), new ArrayList<>(), new ArrayList<>()));
        }

        final TiffOutputSet outputSet = exifMetadata.getOutputSet();

        TiffOutputDirectory tod =  outputSet.getOrCreateRootDirectory();
        tod.removeField(TiffTagConstants.TIFF_TAG_ORIENTATION);
        tod.add(TiffTagConstants.TIFF_TAG_ORIENTATION, orientation.getVal());

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossy(this.fileSrc, baos, outputSet);

        this.fileSrc = ByteSource.array(baos.toByteArray());
    }

    /**
     * @return the ByteSource of the current file
     */
    public ByteSource getOutput() {
        return fileSrc;
    }

    /**
     *  Writes Bytesource to file with given path
     * @param path String of the path in which the file is written
     * @throws IOException
     */
    public void getOutput(String path)
        throws IOException {
        final File tempFile =  new File(path);
        try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
            outputStream.write(fileSrc.getByteArray(0, fileSrc.size()));
        }
    }

}
