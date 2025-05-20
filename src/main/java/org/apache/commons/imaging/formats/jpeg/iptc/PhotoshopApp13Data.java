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

package org.apache.commons.imaging.formats.jpeg.iptc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhotoshopApp13Data {
    private final boolean forceUtf8Encoding;
    private final List<IptcRecord> records;
    private final List<IptcBlock> rawBlocks;

    public PhotoshopApp13Data(final List<IptcRecord> records, final List<IptcBlock> rawBlocks) {
        this(records, rawBlocks, false);
    }

    public PhotoshopApp13Data(final List<IptcRecord> records, final List<IptcBlock> rawBlocks, final boolean forceUtf8Encoding) {
        this.rawBlocks = rawBlocks == null ? Collections.emptyList() : Collections.unmodifiableList(rawBlocks);
        this.records = records == null ? Collections.emptyList() : Collections.unmodifiableList(records);
        this.forceUtf8Encoding = forceUtf8Encoding;
    }

    public List<IptcBlock> getNonIptcBlocks() {
        final List<IptcBlock> result = new ArrayList<>();
        for (final IptcBlock block : rawBlocks) {
            if (!block.isIptcBlock()) {
                result.add(block);
            }
        }
        return result;
    }

    public List<IptcBlock> getRawBlocks() {
        return new ArrayList<>(rawBlocks);
    }

    public List<IptcRecord> getRecords() {
        return new ArrayList<>(records);
    }

    public boolean isForceUtf8Encoding() {
        return forceUtf8Encoding;
    }

}
