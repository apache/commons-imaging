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
package org.apache.commons.imaging;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides information about the compliance of a specified data 
 * source (byte array, file, etc&#46;) to an image format.
 */
public class FormatCompliance {
    private final boolean failOnError;
    private final String description;
    private final List<String> comments = new ArrayList<String>();

    public FormatCompliance(final String description) {
        this.description = description;
        failOnError = false;
    }

    public FormatCompliance(final String description, final boolean fail_on_error) {
        this.description = description;
        this.failOnError = fail_on_error;
    }

    public static FormatCompliance getDefault() {
        return new FormatCompliance("ignore", false);
    }

    public void addComment(final String s) throws ImageReadException {
        comments.add(s);
        if (failOnError) {
            throw new ImageReadException(s);
        }
    }

    public void addComment(final String s, final int value) throws ImageReadException {
        addComment(s + ": " + getValueDescription(value));
    }

    @Override
    public String toString() {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);

        dump(pw);

        return sw.getBuffer().toString();
    }

    public void dump() {
        dump(new PrintWriter(new OutputStreamWriter(System.out, Charset.defaultCharset())));
    }

    public void dump(final PrintWriter pw) {
        pw.println("Format Compliance: " + description);

        if (comments.isEmpty()) {
            pw.println("\t" + "No comments.");
        } else {
            for (int i = 0; i < comments.size(); i++) {
                pw.println("\t" + (i + 1) + ": " + comments.get(i));
            }
        }
        pw.println("");
        pw.flush();
    }

    private String getValueDescription(final int value) {
        return value + " (" + Integer.toHexString(value) + ")";
    }

    public boolean compare_bytes(final String name, final byte expected[], final byte actual[])
            throws ImageReadException {
        if (expected.length != actual.length) {
            addComment(name + ": " + "Unexpected length: (expected: "
                    + expected.length + ", actual: " + actual.length + ")");
            return false;
        }
        for (int i = 0; i < expected.length; i++) {
            // System.out.println("expected: "
            // + getValueDescription(expected[i]) + ", actual: "
            // + getValueDescription(actual[i]) + ")");
            if (expected[i] != actual[i]) {
                addComment(name + ": " + "Unexpected value: (expected: "
                        + getValueDescription(expected[i]) + ", actual: "
                        + getValueDescription(actual[i]) + ")");
                return false;
            }
        }

        return true;
    }

    public boolean checkBounds(final String name, final int min, final int max, final int actual)
            throws ImageReadException {
        if ((actual < min) || (actual > max)) {
            addComment(name + ": " + "bounds check: " + min + " <= " + actual
                    + " <= " + max + ": false");
            return false;
        }

        return true;
    }

    public boolean compare(final String name, final int valid, final int actual)
            throws ImageReadException {
        return compare(name, new int[] { valid, }, actual);
    }

    public boolean compare(final String name, final int valid[], final int actual)
            throws ImageReadException {
        for (final int element : valid) {
            if (actual == element) {
                return true;
            }
        }

        final StringBuilder result = new StringBuilder(43);
        result.append(name);
        result.append(": Unexpected value: (valid: ");
        if (valid.length > 1) {
            result.append('{');
        }
        for (int i = 0; i < valid.length; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(getValueDescription(valid[i]));
        }
        if (valid.length > 1) {
            result.append('}');
        }
        result.append(", actual: " + getValueDescription(actual) + ")");
        addComment(result.toString());
        return false;
    }
}
