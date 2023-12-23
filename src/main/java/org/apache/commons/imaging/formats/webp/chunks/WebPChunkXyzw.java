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
package org.apache.commons.imaging.formats.webp.chunks;

import org.apache.commons.imaging.ImagingException;

/**
 * XYZW (unknown) chunk.
 *
 * @since 1.0-alpha4
 */
public final class WebPChunkXyzw extends WebPChunk {

    /**
     * Create a XYZW chunk.
     *
     * @param type  XYZW chunk type.
     * @param size  XYZW chunk size.
     * @param bytes XYZW chunk data.
     * @throws ImagingException if the chunk data and the size provided do not match.
     */
    public WebPChunkXyzw(final int type, final int size, final byte[] bytes) throws ImagingException {
        super(type, size, bytes);
    }
}
