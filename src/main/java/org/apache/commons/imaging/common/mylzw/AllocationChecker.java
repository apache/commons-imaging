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

package org.apache.commons.imaging.common.mylzw;

/**
 * Checks inputs for meeting allocation limits.
 */
class AllocationChecker {

    private static final String CANONICAL_NAME = AllocationChecker.class.getCanonicalName();
    
    /** One GB. */
    private static final int DEFAULT = 1_073_741_824;

    /**
     * Checks a request for meeting allocation limits.
     * <p>
     * The default limit is {@value #DEFAULT}, override with the system property "org.apache.commons.imaging.common.mylzw.AllocationChecker".  
     * </p>
     *
     * @param request an allocation request.
     * @return the request.
     */
    static int check(final int request) {
        // 1 GB limit
        final int limit = Integer.getInteger(CANONICAL_NAME, DEFAULT);
        if (request > limit) {
            throw new IllegalArgumentException(String.format("Allocation limit %,d exceeded: %,d", limit, request));
        }
        return request;
    }

}
