package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoLong;

public interface HylaFaxTagConstants extends TiffFieldTypeConstants {
    public static final TagInfoLong EXIF_TAG_FAX_RECV_PARAMS = new TagInfoLong(
            "Fax Recv Params", 0x885c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_FAX_SUB_ADDRESS = new TagInfoAscii(
            "Fax Sub Address", 0x885d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoLong EXIF_TAG_FAX_RECV_TIME = new TagInfoLong(
            "Fax Recv Time", 0x885e, 1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_FAX_DCS = new TagInfoAscii(
            "Fax DCS", 0x885f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_HYLAFAX_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                EXIF_TAG_FAX_RECV_PARAMS,
                EXIF_TAG_FAX_SUB_ADDRESS,
                EXIF_TAG_FAX_RECV_TIME,
                EXIF_TAG_FAX_DCS));
}
