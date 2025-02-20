package org.apache.commons.imaging.formats.tiff;

import java.util.HashMap;
import java.util.Map;

public class TiffCoverageLogger {
    private static final Map<Integer, Boolean> branchCoverage_run = new HashMap<>();
    private static final Map<Integer, Boolean> branchCoverage_nextToken = new HashMap<>();

    public static void logBranch_run(int branchId) {
        branchCoverage_run.put(branchId, true);
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
            if(is_covered == false){
                counter++;
            }
        }
        System.out.println("\n    total missed branches : " + counter + ", This means a coverage of : " + (1 - (double)counter / total_branch) * 100 + " %");

        System.out.println("\n\n    For function nextToken():");
        int counter1 = 0;
        int total_branch1 = 33;
        for (int i = 0; i <= total_branch1; i++) {
            boolean is_covered = branchCoverage_nextToken.getOrDefault(i, false);
            System.out.println("    Branch " + i + ": " + (is_covered ? "True" : "False"));
            if(is_covered == false){
                counter1++;
            }
        }
        System.out.println("\n    total missed branches : " + counter1 + ", This means a coverage of : " + (1 - (double)counter1 / total_branch1) * 100 + " %");

    }

    public static void printCoverageReport() {
        System.out.println("\n\nBranch Coverage Report: ");
        print_run();
    }
}