; Licensed to the Apache Software Foundation (ASF) under one
; or more contributor license agreements.  See the NOTICE file
; distributed with this work for additional information
; regarding copyright ownership.  The ASF licenses this file
; to you under the Apache License, Version 2.0 (the
; "License"); you may not use this file except in compliance
; with the License.  You may obtain a copy of the License at
;
;    https://www.apache.org/licenses/LICENSE-2.0
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
; To generate the binary file from this, run:
; nasm -f bin /path/to/this/file.asm -o /path/to/file.ext

db 'P7',10
db 'WIDTH 5',10
db 'HEIGHT 5',10
db 'DEPTH 1',10
db 'MAXVAL 1',10
db 'TUPLTYPE BLACKANDWHITE',10
db 'ENDHDR',10
db 0,1,0,1,0
db 1,0,1,0,1
db 0,1,0,1,0
db 1,0,1,0,1
db 0,1,0,1,0
