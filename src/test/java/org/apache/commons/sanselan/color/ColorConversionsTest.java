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
package org.apache.commons.sanselan.color;

import org.apache.commons.sanselan.util.Debug;

import junit.framework.TestCase;

public class ColorConversionsTest extends TestCase
{
    private static final int SAMPLE_RGBS[] = {
            0xffffffff,
            0xff000000,
            0xffff0000,
            0xff00ff00,
            0xff0000ff,
            0xffff00ff,
            0xfff0ff00,
            0xff00ffff,
            0x00000000,
            0xff7f7f7f,
    };

    public void testCMYKtoRGB() throws Exception
    {
        for (int C = 0; C <= 256; C += 64)
        {
            for (int M = 0; M <= 256; M += 64)
            {
                for (int Y = 0; Y <= 256; Y += 64)
                {
                    for (int K = 0; K <= 256; K += 64)
                    {
                        int rgb1 = ColorConversions.convertCMYKtoRGB(Math.min(255, C), Math.min(255, M), Math.min(255, Y), Math.min(255, K));
                        int rgb2 = ColorConversions.convertCMYKtoRGB_old(Math.min(255, C), Math.min(255, M), Math.min(255, Y), Math.min(255, K));
                        
                        assertEquals(new ColorCmyk(C, M, Y, K).toString(), Integer.toHexString(rgb1).toUpperCase(), Integer.toHexString(rgb2).toUpperCase());
                    }
                }
            }
        }
    }

    public void testRGBtoCMYK() throws Exception
    {
        for (int i = 0; i < SAMPLE_RGBS.length; i++)
        {
            int rgb = SAMPLE_RGBS[i];

            ColorCmy cmy = ColorConversions.convertRGBtoCMY(rgb);
            ColorCmyk cmyk = ColorConversions.convertCMYtoCMYK(cmy);
            ColorCmy cmyk_cmy = ColorConversions.convertCMYKtoCMY(cmyk);
            int cmyk_cmy_rgb = ColorConversions.convertCMYtoRGB(cmyk_cmy);

            Debug.debug("cmy", cmy);
            Debug.debug("cmyk", cmyk);
            Debug.debug("cmyk_cmy", cmyk_cmy);
            Debug.debug("cmyk_cmy_rgb", cmyk_cmy_rgb + " (" + Integer.toHexString(cmyk_cmy_rgb) + ")");
            
            assertEquals((0xffffff & cmyk_cmy_rgb), (0xffffff & rgb));
        }
    }

    public void testRGBtoHSL() throws Exception
    {
        for (int i = 0; i < SAMPLE_RGBS.length; i++)
        {
            int rgb = SAMPLE_RGBS[i];

            ColorHsl hsl = ColorConversions.convertRGBtoHSL(rgb);
            int hsl_rgb = ColorConversions.convertHSLtoRGB(hsl);

            Debug.debug("hsl", hsl);
            Debug.debug("hsl_rgb", hsl_rgb + " (" + Integer.toHexString(hsl_rgb) + ")");
            
            assertEquals((0xffffff & hsl_rgb), (0xffffff & rgb));
        }
    }

    public void testRGBtoHSV() throws Exception
    {
        for (int i = 0; i < SAMPLE_RGBS.length; i++)
        {
            int rgb = SAMPLE_RGBS[i];

            ColorHsv hsv = ColorConversions.convertRGBtoHSV(rgb);
            int hsv_rgb = ColorConversions.convertHSVtoRGB(hsv);

            Debug.debug("hsv", hsv);
            Debug.debug("hsv_rgb", hsv_rgb + " (" + Integer.toHexString(hsv_rgb) + ")");
            
            assertEquals((0xffffff & hsv_rgb), (0xffffff & rgb));
        }
    }

    public void testXYZ() throws Exception
    {
        for (int i = 0; i < SAMPLE_RGBS.length; i++)
        {
            int rgb = SAMPLE_RGBS[i];

            ColorXyz xyz = ColorConversions.convertRGBtoXYZ(rgb);
            int xyz_rgb = ColorConversions.convertXYZtoRGB(xyz);

            Debug.debug();
            Debug.debug("rgb", rgb + " (" + Integer.toHexString(rgb) + ")");
            Debug.debug("xyz", xyz);
            Debug.debug("xyz_rgb", xyz_rgb + " (" + Integer.toHexString(xyz_rgb) + ")");
            
            assertEquals((0xffffff & xyz_rgb), (0xffffff & rgb));

            
            ColorCieLab cielab = ColorConversions.convertXYZtoCIELab(xyz);
            ColorXyz cielab_xyz = ColorConversions.convertCIELabtoXYZ(cielab);
            int cielab_xyz_rgb = ColorConversions.convertXYZtoRGB(cielab_xyz);

            Debug.debug("cielab", cielab);
            Debug.debug("cielab_xyz", cielab_xyz);
            Debug.debug("cielab_xyz_rgb", cielab_xyz_rgb + " (" + Integer.toHexString(cielab_xyz_rgb) + ")");
            
            assertEquals((0xffffff & cielab_xyz_rgb), (0xffffff & rgb));


            ColorHunterLab hunterlab = ColorConversions.convertXYZtoHunterLab(xyz);
            ColorXyz hunterlab_xyz = ColorConversions.convertHunterLabtoXYZ(hunterlab);
            int hunterlab_xyz_rgb = ColorConversions.convertXYZtoRGB(hunterlab_xyz);

            Debug.debug("hunterlab", hunterlab);
            Debug.debug("hunterlab_xyz", hunterlab_xyz);
            Debug.debug("hunterlab_xyz_rgb", hunterlab_xyz_rgb + " (" + Integer.toHexString(hunterlab_xyz_rgb) + ")");
            
            assertEquals((0xffffff & hunterlab_xyz_rgb), (0xffffff & rgb));

            
            ColorCieLch cielch = ColorConversions.convertCIELabtoCIELCH(cielab);
            ColorCieLab cielch_cielab = ColorConversions.convertCIELCHtoCIELab(cielch);

            Debug.debug("cielch", cielch);
            Debug.debug("cielch_cielab", cielch_cielab);

            ColorCieLuv cieluv = ColorConversions.convertXYZtoCIELuv(xyz);
            ColorXyz cieluv_xyz = ColorConversions.convertCIELuvtoXYZ(cieluv);

            Debug.debug("cieluv", cieluv);
            Debug.debug("cieluv_xyz", cieluv_xyz);
        }
    }
}
