package org.apache.commons.imaging.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;

/**
 * Alias Sketchbook Pro multi-layer TIFF
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/docs/alias.html
 */
public interface AliasSketchbookProTagConstants extends TiffFieldTypeConstants {
    public static final TagInfoAscii EXIF_TAG_ALIAS_LAYER_METADATA = new TagInfoAscii(
            "Alias Layer Metadata", 0xc660, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_ALIAS_SKETCHBOOK_PRO_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_ALIAS_LAYER_METADATA}));
}
