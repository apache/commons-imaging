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
package org.apache.commons.imaging.internal;

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
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Internal-only debug class. Used for collecting extra information when parsing or modifying images or metadata. These methods are useful for troubleshooting
 * and issue analysis, but this should not be used directly by end-users, nor extended in any way. This may change or be removed at any time.
 */
public final class Debug {

    private static final Logger LOGGER = Logger.getLogger(Debug.class.getName());

    // public static String newline = System.getProperty("line.separator");
    private static final String NEWLINE = "\r\n";
    private static long counter;

    private static String byteQuadToString(final int byteQuad) {
        final byte b1 = (byte) (byteQuad >> 24 & 0xff);
        final byte b2 = (byte) (byteQuad >> 16 & 0xff);
        final byte b3 = (byte) (byteQuad >> 8 & 0xff);
        final byte b4 = (byte) (byteQuad >> 0 & 0xff);

        final char c1 = (char) b1;
        final char c2 = (char) b2;
        final char c3 = (char) b3;
        final char c4 = (char) b4;
        // return new String(new char[] { c1, c2, c3, c4 });
        final StringBuilder buffer = new StringBuilder(31);
        buffer.append(new String(new char[] { c1, c2, c3, c4 }));
        buffer.append(" byteQuad: ");
        buffer.append(byteQuad);
        buffer.append(" b1: ");
        buffer.append(b1);
        buffer.append(" b2: ");
        buffer.append(b2);
        buffer.append(" b3: ");
        buffer.append(b3);
        buffer.append(" b4: ");
        buffer.append(b4);

        return buffer.toString();
    }

    /**
     * Logs a debug message (newline only).
     */
    public static void debug() {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest(NEWLINE);
        }
    }

    /**
     * Logs a debug message.
     *
     * @param message the message to log.
     */
    public static void debug(final String message) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.finest(message);
        }
    }

    private static void debug(final String message, final byte[] v) {
        debug(getDebug(message, v));
    }

    private static void debug(final String message, final Calendar value) {
        final DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ROOT);
        debug(message, value == null ? "null" : df.format(value.getTime()));
    }

    private static void debug(final String message, final char[] v) {
        debug(getDebug(message, v));
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
            debug("\t getColorSpaceType() : " + byteQuadToString(value.getColorSpaceType()));
        }
    }

    private static void debug(final String message, final int[] v) {
        debug(getDebug(message, v));
    }

    private static void debug(final String message, final List<?> v) {
        final String suffix = " [" + counter++ + "]";

        debug(message + " (" + v.size() + ")" + suffix);
        for (final Object aV : v) {
            debug("\t" + aV.toString() + suffix);
        }
        debug();
    }

    private static void debug(final String message, final Map<?, ?> map) {
        debug(getDebug(message, map));
    }

    /**
     * Logs a debug message with an object value.
     *
     * @param message the message prefix.
     * @param value the object value to log.
     */
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

    /**
     * Logs a debug message for a throwable.
     *
     * @param e the throwable to log.
     */
    public static void debug(final Throwable e) {
        debug(getDebug(e));
    }

    /**
     * Logs a debug message for a throwable with an integer value.
     *
     * @param e the throwable to log.
     * @param value the integer value.
     */
    public static void debug(final Throwable e, final int value) {
        debug(getDebug(e, value));
    }

    private static String getDebug(final String message, final byte[] v) {
        final int max = 250;
        return getDebug(message, v, max);
    }

    private static String getDebug(final String message, final byte[] v, final int max) {

        final StringBuilder result = new StringBuilder();

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (int i = 0; i < max && i < v.length; i++) {
                final int b = 0xff & v[i];

                final char c;
                if (b == 0 || b == 10 || b == 11 || b == 13) {
                    c = ' ';
                } else {
                    c = (char) b;
                }

                result.append("\t" + i + ": " + b + " (" + c + ", 0x" + Integer.toHexString(b) + ")" + NEWLINE);
            }
            if (v.length > max) {
                result.append("\t..." + NEWLINE);
            }

            result.append(NEWLINE);
        }
        return result.toString();
    }

    private static String getDebug(final String message, final char[] v) {
        final StringBuilder result = new StringBuilder();

        if (v == null) {
            result.append(message + " (" + null + ")" + NEWLINE);
        } else {
            result.append(message + " (" + v.length + ")" + NEWLINE);
            for (final char element : v) {
                result.append("\t" + element + " (" + (0xff & element) + ")" + NEWLINE);
            }
            result.append(NEWLINE);
        }
        return result.toString();
    }

    private static String getDebug(final String message, final int[] v) {
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

    private static String getDebug(final String message, final Map<?, ?> map) {
        final StringBuilder result = new StringBuilder();

        if (map == null) {
            return message + " map: " + null;
        }

        final List<Object> keys = new ArrayList<>(map.keySet());
        result.append(message + " map: " + keys.size() + NEWLINE);
        for (int i = 0; i < keys.size(); i++) {
            final Object key = keys.get(i);
            final Object value = map.get(key);
            result.append("\t" + i + ": '" + key + "' -> '" + value + "'" + NEWLINE);
        }

        result.append(NEWLINE);

        return result.toString();
    }

    private static String getDebug(final Throwable e) {
        return getDebug(e, -1);
    }

    private static String getDebug(final Throwable e, final int max) {
        final StringBuilder result = new StringBuilder(35);

        final SimpleDateFormat timestamp = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS", Locale.ROOT);
        final String datetime = timestamp.format(new Date()).toLowerCase();

        result.append(NEWLINE);
        result.append("Throwable: " + (e == null ? "" : "(" + e.getClass().getName() + ")") + ":" + datetime + NEWLINE);
        result.append("Throwable: " + (e == null ? "null" : e.getLocalizedMessage()) + NEWLINE);
        result.append(NEWLINE);

        result.append(getStackTrace(e, max));

        result.append("Caught here:" + NEWLINE);
        result.append(getStackTrace(new Exception(), max, 1));
        // Debug.dumpStack();
        result.append(NEWLINE);
        return result.toString();
    }

    private static String getStackTrace(final Throwable e, final int limit) {
        return getStackTrace(e, limit, 0);
    }

    private static String getStackTrace(final Throwable e, final int limit, final int skip) {
        final StringBuilder result = new StringBuilder();

        if (e != null) {
            final StackTraceElement[] stes = e.getStackTrace();
            if (stes != null) {
                for (int i = skip; i < stes.length && (limit < 0 || i < limit); i++) {
                    final StackTraceElement ste = stes[i];

                    result.append(
                            "\tat " + ste.getClassName() + "." + ste.getMethodName() + "(" + ste.getFileName() + ":" + ste.getLineNumber() + ")" + NEWLINE);
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

    private Debug() {
    }
}
