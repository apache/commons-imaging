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
package org.apache.sanselan.formats.bmp;

public class BmpHeaderInfo
{
	//		‘BM’ - Windows 3.1x, 95, NT, …
	//		‘BA’ - OS/2 Bitmap Array
	//		‘CI’ - OS/2 Color Icon‘
	//		CP’ - OS/2 Color Pointer
	//		‘IC’ - OS/2 Icon
	//		‘PT’ - OS/2 Pointer
	public final byte Identifier1;
	public final byte Identifier2;

	public final int FileSize;
	public final int Reserved;
	public final int BitmapDataOffset;

	public final int BitmapHeaderSize;
	public final int Width;
	public final int Height;
	public final int Planes;
	public final int BitsPerPixel;
	public final int Compression;
	public final int BitmapDataSize;
	public final int HResolution;
	public final int VResolution;
	public final int ColorsUsed;
	public final int ColorsImportant;

	public BmpHeaderInfo(byte Identifier1, byte Identifier2, int FileSize,
			int Reserved, int BitmapDataOffset,

			int BitmapHeaderSize, int Width, int Height, int Planes,
			int BitsPerPixel, int Compression, int BitmapDataSize,
			int HResolution, int VResolution, int ColorsUsed,
			int ColorsImportant)
	{
		this.Identifier1 = Identifier1;
		this.Identifier2 = Identifier2;
		this.FileSize = FileSize;
		this.Reserved = Reserved;
		this.BitmapDataOffset = BitmapDataOffset;

		this.BitmapHeaderSize = BitmapHeaderSize;
		this.Width = Width;
		this.Height = Height;
		this.Planes = Planes;
		this.BitsPerPixel = BitsPerPixel;
		this.Compression = Compression;
		this.BitmapDataSize = BitmapDataSize;
		this.HResolution = HResolution;
		this.VResolution = VResolution;
		this.ColorsUsed = ColorsUsed;
		this.ColorsImportant = ColorsImportant;
	}

}