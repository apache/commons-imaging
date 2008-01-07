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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.formats.tiff.constants.TiffConstants;

class TiffOutputSummary implements TiffConstants
{
	public final TiffOutputDirectory rootDirectory;
	public final Map directoryTypeMap;

	public TiffOutputSummary(final TiffOutputDirectory rootDirectory,
			final Map directoryTypeMap)
	{
		this.rootDirectory = rootDirectory;
		this.directoryTypeMap = directoryTypeMap;
	}

	private static class Offset
	{
		public final TiffOutputDirectory directory;
		public final TiffOutputField directoryOffsetField;

		public Offset(final TiffOutputDirectory directory,
				final TiffOutputField directoryOffsetField)
		{
			super();
			this.directoryOffsetField = directoryOffsetField;
			this.directory = directory;
		}
	}

	private List offsets = new ArrayList();

	public void add(final TiffOutputDirectory directory,
			final TiffOutputField directoryOffsetField)
	{
		offsets.add(new Offset(directory, directoryOffsetField));
	}

	public void updateOffsets(int byteOrder)
	{
		for (int i = 0; i < offsets.size(); i++)
		{
			Offset offset = (Offset) offsets.get(i);

			byte value[] = FIELD_TYPE_LONG.writeData(new int[]{
				offset.directory.offset,
			}, byteOrder);
			offset.directoryOffsetField.setData(value);
		}
	}

	//	public PointerDirectoriesInfo(
	//){}
	//	
	//	public final TiffOutputField exifDirectoryOffsetField;
	//	public final TiffOutputDirectory exifDirectory;
	//	public final TiffOutputField gpsDirectoryOffsetField;
	//	public final TiffOutputDirectory gpsDirectory;
	//	public final TiffOutputField interoperabilityDirectoryOffsetField;
	//	public final TiffOutputDirectory interoperabilityDirectory;
	//
	//	public PointerDirectoriesInfo(
	//			final TiffOutputField exifDirectoryOffsetField,
	//			final TiffOutputDirectory exifDirectory,
	//			final TiffOutputField gpsDirectoryOffsetField,
	//			final TiffOutputDirectory gpsDirectory,
	//			final TiffOutputField interoperabilityDirectoryOffsetField,
	//			final TiffOutputDirectory interoperabilityDirectory)
	//	{
	//		this.exifDirectoryOffsetField = exifDirectoryOffsetField;
	//		this.exifDirectory = exifDirectory;
	//		this.gpsDirectoryOffsetField = gpsDirectoryOffsetField;
	//		this.gpsDirectory = gpsDirectory;
	//		this.interoperabilityDirectoryOffsetField = interoperabilityDirectoryOffsetField;
	//		this.interoperabilityDirectory = interoperabilityDirectory;
	//	}

}