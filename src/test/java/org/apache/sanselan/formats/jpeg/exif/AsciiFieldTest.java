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

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.Sanselan;
import org.apache.sanselan.common.IImageMetadata;
import org.apache.sanselan.formats.jpeg.JpegImageMetadata;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.formats.tiff.TiffImageMetadata;
import org.apache.sanselan.formats.tiff.constants.AllTagConstants;

public class AsciiFieldTest extends ExifBaseTest implements AllTagConstants {

	public void testSingleImage() throws IOException, ImageReadException {
		File imageFile = getTestImageByName("Canon Powershot SD750 - 2007.12.26.n.IMG_3704.JPG");

		Map params = new HashMap();

		IImageMetadata metadata = Sanselan.getMetadata(imageFile, params);
		assertNotNull(metadata);
		JpegImageMetadata jpegMetadata = (JpegImageMetadata) metadata;

		// note that exif might be null if no Exif metadata is found.
		TiffImageMetadata exif = jpegMetadata.getExif();
		if (null == exif)
			return;

		List fields = exif.getAllFields();
		Map fieldMap = new Hashtable();
		// Build a simplified field tag -> field map, ignoring directory structures.
		// Good enough for our purposes, since the image in question is known.
		for (int i = 0; i < fields.size(); i++) {
			TiffField field = (TiffField) fields.get(i);
			fieldMap.put(new Integer(field.tag), field);
		}
		
		Map expectedFieldValues = new Hashtable();
		expectedFieldValues.put(new Integer(EXIF_TAG_MAKE.tag), "Canon");
		expectedFieldValues.put(new Integer(EXIF_TAG_MODEL.tag), "Canon PowerShot SD750");
		expectedFieldValues.put(new Integer(EXIF_TAG_MODIFY_DATE.tag), "2007:12:25 13:34:39");
		Iterator expectedTags = expectedFieldValues.keySet().iterator();
		while (expectedTags.hasNext()) {
			Integer tag = (Integer) expectedTags.next();
			Object expectedValue = expectedFieldValues.get(tag);

			assertTrue(fieldMap.containsKey(tag));
			TiffField field = (TiffField) fieldMap.get(tag);
			assertNotNull(field);
			Object value = field.getValue();
			assertNotNull(value);
			assertEquals(value, expectedValue);
		}
	}
}
