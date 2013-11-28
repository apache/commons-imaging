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
            new ImageResourceType(1000, "Number of channels, rows, columns, depth, and mode."),
            new ImageResourceType(1001, "Optional. Macintosh print manager print info record"),
            new ImageResourceType(1003, "Indexed color table."),
            new ImageResourceType(1005, "ResolutionInfo structure"),
            new ImageResourceType(1006, "Names of the alpha channels as a series of Pascal strings."),
            new ImageResourceType(1007, "DisplayInfo structure"),
            new ImageResourceType(1008, "Optional. The caption as a Pascal string."),
            new ImageResourceType(1009, "Border information"),
            new ImageResourceType(1010, "Background color"),
            new ImageResourceType(1011, "Print flags (labels, crop marks, color bars, registration marks, negative, flip, interpolate, caption)"),
            new ImageResourceType(1012, "Grayscale and multichannel halftoning information."),
            new ImageResourceType(1013, "Color halftoning information"),
            new ImageResourceType(1014, "Duotone halftoning information"),
            new ImageResourceType(1015, "Grayscale and multichannel transfer function"),
            new ImageResourceType(1016, "Color transfer functions"),
            new ImageResourceType(1017, "Duotone transfer functions"),
            new ImageResourceType(1018, "Duotone image information"),
            new ImageResourceType(1019, "Effective black and white values for the dot range."),
            new ImageResourceType(1020, "Obsolete"),
            new ImageResourceType(1021, "EPS options"),
            new ImageResourceType(1022, "Quick Mask information"),
            new ImageResourceType(1023, "Obsolete"),
            new ImageResourceType(1024, "Layer state information"),
            new ImageResourceType(1025, "Working path (not saved)"),
            new ImageResourceType(1026, "Layers group information"),
            new ImageResourceType(1027, "Obsolete"),
            new ImageResourceType(1028, "IPTC-NAA record"),
            new ImageResourceType(1029, "Image mode for raw format files"),
            new ImageResourceType(1030, "JPEG quality"),
            new ImageResourceType(1032, "Grid and guides information"),
            new ImageResourceType(1033, "Thumbnail resource"),
            new ImageResourceType(1034, "Copyright flag"),
            new ImageResourceType(1035, "URL"),
            new ImageResourceType(1036, "Thumbnail resource"),
            new ImageResourceType(1037, "Global lighting angle for effects layer"),
            new ImageResourceType(1038, "Color samplers resource"),
            new ImageResourceType(1039, "ICC Profile"),
            new ImageResourceType(1040, "Watermark"),
            new ImageResourceType(1041, "ICC Untagged. Disables any assumed profile handling when opening the file"),
            new ImageResourceType(1042, "Effects visible. global flag to show/hide all the effects layer. Only present when they are hidden."),
            new ImageResourceType(1043, "Spot Halftone"),
            new ImageResourceType(1044, "Document specific IDs"),
            new ImageResourceType(1045, "Unicode Alpha Names"),
            new ImageResourceType(1046, "Indexed Color Table Count. Number of colors in table that are actually defined"),
            new ImageResourceType(1047, "Transparency Index. Index of transparent color, if any"),
            new ImageResourceType(1049, "Global Altitude"),
            new ImageResourceType(1050, "Slices"),
            new ImageResourceType(1051, "Workflow URL"),
            new ImageResourceType(1052, "Jump To XPEP"),
            new ImageResourceType(1053, "Alpha Identifiers"),
            new ImageResourceType(1054, "URL List"),
            new ImageResourceType(1057, "Version Info"),
            new ImageResourceType(1058, "EXIF data 1"),
            new ImageResourceType(1059, "EXIF data 3"),
            new ImageResourceType(1060, "XMP metadata"),
            new ImageResourceType(1061, "Caption digest"),
            new ImageResourceType(1062, "Print scale"),
            new ImageResourceType(1064, "Pixel Aspect Ratio"),
            new ImageResourceType(1065, "Layer Comps"),
            new ImageResourceType(1066, "Alternate Duotone Colors"),
            new ImageResourceType(1067, "Alternate Spot Colors"),
            new ImageResourceType(1069, "Layer Selection ID(s)"),
            new ImageResourceType(1070, "HDR Toning information"),
            new ImageResourceType(1071, "Print info"),
            new ImageResourceType(1072, "Layer Group(s) Enabled ID"),
            new ImageResourceType(1073, "Color samplers resource"),
            new ImageResourceType(1074, "Measurement Scale"),
            new ImageResourceType(1075, "Timeline Information"),
            new ImageResourceType(1076, "Sheet Disclosure"),
            new ImageResourceType(1077, "DisplayInfo structure to support floating point colors"),
            new ImageResourceType(1078, "Onion Skins"),
            new ImageResourceType(1080, "Count Information. Information about the count in the document."),
            new ImageResourceType(1082, "Print Information. Information about the current print settings in the document. The color management options."),
            new ImageResourceType(1083, "Print Style. Information about the current print style in the document. The printing marks, labels, ornaments, etc."),
            new ImageResourceType(1084, "Macintosh NSPrintInfo. Variable OS specific info for Macintosh. NSPrintInfo."),
            new ImageResourceType(1085, "Windows DEVMODE. Variable OS specific info for Windows. DEVMODE."),
            new ImageResourceType(1086, "Auto Save File Path"),
            new ImageResourceType(1087, "Auto Save Format"),
            new ImageResourceType(1088, "Path Selection State. Information about the current path selection state"),
            new ImageResourceType(2000, 2998, "Path Information (saved paths)."),
            new ImageResourceType(2999, "Name of clipping path"),
            new ImageResourceType(3000, "Origin Path Info"),
            new ImageResourceType(4000, 4999, "Plug-In resource(s). Resources added by a plug-in"),
            new ImageResourceType(7000, "Image Ready variables. XML representation of variables definition"),
            new ImageResourceType(7001, "Image Ready data sets"),
            new ImageResourceType(8000, "Lightroom workflow, if present the document is in the middle of a Lightroom workflow"),
            new ImageResourceType(10000, "Print flags information (center crop marks, bleed width value, bleed width scale)")
    };

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
