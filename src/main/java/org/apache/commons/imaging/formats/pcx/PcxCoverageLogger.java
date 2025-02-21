package org.apache.commons.imaging.formats.pcx;

import java.util.HashMap;
import java.util.Map;

public class PcxCoverageLogger {
    // Map to store branch coverage status
    private static final Map<Integer, Boolean> branchCoverage_run = new HashMap<>();
    
    // Map to store branch positions
    private static final Map<Integer, String> branchPositions = new HashMap<>();

    /**
     * Logs a branch execution and its position in the source code
     * @param branchId The unique identifier for the branch
     */
    public static void logBranch_run(int branchId) {
        StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
        StackTraceElement caller2 = Thread.currentThread().getStackTrace()[3];
        StackTraceElement caller3 = Thread.currentThread().getStackTrace()[4];
        String position = String.format("%s:%d", caller.getFileName(), caller.getLineNumber());
        position += String.format(" -> %s:%d", caller2.getFileName(), caller2.getLineNumber());
        position += String.format(" -> %s:%d", caller3.getFileName(), caller3.getLineNumber());
        branchCoverage_run.put(branchId, true);
        branchPositions.put(branchId, position);
    }

    /**
     * Prints coverage information for getRasterData function
     */
    public static void print_run() {
        System.out.println("\n\n For function PcxWriter::writeImage:");
        int counter = 0;
        int totalbranches = 28;
        // Print coverage information for each branch
        for (int i = 1; i <= totalbranches; i++) {
            boolean is_covered = branchCoverage_run.getOrDefault(i, false);
            String position = branchPositions.getOrDefault(i, "position not recorded");
            
            System.out.printf(" Branch %d [%s]: %s%n", 
                i, 
                position,
                is_covered ? "Covered" : "Not covered");
            
            if (!is_covered) {
                counter++;
            }
        }

        // Print summary
        double coverage = 1 - (double)counter / totalbranches;
        System.out.printf("%n Total missed branches: %d, Coverage: %.2f%%%n", 
            counter, 
            coverage * 100);
    }

    /**
     * Prints the complete coverage report
     */
    public static void printCoverageReport() {
        System.out.println("\n\nBranch Coverage Report: ");
        print_run();
    }

    /**
     * Clears all coverage data
     */
    public static void reset() {
        branchCoverage_run.clear();
        branchPositions.clear();
    }
}