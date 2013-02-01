/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;

public class BasicCParser {
    private final PushbackInputStream is;

    public BasicCParser(final ByteArrayInputStream is) {
        this.is = new PushbackInputStream(is);
    }

    public String nextToken() throws IOException, ImageReadException {
        // I don't know how complete the C parsing in an XPM file
        // is meant to be, this is just the very basics...

        boolean inString = false;
        boolean inIdentifier = false;
        boolean hadBackSlash = false;
        final StringBuilder token = new StringBuilder();
        for (int c = is.read(); c != -1; c = is.read()) {
            if (inString) {
                if (c == '\\') {
                    token.append('\\');
                    hadBackSlash = !hadBackSlash;
                } else if (c == '"') {
                    token.append('"');
                    if (!hadBackSlash) {
                        return token.toString();
                    }
                    hadBackSlash = false;
                } else if (c == '\r' || c == '\n') {
                    throw new ImageReadException(
                            "Unterminated string in XPM file");
                } else {
                    token.append((char) c);
                    hadBackSlash = false;
                }
            } else if (inIdentifier) {
                if (Character.isLetterOrDigit(c) || c == '_') {
                    token.append((char) c);
                } else {
                    is.unread(c);
                    return token.toString();
                }
            } else {
                if (c == '"') {
                    token.append('"');
                    inString = true;
                } else if (Character.isLetterOrDigit(c) || c == '_') {
                    token.append((char) c);
                    inIdentifier = true;
                } else if (c == '{' || c == '}' || c == '[' || c == ']'
                        || c == '*' || c == ';' || c == '=' || c == ',') {
                    token.append((char) c);
                    return token.toString();
                } else if (c == ' ' || c == '\t' || c == '\r' || c == '\n') {
                    // ignore
                } else {
                    throw new ImageReadException(
                            "Unhandled/invalid character '" + ((char) c)
                                    + "' found in XPM file");
                }
            }
        }

        if (inIdentifier) {
            return token.toString();
        }
        if (inString) {
            throw new ImageReadException("Unterminated string ends XMP file");
        }
        return null;
    }

    public static ByteArrayOutputStream preprocess(final InputStream is,
            final StringBuilder firstComment, final Map<String, String> defines)
            throws IOException, ImageReadException {
        boolean inSingleQuotes = false;
        boolean inString = false;
        boolean inComment = false;
        boolean inDirective = false;
        boolean hadSlash = false;
        boolean hadStar = false;
        boolean hadBackSlash = false;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        boolean seenFirstComment = (firstComment == null);
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
                    } else {
                        if (!seenFirstComment) {
                            firstComment.append((char)c);
                        }
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
                if (c == '\\') {
                    if (hadBackSlash) {
                        out.write('\\');
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        hadBackSlash = true;
                    }
                } else if (c == '\'') {
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        inSingleQuotes = false;
                    }
                    out.write('\'');
                } else if (c == '\r' || c == '\n') {
                    byte[] bb = out.toByteArray();
                    System.err.println(new String(bb));
                    System.err.println();
                    throw new ImageReadException("Unterminated single quote in file");
                } else {
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    }
                    out.write(c);
                }
            } else if (inString) {
                if (c == '\\') {
                    if (hadBackSlash) {
                        out.write('\\');
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        hadBackSlash = true;
                    }
                } else if (c == '"') {
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    } else {
                        inString = false;
                    }
                    out.write('"');
                } else if (c == '\r' || c == '\n') {
                    throw new ImageReadException("Unterminated string in file");
                } else {
                    if (hadBackSlash) {
                        out.write('\\');
                        hadBackSlash = false;
                    }
                    out.write(c);
                }
            } else if (inDirective) {
                if (c == '\r' || c == '\n') {
                    inDirective = false;
                    final String[] tokens = tokenizeRow(directiveBuffer.toString());
                    if (tokens.length < 2 || tokens.length > 3) {
                        throw new ImageReadException(
                                "Bad preprocessor directive");
                    }
                    if (!tokens[0].equals("define")) {
                        throw new ImageReadException("Invalid/unsupported "
                                + "preprocessor directive '" + tokens[0] + "'");
                    }
                    defines.put(tokens[1], (tokens.length == 3) ? tokens[2]
                            : null);
                    directiveBuffer.setLength(0);
                } else {
                    directiveBuffer.append((char) c);
                }
            } else {
                if (c == '/') {
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = true;
                } else if (c == '*') {
                    if (hadSlash) {
                        inComment = true;
                        hadSlash = false;
                    } else {
                        out.write(c);
                    }
                } else if (c == '\'') {
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    inSingleQuotes = true;
                } else if (c == '"') {
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    inString = true;
                } else if (c == '#') {
                    if (defines == null) {
                        throw new ImageReadException(
                                "Unexpected preprocessor directive");
                    }
                    inDirective = true;
                } else {
                    if (hadSlash) {
                        out.write('/');
                    }
                    hadSlash = false;
                    out.write(c);
                    // Only whitespace allowed before first comment:
                    if (c != ' ' && c != '\t' && c != '\r' && c != '\n') {
                        seenFirstComment = true;
                    }
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
            throw new ImageReadException(
                    "Unterminated string at the end of file");
        }
        if (inComment) {
            throw new ImageReadException(
                    "Unterminated comment at the end of file");
        }
        return out;
    }

    public static String[] tokenizeRow(final String row) {
        final String[] tokens = row.split("[ \t]");
        int numLiveTokens = 0;
        for (final String token : tokens) {
            if (token != null && token.length() > 0) {
                ++numLiveTokens;
            }
        }
        final String[] liveTokens = new String[numLiveTokens];
        int next = 0;
        for (final String token : tokens) {
            if (token != null && token.length() > 0) {
                liveTokens[next++] = token;
            }
        }
        return liveTokens;
    }

    public static void unescapeString(final StringBuilder stringBuilder, final String string)
            throws ImageReadException {
        if (string.length() < 2) {
            throw new ImageReadException("Parsing XPM file failed, "
                    + "string is too short");
        }
        if (string.charAt(0) != '"'
                || string.charAt(string.length() - 1) != '"') {
            throw new ImageReadException("Parsing XPM file failed, "
                    + "string not surrounded by '\"'");
        }
        boolean hadBackSlash = false;
        for (int i = 1; i < (string.length() - 1); i++) {
            final char c = string.charAt(i);
            if (hadBackSlash) {
                if (c == '\\') {
                    stringBuilder.append('\\');
                } else if (c == '"') {
                    stringBuilder.append('"');
                } else if (c == '\'') {
                    stringBuilder.append('\'');
                } else if (c == 'x') {
                    if (i + 2 >= string.length()) {
                        throw new ImageReadException(
                                "Parsing XPM file failed, "
                                        + "hex constant in string too short");
                    }
                    final char hex1 = string.charAt(i + 1);
                    final char hex2 = string.charAt(i + 2);
                    i += 2;
                    int constant;
                    try {
                        constant = Integer.parseInt("" + hex1 + hex2, 16);
                    } catch (final NumberFormatException nfe) {
                        throw new ImageReadException(
                                "Parsing XPM file failed, "
                                        + "hex constant invalid", nfe);
                    }
                    stringBuilder.append((char) constant);
                } else if (c == '0' || c == '1' || c == '2' || c == '3'
                        || c == '4' || c == '5' || c == '6' || c == '7') {
                    int length = 1;
                    if (i + 1 < string.length() && '0' <= string.charAt(i + 1)
                            && string.charAt(i + 1) <= '7') {
                        ++length;
                    }
                    if (i + 2 < string.length() && '0' <= string.charAt(i + 2)
                            && string.charAt(i + 2) <= '7') {
                        ++length;
                    }
                    int constant = 0;
                    for (int j = 0; j < length; j++) {
                        constant *= 8;
                        constant += (string.charAt(i + j) - '0');
                    }
                    i += length - 1;
                    stringBuilder.append((char) constant);
                } else if (c == 'a') {
                    stringBuilder.append((char) 0x07);
                } else if (c == 'b') {
                    stringBuilder.append((char) 0x08);
                } else if (c == 'f') {
                    stringBuilder.append((char) 0x0c);
                } else if (c == 'n') {
                    stringBuilder.append((char) 0x0a);
                } else if (c == 'r') {
                    stringBuilder.append((char) 0x0d);
                } else if (c == 't') {
                    stringBuilder.append((char) 0x09);
                } else if (c == 'v') {
                    stringBuilder.append((char) 0x0b);
                } else {
                    throw new ImageReadException("Parsing XPM file failed, "
                            + "invalid escape sequence");
                }
                hadBackSlash = false;
            } else {
                if (c == '\\') {
                    hadBackSlash = true;
                } else if (c == '"') {
                    throw new ImageReadException("Parsing XPM file failed, "
                            + "extra '\"' found in string");
                } else {
                    stringBuilder.append(c);
                }
            }
        }
        if (hadBackSlash) {
            throw new ImageReadException("Parsing XPM file failed, "
                    + "unterminated escape sequence found in string");
        }
    }
}
