/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.sanselan.formats.jpeg;

import java.util.Collections;
import java.util.List;

import org.apache.commons.sanselan.common.ImageMetadata;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcRecord;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcTypes;
import org.apache.commons.sanselan.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.commons.sanselan.util.Debug;

public class JpegPhotoshopMetadata extends ImageMetadata implements
        IptcConstants
{

    public final PhotoshopApp13Data photoshopApp13Data;

    public JpegPhotoshopMetadata(final PhotoshopApp13Data photoshopApp13Data)
    {
        this.photoshopApp13Data = photoshopApp13Data;

        List<IptcRecord> records = photoshopApp13Data.getRecords();
        Collections.sort(records, IptcRecord.COMPARATOR);
        for (int j = 0; j < records.size(); j++)
        {
            IptcRecord element = (IptcRecord) records.get(j);
            if (element.iptcType != IptcTypes.RECORD_VERSION)
                add(element.getIptcTypeName(), element.getValue());
        }
    }

    public void dump()
    {
        Debug.debug(this.toString());
    }

}