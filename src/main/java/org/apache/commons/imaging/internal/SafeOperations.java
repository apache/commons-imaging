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
package org.apache.commons.imaging.internal;

import java.util.Arrays;

/**
 * Provides safe arithmetic operations to avoid, for example, numeric overflows.
 *
 * @since 1.0-alpha4
 */
public final class SafeOperations {

    /**
     * Applies {@link Math#addExact(int, int)} to a variable length array of integers.
     *
     * @param values variable length array of integers.
     * @return the values safely added.
     */
    public static int add(final int... values) {
        if (values == null || values.length < 2) {
            throw new IllegalArgumentException("You must provide at least two elements to be added");
        }
        return Arrays.stream(values).reduce(0, Math::addExact);
    }

    private SafeOperations() {
    }

}
