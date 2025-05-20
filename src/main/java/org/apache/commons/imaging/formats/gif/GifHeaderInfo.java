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
package org.apache.commons.imaging.formats.gif;

final class GifHeaderInfo {
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

    GifHeaderInfo(final byte identifier1, final byte identifier2, final byte identifier3, final byte version1, final byte version2, final byte version3,
            final int logicalScreenWidth, final int logicalScreenHeight, final byte packedFields, final byte backgroundColorIndex, final byte pixelAspectRatio,
            final boolean globalColorTableFlag, final byte colorResolution, final boolean sortFlag, final byte sizeOfGlobalColorTable) {
        this.identifier1 = identifier1;
        this.identifier2 = identifier2;
        this.identifier3 = identifier3;
        this.version1 = version1;
        this.version2 = version2;
        this.version3 = version3;
        this.logicalScreenWidth = logicalScreenWidth;
        this.logicalScreenHeight = logicalScreenHeight;
        this.packedFields = packedFields;
        this.backgroundColorIndex = backgroundColorIndex;
        this.pixelAspectRatio = pixelAspectRatio;
        this.globalColorTableFlag = globalColorTableFlag;
        this.colorResolution = colorResolution;
        this.sortFlag = sortFlag;
        this.sizeOfGlobalColorTable = sizeOfGlobalColorTable;
    }
}
