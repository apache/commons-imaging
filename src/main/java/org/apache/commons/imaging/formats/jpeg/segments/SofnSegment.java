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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.formats.jpeg.JpegImageParser;

public class SofnSegment extends Segment {
    public final int width, height;
    public final int numberOfComponents;
    public final int precision;
    private final Component[] components;

    public static class Component {
        public final int componentIdentifier;
        public final int horizontalSamplingFactor;
        public final int verticalSamplingFactor;
        public final int quantTabDestSelector;

        public Component(final int componentIdentifier, final int horizontalSamplingFactor,
                final int veritcalSamplingFactor, final int quantTabDestSelector) {
            this.componentIdentifier = componentIdentifier;
            this.horizontalSamplingFactor = horizontalSamplingFactor;
            this.verticalSamplingFactor = veritcalSamplingFactor;
            this.quantTabDestSelector = quantTabDestSelector;
        }
    }

    public SofnSegment(final int marker, final byte segmentData[])
            throws ImageReadException, IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public SofnSegment(final int marker, final int marker_length, final InputStream is)
            throws ImageReadException, IOException {
        super(marker, marker_length);

        if (getDebug()) {
            System.out.println("SOF0Segment marker_length: " + marker_length);
        }

        precision = readByte("Data_precision", is, "Not a Valid JPEG File");
        height = read2Bytes("Image_height", is, "Not a Valid JPEG File");
        width = read2Bytes("Image_Width", is, "Not a Valid JPEG File");
        numberOfComponents = readByte("Number_of_components", is,
                "Not a Valid JPEG File");
        components = new Component[numberOfComponents];
        for (int i = 0; i < numberOfComponents; i++) {
            final int componentIdentifier = readByte("ComponentIdentifier", is,
                    "Not a Valid JPEG File");

            final int hvSamplingFactors = readByte("SamplingFactors", is,
                    "Not a Valid JPEG File");
            final int horizontalSamplingFactor = (hvSamplingFactors >> 4) & 0xf;
            final int verticalSamplingFactor = hvSamplingFactors & 0xf;
            final int quantTabDestSelector = readByte("QuantTabDestSel", is,
                    "Not a Valid JPEG File");
            components[i] = new Component(componentIdentifier,
                    horizontalSamplingFactor, verticalSamplingFactor,
                    quantTabDestSelector);
        }

        if (getDebug()) {
            System.out.println("");
        }
    }
    
    /**
     * Returns a copy of all the components.
     * @return the components
     */
    public Component[] getComponents() {
        return components.clone();
    }
    
    /**
     * Returns the component at the specified index.
     * @param index the array index
     * @return the component
     */
    public Component getComponents(final int index) {
        return components[index];
    }
    

    @Override
    public String getDescription() {
        return "SOFN (SOF" + (marker - JpegImageParser.SOF0Marker) + ") ("
                + getSegmentType() + ")";
    }

}
