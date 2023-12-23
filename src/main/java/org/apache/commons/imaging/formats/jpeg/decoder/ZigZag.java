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

package org.apache.commons.imaging.formats.jpeg.decoder;

final class ZigZag {
    private static final int[] ZIG_ZAG = { 0, 1, 5, 6, 14, 15, 27, 28, 2, 4, 7, 13, 16, 26, 29, 42, 3, 8, 12, 17, 25, 30, 41, 43, 9, 11, 18, 24, 31, 40, 44, 53,
            10, 19, 23, 32, 39, 45, 52, 54, 20, 22, 33, 38, 46, 51, 55, 60, 21, 34, 37, 47, 50, 56, 59, 61, 35, 36, 48, 49, 57, 58, 62, 63 };

    public static void blockToZigZag(final int[] block, final int[] zz) {
        for (int i = 0; i < ZIG_ZAG.length; i++) {
            zz[ZIG_ZAG[i]] = block[i];
        }
    }

    public static void zigZagToBlock(final int[] zz, final int[] block) {
        for (int i = 0; i < ZIG_ZAG.length; i++) {
            block[i] = zz[ZIG_ZAG[i]];
        }
    }

    private ZigZag() {
    }
}
