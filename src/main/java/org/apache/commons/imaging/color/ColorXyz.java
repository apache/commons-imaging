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

public final class ColorXyz {

    public final double X;
    public final double Y;
    public final double Z;

    public ColorXyz(final double X, final double Y, final double Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    @Override
    public String toString() {
        return "{X: " + X + ", Y: " + Y + ", Z: " + Z + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ColorXyz colorXyz = (ColorXyz) o;
        if (Double.compare(colorXyz.X, X) != 0) {
            return false;
        }
        if (Double.compare(colorXyz.Y, Y) != 0) {
            return false;
        }
        if (Double.compare(colorXyz.Z, Z) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(X);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
