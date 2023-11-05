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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

final class GenericGifBlock extends GifBlock {
    final List<byte[]> subBlocks;

    GenericGifBlock(final int blockCode, final List<byte[]> subBlocks) {
        super(blockCode);

        this.subBlocks = subBlocks;

    }

    public byte[] appendSubBlocks() throws IOException {
        return appendSubBlocks(false);
    }

    public byte[] appendSubBlocks(final boolean includeLengths) throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();

        for (int i = 0; i < subBlocks.size(); i++) {
            final byte[] subBlock = subBlocks.get(i);
            if (includeLengths && i > 0) {
                out.write(subBlock.length);
            }
            out.write(subBlock);
        }

        return out.toByteArray();
    }

}
