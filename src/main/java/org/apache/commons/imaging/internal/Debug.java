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

package org.apache.commons.imaging.internal;

import java.awt.color.ICC_Profile;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Internal-only debug class. Used for collecting extra information when parsing or modifying images or metadata.
 * These methods are useful for troubleshooting and issue analysis, but this should not be used directly by end-users.
 */
public final class Debug {

    private static final Logger LOGGER = Logger.getLogger(Debug.class.getName());

    private static final String NEWLINE = "\r\n";
    private static final int DEFAULT_BUFFER_SIZE = 35;

    // Constants for byte manipulations
    private static final int BYTE_MASK = 0xff;
    private static final int SHIFT_24 = 24;
    private static final int SHIFT_16 = 16;
    private static final int SHIFT_8 = 8;

    // Constants for getDebug logic
    private static final int MAX_DEBUG_BYTES = 250;
    private static final int ASCII_NEWLINE = 10;
    private static final int ASCII_VERTICAL_TAB = 11;
    private static final int ASCII_CARRIAGE_RETURN = 13;

    private static long counter;

    private Debug() {
        // Private constructor to prevent instantiation
    }

    private static String byteQuadToString(final int byteQuad) {
        final byte b1 = (byte) (byteQuad >> SHIFT_24 & BYTE_MASK);
        final byte b2 = (byte) (byteQuad >> SHIFT_16 & BYTE_MASK);
        final byte b3 = (byte) (byteQuad >> SHIFT_8 & BYTE_MASK);
        final byte b4 = (byte) (byteQuad & BYTE_MASK);

        final char c1 = (char) b1;
        final char c2 = (char) b2;
        final char c3 = (char) b3;
        final char c4 = (char) b4;

        return new StringBuilder(DEFAULT_BUFFER_SIZE)
                .append(c1).append(c2).append(c3).append(c4)
                .append(" byteQuad: ").append(byteQuad)
                .append(" b1: ").append(b1)
                .append(" b2: ").append(b2)
                .append(" b3: ").append(b3)
                .append(" b4: ").append(b4)
                .toString();
    }

    public static void debug() {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest(NEWLINE);
        }
    }

    public static void debug(final String message) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest(message);
        }
    }

    public static void debug(final Throwable e) {
        debug(getStackTrace(e, -1, 0));
    }

    public static void debug(final Throwable e, final int value) {
        debug(getStackTrace(e, value, 0));
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

    private static void debug(final String message, final String value) {
        debug(message + " " + value);
    }

    private static void debug(final String message, final byte[] bytes) {
        debug(getDebug(message, bytes));
    }

    private static void debug(final String message, final Calendar value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ROOT);
        debug(message, value == null ? "null" : df.format(value.getTime()));
    }

    private static void debug(final String message, final char[] chars) {
        debug(getDebug(message, chars));
    }

    private static void debug(final String message, final Date value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ROOT);
        debug(message, value == null ? "null" : df.format(value));
    }

    private static void debug(final String message, final File file) {
        debug(message + ": " + (file == null ? "null" : file.getPath()));
    }

    private static void debug(final String message, final ICC_Profile value) {
        debug("ICC_Profile " + message + ": " + Objects.toString(value));
        if (value != null) {
            debug("\t getProfileClass: " + byteQuadToString(value.getProfileClass()));
            debug("\t getPCSType: " + byteQuadToString(value.getPCSType()));
            debug("\t getColorSpaceType: " + byteQuadToString(value.getColorSpaceType()));
        }
    }

    private static void debug(final String message, final int[] values) {
        debug(getDebug(message, values));
    }

    private static void debug(final String message, final List<?> list) {
        final String suffix = " [" + counter++ + "]";

        debug(message + " (" + list.size() + ")" + suffix);
        for (final Object item : list) {
            debug("\t" + item.toString() + suffix);
        }
        debug();
    }

    private static void debug(final String message, final Map<?, ?> map) {
        debug(getDebug(message, map));
    }

    private static String getDebug(final String message, final byte[] bytes) {
        return getDebug(message, bytes, MAX_DEBUG_BYTES);
    }

    private static String getDebug(final String message, final byte[] bytes, final int max) {
        StringBuilder result = new StringBuilder();

        if (bytes == null) {
            result.append(message).append(" (null)").append(NEWLINE);
        } else {
            result.append(message).append(" (").append(bytes.length).append(")").append(NEWLINE);

            for (int i = 0; i < max && i < bytes.length; i++) {
                int b = bytes[i] & BYTE_MASK;
                char c = isPrintable(b) ? (char) b : ' ';
                result.append("\t").append(i).append(": ").append(b)
                        .append(" (").append(c).append(", 0x")
                        .append(Integer.toHexString(b)).append(")").append(NEWLINE);
            }

            if (bytes.length > max) {
                result.append("\t...").append(NEWLINE);
            }
        }

        return result.toString();
    }

    private static boolean isPrintable(int b) {
        return b != 0 && b != ASCII_NEWLINE && b != ASCII_VERTICAL_TAB && b != ASCII_CARRIAGE_RETURN;
    }

    private static String getDebug(final String message, final char[] chars) {
        StringBuilder result = new StringBuilder();

        if (chars == null) {
            result.append(message).append(" (null)").append(NEWLINE);
        } else {
            result.append(message).append(" (").append(chars.length).append(")").append(NEWLINE);
            for (char ch : chars) {
                result.append("\t").append(ch).append(" (").append(BYTE_MASK & ch).append(")").append(NEWLINE);
            }
        }
        return result.toString();
    }

    private static String getDebug(final String message, final int[] values) {
        StringBuilder result = new StringBuilder();

        if (values == null) {
            result.append(message).append(" (null)").append(NEWLINE);
        } else {
            result.append(message).append(" (").append(values.length).append(")").append(NEWLINE);
            for (int value : values) {
                result.append("\t").append(value).append(NEWLINE);
            }
        }
        return result.toString();
    }

    private static String getDebug(final String message, final Map<?, ?> map) {
        StringBuilder result = new StringBuilder();

        if (map == null) {
            return message + " map: null";
        }

        result.append(message).append(" map: ").append(map.size()).append(NEWLINE);
        int index = 0;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            result.append("\t").append(index++).append(": '").append(entry.getKey())
                    .append("' -> '").append(entry.getValue()).append("'").append(NEWLINE);
        }

        return result.toString();
    }

    private static String getStackTrace(final Throwable e, final int limit, final int skip) {
        StringBuilder result = new StringBuilder();

        if (e != null) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            if (stackTrace != null) {
                for (int i = skip; i < stackTrace.length && (limit < 0 || i < limit); i++) {
                    result.append(formatStackTrace(stackTrace[i]));
                }
                if (limit >= 0 && stackTrace.length > limit) {
                    result.append("\t...").append(NEWLINE);
                }
            }
        }

        return result.toString();
    }

    private static String formatStackTrace(StackTraceElement ste) {
        return "\tat " + ste.getClassName() + "." + ste.getMethodName() + "("
                + ste.getFileName() + ":" + ste.getLineNumber() + ")" + NEWLINE;
    }
}