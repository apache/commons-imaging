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

import java.io.*;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.jpeg.JpegUtils;

public class ExifOrientationRewriter {

    public static enum Orientation {
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
        fileSrc = new ByteSourceFile(imageFile);
    }
    public ExifOrientationRewriter(byte[] byteArray) {
        fileSrc = new ByteSourceArray(byteArray);
    }
    public ExifOrientationRewriter(ByteSource byteSource) {
        fileSrc = byteSource;
    }

    /***
     * Get the orientation (enum) of the current image
     * @return Orientation enum
     * @throws IOException
     * @throws ImageReadException
     * @throws ImageWriteException
     */
    public Orientation getExifOrientation() throws IOException, ImageReadException, ImageWriteException {

        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(this.fileSrc.getAll());
        final TiffImageMetadata exifMetadata = metadata.getExif();
        final TiffOutputSet outputSet = exifMetadata.getOutputSet();

        TiffOutputDirectory tod = outputSet.getRootDirectory();
        if (tod == null)
        {
            return Orientation.HORIZONTAL;      // default
        }

        TiffOutputField tof = tod.findField(TiffTagConstants.TIFF_TAG_ORIENTATION);
        if (tof == null)
        {
            return Orientation.HORIZONTAL;      // default
        }

        // cast int to short
        short imageOrientationVal = (short) exifMetadata.getFieldValue(TiffTagConstants.TIFF_TAG_ORIENTATION);

        for (Orientation orientation : Orientation.values()) {
            if(orientation.getVal() == imageOrientationVal)
                return orientation;
        }

        return Orientation.HORIZONTAL;
    }

    /**
     * A method that sets a new value to the orientation field in the EXIF metadata of a JPEG file.
     * @param orientation the value as a enum of the direction to set as the new EXIF orientation
     *
     */
    public void SetExifOrientation(Orientation orientation) throws ImageWriteException, IOException, ImageReadException {

        final JpegImageMetadata metadata = (JpegImageMetadata) Imaging.getMetadata(this.fileSrc.getAll());
        final TiffImageMetadata exifMetadata = metadata.getExif();


        final TiffOutputSet outputSet = exifMetadata.getOutputSet();

        TiffOutputDirectory tod =  outputSet.getOrCreateRootDirectory();
        tod.removeField(TiffTagConstants.TIFF_TAG_ORIENTATION);
        tod.add(TiffTagConstants.TIFF_TAG_ORIENTATION, orientation.getVal());

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        new ExifRewriter().updateExifMetadataLossy(this.fileSrc, baos, outputSet);

        this.fileSrc = new ByteSourceArray(baos.toByteArray());
    }

    /**
     * @return the ByteSource of the current file
     */
    public ByteSource getOutput() {
        return fileSrc;
    }

    /**
     * Assigns the ByteSource of the current file in the form of a byte array 
     * @param byteArrayIn byteArray which is assigned the source of the file
     * @throws IOException
     */
    public void getOutput(byte[] byteArrayIn) 
        throws IOException {
        byteArrayIn = fileSrc.getAll();
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
            outputStream.write(fileSrc.getAll());
        }
    }

}
