package org.cmc.sanselan.common;

import java.awt.image.BufferedImage;

public class SimpleBufferedImageFactory implements IBufferedImageFactory
{
	public BufferedImage getColorBufferedImage(int width, int height)
	{
		return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	}

	public BufferedImage getGrayscaleBufferedImage(int width, int height)
	{
		return new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
	}
}
