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
package org.apache.commons.sanselan.formats.psd.dataparsers;

import org.apache.commons.sanselan.color.ColorConversions;
import org.apache.commons.sanselan.formats.psd.ImageContents;

public class DataParserLab extends DataParser
{

    public DataParserLab()
    {

    }

    protected int getRGB(int data[][][], int x, int y,
            ImageContents imageContents)
    {
        int cieL = 0xff & data[0][y][x];
        int cieA = 0xff & data[1][y][x];
        int cieB = 0xff & data[2][y][x];

        cieA -= 128;
        cieB -= 128;

        int rgb = ColorConversions.convertCIELabtoARGBTest(cieL, cieA, cieB);

        return rgb;
    }

    public int getBasicChannelsCount()
    {
        return 3;
    }

    public void dump()
    {
        //        for(int i=0;i<3;i++)
        //        {
        //            System.out.println("CIE: " + i + ": min: " + mins[i] + ", max: " + maxs[i]);
        //        }
    }
}