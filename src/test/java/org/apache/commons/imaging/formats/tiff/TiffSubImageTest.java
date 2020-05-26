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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.junit.jupiter.api.Test;

public class TiffSubImageTest extends TiffBaseTest {
    final List<File> imageFileList;
    
    TiffSubImageTest() throws IOException, ImageReadException{
        imageFileList = getTiffImages();
    }

    @Test
    public void testSubImage() throws ImageReadException, ImageWriteException, IOException {
        final BufferedImage src = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        final byte[] imageBytes = Imaging.writeImageToBytes(src, ImageFormats.TIFF, null);

        final Map<String, Object> params = new TreeMap<>();
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, 2);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, 3);
        final BufferedImage image = Imaging.getBufferedImage(imageBytes, params);
        assertEquals(image.getWidth(), 2);
        assertEquals(image.getHeight(), 3);
    }
    
    @Test
    public void testBadSubImage()  throws ImageReadException, IOException{
        File target = imageFileList.get(0);
        final BufferedImage referenceImage = Imaging.getBufferedImage(target);
        int width = referenceImage.getWidth();
        int height = referenceImage.getHeight();
        
        final Map<String, Object> params = new HashMap<>();
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 0);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, width);
        params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, height);
        
        BufferedImage image = Imaging.getBufferedImage(target, params);
        assertEquals(image.getWidth(), width, "Improper width when sub-imaging entire image");
        assertEquals(image.getHeight(), height, "Improper height when sub-imaging entire image");
        
        processBadParams(target, -1, 0, width, height, "negative x position");
        processBadParams(target, 0, -1, width, height, "negative y position");
        processBadParams(target, 0, 0, 0, height, "zero width");
        processBadParams(target, 0, 0, width, 0, "zero height");
        processBadParams(target, 1, 0, width, height, "sub-image width extends beyond bounds");
        processBadParams(target, 0, 1, width, height, "sub-image height extends beyond bounds");
    }
        
    private void processBadParams(File target, int x, int y, int width, int height, String comment) throws IOException{
        try{
            final Map<String, Object> params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, x);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, y);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, width);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, height);
            BufferedImage image = Imaging.getBufferedImage(target, params);
            fail("Reading TIFF sub-image failed to detect bad parameter: "+comment);
        }catch(ImageReadException ire){
            // the test passed
        }
    }
    
    @Test
    public void testSubImageCorrectness() throws ImageReadException, IOException {
        for(File target: imageFileList){
            final BufferedImage referenceImage = Imaging.getBufferedImage(target);
            int rW = referenceImage.getWidth();
            int rH = referenceImage.getHeight();
            if(rW<3 || rH<3){
                continue;
            }
            int []rArgb = new int[rW*rH];
            referenceImage.getRGB(0, 0, rW, rH, rArgb, 0, rW);
            final Map<String, Object> params = new HashMap<>();
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_X, 1);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_Y, 1);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_WIDTH, rW-2);
            params.put(TiffConstants.PARAM_KEY_SUBIMAGE_HEIGHT, rH-2);
            BufferedImage image = Imaging.getBufferedImage(target, params);
            int iW = image.getWidth();
            int iH = image.getHeight();
            assertEquals(iW, rW-2, "Invalid subimage width");
            assertEquals(iH, rH-2, "Invalid subimage height");
            int []iArgb= new int[iW*iH];
            image.getRGB(0, 0, iW, iH, iArgb, 0, iW);
            for(int i=0; i<iH; i++){
                for(int j=0; j<iW; j++){
                    int rTest = rArgb[(i+1)*rW+j+1];
                    int iTest = iArgb[i*iW+j];
                    assertEquals(iTest, rTest, "Invalid pixel lookup for "+target.getName()+" at "+i+", "+j);
                }
            }
        }
    }
    
     
}