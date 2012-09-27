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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.FormatCompliance;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.BinaryFileFunctions;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffContents;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffReader;
import org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants;
import org.apache.commons.imaging.util.Debug;

public class TiffImageWriterLossless extends TiffImageWriterBase {
    private final byte exifBytes[];

    public TiffImageWriterLossless(byte exifBytes[]) {
        this.exifBytes = exifBytes;
    }

    public TiffImageWriterLossless(int byteOrder, byte exifBytes[]) {
        super(byteOrder);
        this.exifBytes = exifBytes;
    }

    // private static class TiffPiece
    // {
    // public final int offset;
    // public final int length;
    //
    // public TiffPiece(final int offset, final int length)
    // {
    // this.offset = offset;
    // this.length = length;
    // }
    // }

    private void dumpElements(List<TiffElement> elements) throws IOException {
        // try
        // {
        ByteSource byteSource = new ByteSourceArray(exifBytes);

        dumpElements(byteSource, elements);
        // }
        // catch (ImageReadException e)
        // {
        // throw new ImageWriteException(e.getMessage(), e);
        // }
    }

    private void dumpElements(ByteSource byteSource, List<TiffElement> elements)
            throws IOException {
        int last = TIFF_HEADER_SIZE;
        for (int i = 0; i < elements.size(); i++) {
            TiffElement element = elements.get(i);
            if (element.offset > last) {
                final int SLICE_SIZE = 32;
                int gepLength = element.offset - last;
                Debug.debug("gap of " + gepLength + " bytes.");
                byte bytes[] = byteSource.getBlock(last, gepLength);
                if (bytes.length > 2 * SLICE_SIZE) {
                    Debug.debug("\t" + "head",
                            BinaryFileFunctions.head(bytes, SLICE_SIZE));
                    Debug.debug("\t" + "tail",
                            BinaryFileFunctions.tail(bytes, SLICE_SIZE));
                } else {
                    Debug.debug("\t" + "bytes", bytes);
                }
            }

            Debug.debug("element[" + i + "]:" + element.getElementDescription()
                    + " (" + element.offset + " + " + element.length + " = "
                    + (element.offset + element.length) + ")");
            if (element instanceof TiffDirectory) {
                TiffDirectory dir = (TiffDirectory) element;
                Debug.debug("\t" + "next Directory Offset: "
                        + dir.nextDirectoryOffset);
            }
            last = element.offset + element.length;
        }
        Debug.debug();
    }

    private List<TiffElement> analyzeOldTiff() throws ImageWriteException,
            IOException {
        try {
            ByteSource byteSource = new ByteSourceArray(exifBytes);
            Map params = null;
            FormatCompliance formatCompliance = FormatCompliance.getDefault();
            TiffContents contents = new TiffReader(false).readContents(
                    byteSource, params, formatCompliance);

            List<TiffElement> elements = new ArrayList<TiffElement>();
            // result.add(contents.header); // ?

            List<TiffDirectory> directories = contents.directories;
            for (int d = 0; d < directories.size(); d++) {
                TiffDirectory directory = directories.get(d);
                elements.add(directory);

                List<TiffField> fields = directory.getDirectoryEntrys();
                for (int f = 0; f < fields.size(); f++) {
                    TiffField field = fields.get(f);
                    if (field.tag == ExifTagConstants.EXIF_TAG_MAKER_NOTE.tag) {
                        // Some maker notes reference values stored
                        // inside the maker note itself
                        // using addresses relative to the beginning
                        // of the TIFF file, making it impossible
                        // to move the note to a different location.
                        // To avoid corrupting these maker notes,
                        // pretend all maker notes are a gap in the file
                        // that must be preserved, so the copy that
                        // will be written later will reference
                        // the old copy's values. Happy days.
                        continue;
                    }
                    TiffElement oversizeValue = field.getOversizeValueElement();
                    if (oversizeValue != null) {
                        elements.add(oversizeValue);
                    }
                }

                JpegImageData jpegImageData = directory.getJpegImageData();
                if (jpegImageData != null) {
                    elements.add(jpegImageData);
                }

                TiffImageData tiffImageData = directory.getTiffImageData();
                if (tiffImageData != null) {
                    TiffElement.DataElement data[] = tiffImageData
                            .getImageData();
                    for (int i = 0; i < data.length; i++) {
                        elements.add(data[i]);
                    }
                }
            }

            Collections.sort(elements, TiffElement.COMPARATOR);

            // dumpElements(byteSource, elements);

            List<TiffElement> result = new ArrayList<TiffElement>();
            {
                final int TOLERANCE = 3;
                // int last = TIFF_HEADER_SIZE;
                TiffElement start = null;
                int index = -1;
                for (int i = 0; i < elements.size(); i++) {
                    TiffElement element = elements.get(i);
                    int lastElementByte = element.offset + element.length;
                    if (start == null) {
                        start = element;
                        index = lastElementByte;
                    } else if (element.offset - index > TOLERANCE) {
                        result.add(new TiffElement.Stub(start.offset, index
                                - start.offset));
                        start = element;
                        index = lastElementByte;
                    } else {
                        index = lastElementByte;
                    }
                }
                if (null != start) {
                    result.add(new TiffElement.Stub(start.offset, index
                            - start.offset));
                }
            }

            // dumpElements(byteSource, result);

            return result;
        } catch (ImageReadException e) {
            throw new ImageWriteException(e.getMessage(), e);
        }
    }

    @Override
    public void write(OutputStream os, TiffOutputSet outputSet)
            throws IOException, ImageWriteException {
        List<TiffElement> analysis = analyzeOldTiff();
        int oldLength = exifBytes.length;
        if (analysis.size() < 1) {
            throw new ImageWriteException("Couldn't analyze old tiff data.");
        } else if (analysis.size() == 1) {
            TiffElement onlyElement = analysis.get(0);
            // Debug.debug("onlyElement", onlyElement.getElementDescription());
            if (onlyElement.offset == TIFF_HEADER_SIZE
                    && onlyElement.offset + onlyElement.length
                            + TIFF_HEADER_SIZE == oldLength) {
                // no gaps in old data, safe to complete overwrite.
                new TiffImageWriterLossy(byteOrder).write(os, outputSet);
                return;
            }
        }

        // if (true)
        // throw new ImageWriteException("hahah");

        // List directories = outputSet.getDirectories();

        TiffOutputSummary outputSummary = validateDirectories(outputSet);

        List<TiffOutputItem> outputItems = outputSet
                .getOutputItems(outputSummary);

        int outputLength = updateOffsetsStep(analysis, outputItems);
        // Debug.debug("outputLength", outputLength);

        outputSummary.updateOffsets(byteOrder);

        writeStep(os, outputSet, analysis, outputItems, outputLength);

    }

    private static final Comparator<TiffElement> ELEMENT_SIZE_COMPARATOR = new Comparator<TiffElement>() {
        public int compare(TiffElement e1, TiffElement e2) {
            return e1.length - e2.length;
        }
    };

    private static final Comparator<TiffOutputItem> ITEM_SIZE_COMPARATOR = new Comparator<TiffOutputItem>() {
        public int compare(TiffOutputItem e1, TiffOutputItem e2) {
            return e1.getItemLength() - e2.getItemLength();
        }
    };

    private int updateOffsetsStep(List<TiffElement> analysis,
            List<TiffOutputItem> outputItems) {
        // items we cannot fit into a gap, we shall append to tail.
        int overflowIndex = exifBytes.length;

        // make copy.
        List<TiffElement> unusedElements = new ArrayList<TiffElement>(analysis);

        // should already be in order of offset, but make sure.
        Collections.sort(unusedElements, TiffElement.COMPARATOR);
        Collections.reverse(unusedElements);
        // any items that represent a gap at the end of the exif segment, can be
        // discarded.
        while (unusedElements.size() > 0) {
            TiffElement element = unusedElements.get(0);
            int elementEnd = element.offset + element.length;
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

        // Debug.debug("unusedElements");
        // dumpElements(unusedElements);

        // make copy.
        List<TiffOutputItem> unplacedItems = new ArrayList<TiffOutputItem>(
                outputItems);
        Collections.sort(unplacedItems, ITEM_SIZE_COMPARATOR);
        Collections.reverse(unplacedItems);

        while (unplacedItems.size() > 0) {
            // pop off largest unplaced item.
            TiffOutputItem outputItem = unplacedItems.remove(0);
            int outputItemLength = outputItem.getItemLength();
            // Debug.debug("largest unplaced item: "
            // + outputItem.getItemDescription() + " (" + outputItemLength
            // + ")");

            // search for the smallest possible element large enough to hold the
            // item.
            TiffElement bestFit = null;
            for (int i = 0; i < unusedElements.size(); i++) {
                TiffElement element = unusedElements.get(i);
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
                    int excessOffset = bestFit.offset + outputItemLength;
                    int excessLength = bestFit.length - outputItemLength;
                    unusedElements.add(new TiffElement.Stub(excessOffset,
                            excessLength));
                    // make sure the new element is in the correct order.
                    Collections.sort(unusedElements, ELEMENT_SIZE_COMPARATOR);
                    Collections.reverse(unusedElements);
                }
            }
        }

        return overflowIndex;
        //
        // if (true)
        // throw new IOException("mew");
        //
        // // int offset = TIFF_HEADER_SIZE;
        // int offset = exifBytes.length;
        //
        // for (int i = 0; i < outputItems.size(); i++)
        // {
        // TiffOutputItem outputItem = (TiffOutputItem) outputItems.get(i);
        //
        // outputItem.setOffset(offset);
        // int itemLength = outputItem.getItemLength();
        // offset += itemLength;
        //
        // int remainder = imageDataPaddingLength(itemLength);
        // offset += remainder;
        // }
    }

    private static class BufferOutputStream extends OutputStream {
        private final byte buffer[];
        private int index;

        public BufferOutputStream(final byte[] buffer, final int index) {
            this.buffer = buffer;
            this.index = index;
        }

        @Override
        public void write(int b) throws IOException {
            if (index >= buffer.length) {
                throw new IOException("Buffer overflow.");
            }

            buffer[index++] = (byte) b;
        }

        @Override
        public void write(byte b[], int off, int len) throws IOException {
            if (index + len > buffer.length) {
                throw new IOException("Buffer overflow.");
            }
            System.arraycopy(b, off, buffer, index, len);
            index += len;
        }
    }

    private void writeStep(OutputStream os, TiffOutputSet outputSet,
            List<TiffElement> analysis, List<TiffOutputItem> outputItems,
            int outputLength) throws IOException, ImageWriteException {
        TiffOutputDirectory rootDirectory = outputSet.getRootDirectory();

        byte output[] = new byte[outputLength];

        // copy old data (including maker notes, etc.)
        System.arraycopy(exifBytes, 0, output, 0,
                Math.min(exifBytes.length, output.length));

        // bos.write(exifBytes, TIFF_HEADER_SIZE, exifBytes.length
        // - TIFF_HEADER_SIZE);

        {
            BufferOutputStream tos = new BufferOutputStream(output, 0);
            BinaryOutputStream bos = new BinaryOutputStream(tos, byteOrder);
            writeImageFileHeader(bos, rootDirectory.getOffset());
        }

        // zero out the parsed pieces of old exif segment, in case we don't
        // overwrite them.
        for (int i = 0; i < analysis.size(); i++) {
            TiffElement element = analysis.get(i);
            for (int j = 0; j < element.length; j++) {
                int index = element.offset + j;
                if (index < output.length) {
                    output[index] = 0;
                }
            }
        }

        // write in the new items
        for (int i = 0; i < outputItems.size(); i++) {
            TiffOutputItem outputItem = outputItems.get(i);

            BufferOutputStream tos = new BufferOutputStream(output,
                    outputItem.getOffset());
            BinaryOutputStream bos = new BinaryOutputStream(tos, byteOrder);
            outputItem.writeItem(bos);
        }

        os.write(output);
    }

}
