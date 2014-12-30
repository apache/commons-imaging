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
    public static final ColorXyz RED = new ColorXyz(41.24, 21.26, 1.93);
    public static final ColorXyz GREEN = new ColorXyz(35.76, 71.52, 11.92);
    public static final ColorXyz BLUE = new ColorXyz(18.05, 7.22, 95.05);
    public static final ColorXyz BLACK = new ColorXyz(0, 0, 0);
    public static final ColorXyz WHITE = new ColorXyz(95.05, 100, 108.9);

    public final double X;
    public final double Y;
    public final double Z;

    public ColorXyz(final double x, final double y, final double z) {
        X = x;
        Y = y;
        Z = z;
    }

    @Override
    public String toString() {
        return "{X: " + X + ", Y: " + Y + ", Z: " + Z + "}";
    }
}
