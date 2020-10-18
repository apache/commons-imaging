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

package org.apache.commons.imaging.examples.tiff;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.imaging.ImageReadException;

/**
 * Recursively search the specified path and list TIFF files and metadata.
 * <p>
 * Command-line Arguments:</p>
 * <ol>
 * <li>Top-level directory (mandatory)</li>
 * <li>Output file for results (optional)</li>
 * </ol>
 * If the optional output file has the extension ".csv", the output
 * will be formatted as a comma-separated-value file suitable
 * for inspection in Excel.
 */
public class SurveyTiffFolder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Missing directory path");
            System.exit(-1);
        }
        File topLevelDir = new File(args[0]);
        if (!topLevelDir.isDirectory() || !topLevelDir.canRead()) {
            System.err.println("Path specification is not an accessible directory " + args[0]);
            System.exit(-1);
        }

        // recursively survey file paths
        String[] scratch = new String[256];
        List<String[]> pathList = new ArrayList<>();
        collectPaths(topLevelDir, pathList, scratch, 0);
        pathList.sort(new PathComparator());

        // find maximum lengths of each entry
        int[] maxLen = findMaxLengths(pathList);

        // If args.length is 1, write report to System.out,
        // otherwise, write to a file.
        if (args.length == 1) {
            surveyFiles(topLevelDir, pathList, maxLen, false, System.out);
        } else {

            boolean csv = false;

            int i = args[1].lastIndexOf('.');
            if (i > 0) {
                String ext = args[1].substring(i);
                if (".csv".equalsIgnoreCase(ext)) {
                    csv = true;
                }
            }
            File reportFile = new File(args[1]);
            try (FileOutputStream fos = new FileOutputStream(reportFile);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                PrintStream ps = new PrintStream(bos, true, "UTF-8")) {
                surveyFiles(topLevelDir, pathList, maxLen, csv, ps);
            } catch (IOException ioex) {
                System.err.println("IOException writing report to " + args[1]);
                System.err.println("" + ioex.getMessage());
            }
        }
    }

    private static int collectPaths(
        File parent,
        List<String[]> pathList,
        String[] scratch,
        int depth) {
        if (depth == scratch.length) {
            // directory hierarchy is too deep
            return 0;
        }

        File[] files = parent.listFiles();
        for (File f : files) {
            if (!f.isHidden()) {
                String name = f.getName();
                scratch[depth] = name;
                if (f.isDirectory()) {
                    collectPaths(f, pathList, scratch, depth + 1);
                } else {
                    int i = name.lastIndexOf('.');
                    if (i > 0) {
                        String ext = name.substring(i).toLowerCase();
                        if (".tif".equals(ext) || ".tiff".equals(ext)) {
                            String[] temp = new String[depth + 1];
                            System.arraycopy(scratch, 0, temp, 0, depth + 1);
                            pathList.add(temp);
                        }
                    }
                }
            }
        }
        return depth;
    }

    private static class PathComparator implements Comparator<String[]> {

        @Override
        public int compare(String[] a, String[] b) {
            for (int i = 0; i < a.length && i < b.length; i++) {
                int test;
                if (isNumeric(a[i]) && isNumeric(b[i])) {
                    int iA = Integer.parseInt(a[i]);
                    int iB = Integer.parseInt(b[i]);
                    test = iA - iB;
                } else {
                    test = a[i].compareTo(b[i]);
                }
                if (test != 0) {
                    return test;
                }
            }
            // in practice, the program should never reach this position.
            // at this point, all entries in both arrays are equal,
            // so order the entries so that the shortest array goes first
            if (a.length < b.length) {
                return -1;
            } else {
                return 1;
            }
        }

        private boolean isNumeric(String a) {
            for (int i = 0; i < a.length(); i++) {
                if (!Character.isDigit(a.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

    }

    private static int[] findMaxLengths(List<String[]> pathList) {
        int[] m = new int[1];
        for (String[] s : pathList) {
            if (s.length > m.length) {
                m = Arrays.copyOf(m, s.length);
            }
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() > m[i]) {
                    m[i] = s[i].length();
                }
            }
        }
        return m;
    }

    private static void surveyFiles(File topDir, List<String[]> pathList, int[] maxLen, boolean csv, PrintStream ps) {
        SurveyTiffFile surveyor = new SurveyTiffFile();
        int n = maxLen.length - 1;
        for (int i = 0; i < maxLen.length; i++) {
            n += maxLen[i];
        }
        if (n < 10) {
            n = 10;
        }

        String header = surveyor.formatHeader(n, csv);
        ps.println(header);

        List<String> badFiles = new ArrayList<>();
        for (String[] path : pathList) {
            StringBuilder sBuilder = new StringBuilder();
            File file = topDir;
            for (String s : path) {
                file = new File(file, s);
            }
            for (int i = 0; i < path.length; i++) {
                if (i > 0) {
                    sBuilder.append('/');
                }
                sBuilder.append(path[i]);
            }
            if (!csv) {
                for (int i = sBuilder.length(); i < n; i++) {
                    sBuilder.append(' ');
                }
            }

            String result;
            try {
                result = surveyor.surveyFile(file, csv);
            } catch (IOException | ImageReadException ex) {
                sBuilder.append(ex.getMessage());
                badFiles.add(sBuilder.toString());
                continue; // result = ex.getMessage();
            }
            sBuilder.append(result);
            ps.println(sBuilder.toString());
        }
        if (!csv && !badFiles.isEmpty()) {
            ps.println();
            ps.println("Bad Files:");
            for (String s : badFiles) {
                ps.println(s);
            }
        }

        if (!csv) {
            ps.println();
            surveyor.printLegend(ps);
        }
    }
}
