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
package org.apache.commons.imaging.formats.gif;

final class ImageDescriptor extends GifBlock {

    final int imageLeftPosition;
    final int imageTopPosition;
    final int imageWidth;
    final int imageHeight;
    final byte packedFields;
    final boolean localColorTableFlag;
    final boolean interlaceFlag;
    final boolean sortFlag;
    final byte sizeOfLocalColorTable;

    final byte[] localColorTable;
    final byte[] imageData;

    ImageDescriptor(final int blockCode, final int imageLeftPosition, final int imageTopPosition, final int imageWidth, final int imageHeight,
            final byte packedFields, final boolean localColorTableFlag, final boolean interlaceFlag, final boolean sortFlag, final byte sizeofLocalColorTable,
            final byte[] localColorTable, final byte[] imageData) {
        super(blockCode);

        this.imageLeftPosition = imageLeftPosition;
        this.imageTopPosition = imageTopPosition;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.packedFields = packedFields;
        this.localColorTableFlag = localColorTableFlag;
        this.interlaceFlag = interlaceFlag;
        this.sortFlag = sortFlag;
        this.sizeOfLocalColorTable = sizeofLocalColorTable;

        this.localColorTable = localColorTable;
        this.imageData = imageData;
    }
}
