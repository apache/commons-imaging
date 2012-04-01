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

package org.apache.commons.sanselan.formats.jpeg.iptc;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.Sanselan;
import org.apache.commons.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.commons.sanselan.formats.jpeg.JpegPhotoshopMetadata;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcRecord;
import org.apache.commons.sanselan.util.Debug;

public class IptcDumpTest extends IptcBaseTest
{

    public void test() throws Exception
    {
        List images = getImagesWithIptcData();
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            Debug.debug("imageFile", imageFile);
            Debug.debug();

            // ByteSource byteSource = new ByteSourceFile(imageFile);
            // Debug.debug("Segments:");
            // new JpegUtils().dumpJFIF(byteSource);

            Map params = new HashMap();
            boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params
                    .put(PARAM_KEY_READ_THUMBNAILS, new Boolean(
                            !ignoreImageData));
            // params.put(PARAM_KEY_VERBOSE, Boolean.TRUE);

            JpegImageMetadata metadata = (JpegImageMetadata) Sanselan
                    .getMetadata(imageFile, params);
            assertNotNull(metadata);
            assertNotNull(metadata.getPhotoshop());

            metadata.getPhotoshop().dump();
            // if(metadata.getPhotoshop().getItems().size()>0)
            // Debug.debug("iptc size",
            // metadata.getPhotoshop().getItems().size());

            JpegPhotoshopMetadata psMetadata = metadata.getPhotoshop();
            List oldRecords = psMetadata.photoshopApp13Data.getRecords();

            Debug.debug();
            for (int j = 0; j < oldRecords.size(); j++)
            {
                IptcRecord record = (IptcRecord) oldRecords.get(j);
                if (record.iptcType != IptcTypes.CITY)
                    Debug.debug("Key: " + record.iptcType.getName() + " (0x"
                            + Integer.toHexString(record.iptcType.getType())
                            + "), value: " + record.value);
            }
            Debug.debug();
        }
    }

}
