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
package org.cmc.sanselan.formats.png.chunks;

import java.io.IOException;

import org.cmc.sanselan.ImageReadException;
import org.cmc.sanselan.common.ZLibInflater;

public class PNGChunkzTXt extends PNGTextChunk
{

	//	private final PngImageParser parser;
	public final String Keyword, Text;

	public PNGChunkzTXt(
	//			PngImageParser parser, 
			int Length, int ChunkType, int CRC, byte bytes[])
			throws ImageReadException, IOException
	{
		super(Length, ChunkType, CRC, bytes);
		//		this.parser = parser;

		{
			int index = findNull(bytes);
			if (index < 0)
				throw new ImageReadException("PNGChunkiCCP: No Profile Name");
			byte Keyword_bytes[] = new byte[index];
			System.arraycopy(bytes, 0, Keyword_bytes, 0, index);
			Keyword = new String(Keyword_bytes);

			int CompressionMethod = bytes[index + 1];

			int CompressedTextLength = bytes.length - (index + 1 + 1);
			byte CompressedText[] = new byte[CompressedTextLength];
			System.arraycopy(bytes, index + 1 + 1, CompressedText, 0,
					CompressedTextLength);

			if (getDebug())
			{
				System.out.println("Keyword: " + Keyword);
			}

			Text = new String(new ZLibInflater().zlibInflate(CompressedText));

			if (getDebug())
			{
				System.out.println("Text: " + Text);
			}

		}
	}

	/**
	 * @return Returns the keyword.
	 */
	public String getKeyword()
	{
		return Keyword;
	}

	/**
	 * @return Returns the text.
	 */
	public String getText()
	{
		return Text;
	}

}