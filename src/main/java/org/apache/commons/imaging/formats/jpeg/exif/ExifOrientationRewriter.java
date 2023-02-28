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

package org.apache.commons.imaging.formats.jpeg.exif;

import java.io.File;
import java.io.OutputStream;

import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;


public class ExifOrientationRewriter {

    public static enum Orientation {
        HORIZONTAL((short)1),
        MIRROR_HORIZONTAL((short)2),
        ROTATE_180((short)3),
        MIRROR_VERTICAL((short)4),
        MIRROR_HORIZONTAL_AND_ROTATE_270((short)5),
        ROTATE_90((short)6),
        MIRROR_HORIZONTAL_AND_ROTATE_90((short)7),
        ROTATE_270((short)8);

        private short val;
 
        Orientation(short orVal) {
            this.val = orVal;
        }
     
        public short getVal() {
            return val;
        }
    }

    private ByteSource fileSrc;

    public ExifOrientationRewriter(File imageFile) {
        fileSrc = new ByteSourceFile(imageFile);
    }
    public ExifOrientationRewriter(byte[] byteArray) {
        fileSrc = new ByteSourceArray(byteArray);
    }
    public ExifOrientationRewriter(ByteSource byteSource) {
        fileSrc = byteSource;
    }

    public Orientation GetExifOrientation() {
        return Orientation.HORIZONTAL;
    }

    public void SetExifOrientation(Orientation orientation) {

    }

}
