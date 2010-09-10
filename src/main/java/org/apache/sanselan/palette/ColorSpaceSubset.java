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
package org.apache.sanselan.palette;

class ColorSpaceSubset implements Comparable
{
    public final int mins[], maxs[];
    public final int precision;
    public final int precision_mask;
    public final int total;
    public int rgb; // median

    public ColorSpaceSubset(int total, int precision)
    {
        this.total = total;
        this.precision = precision;
        precision_mask = (1 << precision) - 1;

        mins = new int[PaletteFactory.components];
        maxs = new int[PaletteFactory.components];
        for (int i = 0; i < PaletteFactory.components; i++)
        {
            mins[i] = 0;
            //            maxs[i] = 255;
            maxs[i] = precision_mask;
        }

        rgb = -1;
    }

    public ColorSpaceSubset(int total, int precision, int mins[], int maxs[],
            int table[])
    {
        this.total = total;
        this.precision = precision;
        this.mins = mins;
        this.maxs = maxs;
        precision_mask = (1 << precision) - 1;

        rgb = -1;
    }

    public static long compares = 0;

    public final boolean contains(int red, int green, int blue)
    {
        compares++;

        red >>= (8 - precision);
        if (mins[0] > red)
            return false;
        if (maxs[0] < red)
            return false;

        green >>= (8 - precision);
        if (mins[1] > green)
            return false;
        if (maxs[1] < green)
            return false;

        blue >>= (8 - precision);
        if (mins[2] > blue)
            return false;
        if (maxs[2] < blue)
            return false;

        return true;
    }

    public void dump(String prefix)
    {
        int rdiff = maxs[0] - mins[0] + 1;
        int gdiff = maxs[1] - mins[1] + 1;
        int bdiff = maxs[2] - mins[2] + 1;
        int color_area = rdiff * gdiff * bdiff;

        System.out.println(prefix + ": [" + Integer.toHexString(rgb)
                + "] total : " + total
        //                        + " ("
                //                        + (100.0 * (double) total / (double) total_area)
                //                        + " %)"
                );
        System.out.println("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
        System.out.println("\t" + "red: " + mins[0] + ", " + maxs[0] + ", "
                + "green: " + mins[1] + ", " + maxs[1] + ", " + "blue: "
                + mins[2] + ", " + maxs[2]);
        System.out
                .println("\t" + "rdiff: " + rdiff + ", " + "gdiff: " + gdiff
                        + ", " + "bdiff: " + bdiff + ", " + "color_area: "
                        + color_area);
    }

    public void dumpJustRGB(String prefix)
    {
        System.out.println("\t" + "rgb: " + Integer.toHexString(rgb) + ", "
                + "red: " + Integer.toHexString(mins[0] << (8 - precision))
                + ", " + Integer.toHexString(maxs[0] << (8 - precision)) + ", "
                + "green: " + Integer.toHexString(mins[1] << (8 - precision))
                + ", " + Integer.toHexString(maxs[1] << (8 - precision)) + ", "
                + "blue: " + Integer.toHexString(mins[2] << (8 - precision))
                + ", " + Integer.toHexString(maxs[2] << (8 - precision)));
    }

    public int getArea()
    {
        int rdiff = maxs[0] - mins[0] + 1;
        int gdiff = maxs[1] - mins[1] + 1;
        int bdiff = maxs[2] - mins[2] + 1;
        int color_area = rdiff * gdiff * bdiff;

        return color_area;

    }

    public void setAverageRGB(int table[])
    {

        {
            long redsum = 0, greensum = 0, bluesum = 0;

            for (int red = mins[0]; red <= maxs[0]; red++)
                for (int green = mins[1]; green <= maxs[1]; green++)
                    for (int blue = mins[2]; blue <= maxs[2]; blue++)
                    //                    for (int red = 0; red <= precision_mask; red++)
                    //                        for (int green = 0; green <= precision_mask; green++)
                    //                            for (int blue = 0; blue <= precision_mask; blue++)
                    {
                        int index = (blue << (2 * precision)) // note: order reversed
                                | (green << (1 * precision))
                                | (red << (0 * precision));
                        int count = table[index];
                        redsum += count * (red << (8 - precision));
                        greensum += count * (green << (8 - precision));
                        bluesum += count * (blue << (8 - precision));

                    }

            redsum /= total;
            greensum /= total;
            bluesum /= total;
            rgb = (int) (((redsum & 0xff) << 16) | ((greensum & 0xff) << 8) | ((bluesum & 0xff) << 0));
        }
    }

    public int compareTo(Object o)
    {
        ColorSpaceSubset other = (ColorSpaceSubset) o;
        return rgb - other.rgb;
    }

    public int index;

    public final void setIndex(int i)
    {
        index = i;
    }

}