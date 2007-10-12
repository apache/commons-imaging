package org.apache.sanselan.common;

import java.awt.image.BufferedImage;

public interface IBufferedImageFactory
{
	public BufferedImage getColorBufferedImage(int width, int height);

	public BufferedImage getGrayscaleBufferedImage(int width, int height);
}
