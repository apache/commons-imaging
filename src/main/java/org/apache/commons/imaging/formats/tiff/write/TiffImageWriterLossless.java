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
package org.apache.commons.imaging.formats.tiff.write;

import static org.apache.commons.imaging.formats.tiff.constants.TiffConstants.HEADER_SIZE;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.BinaryOutputStreamFactory;
import org.apache.commons.imaging.formats.tiff.AbstractTiffElement;
import org.apache.commons.imaging.formats.tiff.AbstractTiffElement.DataElement;
import org.apache.commons.imaging.formats.tiff.AbstractTiffImageData;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;

/**
 * TIFF lossless image writer.
 */
public class TiffImageWriterLossless extends AbstractTiffImageWriter {
    private static final class BufferOutputStream extends OutputStream {
        private final byte[] buffer;
        private int index;

        BufferOutputStream(final byte[] buffer, final int index) {
            this.buffer = buffer;
            this.index = index;
        }

        @Override
        public void write(final byte[] b, final int off, final int len) throws IOException {
            if (index + len > buffer.length) {
                throw new ImagingException("Buffer overflow.");
            }
            System.arraycopy(b, off, buffer, index, len);
            index += len;
        }

        @Override
        public void write(final int b) throws IOException {
            if (index >= buffer.length) {
                throw new ImagingException("Buffer overflow.");
            }

            buffer[index++] = (byte) b;
        }
    }

    private static final Comparator<AbstractTiffElement> ELEMENT_SIZE_COMPARATOR = Comparator.comparingInt(e -> e.length);
    private static final Comparator<AbstractTiffOutputItem> ITEM_SIZE_COMPARATOR = Comparator.comparingInt(AbstractTiffOutputItem::getItemLength);

    private final byte[] exifBytes;

    public TiffImageWriterLossless(final byte[] exifBytes) {
        this.exifBytes = exifBytes;
    }

    public TiffImageWriterLossless(final ByteOrder byteOrder, final byte[] exifBytes) {
        super(byteOrder);
        this.exifBytes = exifBytes;
    }

    private List<AbstractTiffElement> analyzeOldTiff(final Map<Integer, TiffOutputField> frozenFields) throws ImagingException, IOException {
        try {
            final ByteSource byteSource = ByteSource.array(exifBytes);
            final FormatCompliance formatCompliance = FormatCompliance.getDefault();
            final TiffContents contents = new TiffReader(false).readContents(byteSource, new TiffImagingParameters(), formatCompliance);

            final List<AbstractTiffElement> elements = new ArrayList<>();

            final List<TiffDirectory> directories = contents.directories;
            for (final TiffDirectory directory : directories) {
                elements.add(directory);

                for (final TiffField field : directory.getDirectoryEntries()) {
                    final AbstractTiffElement oversizeValue = field.getOversizeValueElement();
                    if (oversizeValue != null) {
                        final TiffOutputField frozenField = frozenFields.get(field.getTag());
                        if (frozenField != null && frozenField.getSeperateValue() != null && Arrays.equals(frozenField.getData(), field.getByteArrayValue())) {
                            frozenField.getSeperateValue().setOffset(field.getOffset());
                        } else {
                            elements.add(oversizeValue);
                        }
                    }
                }

                final JpegImageData jpegImageData = directory.getJpegImageData();
                if (jpegImageData != null) {
                    elements.add(jpegImageData);
                }

                final AbstractTiffImageData abstractTiffImageData = directory.getTiffImageData();
                if (abstractTiffImageData != null) {
                    final DataElement[] data = abstractTiffImageData.getImageData();
                    Collections.addAll(elements, data);
                }
            }

            elements.sort(AbstractTiffElement.COMPARATOR);

            final List<AbstractTiffElement> rewritableElements = new ArrayList<>();
            final int tolerance = 3;
            AbstractTiffElement start = null;
            long index = -1;
            for (final AbstractTiffElement element : elements) {
                final long lastElementByte = element.offset + element.length;
                if (start == null) {
                    start = element;
                } else if (element.offset - index > tolerance) {
                    rewritableElements.add(new AbstractTiffElement.Stub(start.offset, (int) (index - start.offset)));
                    start = element;
                }
                index = lastElementByte;
            }
            if (null != start) {
                rewritableElements.add(new AbstractTiffElement.Stub(start.offset, (int) (index - start.offset)));
            }

            return rewritableElements;
        } catch (final ImagingException e) {
            throw new ImagingException(e.getMessage(), e);
        }
    }

    private long updateOffsetsStep(final List<AbstractTiffElement> analysis, final List<AbstractTiffOutputItem> outputItems) {
        // items we cannot fit into a gap, we shall append to tail.
        long overflowIndex = exifBytes.length;

        // make copy.
        final List<AbstractTiffElement> unusedElements = new ArrayList<>(analysis);

        // should already be in order of offset, but make sure.
        unusedElements.sort(AbstractTiffElement.COMPARATOR);
        Collections.reverse(unusedElements);
        // any items that represent a gap at the end of the exif segment, can be
        // discarded.
        while (!unusedElements.isEmpty()) {
            final AbstractTiffElement element = unusedElements.get(0);
            final long elementEnd = element.offset + element.length;
            if (elementEnd != overflowIndex) {
                break;
            }
            // discarding a tail element. should only happen once.
            overflowIndex -= element.length;
            unusedElements.remove(0);
        }

        unusedElements.sort(ELEMENT_SIZE_COMPARATOR);
        Collections.reverse(unusedElements);

        // make copy.
        final List<AbstractTiffOutputItem> unplacedItems = new ArrayList<>(outputItems);
        unplacedItems.sort(ITEM_SIZE_COMPARATOR);
        Collections.reverse(unplacedItems);

        while (!unplacedItems.isEmpty()) {
            // pop off largest unplaced item.
            final AbstractTiffOutputItem outputItem = unplacedItems.remove(0);
            final int outputItemLength = outputItem.getItemLength();
            // search for the smallest possible element large enough to hold the
            // item.
            AbstractTiffElement bestFit = null;
            for (final AbstractTiffElement element : unusedElements) {
                if (element.length < outputItemLength) {
                    break;
                }
                bestFit = element;
            }
            if (null == bestFit) {
                // we couldn't place this item. overflow.
                if ((overflowIndex & 1L) != 0) {
                    overflowIndex += 1;
                }
                outputItem.setOffset(overflowIndex);
                overflowIndex += outputItemLength;
            } else {
                long offset = bestFit.offset;
                int length = bestFit.length;
                if ((offset & 1L) != 0) {
                    // offsets have to be at a multiple of 2
                    offset += 1;
                    length -= 1;
                }
                outputItem.setOffset(offset);
                unusedElements.remove(bestFit);

                if (length > outputItemLength) {
                    // not a perfect fit.
                    final long excessOffset = offset + outputItemLength;
                    final int excessLength = length - outputItemLength;
                    unusedElements.add(new AbstractTiffElement.Stub(excessOffset, excessLength));
                    // make sure the new element is in the correct order.
                    unusedElements.sort(ELEMENT_SIZE_COMPARATOR);
                    Collections.reverse(unusedElements);
                }
            }
        }

        return overflowIndex;
    }

    @Override
    public void write(final OutputStream os, final TiffOutputSet outputSet) throws IOException, ImagingException {
        // There are some fields whose address in the file must not change,
        // unless of course their value is changed.
        final Map<Integer, TiffOutputField> frozenFields = new HashMap<>();
        final TiffOutputField makerNoteField = outputSet.findField(ExifTagConstants.EXIF_TAG_MAKER_NOTE);
        if (makerNoteField != null && makerNoteField.getSeperateValue() != null) {
            frozenFields.put(ExifTagConstants.EXIF_TAG_MAKER_NOTE.tag, makerNoteField);
        }
        final List<AbstractTiffElement> analysis = analyzeOldTiff(frozenFields);
        final int oldLength = exifBytes.length;
        if (analysis.isEmpty()) {
            throw new ImagingException("Couldn't analyze old tiff data.");
        }
        if (analysis.size() == 1) {
            final AbstractTiffElement onlyElement = analysis.get(0);
            if (onlyElement.offset == HEADER_SIZE && onlyElement.offset + onlyElement.length + HEADER_SIZE == oldLength) {
                // no gaps in old data, safe to complete overwrite.
                new TiffImageWriterLossy(byteOrder).write(os, outputSet);
                return;
            }
        }
        final Map<Long, TiffOutputField> frozenFieldOffsets = new HashMap<>();
        for (final Map.Entry<Integer, TiffOutputField> entry : frozenFields.entrySet()) {
            final TiffOutputField frozenField = entry.getValue();
            if (frozenField.getSeperateValue().getOffset() != AbstractTiffOutputItem.UNDEFINED_VALUE) {
                frozenFieldOffsets.put(frozenField.getSeperateValue().getOffset(), frozenField);
            }
        }

        final TiffOutputSummary outputSummary = validateDirectories(outputSet);

        final List<AbstractTiffOutputItem> allOutputItems = outputSet.getOutputItems(outputSummary);
        final List<AbstractTiffOutputItem> outputItems = new ArrayList<>();
        for (final AbstractTiffOutputItem outputItem : allOutputItems) {
            if (!frozenFieldOffsets.containsKey(outputItem.getOffset())) {
                outputItems.add(outputItem);
            }
        }

        final long outputLength = updateOffsetsStep(analysis, outputItems);

        outputSummary.updateOffsets(byteOrder);

        writeStep(os, outputSet, analysis, outputItems, outputLength);

    }

    private void writeStep(final OutputStream os, final TiffOutputSet outputSet, final List<AbstractTiffElement> analysis,
            final List<AbstractTiffOutputItem> outputItems, final long outputLength) throws IOException, ImagingException {
        final TiffOutputDirectory rootDirectory = outputSet.getRootDirectory();

        final byte[] output = Allocator.byteArray(outputLength);

        // copy old data (including maker notes, etc.)
        System.arraycopy(exifBytes, 0, output, 0, Math.min(exifBytes.length, output.length));

        try (BufferOutputStream headerStream = new BufferOutputStream(output, 0);
                BinaryOutputStream headerBinaryStream = BinaryOutputStreamFactory.create(headerStream, byteOrder)) {
            writeImageFileHeader(headerBinaryStream, rootDirectory.getOffset());
        }

        // zero out the parsed pieces of old exif segment, in case we don't
        // overwrite them.
        for (final AbstractTiffElement element : analysis) {
            Arrays.fill(output, (int) element.offset, (int) Math.min(element.offset + element.length, output.length), (byte) 0);
        }

        // write in the new items
        for (final AbstractTiffOutputItem outputItem : outputItems) {
            try (BinaryOutputStream bos = BinaryOutputStreamFactory.create(new BufferOutputStream(output, (int) outputItem.getOffset()), byteOrder)) {
                outputItem.writeItem(bos);
            }
        }

        os.write(output);
    }

}
