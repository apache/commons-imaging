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

import org.apache.commons.imaging.ImagingTest;
import org.apache.commons.imaging.common.BinaryFileFunctions;

public class BinaryFileFunctionsTest extends ImagingTest {
    // Work around that pesky "protected"...
    private static class Extender extends BinaryFileFunctions {
        public void testFloatToByteConversion() {
            byte[] bytesLE = convertFloatToByteArray(1.0f,
                    ByteOrder.LITTLE_ENDIAN);
            assertEquals(
                    convertByteArrayToFloat("bytes", bytesLE,
                            ByteOrder.LITTLE_ENDIAN), 1.0f, 0f);

            byte[] bytesBE = convertFloatToByteArray(1.0f,
                    ByteOrder.BIG_ENDIAN);
            assertEquals(
                    convertByteArrayToFloat("bytes", bytesBE,
                            ByteOrder.BIG_ENDIAN), 1.0f, 0f);
        }

        public void testDoubleToByteConversion() {
            byte[] bytesLE = BinaryConversions.toBytes(1.0,
                    ByteOrder.LITTLE_ENDIAN);
            assertEquals(
                    convertByteArrayToDouble("bytes", bytesLE,
                            ByteOrder.LITTLE_ENDIAN), 1.0, 0);

            byte[] bytesBE = BinaryConversions.toBytes(1.0,
                    ByteOrder.BIG_ENDIAN);
            assertEquals(
                    convertByteArrayToDouble("bytes", bytesBE,
                            ByteOrder.BIG_ENDIAN), 1.0, 0);
        }
    }

    private Extender extender = new Extender();

    public void testFloatToByteConversion() {
        extender.testFloatToByteConversion();
    }

    public void testDoubleToByteConversion() {
        extender.testDoubleToByteConversion();
    }
}
