/**
 * 
 */
package org.apache.sanselan.formats.jpeg;

import java.util.Collections;
import java.util.List;

import org.apache.sanselan.common.ImageMetadata;
import org.apache.sanselan.formats.jpeg.iptc.IPTCConstants;
import org.apache.sanselan.formats.jpeg.iptc.IPTCRecord;
import org.apache.sanselan.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.sanselan.util.Debug;

public class JpegPhotoshopMetadata extends ImageMetadata implements
		IPTCConstants
{

	public final PhotoshopApp13Data photoshopApp13Data;

	public JpegPhotoshopMetadata(final PhotoshopApp13Data photoshopApp13Data)
	{
		this.photoshopApp13Data = photoshopApp13Data;

		List records = photoshopApp13Data.getRecords();
		Collections.sort(records, IPTCRecord.COMPARATOR);
		for (int j = 0; j < records.size(); j++)
		{
			IPTCRecord element = (IPTCRecord) records.get(j);
			if (element.iptcType.type != IPTC_TYPE_RECORD_VERSION.type)
				add(element.getIptcTypeName(), element.getValue());
		}
	}

	public void dump()
	{
		Debug.debug(this.toString());
	}

}