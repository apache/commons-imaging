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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntFunction;

/**
 * Checks inputs for meeting allocation limits and allocates arrays.
 */
public class Allocator {

    private static final String CANONICAL_NAME = Allocator.class.getCanonicalName();

    /** One GB. */
    private static final int DEFAULT = 1_073_741_824;
    private static final int LIMIT;

    static {
        LIMIT = Integer.getInteger(CANONICAL_NAME, DEFAULT);
    }

    /**
     * Allocates an array of type T of the requested size.
     *
     * <p><b>Important:</b> If possible avoid this method and avoid Object arrays, and instead
     * use {@link List}s created with {@link #arrayList(int)}.
     *
     * @param <T>                The return array type
     * @param request            The requested size.
     * @param factory            The array factory.
     * @param eltShallowByteSize The shallow byte size of an element.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static <T> T[] array(final int request, final IntFunction<T[]> factory, final int eltShallowByteSize) {
        check(Math.multiplyExact(request, eltShallowByteSize));
        return factory.apply(request);
    }

    /**
     * Similar to {@link #array(int, IntFunction, int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static <T> T[] arrayTrusted(final int request, final IntFunction<T[]> factory, final int eltShallowByteSize) {
        // For now simply delegate to `array`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return array(request, factory, eltShallowByteSize);
    }

    /**
     * Creates an array list of the requested initial capacity. The capacity can be
     * <i>untrusted</i>; that is, it may come from metadata which can directly be
     * controlled by the (potentially malicious) user.
     */
    public static <T> ArrayList<T> arrayList(int initialCapacity) {
        // Limit the capacity to a reasonable maximum
        return new ArrayList<>(Math.min(initialCapacity, 1024));
    }

    /**
     * Creates an array list of the requested initial capacity. The capacity should be
     * <i>trusted</i>; that is, it should either be a constant or there should already
     * be an existing collection of the same size.
     *
     * <p>This method must not be called with with an untrusted capacity, for example
     * one which has only been read from user-controlled metadata; use {@link #arrayList(int)}
     * for that.
     */
    public static <T> ArrayList<T> arrayListTrusted(int initialCapacity) {
        // For sanity still check requested capacity
        check(Math.addExact(24, Math.multiplyExact(initialCapacity, 4))); // 4 bytes per element
        return new ArrayList<>(initialCapacity);
    }

    /**
     * Creates an array list with the size of the given collection as initial capacity.
     */
    public static <T> ArrayList<T> arrayListWithCapacityFor(Collection<?> collection) {
        return arrayListTrusted(collection.size());
    }

    /**
     * Allocates a byte array of the requested size.
     *
     * @param request The requested size.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static byte[] byteArray(final int request) {
        return new byte[checkByteArray(request)];
    }

    /**
     * Allocates a byte array of the requested size.
     *
     * @param request The requested size is cast down to an int.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static byte[] byteArray(final long request) {
        return byteArray(Math.toIntExact(request));
    }

    /**
     * Similar to {@link #byteArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static byte[] byteArrayTrusted(final int request) {
        // For now simply delegate to `byteArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return byteArray(request);
    }

    /**
     * Allocates a char array of the requested size.
     *
     * @param request The requested size.
     * @return a new char array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static char[] charArray(final int request) {
        return new char[check(request, Character.BYTES)];
    }

    /**
     * Similar to {@link #charArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static char[] charArrayTrusted(final int request) {
        // For now simply delegate to `charArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return charArray(request);
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property
     * "org.apache.commons.imaging.common.Allocator".
     * </p>
     *
     * @param request an allocation request.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final int request) {
        // Check for numeric overflow from caller
        if (request < 0) {
            throw new IllegalArgumentException("Invalid request value: " + request);
        }
        if (request > LIMIT) {
            throw new AllocationRequestException(LIMIT, request);
        }
        return request;
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property
     * "org.apache.commons.imaging.common.Allocator".
     * </p>
     *
     * @param request     an allocation request count.
     * @param elementSize The element size.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final int request, final int elementSize) {
        // Check for numeric overflow from caller
        if (request < 0) {
            throw new IllegalArgumentException("Invalid request value: " + request);
        }

        int multiplyExact;
        try {
            multiplyExact = Math.multiplyExact(request, elementSize);
        } catch (ArithmeticException e) {
            throw new AllocationRequestException(LIMIT, BigInteger.valueOf(request).multiply(BigInteger.valueOf(elementSize)), e);
        }
        if (multiplyExact > LIMIT) {
            throw new AllocationRequestException(LIMIT, request);
        }
        return request;
    }

    /**
     * Checks that allocating a byte array of the requested size is within the limit.
     *
     * @param request The byte array size.
     * @return The input request.
     */
    public static int checkByteArray(final int request) {
        return check(request, Byte.BYTES);
    }

    /**
     * Similar to {@link #checkByteArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static int checkByteArrayTrusted(final int request) {
        return checkByteArray(request);
    }

    /**
     * Allocates a double array of the requested size.
     *
     * @param request The requested size.
     * @return a new double array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static double[] doubleArray(final int request) {
        return new double[check(request, Double.BYTES)];
    }

    /**
     * Similar to {@link #doubleArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static double[] doubleArrayTrusted(final int request) {
        // For now simply delegate to `doubleArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return doubleArray(request);
    }

    /**
     * Allocates a float array of the requested size.
     *
     * @param request The requested size.
     * @return a new float array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static float[] floatArray(final int request) {
        return new float[check(request, Float.BYTES)];
    }

    /**
     * Similar to {@link #floatArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static float[] floatArrayTrusted(final int request) {
        // For now simply delegate to `floatArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return floatArray(request);
    }

    /**
     * Allocates a int array of the requested size.
     *
     * @param request The requested size.
     * @return a new int array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static int[] intArray(final int request) {
        return new int[check(request, Integer.BYTES)];
    }

    /**
     * Similar to {@link #intArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static int[] intArrayTrusted(final int request) {
        // For now simply delegate to `intArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return intArray(request);
    }

    /**
     * Allocates a short array of the requested size.
     *
     * @param request The requested size.
     * @return a new short array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static short[] shortArray(final int request) {
        return new short[check(request, Short.BYTES)];
    }

    /**
     * Similar to {@link #shortArray(int)}, except that the caller is reasonable sure that
     * the requested size is 'trusted', that is:
     * <ul>
     *   <li>It is a constant value which cannot be influenced by the user in any way
     *   <li>Or, it relates to the size of memory which has already been successfully allocated,
     *       for example an array of a different type or a {@link Collection}
     * </ul>
     */
    public static short[] shortArrayTrusted(final int request) {
        // For now simply delegate to `shortArray`; this 'trusted' method here is at the moment
        // mainly intended to detect untrusted calls
        return shortArray(request);
    }
}
