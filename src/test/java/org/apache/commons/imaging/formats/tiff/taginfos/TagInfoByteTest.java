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
package org.apache.commons.imaging.formats.tiff.taginfos;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.junit.jupiter.api.Test;

public class TagInfoByteTest {

    @Test
    public void testCreatesTagInfoByteTakingFourArgumentsAndCallsEncodeValue() {
        final TiffDirectoryType tiffDirectoryType = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
        final TagInfoByte tagInfoByte = new TagInfoByte("", 347, tiffDirectoryType);

        assertArrayEquals(new byte[] { (byte) 0 }, tagInfoByte.encodeValue(null, (byte) 0));
    }

}
