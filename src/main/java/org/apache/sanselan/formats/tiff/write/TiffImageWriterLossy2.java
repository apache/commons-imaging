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
package org.apache.sanselan.formats.tiff.write;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.DebugOutputStream;

public class TiffImageWriterLossy2 extends TiffImageWriterBase
{

	public TiffImageWriterLossy2()
	{
	}

	public TiffImageWriterLossy2(int byteOrder)
	{
		super(byteOrder);
	}

	public void writeDirectories(OutputStream os, TiffOutputSet outputSet)
			throws IOException, ImageWriteException
	{
		List directories = outputSet.getDirectories();

		TiffOutputSummary outputSummary = validateDirectories(directories);

		List outputItems = outputSet.getOutputItems(outputSummary);

		updateOffsetsStep(outputItems);

		//		calculateLengthsAndOffsetsStep(directories);

		outputSummary.updateOffsets(byteOrder);

		//		DebugOutputStream dos = null;
		BinaryOutputStream bos = new BinaryOutputStream(os, byteOrder);

		writeStep(bos, outputItems
		//				, dos
		);

	}

	private void updateOffsetsStep(List outputItems) throws IOException,
			ImageWriteException
	{
		int offset = TIFF_HEADER_SIZE;

		for (int i = 0; i < outputItems.size(); i++)
		{
			TiffOutputItem outputItem = (TiffOutputItem) outputItems.get(i);

			outputItem.setOffset(offset);
			int itemLength = outputItem.getItemLength();
			offset += itemLength;

			int remainder = imageDataPaddingLength(itemLength);
			offset += remainder;
		}
	}

	private void writeStep(BinaryOutputStream bos, List outputItems
	//	    		,
	//	            DebugOutputStream dos
	) throws IOException, ImageWriteException
	{
//		DebugOutputStream dos = new DebugOutputStream(bos);
//		bos = new BinaryOutputStream(dos, byteOrder);

		writeImageFileHeader(bos);

		//	        long count, lastCount = 0;

		//	        if (null != dos)
		//	        {
		//	            count = dos.count();
		//	            Debug.debug("image header" + " start: " + lastCount + ", end: "
		//	                    + dos.count() + ", length: " + (count - lastCount));
		//	            lastCount = count;
		//	        }

		int offset = TIFF_HEADER_SIZE;
//		if (dos.count() != offset)
//			throw new ImageWriteException("output mismatch! dos.count(): "
//					+ dos.count() + ", offset: " + offset);
		for (int i = 0; i < outputItems.size(); i++)
		{
			TiffOutputItem outputItem = (TiffOutputItem) outputItems.get(i);

//			if (outputItem.getOffset() != offset)
//				throw new ImageWriteException("output mismatch! dos.count(): "
//						+ dos.count() + ", offset: " + offset);

//			Debug.debug("writing item", outputItem.getItemDescription()
//					+ " (offset: " + offset + ")");

			outputItem.writeItem(bos);

			int length = outputItem.getItemLength();
			offset += length;
			int remainder = imageDataPaddingLength(length);
			offset += remainder;
			for (int j = 0; j < remainder; j++)
				bos.write(0);

//			if (dos.count() != offset)
//				throw new ImageWriteException("output mismatch! dos.count(): "
//						+ dos.count() + ", offset: " + offset);
		}

		//	        for (int i = 0; i < directories.size(); i++)
		//	        {
		//	            TiffOutputDirectory directory = (TiffOutputDirectory) directories
		//	                    .get(i);
		//	            directory.write(bos);
		//	
		//	            if (null != dos)
		//	            {
		//	                count = dos.count();
		//	                Debug.debug("directory("
		//	                        + TiffDirectory.description(directory.type) + ")"
		//	                        + " start: " + lastCount + ", end: " + dos.count()
		//	                        + ", length: " + (count - lastCount)
		//	                        + ", expected length: " + directory.totalLength);
		//	                lastCount = count;
		//	            }
		//	        }
	}

	private void writeImageFileHeader(BinaryOutputStream bos)
			throws IOException, ImageWriteException
	{
		bos.write(byteOrder);
		bos.write(byteOrder);

		bos.write2Bytes(42); // tiffVersion

		int foffsetToFirstIFD = TIFF_HEADER_SIZE;

		bos.write4Bytes(foffsetToFirstIFD);
	}

}
