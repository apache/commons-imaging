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
package org.apache.commons.imaging.formats.png;

/**
 * Interlace methods.
 *
 * @see <a href="https://www.w3.org/TR/png/#8Interlace">Portable Network Graphics Specification - Interlacing and pass extraction</a>
 */
public enum InterlaceMethod {

    /** No interlacing. */
    NONE(false),
    /** Adam7 interlacing. */
    ADAM7(true);

    private final boolean progressive;

    InterlaceMethod(final boolean progressive) {
        this.progressive = progressive;
    }

    /**
     * Checks if this interlace method is progressive.
     *
     * @return true if progressive, false otherwise.
     */
    public boolean isProgressive() {
        return progressive;
    }
}
