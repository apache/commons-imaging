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
package org.apache.commons.imaging.formats.tiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.internal.Debug;

public class TiffContents {

    public final TiffHeader header;
    public final List<TiffDirectory> directories;
    public final List<TiffField> tiffFields;

    public TiffContents(final TiffHeader tiffHeader, final List<TiffDirectory> directories, final List<TiffField> tiffFields) {
        this.header = tiffHeader;
        this.directories = Collections.unmodifiableList(directories);
        this.tiffFields = Collections.unmodifiableList(tiffFields);
    }

    public void dissect() throws ImagingException {
        final List<TiffElement> elements = getElements();

        elements.sort(TiffElement.COMPARATOR);

        long lastEnd = 0;
        for (final TiffElement element : elements) {
            if (element.offset > lastEnd) {
                Debug.debug("\t" + "gap: " + (element.offset - lastEnd));
            }
            if (element.offset < lastEnd) {
                Debug.debug("\t" + "overlap");
            }

            Debug.debug("element, start: " + element.offset + ", length: "
                    + element.length + ", end: "
                    + (element.offset + element.length) + ": "
                    + element.getElementDescription());
            final String verbosity = element.getElementDescription();
            if (null != verbosity) {
                Debug.debug(verbosity);
            }

            lastEnd = element.offset + element.length;
        }
        Debug.debug("end: " + lastEnd);
        Debug.debug();
    }

    public TiffField findField(final TagInfo tag) throws ImagingException {
        for (final TiffDirectory directory : directories) {
            final TiffField field = directory.findField(tag);
            if (null != field) {
                return field;
            }
        }

        return null;
    }

    public List<TiffElement> getElements() throws ImagingException {
        final List<TiffElement> result = new ArrayList<>();

        result.add(header);

        for (final TiffDirectory directory : directories) {
            result.add(directory);

            for (final TiffField field : directory) {
                final TiffElement oversizeValue = field.getOversizeValueElement();
                if (null != oversizeValue) {
                    result.add(oversizeValue);
                }
            }

            if (directory.hasTiffImageData()) {
                result.addAll(directory.getTiffRawImageDataElements());
            }
            if (directory.hasJpegImageData()) {
                result.add(directory.getJpegRawImageDataElement());
            }
        }

        return result;
    }

}
