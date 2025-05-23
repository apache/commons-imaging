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

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;

final class TiffOutputSummary {
    private static final class OffsetItem {
        public final AbstractTiffOutputItem item;
        public final TiffOutputField itemOffsetField;

        OffsetItem(final AbstractTiffOutputItem item, final TiffOutputField itemOffsetField) {
            this.itemOffsetField = itemOffsetField;
            this.item = item;
        }
    }

    public final ByteOrder byteOrder;
    public final TiffOutputDirectory rootDirectory;
    public final Map<Integer, TiffOutputDirectory> directoryTypeMap;
    private final List<OffsetItem> offsetItems = new ArrayList<>();

    private final List<ImageDataOffsets> imageDataItems = new ArrayList<>();

    TiffOutputSummary(final ByteOrder byteOrder, final TiffOutputDirectory rootDirectory, final Map<Integer, TiffOutputDirectory> directoryTypeMap) {
        this.byteOrder = byteOrder;
        this.rootDirectory = rootDirectory;
        this.directoryTypeMap = directoryTypeMap;
    }

    public void add(final AbstractTiffOutputItem item, final TiffOutputField itemOffsetField) {
        offsetItems.add(new OffsetItem(item, itemOffsetField));
    }

    public void addTiffImageData(final ImageDataOffsets imageDataInfo) {
        imageDataItems.add(imageDataInfo);
    }

    public void updateOffsets(final ByteOrder byteOrder) throws ImagingException {
        for (final OffsetItem offset : offsetItems) {
            final byte[] value = AbstractFieldType.LONG.writeData((int) offset.item.getOffset(), byteOrder);
            offset.itemOffsetField.setData(value);
        }

        for (final ImageDataOffsets imageDataInfo : imageDataItems) {
            for (int j = 0; j < imageDataInfo.outputItems.length; j++) {
                final AbstractTiffOutputItem item = imageDataInfo.outputItems[j];
                imageDataInfo.imageDataOffsets[j] = (int) item.getOffset();
            }

            imageDataInfo.imageDataOffsetsField.setData(AbstractFieldType.LONG.writeData(imageDataInfo.imageDataOffsets, byteOrder));
        }
    }

}
