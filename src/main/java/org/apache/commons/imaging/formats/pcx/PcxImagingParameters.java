/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
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
 *
 * @since 1.0-alpha3
 */
public class PcxImagingParameters extends ImagingParameters<PcxImagingParameters> {

    private int planes = -1;

    private int bitDepth = -1;
    private int compression = PcxConstants.PCX_COMPRESSION_UNCOMPRESSED;
    /**
     * Constructs a new instance.
     */
    public PcxImagingParameters() {
    }

    /**
     * Gets the bit depth.
     *
     * @return the bit depth.
     */
    public int getBitDepth() {
        return bitDepth;
    }

    /**
     * Gets the compression type.
     *
     * @return the compression type.
     */
    public int getCompression() {
        return compression;
    }

    /**
     * Gets the number of planes.
     *
     * @return the number of planes.
     */
    public int getPlanes() {
        return planes;
    }

    /**
     * Sets the bit depth.
     *
     * @param bitDepth the bit depth.
     * @return this instance.
     */
    public PcxImagingParameters setBitDepth(final int bitDepth) {
        this.bitDepth = bitDepth;
        return asThis();
    }

    /**
     * Sets the compression type.
     *
     * @param compression the compression type.
     * @return this instance.
     */
    public PcxImagingParameters setCompression(final int compression) {
        this.compression = compression;
        return asThis();
    }

    /**
     * Sets the number of planes.
     *
     * @param planes the number of planes.
     * @return this instance.
     */
    public PcxImagingParameters setPlanes(final int planes) {
        this.planes = planes;
        return asThis();
    }

}
