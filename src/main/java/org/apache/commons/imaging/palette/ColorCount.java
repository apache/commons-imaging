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
package org.apache.commons.imaging.palette;

class ColorCount {
    public final int argb;
    public int count;
    public final int alpha;
    public final int red;
    public final int green;
    public final int blue;

    public ColorCount(final int argb) {
        this.argb = argb;

        alpha = 0xff & (argb >> 24);
        red = 0xff & (argb >> 16);
        green = 0xff & (argb >> 8);
        blue = 0xff & (argb >> 0);
    }

    @Override
    public int hashCode() {
        return argb;
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof ColorCount) {
            final ColorCount other = (ColorCount) o;
            return other.argb == this.argb;
        }
        return false;
    }

}
