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

package org.apache.sanselan.formats.jpeg;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.AllTagConstants;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.IOUtils;

public class ExifRewriteTest extends ExifBaseTest implements AllTagConstants
{
	public ExifRewriteTest(String name)
	{
		super(name);
	}

	public void testRemove() throws IOException, ImageReadException,
			ImageWriteException
	{
		List images = getImagesWithExifData();
		for (int i = 0; i < images.size(); i++)
		{
			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);

			ByteSource byteSource = new ByteSourceFile(imageFile);
			Debug.debug("Source Segments:");
			new JpegUtils().dumpJFIF(byteSource);

			{
				JpegImageMetadata metadata = (JpegImageMetadata) Sanselan
						.getMetadata(imageFile);
				assertNotNull(metadata.getExif());
			}

			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				new ExifRewriter().removeExifMetadata(byteSource, baos, null);
				byte bytes[] = baos.toByteArray();
				File tempFile = File.createTempFile("test", ".jpg");
				Debug.debug("tempFile", tempFile);
				tempFile.deleteOnExit();
				IOUtils.writeToFile(bytes, tempFile);

				Debug.debug("Output Segments:");
				new JpegUtils().dumpJFIF(new ByteSourceArray(bytes));

				assertTrue(!hasExifData(tempFile));
			}
		}
	}

	private interface Rewriter
	{
		public void rewrite(ByteSource byteSource, OutputStream os,
				TiffOutputSet outputSet) throws ImageReadException,
				IOException, ImageWriteException;
	}

	public void rewrite(Rewriter rewriter) throws IOException,
			ImageReadException, ImageWriteException
	{
		List images = getImagesWithExifData();
		for (int i = 0; i < images.size(); i++)
		{
			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);

			ByteSource byteSource = new ByteSourceFile(imageFile);
			Debug.debug("Source Segments:");
			new JpegUtils().dumpJFIF(byteSource);

			JpegImageMetadata oldMetadata = (JpegImageMetadata) Sanselan
					.getMetadata(imageFile);
			assertNotNull(oldMetadata);

			TiffImageMetadata oldExifMetadata = oldMetadata.getExif();
			assertNotNull(oldExifMetadata);
			oldMetadata.dump();

			//			TiffImageMetadata tiffImageMetadata = metadata.getExif();
			//			Photoshop photoshop = metadata.getPhotoshop();

			TiffOutputSet outputSet = oldExifMetadata.getOutputSet();
//			outputSet.dump();

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			rewriter.rewrite(byteSource, baos, outputSet);
			byte bytes[] = baos.toByteArray();
			File tempFile = File.createTempFile("test", ".jpg");
			Debug.debug("tempFile", tempFile);
			//			tempFile.deleteOnExit();
			IOUtils.writeToFile(bytes, tempFile);

			Debug.debug("Output Segments:");
			new JpegUtils().dumpJFIF(new ByteSourceArray(bytes));

			//				assertTrue(!hasExifData(tempFile));

			JpegImageMetadata newMetadata = (JpegImageMetadata) Sanselan
					.getMetadata(tempFile);
			assertNotNull(newMetadata);
			TiffImageMetadata newExifMetadata = newMetadata.getExif();
			assertNotNull(newExifMetadata);
//			newMetadata.dump();

			compare(oldExifMetadata, newExifMetadata);
		}
	}

	public void testRewriteLossy() throws IOException, ImageReadException,
			ImageWriteException
	{
		Rewriter rewriter = new Rewriter()
		{
			public void rewrite(ByteSource byteSource, OutputStream os,
					TiffOutputSet outputSet) throws ImageReadException,
					IOException, ImageWriteException
			{
				new ExifRewriter().updateExifMetadataLossy(byteSource, os,
						outputSet);
			}
		};

		rewrite(rewriter);
	}

//	public void testRewriteLossless() throws IOException, ImageReadException,
//			ImageWriteException
//	{
//		Rewriter rewriter = new Rewriter()
//		{
//			public void rewrite(ByteSource byteSource, OutputStream os,
//					TiffOutputSet outputSet) throws ImageReadException,
//					IOException, ImageWriteException
//			{
//				new ExifRewriter().updateExifMetadataLossless(byteSource, os,
//						outputSet);
//			}
//		};
//
//		rewrite(rewriter);
//	}

	private Hashtable makeDirectoryMap(ArrayList directories)
	{
		Hashtable directoryMap = new Hashtable();
		for (int i = 0; i < directories.size(); i++)
		{
			TiffImageMetadata.Directory directory = (TiffImageMetadata.Directory) directories
					.get(i);
			directoryMap.put(new Integer(directory.type), directory);
		}
		return directoryMap;
	}

	private Hashtable makeFieldMap(ArrayList items)
	{
		Hashtable fieldMap = new Hashtable();
		for (int i = 0; i < items.size(); i++)
		{
			TiffImageMetadata.Item item = (TiffImageMetadata.Item) items.get(i);
			TiffField field = item.getTiffField();
			fieldMap.put(new Integer(field.tag), field);
		}
		return fieldMap;
	}

	private void compare(TiffImageMetadata oldExifMetadata,
			TiffImageMetadata newExifMetadata)
	{
		assertNotNull(oldExifMetadata);
		assertNotNull(newExifMetadata);

		ArrayList oldDirectories = oldExifMetadata.getDirectories();
		ArrayList newDirectories = newExifMetadata.getDirectories();

		assertTrue(oldDirectories.size() == newDirectories.size());

		Hashtable oldDirectoryMap = makeDirectoryMap(oldDirectories);
		Hashtable newDirectoryMap = makeDirectoryMap(newDirectories);

		assertEquals(oldDirectories.size(), oldDirectoryMap.keySet().size());
		ArrayList oldDirectoryTypes = new ArrayList(oldDirectoryMap.keySet());
		Collections.sort(oldDirectoryTypes);
		ArrayList newDirectoryTypes = new ArrayList(newDirectoryMap.keySet());
		Collections.sort(newDirectoryTypes);
		assertEquals(oldDirectoryTypes, newDirectoryTypes);

		for (int i = 0; i < oldDirectoryTypes.size(); i++)
		{
			Integer dirType = (Integer) oldDirectoryTypes.get(i);

			//			Debug.debug("dirType", dirType);

			TiffImageMetadata.Directory oldDirectory = (TiffImageMetadata.Directory) oldDirectoryMap
					.get(dirType);
			TiffImageMetadata.Directory newDirectory = (TiffImageMetadata.Directory) newDirectoryMap
					.get(dirType);
			assertNotNull(oldDirectory);
			assertNotNull(newDirectory);

			ArrayList oldItems = oldDirectory.getItems();
			ArrayList newItems = newDirectory.getItems();

			assertTrue(oldItems.size() == newItems.size());

			Hashtable oldFieldMap = makeFieldMap(oldItems);
			Hashtable newFieldMap = makeFieldMap(newItems);

			assertEquals(oldItems.size(), oldFieldMap.keySet().size());
			//			assertEquals(oldFieldMap.keySet(), newFieldMap.keySet());
			//			assertEquals(oldFieldMap.keySet(), newFieldMap.keySet());

			ArrayList oldFieldTags = new ArrayList(oldFieldMap.keySet());
			Collections.sort(oldFieldTags);
			ArrayList newFieldTags = new ArrayList(newFieldMap.keySet());
			Collections.sort(newFieldTags);
			assertEquals(oldFieldTags, newFieldTags);

			for (int j = 0; j < oldFieldTags.size(); j++)
			{
				Integer fieldTag = (Integer) oldFieldTags.get(j);

				TiffField oldField = (TiffField) oldFieldMap.get(fieldTag);
				TiffField newField = (TiffField) newFieldMap.get(fieldTag);

				//				Debug.debug("fieldTag", fieldTag);

				//				fieldTag.
				assertNotNull(oldField);
				assertNotNull(newField);

				assertEquals(oldField.tag, newField.tag);
				assertEquals(dirType.intValue(), newField.directoryType);
				assertEquals(oldField.directoryType, newField.directoryType);
				assertEquals(oldField.length, newField.length);
				assertEquals(oldField.isLocalValue(), newField.isLocalValue());

				if (!oldField.tagInfo.isOffset())
				{
					if (oldField.isLocalValue())
					{
						compare(oldField.valueOffsetBytes,
								newField.valueOffsetBytes);
					}
					else
					{
						compare(oldField.oversizeValue, newField.oversizeValue);
					}
				}

			}

			//			Debug.debug();
		}
	}

	private void compare(byte a[], byte b[])
	{
		assertNotNull(a);
		assertNotNull(b);
		assertEquals(a.length, b.length);
		for (int i = 0; i < a.length; i++)
			assertEquals(a[i], b[i]);
	}
}
