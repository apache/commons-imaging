package org.apache.commons.imaging.formats.tiff.fieldtypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * TIFF field types.
 */
public abstract class FieldType {
    public static final FieldTypeByte BYTE = new FieldTypeByte(1, "Byte");
    public static final FieldTypeAscii ASCII = new FieldTypeAscii(2, "ASCII");
    public static final FieldTypeShort SHORT = new FieldTypeShort(3, "Short");
    public static final FieldTypeLong LONG = new FieldTypeLong(4, "Long");
    public static final FieldTypeRational RATIONAL = new FieldTypeRational(5, "Rational");
    public static final FieldTypeByte SBYTE = new FieldTypeByte(6, "SByte");
    public static final FieldTypeByte UNDEFINED = new FieldTypeByte(7, "Undefined");
    public static final FieldTypeShort SSHORT = new FieldTypeShort(8, "SShort");
    public static final FieldTypeLong SLONG = new FieldTypeLong(9, "SLong");
    public static final FieldTypeRational SRATIONAL = new FieldTypeRational(10, "SRational");
    public static final FieldTypeFloat FLOAT = new FieldTypeFloat(11, "Float");
    public static final FieldTypeDouble DOUBLE = new FieldTypeDouble(12, "Double");
    public static final FieldTypeLong IFD = new FieldTypeLong(13, "IFD");

    private final int type;
    private final String name;
    private final int elementSize;

    protected FieldType(final int type, final String name, final int elementSize) {
        this.type = type;
        this.name = name;
        this.elementSize = elementSize;
    }
    
    
    public int getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return elementSize;
    }
    
    public static FieldType getFieldType(int type) throws ImageReadException {
        for (final FieldType fieldType : ANY) {
            if (fieldType.getType() == type) {
                return fieldType;
            }
        }
        throw new ImageReadException("Field type " + type + " is unsupported");
    }
    
    public abstract Object getValue(final TiffField entry);
    public abstract byte[] writeData(final Object o, final ByteOrder byteOrder) throws ImageWriteException;
    
    public static final List<FieldType> ANY =
            Collections.unmodifiableList(Arrays.asList(
                    BYTE, ASCII, SHORT,
                    LONG, RATIONAL, SBYTE,
                    UNDEFINED, SSHORT, SLONG,
                    SRATIONAL, FLOAT, DOUBLE,
                    IFD));

    public static final List<FieldType> SHORT_OR_LONG =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG));
    
    public static final List<FieldType> SHORT_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, RATIONAL));
    
    public static final List<FieldType> SHORT_OR_LONG_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG, RATIONAL));
    
    public static final List<FieldType> LONG_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, LONG));
    
    public static final List<FieldType> BYTE_OR_SHORT =
            Collections.unmodifiableList(Arrays.asList(
                    SHORT, BYTE));
    
    public static final List<FieldType> LONG_OR_IFD =
            Collections.unmodifiableList(Arrays.asList(
                    (FieldType)LONG, IFD));
    
    public static final List<FieldType> ASCII_OR_RATIONAL =
            Collections.unmodifiableList(Arrays.asList(
                    ASCII, RATIONAL));
    
    public static final List<FieldType> ASCII_OR_BYTE =
            Collections.unmodifiableList(Arrays.asList(
                    ASCII, BYTE));
}
