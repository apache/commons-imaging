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
package org.apache.sanselan.formats.tiff.datareaders;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.common.BitInputStream;
import org.apache.sanselan.common.ByteSource;
import org.apache.sanselan.formats.tiff.photometricinterpreters.PhotometricInterpreter;

public class DataReaderTiled extends DataReader
{

	private final int tileWidth;
	private final int tileLength;
	private final int tileOffsets[];
	private final int tileByteCounts[];

//	private final int predictor;
	private final int bitsPerPixel;

	private final int width, height;

	private final int compression;

	public DataReaderTiled(PhotometricInterpreter fPhotometricInterpreter,
			int fTileOffsets[], int fTileByteCounts[], int TileWidth,
			int TileLength, int fBitsPerPixel, int fBitsPerSample[],
			int Predictor, int fSamplesPerPixel, int width, int height,
			int fCompression, int byteOrder)
	{
		super(fPhotometricInterpreter, fBitsPerSample, Predictor,
				fSamplesPerPixel, byteOrder);

		this.tileOffsets = fTileOffsets;
		this.tileByteCounts = fTileByteCounts;
		this.tileWidth = TileWidth;
		this.tileLength = TileLength;

		this.bitsPerPixel = fBitsPerPixel;
//		this.predictor = Predictor;
		this.width = width;
		this.height = height;
		this.compression = fCompression;
	}

	private void interpretTile(BufferedImage bi, byte bytes[], int start_x,
			int start_y) throws ImageReadException, IOException
	{
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		BitInputStream bis = new BitInputStream(bais);

		int pixels_per_tile = tileWidth * tileLength;

		int tile_x = 0, tile_y = 0;

		for (int i = 0; i < pixels_per_tile; i++)
		{

			int x = tile_x + start_x;
			int y = tile_y + start_y;

			int samples[] = getSamplesAsBytes(bis);

			if ((x < width) && (y < height))
			{
				samples = applyPredictor(samples, x);
				photometricInterpreter.interpretPixel(bi, samples, x, y);
			}

			tile_x++;

			if (tile_x >= tileWidth)
			{
				tile_x = 0;
				tile_y++;
				bis.flushCache();
				if (tile_y >= tileLength)
					break;
			}

		}
	}

	public void readImageData(BufferedImage bi, ByteSource byteSource)
			throws ImageReadException, IOException
	{
		int bits_per_row = tileWidth * bitsPerPixel;
		int bytes_per_row = (bits_per_row + 7) / 8;
		int bytes_per_tile = bytes_per_row * tileLength;
		int x = 0, y = 0;

		for (int tile = 0; tile < tileOffsets.length; tile++)
		{
			int fTileOffset = tileOffsets[tile];
			int fTileByteCount = tileByteCounts[tile];

			byte compressed[] = byteSource
					.getBlock(fTileOffset, fTileByteCount);

			byte decompressed[] = decompress(compressed, compression,
					bytes_per_tile);

			interpretTile(bi, decompressed, x, y);

			x += tileWidth;
			if (x >= width)
			{
				x = 0;
				y += tileLength;
				if (y >= height)
					break;
			}

		}
	}
}