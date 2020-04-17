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
package org.apache.commons.imaging.formats.tiff;

/**
 *
 */
public class TiffRasterStatistics {

    public final int nSample;
    public final int nNull;
    public final float minValue;
    public final float maxValue;
    public final float meanValue;

    TiffRasterStatistics(TiffRasterData raster, float valueToIgnore) {
        float vMin = Float.POSITIVE_INFINITY;
        float vMax = Float.NEGATIVE_INFINITY;
        double vSum = 0;
        int nS = 0;
        int nN = 0;
        float[] data = raster.getData();
        for (int i = 0; i < data.length; i++) {
            float test = data[i];
            if (Float.isNaN(test) || test == valueToIgnore) {
                nN++;
                continue;
            }

            nS++;
            vSum += test;
            if (test < vMin) {
                vMin = test;
            }
            if (test > vMax) {
                vMax = test;
            }
        }

        minValue = vMin;
        maxValue = vMax;
        nSample = nS;
        nNull = nN;
        if (nSample == 0) {
            meanValue = 0;
        } else {
            meanValue = (float) (vSum / nSample);
        }
    }

}
