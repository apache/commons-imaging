package org.apache.commons.imaging.formats.pnm;

import org.apache.commons.imaging.ImageFormats;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PbmWriterTest {

    @Test
    public void testWriteImage() throws IOException {
        // Create a simple black and white image
        BufferedImage image = new BufferedImage(3, 2, BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, 0xFFFFFF); // White
        image.setRGB(1, 0, 0x000000); // Black
        image.setRGB(2, 0, 0xFFFFFF); // White
        image.setRGB(0, 1, 0x000000); // Black
        image.setRGB(1, 1, 0xFFFFFF); // White
        image.setRGB(2, 1, 0x000000); // Black

        // Expected PBM content for the above image
        String expectedPbmContent = "P1\n3 2\n1 0 1\n0 1 0\n";

        // Perform the test
        PbmWriter pbmWriter = new PbmWriter(false); // Use text mode
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PnmImagingParameters parameters = new PnmImagingParameters();
        parameters.setSubtype(ImageFormats.PBM);
        pbmWriter.writeImage(image, outputStream, parameters);

        // Compare the actual output with the expected content
        String actualPbmContent = outputStream.toString("US-ASCII");
        assertEquals(expectedPbmContent, actualPbmContent);
    }
}
