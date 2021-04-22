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
package org.apache.commons.imaging.formats.pnm;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImagingParameters;

/**
 * Pnm format parameters.
 * @since 1.0-alpha3
 */
public class PnmImagingParameters extends ImagingParameters {

    private boolean rawBits = true;
    /**
     * Pnm format subtype (e.g. pam, pbm, etc).
     */
    private ImageFormats subtype = null;

    public PnmImagingParameters() {
        setImageFormat(ImageFormats.PNM);
    }

    public boolean isRawBits() {
        return rawBits;
    }

    public void setRawBits(boolean rawBits) {
        this.rawBits = rawBits;
    }

    public ImageFormats getSubtype() {
        return subtype;
    }

    public void setSubtype(ImageFormats subtype) {
        this.subtype = subtype;
    }
}
