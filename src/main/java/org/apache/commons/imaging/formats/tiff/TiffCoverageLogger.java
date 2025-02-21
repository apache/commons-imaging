/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.tiff;

import java.util.HashMap;
import java.util.Map;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class

public class TiffCoverageLogger {
    private static final Map<Integer, Boolean> branchCoverage_run = new HashMap<>();
    private static final Map<Integer, Boolean> branchCoverage_run_getImageInfo = new HashMap<>();

    private static final Map<Integer, Boolean> getBufferedImageBranchCoverage_run = new HashMap<>();

    private static final Map<Integer, Boolean> branchCoverage_nextToken = new HashMap<>();

    public static void logBranch_run(int branchId) {
        branchCoverage_run.put(branchId, true);
    }

    public static void logBranch_run_getImageInfo(int branchId) {
        branchCoverage_run_getImageInfo.put(branchId, true);
    }

    public static void getBufferedImagelogBranch_run(int branchId) {
        getBufferedImageBranchCoverage_run.put(branchId, true);
    }

    public static void logBranch_nextToken(int branchId) {
        branchCoverage_nextToken.put(branchId, true);

    }

    public static void print_run() {
        System.out.println("\n\n    For function getRasterData:");
        int counter = 0;
        int total_branch = 64;
        for (int i = 1; i <= total_branch; i++) {
            boolean is_covered = branchCoverage_run.getOrDefault(i, false);
            System.out.println("    Branch " + i + ": " + (is_covered ? "True" : "False"));
            if (is_covered == false) {
                counter++;
            }
        }

        System.out.println("\n    total missed branches : " + counter + ", This means a coverage of : "
                + (1 - (double) counter / total_branch) * 100 + " %");

        System.out.println("\n\n    For function nextToken():");
        int counter1 = 0;
        // int total_branch1 = 33;
        int total_branch1 = 22;
        for (int i = 1; i <= total_branch1; i++) {
            boolean is_covered = branchCoverage_nextToken.getOrDefault(i, false);
            System.out.println("    Branch " + i + ": " + (is_covered ? "True" : "False"));
            if (is_covered == false) {
                counter1++;
            }
        }

        System.out.println("\n    total missed branches : " + counter1 + ", This means a coverage of : " + (1 - (double)counter1 / total_branch1) * 100 + " %");

        System.out.println("\n\n    For function getBufferedImagePrint:");
        int bufferedImageCounter = 0;
        int bufferedImage_total_branch = 44;
        for (int i = 1; i <= bufferedImage_total_branch; i++) {
            boolean is_covered_buffered_image = getBufferedImageBranchCoverage_run.getOrDefault(i, false);
            System.out.println("    Branch " + i + ": " + (is_covered_buffered_image ? "True" : "False"));
            if (is_covered_buffered_image == false) {
                bufferedImageCounter++;
            }
        }
        System.out.println("\n    total missed branches : " + bufferedImageCounter + ", This means a coverage of : "
                + (1 - (double) bufferedImageCounter / bufferedImage_total_branch) * 100 + " %");

        System.out.println("\n\n    For function getRasterData:");
        int getImageCounter = 0;
        int getImageTotal_branch = 54;
        for (int i = 1; i <= getImageTotal_branch; i++) {
            boolean is_covered = branchCoverage_run_getImageInfo.getOrDefault(i, false);
            System.out.println("    Branch " + i + ": " + (is_covered ? "True" : "False"));
            if (is_covered == false) {
                getImageCounter++;
            }
        }
        System.out.println("\n    total missed branches : " + getImageCounter + ", This means a coverage of : "
                + (1 - (double) getImageCounter / getImageTotal_branch) + " %");
    }

    public static void printCoverageReport() {
        System.out.println("\n\nBranch Coverage Report: ");
        print_run();
    }

}