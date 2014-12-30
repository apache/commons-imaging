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

public final class ColorCmy {
    public static final ColorCmy CYAN = new ColorCmy(100, 0, 0);
    public static final ColorCmy MAGENTA = new ColorCmy(0, 100, 0);
    public static final ColorCmy YELLOW = new ColorCmy(0, 0, 100);
    public static final ColorCmy BLACK = new ColorCmy(100, 100, 100);
    public static final ColorCmy WHITE = new ColorCmy(0, 0, 0);

    public final double C;
    public final double M;
    public final double Y;

    public ColorCmy(final double C, final double M, final double Y) {
        this.C = C;
        this.M = M;
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "{C: " + C + ", M: " + M + ", Y: " + Y + "}";
    }
}
