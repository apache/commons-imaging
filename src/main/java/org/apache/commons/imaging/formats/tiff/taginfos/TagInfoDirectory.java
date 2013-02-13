package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;

/**
 * A LONG representing an offset to a TIFF directory.
 */
public class TagInfoDirectory extends TagInfoLong {
    public TagInfoDirectory(final String name, final int tag, final int length,
            final TiffDirectoryType directoryType) {
        super(name, tag, length, directoryType, true);
    }
}
