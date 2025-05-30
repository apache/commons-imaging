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
package org.apache.commons.imaging.formats.png.transparencyfilters;

import java.io.IOException;

import org.apache.commons.imaging.ImagingException;

public class TransparencyFilterIndexedColor extends AbstractTransparencyFilter {

    public TransparencyFilterIndexedColor(final byte[] bytes) {
        super(bytes);
    }

    @Override
    public int filter(final int rgb, final int index) throws ImagingException, IOException {
        final int length = getLength();
        if (index >= length) { // TODO see below - is this check correct?
            return rgb;
        }

        if (index < 0 || index > length) { // TODO check for > length cannot be true because of check above
            throw new ImagingException("TransparencyFilterIndexedColor index: " + index + ", bytes.length: " + length);
        }

        final int alpha = getByte(index);
        return (0xff & alpha) << 24 | 0x00ffffff & rgb;
    }
}
