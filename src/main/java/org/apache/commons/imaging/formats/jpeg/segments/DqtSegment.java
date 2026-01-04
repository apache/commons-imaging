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

package org.apache.commons.imaging.formats.jpeg.segments;

import static org.apache.commons.imaging.common.BinaryFunctions.read2Bytes;
import static org.apache.commons.imaging.common.BinaryFunctions.readByte;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.ImagingException;

/**
 * A JPEG DQT (Define Quantization Table) segment.
 */
public final class DqtSegment extends AbstractSegment {

    /**
     * A quantization table for JPEG compression.
     */
    public static class QuantizationTable {

        /** The precision of the quantization table (0=8-bit, 1=16-bit). */
        public final int precision;

        /** The destination identifier. */
        public final int destinationIdentifier;

        private final int[] elements;

        /**
         * Constructs a new quantization table.
         *
         * @param precision the precision (0=8-bit, 1=16-bit).
         * @param destinationIdentifier the destination identifier.
         * @param elements the quantization table elements.
         */
        public QuantizationTable(final int precision, final int destinationIdentifier, final int[] elements) {
            this.precision = precision;
            this.destinationIdentifier = destinationIdentifier;
            this.elements = elements;
        }

        /**
         * Gets the quantization table elements.
         *
         * @return the elements.
         */
        public int[] getElements() {
            return elements;
        }
    }

    /** The list of quantization tables in this segment. */
    public final List<QuantizationTable> quantizationTables = new ArrayList<>();

    /**
     * Constructs a DQT segment from segment data.
     *
     * @param marker the segment marker.
     * @param segmentData the segment data.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public DqtSegment(final int marker, final byte[] segmentData) throws ImagingException, IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    /**
     * Constructs a DQT segment by reading from an input stream.
     *
     * @param marker the segment marker.
     * @param length the segment length.
     * @param is the input stream to read from.
     * @throws ImagingException if the image format is invalid.
     * @throws IOException if an I/O error occurs.
     */
    public DqtSegment(final int marker, int length, final InputStream is) throws ImagingException, IOException {
        super(marker, length);

        while (length > 0) {
            final int precisionAndDestination = readByte("QuantizationTablePrecisionAndDestination", is, "Not a Valid JPEG File");
            length--;
            final int precision = precisionAndDestination >> 4 & 0xf;
            final int destinationIdentifier = precisionAndDestination & 0xf;

            final int[] elements = new int[64];
            for (int i = 0; i < 64; i++) {
                if (precision == 0) {
                    elements[i] = 0xff & readByte("QuantizationTableElement", is, "Not a Valid JPEG File");
                    length--;
                } else if (precision == 1) {
                    elements[i] = read2Bytes("QuantizationTableElement", is, "Not a Valid JPEG File", getByteOrder());
                    length -= 2;
                } else {
                    throw new ImagingException("Quantization table precision '" + precision + "' is invalid");
                }
            }

            quantizationTables.add(new QuantizationTable(precision, destinationIdentifier, elements));
        }
    }

    @Override
    public String getDescription() {
        return "DQT (" + getSegmentType() + ")";
    }
}
