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



package org.apache.commons.imaging.formats.png;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.imaging.ImageWriteException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Provides a test for the PngWriter using predictors
 */
public class PngWritePredictorTest {

  public PngWritePredictorTest() {
  }

  @BeforeAll
  public static void setUpClass() {
  }

  @BeforeEach
  public void setUp() {
  }

  /**
   * Populate an integer pixel array for a 256-by-256 image
   * with varied colors across the image area and a white and
   * black line down the main diagonal.
   * @return a valid array of integers.
   */
  private int[] populateARGB() {
    //populate array with a blend of color components
    int[] argb = new int[256 * 256];
    for (int i = 0; i < 256; i++) {
      for (int j = 0; j < 256; j++) {
        int red = i;
        int green = (255 - i);
        int blue = j;
        argb[i * 256 + j] = ((((0xff00 | red) << 8) | green) << 8) | blue;
      }
    }

    // also draw a black and white strip down main diagonal
    for (int i = 0; i < 256; i++) {
      argb[i * 256 + i] = 0xff000000;
      if (i < 255) {
        argb[i * 256 + i + 1] = 0xffffffff;
      }
    }
    return argb;
  }

  @Test
  void testWriteWithPredictor() {
    int[] argb = populateARGB();

    // Test the RGB (no alpha) case ---------------------
    BufferedImage bImage = new BufferedImage(256, 256, BufferedImage.TYPE_INT_RGB);
    bImage.setRGB(0, 0, 256, 256, argb, 0, 256);

    File tempFile = null;

    try {
      tempFile = File.createTempFile("PngWritePredictorRGB", ".png");
    } catch (IOException ioex) {
      fail("Failed to create temporary file, " + ioex.getMessage());
    }
    PngImagingParameters params = new PngImagingParameters();
    params.setPredictorEnabled(true);
    PngImageParser parser = new PngImageParser();
    try ( FileOutputStream fos = new FileOutputStream(tempFile);  BufferedOutputStream bos = new BufferedOutputStream(fos)) {
      parser.writeImage(bImage, bos, params);
      bos.flush();
    } catch (IOException | ImageWriteException ex) {
      fail("Failed writing RGB with exception " + ex.getMessage());
    }

    try {
      int[] brgb = new int[256 * 256];
      bImage = ImageIO.read(tempFile);
      bImage.getRGB(0, 0, 256, 256, brgb, 0, 256);
      assertArrayEquals(argb, brgb, "Round trip for RGB failed");
    } catch (IOException ex) {
      fail("Failed reading RGB with exception " + ex.getMessage());
    }

     // Test the ARGB (some semi-transparent alpha) case ---------------------
    for (int i = 0; i < 256; i++) {
      argb[i * 256 + i] &= 0x88ffffff;
    }
    bImage = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
    bImage.setRGB(0, 0, 256, 256, argb, 0, 256);
    try ( FileOutputStream fos = new FileOutputStream(tempFile);  BufferedOutputStream bos = new BufferedOutputStream(fos)) {
      parser.writeImage(bImage, bos, params);
      bos.flush();
    } catch (IOException | ImageWriteException ex) {
      fail("Failed writing ARGB with exception " + ex.getMessage());
    }
    try {
      int[] brgb = new int[256 * 256];
      bImage = ImageIO.read(tempFile);
      bImage.getRGB(0, 0, 256, 256, brgb, 0, 256);
      assertArrayEquals(argb, brgb, "Round trip for ARGB failed");
    } catch (IOException ex) {
      fail("Failed reading ARGB with exception " + ex.getMessage());
    }

  }
}
