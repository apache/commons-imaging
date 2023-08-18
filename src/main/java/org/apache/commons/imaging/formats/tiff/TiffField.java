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

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.AbstractFieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/**
 * A TIFF field in a TIFF directory. Immutable.
 */
public class TiffField {

    public final class OversizeValueElement extends AbstractTiffElement {
        public OversizeValueElement(final int offset, final int length) {
            super(offset, length);
        }

        @Override
        public String getElementDescription() {
            return "OversizeValueElement, tag: " + getTagInfo().name
                    + ", fieldType: " + getFieldType().getName();
        }
    }

    private static final Logger LOGGER = Logger.getLogger(TiffField.class.getName());
    private final TagInfo tagInfo;
    private final int tag;
    private final int directoryType;
    private final AbstractFieldType abstractFieldType;
    private final long count;
    private final long offset;
    private final byte[] value;
    private final ByteOrder byteOrder;

    private final int sortHint;

    public TiffField(final int tag, final int directoryType, final AbstractFieldType abstractFieldType,
            final long count, final long offset, final byte[] value,
            final ByteOrder byteOrder, final int sortHint) {

        this.tag = tag;
        this.directoryType = directoryType;
        this.abstractFieldType = abstractFieldType;
        this.count = count;
        this.offset = offset;
        this.value = value;
        this.byteOrder = byteOrder;
        this.sortHint = sortHint;

        tagInfo = TiffTags.getTag(directoryType, tag);
    }

    public void dump() {
        try (StringWriter sw = new StringWriter(); PrintWriter pw = new PrintWriter(sw)) {
            dump(pw);
            pw.flush();
            sw.flush();
            LOGGER.fine(sw.toString());
        } catch (final IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
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

    /**
     * Returns a copy of the raw value of the field.
     * @return the value of the field, in the byte order of the field.
     */
    public byte[] getByteArrayValue() {
        return BinaryFunctions.head(value, getBytesLength());
    }

    /**
     * Returns the field's byte order.
     * @return the byte order
     */
    public ByteOrder getByteOrder() {
        return byteOrder;
    }

    /**
     * The length of the field's value.
     * @return the length, in bytes.
     */
    public int getBytesLength() {
        return (int) count * abstractFieldType.getSize();
    }

    /**
     * Returns the field's count, derived from bytes 4-7.
     * @return the count
     */
    public long getCount() {
        return count;
    }

    public String getDescriptionWithoutValue() {
        return getTag() + " (0x" + Integer.toHexString(getTag()) + ": " + getTagInfo().name
                + "): ";
    }

    public int getDirectoryType() {
        return directoryType;
    }

    public double[] getDoubleArrayValue() throws ImagingException {
        final Object o = getValue();
        // if (o == null)
        // return null;

        if (o instanceof Number) {
            return new double[] { ((Number) o).doubleValue() };
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            final double[] result = Allocator.doubleArray(numbers.length);
            Arrays.setAll(result, i -> numbers[i].doubleValue());
            return result;
        }
        if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            final double[] result = Allocator.doubleArray(numbers.length);
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            final double[] result = Allocator.doubleArray(numbers.length);
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof float[]) {
            final float[] numbers = (float[]) o;
            final double[] result = Allocator.doubleArray(numbers.length);
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof double[]) {
            final double[] numbers = (double[]) o;
            return Arrays.copyOf(numbers, numbers.length);
        }

        throw new ImagingException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return null;
    }

    public double getDoubleValue() throws ImagingException {
        final Object o = getValue();
        if (o == null) {
            throw new ImagingException("Missing value: "
                    + getTagInfo().getDescription());
        }

        return ((Number) o).doubleValue();
    }

    /**
     * Returns the field's type, derived from bytes 2-3.
     * @return the field's type, as a {@code FieldType} object.
     */
    public AbstractFieldType getFieldType() {
        return abstractFieldType;
    }

    public String getFieldTypeName() {
        return getFieldType().getName();
    }

    public int[] getIntArrayValue() throws ImagingException {
        final Object o = getValue();
        // if (o == null)
        // return null;

        if (o instanceof Number) {
            return new int[] { ((Number) o).intValue() };
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            final int[] result = Allocator.intArray(numbers.length);
            Arrays.setAll(result, i -> numbers[i].intValue());
            return result;
        }
        if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            final int[] result = Allocator.intArray(numbers.length);
            Arrays.setAll(result, i ->  0xffff & numbers[i]);
            return result;
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            return Arrays.copyOf(numbers, numbers.length);
        }

        throw new ImagingException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return null;
    }

    public int getIntValue() throws ImagingException {
        final Object o = getValue();
        if (o == null) {
            throw new ImagingException("Missing value: "
                    + getTagInfo().getDescription());
        }

        return ((Number) o).intValue();
    }

    public int getIntValueOrArraySum() throws ImagingException {
        final Object o = getValue();
        // if (o == null)
        // return -1;

        if (o instanceof Number) {
            return ((Number) o).intValue();
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            int sum = 0;
            for (final Number number : numbers) {
                sum += number.intValue();
            }
            return sum;
        }
        if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            int sum = 0;
            for (final short number : numbers) {
                sum += number;
            }
            return sum;
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            int sum = 0;
            for (final int number : numbers) {
                sum += number;
            }
            return sum;
        }

        throw new ImagingException("Unknown value: " + o + " for: "
                + getTagInfo().getDescription());
        // return -1;
    }

    /**
     * Returns the TIFF field's offset/value field, derived from bytes 8-11.
     * @return the field's offset in a {@code long} of 4 packed bytes,
     * or its inlined value &lt;= 4 bytes long encoded in the field's byte order.
     */
    public int getOffset() {
        return (int) offset;
    }

    public AbstractTiffElement getOversizeValueElement() {
        if (isLocalValue()) {
            return null;
        }

        return new OversizeValueElement(getOffset(), value.length);
    }

    public int getSortHint() {
        return sortHint;
    }

    public String getStringValue() throws ImagingException {
        final Object o = getValue();
        if (o == null) {
            return null;
        }
        if (!(o instanceof String)) {
            throw new ImagingException("Expected String value("
                    + getTagInfo().getDescription() + "): " + o);
        }
        return (String) o;
    }

    /**
     * Returns the field's tag, derived from bytes 0-1.
     * @return the tag, as an {@code int} in which only the lowest 2 bytes are set
     */
    public int getTag() {
        return tag;
    }

    public TagInfo getTagInfo() {
        return tagInfo;
    }

    public String getTagName() {
        if (getTagInfo() == TiffTagConstants.TIFF_TAG_UNKNOWN) {
            return getTagInfo().name + " (0x" + Integer.toHexString(getTag()) + ")";
        }
        return getTagInfo().name;
    }

    public Object getValue() throws ImagingException {
        // System.out.print("getValue");
        return getTagInfo().getValue(this);
    }

    public String getValueDescription() {
        try {
            return getValueDescription(getValue());
        } catch (final ImagingException e) {
            return "Invalid value: " + e.getMessage();
        }
    }

    private String getValueDescription(final Object o) {
        if (o == null) {
            return null;
        }

        if (o instanceof Number) {
            return o.toString();
        }
        if (o instanceof String) {
            return "'" + o.toString().trim() + "'";
        }
        if (o instanceof Date) {
            final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
            return df.format((Date) o);
        }
        if (o instanceof Object[]) {
            final Object[] objects = (Object[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < objects.length; i++) {
                final Object object = objects[i];

                if (i > 50) {
                    result.append("... (").append(objects.length).append(")");
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
        // StringBuilder result = new StringBuilder();
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
        }
        if (o instanceof short[]) {
            final short[] values = (short[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final short sVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(sVal);
            }
            return result.toString();
        }
        if (o instanceof int[]) {
            final int[] values = (int[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final int iVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(iVal);
            }
            return result.toString();
        }
        if (o instanceof long[]) {
            final long[] values = (long[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final long lVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(lVal);
            }
            return result.toString();
        }
        if (o instanceof double[]) {
            final double[] values = (double[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final double dVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(dVal);
            }
            return result.toString();
        }
        if (o instanceof byte[]) {
            final byte[] values = (byte[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final byte bVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(bVal);
            }
            return result.toString();
        }
        if (o instanceof char[]) {
            final char[] values = (char[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final char cVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(cVal);
            }
            return result.toString();
        }
        if (o instanceof float[]) {
            final float[] values = (float[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                final float fVal = values[i];

                if (i > 50) {
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    result.append(", ");
                }
                result.append(fVal);
            }
            return result.toString();
        }
        // else if (o instanceof short[])
        // {
        // short numbers[] = (short[]) o;
        // StringBuilder result = new StringBuilder();
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

    /**
     * Indicates whether the field's value is inlined into the offset field.
     * @return true if the value is inlined
     */
    public boolean isLocalValue() {
        return (count * abstractFieldType.getSize()) <= TiffConstants.TIFF_ENTRY_MAX_VALUE_LENGTH;
    }

    @Override
    public String toString() {
        return getTag() +
                " (0x" +
                Integer.toHexString(getTag()) +
                ": " +
                getTagInfo().name +
                "): " +
                getValueDescription() +
                " (" +
                getCount() +
                " " +
                getFieldType().getName() +
                ")";
    }
}
