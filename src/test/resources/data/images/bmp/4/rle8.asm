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
; To generate a BMP from this, run:
; nasm -f bin /path/to/this/file.asm -o /path/to/file.bmp

; bitmap file header
db 'B','M'
dd $end ; file size
db 0,0 ; reserved
db 0,0 ; reserved
dd $pixels ; offset to pixel array

; bitmap info header
dd 40 ; header size
dd 5 ; width
dd 5 ; height
dw 1 ; planes
dw 8 ; bits
dd 1 ; compression = RLE8
dd ($end - $pixels) ; raw pixel data size
dd 0 ; horizontal resolution
dd 0 ; vertical resolution
dd 2 ; number of palette entries
dd 0 ; number of important palette entries

palette:
db 0,0,0,0 ; blue,green,red,0
db 0xff,0xff,0xff,0

pixels:
db 5,1 ; 5 ones
db 0,0 ; eol
db 0,2,0,3 ;  escape, delta, 0 right, 3 down
db 5,1 ; 5 ones
db 0,1 ; eof

end:
