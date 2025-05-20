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
package org.apache.commons.imaging.formats.webp;

import org.apache.commons.imaging.common.BinaryConstant;

/**
 * Constants used for the WebP image format.
 *
 * @since 1.0.0-alpha4
 */
public final class WebPConstants {

    /*
     * WebP_File_Header { uint8_t riff_signature[4]; // "RIFF" uint32_t file_size; uint8_t webp_signature[4]; // "WEBP" }
     */

    /**
     * The RIFF signature.
     */
    public static final BinaryConstant RIFF_SIGNATURE = new BinaryConstant(new byte[] { 'R', 'I', 'F', 'F' });

    /**
     * The WebP signature.
     */
    public static final BinaryConstant WEBP_SIGNATURE = new BinaryConstant(new byte[] { 'W', 'E', 'B', 'P' });

    private WebPConstants() {
    }
}
