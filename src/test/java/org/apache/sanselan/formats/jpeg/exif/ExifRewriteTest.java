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

package org.apache.sanselan.formats.jpeg.exif;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceArray;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.formats.jpeg.exifRewrite.ExifRewriter;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.AllTagConstants;
import org.apache.sanselan.formats.tiff.write.TiffOutputSet;
import org.apache.sanselan.util.Debug;
import org.apache.sanselan.util.IOUtils;

public class ExifRewriteTest extends ExifBaseTest implements AllTagConstants
{
	//	public ExifRewriteTest(String name)
	//	{
	//		super(name);
	//	}

	public void testRemove() throws IOException, ImageReadException,
			ImageWriteException
	{
		List images = getImagesWithExifData();
		for (int i = 0; i < images.size(); i++)
		{
			Debug.purgeMemory();

			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);

			boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
			if (ignoreImageData)
				continue;

			ByteSource byteSource = new ByteSourceFile(imageFile);
			Debug.debug("Source Segments:");
			new JpegUtils().dumpJFIF(byteSource);

			{
				JpegImageMetadata metadata = (JpegImageMetadata) Sanselan
						.getMetadata(imageFile);
				//				assertNotNull(metadata.getExif());
			}

			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				new ExifRewriter().removeExifMetadata(byteSource, baos);
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

	public void testInsert() throws IOException, ImageReadException,
			ImageWriteException
	{
		List images = getImagesWithExifData();
		for (int i = 0; i < images.size(); i++)
		{
			Debug.purgeMemory();

			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);

			boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
			if (ignoreImageData)
				continue;

			ByteSource byteSource = new ByteSourceFile(imageFile);
			Debug.debug("Source Segments:");
			new JpegUtils().dumpJFIF(byteSource);

			JpegImageMetadata originalMetadata = (JpegImageMetadata) Sanselan
					.getMetadata(imageFile);
			assertNotNull(originalMetadata);

			TiffImageMetadata oldExifMetadata = originalMetadata.getExif();
			assertNotNull(oldExifMetadata);

			ByteSource stripped;
			{
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				new ExifRewriter().removeExifMetadata(byteSource, baos);
				byte bytes[] = baos.toByteArray();
				File tempFile = File.createTempFile("removed", ".jpg");
				Debug.debug("tempFile", tempFile);
				tempFile.deleteOnExit();
				IOUtils.writeToFile(bytes, tempFile);

				Debug.debug("Output Segments:");
				stripped = new ByteSourceArray(bytes);
				new JpegUtils().dumpJFIF(stripped);

				assertTrue(!hasExifData(tempFile));
			}

			{
				TiffOutputSet outputSet = oldExifMetadata.getOutputSet();
				//			outputSet.dump();

				ByteArrayOutputStream baos = new ByteArrayOutputStream();

				new ExifRewriter().updateExifMetadataLossy(stripped, baos,
						outputSet);

				byte bytes[] = baos.toByteArray();
				File tempFile = File.createTempFile("inserted" + "_", ".jpg");
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
				//				newMetadata.dump();

				compare(oldExifMetadata, newExifMetadata);
			}

		}
	}

	private interface Rewriter
	{
		public void rewrite(ByteSource byteSource, OutputStream os,
				TiffOutputSet outputSet) throws ImageReadException,
				IOException, ImageWriteException;
	}

	private void rewrite(Rewriter rewriter, String name) throws IOException,
			ImageReadException, ImageWriteException
	{
		List images = getImagesWithExifData();
		for (int i = 0; i < images.size(); i++)
		{
			Debug.purgeMemory();

			File imageFile = (File) images.get(i);

			try
			{

				Debug.debug("imageFile", imageFile);

				boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
				if (ignoreImageData)
					continue;

				ByteSource byteSource = new ByteSourceFile(imageFile);
				Debug.debug("Source Segments:");
				new JpegUtils().dumpJFIF(byteSource);

				JpegImageMetadata oldMetadata = (JpegImageMetadata) Sanselan
						.getMetadata(imageFile);
				if (null == oldMetadata)
					continue;
				assertNotNull(oldMetadata);

				TiffImageMetadata oldExifMetadata = oldMetadata.getExif();
				if (null == oldExifMetadata)
					continue;
				assertNotNull(oldExifMetadata);
				oldMetadata.dump();

				//			TiffImageMetadata tiffImageMetadata = metadata.getExif();
				//			Photoshop photoshop = metadata.getPhotoshop();

				TiffOutputSet outputSet = oldExifMetadata.getOutputSet();
				//			outputSet.dump();

				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				rewriter.rewrite(byteSource, baos, outputSet);
				byte bytes[] = baos.toByteArray();
				File tempFile = File.createTempFile(name + "_", ".jpg");
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
				//				newMetadata.dump();

				compare(oldExifMetadata, newExifMetadata);
			}
			catch (IOException e)
			{
				Debug.debug("imageFile", imageFile.getAbsoluteFile());
				Debug.debug(e);
				throw e;
			}
			catch (ImageReadException e)
			{
				Debug.debug("imageFile", imageFile.getAbsoluteFile());
				Debug.debug(e);
				throw e;
			}
			catch (ImageWriteException e)
			{
				Debug.debug("imageFile", imageFile.getAbsoluteFile());
				Debug.debug(e);
				throw e;
			}

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

		rewrite(rewriter, "lossy");
	}

	public void testRewriteLossless() throws IOException, ImageReadException,
			ImageWriteException
	{
		Rewriter rewriter = new Rewriter()
		{
			public void rewrite(ByteSource byteSource, OutputStream os,
					TiffOutputSet outputSet) throws ImageReadException,
					IOException, ImageWriteException
			{
				new ExifRewriter().updateExifMetadataLossless(byteSource, os,
						outputSet);
			}
		};

		rewrite(rewriter, "lossless");
	}

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
			Object key = new Integer(field.tag);
			if (!fieldMap.containsKey(key))
				fieldMap.put(key, field);
		}
		return fieldMap;
	}

	private void compare(TiffImageMetadata oldExifMetadata,
			TiffImageMetadata newExifMetadata) throws ImageReadException
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

			//			Debug.debug("oldItems.size()", oldItems.size());
			//			Debug.debug("newItems.size()", newItems.size());
			//			dump("oldItems", oldItems);
			//			dump("newItems", newItems);

			//			if (oldItems.size() != newItems.size())
			//				;
			//			{
			//			dump("oldItems", oldItems);
			//			dump("newItems", newItems);
			//			}
			//			assertTrue(oldItems.size() == newItems.size());

			Hashtable oldFieldMap = makeFieldMap(oldItems);
			Hashtable newFieldMap = makeFieldMap(newItems);

			Set missingInNew = new HashSet(oldFieldMap.keySet());
			missingInNew.removeAll(newFieldMap.keySet());

			Set missingInOld = new HashSet(newFieldMap.keySet());
			missingInOld.removeAll(oldFieldMap.keySet());

			//			dump("missingInNew", missingInNew);
			//			dump("missingInOld", missingInOld);
			//			dump("newFieldMap.keySet()", newFieldMap.keySet());
			//			dump("oldFieldMap.keySet()", oldFieldMap.keySet());

			assertTrue(missingInNew.size() == 0);
			assertTrue(missingInOld.size() == 0);

			//			Debug.debug("oldItems.size()", oldItems.size());
			//			Debug.debug("oldFieldMap.keySet().size()", oldFieldMap.keySet().size());

			//			assertEquals(oldItems.size(), oldFieldMap.keySet().size());
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
				//				Debug.debug("oldField", oldField);
				//				Debug.debug("newField", newField);

				//				fieldTag.
				assertNotNull(oldField);
				assertNotNull(newField);

				assertEquals(oldField.tag, newField.tag);
				assertEquals(dirType.intValue(), newField.directoryType);
				assertEquals(oldField.directoryType, newField.directoryType);
				assertEquals(oldField.length, newField.length);
				assertEquals(oldField.isLocalValue(), newField.isLocalValue());

				if (oldField.tag == 0x202)
				{
					// ignore "jpg from raw length" value. may have off-by-one bug in certain cameras.
					// i.e. Sony DCR-PC110
					continue;
				}

				if (!oldField.tagInfo.isOffset())
				{
					if (oldField.tagInfo.isText())
						;
					else if (oldField.isLocalValue())
					{
						//						Debug.debug("oldField.tag", oldField.tag);
						//						Debug.debug("newField.tag", newField.tag);
						//						Debug.debug("oldField.tagInfo", oldField.tagInfo);
						//						Debug.debug("newField.tagInfo", newField.tagInfo);
						//						Debug.debug("oldField.fieldType", oldField.fieldType);
						//						Debug.debug("newField.fieldType", newField.fieldType);
						//						Debug.debug("oldField.getBytesLength", oldField
						//								.getBytesLength());
						//						Debug.debug("newField.getBytesLength", newField
						//								.getBytesLength());
						//
						//						Debug.debug("oldField.valueOffsetBytes",
						//								oldField.valueOffsetBytes);
						//						Debug.debug("newField.valueOffsetBytes",
						//								newField.valueOffsetBytes);

						if (oldField.tag == 0x116 || oldField.tag == 0x117)
							compare(oldField, newField);
						else
							compare(oldField.valueOffsetBytes,
									newField.valueOffsetBytes, oldField
											.getBytesLength(), newField
											.getBytesLength());
					}
					else
					{
						//						Debug.debug("oldField.tagInfo", oldField.tagInfo);
						//						Debug.debug("oldField.fieldType", oldField.fieldType);
						//						Debug.debug("newField.fieldType", newField.fieldType);
						//						Debug.debug("oldField.getBytesLength", oldField
						//								.getBytesLength());
						//						Debug.debug("newField.getBytesLength", newField
						//								.getBytesLength());

						//						Debug.debug("oldField.oversizeValue", oldField.oversizeValue);
						//						Debug.debug("newField.oversizeValue", newField.oversizeValue);

						compare(oldField.oversizeValue, newField.oversizeValue);
					}
				}

			}

			//			Debug.debug();
		}
	}

	private void compare(byte a[], byte b[], int aLength, int bLength)
	{
		//		Debug.debug("c0 a", a);
		//		Debug.debug("c0 b", b);
		assertEquals(aLength, bLength);
		assertTrue(a.length >= aLength);
		assertTrue(b.length >= bLength);
		assertNotNull(a);
		assertNotNull(b);
		assertEquals(a.length, b.length);
		int length = aLength;
		for (int i = 0; i < length; i++)
		{
			//			byte ba = a[i];
			//			byte bb = b[i];
			//			boolean eq = ba == bb;
			//			Debug.debug("i: " + i + ", a[i]: " + ba + ", b[i]: " + bb + " = "
			//					+ (ba == bb) + " " + eq);
			//			if(ba != bb)
			//				assertFalse(true);
			//			
			//			Debug.debug("i: " + i + ", a[i]: " + ba + ", b[i]: " + bb + " = "
			//					+ (ba == bb) + " " + eq);
			//			assertTrue(eq == true);
			//			Debug.debug("a", a);
			//			Debug.debug("b", b);
			assertTrue(a[i] == b[i]);
			//			Debug.debug("c");
			//			assertTrue((0xff & a[i]) == (0xff & b[i]));
		}
	}

	private void compare(TiffField a, TiffField b) throws ImageReadException
	{
		Object v1 = a.getValue();
		Object v2 = b.getValue();

		//		Debug.debug("v1", v1 + " (" + Debug.getType(v1) + ")");
		//		Debug.debug("v2", v2 + " (" + Debug.getType(v2) + ")");
		assertTrue(v1.equals(v2));
	}

	private void compare(byte a[], byte b[])
	{
		//		Debug.debug("c1 a", a);
		//		Debug.debug("c1 b", b);
		assertNotNull(a);
		assertNotNull(b);
		assertEquals(a.length, b.length);
		for (int i = 0; i < a.length; i++)
			assertEquals(a[i], b[i]);
	}

	private void dump(String name, Set set)
	{
		dump(name, new ArrayList(set));
	}

	private void dump(String name, List list)
	{
		Debug.debug(name, list.size());
		for (int i = 0; i < list.size(); i++)
			Debug.debug("\t" + list.get(i));
		Debug.debug();
	}
}
