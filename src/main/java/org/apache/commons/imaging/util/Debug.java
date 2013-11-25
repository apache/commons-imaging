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
package org.apache.commons.imaging.util;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.color.ICC_Profile;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class Debug {

    private static final boolean DEBUG = false;
    // public static String newline = System.getProperty("line.separator");
    public static final String NEWLINE = "\r\n";
    private static long counter = 0;

    public static void debug(final String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }

    public static void debug(final Object o) {
        if (DEBUG) {
            System.out.println(o == null ? "null" : o.toString());
        }
    }

    public static String getDebug(final String message) {
        return message;
    }

    public static void debug() {
        newline();
    }

    public static void newline() {
        if (DEBUG) {
            System.out.print(NEWLINE);
        }
    }

    public static String getDebug(final String message, final int value) {
        return getDebug(message + ": " + (value));
    }

    public static String getDebug(final String message, final double value) {
        return getDebug(message + ": " + (value));
    }

    public static String getDebug(final String message, final String value) {
        return getDebug(message + " " + value);
    }

    public static String getDebug(final String message, final long value) {
        return getDebug(message + " " + Long.toString(value));
    }

    public static String getDebug(final String message, final int v[]) {
        final StringBuilder result = new StringBuilder();

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final int element : v) {
                result.append("\t" + element + NEWLINE);
            }
            result.append(NEWLINE);
        }
        return result.toString();
    }

    public static String getDebug(final String message, final byte v[]) {
        final int max = 250;
        return getDebug(message, v, max);
    }

    public static String getDebug(final String message, final byte v[], final int max) {

        final StringBuilder result = new StringBuilder();

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (int i = 0; i < max && i < v.length; i++) {
                final int b = 0xff & v[i];

                char c;
                if (b == 0 || b == 10 || b == 11 || b == 13) {
                    c = ' ';
                } else {
                    c = (char) b;
                }

                result.append("\t" + i + ": " + b + " (" + c + ", 0x"
                        + Integer.toHexString(b) + ")" + NEWLINE);
            }
            if (v.length > max) {
                result.append("\t..." + NEWLINE);
            }

            result.append(NEWLINE);
        }
        return result.toString();
    }

    public static String getDebug(final String message, final char v[]) {
        final StringBuilder result = new StringBuilder();

        if (v == null) {
            result.append(getDebug(message + " (" + null + ")") + NEWLINE);
        } else {
            result.append(getDebug(message + " (" + v.length + ")") + NEWLINE);
            for (final char element : v) {
                result.append(getDebug("\t" + element + " (" + (0xff & element))
                        + ")" + NEWLINE);
            }
            result.append(NEWLINE);
        }
        return result.toString();
    }

    public static String getDebug(final String message, final List<?> v) {
        final StringBuilder result = new StringBuilder();

        final String suffix = " [" + counter++ + "]";

        result.append(getDebug(message + " (" + v.size() + ")" + suffix) + NEWLINE);
        for (Object aV : v) {
            result.append(getDebug("\t" + aV.toString() + suffix) + NEWLINE);
        }
        result.append(NEWLINE);

        return result.toString();
    }

    public static void debug(final String message, final Map<?, ?> map) {
        debug(getDebug(message, map));
    }

    public static String getDebug(final String message, final Map<?,?> map) {
        final StringBuilder result = new StringBuilder();

        if (map == null) {
            return getDebug(message + " map: " + null);
        }

        final List<Object> keys = new ArrayList<Object>(map.keySet());
        result.append(getDebug(message + " map: " + keys.size()) + NEWLINE);
        for (int i = 0; i < keys.size(); i++) {
            final Object key = keys.get(i);
            final Object value = map.get(key);
            result.append(getDebug("\t" + i + ": '" + key + "' -> '" + value
                    + "'")
                    + NEWLINE);
        }

        result.append(NEWLINE);

        return result.toString();
    }

    public static boolean compare(final String prefix, final Map<?, ?> a, final Map<?, ?> b) {
        return compare(prefix, a, b, null, null);
    }

    private static void log(final StringBuilder buffer, final String s) {
        Debug.debug(s);
        if (buffer != null) {
            buffer.append(s + NEWLINE);
        }
    }

    public static boolean compare(final String prefix, final Map<?, ?> a, final Map<?, ?> b, final List<?> ignore,
            final StringBuilder buffer) {
        if ((a == null) && (b == null)) {
            log(buffer, prefix + " both maps null");
            return true;
        }
        if (a == null) {
            log(buffer, prefix + " map a: null, map b: map");
            return false;
        }
        if (b == null) {
            log(buffer, prefix + " map a: map, map b: null");
            return false;
        }

        final List<?> keys_a = new ArrayList<Object>(a.keySet());
        final List<?> keys_b = new ArrayList<Object>(b.keySet());

        if (ignore != null) {
            keys_a.removeAll(ignore);
            keys_b.removeAll(ignore);
        }

        boolean result = true;

        for (Object key : keys_a) {
            if (!keys_b.contains(key)) {
                log(buffer, prefix + "b is missing key '" + key + "' from a");
                result = false;
            } else {
                keys_b.remove(key);
                final Object value_a = a.get(key);
                final Object value_b = b.get(key);
                if (!value_a.equals(value_b)) {
                    log(buffer, prefix + "key(" + key + ") value a: " + value_a
                            + ") !=  b: " + value_b + ")");
                    result = false;
                }
            }
        }
        for (Object key : keys_b) {
            log(buffer, prefix + "a is missing key '" + key + "' from b");
            result = false;
        }

        if (result) {
            log(buffer, prefix + "a is the same as  b");
        }

        return result;
    }

    private static String byteQuadToString(final int bytequad) {
        final byte b1 = (byte) ((bytequad >> 24) & 0xff);
        final byte b2 = (byte) ((bytequad >> 16) & 0xff);
        final byte b3 = (byte) ((bytequad >> 8) & 0xff);
        final byte b4 = (byte) ((bytequad >> 0) & 0xff);

        final char c1 = (char) b1;
        final char c2 = (char) b2;
        final char c3 = (char) b3;
        final char c4 = (char) b4;
        // return new String(new char[] { c1, c2, c3, c4 });
        final StringBuilder fStringBuffer = new StringBuilder(31);
        fStringBuffer.append(new String(new char[] { c1, c2, c3, c4 }));
        fStringBuffer.append(" bytequad: ");
        fStringBuffer.append(bytequad);
        fStringBuffer.append(" b1: ");
        fStringBuffer.append(b1);
        fStringBuffer.append(" b2: ");
        fStringBuffer.append(b2);
        fStringBuffer.append(" b3: ");
        fStringBuffer.append(b3);
        fStringBuffer.append(" b4: ");
        fStringBuffer.append(b4);

        return fStringBuffer.toString();
    }

    public static String getDebug(final String message, final ICC_Profile value) {

        final StringBuilder result = new StringBuilder(37);

        result.append(getDebug("ICC_Profile " + message + ": "
                + ((value == null) ? "null" : value.toString()))
                + NEWLINE);
        if (value != null) {
            result.append(getDebug("\t getProfileClass: "
                    + byteQuadToString(value.getProfileClass()))
                    + NEWLINE);
            result.append(getDebug("\t getPCSType: "
                    + byteQuadToString(value.getPCSType()))
                    + NEWLINE);
            result.append(getDebug("\t getColorSpaceType() : "
                    + byteQuadToString(value.getColorSpaceType()))
                    + NEWLINE);
        }

        return result.toString();

    }

    public static String getDebug(final String message, final boolean value) {
        return getDebug(message + " " + ((value) ? ("true") : ("false")));
    }

    public static String getDebug(final String message, final File file) {
        return getDebug(message + ": "
                + ((file == null) ? "null" : file.getPath()));
    }

    public static String getDebug(final String message, final Date value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
        return getDebug(message, (value == null) ? "null" : df.format(value));
    }

    public static String getDebug(final String message, final Calendar value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
        return getDebug(message,
                (value == null) ? "null" : df.format(value.getTime()));
    }

    public static void debug(final String message, final Object value) {
        if (value == null) {
            debug(message, "null");
        } else if (value instanceof char[]) {
            debug(message, (char[]) value);
        } else if (value instanceof byte[]) {
            debug(message, (byte[]) value);
        } else if (value instanceof int[]) {
            debug(message, (int[]) value);
        } else if (value instanceof String) {
            debug(message, (String) value);
        } else if (value instanceof List) {
            debug(message, (List<?>) value);
        } else if (value instanceof Map) {
            debug(message, (Map<?, ?>) value);
        // } else if (value instanceof Object) {
        //   debug(message, (Object) value);
        } else if (value instanceof ICC_Profile) {
            debug(message, (ICC_Profile) value);
        } else if (value instanceof File) {
            debug(message, (File) value);
        } else if (value instanceof Date) {
            debug(message, (Date) value);
        } else if (value instanceof Calendar) {
            debug(message, (Calendar) value);
        } else {
            debug(message, value.toString());
        }
    }

    public static void debug(final String message, final Object value[]) {
        if (value == null) {
            debug(message, "null");
        } else {
            debug(message, value.length);
            final int max = 10;
            for (int i = 0; i < value.length && i < max; i++) {
                debug("\t" + i, value[i]);
            }
            if (value.length > max) {
                debug("\t...");
            }
        }
        debug();
    }

    public static String getDebug(final String message, final Object value) {
        if (value == null) {
            return getDebug(message, "null");
        } else if (value instanceof Calendar) {
            return getDebug(message, (Calendar) value);
        } else if (value instanceof Date) {
            return getDebug(message, (Date) value);
        } else if (value instanceof File) {
            return getDebug(message, (File) value);
        } else if (value instanceof ICC_Profile) {
            return getDebug(message, (ICC_Profile) value);
        } else if (value instanceof Map) {
            return getDebug(message, (Map<?,?>) value);
        } else if (value instanceof Map) {
            return getDebug(message, (Map<?,?>) value); //
        // else if (value instanceof Object) // getDebug(message, (Object)
        // value);
        } else if (value instanceof String) {
            return getDebug(message, (String) value);
        } else if (value instanceof byte[]) {
            return getDebug(message, (byte[]) value);
        } else if (value instanceof char[]) {
            return getDebug(message, (char[]) value);
        } else if (value instanceof int[]) {
            return getDebug(message, (int[]) value);
        } else if (value instanceof List) {
            return getDebug(message, (List<?>) value);
        } else {
            return getDebug(message, value.toString());
        }
    }

    public static String getType(final Object value) {
        if (value == null) {
            return "null";
        } else if (value instanceof Object[]) {
            return "[Object[]: " + ((Object[]) value).length + "]";
        } else if (value instanceof char[]) {
            return "[char[]: " + ((char[]) value).length + "]";
        } else if (value instanceof byte[]) {
            return "[byte[]: " + ((byte[]) value).length + "]";
        } else if (value instanceof short[]) {
            return "[short[]: " + ((short[]) value).length + "]";
        } else if (value instanceof int[]) {
            return "[int[]: " + ((int[]) value).length + "]";
        } else if (value instanceof long[]) {
            return "[long[]: " + ((long[]) value).length + "]";
        } else if (value instanceof float[]) {
            return "[float[]: " + ((float[]) value).length + "]";
        } else if (value instanceof double[]) {
            return "[double[]: " + ((double[]) value).length + "]";
        } else if (value instanceof boolean[]) {
            return "[boolean[]: " + ((boolean[]) value).length + "]";
        } else {
            return value.getClass().getName();
        }
    }

    public static boolean isArray(final Object value) {
        if (value == null) {
            return false;
        } else if (value instanceof Object[]) {
            return true;
        } else if (value instanceof char[]) {
            return true;
        } else if (value instanceof byte[]) {
            return true;
        } else if (value instanceof short[]) {
            return true;
        } else if (value instanceof int[]) {
            return true;
        } else if (value instanceof long[]) {
            return true;
        } else if (value instanceof float[]) {
            return true;
        } else if (value instanceof double[]) {
            return true;
        } else if (value instanceof boolean[]) {
            return true;
        } else {
            return false;
        }
    }

    public static String getDebug(final String message, final Object value[]) {
        final StringBuilder result = new StringBuilder();

        if (value == null) {
            result.append(getDebug(message, "null") + NEWLINE);
        } else {
            result.append(getDebug(message, value.length));
            final int max = 10;
            for (int i = 0; i < value.length && i < max; i++) {
                result.append(getDebug("\t" + i, value[i]) + NEWLINE);
            }
            if (value.length > max) {
                result.append(getDebug("\t...") + NEWLINE);
            }
        }
        result.append(NEWLINE);

        return result.toString();
    }

    public static String getDebug(final Class<?> fClass, final Throwable e) {
        return getDebug(fClass == null ? "[Unknown]" : fClass.getName(), e);
    }

    public static void debug(final Class<?> fClass, final Throwable e) {
        debug(fClass.getName(), e);
    }

    public static void debug(final String message, final boolean value) {
        debug(message + " " + ((value) ? ("true") : ("false")));
    }

    public static void debug(final String message, final byte v[]) {
        debug(getDebug(message, v));
    }

    public static void debug(final String message, final char v[]) {
        debug(getDebug(message, v));
    }

    public static void debug(final String message, final Calendar value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
        debug(message, (value == null) ? "null" : df.format(value.getTime()));
    }

    public static void debug(final String message, final Date value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH);
        debug(message, (value == null) ? "null" : df.format(value));
    }

    public static void debug(final String message, final double value) {
        debug(message + ": " + (value));
    }

    public static void debug(final String message, final File file) {
        debug(message + ": " + ((file == null) ? "null" : file.getPath()));
    }

    // public static void debug(String message, Object value)
    // {
    // debug("Unknown Object " + message + ": "
    // + ((value == null) ? "null" : value.toString()));
    // }

    public static void debug(final String message, final ICC_Profile value) {
        debug("ICC_Profile " + message + ": "
                + ((value == null) ? "null" : value.toString()));
        if (value != null) {
            debug("\t getProfileClass: "
                    + byteQuadToString(value.getProfileClass()));
            debug("\t getPCSType: " + byteQuadToString(value.getPCSType()));
            debug("\t getColorSpaceType() : "
                    + byteQuadToString(value.getColorSpaceType()));
        }
    }

    public static void debug(final String message, final int value) {
        debug(message + ": " + (value));
    }

    public static void debug(final String message, final int v[]) {
        debug(getDebug(message, v));
    }

    public static void debug(final String message, final byte v[], final int max) {
        debug(getDebug(message, v, max));
    }

    public static void debug(final String message, final List<?> v) {
        final String suffix = " [" + counter++ + "]";

        debug(message + " (" + v.size() + ")" + suffix);
        for (Object aV : v) {
            debug("\t" + aV.toString() + suffix);
        }
        debug();
    }

    public static void debug(final String message, final long value) {
        debug(message + " " + Long.toString(value));
    }

    public static void debug(final String prefix, final Point p) {
        System.out.println(prefix + ": "
                + ((p == null) ? "null" : (p.x + ", " + p.y)));
    }

    public static void debug(final String prefix, final Rectangle r) {
        debug(getDebug(prefix, r));
    }

    public static void debug(final String message, final String value) {
        debug(message + " " + value);
    }

    public static void debug(final String message, final Throwable e) {
        debug(getDebug(message, e));
    }

    public static void debug(final Throwable e) {
        debug(getDebug(e));
    }

    public static void debug(final Throwable e, final int value) {
        debug(getDebug(e, value));
    }

    public static void dumpStack() {
        debug(getStackTrace(new Exception("Stack trace"), -1, 1));
    }

    public static void dumpStack(final int limit) {
        debug(getStackTrace(new Exception("Stack trace"), limit, 1));
    }

    public static String getDebug(final String message, final Throwable e) {
        return message + NEWLINE + getDebug(e);
    }

    public static String getDebug(final Throwable e) {
        return getDebug(e, -1);
    }

    public static String getDebug(final Throwable e, final int max) {
        final StringBuilder result = new StringBuilder(35);

        final SimpleDateFormat timestamp = new SimpleDateFormat(
                "yyyy-MM-dd kk:mm:ss:SSS", Locale.ENGLISH);
        final String datetime = timestamp.format(new Date()).toLowerCase();

        result.append(NEWLINE);
        result.append("Throwable: "
                + ((e == null) ? "" : ("(" + e.getClass().getName() + ")"))
                + ":" + datetime + NEWLINE);
        result.append("Throwable: "
                + ((e == null) ? "null" : e.getLocalizedMessage()) + NEWLINE);
        result.append(NEWLINE);

        result.append(getStackTrace(e, max));

        result.append("Caught here:" + NEWLINE);
        result.append(getStackTrace(new Exception(), max, 1));
        // Debug.dumpStack();
        result.append(NEWLINE);
        return result.toString();
    }

    public static String getStackTrace(final Throwable e) {
        return getStackTrace(e, -1);
    }

    public static String getStackTrace(final Throwable e, final int limit) {
        return getStackTrace(e, limit, 0);
    }

    public static String getStackTrace(final Throwable e, final int limit, final int skip) {
        final StringBuilder result = new StringBuilder();

        if (e != null) {
            final StackTraceElement stes[] = e.getStackTrace();
            if (stes != null) {
                for (int i = skip; i < stes.length && (limit < 0 || i < limit); i++) {
                    final StackTraceElement ste = stes[i];

                    result.append("\tat " + ste.getClassName() + "."
                            + ste.getMethodName() + "(" + ste.getFileName()
                            + ":" + ste.getLineNumber() + ")" + NEWLINE);
                }
                if (limit >= 0 && stes.length > limit) {
                    result.append("\t..." + NEWLINE);
                }
            }

            // e.printStackTrace(System.out);
            result.append(NEWLINE);
        }

        return result.toString();
    }

    public static void debugByteQuad(final String message, final int i) {
        final int alpha = (i >> 24) & 0xff;
        final int red = (i >> 16) & 0xff;
        final int green = (i >> 8) & 0xff;
        final int blue = (i >> 0) & 0xff;

        System.out.println(message + ": " + "alpha: " + alpha + ", " + "red: "
                + red + ", " + "green: " + green + ", " + "blue: " + blue);
    }

    public static void debugIPQuad(final String message, final int i) {
        final int b1 = (i >> 24) & 0xff;
        final int b2 = (i >> 16) & 0xff;
        final int b3 = (i >> 8) & 0xff;
        final int b4 = (i >> 0) & 0xff;

        System.out.println(message + ": " + "b1: " + b1 + ", " + "b2: " + b2
                + ", " + "b3: " + b3 + ", " + "b4: " + b4);
    }

    public static void debugIPQuad(final String message, final byte bytes[]) {
        System.out.print(message + ": ");
        if (bytes == null) {
            System.out.print("null");
        } else {
            for (int i = 0; i < bytes.length; i++) {
                if (i > 0) {
                    System.out.print(".");
                }
                System.out.print(0xff & bytes[i]);
            }
        }
        System.out.println();
    }

    public static String getDebug(final String prefix, final Dimension r) {
        String s_ar1 = "null";
        String s_ar2 = "null";

        if (r != null) {
            final double aspect_ratio = ((double) r.width) / ((double) r.height);
            final double aspect_ratio2 = 1.0 / aspect_ratio;

            s_ar1 = Double.toString(aspect_ratio);
            s_ar2 = Double.toString(aspect_ratio2);

            if (s_ar1.length() > 7) {
                s_ar1 = s_ar1.substring(0, 7);
            }
            if (s_ar2.length() > 7) {
                s_ar2 = s_ar2.substring(0, 7);
            }
        }

        return (prefix + ": "
                + ((r == null) ? "null" : (r.width + "x" + r.height))
                + " aspect_ratio: " + s_ar1 + " (" + s_ar2 + ")");
    }

    public static void debug(final String prefix, final Dimension r) {
        debug(getDebug(prefix, r));
    }

    public static String getDebug(final String prefix, final Rectangle r) {
        String s_ar1 = "null";
        String s_ar2 = "null";

        if (r != null) {
            final double aspect_ratio = ((double) r.width) / ((double) r.height);
            final double aspect_ratio2 = 1.0 / aspect_ratio;

            s_ar1 = Double.toString(aspect_ratio);
            s_ar2 = Double.toString(aspect_ratio2);

            if (s_ar1.length() > 7) {
                s_ar1 = s_ar1.substring(0, 7);
            }
            if (s_ar2.length() > 7) {
                s_ar2 = s_ar2.substring(0, 7);
            }
        }

        return (prefix
                + ": "
                + ((r == null) ? "null" : (r.x + "x" + r.y + "," + r.width
                        + "x" + r.height)) + " aspect_ratio: " + s_ar1 + " ("
                + s_ar2 + ")");
    }

    public static String getDebug(final String prefix, final Point p) {
        return (prefix + ": " + ((p == null) ? "null" : (p.x + ", " + p.y)));
    }

    public static void dump(final String prefix, final Object value) {
        if (value == null) {
            debug(prefix, "null");
        } else if (value instanceof Object[]) {
            final Object[] array = (Object[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                dump(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof int[]) {
            final int[] array = (int[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof char[]) {
            final char[] array = (char[]) value;
            debug(prefix, "[" + new String(array) + "]");
        } else if (value instanceof long[]) {
            final long[] array = (long[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof boolean[]) {
            final boolean[] array = (boolean[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof byte[]) {
            final byte[] array = (byte[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof float[]) {
            final float[] array = (float[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof double[]) {
            final double[] array = (double[]) value;
            debug(prefix, array);
            for (int i = 0; i < array.length; i++) {
                debug(prefix + "\t" + i + ": ", array[i]);
            }
        } else if (value instanceof List) {
            final List<?> list = (List<?>) value;
            debug(prefix, "list");
            for (int i = 0; i < list.size(); i++) {
                dump(prefix + "\t" + "list: " + i + ": ", list.get(i));
            }
        } else if (value instanceof Map) {
            final Map<?,?> map = (Map<?,?>) value;
            debug(prefix, "map");
            for (final Map.Entry<?,?> entry : map.entrySet()) {
                dump(prefix + "\t" + "map: " + entry.getKey() + " -> ", entry.getValue());
            }
        // } else if (value instanceof String) {
        //     debug(prefix, value);
        } else {
            debug(prefix, value.toString());
            debug(prefix + "\t", value.getClass().getName());
        }
    }

    public static void purgeMemory() {
        // try
        // {
        // // Thread.sleep(50);
        // System.runFinalization();
        // Thread.sleep(50);
        // System.gc();
        // Thread.sleep(50);
        // }
        // catch (Throwable e)
        // {
        // Debug.debug(e);
        // }
    }

    private Debug() {
    }
}
