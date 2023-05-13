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

    static {
        LIMIT = Integer.getInteger(CANONICAL_NAME, DEFAULT);
    }

    /**
     * Allocates an Object of type T of the requested size.
     *
     * @param <T> The return array type
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
     * @param <T> The return array type
     * @param request The requested size.
     * @param factory The array factory.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static <T> T[] array(final int request, final IntFunction<T[]> factory) {
        // We could pass in a shallow object byte size to multiply with the request.
        // The shallow byte size would need to be computed and hard-coded in statics.
        return factory.apply(check(request));
    }

    /**
     * Allocates an Object array of type T of the requested size.
     *
     * @param <T> The return array type
     * @param request The requested size.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static <T> ArrayList<T> arrayList(final int request) {
        return apply(request, ArrayList::new);
    }

    /**
     * Allocates a byte array of the requested size.
     *
     * @param request The requested size.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static byte[] byteArray(final int request) {
        return new byte[check(request)];
    }

    /**
     * Allocates a byte array of the requested size.
     *
     * @param request The requested size is cast down to an int.
     * @return a new byte array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static byte[] byteArray(final long request) {
        return new byte[check(request)];
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property
     * "org.apache.commons.imaging.common.mylzw.AllocationChecker".
     * </p>
     *
     * @param request an allocation request.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final int request) {
        if (request > LIMIT) {
            throw new AllocationRequestException(DEFAULT, request);
        }
        return request;
    }

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property
     * "org.apache.commons.imaging.common.mylzw.AllocationChecker".
     * </p>
     *
     * @param request the allocation request is cast down to an int.
     * @return the request.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     */
    public static int check(final long request) {
        if (request > Integer.MAX_VALUE) {
            throw new AllocationRequestException(DEFAULT, request);
        }
        return check((int) request);
    }

    /**
     * Allocates a double array of the requested size.
     *
     * @param request The requested size.
     * @return a new double array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static double[] doubleArray(final int request) {
        return new double[check(request)];
    }

    /**
     * Allocates a float array of the requested size.
     *
     * @param request The requested size.
     * @return a new float array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static float[] floatArray(final int request) {
        return new float[check(request)];
    }

    /**
     * Allocates a int array of the requested size.
     *
     * @param request The requested size.
     * @return a new int array.
     * @throws AllocationRequestException Thrown when the request exceeds the limit.
     * @see #check(int)
     */
    public static int[] intArray(final int request) {
        return new int[check(request)];
    }

}
