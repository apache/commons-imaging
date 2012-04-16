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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SosSegment extends Segment
{
    public final int numberOfComponents;
    public final Component[] components;
    public final int startOfSpectralSelection;
    public final int endOfSpectralSelection;
    public final int successiveApproximationBitHigh;
    public final int successiveApproximationBitLow;

    public static class Component
    {
        public final int scanComponentSelector;
        public final int dcCodingTableSelector;
        public final int acCodingTableSelector;

        public Component(int scanComponentSelector,
                int dcCodingTableSelector,
                int acCodingTableSelector)
        {
            this.scanComponentSelector = scanComponentSelector;
            this.dcCodingTableSelector = dcCodingTableSelector;
            this.acCodingTableSelector = acCodingTableSelector;
        }
    }

    public SosSegment(int marker, byte[] segmentData)
            throws IOException
    {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public SosSegment(int marker, int marker_length, InputStream is)
            throws IOException
    {
        super(marker, marker_length);

        if (getDebug())
            System.out.println("SosSegment marker_length: " + marker_length);

//        Debug.debug("SOS", marker_length);

        numberOfComponents = readByte(
                "number_of_components_in_scan", is, "Not a Valid JPEG File");
//        Debug.debug("number_of_components_in_scan",
//                numberOfComponents);

        components = new Component[numberOfComponents];
        for (int i = 0; i < numberOfComponents; i++)
        {
            int scan_component_selector = readByte("scan_component_selector",
                    is, "Not a Valid JPEG File");
//            Debug.debug("scan_component_selector", scan_component_selector);

            int ac_dc_entropy_coding_table_selector = readByte(
                    "ac_dc_entrooy_coding_table_selector", is,
                    "Not a Valid JPEG File");
//            Debug.debug("ac_dc_entrooy_coding_table_selector",
//                    ac_dc_entropy_coding_table_selector);

            int dcCodingTableSelector = (ac_dc_entropy_coding_table_selector >> 4) & 0xf;
            int acCodingTableSelector = ac_dc_entropy_coding_table_selector & 0xf;
            components[i] = new Component(scan_component_selector,
                    dcCodingTableSelector, acCodingTableSelector);
        }

        startOfSpectralSelection = readByte(
                "start_of_spectral_selection", is, "Not a Valid JPEG File");
//        Debug.debug("start_of_spectral_selection", startOfSpectralSelection);
        endOfSpectralSelection = readByte("end_of_spectral_selection",
                is, "Not a Valid JPEG File");
//        Debug.debug("end_of_spectral_selection", endOfSpectralSelection);
        int successive_approximation_bit_position = readByte(
                "successive_approximation_bit_position", is,
                "Not a Valid JPEG File");
//        Debug.debug("successive_approximation_bit_position",
//                successive_approximation_bit_position);
        successiveApproximationBitHigh = (successive_approximation_bit_position >> 4) & 0xf;
        successiveApproximationBitLow = successive_approximation_bit_position & 0xf;

        if (getDebug())
            System.out.println("");
    }

    @Override
    public String getDescription()
    {
        return "SOS (" + getSegmentType() + ")";
    }

}