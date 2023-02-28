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

package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.File;
import java.io.OutputStream;

public class ExifOrientationRewriter {

    public static enum ORIENTATION{
        HORIZONTAL,
        MIRROR_HORIZONTAL,
        ROTATE_180,
        MIRROR_VERTICAL,
        MIRROR_HORIZONTAL_AND_ROTATE_270,
        ROTATE_90,
        MIRROR_HORIZONTAL_AND_ROTATE_90,
        ROTATE_270,
    }

    /**
     Constructor
     */
    public ExifOrientationRewriter(){

    }

    public int GetExifOrientation(final File src)
    {
        return 0;
    }

    public void SetExifOrientation(final File src, final OutputStream os, ORIENTATION orientation)
    {

    }

}
