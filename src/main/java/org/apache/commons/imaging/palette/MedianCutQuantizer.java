/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.palette;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.Allocator;
import org.apache.commons.imaging.internal.Debug;

public class MedianCutQuantizer {
    private final boolean ignoreAlpha;

    public MedianCutQuantizer(final boolean ignoreAlpha) {
        this.ignoreAlpha = ignoreAlpha;
    }

    public Map<Integer, ColorCount> groupColors(final BufferedImage image, final int maxColors) {
        final int max = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int mask = 0xff & 0xff << i;
            mask = mask | mask << 8 | mask << 16 | mask << 24;

            Debug.debug("mask(" + i + "): " + mask + " (" + Integer.toHexString(mask) + ")");

            final Map<Integer, ColorCount> result = groupColors1(image, max, mask);
            if (result != null) {
                return result;
            }
        }
        throw new IllegalArgumentException();
    }

    private Map<Integer, ColorCount> groupColors1(final BufferedImage image, final int max, final int mask) {
        final Map<Integer, ColorCount> colorMap = new HashMap<>();

        final int width = image.getWidth();
        final int height = image.getHeight();

        final int[] row = Allocator.intArray(width);
        for (int y = 0; y < height; y++) {
            image.getRGB(0, y, width, 1, row, 0, width);
            for (int x = 0; x < width; x++) {
                int argb = row[x];

                if (ignoreAlpha) {
                    argb &= 0xffffff;
                }
                argb &= mask;

                ColorCount color = colorMap.get(argb);
                if (color == null) {
                    color = new ColorCount(argb);
                    colorMap.put(argb, color);
                    if (colorMap.size() > max) {
                        return null;
                    }
                }
                color.count++;
            }
        }

        return colorMap;
    }

    public Palette process(final BufferedImage image, final int maxColors, final MedianCut medianCut) throws ImagingException {
        final Map<Integer, ColorCount> colorMap = groupColors(image, maxColors);

        final int discreteColors = colorMap.size();
        if (discreteColors <= maxColors) {
            Debug.debug("lossless palette: " + discreteColors);

            final int[] palette = Allocator.intArray(discreteColors);
            final List<ColorCount> colorCounts = new ArrayList<>(colorMap.values());

            for (int i = 0; i < colorCounts.size(); i++) {
                final ColorCount colorCount = colorCounts.get(i);
                palette[i] = colorCount.argb;
                if (ignoreAlpha) {
                    palette[i] |= 0xff000000;
                }
            }

            return new SimplePalette(palette);
        }

        Debug.debug("discrete colors: " + discreteColors);

        final List<ColorGroup> colorGroups = new ArrayList<>();
        final ColorGroup root = new ColorGroup(new ArrayList<>(colorMap.values()), ignoreAlpha);
        colorGroups.add(root);

        while (colorGroups.size() < maxColors) {
            if (!medianCut.performNextMedianCut(colorGroups, ignoreAlpha)) {
                break;
            }
        }

        final int paletteSize = colorGroups.size();
        Debug.debug("palette size: " + paletteSize);

        final int[] palette = Allocator.intArray(paletteSize);

        for (int i = 0; i < colorGroups.size(); i++) {
            final ColorGroup colorGroup = colorGroups.get(i);

            palette[i] = colorGroup.getMedianValue();

            colorGroup.paletteIndex = i;

            if (colorGroup.getColorCounts().isEmpty()) {
                throw new ImagingException("Empty colorGroup: " + colorGroup);
            }
        }

        if (paletteSize > discreteColors) {
            throw new ImagingException("paletteSize > discreteColors");
        }

        return new MedianCutPalette(root, palette);
    }
}
