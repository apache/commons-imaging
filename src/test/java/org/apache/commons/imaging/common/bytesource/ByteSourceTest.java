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

package org.apache.commons.imaging.common.bytesource;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.imaging.ImagingTest;

public abstract class ByteSourceTest extends ImagingTest {
    protected File createTempFile(byte src[]) throws IOException {
        File file = createTempFile("raw_", ".bin");

        // write test bytes to file.
        OutputStream os = new FileOutputStream(file);
        os = new BufferedOutputStream(os);
        os.write(src);
        os.close();

        // test that all bytes written to file.
        assertTrue(src.length == file.length());

        return file;
    }

    protected byte[][] getTestByteArrays() {
        byte emptyArray[] = (new byte[0]);

        byte single[] = new byte[1];
        for (int i = 0; i < single.length; i++)
            single[i] = (byte) i;

        byte simple[] = new byte[256];
        for (int i = 0; i < simple.length; i++)
            simple[i] = (byte) i;

        byte zeroes[] = new byte[256];
        for (int i = 0; i < zeroes.length; i++)
            zeroes[i] = 0;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int i = 0; i < 256 * 256; i++) {
            baos.write(0xff & i);
            baos.write(0xff & (i >> 8));
        }
        byte longArray[] = (baos.toByteArray());

        return new byte[][] { emptyArray, single, simple, zeroes, longArray, };
    }
}
