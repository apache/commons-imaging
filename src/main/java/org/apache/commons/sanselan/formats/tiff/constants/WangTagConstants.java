package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoByte;

/**
 * Wang/Eastman Software/Kodac/eiStream/Imaging for Windows tags,
 * undocumented and in need of more work.
 */
public interface WangTagConstants {
    public static final TagInfoByte EXIF_TAG_WANG_ANNOTATION = new TagInfoByte(
            "Wang Annotation", 0x80a4, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_WANG_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_WANG_ANNOTATION }));
}
