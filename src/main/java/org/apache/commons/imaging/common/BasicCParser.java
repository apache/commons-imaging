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
package org.apache.commons.imaging.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Map;
import org.apache.commons.imaging.formats.tiff.TiffCoverageLogger;

import org.apache.commons.imaging.ImagingException;

/**
 * A rudimentary preprocessor and parser for the C programming language.
 *
 * FIXME replace this by a parser generated via ANTLR (if we really need it?!)
 */
public class BasicCParser {
    /**
     * Parses the hexadecimal-base escape-sequence found at index {@code i} of {@code string}.
     *
     * <p>
     * Helper-function for {@code unescapeString()}.
     * </p>
     *
     * @param i             the index of the escape-sequence in the string
     * @param stringBuilder the stringBuilder to append the escape-char to
     * @param string        the string whose chars are parsed
     * @return the new index i
     * @since 1.0-alpha3
     */
    private static int appendHex(int i, final StringBuilder stringBuilder, final String string) throws ImagingException {
        if (i + 2 >= string.length()) {
            throw new ImagingException("Parsing XPM file failed, " + "hex constant in string too short");
        }
        final char hex1 = string.charAt(i + 1);
        final char hex2 = string.charAt(i + 2);
        i += 2;
        final int constant;
        try {
            constant = Integer.parseInt(hex1 + Character.toString(hex2), 16);
        } catch (final NumberFormatException nfe) {
            throw new ImagingException("Parsing XPM file failed, " + "hex constant invalid", nfe);
        }
        stringBuilder.append((char) constant);
        return i;
    }

    /**
     * Parses the octal-base escape-sequence found at index {@code i} of {@code string}.
     *
     * <p>
     * Helper-function for {@code unescapeString()}.
     * </p>
     *
     * @param i             the index of the escape-sequence in the string
     * @param stringBuilder the stringBuilder to append the escape-char to
     * @param string        the string whose chars are parsed
     * @return the new index i
     * @since 1.0-alpha3
     */
    private static int appendOct(int i, final StringBuilder stringBuilder, final String string) {
        int length = 1;
        if (i + 1 < string.length() && '0' <= string.charAt(i + 1) && string.charAt(i + 1) <= '7') {
            ++length;
        }
        if (i + 2 < string.length() && '0' <= string.charAt(i + 2) && string.charAt(i + 2) <= '7') {
            ++length;
        }
        int constant = 0;
        for (int j = 0; j < length; j++) {
            constant *= 8;
            constant += string.charAt(i + j) - '0';
        }
        i += length - 1;
        stringBuilder.append((char) constant);
        return i;
    }

    /**
     * Parses the {@code i:th} escape-char in the input {@code string} and appends it to {@code stringBuilder}.
     *
     * <p>
     * Helper-function for {@code unescapeString()}.
     * </p>
     *
     * @param i             the index of the escape-char in the string
     * @param stringBuilder the stringBuilder to append the escape-char to
     * @param string        the string whose chars are parsed
     * @return the new index i
     * @since 1.0-alpha3
     */
    private static int parseEscape(int i, final StringBuilder stringBuilder, final String string) throws ImagingException {
        final char c = string.charAt(i);
        switch (c) {
        case '\\':
            stringBuilder.append('\\');
            break;
        case '"':
            stringBuilder.append('"');
            break;
        case '\'':
            stringBuilder.append('\'');
            break;
        case 'x':
            i = appendHex(i, stringBuilder, string);
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
            i = appendOct(i, stringBuilder, string);
            break;
        case 'a':
            stringBuilder.append((char) 0x07);
            break;
        case 'b':
            stringBuilder.append((char) 0x08);
            break;
        case 'f':
            stringBuilder.append((char) 0x0c);
            break;
        case 'n':
            stringBuilder.append((char) 0x0a);
            break;
        case 'r':
            stringBuilder.append((char) 0x0d);
            break;
        case 't':
            stringBuilder.append((char) 0x09);
            break;
        case 'v':
            stringBuilder.append((char) 0x0b);
            break;
        default:
            throw new ImagingException("Parsing XPM file failed, " + "invalid escape sequence");
        }
        return i;

    }

    public static ByteArrayOutputStream preprocess(final InputStream is, final StringBuilder firstComment, final Map<String, String> defines)
            throws IOException, ImagingException {
        boolean inSingleQuotes = false;
        boolean inString = false;
        boolean inComment = false;
        boolean inDirective = false;
        boolean hadSlash = false;
        boolean hadStar = false;
        boolean hadBackSlash = false;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        boolean seenFirstComment = firstComment == null;
        final StringBuilder directiveBuffer = new StringBuilder();
        for (int c = is.read(); c != -1; c = is.read()) {
            if (inComment) {
                if (c == '*') {
                    if (hadStar && !seenFirstComment) {
                        firstComment.append('*');
                    }
                    hadStar = true;
                } else if (c == '/') {
                    if (hadStar) {
                        hadStar = false;
                        inComment = false;
                        seenFirstComment = true;
                    } else if (!seenFirstComment) {
                        firstComment.append((char) c);
                    }
                } else {
                    if (hadStar && !seenFirstComment) {
                        firstComment.append('*');
                    }
                    hadStar = false;
                    if (!seenFirstComment) {
                        firstComment.append((char) c);
                    }
                }
            } else if (inSingleQuotes) {
                switch (c) {
                case '\\':
                    if (hadBackSlash) {
                        out.write('\\');
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        hadBackSlash = true;
                    }
                    break;
                case '\'':
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        inSingleQuotes = false;
                    }
                    out.write('\'');
                    break;
                case '\r':
                case '\n':
                    throw new ImagingException("Unterminated single quote in file");
                default:
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    }
                    out.write(c);
                    break;
                }
            } else if (inString) {
                switch (c) {
                case '\\':
                    if (hadBackSlash) {
                        out.write('\\');
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        hadBackSlash = true;
                    }
                    break;
                case '"':
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        inString = false;
                    }
                    out.write('"');
                    break;
                case '\r':
                case '\n':
                    throw new ImagingException("Unterminated string in file");
                default:
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    }
                    out.write(c);
                    break;
                }
            } else if (inDirective) {
                if (c == '\r' || c == '\n') {
                    inDirective = false;
                    final String[] tokens = tokenizeRow(directiveBuffer.toString());
                    if (tokens.length < 2 || tokens.length > 3) {
                        throw new ImagingException("Bad preprocessor directive");
                    }
                    if (!tokens[0].equals("define")) {
                        throw new ImagingException("Invalid/unsupported " + "preprocessor directive '" + tokens[0] + "'");
                    }
                    defines.put(tokens[1], tokens.length == 3 ? tokens[2] : null);
                    directiveBuffer.setLength(0);
                } else {
                    directiveBuffer.append((char) c);
                }
            } else {
                switch (c) {
                case '/':
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = true;
                    break;
                case '*':
                    if (hadSlash) {
                        inComment = true;
                        hadSlash = false;
                    } else {
                        out.write(c);
                    }
                    break;
                case '\'':
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    inSingleQuotes = true;
                    break;
                case '"':
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    inString = true;
                    break;
                case '#':
                    if (defines == null) {
                        throw new ImagingException("Unexpected preprocessor directive");
                    }
                    inDirective = true;
                    break;
                default:
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    // Only whitespace allowed before first comment:
                    if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                        seenFirstComment = true;
                    }
                    break;
                }
            }
        }
        if (hadSlash) {
            out.write('/');
        }
        if (hadStar) {
            out.write('*');
        }
        if (inString) {
            throw new ImagingException("Unterminated string at the end of file");
        }
        if (inComment) {
            throw new ImagingException("Unterminated comment at the end of file");
        }
        return out;
    }

    public static String[] tokenizeRow(final String row) {
        final String[] tokens = row.split("[ \t]");
        int numLiveTokens = 0;
        for (final String token : tokens) {
            if (token != null && !token.isEmpty()) {
                ++numLiveTokens;
            }
        }
        final String[] liveTokens = Allocator.array(numLiveTokens, String[]::new, 24);
        int next = 0;
        for (final String token : tokens) {
            if (token != null && !token.isEmpty()) {
                liveTokens[next++] = token;
            }
        }
        return liveTokens;
    }

    public static void unescapeString(final StringBuilder stringBuilder, final String string) throws ImagingException {
        if (string.length() < 2) {
            throw new ImagingException("Parsing XPM file failed, " + "string is too short");
        }
        if (string.charAt(0) != '"' || string.charAt(string.length() - 1) != '"') {
            throw new ImagingException("Parsing XPM file failed, " + "string not surrounded by '\"'");
        }
        boolean hadBackSlash = false;
        for (int i = 1; i < string.length() - 1; i++) {
            final char c = string.charAt(i);
            if (hadBackSlash) {
                i = parseEscape(i, stringBuilder, string);
                hadBackSlash = false;
            } else if (c == '\\') {
                hadBackSlash = true;
            } else if (c == '"') {
                throw new ImagingException("Parsing XPM file failed, " + "extra '\"' found in string");
            } else {
                stringBuilder.append(c);
            }
        }
        if (hadBackSlash) {
            throw new ImagingException("Parsing XPM file failed, " + "unterminated escape sequence found in string");
        }
    }

    private final PushbackInputStream is;

    public BasicCParser(final ByteArrayInputStream is) {
        this.is = new PushbackInputStream(is);
    }

    // ----------------------LOGGED AND REFACTORED------------------------------
    // The total complexity of nextToken() is then 18 which is ten less than the original complexity
    /**
     * Processed the Identifier logic
     * Clover statistics:
     * * 100% coverage
     * * Complexity: 4
     */
    private String processIdentifier(StringBuilder token) throws IOException {
        for (int c = is.read(); c != -1; c = is.read()) {
            TiffCoverageLogger.logBranch_nextToken(16);
            if (!Character.isLetterOrDigit(c)) {
                TiffCoverageLogger.logBranch_nextToken(17);
                if (c != '_') {
                    TiffCoverageLogger.logBranch_nextToken(19);
                    is.unread(c);
                    return token.toString();
                } else {
                    TiffCoverageLogger.logBranch_nextToken(20);
                }
            } else {
                TiffCoverageLogger.logBranch_nextToken(21);
            }
            token.append((char) c);
        }
        TiffCoverageLogger.logBranch_nextToken(22);
        return token.toString();
    }

    /**
     * Processed the String logic
     * Clover statistics:
     * * 90.9% coverage
     * * Complexity: 7
     */
    private String processString(StringBuilder token, boolean hadBackSlash) throws IOException, ImagingException {
        for (int c = is.read(); c != -1; c = is.read()) {
            TiffCoverageLogger.logBranch_nextToken(7); // Taken
                switch (c) {
                case '\\':
                    TiffCoverageLogger.logBranch_nextToken(8); // Taken
                    token.append('\\');
                    hadBackSlash = !hadBackSlash;
                    break;
                case '"':
                    TiffCoverageLogger.logBranch_nextToken(9); // Taken
                    token.append('"');
                    if (!hadBackSlash) {
                        TiffCoverageLogger.logBranch_nextToken(10); // Taken
                        return token.toString();
                    } else {
                        TiffCoverageLogger.logBranch_nextToken(11); // Taken
                    }
                    hadBackSlash = false;
                    break;
                case '\r':
                    TiffCoverageLogger.logBranch_nextToken(12);
                case '\n':
                    TiffCoverageLogger.logBranch_nextToken(13);
                    throw new ImagingException("Unterminated string in XPM file");
                default:
                    TiffCoverageLogger.logBranch_nextToken(14);
                    token.append((char) c);
                    hadBackSlash = false;
                    break;
                }
        }
        TiffCoverageLogger.logBranch_nextToken(15);
        throw new ImagingException("Unterminated string ends XMP file");
    }

    /**
     * Processed the String logic
     * Clover statistics:
     * * 100% coverage
     * * Complexity: 7
     */
    // public String nextToken() throws IOException, ImagingException {
    //     // I don't know how complete the C parsing in an XPM file
    //     // is meant to be, this is just the very basics...

    //     boolean hadBackSlash = false;
    //     final StringBuilder token = new StringBuilder();
    //     for (int c = is.read(); c != -1; c = is.read()) {
    //         TiffCoverageLogger.logBranch_nextToken(0);
    //         if (c == '"') {
    //             TiffCoverageLogger.logBranch_nextToken(1);
    //             token.append('"');
    //             return processString(token, hadBackSlash);
    //         } else if (Character.isLetterOrDigit(c)) {
    //             TiffCoverageLogger.logBranch_nextToken(2);
    //             token.append((char) c);
    //             return processIdentifier(token);
    //         } else if (c == '_') {
    //             TiffCoverageLogger.logBranch_nextToken(3);
    //             token.append((char) c);
    //             return processIdentifier(token);
    //         } else if (String.valueOf((char) c).matches("[{}\\[\\]*;=,]")) {
    //             TiffCoverageLogger.logBranch_nextToken(4);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (String.valueOf((char) c).matches("[\\t\\r\\n ]")) {
    //             // Ignore
    //         } else {
    //             TiffCoverageLogger.logBranch_nextToken(5);
    //             throw new ImagingException("Unhandled/invalid character '" + (char) c + "' found in XPM file");
    //         }
    //     }
    //     TiffCoverageLogger.logBranch_nextToken(6);
    //     return null;
    // }

    // ----------------------LOGGED AND SEPARATED------------------------------
    // public String nextToken() throws IOException, ImagingException {
    //     // I don't know how complete the C parsing in an XPM file
    //     // is meant to be, this is just the very basics...

    //     boolean inString = false;
    //     boolean inIdentifier = false;
    //     boolean hadBackSlash = false;
    //     final StringBuilder token = new StringBuilder();
    //     for (int c = is.read(); c != -1; c = is.read()) {
    //         TiffCoverageLogger.logBranch_nextToken(0); // Taken
    //         if (inString) {
    //             TiffCoverageLogger.logBranch_nextToken(1); // Taken
    //             switch (c) {
    //             case '\\':
    //                 TiffCoverageLogger.logBranch_nextToken(2); // Taken
    //                 token.append('\\');
    //                 hadBackSlash = !hadBackSlash;
    //                 break;
    //             case '"':
    //                 TiffCoverageLogger.logBranch_nextToken(3); // Taken
    //                 token.append('"');
    //                 if (!hadBackSlash) {
    //                     TiffCoverageLogger.logBranch_nextToken(4); // Taken
    //                     return token.toString();
    //                 } else {
    //                     TiffCoverageLogger.logBranch_nextToken(5); // Taken
    //                 }
    //                 hadBackSlash = false;
    //                 break;
    //             case '\r':
    //                 TiffCoverageLogger.logBranch_nextToken(6);
    //             case '\n':
    //                 TiffCoverageLogger.logBranch_nextToken(7);
    //                 throw new ImagingException("Unterminated string in XPM file");
    //             default:
    //                 TiffCoverageLogger.logBranch_nextToken(8);
    //                 token.append((char) c);
    //                 hadBackSlash = false;
    //                 break;
    //             }
    //         } else if (inIdentifier) {
    //             TiffCoverageLogger.logBranch_nextToken(9);
    //             if (!Character.isLetterOrDigit(c)) {
    //                 TiffCoverageLogger.logBranch_nextToken(10);
    //                 if (c != '_') {
    //                     TiffCoverageLogger.logBranch_nextToken(11);
    //                     is.unread(c);
    //                     return token.toString();
    //                 } else {
    //                     TiffCoverageLogger.logBranch_nextToken(12);
    //                 }
    //             } else {
    //                 TiffCoverageLogger.logBranch_nextToken(13);
    //             }
    //             token.append((char) c);
    //         } else if (c == '"') {
    //             TiffCoverageLogger.logBranch_nextToken(14); // Taken
    //             token.append('"');
    //             inString = true;
    //         } else if (Character.isLetterOrDigit(c)) {
    //             TiffCoverageLogger.logBranch_nextToken(15);
    //             token.append((char) c);
    //             inIdentifier = true;
    //         } else if (c == '_') {
    //             TiffCoverageLogger.logBranch_nextToken(16);
    //             token.append((char) c);
    //             inIdentifier = true;
    //         } else if (c == '{') {
    //             TiffCoverageLogger.logBranch_nextToken(17);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == '}') {
    //             TiffCoverageLogger.logBranch_nextToken(18);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == '[') {
    //             TiffCoverageLogger.logBranch_nextToken(19);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == ']') {
    //             TiffCoverageLogger.logBranch_nextToken(20);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == '*') {
    //             TiffCoverageLogger.logBranch_nextToken(21);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == ';') {
    //             TiffCoverageLogger.logBranch_nextToken(22);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == '=') {
    //             TiffCoverageLogger.logBranch_nextToken(23);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == ',') {
    //             TiffCoverageLogger.logBranch_nextToken(24);
    //             token.append((char) c);
    //             return token.toString();
    //         } else if (c == ' ') { // NOPMD
    //             TiffCoverageLogger.logBranch_nextToken(25);
    //             // ignore
    //         } else if (c == '\t') { // NOPMD
    //             TiffCoverageLogger.logBranch_nextToken(26);
    //             // ignore
    //         } else if (c == '\r') { // NOPMD
    //             TiffCoverageLogger.logBranch_nextToken(27);
    //             // ignore
    //         } else if (c == '\n') { // NOPMD
    //             TiffCoverageLogger.logBranch_nextToken(28);
    //             // ignore
    //         } else {
    //             TiffCoverageLogger.logBranch_nextToken(29);
    //             throw new ImagingException("Unhandled/invalid character '" + (char) c + "' found in XPM file");
    //         }
    //     }

    //     if (inIdentifier) {
    //         TiffCoverageLogger.logBranch_nextToken(30);
    //         return token.toString();
    //     } else {
    //         TiffCoverageLogger.logBranch_nextToken(31);
    //     }
    //     if (inString) {
    //         TiffCoverageLogger.logBranch_nextToken(32);
    //         throw new ImagingException("Unterminated string ends XMP file");
    //     } else {
    //         TiffCoverageLogger.logBranch_nextToken(33);
    //     }
    //     return null;
    // }


    //----------------------ORIGINAL------------------------------
    public String nextToken() throws IOException, ImagingException {
        // I don't know how complete the C parsing in an XPM file
        // is meant to be, this is just the very basics...

        boolean inString = false;
        boolean inIdentifier = false;
        boolean hadBackSlash = false;
        final StringBuilder token = new StringBuilder();
        for (int c = is.read(); c != -1; c = is.read()) {
            if (inString) {
                switch (c) {
                case '\\':
                    token.append('\\');
                    hadBackSlash = !hadBackSlash;
                    break;
                case '"':
                    token.append('"');
                    if (!hadBackSlash) {
                        return token.toString();
                    }
                    hadBackSlash = false;
                    break;
                case '\r':
                case '\n':
                    throw new ImagingException("Unterminated string in XPM file");
                default:
                    token.append((char) c);
                    hadBackSlash = false;
                    break;
                }
            } else if (inIdentifier) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    is.unread(c);
                    return token.toString();
                }
                token.append((char) c);
            } else if (c == '"') {
                token.append('"');
                inString = true;
            } else if (Character.isLetterOrDigit(c) || c == '_') {
                token.append((char) c);
                inIdentifier = true;
            } else if (c == '{' || c == '}' || c == '[' || c == ']' || c == '*' || c == ';' || c == '=' || c == ',') {
                token.append((char) c);
                return token.toString();
            } else if (c == ' ' || c == '\t' || c == '\r' || c == '\n') { // NOPMD
                // ignore
            } else {
                throw new ImagingException("Unhandled/invalid character '" + (char) c + "' found in XPM file");
            }
        }

        if (inIdentifier) {
            return token.toString();
        }
        if (inString) {
            throw new ImagingException("Unterminated string ends XMP file");
        }
        return null;
    }
    

}
