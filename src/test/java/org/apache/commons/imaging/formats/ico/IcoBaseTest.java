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

package org.apache.commons.imaging.formats.ico;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.SanselanTest;

public abstract class IcoBaseTest extends SanselanTest
{

    private static boolean isIco(File file)
    {
        return file.getName().toLowerCase().endsWith(".ico") ||
            file.getName().toLowerCase().endsWith(".cur");
    }

    private static final ImageFilter IMAGE_FILTER = new ImageFilter() {
        public boolean accept(File file) throws IOException, ImageReadException
        {
            return isIco(file);
        }
    };

    protected List getIcoImages() throws IOException, ImageReadException
    {
        return getTestImages(IMAGE_FILTER);
    }


}
