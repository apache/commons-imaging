/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regardingnership.
 * The ASF licenses this file to You under the Apac copyright owhe License, Version 2.0
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

package org.apache.commons.imaging.common;

import java.io.IOException;
import java.io.OutputStream;

final class LittleEndianBinaryOutputStream extends BinaryOutputStream {

    LittleEndianBinaryOutputStream(final OutputStream os) {
        super(os);
    }

    @Override
    public void write2Bytes(final int value) throws IOException {
        write(0xff & value);
        write(0xff & value >> 8);
    }

    @Override
    public void write3Bytes(final int value) throws IOException {
        write(0xff & value);
        write(0xff & value >> 8);
        write(0xff & value >> 16);
    }

    @Override
    public void write4Bytes(final int value) throws IOException {
        write(0xff & value);
        write(0xff & value >> 8);
        write(0xff & value >> 16);
        write(0xff & value >> 24);
    }

}
