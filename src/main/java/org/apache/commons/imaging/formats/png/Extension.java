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
 * PNG extension types.
 *
 * @since 1.0-alpha6
 */
enum Extension {
    /**
     * @see <a href="http://ftp-osl.osuosl.org/pub/libpng/documents/pngext-1.5.0.html">Extensions to the PNG 1.2 Specification, Version 1.5.0</a>
     */
    PNGEXT,

    /**
     * @see <a href="https://wiki.mozilla.org/APNG_Specification">APNG Specification</a>
     */
    APNG,
}
