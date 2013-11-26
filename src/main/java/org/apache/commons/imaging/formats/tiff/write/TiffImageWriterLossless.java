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

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffElement.DataElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffReader;

public class TiffImageWriterLossless extends TiffImageWriterBase {
    private final byte[] exifBytes;
    private static final Comparator<TiffElement> ELEMENT_SIZE_COMPARATOR = new Comparator<TiffElement>() {
        public int compare(final TiffElement e1, final TiffElement e2) {
            return e1.length - e2.length;
        }
    };
    private static final Comparator<TiffOutputItem> ITEM_SIZE_COMPARATOR = new Comparator<TiffOutputItem>() {
        public int compare(final TiffOutputItem e1, final TiffOutputItem e2) {
            return e1.getItemLength() - e2.getItemLength();
        }
    };

    public TiffImageWriterLossless(final byte[] exifBytes) {
        this.exifBytes = exifBytes;
    }

    public TiffImageWriterLossless(final ByteOrder byteOrder, final byte[] exifBytes) {
        super(byteOrder);
        this.exifBytes = exifBytes;
    }

    private List<TiffElement> analyzeOldTiff(final Map<Integer,TiffOutputField> frozenFields) throws ImageWriteException,
            IOException {
        try {
            final ByteSource byteSource = new ByteSourceArray(exifBytes);
            final Map<String,Object> params = null;
            final FormatCompliance formatCompliance = FormatCompliance.getDefault();
            final TiffContents contents = new TiffReader(false).readContents(
                    byteSource, params, formatCompliance);

            final List<TiffElement> elements = new ArrayList<TiffElement>();
            // result.add(contents.header); // ?

            final List<TiffDirectory> directories = contents.directories;
            for (TiffDirectory directory : directories) {
                elements.add(directory);

                final List<TiffField> fields = directory.getDirectoryEntries();
                for (TiffField field : fields) {
                    final TiffElement oversizeValue = field.getOversizeValueElement();
                    if (oversizeValue != null) {
                        final TiffOutputField frozenField = frozenFields.get(field.getTag());
                        if (frozenField != null &&
                                frozenField.getSeperateValue() != null &&
                                frozenField.bytesEqual(field.getByteArrayValue())) {
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

                final TiffImageData tiffImageData = directory.getTiffImageData();
                if (tiffImageData != null) {
                    final DataElement[] data = tiffImageData.getImageData();
                    Collections.addAll(elements, data);
                }
            }

            Collections.sort(elements, TiffElement.COMPARATOR);

            // dumpElements(byteSource, elements);

            final List<TiffElement> rewritableElements = new ArrayList<TiffElement>();
            {
                final int TOLERANCE = 3;
                // int last = TIFF_HEADER_SIZE;
                TiffElement start = null;
                long index = -1;
                for (TiffElement element : elements) {
                    final long lastElementByte = element.offset + element.length;
                    if (start == null) {
                        start = element;
                        index = lastElementByte;
                    } else if (element.offset - index > TOLERANCE) {
                        rewritableElements.add(new TiffElement.Stub(start.offset,
                                (int) (index - start.offset)));
                        start = element;
                        index = lastElementByte;
                    } else {
                        index = lastElementByte;
                    }
                }
                if (null != start) {
                    rewritableElements.add(new TiffElement.Stub(start.offset,
                            (int) (index - start.offset)));
                }
            }

            // dumpElements(byteSource, result);

            return rewritableElements;
        } catch (final ImageReadException e) {
            throw new ImageWriteException(e.getMessage(), e);
        }
    }

    @Override
    public void write(final OutputStream os, final TiffOutputSet outputSet)
            throws IOException, ImageWriteException {
        // There are some fields whose address in the file must not change,
        // unless of course their value is changed. 
        final Map<Integer,TiffOutputField> frozenFields = new HashMap<Integer,TiffOutputField>();
        final TiffOutputField makerNoteField = outputSet.findField(EXIF_TAG_MAKER_NOTE);
        if (makerNoteField != null && makerNoteField.getSeperateValue() != null) {
            frozenFields.put(EXIF_TAG_MAKER_NOTE.tag, makerNoteField);
        }
        final List<TiffElement> analysis = analyzeOldTiff(frozenFields);
        final int oldLength = exifBytes.length;
        if (analysis.isEmpty()) {
            throw new ImageWriteException("Couldn't analyze old tiff data.");
        } else if (analysis.size() == 1) {
            final TiffElement onlyElement = analysis.get(0);
            if (onlyElement.offset == TIFF_HEADER_SIZE
                    && onlyElement.offset + onlyElement.length
                            + TIFF_HEADER_SIZE == oldLength) {
                // no gaps in old data, safe to complete overwrite.
                new TiffImageWriterLossy(byteOrder).write(os, outputSet);
                return;
            }
        }
        final Map<Long,TiffOutputField> frozenFieldOffsets = new HashMap<Long, TiffOutputField>();
        for (final Map.Entry<Integer,TiffOutputField> entry : frozenFields.entrySet()) {
            final TiffOutputField frozenField = entry.getValue();
            if (frozenField.getSeperateValue().getOffset() != TiffOutputItem.UNDEFINED_VALUE) {
                frozenFieldOffsets.put(frozenField.getSeperateValue().getOffset(), frozenField);
            }
        }

        final TiffOutputSummary outputSummary = validateDirectories(outputSet);

        final List<TiffOutputItem> allOutputItems = outputSet
                .getOutputItems(outputSummary);
        final List<TiffOutputItem> outputItems = new ArrayList<TiffOutputItem>();
        for (final TiffOutputItem outputItem : allOutputItems) {
            if (!frozenFieldOffsets.containsKey(outputItem.getOffset())) {
                outputItems.add(outputItem);
            }
        }

        final long outputLength = updateOffsetsStep(analysis, outputItems);

        outputSummary.updateOffsets(byteOrder);

        writeStep(os, outputSet, analysis, outputItems, outputLength);

    }

    private long updateOffsetsStep(final List<TiffElement> analysis,
            final List<TiffOutputItem> outputItems) {
        // items we cannot fit into a gap, we shall append to tail.
        long overflowIndex = exifBytes.length;

        // make copy.
        final List<TiffElement> unusedElements = new ArrayList<TiffElement>(analysis);

        // should already be in order of offset, but make sure.
        Collections.sort(unusedElements, TiffElement.COMPARATOR);
        Collections.reverse(unusedElements);
        // any items that represent a gap at the end of the exif segment, can be
        // discarded.
        while (!unusedElements.isEmpty()) {
            final TiffElement element = unusedElements.get(0);
            final long elementEnd = element.offset + element.length;
            if (elementEnd == overflowIndex) {
                // discarding a tail element. should only happen once.
                overflowIndex -= element.length;
                unusedElements.remove(0);
            } else {
                break;
            }
        }

        Collections.sort(unusedElements, ELEMENT_SIZE_COMPARATOR);
        Collections.reverse(unusedElements);

        // make copy.
        final List<TiffOutputItem> unplacedItems = new ArrayList<TiffOutputItem>(
                outputItems);
        Collections.sort(unplacedItems, ITEM_SIZE_COMPARATOR);
        Collections.reverse(unplacedItems);

        while (!unplacedItems.isEmpty()) {
            // pop off largest unplaced item.
            final TiffOutputItem outputItem = unplacedItems.remove(0);
            final int outputItemLength = outputItem.getItemLength();
            // search for the smallest possible element large enough to hold the
            // item.
            TiffElement bestFit = null;
            for (TiffElement element : unusedElements) {
                if (element.length >= outputItemLength) {
                    bestFit = element;
                } else {
                    break;
                }
            }
            if (null == bestFit) {
                // we couldn't place this item. overflow.
                outputItem.setOffset(overflowIndex);
                overflowIndex += outputItemLength;
            } else {
                outputItem.setOffset(bestFit.offset);
                unusedElements.remove(bestFit);

                if (bestFit.length > outputItemLength) {
                    // not a perfect fit.
                    final long excessOffset = bestFit.offset + outputItemLength;
                    final int excessLength = bestFit.length - outputItemLength;
                    unusedElements.add(new TiffElement.Stub(excessOffset,
                            excessLength));
                    // make sure the new element is in the correct order.
                    Collections.sort(unusedElements, ELEMENT_SIZE_COMPARATOR);
                    Collections.reverse(unusedElements);
                }
            }
        }

        return overflowIndex;
    }

    private static class BufferOutputStream extends OutputStream {
        private final byte[] buffer;
        private int index;

        public BufferOutputStream(final byte[] buffer, final int index) {
            this.buffer = buffer;
            this.index = index;
        }

        @Override
        public void write(final int b) throws IOException {
            if (index >= buffer.length) {
                throw new IOException("Buffer overflow.");
            }

            buffer[index++] = (byte) b;
        }

        @Override
        public void write(final byte[] b, final int off, final int len) throws IOException {
            if (index + len > buffer.length) {
                throw new IOException("Buffer overflow.");
            }
            System.arraycopy(b, off, buffer, index, len);
            index += len;
        }
    }

    private void writeStep(final OutputStream os, final TiffOutputSet outputSet,
            final List<TiffElement> analysis, final List<TiffOutputItem> outputItems,
            final long outputLength) throws IOException, ImageWriteException {
        final TiffOutputDirectory rootDirectory = outputSet.getRootDirectory();

        final byte[] output = new byte[(int)outputLength];

        // copy old data (including maker notes, etc.)
        System.arraycopy(exifBytes, 0, output, 0,
                Math.min(exifBytes.length, output.length));

        // bos.write(exifBytes, TIFF_HEADER_SIZE, exifBytes.length
        // - TIFF_HEADER_SIZE);

        {
            final BufferOutputStream tos = new BufferOutputStream(output, 0);
            final BinaryOutputStream bos = new BinaryOutputStream(tos, byteOrder);
            writeImageFileHeader(bos, rootDirectory.getOffset());
        }

        // zero out the parsed pieces of old exif segment, in case we don't
        // overwrite them.
        for (TiffElement element : analysis) {
            for (int j = 0; j < element.length; j++) {
                final int index = (int) (element.offset + j);
                if (index < output.length) {
                    output[index] = 0;
                }
            }
        }

        // write in the new items
        for (TiffOutputItem outputItem : outputItems) {
            final BufferOutputStream tos = new BufferOutputStream(output,
                    (int) outputItem.getOffset());
            final BinaryOutputStream bos = new BinaryOutputStream(tos, byteOrder);
            outputItem.writeItem(bos);
        }

        os.write(output);
    }

}
