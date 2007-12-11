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

package org.apache.sanselan;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.sanselan.test.util.FSTraversal;
import org.apache.sanselan.util.Debug;

public abstract class SanselanTest extends TestCase
{
	public SanselanTest(String name)
	{
		super(name);
	}
	
	public void compareByteArrays(byte a[], byte b[])
	{
		assertTrue(a.length == b.length);
		for (int i = 0; i < b.length; i++)
			assertTrue(b[i] == a[i]);
	}

	protected void purgeMemory()
	{
		try
		{
			System.gc();
			Thread.sleep(50);
			System.runFinalization();
			Thread.sleep(50);
		}
		catch (Exception e)
		{
			Debug.debug(e);
		}
	}

	protected List getAllTestImages()
	{
		File srcFolder = new File(".", "src");
		File testFolder = new File(srcFolder, "test");
		File dataFolder = new File(testFolder, "data");
		File imagesFolder = new File(dataFolder, "images");

		assertTrue(imagesFolder.exists());
		
		final List result = new ArrayList();

		FSTraversal.Visitor visitor = new FSTraversal.Visitor()
		{
			public boolean visit(File file, double progressEstimate)
			{
				if (Sanselan.hasImageFileExtension(file))
					result.add(file);
				return true;
			}
		};
		new FSTraversal().traverseFiles(imagesFolder, visitor);

		return result;
	}
	
	protected File getTestImage()
	{
		List images = getAllTestImages();

		assertTrue(images.size()>0);

		return (File) images.get(0);
	}
}
