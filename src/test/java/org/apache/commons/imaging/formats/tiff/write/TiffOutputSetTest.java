/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff.write;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiffOutputSetTest {

    private TiffOutputSet tiffOutputSet;

    @BeforeEach
    public void setUp() {
        tiffOutputSet = new TiffOutputSet();
    }

    /*
     * TiffOutputSet.setGPSInDegrees should make sure, GPSVersionID is set
     *
     * https://issues.apache.org/jira/browse/IMAGING-144
     */
    @Test
    void testImaging144() throws Exception {
        tiffOutputSet.setGpsInDegrees(1.0, 1.0);

        final TiffOutputField gpsVersionId = tiffOutputSet.findField(GpsTagConstants.GPS_TAG_GPS_VERSION_ID);

        assertNotNull(gpsVersionId);
        assertArrayEquals(gpsVersionId.getData(), GpsTagConstants.gpsVersion());
    }

}
