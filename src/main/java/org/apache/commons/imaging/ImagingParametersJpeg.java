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
 *
 * Created 2015 by Michael Gross, mgmechanics@mgmechanics.de
 * Changed 2015 by Michael Gross, mgmechanics@mgmechanics.de
 */

package org.apache.commons.imaging;

/**
 * This class is a POJO holding data for parameters as requested in IMAGING-159.
 * It holds additional data needed for the JPEG/JFIF format only.
 */
public final class ImagingParametersJpeg extends ImagingParameters {
    
    private Boolean readThumbnailsValue; // PARAM_KEY_READ_THUMBNAILS
    
    /**
     * This gives you a parameter object with default values.
     */
    public ImagingParametersJpeg() {
        this.readThumbnailsValue = Boolean.FALSE;
    }
    
    //****** readThumbnails ******
    /**
     * Parameter key. Indicates whether to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     * <p>
     * Default value: don't read embedded thumbnails
     * @return Valid values:{@code Boolean.TRUE} (causes it to read embedded thumbnails
     * and {@code Boolean.FALSE} (don't read embedded thumbnails).
     */
    public Boolean readThumbnails() {
        return this.readThumbnailsValue;
    }
    
    /**
     * Parameter key. Indicates to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     */
    public void enableReadThumbnails() {
        this.readThumbnailsValue = Boolean.TRUE;
    }
    
    /**
     * Parameter key. Indicates not to read embedded thumbnails.
     * <p>
     * Only applies to read EXIF metadata from JPEG/JFIF files.
     */
    public void disableReadThumbnails() {
        this.readThumbnailsValue = Boolean.FALSE;
    }
}
