; Licensed to the Apache Software Foundation (ASF) under one
; or more contributor license agreements.  See the NOTICE file
; distributed with this work for additional information
; regarding copyright ownership.  The ASF licenses this file
; to you under the Apache License, Version 2.0 (the
; "License"); you may not use this file except in compliance
; with the License.  You may obtain a copy of the License at
;
;    http://www.apache.org/licenses/LICENSE-2.0
;
; Unless required by applicable law or agreed to in writing,
; software distributed under the License is distributed on an
; "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
; KIND, either express or implied.  See the License for the
; specific language governing permissions and limitations
; under the License.


; Assemblers are the perfect tool for generating
; custom test images as they let us insert offsets
; to unknown locations easily and totally
; customize the file byte-by-byte.
;
; To generate a TIFF from this, run:
; nasm -f bin /path/to/this/file.asm -o /path/to/file.tiff

; TIFF header
db 0x49,0x49
db 0x2a, 0x00
db 0x08, 0x00, 0x00, 0x00

; Number of directory entries
dw 10

; entry 0: tag, type, count, value
dw 0x0100 ; tag = image width
dw 3 ; type = short
dd 1 ; length = 1
dd 2 ; value = 2

; entry 1
dw 0x0101 ; tag = image length
dw 3 ; type = short
dd 1 ; length = 1
dd 2 ; value = 2

; entry 2
dw 0x0103 ; tag = compression
dw 3
dd 1
dd 1 ; no compression, but pack bits tightly

; entry 3
dw 0x0106 ; tag = PhotometricInterpretation
dw 3
dd 1
dd 1 ; black is zero

; entry 4
dw 0x0111 ; tag = StripOffsets
dw 4 ; type = long
dd 1
dd $imageStrip1

; entry 5
dw 0x0117 ; tag = StripByteCounts
dw 4 ; type = long
dd 1
dd 2

; entry 6
dw 0x0116 ; tag = RowsPerStrip
dw 4 ; type = long
dd 1
dd 2

; entry 7
dw 0x0110 ; tag = Model
dw 2 ; type = ASCII
dd 10
dd 0x1fffffff ; outside file's bounds

; entry 8
dw 0x010f ; tag = Make
dw 2 ; type = ASCII
dd 50000 ; count - ridiculously high
dd 0

; entry 9
dw 0x0132 ; tag = DateTime
dw 2 ; type = ASCII
dd 0xffffffce ; a huge, invalid length
dd $dateTimeValue

; offset to next directory - corrupt
dd 0xffffffce ; -50

; values that couldn't fit:
dateTimeValue:
dw '2011-12-07 00:00:00'

; image data
imageStrip1:
db 0x80, 0x40

