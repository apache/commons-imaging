package org.apache.commons.imaging.formats.tiff;

import java.util.HashMap;
import java.util.Map;

public class TiffCoverageLogger {
    private static final Map<Integer, Boolean> branchCoverage_run = new HashMap<>();

    public static void logBranch_run(int branchId) {
        branchCoverage_run.put(branchId, true);
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
        System.out.println("\n    total missed branches : " + counter + ", This means a coverage of : " + (1 - (double)counter / total_branch) + " %");
    }



    public static void printCoverageReport() {
        System.out.println("\n\nBranch Coverage Report: ");
        print_run();
    }
}