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

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream;

/**
 * <b>Internal class</b>
 *
 * <p>Builder for a byte array of known size. The main purpose of this class is to
 * provide a reasonably efficient way to create a byte array of a certain known size
 * without eagerly allocating an array of that size, since that could be abused to
 * cause a denial of service attack if the desired array lenght can be controlled
 * by a malicious user.
 *
 * <p>This class is similar to {@link ByteArrayOutputStream} respectively {@link UnsynchronizedByteArrayOutputStream}
 * with the main difference that it is most likely more efficient because
 * <ul>
 *   <li>it knows the expected byte array length in advance (which is not the same
 *       as an 'initial capacity') and can therefore allocate temporary byte arrays more
 *       efficiently
 *   <li>it does not use any (redundant) synchronization
 *   <li>it is only single-use and can return the internal temporary byte array
 *       without having to create any copies
 * </ul>
 */
public class KnownSizeByteArrayBuilder {
    // See also https://stackoverflow.com/q/3038392
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 10;
    static final int INITIAL_SECTION_SIZE = 4096;

    private final int expectedSize;

    /** Total number of bytes added so far */
    private int addedBytesCount = 0;
    private List<byte[]> sections = new ArrayList<>();
    /** Current section where bytes are added to; {@code null} if final byte array has already been created */
    private byte[] currentSection;
    /** End index (exclusive) of {@link #currentSection}, respectively start index of next write */
    private int currentSectionEnd = 0;

    /**
     * @param expectedSize The expected final array size; the number of bytes must
     *      not be greater than this, but it may be lower, see {@link #createByteArray(boolean)}
     */
    public KnownSizeByteArrayBuilder(int expectedSize) {
        if (expectedSize < 0 || expectedSize > MAX_ARRAY_SIZE) {
            throw new IllegalArgumentException("Invalid size: " + expectedSize);
        }
        Allocator.checkByteArray(expectedSize);

        this.expectedSize = expectedSize;

        currentSection = new byte[Math.min(expectedSize, INITIAL_SECTION_SIZE)];
        sections.add(currentSection);
    }

    private void checkByteArrayCreated() {
        if (currentSection == null) {
            throw new IllegalStateException("Byte array has already been created");
        }
    }

    private void ensureSpaceInCurrentSection() {
        if (currentSectionEnd >= currentSection.length) {
            int nextSectionSize = currentSection.length * 2;
            // In case of overflow or if next section would be equal or larger than remaining expected,
            // directly create final byte array
            if (nextSectionSize < 0 || nextSectionSize >= (expectedSize - addedBytesCount)) {
                currentSection = new byte[expectedSize];

                int copyStartPos = 0;
                for (byte[] section : sections) {
                    System.arraycopy(section, 0, currentSection, copyStartPos, section.length);
                    copyStartPos += section.length;
                }
                // Won't be used anymore; also let garbage collection collect the sections
                sections = null;
                currentSectionEnd = copyStartPos;
            } else {
                currentSection = new byte[nextSectionSize];
                sections.add(currentSection);
                currentSectionEnd = 0;
            }
        }
    }

    /**
     * Returns the number of so far added bytes.
     */
    public int getAddedBytesCount() {
        return addedBytesCount;
    }

    /**
     * Add the number of expected bytes from the input stream.
     *
     * @throws EOFException If the input stream provides less than the expected number of bytes
     */
    public void addAllBytesFrom(InputStream in) throws IOException {
        checkByteArrayCreated();

        while (true) {
            int missingBytesCount = expectedSize - addedBytesCount;
            if (missingBytesCount <= 0) {
                return;
            }

            ensureSpaceInCurrentSection();

            int maxRead = Math.min(missingBytesCount, currentSection.length - currentSectionEnd);
            int readCount = in.read(currentSection, currentSectionEnd, maxRead);
            if (readCount < 0) {
                throw new EOFException("Unexpected EOF; was expecting more bytes");
            }
            if (readCount > maxRead) {
                throw new RuntimeException("Bad InputStream implementation read more bytes than requested: " + in.toString());
            }
            addedBytesCount += readCount;
            currentSectionEnd += readCount;
        }
    }

    /**
     * Adds a single byte.
     *
     * @throws IllegalStateException If all expected bytes have already been added
     */
    public void addByte(byte b) {
        checkByteArrayCreated();

        if (addedBytesCount >= expectedSize) {
            throw new IllegalStateException("Already added all expected bytes");
        }

        ensureSpaceInCurrentSection();
        currentSection[currentSectionEnd] = b;
        currentSectionEnd++;
        addedBytesCount++;
    }

    /**
     * Adds bytes from an array.
     *
     * @throws IllegalStateException If {@code length} is greater than the remaining expected bytes
     */
    public void addBytes(byte[] bytes, int start, int length) {
        if (start < 0 || length < 0 || bytes.length - length < start) {
            throw new IllegalArgumentException("Bad start or length value");
        }

        if (length == 0) {
            return;
        }
        if (length > expectedSize - addedBytesCount) {
            throw new IllegalStateException("Trying to add more bytes than expected");
        }

        do {
            ensureSpaceInCurrentSection();
            int copyCount = Math.min(length, currentSection.length - currentSectionEnd);
            System.arraycopy(bytes, start, currentSection, currentSectionEnd, copyCount);
            currentSectionEnd += copyCount;
            addedBytesCount += copyCount;

            start += copyCount;
            length -= copyCount;
        } while (length > 0);
    }

    /**
     * Creates the final byte array. This method can only be called at most once;
     * afterwards none of the other methods of this class can be called anymore.
     *
     * @param allowSmallerThanExpected Whether to allow creating the array even
     *      if not all expected bytes (as specified originally for the constructor)
     *      have been added yet
     */
    public byte[] createByteArray(boolean allowSmallerThanExpected) {
        checkByteArrayCreated();

        byte[] resultArray;

        if (addedBytesCount >= expectedSize) {
            // Current section contains complete content
            resultArray = currentSection;
        } else if (allowSmallerThanExpected) {
            // Check if sections contains only currentSection
            if (sections == null || sections.size() == 1) {
                resultArray = Arrays.copyOf(currentSection, currentSectionEnd);
            } else {
                resultArray = new byte[addedBytesCount];

                int copyStartPos = 0;
                // Copy the complete content of all sections except the last (= currentSection)
                for (int sectionIndex = 0; sectionIndex < sections.size() - 1; sectionIndex++) {
                    byte[] section = sections.get(sectionIndex);
                    System.arraycopy(section, 0, resultArray, copyStartPos, section.length);
                    copyStartPos += section.length;
                }

                System.arraycopy(currentSection, 0, resultArray, copyStartPos, currentSectionEnd);
            }
        } else {
            throw new IllegalStateException("Not all bytes have been added yet");
        }

        currentSection = null;
        sections = null;
        return resultArray;
    }

    /**
     * Creates the final byte array; must only be called once.
     *
     * <p>This is a convenience methods which calls {@link #createByteArray(boolean) createByteArray(false)}.
     */
    public byte[] createByteArray() {
        return createByteArray(false);
    }

    /**
     * Creates an {@link OutputStream} which can be used to add bytes to this builder.
     * This is mainly intended for cases when working with an API which expects an {@code OutputStream};
     * in all other cases prefer one of the other methods of this class.
     */
    public OutputStream asOutputStream() {
        return new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                addByte((byte) b);
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                addBytes(b, off, len);
            }
        };
    }
}
