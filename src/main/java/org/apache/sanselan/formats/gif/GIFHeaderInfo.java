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
package org.apache.sanselan.formats.gif;

class GIFHeaderInfo
{
    public final byte identifier1;
    public final byte identifier2;
    public final byte identifier3;
    public final byte version1;
    public final byte version2;
    public final byte version3;

    public final int logicalScreenWidth;
    public final int logicalScreenHeight;
    public final byte packedFields;
    public final byte backgroundColorIndex;
    public final byte pixelAspectRatio;
    public final boolean globalColorTableFlag;
    public final byte colorResolution;
    public final boolean sortFlag;
    public final byte sizeOfGlobalColorTable;

    public GIFHeaderInfo(byte Identifier1, byte Identifier2, byte Identifier3,
            byte Version1, byte Version2, byte Version3,
            int LogicalScreenWidth, int LogicalScreenHeight, byte PackedFields,
            byte BackgroundColorIndex, byte PixelAspectRatio,
            boolean GlobalColorTableFlag, byte ColorResolution,
            boolean SortFlag, byte SizeofGlobalColorTable)
    {
        this.identifier1 = Identifier1;
        this.identifier2 = Identifier2;
        this.identifier3 = Identifier3;
        this.version1 = Version1;
        this.version2 = Version2;
        this.version3 = Version3;
        this.logicalScreenWidth = LogicalScreenWidth;
        this.logicalScreenHeight = LogicalScreenHeight;
        this.packedFields = PackedFields;
        this.backgroundColorIndex = BackgroundColorIndex;
        this.pixelAspectRatio = PixelAspectRatio;
        this.globalColorTableFlag = GlobalColorTableFlag;
        this.colorResolution = ColorResolution;
        this.sortFlag = SortFlag;
        this.sizeOfGlobalColorTable = SizeofGlobalColorTable;
    }
}