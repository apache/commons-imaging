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

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests static methods of JpegDecoder regarding RST markers.
 */
public final class JpegDecoderTest {
    /**
     * If there are RST markers available then it should return the positions
     * where each interval starts.
     */
    @Test
    public void testGetIntervalStartPositions01() {
        // RST markers are _between_ intervals!
        final int[] data = new int[]{
            // 0                 3                 6                 9
            0x01, 0xFF, 0xD0, 0x02, 0xFF, 0xD1, 0x03, 0xFF, 0xD2, 0x04, 0xFF, 0xD3,
            //12                15                18                21                24
            0x05, 0xFF, 0xD4, 0x06, 0xFF, 0xD5, 0x07, 0xFF, 0xD6, 0x08, 0xFF, 0xD7, 0x09
        };
        final List<Integer> expectedPositions = Arrays.asList(0, 3, 6, 9, 12, 15, 18, 21, 24);
        assertEquals(expectedPositions, JpegDecoder.getIntervalStartPositions(data));
    }
    
    /**
     * If there are no RST markers available then it should return only the position 0.
     */
    @Test
    public void testGetIntervalStartPositions02() {
        final int[] data = new int[]{
            0x01, 0xD0, 0x02, 0xD1, 0x03, 0xD2, 0x04, 0xD3,
            0x05, 0xD4, 0x06, 0xD5, 0x07, 0xD6, 0x08, 0xD7, 0x09
        };
        final List<Integer> expectedPositions = Arrays.asList(0);
        assertEquals(expectedPositions, JpegDecoder.getIntervalStartPositions(data));
    }
    
    /**
     * If there are RST markers available then it should return an array containing
     * more than one JpegInputStream. Each JpegInputStream shall provide the
     * bytes before the next RST marker.
     */
    @Test
    public void testSplitByRstMarkers01() {
        // RST markers are _between_ intervals!
        final int[] data = new int[]{
            // 0                 3                 6                 9
            0x01, 0xFF, 0xD0, 0x02, 0xFF, 0xD1, 0x03, 0xFF, 0xD2, 0x04, 0xFF, 0xD3,
            //12                15                18                21                24
            0x05, 0xFF, 0xD4, 0x06, 0xFF, 0xD5, 0x07, 0xFF, 0xD6, 0x08, 0xFF, 0xD7, 0x09
        };
        final JpegInputStream[] streams = JpegDecoder.splitByRstMarkers(data);
        assertEquals(9, streams.length);
        assertEquals(1, streams[0].read());
        assertEquals(2, streams[1].read());
        assertEquals(3, streams[2].read());
        assertEquals(4, streams[3].read());
        
        assertEquals(5, streams[4].read());
        assertEquals(6, streams[5].read());
        assertEquals(7, streams[6].read());
        assertEquals(8, streams[7].read());
        
        assertEquals(9, streams[8].read());
    }
    
    /**
     * If there are no RST markers available then it should just return an array containing
     * exact one JpegInputStream. This JpegInputStream shall provide all values of provided array.
     */
    @Test
    public void testSplitByRstMarkers02() {
        final int[] data = new int[]{
            0x01, 0xD0, 0x02, 0xD1, 0x03, 0xD2, 0x04, 0xD3,
            0x05, 0xD4, 0x06, 0xD5, 0x07, 0xD6, 0x08, 0xD7, 0x09
        };
        final JpegInputStream[] streams = JpegDecoder.splitByRstMarkers(data);
        assertEquals(1, streams.length);
        assertEquals(1, streams[0].read());
        assertEquals(208, streams[0].read());
        
        assertEquals(2, streams[0].read());
        assertEquals(209, streams[0].read());
        
        assertEquals(3, streams[0].read());
        assertEquals(210, streams[0].read());
        
        assertEquals(4, streams[0].read());
        assertEquals(211, streams[0].read());
        
        assertEquals(5, streams[0].read());
        assertEquals(212, streams[0].read());
        
        assertEquals(6, streams[0].read());
        assertEquals(213, streams[0].read());
        
        assertEquals(7, streams[0].read());
        assertEquals(214, streams[0].read());
        
        assertEquals(8, streams[0].read());
        assertEquals(215, streams[0].read());
        
        assertEquals(9, streams[0].read());
    }
}