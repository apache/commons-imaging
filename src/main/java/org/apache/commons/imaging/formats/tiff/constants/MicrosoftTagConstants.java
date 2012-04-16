package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;

/**
 * Largely undocumented and derived by experimentation.
 */
public interface MicrosoftTagConstants {
    public static final TagInfoShort EXIF_TAG_RATING = new TagInfoShort(
            "Rating", 0x4746, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);
    
    public static final TagInfoShort EXIF_TAG_RATING_PERCENT = new TagInfoShort(
            "Rating Percent", 0x4749, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPTITLE = new TagInfoXpString(
            "XPTitle", 0x9c9b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPCOMMENT = new TagInfoXpString(
            "XPComment", 0x9c9c, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPAUTHOR = new TagInfoXpString(
            "XPAuthor", 0x9c9d, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPKEYWORDS = new TagInfoXpString(
            "XPKeywords", 0x9c9e, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final TagInfoXpString EXIF_TAG_XPSUBJECT = new TagInfoXpString(
            "XPSubject",  0x9c9f, -1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final List<TagInfo> ALL_MICROSOFT_TAGS =
            Collections.unmodifiableList(Arrays.asList(
                    EXIF_TAG_RATING,
                    EXIF_TAG_RATING_PERCENT,
                    EXIF_TAG_XPTITLE,
                    EXIF_TAG_XPCOMMENT,
                    EXIF_TAG_XPAUTHOR,
                    EXIF_TAG_XPKEYWORDS,
                    EXIF_TAG_XPSUBJECT));
}
