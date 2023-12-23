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
package org.apache.commons.imaging.palette;

/**
 * An RGBA (reg, green, blue, alpha) color space component enum.
 *
 * @since 1.0-alpha1
 */
enum ColorComponent {
    ALPHA(24), RED(16), GREEN(8), BLUE(0);

    private final int shift;

    ColorComponent(final int shift) {
        this.shift = shift;
    }

    public int argbComponent(final int argb) {
        return argb >> shift & 0xff;
    }
}
