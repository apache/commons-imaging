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

package org.apache.commons.imaging.formats.png;

import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.common.XmpImagingParameters;

/**
 * Png format parameters.
 * @since 1.0-alpha3
 */
public class PngImagingParameters extends XmpImagingParameters {

    public static final byte DEFAULT_BIT_DEPTH = 8;

    /**
     * Bit depth. Default value is {@literal 8}.
     */
    private byte bitDepth = DEFAULT_BIT_DEPTH;

    private boolean forceIndexedColor = false;

    private boolean forceTrueColor = false;

    /**
     * Used in write operations to indicate the Physical Scale - sCAL.
     *
     * <p>Valid values: PhysicalScale</p>
     *
     * @see org.apache.commons.imaging.formats.png.PhysicalScale
     */
    private PhysicalScale physicalScale = null;

    /**
     * <p>Only used when writing Png images.</p>
     *
     * <p>Valid values: a list of WriteTexts.</p>
     */
    private List<? extends PngText> textChunks = null;

    public PngImagingParameters() {
        setImageFormat(ImageFormats.PNG);
    }

    public byte getBitDepth() {
        return bitDepth;
    }

    public void setBitDepth(byte bitDepth) {
        this.bitDepth = bitDepth;
    }

    public boolean isForceIndexedColor() {
        return forceIndexedColor;
    }

    public void setForceIndexedColor(boolean forceIndexedColor) {
        this.forceIndexedColor = forceIndexedColor;
    }

    public boolean isForceTrueColor() {
        return forceTrueColor;
    }

    public void setForceTrueColor(boolean forceTrueColor) {
        this.forceTrueColor = forceTrueColor;
    }

    public PhysicalScale getPhysicalScale() {
        return physicalScale;
    }

    public void setPhysicalScale(PhysicalScale physicalScale) {
        this.physicalScale = physicalScale;
    }

    public List<? extends PngText> getTextChunks() {
        return textChunks != null ? Collections.unmodifiableList(textChunks) : null;
    }

    public void setTextChunks(List<? extends PngText> textChunks) {
        this.textChunks = Collections.unmodifiableList(textChunks);
    }
}
