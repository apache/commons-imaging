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

package org.apache.commons.imaging.formats.jpeg.decoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DctTest {

    private static float[] REFERENCE_forwardDCT(final float[] vector) {
        final float[] ret = new float[8];
        for (int u = 0; u < 8; u++) {
            float sum = 0;
            final float cu = (u == 0) ? ((float) (1.0 / Math.sqrt(2))) : 1;
            for (int x = 0; x < 8; x++) {
                sum += vector[x] * Math.cos((2 * x + 1) * u * Math.PI / 16);
            }
            ret[u] = 0.5f * cu * sum;
        }
        return ret;
    }

    private static float[][] REFERENCE_forwardDCT(final float[][] matrix) {
        final float[][] ret = new float[8][8];
        for (int u = 0; u < 8; u++) {
            for (int v = 0; v < 8; v++) {
                float sum = 0;
                final float cu = (u == 0) ? ((float) (1.0 / Math.sqrt(2))) : 1;
                final float cv = (v == 0) ? ((float) (1.0 / Math.sqrt(2))) : 1;
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        sum += matrix[y][x]
                                * Math.cos((2 * x + 1) * u * Math.PI / 16)
                                * Math.cos((2 * y + 1) * v * Math.PI / 16);
                    }
                }
                ret[v][u] = 0.25f * cu * cv * sum;
            }
        }
        return ret;
    }

    private static float[] REFERENCE_inverseDCT(final float[] vector) {
        final float[] ret = new float[8];
        for (int x = 0; x < 8; x++) {
            float sum = 0;
            for (int u = 0; u < 8; u++) {
                final float cu = (u == 0) ? ((float) (1.0 / Math.sqrt(2))) : 1;
                sum += cu * vector[u]
                        * Math.cos((2 * x + 1) * u * Math.PI / 16);
            }
            ret[x] = 0.5f * sum;
        }
        return ret;
    }

    private static float[][] REFERENCE_inverseDCT(final float[][] matrix) {
        final float[][] ret = new float[8][8];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                float sum = 0;
                for (int u = 0; u < 8; u++) {
                    for (int v = 0; v < 8; v++) {
                        final float cu = (u == 0) ? ((float) (1.0 / Math.sqrt(2)))
                                : 1;
                        final float cv = (v == 0) ? ((float) (1.0 / Math.sqrt(2)))
                                : 1;
                        sum += cu * cv * matrix[v][u]
                                * Math.cos((2 * x + 1) * u * Math.PI / 16)
                                * Math.cos((2 * y + 1) * v * Math.PI / 16);
                    }
                }
                ret[y][x] = 0.25f * sum;
            }
        }
        return ret;
    }

    @Test
    public void testMatrices() {
        final float[] originalData = new float[8 * 8];
        final float[][] originalData8x8 = new float[8][8];
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                final float value = 8 * y + x;
                originalData8x8[y][x] = value;
                originalData[8 * y + x] = value;
            }
        }

        final float[][] transformed8x8 = REFERENCE_forwardDCT(originalData8x8);
        final float[][] reversed8x8 = REFERENCE_inverseDCT(transformed8x8);
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                assertEquals(originalData8x8[y][x], reversed8x8[y][x], 0.001);
            }
        }

        final float[] data = originalData.clone();
        Dct.forwardDCT8x8(data);
        Dct.scaleQuantizationMatrix(data);
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                assertEquals(transformed8x8[y][x], data[8 * y + x], 0.001);
            }
        }

        Dct.scaleDequantizationMatrix(data);
        Dct.inverseDCT8x8(data);
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                assertEquals(originalData8x8[y][x], data[8 * y + x], 0.001);
            }
        }
    }

    @Test
    public void testVectors() {
        final float[] originalData = new float[8];
        for (int i = 0; i < 8; i++) {
            originalData[i] = i;
        }

        final float[] transformed = REFERENCE_forwardDCT(originalData);
        final float[] reversed = REFERENCE_inverseDCT(transformed);
        for (int i = 0; i < 8; i++) {
            assertEquals(originalData[i], reversed[i], 0.001);
        }

        final float[] data = originalData.clone();
        Dct.forwardDCT8(data);
        Dct.scaleQuantizationVector(data);
        for (int i = 0; i < 8; i++) {
            assertEquals(data[i], transformed[i], 0.001);
        }

        Dct.scaleDequantizationVector(data);
        Dct.inverseDCT8(data);
        for (int i = 0; i < 8; i++) {
            assertEquals(data[i], originalData[i], 0.001);
        }
    }
}
