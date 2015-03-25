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

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the JPEG/JFIF format only.
 */
public final class ImagingParametersJpeg extends ImagingParameters {
    
    private boolean readThumbnails;
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersJpeg() {
        this.readThumbnails = false;
    }
    
    //****** readThumbnails ******
    
    /**
     * Parameter key. Indicates whether to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     * <p>
     * Default value: {@code false}
     * @return Valid values:{@code true} (causes it to read embedded thumbnails
     * and {@code false} (don't read embedded thumbnails, default value).
     */
    public boolean getReadThumbnails() {
        return this.readThumbnails;
    }
    
    /**
     * Call this method to indicate to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     * @param value {@code true} = read embedded thumbnails;
     * {@code false} = don't read embedded thumbnails
     */
    public void setReadThumbnails(final boolean value) {
        this.readThumbnails = value;
    }
}
