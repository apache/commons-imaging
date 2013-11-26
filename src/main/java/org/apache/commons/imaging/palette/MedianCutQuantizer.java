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

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.util.Debug;

public class MedianCutQuantizer {
    private final boolean ignoreAlpha;

    public MedianCutQuantizer(final boolean ignore_alpha) {
        this.ignoreAlpha = ignore_alpha;
    }

    private Map<Integer, ColorCount> groupColors1(final BufferedImage image, final int max,
            final int mask) {
        final Map<Integer, ColorCount> color_map = new HashMap<Integer, ColorCount>();

        final int width = image.getWidth();
        final int height = image.getHeight();

        final int row[] = new int[width];
        for (int y = 0; y < height; y++) {
            image.getRGB(0, y, width, 1, row, 0, width);
            for (int x = 0; x < width; x++) {
                int argb = row[x];

                if (ignoreAlpha) {
                    argb &= 0xffffff;
                }
                argb &= mask;

                ColorCount color = color_map.get(argb);
                if (color == null) {
                    color = new ColorCount(argb);
                    color_map.put(argb, color);
                    if (color_map.keySet().size() > max) {
                        return null;
                    }
                }
                color.count++;
            }
        }

        return color_map;
    }

    public Map<Integer, ColorCount> groupColors(final BufferedImage image,
            final int max_colors) {
        final int max = Integer.MAX_VALUE;

        for (int i = 0; i < 8; i++) {
            int mask = 0xff & (0xff << i);
            mask = mask | (mask << 8) | (mask << 16) | (mask << 24);

            Debug.debug("mask(" + i + "): " + mask + " (" + Integer.toHexString(mask) + ")");

            final Map<Integer, ColorCount> result = groupColors1(image, max, mask);
            if (result != null) {
                return result;
            }
        }
        throw new Error("");
    }
    
    public Palette process(final BufferedImage image, final int max_colors,
            final MedianCutImplementation medianCutImplementation, final boolean verbose)
            throws ImageWriteException {
        final Map<Integer, ColorCount> color_map = groupColors(image, max_colors);

        final int discrete_colors = color_map.keySet().size();
        if (discrete_colors <= max_colors) {
            if (verbose) {
                Debug.debug("lossless palette: " + discrete_colors);
            }

            final int palette[] = new int[discrete_colors];
            final List<ColorCount> color_counts = new ArrayList<ColorCount>(
                    color_map.values());

            for (int i = 0; i < color_counts.size(); i++) {
                final ColorCount color_count = color_counts.get(i);
                palette[i] = color_count.argb;
                if (ignoreAlpha) {
                    palette[i] |= 0xff000000;
                }
            }

            return new SimplePalette(palette);
        }

        if (verbose) {
            Debug.debug("discrete colors: " + discrete_colors);
        }

        final List<ColorGroup> color_groups = new ArrayList<ColorGroup>();
        final ColorGroup root = new ColorGroup(new ArrayList<ColorCount>(
                color_map.values()), ignoreAlpha);
        color_groups.add(root);

        while (color_groups.size() < max_colors) {
            if (!medianCutImplementation.performNextMedianCut(color_groups, ignoreAlpha)) {
                break;
            }
        }

        final int palette_size = color_groups.size();
        if (verbose) {
            Debug.debug("palette size: " + palette_size);
        }

        final int palette[] = new int[palette_size];

        for (int i = 0; i < color_groups.size(); i++) {
            final ColorGroup color_group = color_groups.get(i);

            palette[i] = color_group.getMedianValue();

            color_group.palette_index = i;

            if (color_group.color_counts.size() < 1) {
                throw new ImageWriteException("empty color_group: "
                        + color_group);
            }
        }

        if (palette_size > discrete_colors) {
            throw new ImageWriteException("palette_size>discrete_colors");
        }

        return new MedianCutPalette(root, palette);
    }
}
