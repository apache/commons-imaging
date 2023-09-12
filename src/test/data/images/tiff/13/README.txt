 
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
This directory includes sample files for testing implementations that
read the BigTIFF file format. BigTIFF is an extension of the original
TIFF file format. The original specification used 32 bit integers to address
file positions and, thus, was limited to a 2 gigabyte file size. The BigTIFF
format uses 64 bit file addressing to support files potentially as
large as 18 exabytes.

The files in this directory are used with permission from Joris Van Damme.
They were downloaded form his AWare Systems website at https://www.awaresystems.be/index.html
The maintainers of the Commons Imaging library gratefully acknowledge Mr. Van Damme's
efforts in providing a comprehensive collection of sample images.  The availability
of these images greatly accelerated the development of support for the BigTIFF format. 

The content of this directory is as follows:

Classic.tif  A 32-bit TIFF file used to provide a test image.

BigTIFF.tif           Strip offsets and lengths specified as type short (2 bytes), little endian
BigTIFFMotorola.tif   Strip offsets and lengths specified as type short (2 bytes), big endian

BigTIFFLong.tif       Strip offsets and lengths specified as type long (4 bytes), little endian
BigTIFFLong8.tif      Strip offsets and lengths specified as type long8 (7 bytes), little endian

