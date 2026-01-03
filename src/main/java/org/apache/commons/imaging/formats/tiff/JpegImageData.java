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

package org.apache.commons.imaging.formats.tiff;

/**
 * JPEG image data within a TIFF file.
 */
public class JpegImageData extends AbstractTiffElement.DataElement {
    /**
     * Constructs a new JPEG image data element.
     *
     * @param offset the offset in the file.
     * @param length the data length.
     * @param data the data bytes.
     */
    public JpegImageData(final long offset, final int length, final byte[] data) {
        super(offset, length, data);
    }

    @Override
    public String getElementDescription() {
        return "JPEG image data: " + getDataLength() + " bytes";
    }

}
