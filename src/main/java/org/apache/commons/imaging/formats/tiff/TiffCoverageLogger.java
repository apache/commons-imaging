package org.apache.commons.imaging.formats.tiff;

import java.util.HashMap;
import java.util.Map;

public class TiffCoverageLogger {
    private static final Map<Integer, Boolean> branchCoverage = new HashMap<>();

    public static void logBranch_run(int branchId) {
        branchCoverage.put(branchId, true);
    }

    public static void print_run() {
        System.out.println("\n\n    For function getRasterData:");

        for (int i = 1; i <= 27; i++) {
            System.out.println("    Branch " + i + ": " + (branchCoverage.getOrDefault(i, false) ? "True" : "False"));
        }
    }



    public static void printCoverageReport() {
        System.out.println("\n\nBranch Coverage Report: ");
        print_run();
    }
}