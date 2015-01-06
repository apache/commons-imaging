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
package org.apache.commons.imaging.color;

public final class ColorCieLuv {

    public final double L;
    public final double u;
    public final double v;

    public ColorCieLuv(final double L, final double u, final double v) {
        this.L = L;
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", u: " + u + ", v: " + v + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ColorCieLuv that = (ColorCieLuv) o;
        if (Double.compare(that.L, L) != 0) {
            return false;
        }
        if (Double.compare(that.u, u) != 0) {
            return false;
        }
        if (Double.compare(that.v, v) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(L);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(u);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(v);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
