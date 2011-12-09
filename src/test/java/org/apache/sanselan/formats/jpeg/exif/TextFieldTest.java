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

import org.apache.sanselan.ImageReadException;
import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.formats.tiff.TiffField;
import org.apache.sanselan.util.Debug;

public class TextFieldTest extends SpecificExifTagTest
{
    //    public TextFieldTest(String name)
    //    {
    //        super(name);
    //    }

    protected void checkField(File imageFile, TiffField field)
            throws IOException, ImageReadException, ImageWriteException
    {
        if (field.tag == EXIF_TAG_USER_COMMENT.tag)
        { /* do nothing */ }
        else if (field.tag == GPS_TAG_GPS_PROCESSING_METHOD.tag
                && field.directoryType == EXIF_DIRECTORY_GPS.directoryType)
        { /* do nothing */ }
        else if (field.tag == GPS_TAG_GPS_AREA_INFORMATION.tag
                && field.directoryType == EXIF_DIRECTORY_GPS.directoryType)
        { /* do nothing */ }
        else
            return;

        //        Debug.debug("field", field);
        //        Debug.debug("field", Debug.getType(field));
        //
        //        Debug.debug("field", field.tag);
        //        Debug.debug("field", field.tagInfo);
        //        Debug.debug("field", Debug.getType(field));

        try
        {
            Object textFieldValue = field.getValue();
            //            Debug.debug("imageFile", imageFile.getAbsoluteFile());
            //            Debug.debug("Text field value(" + field.tagInfo.name + ")",
            //                    textFieldValue);
            //        Debug.debug("userCommentValue", Debug.getType(userCommentValue));
        }
        catch (ImageReadException e)
        {
            Debug.debug("imageFile", imageFile.getAbsoluteFile());
            Debug.debug(e);
            throw e;
        }

    }

}
