package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined;

/**
 * TIFF specification supplement 2
 * <BR>
 * Adobe Photoshop (R) TIFF Technical Notes
 * <BR>
 * http://partners.adobe.com/public/developer/en/tiff/TIFFphotoshop.pdf
 */
public interface AdobePhotoshopTagConstants {
    public static final TagInfoUndefined EXIF_TAG_JPEGTABLES = new TagInfoUndefined(
            "JPEGTables", 0x015b, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoUndefined EXIF_TAG_IMAGE_SOURCE_DATA = new TagInfoUndefined(
            "Image Source Data", 0x935c, 1,
            TiffDirectoryType.EXIF_DIRECTORY_IFD0);

    public static final List<TagInfo> ALL_ADOBE_PHOTOSHOP_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_JPEGTABLES,
                    EXIF_TAG_IMAGE_SOURCE_DATA
            }));
}
