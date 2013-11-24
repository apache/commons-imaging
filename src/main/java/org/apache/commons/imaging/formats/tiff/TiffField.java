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

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.formats.tiff.constants.AllTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/**
 * A TIFF field in a TIFF directory. Immutable.
 */
public class TiffField {
    private final TagInfo tagInfo;
    private final int tag;
    private final int directoryType;
    private final FieldType fieldType;
    private final long count;
    private final long offset;
    private final byte[] value;
    private final ByteOrder byteOrder;
    private final int sortHint;
    public static final String Attribute_Tag = "Tag";
    private static final Map<Object, List<TagInfo>> ALL_TAG_MAP = makeTagMap(
            AllTagConstants.ALL_TAGS);

    public TiffField(final int tag, final int directoryType, final FieldType fieldType,
            final long count, final long offset, final byte[] value,
            final ByteOrder byteOrder, final int sortHint){

        this.tag = tag;
        this.directoryType = directoryType;
        this.fieldType = fieldType;
        this.count = count;
        this.offset = offset;
        this.value = value;
        this.byteOrder = byteOrder;
        this.sortHint = sortHint;

        tagInfo = getTag(directoryType, tag);
    }
    
    public int getDirectoryType() {
        return directoryType;
    }
    
    public TagInfo getTagInfo() {
        return tagInfo;
    }

    /**
     * Returns the field's tag, derived from bytes 0-1.
     * @return the tag, as an <code>int</code> in which only the lowest 2 bytes are set 
     */
    public int getTag() {
        return tag;
    }
    
    /**
     * Returns the field's type, derived from bytes 2-3.
     * @return the field's type, as a {@code FieldType} object.
     */
    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * Returns the field's count, derived from bytes 4-7.
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * Returns the TIFF field's offset/value field, derived from bytes 8-11.
     * @return the field's offset in a <code>long</code> of 4 packed bytes,
     * or its inlined value <= 4 bytes long encoded in the field's byte order.
     */
    public int getOffset() {
        return (int)offset;
    }

    /**
     * Returns the field's byte order.
     * @return the byte order
     */
    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    public int getSortHint() {
        return sortHint;
    }

    /**
     * Indicates whether the field's value is inlined into the offset field.
     * @return true if the value is inlined
     */
    public boolean isLocalValue() {
        return (count * fieldType.getSize()) <= TiffConstants.TIFF_ENTRY_MAX_VALUE_LENGTH;
    }

    /**
     * The length of the field's value.
     * @return the length, in bytes.
     */
    public int getBytesLength() {
        return (int) count * fieldType.getSize();
    }

    /**
     * Returns a copy of the raw value of the field. 
     * @return the value of the field, in the byte order of the field.
     */
    public byte[] getByteArrayValue() {
        return BinaryFunctions.head(value, getBytesLength());
    }

    public final class OversizeValueElement extends TiffElement {
        public OversizeValueElement(final int offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription(final boolean verbose) {
            if (verbose) {
                return null;
            }

            return "OversizeValueElement, tag: " + getTagInfo().name
                    + ", fieldType: " + getFieldType().getName();
        }
    }

    public TiffElement getOversizeValueElement() {
        if (isLocalValue()) {
            return null;
        }

        return new OversizeValueElement(getOffset(), value.length);
    }

    private static TagInfo getTag(final int directoryType, final List<TagInfo> possibleMatches) {
        // Please keep this method in sync with TiffImageMetadata's findField()

        if (possibleMatches.size() < 1) {
            return null;
        }
        // else if (possibleMatches.size() == 1)
        // {
        // TagInfo tagInfo = (TagInfo) possibleMatches.get(0);
        // return tagInfo;
        // }

        // first search for exact match.
        for (int i = 0; i < possibleMatches.size(); i++) {
            final TagInfo tagInfo = possibleMatches.get(i);
            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                // pass
                continue;
            } else if (directoryType == tagInfo.directoryType.directoryType) {
                return tagInfo;
            }
        }

        // accept an inexact match.
        for (int i = 0; i < possibleMatches.size(); i++) {
            final TagInfo tagInfo = possibleMatches.get(i);

            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                // pass
                continue;
            } else if (directoryType >= 0
                    && tagInfo.directoryType.isImageDirectory()) {
                return tagInfo;
            } else if (directoryType < 0
                    && !tagInfo.directoryType.isImageDirectory()) {
                return tagInfo;
            }
        }

        // accept a wildcard match.
        for (int i = 0; i < possibleMatches.size(); i++) {
            final TagInfo tagInfo = possibleMatches.get(i);

            if (tagInfo.directoryType == TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
                return tagInfo;
            }
        }

        // // accept a very rough match.
        // for (int i = 0; i < possibleMatches.size(); i++)
        // {
        // TagInfo tagInfo = (TagInfo) possibleMatches.get(i);
        // if (tagInfo.exifDirectory == EXIF_DIRECTORY_UNKNOWN)
        // return tagInfo;
        // else if (directoryType == DIRECTORY_TYPE_EXIF
        // && tagInfo.exifDirectory == EXIF_DIRECTORY_EXIF_IFD)
        // return tagInfo;
        // else if (directoryType == DIRECTORY_TYPE_INTEROPERABILITY
        // && tagInfo.exifDirectory == EXIF_DIRECTORY_INTEROP_IFD)
        // return tagInfo;
        // else if (directoryType == DIRECTORY_TYPE_GPS
        // && tagInfo.exifDirectory == EXIF_DIRECTORY_GPS)
        // return tagInfo;
        // else if (directoryType == DIRECTORY_TYPE_MAKER_NOTES
        // && tagInfo.exifDirectory == EXIF_DIRECTORY_MAKER_NOTES)
        // return tagInfo;
        // else if (directoryType >= 0
        // && tagInfo.exifDirectory.isImageDirectory())
        // return tagInfo;
        // else if (directoryType < 0
        // && !tagInfo.exifDirectory.isImageDirectory())
        // return tagInfo;
        // }

        return TiffTagConstants.TIFF_TAG_UNKNOWN;

        // if (true)
        // throw new Error("Why didn't this algorithm work?");
        //
        // {
        // TagInfo tagInfo = (TagInfo) possibleMatches.get(0);
        // return tagInfo;
        // }

        // Object key = new Integer(tag);
        //
        // if (directoryType == DIRECTORY_TYPE_EXIF
        // || directoryType == DIRECTORY_TYPE_INTEROPERABILITY)
        // {
        // if (EXIF_TAG_MAP.containsKey(key))
        // return (TagInfo) EXIF_TAG_MAP.get(key);
        // }
        // else if (directoryType == DIRECTORY_TYPE_GPS)
        // {
        // if (GPS_TAG_MAP.containsKey(key))
        // return (TagInfo) GPS_TAG_MAP.get(key);
        // }
        // else
        // {
        // if (TIFF_TAG_MAP.containsKey(key))
        // return (TagInfo) TIFF_TAG_MAP.get(key);
        // }
        //
        // if (ALL_TAG_MAP.containsKey(key))
        // return (TagInfo) ALL_TAG_MAP.get(key);

        // public static final int DIRECTORY_TYPE_EXIF = -2;
        // // public static final int DIRECTORY_TYPE_SUB = 5;
        // public static final int DIRECTORY_TYPE_GPS = -3;
        // public static final int DIRECTORY_TYPE_INTEROPERABILITY = -4;
        //
        // private static final Map GPS_TAG_MAP = makeTagMap(ALL_GPS_TAGS,
        // false);
        // private static final Map TIFF_TAG_MAP = makeTagMap(ALL_TIFF_TAGS,
        // false);
        // private static final Map EXIF_TAG_MAP = makeTagMap(ALL_EXIF_TAGS,
        // false);
        // private static final Map ALL_TAG_MAP = makeTagMap(ALL_TAGS, true);
        //
        // for (int i = 0; i < ALL_TAGS.length; i++)
        // {
        // TagInfo2 tag = ALL_TAGS[i];
        // if (tag.tag == value)
        // return tag;
        // }

        // return TIFF_TAG_UNKNOWN;
    }

    private static TagInfo getTag(final int directoryType, final int tag) {
        final List<TagInfo> possibleMatches = ALL_TAG_MAP.get(tag);

        if (null == possibleMatches) {
            return TiffTagConstants.TIFF_TAG_UNKNOWN;
        }

        final TagInfo result = getTag(directoryType, possibleMatches);
        return result;
    }

    public String getValueDescription() {
        try {
            return getValueDescription(getValue());
        } catch (final ImageReadException e) {
            return "Invalid value: " + e.getMessage();
        }
    }

    private String getValueDescription(final Object o) {
        if (o == null) {
            return null;
        }

        if (o instanceof Number) {
            return o.toString();
        } else if (o instanceof String) {
            return "'" + o.toString().trim() + "'";
        } else if (o instanceof Date) {
            final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
            return df.format((Date) o);
        } else if (o instanceof Object[]) {
            final Object objects[] = (Object[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < objects.length; i++) {
                final Object object = objects[i];

                if (i > 50) {
                    result.append("... (" + objects.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(object.toString());
            }
            return result.toString();
        // } else if (o instanceof Number[])
        // {
        // Number numbers[] = (Number[]) o;
        // StringBuffer result = new StringBuffer();
        //
        // for (int i = 0; i < numbers.length; i++)
        // {
        // Number number = numbers[i];
        //
        // if (i > 0)
        // result.append(", ");
        // result.append("" + number);
        // }
        // return result.toString();
        // }
        } else if (o instanceof short[]) {
            final short values[] = (short[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final short sval = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Short.toString(sval));
            }
            return result.toString();
        } else if (o instanceof int[]) {
            final int values[] = (int[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final int iVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Integer.toString(iVal));
            }
            return result.toString();
        } else if (o instanceof long[]) {
            final long values[] = (long[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final long lVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Long.toString(lVal));
            }
            return result.toString();
        } else if (o instanceof double[]) {
            final double values[] = (double[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final double dVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Double.toString(dVal));
            }
            return result.toString();
        } else if (o instanceof byte[]) {
            final byte values[] = (byte[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final byte bVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Byte.toString(bVal));
            }
            return result.toString();
        } else if (o instanceof char[]) {
            final char values[] = (char[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final char cVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Character.toString(cVal));
            }
            return result.toString();
        } else if (o instanceof float[]) {
            final float values[] = (float[]) o;
            final StringBuffer result = new StringBuffer();

            for (int i = 0; i < values.length; i++) {
                final float fVal = values[i];

                if (i > 50) {
                    result.append("... (" + values.length + ")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(Float.toString(fVal));
            }
            return result.toString();
        }
        // else if (o instanceof short[])
        // {
        // short numbers[] = (short[]) o;
        // StringBuffer result = new StringBuffer();
        //
        // for (int i = 0; i < numbers.length; i++)
        // {
        // short number = numbers[i];
        //
        // if (i > 0)
        // result.append(", ");
        // result.append("" + number);
        // }
        // return result.toString();
        // }

        return "Unknown: " + o.getClass().getName();
    }

    public void dump() {
        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset()));
        dump(pw);
        pw.flush();
    }

    public void dump(final PrintWriter pw) {
        dump(pw, null);
    }

    public void dump(final PrintWriter pw, final String prefix) {
        if (prefix != null) {
            pw.print(prefix + ": ");
        }

        pw.println(toString());
        pw.flush();
    }

    public String getDescriptionWithoutValue() {
        return getTag() + " (0x" + Integer.toHexString(getTag()) + ": " + getTagInfo().name
                + "): ";
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();

        result.append(getTag() + " (0x" + Integer.toHexString(getTag()) + ": "
                + getTagInfo().name + "): ");
        result.append(getValueDescription() + " (" + getCount() + " "
                + getFieldType().getName() + ")");

        return result.toString();
    }

    public String getTagName() {
        if (getTagInfo() == TiffTagConstants.TIFF_TAG_UNKNOWN) {
            return getTagInfo().name + " (0x" + Integer.toHexString(getTag()) + ")";
        }
        return getTagInfo().name;
    }

    public String getFieldTypeName() {
        return getFieldType().getName();
    }

    public Object getValue() throws ImageReadException {
        // System.out.print("getValue");
        return getTagInfo().getValue(this);
    }

    public String getStringValue() throws ImageReadException {
        final Object o = getValue();
        if (o == null) {
            return null;
        }
        if (!(o instanceof String)) {
            throw new ImageReadException("Expected String value("
                    + getTagInfo().getDescription() + "): " + o);
        }
        return (String) o;
    }

    private static final Map<Object, List<TagInfo>> makeTagMap(
            final List<TagInfo> tags) {
        // make sure to use the thread-safe version; this is shared state.
        final Map<Object, List<TagInfo>> map = new Hashtable<Object, List<TagInfo>>();

        for (int i = 0; i < tags.size(); i++) {
            final TagInfo tag = tags.get(i);

            List<TagInfo> tagList = map.get(tag.tag);
            if (tagList == null) {
                tagList = new ArrayList<TagInfo>();
                map.put(tag.tag, tagList);
            }
            tagList.add(tag);
        }

        return map;
    }

    public int[] getIntArrayValue() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return null;

        if (o instanceof Number) {
            return new int[] { ((Number) o).intValue() };
        } else if (o instanceof Number[]) {
            final Number numbers[] = (Number[]) o;
            final int result[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i].intValue();
            }
            return result;
        } else if (o instanceof short[]) {
            final short numbers[] = (short[]) o;
            final int result[] = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = 0xffff & numbers[i];
            }
            return result;
        } else if (o instanceof int[]) {
            final int numbers[] = (int[]) o;
            final int result[] = new int[numbers.length];
            System.arraycopy(numbers, 0, result, 0, numbers.length);
            return result;
        }

        throw new ImageReadException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return null;
    }

    public double[] getDoubleArrayValue() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return null;

        if (o instanceof Number) {
            return new double[] { ((Number) o).doubleValue() };
        } else if (o instanceof Number[]) {
            final Number numbers[] = (Number[]) o;
            final double result[] = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i].doubleValue();
            }
            return result;
        } else if (o instanceof short[]) {
            final short numbers[] = (short[]) o;
            final double result[] = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i];
            }
            return result;
        } else if (o instanceof int[]) {
            final int numbers[] = (int[]) o;
            final double result[] = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i];
            }
            return result;
        } else if (o instanceof float[]) {
            final float numbers[] = (float[]) o;
            final double result[] = new double[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                result[i] = numbers[i];
            }
            return result;
        } else if (o instanceof double[]) {
            final double numbers[] = (double[]) o;
            final double result[] = new double[numbers.length];
            System.arraycopy(numbers, 0, result, 0, numbers.length);
            return result;
        }

        throw new ImageReadException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return null;
    }

    public int getIntValueOrArraySum() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return -1;

        if (o instanceof Number) {
            return ((Number) o).intValue();
        } else if (o instanceof Number[]) {
            final Number numbers[] = (Number[]) o;
            int sum = 0;
            for (final Number number : numbers) {
                sum += number.intValue();
            }
            return sum;
        } else if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            int sum = 0;
            for (final short number : numbers) {
                sum += number;
            }
            return sum;
        } else if (o instanceof int[]) {
            final int numbers[] = (int[]) o;
            int sum = 0;
            for (final int number : numbers) {
                sum += number;
            }
            return sum;
        }

        throw new ImageReadException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return -1;
    }

    public int getIntValue() throws ImageReadException {
        final Object o = getValue();
        if (o == null) {
            throw new ImageReadException("Missing value: "
                    + getTagInfo().getDescription());
        }

        return ((Number) o).intValue();
    }

    public double getDoubleValue() throws ImageReadException {
        final Object o = getValue();
        if (o == null) {
            throw new ImageReadException("Missing value: "
                    + getTagInfo().getDescription());
        }

        return ((Number) o).doubleValue();
    }
}
