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
    public static final ColorCieLuv RED = new ColorCieLuv(53.2329, 175.0530, 37.7501);
    public static final ColorCieLuv GREEN = new ColorCieLuv(87.7370, -83.0798, 107.4014);
    public static final ColorCieLuv BLUE = new ColorCieLuv(32.3026, -9.3999, -130.3584);
    public static final ColorCieLuv BLACK = new ColorCieLuv(0, 0, 0);
    public static final ColorCieLuv WHITE = new ColorCieLuv(100, 0, 0);

    public final double L;
    public final double u;
    public final double v;

    public ColorCieLuv(final double l, final double u, final double v) {
        L = l;
        this.u = u;
        this.v = v;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", u: " + u + ", v: " + v + "}";
    }
}
