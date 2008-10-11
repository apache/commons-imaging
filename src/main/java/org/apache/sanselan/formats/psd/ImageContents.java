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
package org.apache.sanselan.formats.psd;

import java.io.PrintWriter;

public class ImageContents
{
	public final PSDHeaderInfo header;

	public final int ColorModeDataLength;
	public final int ImageResourcesLength;
	public final int LayerAndMaskDataLength;
	public final int Compression;

	public ImageContents(PSDHeaderInfo header,

	int ColorModeDataLength, int ImageResourcesLength,
			int LayerAndMaskDataLength, int Compression)
	{
		this.header = header;
		this.ColorModeDataLength = ColorModeDataLength;
		this.ImageResourcesLength = ImageResourcesLength;
		this.LayerAndMaskDataLength = LayerAndMaskDataLength;
		this.Compression = Compression;
	}

	public void dump()
	{
		PrintWriter pw = new PrintWriter(System.out);
		dump(pw);
		pw.flush();
	}

	public void dump(PrintWriter pw)
	{
		pw.println("");
		pw.println("ImageContents");
		pw.println("Compression: " + Compression + " ("
				+ Integer.toHexString(Compression) + ")");
		pw.println("ColorModeDataLength: " + ColorModeDataLength + " ("
				+ Integer.toHexString(ColorModeDataLength) + ")");
		pw.println("ImageResourcesLength: " + ImageResourcesLength + " ("
				+ Integer.toHexString(ImageResourcesLength) + ")");
		pw.println("LayerAndMaskDataLength: " + LayerAndMaskDataLength + " ("
				+ Integer.toHexString(LayerAndMaskDataLength) + ")");
		//		System.out.println("Depth: " + Depth + " ("
		//				+ Integer.toHexString(Depth) + ")");
		//		System.out.println("Mode: " + Mode + " (" + Integer.toHexString(Mode)
		//				+ ")");
		//		System.out.println("Reserved: " + Reserved.length);
		pw.println("");
		pw.flush();

	}

}