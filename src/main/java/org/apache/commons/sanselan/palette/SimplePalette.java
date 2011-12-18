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
package org.apache.commons.sanselan.palette;

import org.apache.commons.sanselan.util.Debug;

public class SimplePalette extends Palette
{
    private final int palette[];

    public SimplePalette(int palette[])
    {
        this.palette = palette;
    }

    public int getPaletteIndex(int rgb)
    {
        return getPaletteIndex(palette, rgb);
    }

    public int getEntry(int index)
    {
        return palette[index];
        //            return getPaletteIndex(palette, rgb);
    }

    private int getPaletteIndex(int palette[], int argb)
    {

        //        Debug.debug("getPaletteIndex argb", argb + " ("
        //                + Integer.toHexString(argb) + ")");

        for (int i = 0; i < palette.length; i++)
        {
            //            Debug.debug("\t" + "palette[" + i + "]", palette[i] + " ("
            //                    + Integer.toHexString(palette[i]) + ")");

            if (palette[i] == argb)
                return i;
        }

        return -1;
    }

    public void dump()
    {
        for (int i = 0; i < palette.length; i++)
        {
            Debug.debug("\t" + "palette[" + i + "]", palette[i] + " (0x"
                    + Integer.toHexString(palette[i]) + ")");
        }
    }

    public int length()
    {
        return palette.length;
    }
}