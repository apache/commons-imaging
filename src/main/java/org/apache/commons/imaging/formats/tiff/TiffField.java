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

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.BinaryFunctions;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;

/**
 * A TIFF field in a TIFF directory. Immutable.
 */
public class TiffField {

    private static final Boolean[] coverage = new Boolean[48];
    private static final Logger LOGGER = Logger.getLogger(TiffField.class.getName());

    private final TagInfo tagInfo;
    private final int tag;
    private final int directoryType;
    private final FieldType fieldType;
    private final long count;
    private final long offset;
    private final byte[] value;
    private final ByteOrder byteOrder;
    private final int sortHint;

    public TiffField(final int tag, final int directoryType, final FieldType fieldType,
            final long count, final long offset, final byte[] value,
            final ByteOrder byteOrder, final int sortHint) {

        this.tag = tag;
        this.directoryType = directoryType;
        this.fieldType = fieldType;
        this.count = count;
        this.offset = offset;
        this.value = value;
        this.byteOrder = byteOrder;
        this.sortHint = sortHint;

        tagInfo = TiffTags.getTag(directoryType, tag);
    }

    public int getDirectoryType() {
        return directoryType;
    }

    public TagInfo getTagInfo() {
        return tagInfo;
    }

    /**
     * Returns the field's tag, derived from bytes 0-1.
     * @return the tag, as an {@code int} in which only the lowest 2 bytes are set
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
     * @return the field's offset in a {@code long} of 4 packed bytes,
     * or its inlined value &lt;= 4 bytes long encoded in the field's byte order.
     */
    public int getOffset() {
        return (int) offset;
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
        public String getElementDescription() {
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

    public String getValueDescription() {
        try {
            return getValueDescription(getValue());
        } catch (final ImageReadException e) {
            return "Invalid value: " + e.getMessage();
        }
    }

    private String getValueDescription(final Object o) {

        if (coverage[0] == null) {
            Arrays.fill(coverage, false);
        }

        if (o == null) {
            // 0
            coverage[0] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            return null;
        }else{
            // 1
            coverage[1] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof Number) {
            // 2
            coverage[2] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            return o.toString();
        }else{
            // 3
            coverage[3] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof String) {
            // 4
            coverage[4] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            return "'" + o.toString().trim() + "'";
        }else{
            // 5
            coverage[5] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof Date) {
            // 6
            coverage[6] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
            return df.format((Date) o);
        }else{
            // 7
            coverage[7] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof Object[]) {
            // 8
            coverage[8] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final Object[] objects = (Object[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < objects.length; i++) {
                // 9
                coverage[9] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final Object object = objects[i];

                if (i > 50) {
                    // 10
                    coverage[10] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(objects.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 11
                    coverage[11] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
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
        }else{
            // 12
            coverage[12] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof short[]) {
            // 13
            coverage[13] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final short[] values = (short[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 14
                coverage[14] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final short sVal = values[i];

                if (i > 50) {
                    // 15
                    coverage[15] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 16
                    coverage[16] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(sVal);
            }
            return result.toString();
        }else{
            // 17
            coverage[17] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof int[]) {
            // 18
            coverage[18] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final int[] values = (int[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 19
                coverage[19] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final int iVal = values[i];

                if (i > 50) {
                    // 20
                    coverage[20] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 21
                    coverage[21] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(iVal);
            }
            return result.toString();
        }else{
            // 22
            coverage[22] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof long[]) {
            // 23
            coverage[23] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final long[] values = (long[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 24
                coverage[24] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final long lVal = values[i];

                if (i > 50) {
                    // 25
                    coverage[25] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 26
                    coverage[26] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(lVal);
            }
            return result.toString();
        }else{
            // 27
            coverage[27] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof double[]) {
            // 28
            coverage[28] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final double[] values = (double[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 29
                coverage[29] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final double dVal = values[i];

                if (i > 50) {
                    // 30
                    coverage[30] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 31
                    coverage[31] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(dVal);
            }
            return result.toString();
        }else{
            // 32
            coverage[32] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof byte[]) {
            // 33
            coverage[33] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final byte[] values = (byte[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 34
                coverage[34] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final byte bVal = values[i];

                if (i > 50) {
                    // 35
                    coverage[35] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 36
                    coverage[36] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(bVal);
            }
            return result.toString();
        }else{
            // 37
            coverage[37] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof char[]) {
            // 38
            coverage[38] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final char[] values = (char[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 39
                coverage[39] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final char cVal = values[i];

                if (i > 50) {
                    // 40
                    coverage[40] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 41
                    coverage[41] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(cVal);
            }
            return result.toString();
        }else{
            // 42
            coverage[42] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
        }

        if (o instanceof float[]) {
            // 43
            coverage[43] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
            final float[] values = (float[]) o;
            final StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                // 44
                coverage[44] = true;
                Imaging.writeCov("TiffField::getValueDescription", coverage);
                final float fVal = values[i];

                if (i > 50) {
                    // 45
                    coverage[45] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append("... (").append(values.length).append(")");
                    break;
                }
                if (i > 0) {
                    // 46
                    coverage[46] = true;
                    Imaging.writeCov("TiffField::getValueDescription", coverage);
                    result.append(", ");
                }
                result.append(fVal);
            }
            return result.toString();
        }else{
            // 47
            coverage[47] = true;
            Imaging.writeCov("TiffField::getValueDescription", coverage);
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

    public String getDescriptionWithoutValue() {
        return getTag() + " (0x" + Integer.toHexString(getTag()) + ": " + getTagInfo().name
                + "): ";
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

    public int[] getIntArrayValue() throws ImageReadException {
        final Object o = getValue();
        // if (o == null)
        // return null;

        if (o instanceof Number) {
            return new int[] { ((Number) o).intValue() };
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            final int[] result = new int[numbers.length];
            Arrays.setAll(result, i -> numbers[i].intValue());
            return result;
        }
        if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            final int[] result = new int[numbers.length];
            Arrays.setAll(result, i ->  0xffff & numbers[i]);
            return result;
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            return Arrays.copyOf(numbers, numbers.length);
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
        }
        if (o instanceof Number[]) {
            final Number[] numbers = (Number[]) o;
            final double[] result = new double[numbers.length];
            Arrays.setAll(result, i -> numbers[i].doubleValue());
            return result;
        }
        if (o instanceof short[]) {
            final short[] numbers = (short[]) o;
            final double[] result = new double[numbers.length];
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof int[]) {
            final int[] numbers = (int[]) o;
            final double[] result = new double[numbers.length];
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof float[]) {
            final float[] numbers = (float[]) o;
            final double[] result = new double[numbers.length];
            Arrays.setAll(result, i -> numbers[i]);
            return result;
        }
        if (o instanceof double[]) {
            final double[] numbers = (double[]) o;
            return Arrays.copyOf(numbers, numbers.length);
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
