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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */
package org.apache.commons.imaging.formats.dcx;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingParameters;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.pcx.PcxImageParser;
import org.apache.commons.imaging.util.IoUtils;

import static org.apache.commons.imaging.common.BinaryFunctions.*;

public class DcxImageParser extends ImageParser {
    // See http://www.fileformat.info/format/pcx/egff.htm for documentation
    private static final String DEFAULT_EXTENSION = ".dcx";
    private static final String[] ACCEPTED_EXTENSIONS = { ".dcx", };

    public DcxImageParser() {
        super.setByteOrder(ByteOrder.LITTLE_ENDIAN);
    }

    @Override
    public String getName() {
        return "Dcx-Custom";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] {
                ImageFormats.DCX, //
        };
    }

    // FIXME should throw UOE
    @Override
    public ImageMetadata getMetadata(final ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // FIXME should throw UOE
    @Override
    public ImageInfo getImageInfo(final ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // FIXME should throw UOE
    @Override
    public Dimension getImageSize(final ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    // FIXME should throw UOE
    @Override
    public byte[] getICCProfileBytes(final ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }

    private static class DcxHeader {

        public static final int DCX_ID = 0x3ADE68B1;
        public final int id;
        public final long[] pageTable;

        public DcxHeader(final int id, final long[] pageTable) {
            this.id = id;
            this.pageTable = pageTable;
        }

        public void dump(final PrintWriter pw) {
            pw.println("DcxHeader");
            pw.println("Id: 0x" + Integer.toHexString(id));
            pw.println("Pages: " + pageTable.length);
            pw.println();
        }
    }

    private DcxHeader readDcxHeader(final ByteSource byteSource)
            throws ImageReadException, IOException {
        InputStream is = null;
        boolean canThrow = false;
        try {
            is = byteSource.getInputStream();
            final int id = read4Bytes("Id", is, "Not a Valid DCX File", getByteOrder());
            final List<Long> pageTable = new ArrayList<Long>(1024);
            for (int i = 0; i < 1024; i++) {
                final long pageOffset = 0xFFFFffffL & read4Bytes("PageTable", is,
                        "Not a Valid DCX File", getByteOrder());
                if (pageOffset == 0) {
                    break;
                }
                pageTable.add(pageOffset);
            }

            if (id != DcxHeader.DCX_ID) {
                throw new ImageReadException(
                        "Not a Valid DCX File: file id incorrect");
            }
            if (pageTable.size() == 1024) {
                throw new ImageReadException(
                        "DCX page table not terminated by zero entry");
            }

            final Object[] objects = pageTable.toArray();
            final long[] pages = new long[objects.length];
            for (int i = 0; i < objects.length; i++) {
                pages[i] = ((Long) objects[i]);
            }

            final DcxHeader ret = new DcxHeader(id, pages);
            canThrow = true;
            return ret;
        } finally {
            IoUtils.closeQuietly(canThrow, is);
        }
    }

    @Override
    public boolean dumpImageFile(final PrintWriter pw, final ByteSource byteSource)
            throws ImageReadException, IOException {
        readDcxHeader(byteSource).dump(pw);
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(final ByteSource byteSource,
            final ImagingParameters params) throws ImageReadException, IOException {
        final List<BufferedImage> list = getAllBufferedImages(byteSource);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(final ByteSource byteSource)
            throws ImageReadException, IOException {
        final DcxHeader dcxHeader = readDcxHeader(byteSource);
        final List<BufferedImage> images = new ArrayList<BufferedImage>();
        final PcxImageParser pcxImageParser = new PcxImageParser();
        for (final long element : dcxHeader.pageTable) {
            InputStream stream = null;
            boolean canThrow = false;
            try {
                stream = byteSource.getInputStream(element);
                final ByteSourceInputStream pcxSource = new ByteSourceInputStream(
                        stream, null);
                final BufferedImage image = pcxImageParser.getBufferedImage(
                        pcxSource, new HashMap<String, Object>());
                images.add(image);
                canThrow = true;
            } finally {
                IoUtils.closeQuietly(canThrow, stream);
            }
        }
        return images;
    }

    @Override
    public void writeImage(final BufferedImage src, final OutputStream os, final ImagingParameters params)
            throws ImageWriteException, IOException {
        
        // ensure that the parameter object is not null
        final ImagingParameters pcxParams = (params == null) ? new ImagingParameters() : params;

        final int headerSize = 4 + 1024 * 4;

        final BinaryOutputStream bos = new BinaryOutputStream(os,
                ByteOrder.LITTLE_ENDIAN);
        bos.write4Bytes(DcxHeader.DCX_ID);
        // Some apps may need a full 1024 entry table
        bos.write4Bytes(headerSize);
        for (int i = 0; i < 1023; i++) {
            bos.write4Bytes(0);
        }
        final PcxImageParser pcxImageParser = new PcxImageParser();
        pcxImageParser.writeImage(src, bos, pcxParams);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in ImagingConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     * @throws org.apache.commons.imaging.ImageReadException
     * @throws java.io.IOException
     */
    @Override
    public String getXmpXml(final ByteSource byteSource, final ImagingParameters params)
            throws ImageReadException, IOException {
        return null;
    }
}
