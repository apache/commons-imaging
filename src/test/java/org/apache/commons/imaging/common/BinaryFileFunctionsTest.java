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

import java.nio.ByteOrder;

import org.apache.commons.imaging.ImagingTest;

public class BinaryFileFunctionsTest extends ImagingTest {
    public void testFloatToByteConversion() {
        final byte[] bytesLE = ByteConversions.toBytes(1.0f, ByteOrder.LITTLE_ENDIAN);
        assertEquals(ByteConversions.toFloat(bytesLE, ByteOrder.LITTLE_ENDIAN), 1.0f, 0f);

        final byte[] bytesBE = ByteConversions.toBytes(1.0f, ByteOrder.BIG_ENDIAN);
        assertEquals(ByteConversions.toFloat(bytesBE, ByteOrder.BIG_ENDIAN), 1.0f, 0f);
    }

    public void testDoubleToByteConversion() {
        final byte[] bytesLE = ByteConversions.toBytes(1.0, ByteOrder.LITTLE_ENDIAN);
        assertEquals(ByteConversions.toDouble(bytesLE, ByteOrder.LITTLE_ENDIAN), 1.0, 0);

        final byte[] bytesBE = ByteConversions.toBytes(1.0, ByteOrder.BIG_ENDIAN);
        assertEquals(ByteConversions.toDouble(bytesBE, ByteOrder.BIG_ENDIAN), 1.0, 0);
    }
}
