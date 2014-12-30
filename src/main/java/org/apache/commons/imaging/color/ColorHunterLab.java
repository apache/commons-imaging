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

public final class ColorHunterLab {
    public static final ColorHunterLab RED = new ColorHunterLab(46.109, 78.962, 29.794);
    public static final ColorHunterLab GREEN = new ColorHunterLab(84.569, -72.518, 50.842);
    public static final ColorHunterLab BLUE = new ColorHunterLab(26.870, 72.885, -190.923);
    public static final ColorHunterLab BLACK = new ColorHunterLab(0, 0, 0);
    public static final ColorHunterLab WHITE = new ColorHunterLab(100, -5.336, 5.433);

    public final double L;
    public final double a;
    public final double b;

    public ColorHunterLab(final double l, final double a, final double b) {
        L = l;
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{L: " + L + ", a: " + a + ", b: " + b + "}";
    }
}
