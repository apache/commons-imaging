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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryConstants;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;
import org.apache.sanselan.util.Debug;

public abstract class TiffImageWriterBase
		implements
			TiffConstants,
			BinaryConstants
{
	public static final int DEFAULT_WRITE_BYTE_ORDER = BYTE_ORDER_INTEL;

	protected final int byteOrder;

	public TiffImageWriterBase()
	{
		this.byteOrder = DEFAULT_WRITE_BYTE_ORDER;
	}

	public TiffImageWriterBase(int byteOrder)
	{
		this.byteOrder = byteOrder;
	}

	public abstract void writeDirectories(OutputStream os, List directories)
			throws IOException, ImageWriteException;

	protected TiffOutputSummary validateDirectories(List directories)
			throws ImageWriteException
	{
		if (1 > directories.size())
			throw new ImageWriteException("No directories.");

		TiffOutputDirectory exifDirectory = null;
		TiffOutputDirectory gpsDirectory = null;
		TiffOutputDirectory interoperabilityDirectory = null;
		TiffOutputField exifDirectoryOffsetField = null;
		TiffOutputField gpsDirectoryOffsetField = null;
		TiffOutputField interoperabilityDirectoryOffsetField = null;

		ArrayList directoryIndices = new ArrayList();
		Map directoryTypeMap = new HashMap();
		for (int i = 0; i < directories.size(); i++)
		{
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);
			int dirType = directory.type;
			Integer key = new Integer(dirType);
			directoryTypeMap.put(key, directory);
			//			Debug.debug("validating dirType", dirType + " ("
			//					+ directory.getFields().size() + " fields)");

			if (dirType < 0)
			{
				switch (dirType)
				{
					case DIRECTORY_TYPE_EXIF :
						if (exifDirectory != null)
							throw new ImageWriteException(
									"More than one EXIF directory.");
						exifDirectory = directory;
						break;

					case DIRECTORY_TYPE_GPS :
						if (gpsDirectory != null)
							throw new ImageWriteException(
									"More than one GPS directory.");
						gpsDirectory = directory;
						break;

					case DIRECTORY_TYPE_INTEROPERABILITY :
						if (interoperabilityDirectory != null)
							throw new ImageWriteException(
									"More than one Interoperability directory.");
						interoperabilityDirectory = directory;
						break;
					default :
						throw new ImageWriteException("Unknown directory: "
								+ dirType);
				}
			}
			else
			{
				if (directoryIndices.contains(key))
					throw new ImageWriteException(
							"More than one directory with index: " + dirType
									+ ".");
				directoryIndices.add(new Integer(dirType));
				//				dirMap.put(arg0, arg1)
			}

			ArrayList fields = directory.getFields();
			for (int j = 0; j < fields.size(); j++)
			{
				TiffOutputField field = (TiffOutputField) fields.get(j);
				if (field.tagInfo.tag == EXIF_TAG_EXIF_OFFSET.tag)
				{
					if (exifDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one Exif directory offset field.");
					exifDirectoryOffsetField = field;
				}
				else if (field.tagInfo.tag == EXIF_TAG_INTEROP_OFFSET.tag)
				{
					if (interoperabilityDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one Interoperability directory offset field.");
					interoperabilityDirectoryOffsetField = field;
				}
				else if (field.tagInfo.tag == EXIF_TAG_GPSINFO.tag)
				{
					if (gpsDirectoryOffsetField != null)
						throw new ImageWriteException(
								"More than one GPS directory offset field.");
					gpsDirectoryOffsetField = field;
				}
			}
			//			directory.
		}

		if (directoryIndices.size() < 1)
			throw new ImageWriteException("Missing root directory.");

		// "normal" TIFF directories should have continous indices starting with 0, ie. 0, 1, 2...
		Collections.sort(directoryIndices);

		TiffOutputDirectory previousDirectory = null;
		for (int i = 0; i < directoryIndices.size(); i++)
		{
			Integer index = (Integer) directoryIndices.get(i);
			if (index.intValue() != i)
				throw new ImageWriteException("Missing directory: " + i + ".");

			// set up chain of directory references for "normal" directories.
			TiffOutputDirectory directory = (TiffOutputDirectory) directoryTypeMap
					.get(index);
			if (null != previousDirectory)
				previousDirectory.setNextDirectory(directory);
			previousDirectory = directory;
		}

		TiffOutputDirectory rootDirectory = (TiffOutputDirectory) directoryTypeMap
				.get(new Integer(DIRECTORY_TYPE_ROOT));

		// prepare results
		TiffOutputSummary result = new TiffOutputSummary(rootDirectory,
				directoryTypeMap);

		// make sure offset fields and offset'd directories correspond.
		if (exifDirectory == null && exifDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has Exif Directory Offset field, but no Exif Directory");
		}
		else if (exifDirectory != null)
		{
			if (exifDirectoryOffsetField == null)
			{
				exifDirectoryOffsetField = TiffOutputField.createOffsetField(
						EXIF_TAG_EXIF_OFFSET, byteOrder);
				rootDirectory.add(exifDirectoryOffsetField);
			}

			result.add(exifDirectory, exifDirectoryOffsetField);
		}

		if (gpsDirectory == null && gpsDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has GPS Directory Offset field, but no GPS Directory");
		}
		else if (gpsDirectory != null)
		{
			if (gpsDirectoryOffsetField == null)
			{
				gpsDirectoryOffsetField = TiffOutputField.createOffsetField(
						EXIF_TAG_GPSINFO, byteOrder);
				rootDirectory.add(gpsDirectoryOffsetField);
			}

			result.add(gpsDirectory, gpsDirectoryOffsetField);
		}

		if (interoperabilityDirectory == null
				&& interoperabilityDirectoryOffsetField != null)
		{
			// perhaps we should just discard field?
			throw new ImageWriteException(
					"Output set has Interoperability Directory Offset field, but no Interoperability Directory");
		}
		else if (interoperabilityDirectory != null)
		{
			if (interoperabilityDirectoryOffsetField == null)
			{
				interoperabilityDirectoryOffsetField = TiffOutputField
						.createOffsetField(EXIF_TAG_INTEROP_OFFSET, byteOrder);
				rootDirectory.add(interoperabilityDirectoryOffsetField);
			}

			result.add(interoperabilityDirectory,
					interoperabilityDirectoryOffsetField);
		}

		return result;

		//		Debug.debug();
	}

}
