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

import java.util.Arrays;

import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.formats.tiff.AbstractTiffElement;

class ImageDataOffsets {
    final int[] imageDataOffsets;
    final TiffOutputField imageDataOffsetsField;
    final AbstractTiffOutputItem[] outputItems;

    ImageDataOffsets(final AbstractTiffElement.DataElement[] imageData, final int[] imageDataOffsets, final TiffOutputField imageDataOffsetsField) {
        this.imageDataOffsets = imageDataOffsets;
        this.imageDataOffsetsField = imageDataOffsetsField;

        outputItems = Allocator.array(imageData.length, AbstractTiffOutputItem[]::new, AbstractTiffOutputItem.Value.SHALLOW_SIZE);
        Arrays.setAll(outputItems, i -> new AbstractTiffOutputItem.Value("TIFF image data", imageData[i].getData()));

    }

}
