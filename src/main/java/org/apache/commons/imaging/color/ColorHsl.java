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

public final class ColorHsl {
    public static final ColorHsl RED = new ColorHsl(0, 100, 100);
    public static final ColorHsl GREEN = new ColorHsl(120, 100, 100);
    public static final ColorHsl BLUE = new ColorHsl(240, 100, 100);
    public static final ColorHsl BLACK = new ColorHsl(0, 0, 0);
    public static final ColorHsl WHITE = new ColorHsl(0, 0, 100);

    public final double H;
    public final double S;

    public final double L;

    public ColorHsl(final double h, final double s, final double v) {
        H = h;
        S = s;
        L = v;
    }

    @Override
    public String toString() {
        return "{H: " + H + ", S: " + S + ", L: " + L + "}";
    }
}
