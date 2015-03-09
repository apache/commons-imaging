/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.apache.commons.imaging.common;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Some tests for functions in BinaryFunctions.
 */
public final class BinaryFunctionsTest {
    /**
     * It should copy the values of an array from one position ("from") to another position ("to").
     */
    @Test
    public void testCopyArray01() {
        final int[] original = new int[]{ 11, 12, 13, 14, 15 };
        final int from = 1;
        final int to = 4;
        assertArrayEquals(new int[]{ 12, 13, 14}, BinaryFunctions.copyArray(original, from, to));
    }
    
    /**
     * It should copy only one value of an array if the start position ("from") is
     * equal to the end position ("to") - 1.
     */
    @Test
    public void testCopyArray02() {
        final int[] original = new int[]{ 11, 12, 13, 14, 15 };
        final int from = 3;
        final int to = 4;
        assertArrayEquals(new int[]{14}, BinaryFunctions.copyArray(original, from, to));
    }
    
    /**
     * It should return an empty array if the start position ("from") is
     * equal to the end position ("to").
     */
    @Test
    public void testCopyArray03() {
        final int[] original = new int[]{ 11, 12, 13, 14, 15 };
        final int from = 3;
        final int to = 3;
        assertArrayEquals(new int[]{}, BinaryFunctions.copyArray(original, from, to));
    }
    
    /**
     * It should throw an IllegalArgumentException if the start position ("from") is
     * greater than the end position ("to").
     */
    @Test(expected=IllegalArgumentException.class)
    public void testCopyArray11() {
        final int[] original = new int[]{ 11, 12, 13, 14, 15 };
        final int from = 2;
        final int to = 1;
        BinaryFunctions.copyArray(original, from, to);
    }
}