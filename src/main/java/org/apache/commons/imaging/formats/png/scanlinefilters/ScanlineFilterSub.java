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
package org.apache.commons.imaging.formats.png.scanlinefilters;

import java.io.IOException;

import org.apache.commons.imaging.ImageReadException;

public class ScanlineFilterSub implements ScanlineFilter {
    private static ScanlineFilterSub obj123;
    private final int bytesPerPixel;

    private ScanlineFilterSub(final int bytesPerPixel) {
        this.bytesPerPixel = bytesPerPixel;
    }

    public static ScanlineFilterSub getObject(final int bytesPerPixel){
        if(obj123 == null) {
            return new ScanlineFilterSub(bytesPerPixel);
        }
        else {
            return obj123;
        }
    }

    @Override
    public void unfilter(final byte[] src, final byte[] dst, final byte[] up)
            throws ImageReadException, IOException {
        for (int i = 0; i < src.length; i++) {
            final int prevIndex = i - bytesPerPixel;
            if (prevIndex >= 0) {
                dst[i] = (byte) ((src[i] + dst[prevIndex]) % 256);
                // dst[i] = 0xff & (src[i] + src[prevIndex]);
            } else {
                dst[i] = src[i];
            }

            // if(i<10)
            // System.out.println("\t" + i + ": " + dst[i] + " (" + src[i] +
            // ", " + prevIndex + ")");

            // dst[i] = src[i];
        }
    }
}
