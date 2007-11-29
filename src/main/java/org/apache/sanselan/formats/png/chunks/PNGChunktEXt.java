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
package org.apache.sanselan.formats.png.chunks;

import java.io.IOException;

import org.apache.sanselan.ImageReadException;

public class PNGChunktEXt extends PNGTextChunk
{
	//		public final int Length;
	//		public final int ChunkType;
	//		public final int CRC;
	//		public final byte bytes[];
	public final String Keyword, Text;

	//		public final int CompressionMethod;

	public PNGChunktEXt(int Length, int ChunkType, int CRC, byte bytes[])
			throws ImageReadException, IOException
	{
		super(Length, ChunkType, CRC, bytes);

		{
			//				debug_ByteArray("PNGChunktEXt", bytes);

			int index = findNull(bytes);
			if (index < 0)
				throw new ImageReadException("PNGChunktEXt: No Profile Name");
			byte name_bytes[] = new byte[index];
			System.arraycopy(bytes, 0, name_bytes, 0, index);
			Keyword = new String(name_bytes);

			//				CompressionMethod = bytes[index + 1];

			int TextLength = bytes.length - (index + 1);
			byte Text_bytes[] = new byte[TextLength];
			System.arraycopy(bytes, index + 1, Text_bytes, 0, TextLength);
			Text = new String(Text_bytes);

			if (getDebug())
			{
				System.out.println("Keyword: " + Keyword);
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