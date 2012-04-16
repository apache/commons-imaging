package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;

/**
 * Oce Scanjob.
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/oce.html
 */
public interface OceScanjobTagConstants {
    public static final TagInfoAscii EXIF_TAG_OCE_SCANJOB_DESC = new TagInfoAscii(
            "Oce Scanjob Desc", 0xc427, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final TagInfoAscii EXIF_TAG_OCE_APPLICATION_SELECTOR = new TagInfoAscii(
            "Oce Application Selector", 0xc428,
            -1, TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoAscii EXIF_TAG_OCE_IDNUMBER = new TagInfoAscii(
            "Oce IDNumber", 0xc429, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoAscii EXIF_TAG_OCE_IMAGE_LOGIC = new TagInfoAscii(
            "Oce Image Logic", 0xc42a, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_OCE_SCANJOB_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_OCE_SCANJOB_DESC,
                    EXIF_TAG_OCE_APPLICATION_SELECTOR,
                    EXIF_TAG_OCE_IDNUMBER,
                    EXIF_TAG_OCE_IMAGE_LOGIC}));
}
