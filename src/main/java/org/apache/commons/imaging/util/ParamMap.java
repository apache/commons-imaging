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

package org.apache.commons.imaging.util;

import java.util.Map;

public class ParamMap {

    public static boolean getParamBoolean(final Map<String,Object> params, final Object key,
            final boolean default_value) {
        boolean result = default_value;
        final Object o = params == null ? null : params.get(key);
        if (o != null && o instanceof Boolean) {
            result = ((Boolean) o).booleanValue();
        }
        return result;
    }
}
