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

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.imaging.ImageWriteException;

public class PamWriter extends PnmWriter implements PnmConstants {
    public PamWriter() {
        super(true);
    }
    
    @Override
    public void writeImage(BufferedImage src, OutputStream os,
            Map<String, Object> params) throws ImageWriteException, IOException {

        os.write(PNM_PREFIX_BYTE);
        os.write(PAM_RAW_CODE);
        os.write(PNM_NEWLINE);
        
        int width = src.getWidth();
        int height = src.getHeight();

        os.write(("WIDTH " + width).getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);

        os.write(("HEIGHT " + height).getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);
        
        os.write(("DEPTH 3").getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);
        
        os.write(("MAXVAL 255").getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);

        os.write(("TUPLTYPE RGB_ALPHA").getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);
        
        os.write(("ENDHDR").getBytes("US-ASCII"));
        os.write(PNM_NEWLINE);
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int argb = src.getRGB(x, y);
                int alpha = 0xff & (argb >> 24);
                int red = 0xff & (argb >> 16);
                int green = 0xff & (argb >> 8);
                int blue = 0xff & (argb >> 0);

                os.write((byte) alpha);
                os.write((byte) red);
                os.write((byte) green);
                os.write((byte) blue);
            }
        }
    }
}
