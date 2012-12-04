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

package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DhtSegment extends Segment {
    public final List<HuffmanTable> huffmanTables = new ArrayList<HuffmanTable>();

    public static class HuffmanTable {
        // some arrays are better off one-based
        // to avoid subtractions by one later when indexing them
        public final int tableClass;
        public final int destinationIdentifier;
        public final int[] bits; // 1-based
        public final int[] huffVal; // 0-based

        // derived properties:
        public final int[] huffSize = new int[16 * 256]; // 0-based
        public final int[] huffCode; // 0-based
        public final int[] minCode = new int[1 + 16]; // 1-based
        public final int[] maxCode = new int[1 + 16]; // 1-based
        public final int[] valPtr = new int[1 + 16]; // 1-based

        public HuffmanTable(final int tableClass, final int destinationIdentifier,
                final int[] bits, final int[] huffVal) {
            this.tableClass = tableClass;
            this.destinationIdentifier = destinationIdentifier;
            this.bits = bits;
            this.huffVal = huffVal;

            // "generate_size_table", section C.2, figure C.1, page 51 of ITU-T
            // T.81:
            int k = 0;
            int i = 1;
            int j = 1;
            int lastK = -1;
            while (true) {
                if (j > bits[i]) {
                    i++;
                    j = 1;
                    if (i > 16) {
                        huffSize[k] = 0;
                        lastK = k;
                        break;
                    }
                } else {
                    huffSize[k] = i;
                    k++;
                    j++;
                }
            }

            // "generate_code_table", section C.2, figure C.2, page 52 of ITU-T
            // T.81:
            k = 0;
            int code = 0;
            int si = huffSize[0];
            huffCode = new int[lastK];
            while (true) {
                huffCode[k] = code;
                code++;
                k++;

                if (huffSize[k] == si) {
                    continue;
                }
                if (huffSize[k] == 0) {
                    break;
                }
                do {
                    code <<= 1;
                    si++;
                } while (huffSize[k] != si);
            }

            // "Decoder_tables", section F.2.2.3, figure F.15, page 108 of T.81:
            i = 0;
            j = 0;
            while (true) {
                i++;
                if (i > 16) {
                    break;
                }
                if (bits[i] == 0) {
                    maxCode[i] = -1;
                } else {
                    valPtr[i] = j;
                    minCode[i] = huffCode[j];
                    j += bits[i] - 1;
                    maxCode[i] = huffCode[j];
                    j++;
                }
            }

        }
    }

    public DhtSegment(final int marker, final byte[] segmentData) throws IOException {
        this(marker, segmentData.length, new ByteArrayInputStream(segmentData));
    }

    public DhtSegment(final int marker, int length, final InputStream is)
            throws IOException {
        super(marker, length);

        while (length > 0) {
            final int tableClassAndDestinationId = 0xff & readByte(
                    "TableClassAndDestinationId", is, "Not a Valid JPEG File");
            length--;
            final int tableClass = (tableClassAndDestinationId >> 4) & 0xf;
            final int destinationIdentifier = tableClassAndDestinationId & 0xf;
            final int[] bits = new int[1 + 16];
            int bitsSum = 0;
            for (int i = 1; i < bits.length; i++) {
                bits[i] = 0xff & readByte("Li", is, "Not a Valid JPEG File");
                length--;
                bitsSum += bits[i];
            }
            final int[] huffVal = new int[bitsSum];
            for (int i = 0; i < bitsSum; i++) {
                huffVal[i] = 0xff & readByte("Vij", is, "Not a Valid JPEG File");
                length--;
            }

            huffmanTables.add(new HuffmanTable(tableClass,
                    destinationIdentifier, bits, huffVal));
        }
    }

    @Override
    public String getDescription() {
        return "DHT (" + getSegmentType() + ")";
    }
}
