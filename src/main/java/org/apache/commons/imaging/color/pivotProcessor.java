/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.color;

public class pivotProcessor {

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_m = 7.787037; // match in slope. Note commonly seen 7.787 gives worse results

    /** see: https://en.wikipedia.org/wiki/CIELAB_color_space#From_CIEXYZ_to_CIELAB[10] */
    private static final double XYZ_t0 = 0.008856;
    public static double pivotRGB(double n) {
        if (n > 0.0031308) {
            n = 1.055 * Math.pow(n, 1 / 2.4) - 0.055;
        } else {
            n = 12.92 * n;
        }
        return n;
    }

    public static double unPivotRGB(double n) {
        if (n > 0.04045) {
            n = Math.pow((n + 0.055) / 1.055, 2.4);
        } else {
            n = n / 12.92;
        }
        return n;
    }

    public static double pivotXYZ(double n) {
        if (n > XYZ_t0) {
            n = Math.pow(n, 1 / 3.0);
        } else {
            n = XYZ_m * n + 16 / 116.0;
        }
        return n;
    }

    public static double unPivotXYZ(double n) {
        final double nCube = Math.pow(n, 3);
        if (nCube > XYZ_t0) {
            n = nCube;
        } else {
            n = (n - 16 / 116.0) / XYZ_m;
        }
        return n;
    }
}
