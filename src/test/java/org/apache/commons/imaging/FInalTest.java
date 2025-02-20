package org.apache.commons.imaging;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.apache.commons.imaging.formats.pcx.PcxCoverageLogger;

public class FInalTest {  // ZZZ_ prefix to run last alphabetically
    @Test
    @Order(Integer.MAX_VALUE)
    public void dummyTest() {
        PcxCoverageLogger.printCoverageReport();
    }
}