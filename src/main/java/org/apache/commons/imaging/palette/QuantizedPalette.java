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

import java.util.List;
import org.apache.commons.imaging.ImageWriteException;

public class QuantizedPalette extends Palette {
    private final int precision;
    private final List<ColorSpaceSubset> subsets;
    private final ColorSpaceSubset[] straight;

    public QuantizedPalette(final List<ColorSpaceSubset> subsets, final int precision) {
        this.subsets = subsets;
        this.precision = precision;

        straight = new ColorSpaceSubset[1 << (precision * 3)];

        for (int i = 0; i < subsets.size(); i++) {
            final ColorSpaceSubset subset = subsets.get(i);
            subset.setIndex(i);

            for (int u = subset.mins[0]; u <= subset.maxs[0]; u++) {
                for (int j = subset.mins[1]; j <= subset.maxs[1]; j++) {
                    for (int k = subset.mins[2]; k <= subset.maxs[2]; k++) {
                        final int index = (u << (precision * 2))
                                | (j << (precision * 1))
                                | (k << (precision * 0));
                        straight[index] = subset;
                    }
                }
            }
        }
    }

    @Override
    public int getPaletteIndex(final int rgb) throws ImageWriteException {
        final int precisionMask = (1 << precision) - 1;

        final int index = ((rgb >> (24 - 3 * precision)) & (precisionMask << (precision << 1)))
                | ((rgb >> (16 - 2 * precision)) & (precisionMask << precision))
                | ((rgb >> (8 - precision)) & (precisionMask));

        return straight[index].getIndex();
    }

    @Override
    public int getEntry(final int index) {
        final ColorSpaceSubset subset = subsets.get(index);
        return subset.rgb;
    }

    @Override
    public int length() {
        return subsets.size();

    }
}
