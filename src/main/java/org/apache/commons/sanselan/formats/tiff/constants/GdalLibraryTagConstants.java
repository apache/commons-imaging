package org.apache.commons.sanselan.formats.tiff.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfo;
import org.apache.commons.sanselan.formats.tiff.taginfos.TagInfoAscii;

/**
 * GDAL library.
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_metadata.html
 * <BR>
 * http://www.awaresystems.be/imaging/tiff/tifftags/gdal_nodata.html
 */
public interface GdalLibraryTagConstants {
    public static final TagInfoAscii EXIF_TAG_GDALMETADATA = new TagInfoAscii(
            "GDALMetadata", 0xa480, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    
    public static final TagInfoAscii EXIF_TAG_GDALNO_DATA = new TagInfoAscii(
            "GDALNo Data", 0xa481, -1,
            TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);

    public static final List<TagInfo> ALL_GDAL_LIBRARY_TAGS =
            Collections.unmodifiableList(Arrays.asList(new TagInfo[] {
                    EXIF_TAG_GDALMETADATA,
                    EXIF_TAG_GDALNO_DATA}));
}
