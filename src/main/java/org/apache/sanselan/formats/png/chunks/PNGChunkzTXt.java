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
import org.apache.sanselan.common.ZLibInflater;
import org.apache.sanselan.formats.png.PngConstants;

public class PNGChunkzTXt extends PNGTextChunk
{

	public final String keyword, text;

	public PNGChunkzTXt(int length, int chunkType, int crc, byte bytes[])
			throws ImageReadException, IOException
	{
		super(length, chunkType, crc, bytes);

		{
			int index = findNull(bytes);
			if (index < 0)
				throw new ImageReadException(
						"PNG zTXt chunk keyword is unterminated.");

			keyword = new String(bytes, 0, index, "ISO-8859-1");

			int compressionMethod = bytes[index + 1];
			if (compressionMethod != PngConstants.COMPRESSION_DEFLATE_INFLATE)
				throw new ImageReadException(
						"PNG zTXt chunk has unexpected compression method: "
								+ compressionMethod);

			int compressedTextLength = bytes.length - (index + 1 + 1);
			byte compressedText[] = new byte[compressedTextLength];
			System.arraycopy(bytes, index + 1 + 1, compressedText, 0,
					compressedTextLength);

			text = new String(new ZLibInflater().zlibInflate(compressedText),
					"ISO-8859-1");
		}
	}

	/**
	 * @return Returns the keyword.
	 */
	public String getKeyword()
	{
		return keyword;
	}

	/**
	 * @return Returns the text.
	 */
	public String getText()
	{
		return text;
	}

}