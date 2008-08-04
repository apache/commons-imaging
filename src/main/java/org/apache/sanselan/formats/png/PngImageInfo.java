package org.apache.sanselan.formats.png;

import java.util.ArrayList;
import java.util.List;

import org.apache.sanselan.ImageFormat;
import org.apache.sanselan.ImageInfo;

public class PngImageInfo extends ImageInfo
{
	private final List textChunks;

	public PngImageInfo(String formatDetails, int bitsPerPixel,
			ArrayList comments, ImageFormat format, String formatName,
			int height, String mimeType, int numberOfImages,
			int physicalHeightDpi, float physicalHeightInch,
			int physicalWidthDpi, float physicalWidthInch, int width,
			boolean isProgressive, boolean isTransparent, boolean usesPalette,
			int colorType, String compressionAlgorithm, final List textChunks)
	{
		super(formatDetails, bitsPerPixel, comments, format, formatName,
				height, mimeType, numberOfImages, physicalHeightDpi,
				physicalHeightInch, physicalWidthDpi, physicalWidthInch, width,
				isProgressive, isTransparent, usesPalette, colorType,
				compressionAlgorithm);

		this.textChunks = textChunks;
	}

	public List getTextChunks()
	{
		return new ArrayList(textChunks);
	}

}
