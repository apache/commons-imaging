/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.formats.pcx;

import org.apache.commons.imaging.ImagingParameters;

/**
 * Parameters used by the Pcx format.
 * @since 1.0-alpha3
 */
public class PcxImagingParameters extends ImagingParameters<PcxImagingParameters> {

    private int planes = -1;
    private int bitDepth = -1;
    private int compression = PcxConstants.PCX_COMPRESSION_UNCOMPRESSED;

    public int getBitDepth() {
        return bitDepth;
    }

    public int getCompression() {
        return compression;
    }

    public int getPlanes() {
        return planes;
    }

    public PcxImagingParameters setBitDepth(final int bitDepth) {
        this.bitDepth = bitDepth;
        return asThis();
    }

    public PcxImagingParameters setCompression(final int compression) {
        this.compression = compression;
        return asThis();
    }

    public PcxImagingParameters setPlanes(final int planes) {
        this.planes = planes;
        return asThis();
    }

}
