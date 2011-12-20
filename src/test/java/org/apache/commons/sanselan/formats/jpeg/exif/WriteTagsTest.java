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

package org.apache.commons.sanselan.formats.jpeg.exif;

import org.apache.commons.sanselan.SanselanConstants;
import org.apache.commons.sanselan.common.BinaryConstants;
import org.apache.commons.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.commons.sanselan.formats.tiff.write.TiffOutputField;

public class WriteTagsTest extends ExifBaseTest implements SanselanConstants
{

    public void test2SHORTS() throws Exception
    {
        TiffOutputField.create(
            TiffConstants.EXIF_TAG_PAGE_NUMBER,
            BinaryConstants.BYTE_ORDER_LITTLE_ENDIAN,
            new Integer[] { new Integer(1), new Integer(10) } );
    }

    public void testSHORTS() throws Exception
    {
        TiffOutputField.create(
            TiffConstants.TIFF_TAG_BITS_PER_SAMPLE,
            BinaryConstants.BYTE_ORDER_LITTLE_ENDIAN,
            new Integer[] { new Integer(1), new Integer(1) } );
    }
}
