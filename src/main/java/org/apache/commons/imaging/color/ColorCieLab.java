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

public final class ColorCieLab {
    public static final ColorCieLab RED = new ColorCieLab(53, 80, 67);
    public static final ColorCieLab GREEN = new ColorCieLab(88, -86, 83);
    public static final ColorCieLab BLUE = new ColorCieLab(32, 79, -108);
    public static final ColorCieLab BLACK = new ColorCieLab(0, 0, 0);
    public static final ColorCieLab WHITE = new ColorCieLab(100, 0, 0);

    public final double L;
    public final double a;
    public final double b;

    public ColorCieLab(final double l, final double a, final double b) {
        L = l;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", a: " + a + ", b: " + b + "}";
    }
}
