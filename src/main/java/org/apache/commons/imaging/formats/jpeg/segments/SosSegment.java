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
package org.apache.commons.imaging.formats.jpeg.segments;

import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SosSegment extends Segment {

    private static final Logger LOGGER = Logger.getLogger(SosSegment.class.getName());

    public final int numberOfComponents;
    private final Component[] components;
    public final int startOfSpectralSelection;
    public final int endOfSpectralSelection;
    public final int successiveApproximationBitHigh;
    public final int successiveApproximationBitLow;

    public static class Component {
        public final int scanComponentSelector;
        public final int dcCodingTableSelector;
        public final int acCodingTableSelector;

        public Component(final int scanComponentSelector, final int dcCodingTableSelector,
                final int acCodingTableSelector) {
            this.scanComponentSelector = scanComponentSelector;
            this.dcCodingTableSelector = dcCodingTableSelector;
            this.acCodingTableSelector = acCodingTableSelector;
        }
    }

    public SosSegment(final int marker, final byte[] segmentData) throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public SosSegment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength);

        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest("SosSegment marker_length: " + markerLength);
        }

        // Debug.debug("SOS", marker_length);

        numberOfComponents = readByte("number_of_components_in_scan", is,
                "Not a Valid JPEG File");
        // Debug.debug("number_of_components_in_scan",
        // numberOfComponents);

        components = new Component[numberOfComponents];
        for (int i = 0; i < numberOfComponents; i++) {
            final int scanComponentSelector = readByte("scanComponentSelector", is, "Not a Valid JPEG File");
            // Debug.debug("scanComponentSelector", scanComponentSelector);

            final int acDcEntropyCodingTableSelector = readByte(
                    "acDcEntropyCodingTableSelector", is,
                    "Not a Valid JPEG File");
            // Debug.debug("ac_dc_entrooy_coding_table_selector",
            // acDcEntropyCodingTableSelector);

            final int dcCodingTableSelector = (acDcEntropyCodingTableSelector >> 4) & 0xf;
            final int acCodingTableSelector = acDcEntropyCodingTableSelector & 0xf;
            components[i] = new Component(scanComponentSelector,
                    dcCodingTableSelector, acCodingTableSelector);
        }

        startOfSpectralSelection = readByte("start_of_spectral_selection", is,
                "Not a Valid JPEG File");
        // Debug.debug("start_of_spectral_selection", startOfSpectralSelection);
        endOfSpectralSelection = readByte("end_of_spectral_selection", is,
                "Not a Valid JPEG File");
        // Debug.debug("end_of_spectral_selection", endOfSpectralSelection);
        final int successiveApproximationBitPosition = readByte(
                "successive_approximation_bit_position", is,
                "Not a Valid JPEG File");
        // Debug.debug("successive_approximation_bit_position",
        // successive_approximation_bit_position);
        successiveApproximationBitHigh = (successiveApproximationBitPosition >> 4) & 0xf;
        successiveApproximationBitLow = successiveApproximationBitPosition & 0xf;
    }

    /**
     * Returns a copy of all the components.
     * @return all the components
     */
    public Component[] getComponents() {
        return components.clone();
    }

    /**
     * Return a component at the specified index.
     * @param index the component index
     * @return the component
     */
    public Component getComponents(final int index) {
        return components[index];
    }

    @Override
    public String getDescription() {
        return "SOS (" + getSegmentType() + ")";
    }

}
