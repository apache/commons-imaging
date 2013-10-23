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

package org.apache.commons.imaging.formats.pnm;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageReadException;

public class PamFileInfo extends FileInfo {
    private final int depth;
    private final int maxval;
    private final float scale;
    private final int bytesPerSample; 
    private final boolean hasAlpha;
    private final TupleReader tupleReader;

    PamFileInfo(final int width, final int height, final int depth, final int maxval, final String tupleType) throws ImageReadException {
        super(width, height, true);
        this.depth = depth;
        this.maxval = maxval;
        if (maxval <= 0) {
            throw new ImageReadException("PAM maxVal " + maxval
                    + " is out of range [1;65535]");
        } else if (maxval <= 255) {
            scale = 255f;
            bytesPerSample = 1;
        } else if (maxval <= 65535) {
            scale = 65535f;
            bytesPerSample = 2;
        } else {
            throw new ImageReadException("PAM maxVal " + maxval
                    + " is out of range [1;65535]");
        }

        hasAlpha = tupleType.endsWith("_ALPHA");
        if (tupleType.equals("BLACKANDWHITE") || tupleType.equals("BLACKANDWHITE_ALPHA")) {
            tupleReader = new GrayscaleTupleReader(ImageInfo.COLOR_TYPE_BW);
        } else if (tupleType.equals("GRAYSCALE") || tupleType.equals("GRAYSCALE_ALPHA")) {
            tupleReader = new GrayscaleTupleReader(ImageInfo.COLOR_TYPE_GRAYSCALE);
        } else if (tupleType.equals("RGB") || tupleType.equals("RGB_ALPHA")) {
            tupleReader = new ColorTupleReader();
        } else {
            throw new ImageReadException("Unknown PAM tupletype '" + tupleType + "'");
        }
    }
    
    @Override
    public boolean hasAlpha() {
        return hasAlpha;
    }
    
    @Override
    public int getNumComponents() {
        return depth;
    }

    @Override
    public int getBitDepth() {
        return maxval;
    }

    @Override
    public ImageFormat getImageType() {
        return ImageFormat.PAM;
    }

    @Override
    public String getImageTypeDescription() {
        return "PAM: portable arbitrary map file format";
    }

    @Override
    public String getMIMEType() {
        return "image/x-portable-arbitrary-map";
    }

    @Override
    public int getColorType() {
        return tupleReader.getColorType();
    }
    
    @Override
    public int getRGB(final WhiteSpaceReader wsr) throws IOException {
        throw new UnsupportedOperationException("PAM files are only ever binary");
    }

    @Override
    public int getRGB(final InputStream is) throws IOException {
        return tupleReader.getRGB(is);
    }

    private abstract class TupleReader {
        public abstract int getColorType();
        public abstract int getRGB(InputStream is) throws IOException;
    }
    
    private class GrayscaleTupleReader extends TupleReader {
        private final int colorType;
        
        public GrayscaleTupleReader(final int colorType) {
            this.colorType = colorType;
        }
        
        @Override
        public int getColorType() {
            return colorType;
        }
        
        @Override
        public int getRGB(final InputStream is) throws IOException {
            int sample = readSample(is, bytesPerSample);
            sample = scaleSample(sample, scale, maxval);
            
            int alpha = 0xff;
            if (hasAlpha) {
                alpha = readSample(is, bytesPerSample);
                alpha = scaleSample(alpha, scale, maxval);
            }

            final int rgb = ((0xff & alpha) << 24) | ((0xff & sample) << 16)
                    | ((0xff & sample) << 8) | ((0xff & sample) << 0);

            return rgb;
        }
    }
    
    private class ColorTupleReader extends TupleReader {
        @Override
        public int getColorType() {
            return ImageInfo.COLOR_TYPE_RGB;
        }
        
        @Override
        public int getRGB(final InputStream is) throws IOException {
            int red = readSample(is, bytesPerSample);
            int green = readSample(is, bytesPerSample);
            int blue = readSample(is, bytesPerSample);

            red = scaleSample(red, scale, maxval);
            green = scaleSample(green, scale, maxval);
            blue = scaleSample(blue, scale, maxval);

            int alpha =  0xff;
            if (hasAlpha) {
                alpha = readSample(is, bytesPerSample);
                alpha = scaleSample(alpha, scale, maxval);
            }

            final int rgb = ((0xff & alpha) << 24) | ((0xff & red) << 16)
                    | ((0xff & green) << 8) | ((0xff & blue) << 0);

            return rgb;
        }
    }
}
