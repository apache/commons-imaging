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
 *
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging;

import java.io.File;

import org.apache.commons.io.FilenameUtils;

public interface ImagingTestConstants {

    static final File PHIL_HARVEY_TEST_IMAGE_FOLDER = new File(
            FilenameUtils.separatorsToSystem("src\\test\\data\\images\\exif\\philHarvey\\")
    );

    static final File SOURCE_FOLDER = new File("src");
    static final File TEST_SOURCE_FOLDER = new File(SOURCE_FOLDER, "test");
    static final File TEST_DATA_SOURCE_FOLDER = new File(TEST_SOURCE_FOLDER, "data");
    static final File TEST_IMAGE_FOLDER = new File(TEST_DATA_SOURCE_FOLDER, "images");
    // folder for files fo specific tests, see info.txt in the named folder
    static final File TEST_SPECIFIC_FOLDER = new File(TEST_DATA_SOURCE_FOLDER, "specificTests");
}
