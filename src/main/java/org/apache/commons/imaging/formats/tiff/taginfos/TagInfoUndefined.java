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
package org.apache.commons.imaging.formats.tiff.taginfos;

import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;

/**
 * Tag info for undefined field type.
 */
public class TagInfoUndefined extends TagInfoByte {

    /**
     * Constructs a new instance.
     *
     * @param name the tag name.
     * @param tag the tag number.
     * @param directoryType the directory type.
     */
    public TagInfoUndefined(final String name, final int tag, final TiffDirectoryType directoryType) {
        super(name, tag, AbstractFieldType.UNDEFINED, directoryType);
    }
}
