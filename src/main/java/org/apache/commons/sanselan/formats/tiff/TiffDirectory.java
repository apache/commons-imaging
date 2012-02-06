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
package org.apache.commons.sanselan.formats.tiff;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.formats.tiff.constants.TagInfo;
import org.apache.commons.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffTagConstants;

public class TiffDirectory extends TiffElement implements TiffConstants
//extends BinaryFileFunctions
{

    public String description()
    {
        return TiffDirectory.description(type);
    }

    public String getElementDescription(boolean verbose)
    {
        if (!verbose)
            return "TIFF Directory (" + description() + ")";

        int entryOffset = offset + TIFF_DIRECTORY_HEADER_LENGTH;

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < entries.size(); i++)
        {
            TiffField entry = entries.get(i);

            result.append("\t");
            result.append("[" + entryOffset + "]: ");
            result.append(entry.tagInfo.name);
            result.append(" (" + entry.tag + ", 0x"
                    + Integer.toHexString(entry.tag) + ")");
            result.append(", " + entry.fieldType.name);
            result.append(", " + entry.fieldType.getRawBytes(entry).length);
            result.append(": " + entry.getValueDescription());

            result.append("\n");

            entryOffset += TIFF_ENTRY_LENGTH;
            //            entry.fillInValue(byteSource);
        }
        return result.toString();
    }

    public static final String description(int type)
    {
        switch (type)
        {
            case DIRECTORY_TYPE_UNKNOWN :
                return "Unknown";
            case DIRECTORY_TYPE_ROOT :
                return "Root";
            case DIRECTORY_TYPE_SUB :
                return "Sub";
            case DIRECTORY_TYPE_THUMBNAIL :
                return "Thumbnail";
            case DIRECTORY_TYPE_EXIF :
                return "Exif";
            case DIRECTORY_TYPE_GPS :
                return "Gps";
            case DIRECTORY_TYPE_INTEROPERABILITY :
                return "Interoperability";
            default :
                return "Bad Type";
        }
    }

    public final int type;
    public final List<TiffField> entries;
    //    public final int offset;
    public final int nextDirectoryOffset;

    public TiffDirectory(int type, List<TiffField> entries, final int offset,
            int nextDirectoryOffset)
    {
        super(offset, TIFF_DIRECTORY_HEADER_LENGTH + entries.size()
                * TIFF_ENTRY_LENGTH + TIFF_DIRECTORY_FOOTER_LENGTH);

        this.type = type;
        this.entries = entries;
        this.nextDirectoryOffset = nextDirectoryOffset;
    }

    public List<TiffField> getDirectoryEntrys()
    {
        return new ArrayList<TiffField>(entries);
    }

    public void dump()
    {
        for (int i = 0; i < entries.size(); i++)
        {
            TiffField entry = entries.get(i);
            entry.dump();
        }

    }

    public boolean hasJpegImageData() throws ImageReadException
    {
        if (null != findField(TiffTagConstants.JPEG_INTERCHANGE_FORMAT.tagInfo))
            return true;

        return false;
    }

    public boolean hasTiffImageData() throws ImageReadException
    {
        if (null != findField(TiffTagConstants.TILE_OFFSETS.tagInfo))
            return true;

        if (null != findField(TiffTagConstants.STRIP_OFFSETS.tagInfo))
            return true;

        return false;
    }

    public BufferedImage getTiffImage() throws ImageReadException, IOException
    {
        Map params = null;
        return getTiffImage(params);
    }

    public BufferedImage getTiffImage(Map params) throws ImageReadException,
            IOException
    {
        if (null == tiffImageData)
            return null;

        return new TiffImageParser().getBufferedImage(this, params);
    }

    public TiffField findField(TagInfo tag) throws ImageReadException
    {
        boolean failIfMissing = false;
        return findField(tag, failIfMissing);
    }

    public TiffField findField(TagInfo tag, boolean failIfMissing)
            throws ImageReadException
    {
        if (entries == null)
            return null;

        for (int i = 0; i < entries.size(); i++)
        {
            TiffField field = entries.get(i);
            if (field.tag == tag.tag)
                return field;
        }

        if (failIfMissing)
            throw new ImageReadException("Missing expected field: "
                    + tag.getDescription());

        return null;
    }

    public final class ImageDataElement extends TiffElement
    {
        public ImageDataElement(int offset, int length)
        {
            super(offset, length);
        }

        public String getElementDescription(boolean verbose)
        {
            if (verbose)
                return null;
            return "ImageDataElement";
        }
    }

    private List<ImageDataElement> getRawImageDataElements(TiffField offsetsField,
            TiffField byteCountsField) throws ImageReadException
    {
        int offsets[] = offsetsField.getIntArrayValue();
        int byteCounts[] = byteCountsField.getIntArrayValue();

        if (offsets.length != byteCounts.length)
            throw new ImageReadException("offsets.length(" + offsets.length
                    + ") != byteCounts.length(" + byteCounts.length + ")");

        List<ImageDataElement> result = new ArrayList<ImageDataElement>();
        for (int i = 0; i < offsets.length; i++)
        {
            result.add(new ImageDataElement(offsets[i], byteCounts[i]));
        }
        return result;
    }

    public List<ImageDataElement> getTiffRawImageDataElements() throws ImageReadException
    {
        TiffField tileOffsets = findField(TiffTagConstants.TILE_OFFSETS.tagInfo);
        TiffField tileByteCounts = findField(TiffTagConstants.TILE_BYTE_COUNTS.tagInfo);
        TiffField stripOffsets = findField(TiffTagConstants.STRIP_OFFSETS.tagInfo);
        TiffField stripByteCounts = findField(TiffTagConstants.STRIP_BYTE_COUNTS.tagInfo);

        if ((tileOffsets != null) && (tileByteCounts != null))
        {
            return getRawImageDataElements(tileOffsets, tileByteCounts);
        }
        else if ((stripOffsets != null) && (stripByteCounts != null))
        {
            return getRawImageDataElements(stripOffsets, stripByteCounts);
        }
        else
            throw new ImageReadException("Couldn't find image data.");
    }

    public boolean imageDataInStrips() throws ImageReadException
    {
        TiffField tileOffsets = findField(TiffTagConstants.TILE_OFFSETS.tagInfo);
        TiffField tileByteCounts = findField(TiffTagConstants.TILE_BYTE_COUNTS.tagInfo);
        TiffField stripOffsets = findField(TiffTagConstants.STRIP_OFFSETS.tagInfo);
        TiffField stripByteCounts = findField(TiffTagConstants.STRIP_BYTE_COUNTS.tagInfo);

        if ((tileOffsets != null) && (tileByteCounts != null))
            return false;
        else if ((stripOffsets != null) && (stripByteCounts != null))
            return true;
        else if ((stripOffsets != null) && (stripByteCounts != null))
            return true;
        else
            throw new ImageReadException("Couldn't find image data.");
    }

    public ImageDataElement getJpegRawImageDataElement()
            throws ImageReadException
    {
        TiffField jpegInterchangeFormat = findField(TiffTagConstants.JPEG_INTERCHANGE_FORMAT.tagInfo);
        TiffField jpegInterchangeFormatLength = findField(TiffTagConstants.JPEG_INTERCHANGE_FORMAT_LENGTH.tagInfo);

        if ((jpegInterchangeFormat != null)
                && (jpegInterchangeFormatLength != null))
        {
            int offset = jpegInterchangeFormat.getIntArrayValue()[0];
            int byteCount = jpegInterchangeFormatLength.getIntArrayValue()[0];

            return new ImageDataElement(offset, byteCount);
        }
        else
            throw new ImageReadException("Couldn't find image data.");
    }

    private TiffImageData tiffImageData = null;

    public void setTiffImageData(TiffImageData rawImageData)
    {
        this.tiffImageData = rawImageData;
    }

    public TiffImageData getTiffImageData()
    {
        return tiffImageData;
    }

    private JpegImageData jpegImageData = null;

    public void setJpegImageData(JpegImageData value)
    {
        this.jpegImageData = value;
    }

    public JpegImageData getJpegImageData()
    {
        return jpegImageData;
    }

}
