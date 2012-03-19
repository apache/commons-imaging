package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoShort;

/**
 * Largely undocumented and derived by experimentation.
 */
public interface MicrosoftTagConstants {
    public static final TagInfoShort EXIF_TAG_RATING = new TagInfoShort("Rating", 0x4746,
            1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    
    public static final TagInfoShort EXIF_TAG_RATING_PERCENT = new TagInfoShort(
            "Rating Percent", 0x4749, 1, TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final List<TagInfo> ALL_MICROSOFT_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_RATING,
                    EXIF_TAG_RATING_PERCENT }));
}
