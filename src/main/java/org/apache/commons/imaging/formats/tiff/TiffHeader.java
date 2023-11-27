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
package org.apache.commons.imaging.formats.tiff;

import java.nio.ByteOrder;

import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;

public class TiffHeader extends AbstractTiffElement {
    public final ByteOrder byteOrder;
    public final int tiffVersion;
    public final long offsetToFirstIFD;
    public final boolean bigTiff;

    public TiffHeader(final ByteOrder byteOrder, final int tiffVersion, final long offsetToFirstIFD, final boolean bigTiff) {
        super(0, TiffConstants.TIFF_HEADER_SIZE);

        this.byteOrder = byteOrder;
        this.tiffVersion = tiffVersion;
        this.offsetToFirstIFD = offsetToFirstIFD;
        this.bigTiff = bigTiff;
    }

    @Override
    public String getElementDescription() {
        return "TIFF Header";
    }
}
