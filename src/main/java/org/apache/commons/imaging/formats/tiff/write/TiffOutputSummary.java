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

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;

class TiffOutputSummary {
    public final ByteOrder byteOrder;
    public final TiffOutputDirectory rootDirectory;
    public final Map<Integer, TiffOutputDirectory> directoryTypeMap;
    private final List<OffsetItem> offsetItems = new ArrayList<OffsetItem>();
    private final List<ImageDataOffsets> imageDataItems = new ArrayList<ImageDataOffsets>();
    
    public TiffOutputSummary(final ByteOrder byteOrder,
            final TiffOutputDirectory rootDirectory,
            final Map<Integer, TiffOutputDirectory> directoryTypeMap) {
        this.byteOrder = byteOrder;
        this.rootDirectory = rootDirectory;
        this.directoryTypeMap = directoryTypeMap;
    }

    private static class OffsetItem {
        public final TiffOutputItem item;
        public final TiffOutputField itemOffsetField;

        public OffsetItem(final TiffOutputItem item,
                final TiffOutputField itemOffsetField) {
            super();
            this.itemOffsetField = itemOffsetField;
            this.item = item;
        }
    }

    public void add(final TiffOutputItem item,
            final TiffOutputField itemOffsetField) {
        offsetItems.add(new OffsetItem(item, itemOffsetField));
    }

    public void updateOffsets(final ByteOrder byteOrder) throws ImageWriteException {
        for (OffsetItem offset : offsetItems) {
            final byte[] value = FieldType.LONG.writeData(
                    (int) offset.item.getOffset(), byteOrder);
            offset.itemOffsetField.setData(value);
        }

        for (ImageDataOffsets imageDataInfo : imageDataItems) {
            for (int j = 0; j < imageDataInfo.outputItems.length; j++) {
                final TiffOutputItem item = imageDataInfo.outputItems[j];
                imageDataInfo.imageDataOffsets[j] = (int) item.getOffset();
            }

            imageDataInfo.imageDataOffsetsField.setData(FieldType.LONG
                    .writeData(imageDataInfo.imageDataOffsets, byteOrder));
        }
    }

    public void addTiffImageData(final ImageDataOffsets imageDataInfo) {
        imageDataItems.add(imageDataInfo);
    }

}
