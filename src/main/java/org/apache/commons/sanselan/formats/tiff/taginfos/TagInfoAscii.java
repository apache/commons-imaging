package org.apache.commons.sanselan.formats.tiff.taginfos;

import java.io.UnsupportedEncodingException;

import org.apache.commons.sanselan.ImageWriteException;
import org.apache.commons.sanselan.formats.tiff.constants.TiffDirectoryType;

public class TagInfoAscii extends TagInfo {
    public TagInfoAscii(String name, int tag, int length, TiffDirectoryType directoryType) {
        super(name, tag, FIELD_TYPE_ASCII, length, directoryType);
    }
    
    public String[] getValue(int byteOrder, byte[] bytes) {
        int nullCount = 1;
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == 0) {
                nullCount++;
            }
        }
        String[] strings = new String[nullCount + 1];
        int stringsAdded = 0;
        strings[0] = ""; // if we have a 0 length string
        int nextStringPos = 0;
        // According to the Exiftool FAQ, http://www.metadataworkinggroup.org
        // specifies that the TIFF ASCII fields are actually UTF-8.
        // Exiftool however allows you to configure the charset used.
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                try {
                    String string = new String(bytes, nextStringPos, i - nextStringPos, "UTF-8");
                    strings[stringsAdded++] = string;
                } catch (UnsupportedEncodingException unsupportedEncoding) {
                }
                nextStringPos = i + 1;
            }
        }
        if (nextStringPos < bytes.length) {
            // Buggy file, string wasn't null terminated
            try {
                String string = new String(bytes, nextStringPos, bytes.length - nextStringPos, "UTF-8");
                strings[stringsAdded++] = string;
            } catch (UnsupportedEncodingException unsupportedEncoding) {
            }
        }
        return strings;
    }

    public byte[] encodeValue(int byteOrder, String... values) throws ImageWriteException {
        return FIELD_TYPE_ASCII.writeData(values, byteOrder);
    }
}
