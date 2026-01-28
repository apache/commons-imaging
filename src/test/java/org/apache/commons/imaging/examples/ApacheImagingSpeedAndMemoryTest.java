/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Explanation of Use and Rationale For Procedures
 *
 * This class is intended to serve as a "test stand" for loading
 * images using the Apache Imaging (nee "Sanselan") package.
 * It performs a loop that loads a specified image multiple times
 * recording both memory and time required for the loading process.
 *
 * The notes given below explain some of the operations of this
 * test class and the reasons they were designed as they are.
 * This test is by no means to be considered the "last word" in how
 * to write a test application. The techniques described below have
 * demonstrated themselves useful and relevant in developing speed
 * enhancements for some of the Apache Imaging operations. But I know
 * I haven't thought of everything and am actually hoping that
 * someone will have suggestions for improvements.
 *
 *
 * Prerequisites to Testing  --------------------------------
 *
 * Whenever testing software performance, particularly timing,
 * there are a few important considerations that should be observed:
 *
 *   a) Get a clean testing environment. In a modern computer
 *      system, there are dozens of processes running.  To whatever
 *      degree possible, make sure you are not running competing
 *      processes that will consume computer resources and contaminate
 *      your timing results.
 *
 *   b) Make sure you are testing what you think you are testing.
 *      This guideline is especially true when comparing two different
 *      approaches.  Eliminate as many variables from the analysis
 *      as you possible can.
 *
 *   c) When writing or modifying code, remember that no matter how
 *      obvious and self-evidentially superior a particular approach
 *      may seem, you don't really know if it's an improvement until you
 *      test it. If nothing else, the experience of computer programming
 *      teaches us to not to take anything for granted.
 *
 *   d) Make sure the JVM is allowed a sufficiently large maximum
 *      memory size.   Putting aside the fact that the default size
 *      for the maximum memory use of the JVM could be too small for
 *      handling test images, we also want to allocate a sufficiently
 *      large memory size to ensure that it doesn't get too close to
 *      the maximum size when performing timing tests.   When the JVM
 *      detects that it is running up against the limits of its
 *      maximum memory size setting, it triggers garbage collection
 *      operations that can contaminate timing values.
 *        I usually try to set the maximum memory size to be at least
 *      twice what I think I will need.  Traditionally, the memory
 *      size for the JVM is quite modest, perhaps 256 megabytes.  You
 *      can alter that value by using something like the following
 *      specification (check your own JVM version for alternate values):
 *            -Xmx768M   (maximum of 768 megabytes)
 *
 *
 *
 *
 * What the Test Application Does and Why ----------------------
 *
 * 0.  Functions  ------------------
 * This class reads the path to a graphics file from the command
 * line and attempts to read it several times, measuring the time
 * required to read it.   If you prefer, you may hardwire the code
 * to use a specific file.  Take whatever approach is easiest... it
 * shouldn't affect the accuracy of the results.
 *
 * 1)  Specific Instances of Classes to Be Tested  -----------------
 * The Apache Imagine package includes a set of "parsers" for
 * reading different graphics file formats.  The package also includes
 * a general-purpose class called "Imaging" that determines
 * the format an arbitrarily specified input
 * file and internally processes it using the appropriate parser.
 *    However, unless you wish to test the performance of the Imaging
 * class itself, it is better to instantiate the proper subject-matter
 * parser explicitly in your code.  In ordinary applications, it is often
 * more convenient to use the Imaging class and let it take care
 * of the details for you.  But in that "taking care of details"
 * operation, the Imaging class loads and instantiates a large
 * number of different subject-matter parsers.  These operations take
 * time, consume memory, and will color the results of any timing
 * and memory-use measurements you perform.
 *
 * 2) Repetition -----------------------------------------
 * The example output from this program included below, shows that
 * it performs multiple image-loading operations, recording both
 * the time required for each individual load time and the overall
 * average time required for most of the load operations (times are
 * in milliseconds).
 *
 *  image size: 10000 by 10000
 *  time to load image               memory
 *  time ms      avg ms         used mb   total mb
 * 15559.150     0.000    --    384.845   397.035
 *  8544.926     0.000    --    410.981   568.723
 *  8471.012  8471.012    --    411.563   695.723
 *  8626.015  8548.513    --    384.791   397.039
 *
 * Note that in the example output, the times for the first two load
 * operations are not included in the average.  The reason for this is
 * that the first time a Java application performs some operation,
 * it is likely to take a little longer than for subsequent
 * operations due to the overhead for class loading and the
 * just-in-time (JIT) compiler.  Unless you're specifically interested
 * in measuring the cost of start-up operations, the time they take
 * will contaminate any timing values for the functions of interest.
 *    My experience under Windows is that the overhead only affects the
 * first time I load an image.  In Linux, I've noticed that it can sometimes
 * carry over into the second.  In either case, two loop iterations
 * has proven to be enough to isolate the start costs... but keep an eye
 * on the individual times to make sure nothing unwanted is happening.
 *
 * 3) Clean Up Memory Between Load Operations --------------------
 * This test application specifically invokes the garbage collection
 * method provided by the Java Runtime class.  It then executes a one-second
 * sleep operation.
 *    Recall that in Java, the JVM performs garbage collection in a
 * separate thread that runs whenever Java thinks it important to do so.
 * We want to do what we can to ensure that the garbage collection operation,
 * which consumes processor resources, doesn't do so while the application
 * is loading an image.  To that end, the application invokes
 * Runtime.gc() and then allows the JVM one second to initiate and
 * complete the garbage collection.  However, the .gc() method is, at best,
 * a "suggestion" that the JVM should run garbage collection.
 * It does not guarantee that the garbage collection will be executed and
 * completed immediately.  Thus the relatively long one-second delay
 * between loop iterations.
 *
 * ---------------------------------------------------------------------
 * Good luck in using the class for testing.
 * Feel free to modify it to suit your own requirements... Nothing
 * I've done in this code is beyond improvement.   I hope it works
 * well for you.
 *                Gary Lucas --  May 2012.
 * ---------------------------------------------------------------
 */
package org.apache.commons.imaging.examples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.formats.tiff.TiffImageParser;
import org.apache.commons.imaging.formats.tiff.TiffImagingParameters;
import org.apache.commons.lang3.ArrayUtils;

/**
 * A "test stand" for evaluating the speed an memory use of different Apache Imaging operations
 */
class ApacheImagingSpeedAndMemoryTest {

    /**
     * Create an instance of the speed and memory test class and execute a test loop for the specified file.
     *
     * @param args the path to the file to be processed
     */
    public static void main(final String[] args) {
        if (ArrayUtils.isEmpty(args)) {
            throw new IllegalArgumentException("Missing path to file to test.");
        }
        final String name = args[0];
        final ApacheImagingSpeedAndMemoryTest testStand = new ApacheImagingSpeedAndMemoryTest();
        testStand.performTest(System.out, name);
    }

    /**
     * Loads the input file multiple times, measuring the time and memory use for each iteration.
     *
     * @param fmt  a valid PrintStream for formatting the output
     * @param name the path for the input image file to be tested
     */
    private void performTest(final PrintStream fmt, final String name) {
        final File target = new File(name);
        double sumTime = 0;
        int n = 1;
        for (int i = 0; i < 10; i++) {
            try {
                ByteSource byteSource = ByteSource.file(target);
                // This test code allows you to test cases where the
                // input is processed using Apache Imaging's
                // InputStreamByteSource rather than the ByteSourceFile.
                // You might also want to experiment with ByteSourceArray.
                // FileInputStream fins = new FileInputStream(target);
                // BufferedInputStream bins = new BufferedInputStream(fins);
                // InputStreamByteSource byteSource =
                // ByteSource.inputStream(bins, target.getName());
                // ready the parser (you may modify this code block
                // to use your parser of choice)
                TiffImagingParameters params = new TiffImagingParameters();
                TiffImageParser tiffImageParser = new TiffImageParser();
                // load the file and record time needed to do so
                final long time0Nanos = System.nanoTime();
                BufferedImage bImage = tiffImageParser.getBufferedImage(byteSource, params);
                final long time1Nanos = System.nanoTime();
                // tabulate results
                final double testTime = (time1Nanos - time0Nanos) / 1000000.0;
                if (i > 1) {
                    n = i - 1;
                    sumTime += testTime;
                }
                final double avgTime = sumTime / n;
                // tabulate the memory results. Note that the
                // buffered image, the byte source, and the parser
                // are all still in scope. This approach is taken
                // to get some sense of peak memory use, but Java
                // may have already started collecting garbage,
                // so there are limits to the reliability of these
                // statistics
                final Runtime r = Runtime.getRuntime();
                final long freeMemory = r.freeMemory();
                final long totalMemory = r.totalMemory();
                final long usedMemory = totalMemory - freeMemory;
                if (i == 0) {
                    // print header info
                    fmt.format("%n");
                    fmt.format("Processing file: %s%n", target.getName());
                    fmt.format(" image size: %d by %d%n%n", bImage.getWidth(), bImage.getHeight());
                    fmt.format(" time to load image    --         memory%n");
                    fmt.format(" time ms      avg ms   --    used mb   total mb%n");
                }
                fmt.format("%9.3f %9.3f    --  %9.3f %9.3f %n", testTime, avgTime, usedMemory / (1024.0 * 1024.0), totalMemory / (1024.0 * 1024.0));
                bImage = null;
                byteSource = null;
                params = null;
                tiffImageParser = null;
            } catch (final IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
            try {
                // sleep between loop iterations allows time
                // for the JVM to clean up memory. The Netbeans IDE
                // doesn't "get" the fact that we're doing this operation
                // deliberately and is apt offer hints
                // suggesting that the code should be modified
                Runtime.getRuntime().gc();
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
                // this isn't fatal, but shouldn't happen
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}
