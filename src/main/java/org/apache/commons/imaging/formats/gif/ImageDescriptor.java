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

public class ImageDescriptor extends GifBlock
{

    public final int imageLeftPosition;
    public final int imageTopPosition;
    public final int imageWidth;
    public final int imageHeight;
    public final byte packedFields;
    public final boolean localColorTableFlag;
    public final boolean interlaceFlag;
    public final boolean sortFlag;
    public final byte sizeOfLocalColorTable;

    public final byte localColorTable[];
    public final byte imageData[];

    public ImageDescriptor(int blockCode, int ImageLeftPosition,
            int ImageTopPosition, int ImageWidth, int ImageHeight,
            byte PackedFields, boolean LocalColorTableFlag,
            boolean InterlaceFlag, boolean SortFlag,
            byte SizeofLocalColorTable, byte LocalColorTable[],
            byte ImageData[])
    {
        super(blockCode);

        this.imageLeftPosition = ImageLeftPosition;
        this.imageTopPosition = ImageTopPosition;
        this.imageWidth = ImageWidth;
        this.imageHeight = ImageHeight;
        this.packedFields = PackedFields;
        this.localColorTableFlag = LocalColorTableFlag;
        this.interlaceFlag = InterlaceFlag;
        this.sortFlag = SortFlag;
        this.sizeOfLocalColorTable = SizeofLocalColorTable;

        this.localColorTable = LocalColorTable;
        this.imageData = ImageData;
    }
}