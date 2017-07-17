package org.apache.commons.imaging.formats.tiff;

import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for class {@link TiffTags}.
 *
 * @date 2017-07-13
 * @see TiffTags
 *
 **/
public class TiffTagsTest{


    @Test
    public void testGetTagWithNegativeAndPositive() {

        TagInfo tagInfo = TiffTags.getTag((-1), 50933);

        assertEquals((-1), tagInfo.tag);
        assertEquals( "Unknown Tag", tagInfo.name );

    }


}