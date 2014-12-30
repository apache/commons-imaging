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

public final class ColorCieLch {
    public static final ColorCieLch RED = new ColorCieLch(53, 80, 67);
    public static final ColorCieLch GREEN = new ColorCieLch(88, -86, 83);
    public static final ColorCieLch BLUE = new ColorCieLch(32, 79, -108);
    public static final ColorCieLch BLACK = new ColorCieLch(0, 0, 0);
    public static final ColorCieLch WHITE = new ColorCieLch(100, 0, 297);

    public final double L;
    public final double C;
    public final double H;

    public ColorCieLch(final double l, final double C, final double H) {
        L = l;
        this.C = C;
        this.H = H;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", C: " + C + ", H: " + H + "}";
    }
}
