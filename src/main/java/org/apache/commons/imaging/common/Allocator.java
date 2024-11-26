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
import java.util.function.IntFunction;

/**
 * Checks inputs for meeting allocation limits and allocates arrays.
 */
public class Allocator {

    private static final String CANONICAL_NAME = Allocator.class.getCanonicalName();

    /** One GB. */
    private static final int DEFAULT = 1_073_741_824;
    private static final int LIMIT;

    /** ArrayList-specific constants for memory calculation. */
    private static final int ARRAYLIST_BASE_SIZE = 24; // Overhead size for ArrayList
    private static final int ARRAYLIST_ELEMENT_SIZE = 4; // Shallow size of an element in ArrayList

    static {
        LIMIT = Integer.getInteger(CANONICAL_NAME, DEFAULT);
    }

    /**
     * Allocates an Object of type T of the requested size.
     *
     * @param <T>     The return array type
     * @param request The requested size.
     * @param factory The array factory.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static <T> T apply(final int request, final IntFunction<T> factory) {
        return factory.apply(check(request));
    }

    /**
     * Allocates an array of type T of the requested size.
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
        check(request * eltShallowByteSize);
        return factory.apply(request);
    }

    /**
     * Allocates an Object array of type T of the requested size.
     *
     * @param <T>     The return array type
     * @param request The requested size.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static <T> ArrayList<T> arrayList(final int request) {
        check(ARRAYLIST_BASE_SIZE + request * ARRAYLIST_ELEMENT_SIZE); // Replaced magic numbers with constants
        return apply(request, ArrayList::new);
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
        return new byte[check(request, Byte.BYTES)];
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
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property "org.apache.commons.imaging.common.mylzw.AllocationChecker".
     * </p>
     *
     * @param request an allocation request.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final int request) {
        if (request > LIMIT) {
            throw new AllocationRequestException(LIMIT, request);
        }
        return request;
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property "org.apache.commons.imaging.common.mylzw.AllocationChecker".
     * </p>
     *
     * @param request     an allocation request count.
     * @param elementSize The element size.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final int request, final int elementSize) {
        int multiplyExact;
        try {
            multiplyExact = Math.multiplyExact(request, elementSize);
        } catch (final ArithmeticException e) {
            throw new AllocationRequestException(LIMIT, BigInteger.valueOf(request).multiply(BigInteger.valueOf(elementSize)), e);
        }
        if (multiplyExact > LIMIT) {
            throw new AllocationRequestException(LIMIT, request);
        }
        return request;
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property "org.apache.commons.imaging.common.mylzw.AllocationChecker".
     * </p>
     *
     * @param request     an allocation request count is cast down to an int.
     * @param elementSize The element size.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final long request, final int elementSize) {
        try {
            return check(Math.toIntExact(request), elementSize);
        } catch (final ArithmeticException e) {
            throw new AllocationRequestException(LIMIT, request, e);
        }
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
     * Allocates a long array of the requested size.
     *
     * @param request The requested size.
     * @return a new long array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int, int)
     */
    public static long[] longArray(final int request) {
        return new long[check(request, Long.BYTES)];
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

}
