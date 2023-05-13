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

/**
 * Thrown when an allocation request is too large.
 */
public class AllocationRequestException extends ImagingRuntimeException {

    private static final long serialVersionUID = 1L;

    private final int limit;
    private final int request;

    /**
     * Constructs a new instance.
     *
     * @param limit The allocation limit.
     * @param request The allocation request.
     */
    public AllocationRequestException(final int limit, final int request) {
        super(String.format("Allocation limit %,d exceeded: %,d", limit, request));
        this.limit = limit;
        this.request = request;
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
    public int getRequest() {
        return request;
    }
}
