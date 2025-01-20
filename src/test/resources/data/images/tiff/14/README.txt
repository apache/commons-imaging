
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ABOUT THIS DIRECTORY ----------------------------------------------------

The files in this folder provide tests for the Commons Imaging library's
ability to read TIFF files that use internal JPEG data compression.

Baseline files (non-JPEG) contain the source pixels used
to create the JPEG variations listed below.  Some of the JUnit tests
for the JPEG implementation compare the decoded JPEG files to these
original files to verify correctness of implementation.
    TestSample.tiff
    TestSample264x264.tiff
    TestSampleArgb.tiff


Files based on the YCbCR color model most commonly used for JPEG
compression.  The 264x264 variations feature partial strips or tiles
as a way of verifying correct handling of that data.

    TestJpegStrips.tiff
    TestJpegStrips264x264.tiff
    TestJpegStrips264x264BigEndian.tiff

    TestJpegTiles.tiff
    TestJpegTiles264x264.tiff
    TestJpegTiles264x264BigEndian.tiff

Files based on the CYMK model commonly used in the printing industry
    TestJpegCMYK.tiff

Files based on the RGB model which is an extension to the JPEG standard
used by TIFF.  Images of this type are relatively uncommon. They typically show up
in technical images such as full-disk satellite images.
    TestJpegStripsRgb.tiff
    TestJpegTilesRgb.tiff

RGB with alpha
    TestJpegArgb.tiff

Files that can be used for sub-image test
   TestJpegProgressive.tiff


