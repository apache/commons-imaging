package org.apache.commons.imaging;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PixelDensityTest {

    @Test
    public void testCreateFromPixelsPerCentimetre() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        Assertions.assertNotNull(pixelDensity);
        Assertions.assertTrue(pixelDensity.isInCentimetres());

        Assertions.assertFalse(pixelDensity.isInInches());
        Assertions.assertFalse(pixelDensity.isInMetres());
        Assertions.assertFalse(pixelDensity.isUnitless());

        Assertions.assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        Assertions.assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateFromPixelsPerInch() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        Assertions.assertNotNull(pixelDensity);
        Assertions.assertFalse(pixelDensity.isInCentimetres());

        Assertions.assertFalse(pixelDensity.isInMetres());
        Assertions.assertFalse(pixelDensity.isUnitless());
        Assertions.assertTrue(pixelDensity.isInInches());

        Assertions.assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        Assertions.assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateFromPixelsPerMetre() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);

        Assertions.assertNotNull(pixelDensity);
        Assertions.assertFalse(pixelDensity.isInCentimetres());
        Assertions.assertFalse(pixelDensity.isInInches());
        Assertions.assertFalse(pixelDensity.isUnitless());

        Assertions.assertTrue(pixelDensity.isInMetres());

        Assertions.assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        Assertions.assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testCreateUnitless() {
        PixelDensity pixelDensity = PixelDensity.createUnitless(300, 200);

        Assertions.assertNotNull(pixelDensity);
        Assertions.assertFalse(pixelDensity.isInCentimetres());
        Assertions.assertFalse(pixelDensity.isInInches());
        Assertions.assertFalse(pixelDensity.isInMetres());

        Assertions.assertTrue(pixelDensity.isUnitless());

        Assertions.assertEquals(300, pixelDensity.getRawHorizontalDensity(), 0.001);
        Assertions.assertEquals(200, pixelDensity.getRawVerticalDensity(), 0.001);
    }

    @Test
    public void testHorizontalDensityCentimetres() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        Assertions.assertEquals(expectedDensity, pixelDensity.horizontalDensityCentimetres(), 0.001);
        Assertions.assertEquals(this.centimeterToInch(expectedDensity), pixelDensity.horizontalDensityInches(), 0.001);
    }

    @Test
    public void testHorizontalDensityInches() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        Assertions.assertEquals(expectedDensity, pixelDensity.horizontalDensityInches(), 0.001);
        Assertions.assertEquals(this.inchToCentimeter(expectedDensity), pixelDensity.horizontalDensityCentimetres(), 0.001);
    }

    @Test
    public void testHorizontalDensityMetres() {
        final double expectedDensity = 300.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);

        Assertions.assertEquals(expectedDensity, pixelDensity.horizontalDensityMetres(), 0.001);
        Assertions.assertEquals(expectedDensity / 100, pixelDensity.horizontalDensityCentimetres(), 0.001);
    }

    @Test
    public void testVerticalDensityCentimetres() {
        final double expectedDensity = 200.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerCentimetre(300, 200);

        Assertions.assertEquals(expectedDensity, pixelDensity.verticalDensityCentimetres(), 0.001);
        Assertions.assertEquals(this.centimeterToInch(expectedDensity), pixelDensity.verticalDensityInches(), 0.001);

    }

    @Test
    public void testVerticalDensityInches() {
        final double expectedDensity = 200.0;
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerInch(300, 200);

        Assertions.assertEquals(expectedDensity, pixelDensity.verticalDensityInches(), 0.001);
        Assertions.assertEquals(this.inchToCentimeter(expectedDensity), pixelDensity.verticalDensityCentimetres(), 0.001);
    }

    @Test
    public void testVerticalDensityMetres() {
        PixelDensity pixelDensity = PixelDensity.createFromPixelsPerMetre(300, 200);
        Assertions.assertEquals(200.0, pixelDensity.verticalDensityMetres(), 0.001);
    }

    private double centimeterToInch(double centimeters) {
        return centimeters * 2.54;
    }

    private double inchToCentimeter(double centimeters) {
        return centimeters / 2.54;
    }
}
