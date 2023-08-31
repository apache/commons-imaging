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

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 * A comparator for {#link ColorCount} elements.
 *
 * <p>It uses a given {#link ColorComponent} to choose what
 * channel must be used for the comparison.</p>
 *
 * <p>For example, if the comparator is created for the
 * {@code ColorComponent.RED} channel, then it will
 * compare the value of red of each {@code ColorCount}
 * object in the array of elements.</p>
 *
 * @since 1.0-alpha2
 */
public class ColorCountComparator implements Comparator<ColorCount>, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Color component used during the comparison.
     */
    private final ColorComponent colorComponent;

    public ColorCountComparator(final ColorComponent colorComponent) {
        this.colorComponent = Objects.requireNonNull(colorComponent, "colorComponent");
    }

    @Override
    public int compare(final ColorCount c1, final ColorCount c2) {
        switch (colorComponent) {
        case ALPHA:
            return c1.alpha - c2.alpha;
        case RED:
            return c1.red - c2.red;
        case GREEN:
            return c1.green - c2.green;
        case BLUE:
            return c1.blue - c2.blue;
        default:
            return 0;
        }
    }

}
