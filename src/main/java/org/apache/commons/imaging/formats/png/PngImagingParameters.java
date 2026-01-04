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

package org.apache.commons.imaging.formats.png;

import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.common.XmpImagingParameters;

/**
 * PNG format parameters.
 *
 * @since 1.0-alpha3
 */
public class PngImagingParameters extends XmpImagingParameters<PngImagingParameters> {

    /** Default bit depth value. */
    public static final byte DEFAULT_BIT_DEPTH = 8;

    /**
     * Bit depth. Default value is {@literal 8}.
     */
    private byte bitDepth = DEFAULT_BIT_DEPTH;

    private boolean forceIndexedColor;

    private boolean forceTrueColor;

    private boolean predictorEnabled;

    /**
     * Used in write operations to indicate the Physical Scale - sCAL.
     *
     * <p>
     * Valid values: PhysicalScale
     * </p>
     *
     * @see org.apache.commons.imaging.formats.png.PhysicalScale
     */
    private PhysicalScale physicalScale;

    /**
     * <p>
     * Only used when writing PNG images.
     * </p>
     *
     * <p>
     * Valid values: a list of WriteTexts.
     * </p>
     */
    private List<? extends AbstractPngText> textChunks;

    /**
     * Constructs a new instance.
     */
    public PngImagingParameters() {
        // Default constructor
    }

    /**
     * Gets the bit depth.
     *
     * @return the bit depth.
     */
    public byte getBitDepth() {
        return bitDepth;
    }

    /**
     * Gets the physical scale.
     *
     * @return the physical scale.
     */
    public PhysicalScale getPhysicalScale() {
        return physicalScale;
    }

    /**
     * Gets the text chunks.
     *
     * @return the text chunks.
     */
    public List<? extends AbstractPngText> getTextChunks() {
        return textChunks != null ? Collections.unmodifiableList(textChunks) : null;
    }

    /**
     * Checks if forcing indexed color.
     *
     * @return true if forcing indexed color, false otherwise.
     */
    public boolean isForceIndexedColor() {
        return forceIndexedColor;
    }

    /**
     * Checks if forcing true color.
     *
     * @return true if forcing true color, false otherwise.
     */
    public boolean isForceTrueColor() {
        return forceTrueColor;
    }

    /**
     * Indicates that the PNG write operation should enable the predictor.
     *
     * @return true if the predictor is enabled; otherwise, false.
     */
    public boolean isPredictorEnabled() {
        return predictorEnabled;
    }

    /**
     * Sets the bit depth.
     *
     * @param bitDepth the bit depth.
     * @return this instance.
     */
    public PngImagingParameters setBitDepth(final byte bitDepth) {
        this.bitDepth = bitDepth;
        return asThis();
    }

    /**
     * Sets whether to force indexed color.
     *
     * @param forceIndexedColor whether to force indexed color.
     * @return this instance.
     */
    public PngImagingParameters setForceIndexedColor(final boolean forceIndexedColor) {
        this.forceIndexedColor = forceIndexedColor;
        return asThis();
    }

    /**
     * Sets whether to force true color.
     *
     * @param forceTrueColor whether to force true color.
     * @return this instance.
     */
    public PngImagingParameters setForceTrueColor(final boolean forceTrueColor) {
        this.forceTrueColor = forceTrueColor;
        return asThis();
    }

    /**
     * Sets the physical scale.
     *
     * @param physicalScale the physical scale.
     * @return this instance.
     */
    public PngImagingParameters setPhysicalScale(final PhysicalScale physicalScale) {
        this.physicalScale = physicalScale;
        return asThis();
    }

    /**
     * Sets the enabled status of the predictor. When performing data compression on an image, a PNG predictor often results in a reduced file size. Predictors
     * are particularly effective on photographic images, but may also work on graphics. The specification of a predictor may result in an increased processing
     * time when writing an image, but will not affect the time required to read an image.
     *
     * @param predictorEnabled true if a predictor is enabled; otherwise, false.
     * @return {@code this} instance.
     */
    public PngImagingParameters setPredictorEnabled(final boolean predictorEnabled) {
        this.predictorEnabled = predictorEnabled;
        return asThis();
    }

    /**
     * Sets the text chunks.
     *
     * @param textChunks the text chunks.
     * @return this instance.
     */
    public PngImagingParameters setTextChunks(final List<? extends AbstractPngText> textChunks) {
        this.textChunks = Collections.unmodifiableList(textChunks);
        return asThis();
    }
}
