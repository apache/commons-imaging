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

import org.apache.commons.imaging.common.ImageMetadata;

public class GifImageMetadataItem implements ImageMetadata.ImageMetadataItem {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int delay;
    private final int leftPosition;
    private final int topPosition;
    private final DisposalMethod disposalMethod;

    GifImageMetadataItem(int delay, int leftPosition, int topPosition, DisposalMethod disposalMethod) {
        this.delay = delay;
        this.leftPosition = leftPosition;
        this.topPosition = topPosition;
        this.disposalMethod = disposalMethod;
    }

    public int getDelay() {
        return delay;
    }

    public int getLeftPosition() {
        return leftPosition;
    }

    public int getTopPosition() {
        return topPosition;
    }

    public DisposalMethod getDisposalMethod() {
        return disposalMethod;
    }

    @Override
    public String toString(String prefix) {
        prefix = prefix == null ? "" : prefix;
        final StringBuilder result = new StringBuilder();
        result.append(String.format("%sDelay: %d%s", prefix, delay, NEWLINE));
        result.append(String.format("%sLeft position: %d%s", prefix, leftPosition, NEWLINE));
        result.append(String.format("%sTop position: %d%s", prefix, topPosition, NEWLINE));
        result.append(String.format("%sDisposal method: %s%s", prefix, disposalMethod, NEWLINE));
        return result.toString();
    }
}
