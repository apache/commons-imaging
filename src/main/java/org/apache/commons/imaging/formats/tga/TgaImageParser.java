package org.apache.commons.imaging.formats.tga;

///*
// * Licensed to the Apache Software Foundation (ASF) under one or more
// * contributor license agreements.  See the NOTICE file distributed with
// * this work for additional information regarding copyright ownership.
// * The ASF licenses this file to You under the Apache License, Version 2.0
// * (the "License"); you may not use this file except in compliance with
// * the License.  You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package org.apache.commons.imaging.formats.tga;
//
//import java.awt.Dimension;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.util.Map;
//import java.util.ArrayList;
//
//import org.apache.commons.imaging.ImageFormat;
//import org.apache.commons.imaging.ImageInfo;
//import org.apache.commons.imaging.ImageParser;
//import org.apache.commons.imaging.ImageReadException;
//import org.apache.commons.imaging.common.IImageMetadata;
//import org.apache.commons.imaging.common.bytesource.ByteSource;
//import org.apache.commons.imaging.util.Debug;
//
///*
// * This class is just a placeholder.  TGA format is not yet supported.
// */
//public class TgaImageParser extends ImageParser implements TgaConstants
//{
//    public TgaImageParser()
//    {
//        this.setByteOrder(BYTE_ORDER_INTEL);
//        setDebug(true);
//    }
//
//    public String getName()
//    {
//        return "Tga";
//    }
//
//    public String getDefaultExtension()
//    {
//        return DEFAULT_EXTENSION;
//    }
//
//    private static final String DEFAULT_EXTENSION = ".tga";
//
//    private static final String[] ACCEPTED_EXTENSIONS = {
//            ".tga", ".tpic",
//    };
//
//    protected String[] getAcceptedExtensions()
//    {
//        return ACCEPTED_EXTENSIONS;
//    }
//
//    protected ImageFormat[] getAcceptedTypes()
//    {
//        return new ImageFormat[]{
//            ImageFormat.IMAGE_FORMAT_TGA, //
//        };
//    }
//
//    public IImageMetadata getMetadata(ByteSource byteSource, Map params)
//            throws ImageReadException, IOException
//    {
//        return null;
//    }
//
//    public byte[] getICCProfileBytes(ByteSource byteSource)
//            throws ImageReadException, IOException
//    {
//        return null;
//    }
//
//    private static final int TGA_FILE_HEADER_LENGTH = 18;
//
//    public Dimension getImageSize(ByteSource byteSource)
//            throws ImageReadException, IOException
//    {
////        int length = (int) byteSource.getLength();
////        if (length < TGA_FILE_HEADER_LENGTH)
////            return null;
//
//        InputStream is = byteSource.getInputStream();
//
//        is.skip(12);
//
//        int width = this.read2Bytes("image width", is, "image width");
//        int height = this.read2Bytes("image height", is, "image height");
//
//        return new Dimension(width, height);
//    }
//
//    private static final int TGA_FILE_FOOTER_LENGTH = 26;
//    private static final String TGA_FILE_FOOTER_SIGNATURE = "TRUEVISION-XFILE";
//
//    private final boolean isNewTGAFormat(ByteSource byteSource)
//            throws ImageReadException, IOException
//    {
//        int length = (int) byteSource.getLength();
//        if (length < TGA_FILE_FOOTER_LENGTH)
//            return true;
//
//        InputStream is = byteSource.getInputStream(length
//                - TGA_FILE_FOOTER_LENGTH);
//
//        byte bytes[] = this.readByteArray("tga_file_footer",
//                TGA_FILE_FOOTER_LENGTH, is, "tga_file_footer");
//
//        Debug.debug("bytes", bytes);
//
//        Debug.debug("kTGA_FILE_FOOTER_SIGNATURE", TGA_FILE_FOOTER_SIGNATURE);
//        Debug.debug("kTGA_FILE_FOOTER_SIGNATURE", TGA_FILE_FOOTER_SIGNATURE
//                .length());
//
//        return this.compareByteArrays(bytes, 8, TGA_FILE_FOOTER_SIGNATURE
//                .getBytes(), 0, TGA_FILE_FOOTER_SIGNATURE.length());
//    }
//
//    private static final int TGA_IMAGE_TYPE_NO_IMAGE = 0;
//    private static final int UNCOMPRESSED_COLOR_MAPPED = 1;
//    private static final int UNCOMPRESSED_RGB = 2;
//    private static final int UNCOMPRESSED_BLACK_AND_WHITE = 3;
//    private static final int COMPRESSED_COLOR_MAPPED_RLE = 9;
//    private static final int COMPRESSED_RGB_RLE = 10;
//    private static final int COMPRESSED_BLACK_AND_WHITE = 11;
//    private static final int COMPRESSED_COLOR_MAPPED_DATA_HUFFMAN_DELTA_RLE = 32;
//    private static final int COMPRESSED_COLOR_MAPPED_DATA_RLE = 33;
//
//    public ImageInfo getImageInfo(ByteSource byteSource)
//            throws ImageReadException, IOException
//    {
////        int length = (int) byteSource.getLength();
////        if (length < TGA_FILE_HEADER_LENGTH)
////            return null;
//
//        InputStream is = byteSource.getInputStream();
//
//        int id_string_length = this.readByte("id_string_length", is,
//                "id_string_length");
//        int color_map_type = this.readByte("color_map_type", is,
//                "color_map_type");
//        int image_type = this.readByte("image_type", is, "image_type");
//
//        int color_map_first_entry_index = this.read2Bytes(
//                "color_map_first_entry_index", is,
//                "color_map_first_entry_index");
//        int color_map_length = this.read2Bytes("color_map_length", is,
//                "color_map_length");
//        int color_map_entry_size = this.readByte("color_map_entry_size", is,
//                "color_map_entry_size");
//
//        int origin_x = this.read2Bytes("origin_x", is, "origin_x");
//        int origin_y = this.read2Bytes("origin_y", is, "origin_y");
//
//        int width = this.read2Bytes("image width", is, "image width");
//        int height = this.read2Bytes("image height", is, "image height");
//
//        int pixel_depth = this.readByte("pixel_depth", is, "pixel_depth");
//        int image_descriptor = this.readByte("image_descriptor", is,
//                "image_descriptor");
//        // charles
//
//        switch (image_type)
//        {
//            case UNCOMPRESSED_COLOR_MAPPED :
//                break;
//            case UNCOMPRESSED_RGB :
//                break;
//            case UNCOMPRESSED_BLACK_AND_WHITE :
//                break;
//            case COMPRESSED_COLOR_MAPPED_RLE :
//                break;
//            case COMPRESSED_RGB_RLE :
//                break;
//            case COMPRESSED_BLACK_AND_WHITE :
//                break;
//            case COMPRESSED_COLOR_MAPPED_DATA_HUFFMAN_DELTA_RLE :
//                break;
//            case COMPRESSED_COLOR_MAPPED_DATA_RLE :
//                break;
//
//            default :
//
//        }
//        String FormatDetails;
//        int BitsPerPixel;
//        List Comments;
//        ImageFormat Format = ImageFormat.IMAGE_FORMAT_TGA;
//        String FormatName = Format.name;
//        String MimeType = "image/tga";
//        int NumberOfImages = 1; // charles could have thumbnail(s).
//        int PhysicalHeightDpi;
//        float PhysicalHeightInch;
//        int PhysicalWidthDpi;
//        float PhysicalWidthInch;
//        boolean isProgressive = false;
//        boolean isTransparent = pixel_depth > 24;
//        boolean usesPalette;
//        int ColorType;
//
//        return null;
//        //        return new ImageInfo(FormatDetails, BitsPerPixel, Comments, Format,
//        //                FormatName, height, MimeType, NumberOfImages,
//        //                PhysicalHeightDpi, PhysicalHeightInch, PhysicalWidthDpi,
//        //                PhysicalWidthInch, width, isProgressive, isTransparent,
//        //                usesPalette, ColorType);
//
//        //        boolean is_new_tga_format = isNewTGAFormat(byteSource);
//        //
//        //        Debug.debug("is_new_tga_format", is_new_tga_format);
//    }
//
//    public boolean dumpImageFile(PrintWriter pw, ByteSource byteSource)
//            throws ImageReadException, IOException
//    {
//        return false;
//    }
//
//    public BufferedImage getBufferedImage(ByteSource byteSource, Map params)
//            throws ImageReadException, IOException
//    {
//        return null;
//    }
//
//    //    public void writeImage(BufferedImage src, OutputStream os, Map params)
//    //            throws ImageWriteException, IOException
//    //    {
//    //        return false;
//    //    }
//
// }
