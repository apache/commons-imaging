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
package org.apache.commons.imaging.test.util;

import java.io.File;

import org.apache.commons.imaging.internal.Debug;

public class FileSystemTraversal {

    public static final int MODE_FILES = 1;
    public static final int MODE_FOLDERS = 2;
    public static final int MODE_FILES_AND_FOLDERS = 3;
    public static final int MODE_ALL = 4;

    public interface Visitor {
        boolean visit(File file, double progressEstimate);
    }

    public boolean traverseFiles(final File file, final Visitor visitor) {

        return traverse(file, MODE_FILES, visitor);
    }

    public boolean traverseFolders(final File file, final Visitor visitor) {

        return traverse(file, MODE_FOLDERS, visitor);
    }

    public boolean traverseAll(final File file, final Visitor visitor) {

        return traverse(file, MODE_FILES_AND_FOLDERS, visitor);
    }

    public boolean traverse(final File file, final int mode, final Visitor visitor) {
        return traverse(file, mode, visitor, 0, 1);
    }

    private boolean traverse(final File file, final int mode, final Visitor visitor,
            final double estimate, final double estimateIncrement) {

        if (file.isFile()) {
            if ((mode == MODE_FILES) || (mode == MODE_FILES_AND_FOLDERS)
                    || (mode == MODE_ALL)) {
                if (!visitor.visit(file, estimate)) {
                    return false;
                }
            }
        } else if (file.isDirectory()) {
            final File[] files = file.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    final File child = files[i];
                    if (ON_MAC_OS_X && child.isDirectory()) {
                        final String name = child.getName();
                        if (name.equalsIgnoreCase("automount")
                                || name.equalsIgnoreCase("private")
                                || name.equalsIgnoreCase("Network")
                                || name.equalsIgnoreCase("Volumes")) {
                            continue;
                            // return true;
                        }
                    }

                    if (!traverse(child, mode, visitor, estimate
                            + estimateIncrement * i / files.length,
                            estimateIncrement / files.length)) {
                        return false;
                    }
                }
            }

            if ((mode == MODE_FOLDERS) || (mode == MODE_FILES_AND_FOLDERS)
                    || (mode == MODE_ALL)) {
                if (!visitor.visit(file, estimate)) {
                    return false;
                }
            }
        } else {
            if (mode == MODE_ALL) {
                if (!visitor.visit(file, estimate)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean traverseFiles(final Visitor visitor) {

        return traverse(MODE_FILES, visitor);
    }

    public boolean traverseFolders(final Visitor visitor) {

        return traverse(MODE_FOLDERS, visitor);
    }

    public boolean traverseAll(final Visitor visitor) {

        return traverse(MODE_FILES_AND_FOLDERS, visitor);
    }

    public boolean traverse(final int mode, final Visitor visitor) {
        return traverse(mode, visitor, 0, 1);
    }

    private static boolean ON_MAC_OS_X;

    static {
        try {
            ON_MAC_OS_X = (System.getProperty("mrj.version") != null);
        } catch (final Exception e) {
            Debug.debug(e);

            ON_MAC_OS_X = false;
        }
    }

    private boolean traverse(final int mode, final Visitor visitor, final double estimate,
            final double estimateIncrement) {
        File[] roots = File.listRoots();

        if (ON_MAC_OS_X) {
            final File Volumes = new File("/Volumes/");
            roots = Volumes.listFiles();
        } else {
            roots = File.listRoots();
        }

        if (roots == null) {
            return false;
        }

        for (int i = 0; i < roots.length; i++) {
            final File root = roots[i];

            if (root == null || !root.exists()) {
                continue;
            }

            if (!traverse(roots[i], mode, visitor, estimate + estimateIncrement
                    * i / roots.length, estimateIncrement / roots.length)) {
                return false;
            }
        }

        return true;
    }

}
