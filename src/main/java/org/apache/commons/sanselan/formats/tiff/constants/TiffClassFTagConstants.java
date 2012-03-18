package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShortOrLong;

/**
 * "The spirit of TIFF class F"
 * http://cool.conservation-us.org/bytopic/imaging/std/tiff-f.html
 */
public interface TiffClassFTagConstants extends TiffFieldTypeConstants {
    public static final TagInfoShortOrLong TIFF_TAG_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Bad Fax Lines", 0x0146, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    
    public static final TagInfoShort TIFF_TAG_CLEAN_FAX_DATA = new TagInfoShort(
            "Clean Fax Data", 0x0147, 1,
            TiffDirectoryType.TIFF_DIRECTORY_ROOT);
    public static final int CLEAN_FAX_DATA_VALUE_CLEAN = 0;
    public static final int CLEAN_FAX_DATA_VALUE_REGENERATED = 1;
    public static final int CLEAN_FAX_DATA_VALUE_UNCLEAN = 2;
    
    public static final TagInfoShortOrLong TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES = new TagInfoShortOrLong(
            "Consecutive Bad Fax Lines", 0x0148,
            1, TiffDirectoryType.TIFF_DIRECTORY_ROOT);

    public static final List<TagInfo> ALL_TIFF_CLASS_F_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    TIFF_TAG_BAD_FAX_LINES, TIFF_TAG_CLEAN_FAX_DATA,
                    TIFF_TAG_CONSECUTIVE_BAD_FAX_LINES));
}
