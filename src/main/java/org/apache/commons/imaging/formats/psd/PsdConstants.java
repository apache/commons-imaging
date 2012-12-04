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

import org.apache.commons.imaging.util.Debug;

public class PsdConstants {
    static final ImageResourceType fImageResourceTypes[];

    public String getDescription(int id) {
        for (ImageResourceType fImageResourceType : fImageResourceTypes) {
            if (fImageResourceType.ID == id) {
                return fImageResourceType.Description;
            }
        }
        return "Unknown";
    }

    static {
        ImageResourceType temp[] = null;

        try {
            temp = new ImageResourceType[] {
                    new ImageResourceType(
                            0x03E8,
                            1000,
                            " Contains five 2 byte values: number of channels, rows, columns, depth, and mode."),
                    new ImageResourceType(0x03E9, 1001,
                            "Optional. Macintosh print manager print info record."),
                    new ImageResourceType(0x03EB, 1003,
                            " Contains the indexed color table."),
                    new ImageResourceType(0x03ED, 1005,
                            "ResolutionInfo structure. See Appendix A in Photoshop SDK Guide.pdf."),
                    new ImageResourceType(0x03EE, 1006,
                            "Names of the alpha channels as a series of Pascal strings."),
                    new ImageResourceType(0x03EF, 1007,
                            "DisplayInfo structure. See Appendix A in Photoshop SDK Guide.pdf ."),
                    new ImageResourceType(0x03F0, 1008,
                            "Optional. The caption as a Pascal string."),
                    new ImageResourceType(
                            0x03F1,
                            1009,
                            "Border information. Contains a fixed-number for the border width, and 2 bytes for border units (1=inches, 2=cm, 3=points, 4=picas, 5=columns)."),
                    new ImageResourceType(0x03F2, 1010,
                            "Background color. See the Colors additional file information."),
                    new ImageResourceType(
                            0x03F3,
                            1011,
                            "Print flags. A series of one byte boolean values (see Page Setup dialog): labels, crop marks, color bars, registration marks, negative, flip, interpolate, caption."),
                    new ImageResourceType(0x03F4, 1012,
                            "Grayscale and multichannel halftoning information."),
                    new ImageResourceType(0x03F5, 1013,
                            "Color halftoning information."),
                    new ImageResourceType(0x03F6, 1014,
                            "Duotone halftoning information."),
                    new ImageResourceType(0x03F7, 1015,
                            "Grayscale and multichannel transfer function."),
                    new ImageResourceType(0x03F8, 1016,
                            "Color transfer functions."),
                    new ImageResourceType(0x03F9, 1017,
                            "Duotone transfer functions."),
                    new ImageResourceType(0x03FA, 1018,
                            "Duotone image information."),
                    new ImageResourceType(0x03FB, 1019,
                            "Two bytes for the effective black and white values for the dot range."),
                    new ImageResourceType(0x03FC, 1020, "Obsolete."),
                    new ImageResourceType(0x03FD, 1021, "EPS options."),
                    new ImageResourceType(
                            0x03FE,
                            1022,
                            "Quick Mask information. 2 bytes containing Quick Mask channel ID, 1 byte boolean indicating whether the mask was initially empty."),
                    new ImageResourceType(0x03FF, 1023, "Obsolete."),
                    new ImageResourceType(
                            0x0400,
                            1024,
                            "Layer state information. 2 bytes containing the index of target layer. 0=bottom layer."),
                    new ImageResourceType(0x0401, 1025,
                            "Working path (not saved). See path resource format later in this chapter."),
                    new ImageResourceType(
                            0x0402,
                            1026,
                            "Layers group information. 2 bytes per layer containing a group ID for the dragging groups. Layers in a group have the same group ID."),
                    new ImageResourceType(0x0403, 1027, "Obsolete."),
                    new ImageResourceType(
                            0x0404,
                            1028,
                            "IPTC-NAA record. This contains the File Info... information. See the IIMV4.pdf document."),
                    new ImageResourceType(0x0405, 1029,
                            "Image mode for raw format files."),
                    new ImageResourceType(0x0406, 1030,
                            "JPEG quality. Private."),
                    new ImageResourceType(
                            0x0408,
                            1032,
                            "Grid and guides information. See grid and guides resource format later in this chapter."),
                    new ImageResourceType(0x0409, 1033,
                            "Thumbnail resource. See thumbnail resource format later in this chapter."),
                    new ImageResourceType(
                            0x040A,
                            1034,
                            "Copyright flag. Boolean indicating whether image is copyrighted. Can be set via Property suite or by user in File Info..."),
                    new ImageResourceType(
                            0x040B,
                            1035,
                            "URL. Handle of a text string with uniform resource locator. Can be set via Property suite or by user in File Info..."),
                    new ImageResourceType(0x040C, 1036,
                            "Thumbnail resource. See thumbnail resource format later in this chapter."),
                    new ImageResourceType(
                            0x040D,
                            1037,
                            "Global Angle. 4 bytes that contain an integer between 0..359 which is the global lighting angle for effects layer. If not present assumes 30."),
                    new ImageResourceType(
                            0x040E,
                            1038,
                            "Color samplers resource. See color samplers resource format later in this chapter."),
                    new ImageResourceType(
                            0x040F,
                            1039,
                            "ICC Profile. The raw bytes of an ICC format profile, see the ICC34.pdf and ICC34.h files from the Internation Color Consortium located in the documentation section."),
                    new ImageResourceType(0x0410, 1040,
                            "One byte for Watermark."),
                    new ImageResourceType(
                            0x0411,
                            1041,
                            "ICC Untagged. 1 byte that disables any assumed profile handling when opening the file. 1 = intentionally untagged."),
                    new ImageResourceType(
                            0x0412,
                            1042,
                            "Effects visible. 1 byte global flag to show/hide all the effects layer. Only present when they are hidden."),
                    new ImageResourceType(
                            0x0413,
                            1043,
                            "Spot Halftone. 4 bytes for version, 4 bytes for length, and the variable length data."),
                    new ImageResourceType(
                            0x0414,
                            1044,
                            "Document specific IDs, layer IDs will be generated starting at this base value or a greater value if we find existing IDs to already exceed it. It’s purpose is to avoid the case where we add layers, flatten, save, open, and then add more layers that end up with the same IDs as the first set. 4 bytes."),
                    new ImageResourceType(0x0415, 1045,
                            "Unicode Alpha Names. 4 bytes for length and the string as a unicode string."),
                    new ImageResourceType(
                            0x0416,
                            1046,
                            "Indexed Color Table Count. 2 bytes for the number of colors in table that are actually defined"),
                    new ImageResourceType(0x0417, 1047,
                            "Tansparent Index. 2 bytes for the index of transparent color, if any."),
                    new ImageResourceType(0x0419, 1049,
                            "Global Altitude. 4 byte entry for altitude"),
                    new ImageResourceType(0x041A, 1050,
                            "Slices. See description later in this chapter"),
                    new ImageResourceType(0x041B, 1051,
                            "Workflow URL. Unicode string, 4 bytes of length followed by unicode string."),
                    new ImageResourceType(
                            0x041C,
                            1052,
                            "Jump To XPEP. 2 bytes major version, 2 bytes minor version, 4 bytes count. Following is repeated for count: 4 bytes block size, 4 bytes key, if key = 'jtDd' then next is a Boolean for the dirty flag otherwise it’s a 4 byte entry for the mod date."),
                    new ImageResourceType(
                            0x041D,
                            1053,
                            "Alpha Identifiers. 4 bytes of length, followed by 4 bytes each for every alpha identifier."),
                    new ImageResourceType(
                            0x041E,
                            1054,
                            "URL List. 4 byte count of URLs, followed by 4 byte long, 4 byte ID, and unicode string for each count."),
                    new ImageResourceType(
                            0x0421,
                            1057,
                            "Version Info. 4 byte version, 1 byte HasRealMergedData, unicode string of writer name, unicode string of reader name, 4 bytes of file version."),
                    new ImageResourceType(
                            0x07D0 - 0x0BB6,
                            2000 - 2998,
                            "Path Information (saved paths). See path resource format later in this chapter."),
                    new ImageResourceType(0x0BB7, 2999,
                            "Name of clipping path. See path resource format later in this chapter."),
                    new ImageResourceType(
                            0x2710,
                            10000,
                            "Print flags information. 2 bytes version (=1), 1 byte center crop marks, 1 byte (=0), 4 bytes bleed width value, 2 bytes bleed width scale."), };
        } catch (Exception e) {
            Debug.debug(PsdConstants.class, e);
        }
        fImageResourceTypes = temp;
    }
}
