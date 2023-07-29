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

package org.apache.commons.imaging.test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Provides convenience methods for accessing test resources.
 */
public class TestResources {

    /**
     * Gets a {@link File} for a {@linkplain Class#getResource(String) resource path}.
     */
    public static File resourceToFile(String path) {
        return new File(resourceToURI(path));
    }

    /**
     * Gets a {@link Path} for a {@linkplain Class#getResource(String) resource path}.
     */
    public static Path resourceToPath(String path) {
        return Paths.get(resourceToURI(path));
    }

    private static URI resourceToURI(String name) {
        URL url = TestResources.class.getResource(name);
        if (url == null) {
            throw new IllegalArgumentException("Resource does not exist: " + name);
        }
        try {
            return url.toURI();
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private TestResources() {
    }
}
