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

package org.apache.commons.imaging;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for ImagingParameters.
 */
public final class ImagingParametersTest {
    /**
     * Asserts that an exception is thrown if the provided value is null.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testCheckIfValueIsNull01() {
        ImagingParameters ip = new ImagingParameters();
        ip.setFileNameHint(null);
    }
    
    /**
     * Test if the exception thrown if the provided value is null
     * provides the parameter name.
     */
    @Test
    public void testCheckIfValueIsNull02() {
        ImagingParameters ip = new ImagingParameters();
        try {
            ip.setFileNameHint(null);
        }
        catch (IllegalArgumentException ex) {
            assertEquals("The value for the parameter fileNameHint must not null.", ex.getLocalizedMessage());
        }
    }
    
    /**
     * Asserts that no exception is thrown if the provided value is not null.
     */
    @Test
    public void testCheckIfValueIsNull03() {
        ImagingParameters ip = new ImagingParameters();
        ip.setFileNameHint("Teststring");
        assertEquals("Teststring", ip.getFileNameHint());
    }
    
    /**
     * Asserts that an exception is thrown if the parameter is accessed before a value was provided.
     */
    @Test(expected=IllegalStateException.class)
    public void testCheckIfParameterIsPresent01() {
        ImagingParameters ip = new ImagingParameters();
        ip.getFileNameHint();
    }
    
    /**
     * Asserts that no exception is thrown if the parameter is accessed after a value was provided.
     */
    @Test
    public void testCheckIfParameterIsPresent02() {
        ImagingParameters ip = new ImagingParameters();
        ip.setFileNameHint("Teststring");
        assertEquals("Teststring", ip.getFileNameHint());
    }
}