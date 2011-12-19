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

package org.apache.commons.sanselan.formats.jpeg.iptc;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.common.bytesource.ByteSource;
import org.apache.commons.sanselan.common.bytesource.ByteSourceFile;
import org.apache.commons.sanselan.formats.jpeg.JpegImageParser;
import org.apache.commons.sanselan.formats.jpeg.JpegPhotoshopMetadata;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.sanselan.formats.jpeg.iptc.IptcRecord;
import org.apache.commons.sanselan.formats.jpeg.iptc.JpegIptcRewriter;
import org.apache.commons.sanselan.formats.jpeg.iptc.PhotoshopApp13Data;
import org.apache.commons.sanselan.util.Debug;

public class IptcUpdateTest extends IptcBaseTest
{
    private List imagesWithIptcData;

    public void setUp() throws Exception
    {
        super.setUp();

        imagesWithIptcData = getImagesWithIptcData();
    }

    public void tearDown() throws Exception
    {
        super.tearDown();

        imagesWithIptcData = null;
    }

    /*
     * Remove all Photoshop IPTC data from a JPEG file.
     */
    public void testRemove() throws IOException, ImageReadException,
            ImageWriteException
    {
        List images = imagesWithIptcData;
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            // Debug.debug("imageFile", imageFile);
            // Debug.debug();

            ByteSource byteSource = new ByteSourceFile(imageFile);

            Map params = new HashMap();
            boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params
                    .put(PARAM_KEY_READ_THUMBNAILS, new Boolean(
                            !ignoreImageData));

            JpegPhotoshopMetadata metadata = new JpegImageParser()
                    .getPhotoshopMetadata(byteSource, params);
            assertNotNull(metadata);
            // metadata.dump();

            File noIptcFile = createTempFile(imageFile.getName()
                    + ".iptc.remove.", ".jpg");
            {
                // test remove

                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(noIptcFile);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().removeIPTC(byteSource, os);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(new ByteSourceFile(noIptcFile),
                                params);
                assertTrue(outMetadata == null
                        || outMetadata.getItems().size() == 0);
            }

        }
    }

    public void testRemoveInsertUpdate() throws IOException,
            ImageReadException, ImageWriteException
    {
        List images = imagesWithIptcData;
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
            Debug.debug("imageFile", imageFile);
            Debug.debug();

            ByteSource byteSource = new ByteSourceFile(imageFile);
            // Debug.debug("Segments:");
            // new JpegUtils().dumpJFIF(byteSource);

            Map params = new HashMap();
            boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params
                    .put(PARAM_KEY_READ_THUMBNAILS, new Boolean(
                            !ignoreImageData));
            // params.put(PARAM_KEY_VERBOSE, Boolean.TRUE);
            // params.put(PARAM_KEY_VERBOSE, Boolean.TRUE);

            JpegPhotoshopMetadata metadata = new JpegImageParser()
                    .getPhotoshopMetadata(byteSource, params);
            assertNotNull(metadata);
            metadata.dump();

            File noIptcFile = createTempFile(imageFile.getName()
                    + ".iptc.remove.", ".jpg");
            {
                // test remove

                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(noIptcFile);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().removeIPTC(byteSource, os);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                // Debug.debug("Source Segments:");
                // new JpegUtils().dumpJFIF(new ByteSourceFile(noIptcFile));

                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(new ByteSourceFile(noIptcFile),
                                params);
                assertTrue(outMetadata == null
                        || outMetadata.getItems().size() == 0);
            }
            {
                // test no-change update

                List newBlocks = metadata.photoshopApp13Data.getNonIptcBlocks();
                List oldRecords = metadata.photoshopApp13Data.getRecords();
                List newRecords = new ArrayList();
                for (int j = 0; j < oldRecords.size(); j++)
                {
                    IptcRecord record = (IptcRecord) oldRecords.get(j);
                    if (record.iptcType.type != IptcConstants.IPTC_TYPE_CITY.type
                            && record.iptcType.type != IptcConstants.IPTC_TYPE_CREDIT.type)
                        newRecords.add(record);
                }

                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CITY,
                        "Albany, NY"));
                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CREDIT,
                        "William Sorensen"));

                PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords,
                        newBlocks);

                File updated = createTempFile(imageFile.getName()
                        + ".iptc.update.", ".jpg");
                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(updated);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().writeIPTC(byteSource, os, newData);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                // Debug.debug("Source Segments:");
                // new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

                ByteSource updateByteSource = new ByteSourceFile(updated);
                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(updateByteSource, params);

                // Debug.debug("outMetadata", outMetadata.toString());
                // Debug.debug("hasIptcSegment", new JpegImageParser()
                // .hasIptcSegment(updateByteSource));

                assertNotNull(outMetadata);
                assertTrue(outMetadata.getItems().size() == newRecords.size());
                // assertEquals(metadata.toString(), outMetadata.toString());
            }

            {
                // test update

                List newBlocks = metadata.photoshopApp13Data.getNonIptcBlocks();
                List newRecords = new ArrayList();

                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CITY,
                        "Albany, NY"));
                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CREDIT,
                        "William Sorensen"));

                PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords,
                        newBlocks);

                File updated = createTempFile(imageFile.getName()
                        + ".iptc.update.", ".jpg");
                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(updated);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().writeIPTC(byteSource, os, newData);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                // Debug.debug("Source Segments:");
                // new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

                ByteSource updateByteSource = new ByteSourceFile(updated);
                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(updateByteSource, params);

                // Debug.debug("outMetadata", outMetadata.toString());
                // Debug.debug("hasIptcSegment", new JpegImageParser()
                // .hasIptcSegment(updateByteSource));

                assertNotNull(outMetadata);
                assertTrue(outMetadata.getItems().size() == 2);
                // assertEquals(metadata.toString(), outMetadata.toString());
            }

            {
                // test insert

                List newBlocks = new ArrayList();
                List newRecords = new ArrayList();

                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CITY,
                        "Albany, NY"));
                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CREDIT,
                        "William Sorensen"));

                PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords,
                        newBlocks);

                File updated = createTempFile(imageFile.getName()
                        + ".iptc.insert.", ".jpg");
                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(updated);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().writeIPTC(new ByteSourceFile(
                            noIptcFile), os, newData);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                // Debug.debug("Source Segments:");
                // new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

                ByteSource updateByteSource = new ByteSourceFile(updated);
                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(updateByteSource, params);

                // Debug.debug("outMetadata", outMetadata.toString());
                // Debug.debug("hasIptcSegment", new JpegImageParser()
                // .hasIptcSegment(updateByteSource));

                assertNotNull(outMetadata);
                assertTrue(outMetadata.getItems().size() == 2);
                // assertEquals(metadata.toString(), outMetadata.toString());
            }

        }
    }

    /*
     * Add a few IPTC values to JPEG images, whether or not they have existing
     * IPTC data.
     */
    public void testAddIptcData() throws IOException, ImageReadException,
            ImageWriteException
    {
        List images = getJpegImages();
        for (int i = 0; i < images.size(); i++)
        {
            if (i % 10 == 0)
                Debug.purgeMemory();

            File imageFile = (File) images.get(i);
//             Debug.debug("imageFile", imageFile);
//             Debug.debug();

            ByteSource byteSource = new ByteSourceFile(imageFile);
//             Debug.debug("Segments:");
//             new JpegUtils().dumpJFIF(byteSource);

            Map params = new HashMap();
            boolean ignoreImageData = isPhilHarveyTestImage(imageFile);
            params
                    .put(PARAM_KEY_READ_THUMBNAILS, new Boolean(
                            !ignoreImageData));

            JpegPhotoshopMetadata metadata = new JpegImageParser()
                    .getPhotoshopMetadata(byteSource, params);
            // metadata.dump();

            {
                List newBlocks = new ArrayList();
                List newRecords = new ArrayList();

                if (null != metadata)
                {
                    boolean keepOldIptcNonTextValues = true;
                    if (keepOldIptcNonTextValues)
                        newBlocks.addAll(metadata.photoshopApp13Data
                                .getNonIptcBlocks());
                    boolean keepOldIptcTextValues = true;
                    if (keepOldIptcTextValues)
                    {
                        List oldRecords = metadata.photoshopApp13Data
                                .getRecords();

                        newRecords = new ArrayList();
                        for (int j = 0; j < oldRecords.size(); j++)
                        {
                            IptcRecord record = (IptcRecord) oldRecords.get(j);
                            if (record.iptcType.type != IptcConstants.IPTC_TYPE_CITY.type
                                    && record.iptcType.type != IptcConstants.IPTC_TYPE_CREDIT.type)
                                newRecords.add(record);
                        }
                    }
                }

                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CITY,
                        "Albany, NY"));
                newRecords.add(new IptcRecord(IptcConstants.IPTC_TYPE_CREDIT,
                        "William Sorensen"));

                PhotoshopApp13Data newData = new PhotoshopApp13Data(newRecords,
                        newBlocks);

                File updated = createTempFile(imageFile.getName()
                        + ".iptc.add.", ".jpg");
                OutputStream os = null;
                try
                {
                    os = new FileOutputStream(updated);
                    os = new BufferedOutputStream(os);
                    new JpegIptcRewriter().writeIPTC(byteSource, os, newData);
                } finally
                {
                    if (os != null) {
                        os.close();
                    }
                    os = null;
                }

                // Debug.debug("Destination Segments:");
                // new JpegUtils().dumpJFIF(new ByteSourceFile(updated));

                ByteSource updateByteSource = new ByteSourceFile(updated);
                JpegPhotoshopMetadata outMetadata = new JpegImageParser()
                        .getPhotoshopMetadata(updateByteSource, params);

                // Debug.debug("outMetadata", outMetadata.toString());
                // Debug.debug("hasIptcSegment", new JpegImageParser()
                // .hasIptcSegment(updateByteSource));

                assertNotNull(outMetadata);
                assertTrue(outMetadata.getItems().size() == newRecords.size());
                // assertEquals(metadata.toString(), outMetadata.toString());
            }

        }
    }

}
