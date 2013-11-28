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
package org.apache.commons.imaging.formats.psd;

/**
 * TODO Turn into an enum
 * 
 * @see <a href="http://www.adobe.com/devnet-apps/photoshop/fileformatashtml/#50577409_pgfId-1037727">Photoshop File Formats Specification - Image Resource IDs</a>
 */
class ImageResourceType {

    private static final ImageResourceType[] TYPES = new ImageResourceType[]{
            new ImageResourceType(1000, "Contains five 2 byte values: number of channels, rows, columns, depth, and mode."),
            new ImageResourceType(1001, "Optional. Macintosh print manager print info record."),
            new ImageResourceType(1003, "Contains the indexed color table."),
            new ImageResourceType(1005, "ResolutionInfo structure. See Appendix A in Photoshop SDK Guide.pdf."),
            new ImageResourceType(1006, "Names of the alpha channels as a series of Pascal strings."),
            new ImageResourceType(1007, "DisplayInfo structure. See Appendix A in Photoshop SDK Guide.pdf ."),
            new ImageResourceType(1008, "Optional. The caption as a Pascal string."),
            new ImageResourceType(1009, "Border information. Contains a fixed-number for the border width, and 2 bytes for border units (1=inches, 2=cm, 3=points, 4=picas, 5=columns)."),
            new ImageResourceType(1010, "Background color. See the Colors additional file information."),
            new ImageResourceType(1011, "Print flags. A series of one byte boolean values (see Page Setup dialog): labels, crop marks, color bars, registration marks, negative, flip, interpolate, caption."),
            new ImageResourceType(1012, "Grayscale and multichannel halftoning information."),
            new ImageResourceType(1013, "Color halftoning information."),
            new ImageResourceType(1014, "Duotone halftoning information."),
            new ImageResourceType(1015, "Grayscale and multichannel transfer function."),
            new ImageResourceType(1016, "Color transfer functions."),
            new ImageResourceType(1017, "Duotone transfer functions."),
            new ImageResourceType(1018, "Duotone image information."),
            new ImageResourceType(1019, "Two bytes for the effective black and white values for the dot range."),
            new ImageResourceType(1020, "Obsolete."),
            new ImageResourceType(1021, "EPS options."),
            new ImageResourceType(1022, "Quick Mask information. 2 bytes containing Quick Mask channel ID, 1 byte boolean indicating whether the mask was initially empty."),
            new ImageResourceType(1023, "Obsolete."),
            new ImageResourceType(1024, "Layer state information. 2 bytes containing the index of target layer. 0=bottom layer."),
            new ImageResourceType(1025, "Working path (not saved). See path resource format later in this chapter."),
            new ImageResourceType(1026, "Layers group information. 2 bytes per layer containing a group ID for the dragging groups. Layers in a group have the same group ID."),
            new ImageResourceType(1027, "Obsolete."),
            new ImageResourceType(1028, "IPTC-NAA record. This contains the File Info... information. See the IIMV4.pdf document."),
            new ImageResourceType(1029, "Image mode for raw format files."),
            new ImageResourceType(1030, "JPEG quality. Private."),
            new ImageResourceType(1032, "Grid and guides information. See grid and guides resource format later in this chapter."),
            new ImageResourceType(1033, "Thumbnail resource. See thumbnail resource format later in this chapter."),
            new ImageResourceType(1034, "Copyright flag. Boolean indicating whether image is copyrighted. Can be set via Property suite or by user in File Info..."),
            new ImageResourceType(1035, "URL. Handle of a text string with uniform resource locator. Can be set via Property suite or by user in File Info..."),
            new ImageResourceType(1036, "Thumbnail resource. See thumbnail resource format later in this chapter."),
            new ImageResourceType(1037, "Global Angle. 4 bytes that contain an integer between 0..359 which is the global lighting angle for effects layer. If not present assumes 30."),
            new ImageResourceType(1038, "Color samplers resource. See color samplers resource format later in this chapter."),
            new ImageResourceType(1039, "ICC Profile. The raw bytes of an ICC format profile, see the ICC34.pdf and ICC34.h files from the Internation Color Consortium located in the documentation section."),
            new ImageResourceType(1040, "One byte for Watermark."),
            new ImageResourceType(1041, "ICC Untagged. 1 byte that disables any assumed profile handling when opening the file. 1 = intentionally untagged."),
            new ImageResourceType(1042, "Effects visible. 1 byte global flag to show/hide all the effects layer. Only present when they are hidden."),
            new ImageResourceType(1043, "Spot Halftone. 4 bytes for version, 4 bytes for length, and the variable length data."),
            new ImageResourceType(1044, "Document specific IDs, layer IDs will be generated starting at this base value or a greater value if we find existing IDs to already exceed it. It's purpose is to avoid the case where we add layers, flatten, save, open, and then add more layers that end up with the same IDs as the first set. 4 bytes."),
            new ImageResourceType(1045, "Unicode Alpha Names. 4 bytes for length and the string as a unicode string."),
            new ImageResourceType(1046, "Indexed Color Table Count. 2 bytes for the number of colors in table that are actually defined"),
            new ImageResourceType(1047, "Tansparent Index. 2 bytes for the index of transparent color, if any."),
            new ImageResourceType(1049, "Global Altitude. 4 byte entry for altitude"),
            new ImageResourceType(1050, "Slices. See description later in this chapter"),
            new ImageResourceType(1051, "Workflow URL. Unicode string, 4 bytes of length followed by unicode string."),
            new ImageResourceType(1052, "Jump To XPEP. 2 bytes major version, 2 bytes minor version, 4 bytes count. Following is repeated for count: 4 bytes block size, 4 bytes key, if key = 'jtDd' then next is a Boolean for the dirty flag otherwise it's a 4 byte entry for the mod date."),
            new ImageResourceType(1053, "Alpha Identifiers. 4 bytes of length, followed by 4 bytes each for every alpha identifier."),
            new ImageResourceType(1054, "URL List. 4 byte count of URLs, followed by 4 byte long, 4 byte ID, and unicode string for each count."),
            new ImageResourceType(1057, "Version Info. 4 byte version, 1 byte HasRealMergedData, unicode string of writer name, unicode string of reader name, 4 bytes of file version."),
            new ImageResourceType(1058, "EXIF data 1"),
            new ImageResourceType(1059, "EXIF data 3"),
            new ImageResourceType(1060, "XMP metadata"),
            new ImageResourceType(1061, "Caption digest. 16 bytes: RSA Data Security, MD5 message-digest algorithm"),
            new ImageResourceType(1062,"Print scale"),
            new ImageResourceType(1064,"Pixel Aspect Ratio"),
            new ImageResourceType(1065,"Layer Comps"),
            new ImageResourceType(1066,"Alternate Duotone Colors"),
            new ImageResourceType(1067,"Alternate Spot Colors"),
            new ImageResourceType(1069,"Layer Selection ID(s)"),
            new ImageResourceType(1070,"HDR Toning information"),
            new ImageResourceType(1071,"Print info"),
            new ImageResourceType(1072,"Layer Group(s) Enabled ID"),
            new ImageResourceType(1073,"Color samplers resource"),
            new ImageResourceType(1074,"Measurement Scale"),
            new ImageResourceType(1075,"Timeline Information"),
            new ImageResourceType(1076,"Sheet Disclosure"),
            new ImageResourceType(1077,"DisplayInfo structure to support floating point clors"),
            new ImageResourceType(1078,"Onion Skins"),
            new ImageResourceType(1080,"Count Information. Information about the count in the document."),
            new ImageResourceType(1082,"Print Information. Information about the current print settings in the document. The color management options."),
            new ImageResourceType(1083,"Print Style. Information about the current print style in the document. The printing marks, labels, ornaments, etc."),
            new ImageResourceType(1084,"Macintosh NSPrintInfo. Variable OS specific info for Macintosh. NSPrintInfo."),
            new ImageResourceType(1085,"Windows DEVMODE. Variable OS specific info for Windows. DEVMODE."),
            new ImageResourceType(1086,"Auto Save File Path"),
            new ImageResourceType(1087,"Auto Save Format"),
            new ImageResourceType(1088, "Path Selection State. Information about the current path selection state"),
            new ImageResourceType(2000, 2998, "Path Information (saved paths). See path resource format later in this chapter."),
            new ImageResourceType(2999, "Name of clipping path. See path resource format later in this chapter."),
            new ImageResourceType(3000, "Origin Path Info"),
            new ImageResourceType(4000, 4999, "Plug-In resource(s). Resources added by a plug-in"),
            new ImageResourceType(7000, "Image Ready variables. XML representation of variables definition"),
            new ImageResourceType(7001, "Image Ready data sets"),
            new ImageResourceType(8000, "Lightroom workflow, if present the document is in the middle of a Lightroom workflow"),
            new ImageResourceType(10000, "Print flags information. 2 bytes version (=1), 1 byte center crop marks, 1 byte (=0), 4 bytes bleed width value, 2 bytes bleed width scale."),};

    public static String getDescription(final int id) {
        for (ImageResourceType type : TYPES) {
            if (type.from <= id && id <= type.to) {
                return type.description;
            }
        }
        return "Unknown";
    }

    public final int from;
    public final int to;

    public final String description;

    public ImageResourceType(int id, String description) {
        this.from = id;
        this.to = id;
        this.description = description;
    }

    public ImageResourceType(int id, int id2, String description) {
        this.from = id;
        this.to = id2;
        this.description = description;
    }
}
