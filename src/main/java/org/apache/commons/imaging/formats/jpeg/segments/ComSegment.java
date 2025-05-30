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
package org.apache.commons.imaging.formats.jpeg.segments;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ComSegment extends AbstractGenericSegment {
    public ComSegment(final int marker, final byte[] segmentData) {
        super(marker, segmentData);
    }

    public ComSegment(final int marker, final int markerLength, final InputStream is) throws IOException {
        super(marker, markerLength, is);
    }

    /**
     * Returns a copy of the comment.
     *
     * @return a copy of the comment's bytes
     */
    public byte[] getComment() {
        return getSegmentData();
    }

    @Override
    public String getDescription() {
        return "COM (" + getSegmentDataAsString(StandardCharsets.UTF_8) + ")";
    }

}
