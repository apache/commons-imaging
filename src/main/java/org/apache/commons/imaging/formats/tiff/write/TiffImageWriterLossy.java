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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.HEADER_SIZE;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.AbstractBinaryOutputStream;

public class TiffImageWriterLossy extends AbstractTiffImageWriter {

    public TiffImageWriterLossy() {
        // with default byte order
    }

    public TiffImageWriterLossy(final ByteOrder byteOrder) {
        super(byteOrder);
    }

    private void updateOffsetsStep(final List<AbstractTiffOutputItem> outputItems) {
        int offset = HEADER_SIZE;

        for (final AbstractTiffOutputItem outputItem : outputItems) {
            outputItem.setOffset(offset);
            final int itemLength = outputItem.getItemLength();
            offset += itemLength;

            final int remainder = imageDataPaddingLength(itemLength);
            offset += remainder;
        }
    }

    @Override
    public void write(final OutputStream os, final TiffOutputSet outputSet) throws IOException, ImagingException {
        final TiffOutputSummary outputSummary = validateDirectories(outputSet);

        final List<AbstractTiffOutputItem> outputItems = outputSet.getOutputItems(outputSummary);

        updateOffsetsStep(outputItems);

        outputSummary.updateOffsets(byteOrder);

        final AbstractBinaryOutputStream bos = AbstractBinaryOutputStream.create(os, byteOrder);

        // NB: resource is intentionally left open
        writeStep(bos, outputItems);
    }

    private void writeStep(final AbstractBinaryOutputStream bos, final List<AbstractTiffOutputItem> outputItems) throws IOException, ImagingException {
        writeImageFileHeader(bos);

        for (final AbstractTiffOutputItem outputItem : outputItems) {
            outputItem.writeItem(bos);

            final int length = outputItem.getItemLength();

            final int remainder = imageDataPaddingLength(length);
            for (int j = 0; j < remainder; j++) {
                bos.write(0);
            }
        }

    }
}
