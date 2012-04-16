package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

public class TagInfoAsciiOrByte extends TagInfo {
    public TagInfoAsciiOrByte(String name, int tag, int length, TiffDirectoryType directoryType) {
        super(name, tag, FIELD_TYPE_DESCRIPTION_ASCII_OR_BYTE, length, directoryType, false);
    }
}
