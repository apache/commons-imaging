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

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

public final class TiffOutputSet implements TiffConstants
{
	public final int byteOrder;
	private final ArrayList directories = new ArrayList();

	public TiffOutputSet(final int byteOrder)
	{
		super();
		this.byteOrder = byteOrder;
	}

	public void addDirectory(TiffOutputDirectory directory)
			throws ImageWriteException
	{
		if (null != findDirectory(directory.type))
			throw new ImageWriteException(
					"Output set already contains a directory of that type.");
		directories.add(directory);
	}

	public List getDirectories()
	{
		return new ArrayList(directories);
	}

	public TiffOutputDirectory getRootDirectory()
	{
		return findDirectory(DIRECTORY_TYPE_ROOT);
	}

	public TiffOutputDirectory getExifDirectory()
	{
		return findDirectory(DIRECTORY_TYPE_EXIF);
	}

	public TiffOutputDirectory getGPSDirectory()
	{
		return findDirectory(DIRECTORY_TYPE_GPS);
	}

	public TiffOutputDirectory getInteroperabilityDirectory()
	{
		return findDirectory(DIRECTORY_TYPE_INTEROPERABILITY);
	}

	public TiffOutputDirectory findDirectory(int directoryType)
	{
		for (int i = 0; i < directories.size(); i++)
		{
			TiffOutputDirectory directory = (TiffOutputDirectory) directories
					.get(i);
			if (directory.type == directoryType)
				return directory;
		}
		return null;
	}

	public TiffOutputDirectory addRootDirectory() throws ImageWriteException
	{
		TiffOutputDirectory result = new TiffOutputDirectory(
				DIRECTORY_TYPE_ROOT);
		addDirectory(result);
		return result;
	}

	public TiffOutputDirectory addExifDirectory() throws ImageWriteException
	{
		TiffOutputDirectory result = new TiffOutputDirectory(
				DIRECTORY_TYPE_EXIF);
		addDirectory(result);
		return result;
	}

	public TiffOutputDirectory addGPSDirectory() throws ImageWriteException
	{
		TiffOutputDirectory result = new TiffOutputDirectory(DIRECTORY_TYPE_GPS);
		addDirectory(result);
		return result;
	}

	public TiffOutputDirectory addInteroperabilityDirectory()
			throws ImageWriteException
	{
		TiffOutputDirectory result = new TiffOutputDirectory(
				DIRECTORY_TYPE_INTEROPERABILITY);
		addDirectory(result);
		return result;
	}

	//	public static final int DIRECTORY_TYPE_UNKNOWN = -1;
	//	public static final int DIRECTORY_TYPE_ROOT = 0;
	//	public static final int DIRECTORY_TYPE_SUB = 1;
	//	public static final int DIRECTORY_TYPE_THUMBNAIL = 2;
	//	public static final int DIRECTORY_TYPE_EXIF = -2;
	//	//	public static final int DIRECTORY_TYPE_SUB = 5;
	//	public static final int DIRECTORY_TYPE_GPS = -3;
	//	public static final int DIRECTORY_TYPE_INTEROPERABILITY = -4;
	//	public static final int DIRECTORY_TYPE_DIR_0 = 0;
	//	public static final int DIRECTORY_TYPE_DIR_1 = 1;
	//	public static final int DIRECTORY_TYPE_DIR_2 = 2;
	//	public static final int DIRECTORY_TYPE_DIR_3 = 3;
	//	public static final int DIRECTORY_TYPE_DIR_4 = 4;

}