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

package org.apache.commons.imaging.common;

import org.apache.commons.imaging.ImagingParameters;

/**
 * Parameters for formats that support Xmp.
 *
 * @param <E> this type
 * @since 1.0-alpha3
 */
public class XmpImagingParameters<E extends XmpImagingParameters<E>> extends ImagingParameters<E> {

    /**
     * Constructs a new instance.
     */
    public XmpImagingParameters() {
        // Default constructor
    }

    private String xmpXml;

    /**
     * Gets the XMP XML.
     *
     * @return the XMP XML.
     */
    public String getXmpXml() {
        return xmpXml;
    }

    /**
     * Sets the XMP XML.
     *
     * @param xmpXml the XMP XML.
     * @return this instance.
     */
    public E setXmpXml(final String xmpXml) {
        this.xmpXml = xmpXml;
        return asThis();
    }

}
