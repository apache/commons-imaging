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
 *
 * Added 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging.test.util;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * Tools for tests related to BufferedImages.
 */
public final class BufferedImageTools {
        /**
     * Returns a table which contains the RGB colors of the given image.
     * @param bufImage
     * @return 
     */
    public static List<List<Integer>> getBufferedImageAsTable(final BufferedImage bufImage) {
        final int height = bufImage.getHeight(); // y
        final int width = bufImage.getWidth(); // x
        final List<List<Integer>> table = new ArrayList<List<Integer>>();
        
        for (int y = 0; y < height; y++) {
            final List<Integer> row = new ArrayList<Integer>();
            for(int x = 0; x < width; x++) {
                row.add(bufImage.getRGB(x, y));
            } 
            table.add(row);
        }
        return table;
    }
    /**
     * Prints the RGB colors of the given image as table with x, y = 0, 0 on top left.
     * @param bufImage 
     */
    public static void debugBufferedImageAsTable(final BufferedImage bufImage, final String comment) {
        System.out.println();
        System.out.println(comment);
        List<List<Integer>> table = getBufferedImageAsTable(bufImage);
        for (List<Integer> row : table) {
            System.out.println(row);
        }
        System.out.println();
    }
}
