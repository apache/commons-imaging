package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

public class TagInfoAsciiOrRational extends TagInfo {
    public TagInfoAsciiOrRational(String name, int tag, int length, TiffDirectoryType directoryType) {
        super(name, tag, FIELD_TYPE_DESCRIPTION_ASCII_OR_RATIONAL, length, directoryType, false);
    }
}
