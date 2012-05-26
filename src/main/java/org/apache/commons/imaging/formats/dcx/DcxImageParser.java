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
package org.apache.commons.imaging.formats.dcx;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.pcx.PcxConstants;
import org.apache.commons.imaging.formats.pcx.PcxImageParser;

public class DcxImageParser extends ImageParser {
    // See http://www.fileformat.info/format/pcx/egff.htm for documentation

    public DcxImageParser() {
        super.setByteOrder(BYTE_ORDER_LSB);
    }

    @Override
    public String getName() {
        return "Dcx-Custom";
    }

    @Override
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    private static final String DEFAULT_EXTENSION = ".dcx";
    private static final String ACCEPTED_EXTENSIONS[] = { ".dcx", };

    @Override
    protected String[] getAcceptedExtensions() {
        return ACCEPTED_EXTENSIONS;
    }

    @Override
    protected ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[] { ImageFormat.IMAGE_FORMAT_DCX, //
        };
    }

    @Override
    public boolean embedICCProfile(File src, File dst, byte profile[]) {
        return false;
    }

    @Override
    public IImageMetadata getMetadata(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public ImageInfo getImageInfo(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public Dimension getImageSize(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    @Override
    public byte[] getICCProfileBytes(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }

    private static class DcxHeader {

        public static final int DCX_ID = 0x3ADE68B1;
        public final int id;
        public final int[] pageTable;

        public DcxHeader(final int id, int[] pageTable) {
            this.id = id;
            this.pageTable = pageTable;
        }

        public void dump(PrintWriter pw) {
            pw.println("DcxHeader");
            pw.println("Id: 0x" + Integer.toHexString(id));
            pw.println("Pages: " + pageTable.length);
            pw.println();
        }
    }

    private DcxHeader readDcxHeader(ByteSource byteSource)
            throws ImageReadException, IOException {
        InputStream is = null;
        try {
            is = byteSource.getInputStream();
            int id = read4Bytes("Id", is, "Not a Valid DCX File");
            List<Integer> pageTable = new ArrayList<Integer>(1024);
            for (int i = 0; i < 1024; i++) {
                int pageOffset = read4Bytes("PageTable", is,
                        "Not a Valid DCX File");
                if (pageOffset == 0)
                    break;
                pageTable.add(pageOffset);
            }

            if (id != DcxHeader.DCX_ID)
                throw new ImageReadException(
                        "Not a Valid DCX File: file id incorrect");
            if (pageTable.size() == 1024)
                throw new ImageReadException(
                        "DCX page table not terminated by zero entry");

            Object[] objects = pageTable.toArray();
            int[] pages = new int[objects.length];
            for (int i = 0; i < objects.length; i++)
                pages[i] = ((Integer) objects[i]).intValue();

            return new DcxHeader(id, pages);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException ignored) {
            }
        }
    }

    @Override
    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
            throws ImageReadException, IOException {
        readDcxHeader(byteSource).dump(pw);
        return true;
    }

    @Override
    public final BufferedImage getBufferedImage(ByteSource byteSource,
            Map params) throws ImageReadException, IOException {
        List<BufferedImage> list = getAllBufferedImages(byteSource);
        if (list.isEmpty())
            return null;
        return list.get(0);
    }

    @Override
    public List<BufferedImage> getAllBufferedImages(ByteSource byteSource)
            throws ImageReadException, IOException {
        DcxHeader dcxHeader = readDcxHeader(byteSource);
        List<BufferedImage> images = new ArrayList<BufferedImage>();
        PcxImageParser pcxImageParser = new PcxImageParser();
        for (int i = 0; i < dcxHeader.pageTable.length; i++) {
            InputStream stream = null;
            try {
                stream = byteSource.getInputStream(dcxHeader.pageTable[i]);
                ByteSourceInputStream pcxSource = new ByteSourceInputStream(
                        stream, null);
                BufferedImage image = pcxImageParser.getBufferedImage(
                        pcxSource, new HashMap());
                images.add(image);
            } finally {
                try {
                    if (stream != null)
                        stream.close();
                } catch (IOException ignored) {
                }
            }
        }
        return images;
    }

    @Override
    public void writeImage(BufferedImage src, OutputStream os, Map params)
            throws ImageWriteException, IOException {
        // make copy of params; we'll clear keys as we consume them.
        params = (params == null) ? new HashMap() : new HashMap(params);

        HashMap pcxParams = new HashMap();

        // clear format key.
        if (params.containsKey(PARAM_KEY_FORMAT)) {
            params.remove(PARAM_KEY_FORMAT);
        }

        if (params.containsKey(PcxConstants.PARAM_KEY_PCX_COMPRESSION)) {
            Object value = params
                    .remove(PcxConstants.PARAM_KEY_PCX_COMPRESSION);
            pcxParams.put(PcxConstants.PARAM_KEY_PCX_COMPRESSION, value);
        }

        if (params.size() > 0) {
            Object firstKey = params.keySet().iterator().next();
            throw new ImageWriteException("Unknown parameter: " + firstKey);
        }

        final int headerSize = 4 + 1024 * 4;

        BinaryOutputStream bos = new BinaryOutputStream(os,
                BinaryOutputStream.BYTE_ORDER_LITTLE_ENDIAN);
        bos.write4Bytes(DcxHeader.DCX_ID);
        // Some apps may need a full 1024 entry table
        bos.write4Bytes(headerSize);
        for (int i = 0; i < 1023; i++)
            bos.write4Bytes(0);
        PcxImageParser pcxImageParser = new PcxImageParser();
        pcxImageParser.writeImage(src, bos, pcxParams);
    }

    /**
     * Extracts embedded XML metadata as XML string.
     * <p>
     * 
     * @param byteSource
     *            File containing image data.
     * @param params
     *            Map of optional parameters, defined in SanselanConstants.
     * @return Xmp Xml as String, if present. Otherwise, returns null.
     */
    @Override
    public String getXmpXml(ByteSource byteSource, Map params)
            throws ImageReadException, IOException {
        return null;
    }
}
