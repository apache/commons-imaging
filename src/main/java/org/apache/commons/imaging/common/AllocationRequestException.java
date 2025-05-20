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

package org.apache.commons.imaging.common;

import java.math.BigInteger;

import org.apache.commons.imaging.ImagingRuntimeException;

/**
 * Thrown when an allocation request is too large.
 */
public class AllocationRequestException extends ImagingRuntimeException {

    private static final long serialVersionUID = 1L;

    private static String format(final int limit, final BigInteger request) {
        return String.format("Allocation limit %,d exceeded: %,d", limit, request);
    }

    private final int limit;

    private final BigInteger request;

    /**
     * Constructs a new instance.
     *
     * @param limit   The allocation limit.
     * @param request The allocation request.
     */
    public AllocationRequestException(final int limit, final BigInteger request) {
        super(format(limit, request));
        this.limit = limit;
        this.request = request;
    }

    /**
     * Constructs a new instance.
     *
     * @param limit     The allocation limit.
     * @param request   The allocation request.
     * @param throwable the cause (which is saved for later retrieval by the {@link #getCause()} method). (A {@code null} value is permitted, and indicates that
     *                  the cause is nonexistent or unknown.)
     */
    public AllocationRequestException(final int limit, final BigInteger request, final Throwable throwable) {
        super(format(limit, request), throwable);
        this.limit = limit;
        this.request = request;
    }

    /**
     * Constructs a new instance.
     *
     * @param limit   The allocation limit.
     * @param request The allocation request.
     */
    public AllocationRequestException(final int limit, final int request) {
        this(limit, BigInteger.valueOf(request));
    }

    /**
     * Constructs a new instance.
     *
     * @param limit     The allocation limit.
     * @param request   The allocation request.
     * @param throwable the cause (which is saved for later retrieval by the {@link #getCause()} method). (A {@code null} value is permitted, and indicates that
     *                  the cause is nonexistent or unknown.)
     */
    public AllocationRequestException(final int limit, final long request, final Throwable throwable) {
        this(limit, BigInteger.valueOf(request), throwable);
    }

    /**
     * Gets the allocation limit.
     *
     * @return the allocation limit.
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Gets the allocation request.
     *
     * @return the allocation request.
     */
    public BigInteger getRequest() {
        return request;
    }
}
