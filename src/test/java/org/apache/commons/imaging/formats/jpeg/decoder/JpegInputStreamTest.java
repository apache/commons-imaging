/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.imaging.formats.jpeg.decoder;

import org.apache.commons.imaging.ImageReadException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for JpegInputStream.
 */
public final class JpegInputStreamTest {
    /**
     * Reading values as long the stream wasn't closed.
     */
    @Test
    public void testReadHasNext01() {
        final JpegInputStream stream = new JpegInputStream(new int[]{ 11, 22});
        assertTrue(stream.hasNext());
        assertEquals(11, stream.read());
        assertTrue(stream.hasNext());
        assertEquals(22, stream.read());
        assertFalse(stream.hasNext());
    }
    
    /**
     * Reading values after the last value was read shall lead to an IllegalStateException.
     */
    @Test(expected=IllegalStateException.class)
    public void testReadHasNext02() {
        final JpegInputStream stream = new JpegInputStream(new int[]{});
        assertFalse(stream.hasNext());
        stream.read();
    }
    
    /**
     * Reading values as long the stream wasn't closed.
     * @throws org.apache.commons.imaging.ImageReadException
     */
    @Test
    public void testNextBit01() throws ImageReadException {
        final JpegInputStream stream = new JpegInputStream(new int[]{3});
        assertEquals(0, stream.nextBit());
        assertEquals(0, stream.nextBit());
        assertEquals(0, stream.nextBit());
        assertEquals(0, stream.nextBit());
        
        assertEquals(0, stream.nextBit());
        assertEquals(0, stream.nextBit());
        assertEquals(1, stream.nextBit());
        assertEquals(1, stream.nextBit());
    }
}