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

package org.apache.sanselan.formats.jpeg.xmp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.byteSources.ByteSource;
import org.apache.sanselan.common.byteSources.ByteSourceFile;
import org.apache.sanselan.formats.jpeg.JpegImageParser;
import org.apache.sanselan.formats.jpeg.JpegUtils;
import org.apache.sanselan.util.Debug;

public class JpegXmpRewriteTest extends JpegXmpBaseTest
{

	public void testRemoveInsertUpdate() throws IOException, ImageReadException,
			ImageWriteException
	{
		List images = getImagesWithXmpData();
		for (int i = 0; i < images.size(); i++)
		{
			if (i % 10 == 0)
				Debug.purgeMemory();

			File imageFile = (File) images.get(i);
			Debug.debug("imageFile", imageFile);

			// boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
			// if (ignoreImageData)
			// continue;

			ByteSource byteSource = new ByteSourceFile(imageFile);
			// Debug.debug("Source Segments:");
			// new JpegUtils().dumpJFIF(byteSource);

			Map params = new HashMap();
			String xmpXml = new JpegImageParser().getXmpXml(byteSource, params);
			assertNotNull(xmpXml);

			// Debug.debug("xmpXml", xmpXml.length());
			// Debug.debug();

			File noXmpFile = createTempFile(imageFile.getName() + ".", ".jpg");
			{
				// test remove
				
				OutputStream os = null;
				try
				{
					os = new FileOutputStream(noXmpFile);
					os = new BufferedOutputStream(os);
					new JpegXmpRewriter().removeXmpXml(byteSource, os);
				} finally
				{
					os.close();
					os = null;
				}

				// Debug.debug("Source Segments:");
				// new JpegUtils().dumpJFIF(new ByteSourceFile(noXmpFile));

				String outXmp = new JpegImageParser().getXmpXml(
						new ByteSourceFile(noXmpFile), params);
				assertNull(outXmp);
			}

			{
				// test update
				
				String newXmpXml = "test";
				File updated = createTempFile(imageFile.getName() + ".", ".jpg");
				OutputStream os = null;
				try
				{
					os = new FileOutputStream(updated);
					os = new BufferedOutputStream(os);
					new JpegXmpRewriter().updateXmpXml(byteSource, os,
							newXmpXml);
				} finally
				{
					os.close();
					os = null;
				}

				// Debug.debug("Source Segments:");
				// new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

				String outXmp = new JpegImageParser().getXmpXml(
						new ByteSourceFile(updated), params);
				assertNotNull(outXmp);
				assertEquals(outXmp, newXmpXml);
			}

			{
				// test insert
				
				String newXmpXml = "test";
				File updated = createTempFile(imageFile.getName() + ".", ".jpg");
				OutputStream os = null;
				try
				{
					os = new FileOutputStream(updated);
					os = new BufferedOutputStream(os);
					new JpegXmpRewriter().updateXmpXml(new ByteSourceFile(noXmpFile), os,
							newXmpXml);
				} finally
				{
					os.close();
					os = null;
				}

				// Debug.debug("Source Segments:");
				// new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

				String outXmp = new JpegImageParser().getXmpXml(
						new ByteSourceFile(updated), params);
				assertNotNull(outXmp);
				assertEquals(outXmp, newXmpXml);
			}
		}
	}

}
