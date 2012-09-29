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
package org.apache.commons.imaging.common;

/**
 * Convenience methods for converting data types to and from
 * byte arrays.
 */
public class BinaryConversions {
    public static byte[] toBytes(short value, ByteOrder byteOrder) {
        byte[] result = new byte[2];
        toBytes(value, byteOrder, result, 0);
        return result;
    }
    
    public static byte[] toBytes(short[] values, ByteOrder byteOrder) {
        return toBytes(values, 0, values.length, byteOrder);
    }

    public static byte[] toBytes(short[] values, int length,
            ByteOrder byteOrder) {
        return toBytes(values, 0, length, byteOrder);
    }

    public static byte[] toBytes(short[] values, int offset,
            int length, ByteOrder byteOrder) {
        byte[] result = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            toBytes(values[offset + i], byteOrder, result, i * 2);
        }
        return result;
    }
    
    public static void toBytes(short[] values, ByteOrder byteOrder,
            byte[] result, int resultOffset) {
        toBytes(values, 0, values.length, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(short[] values, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        toBytes(values, 0, valuesLength, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(short[] values, int valuesOffset, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        for (int i = 0; i < valuesLength; i++) {
            toBytes(values[valuesOffset + i], byteOrder, result, resultOffset + i*2);
        }
    }
    
    public static void toBytes(short value, ByteOrder byteOrder,
            byte[] result, int offset) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value >> 8);
            result[offset + 1] = (byte) (value >> 0);
        } else {
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }

    public static byte[] toBytes(int value, ByteOrder byteOrder) {
        byte[] result = new byte[4];
        toBytes(value, byteOrder, result, 0);
        return result;
    }
    
    public static byte[] toBytes(int[] values, ByteOrder byteOrder) {
        return toBytes(values, 0, values.length, byteOrder);
    }

    public static byte[] toBytes(int[] values, int length,
            ByteOrder byteOrder) {
        return toBytes(values, 0, length, byteOrder);
    }

    public static byte[] toBytes(int[] values, int offset,
            int length, ByteOrder byteOrder) {
        byte[] result = new byte[length * 4];
        for (int i = 0; i < length; i++) {
            toBytes(values[offset + i], byteOrder, result, i * 4);
        }
        return result;
    }
    
    public static void toBytes(int[] values, ByteOrder byteOrder,
            byte[] result, int resultOffset) {
        toBytes(values, 0, values.length, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(int[] values, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        toBytes(values, 0, valuesLength, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(int[] values, int valuesOffset, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        for (int i = 0; i < valuesLength; i++) {
            toBytes(values[valuesOffset + i], byteOrder, result, resultOffset + i*4);
        }
    }
    
    public static void toBytes(int value, ByteOrder byteOrder,
            byte[] result, int offset) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            result[offset + 0] = (byte) (value >> 24);
            result[offset + 1] = (byte) (value >> 16);
            result[offset + 2] = (byte) (value >> 8);
            result[offset + 3] = (byte) (value >> 0);
        } else {
            result[offset + 3] = (byte) (value >> 24);
            result[offset + 2] = (byte) (value >> 16);
            result[offset + 1] = (byte) (value >> 8);
            result[offset + 0] = (byte) (value >> 0);
        }
    }

    public static byte[] toBytes(float value, ByteOrder byteOrder) {
        byte[] result = new byte[4];
        toBytes(value, byteOrder, result, 0);
        return result;
    }
    
    public static byte[] toBytes(float[] values, ByteOrder byteOrder) {
        return toBytes(values, 0, values.length, byteOrder);
    }

    public static byte[] toBytes(float[] values, int length,
            ByteOrder byteOrder) {
        return toBytes(values, 0, length, byteOrder);
    }

    public static byte[] toBytes(float[] values, int offset,
            int length, ByteOrder byteOrder) {
        byte[] result = new byte[length * 4];
        for (int i = 0; i < length; i++) {
            toBytes(values[offset + i], byteOrder, result, i * 4);
        }
        return result;
    }
    
    public static void toBytes(float[] values, ByteOrder byteOrder,
            byte[] result, int resultOffset) {
        toBytes(values, 0, values.length, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(float[] values, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        toBytes(values, 0, valuesLength, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(float[] values, int valuesOffset, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        for (int i = 0; i < valuesLength; i++) {
            toBytes(values[valuesOffset + i], byteOrder, result, resultOffset + i*4);
        }
    }
    
    public static void toBytes(float value, ByteOrder byteOrder,
            byte[] result, int offset) {
        int bits = Float.floatToRawIntBits(value);
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
            result[offset + 3] = (byte) (0xff & (bits >> 24));
        } else {
            result[offset + 3] = (byte) (0xff & (bits >> 0));
            result[offset + 2] = (byte) (0xff & (bits >> 8));
            result[offset + 1] = (byte) (0xff & (bits >> 16));
            result[offset + 0] = (byte) (0xff & (bits >> 24));
        }
    }

    public static byte[] toBytes(double value, ByteOrder byteOrder) {
        byte[] result = new byte[8];
        toBytes(value, byteOrder, result, 0);
        return result;
    }
    
    public static byte[] toBytes(double[] values, ByteOrder byteOrder) {
        return toBytes(values, 0, values.length, byteOrder);
    }

    public static byte[] toBytes(double[] values, int length,
            ByteOrder byteOrder) {
        return toBytes(values, 0, length, byteOrder);
    }

    public static byte[] toBytes(double[] values, int offset,
            int length, ByteOrder byteOrder) {
        byte[] result = new byte[length * 8];
        for (int i = 0; i < length; i++) {
            toBytes(values[offset + i], byteOrder, result, i * 8);
        }
        return result;
    }
    
    public static void toBytes(double[] values, ByteOrder byteOrder,
            byte[] result, int resultOffset) {
        toBytes(values, 0, values.length, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(double[] values, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        toBytes(values, 0, valuesLength, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(double[] values, int valuesOffset, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        for (int i = 0; i < valuesLength; i++) {
            toBytes(values[valuesOffset + i], byteOrder, result, resultOffset + i*8);
        }
    }
    
    public static void toBytes(double value, ByteOrder byteOrder,
            byte[] result, int offset) {
        long bits = Double.doubleToRawLongBits(value);
        if (byteOrder == ByteOrder.INTEL) {
            result[offset + 0] = (byte) (0xff & (bits >> 0));
            result[offset + 1] = (byte) (0xff & (bits >> 8));
            result[offset + 2] = (byte) (0xff & (bits >> 16));
            result[offset + 3] = (byte) (0xff & (bits >> 24));
            result[offset + 4] = (byte) (0xff & (bits >> 32));
            result[offset + 5] = (byte) (0xff & (bits >> 40));
            result[offset + 6] = (byte) (0xff & (bits >> 48));
            result[offset + 7] = (byte) (0xff & (bits >> 56));
        } else {
            result[offset + 7] = (byte) (0xff & (bits >> 0));
            result[offset + 6] = (byte) (0xff & (bits >> 8));
            result[offset + 5] = (byte) (0xff & (bits >> 16));
            result[offset + 4] = (byte) (0xff & (bits >> 24));
            result[offset + 3] = (byte) (0xff & (bits >> 32));
            result[offset + 2] = (byte) (0xff & (bits >> 40));
            result[offset + 1] = (byte) (0xff & (bits >> 48));
            result[offset + 0] = (byte) (0xff & (bits >> 56));
        }
    }

    public static byte[] toBytes(RationalNumber value, ByteOrder byteOrder) {
        byte[] result = new byte[8];
        toBytes(value, byteOrder, result, 0);
        return result;
    }
    
    public static byte[] toBytes(RationalNumber[] values, ByteOrder byteOrder) {
        return toBytes(values, 0, values.length, byteOrder);
    }

    public static byte[] toBytes(RationalNumber[] values, int length,
            ByteOrder byteOrder) {
        return toBytes(values, 0, length, byteOrder);
    }

    public static byte[] toBytes(RationalNumber[] values, int offset,
            int length, ByteOrder byteOrder) {
        byte[] result = new byte[length * 8];
        for (int i = 0; i < length; i++) {
            toBytes(values[offset + i], byteOrder, result, i * 8);
        }
        return result;
    }
    
    public static void toBytes(RationalNumber[] values, ByteOrder byteOrder,
            byte[] result, int resultOffset) {
        toBytes(values, 0, values.length, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(RationalNumber[] values, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        toBytes(values, 0, valuesLength, byteOrder, result, resultOffset);
    }
    
    public static void toBytes(RationalNumber[] values, int valuesOffset, int valuesLength,
            ByteOrder byteOrder, byte[] result, int resultOffset) {
        for (int i = 0; i < valuesLength; i++) {
            toBytes(values[valuesOffset + i], byteOrder, result, resultOffset + i*8);
        }
    }
    
    public static void toBytes(RationalNumber value, ByteOrder byteOrder,
            byte[] result, int offset) {
        if (byteOrder == ByteOrder.MOTOROLA) {
            result[offset + 0] = (byte) (value.numerator >> 24);
            result[offset + 1] = (byte) (value.numerator >> 16);
            result[offset + 2] = (byte) (value.numerator >> 8);
            result[offset + 3] = (byte) (value.numerator >> 0);
            result[offset + 4] = (byte) (value.divisor >> 24);
            result[offset + 5] = (byte) (value.divisor >> 16);
            result[offset + 6] = (byte) (value.divisor >> 8);
            result[offset + 7] = (byte) (value.divisor >> 0);
        } else {
            result[offset + 3] = (byte) (value.numerator >> 24);
            result[offset + 2] = (byte) (value.numerator >> 16);
            result[offset + 1] = (byte) (value.numerator >> 8);
            result[offset + 0] = (byte) (value.numerator >> 0);
            result[offset + 7] = (byte) (value.divisor >> 24);
            result[offset + 6] = (byte) (value.divisor >> 16);
            result[offset + 5] = (byte) (value.divisor >> 8);
            result[offset + 4] = (byte) (value.divisor >> 0);
        }
    }

    public static short toShort(byte[] bytes, ByteOrder byteOrder) {
        return toShort(bytes, 0, byteOrder);
    }

    public static short toShort(byte[] bytes, int offset, ByteOrder byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        if (byteOrder == ByteOrder.MOTOROLA) {
            return (short) ((byte0 << 8) | byte1);
        } else {
            return (short) ((byte1 << 8) | byte0);
        }
    }

    public static short[] toShorts(byte[] bytes, ByteOrder byteOrder) {
        return toShorts(bytes, 0, bytes.length, byteOrder);
    }

    public static short[] toShorts(byte[] bytes, int length,
            ByteOrder byteOrder) {
        return toShorts(bytes, 0, length, byteOrder);
    }

    public static short[] toShorts(byte[] bytes, int offset,
            int length, ByteOrder byteOrder) {
        short[] result = new short[length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = toShort(bytes, offset + 2 * i, byteOrder);
        }
        return result;
    }

    public static int toInt(byte[] bytes, ByteOrder byteOrder) {
        return toInt(bytes, 0, byteOrder);
    }

    public static int toInt(byte[] bytes, int offset, ByteOrder byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        int byte2 = 0xff & bytes[offset + 2];
        int byte3 = 0xff & bytes[offset + 3];
        if (byteOrder == ByteOrder.MOTOROLA) {
            return (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | byte3;
        } else {
            return (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | byte0;
        }
    }

    public static int[] toInts(byte[] bytes, ByteOrder byteOrder) {
        return toInts(bytes, 0, bytes.length, byteOrder);
    }

    public static int[] toInts(byte[] bytes, int length,
            ByteOrder byteOrder) {
        return toInts(bytes, 0, length, byteOrder);
    }

    public static int[] toInts(byte[] bytes, int offset, int length,
            ByteOrder byteOrder) {
        int[] result = new int[length / 4];
        for (int i = 0; i < result.length; i++) {
            result[i] = toInt(bytes, offset + 4 * i, byteOrder);
        }
        return result;
    }

    public static float toFloat(byte[] bytes, ByteOrder byteOrder) {
        return toFloat(bytes, 0, byteOrder);
    }

    public static float toFloat(byte[] bytes, int offset, ByteOrder byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        int byte2 = 0xff & bytes[offset + 2];
        int byte3 = 0xff & bytes[offset + 3];
        int bits;
        if (byteOrder == ByteOrder.MOTOROLA) {
            bits = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | (byte3 << 0);
        } else {
            bits = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | (byte0 << 0);
        }
        return Float.intBitsToFloat(bits);
    }

    public static float[] toFloats(byte[] bytes, ByteOrder byteOrder) {
        return toFloats(bytes, 0, bytes.length, byteOrder);
    }

    public static float[] toFloats(byte[] bytes, int length,
            ByteOrder byteOrder) {
        return toFloats(bytes, 0, length, byteOrder);
    }

    public static float[] toFloats(byte[] bytes, int offset,
            int length, ByteOrder byteOrder) {
        float[] result = new float[length / 4];
        for (int i = 0; i < result.length; i++) {
            result[i] = toFloat(bytes, offset + 4 * i, byteOrder);
        }
        return result;
    }

    public static double toDouble(byte[] bytes, ByteOrder byteOrder) {
        return toDouble(bytes, 0, byteOrder);
    }

    public static double toDouble(byte[] bytes, int offset, ByteOrder byteOrder) {
        long byte0 = 0xffL & bytes[offset + 0];
        long byte1 = 0xffL & bytes[offset + 1];
        long byte2 = 0xffL & bytes[offset + 2];
        long byte3 = 0xffL & bytes[offset + 3];
        long byte4 = 0xffL & bytes[offset + 4];
        long byte5 = 0xffL & bytes[offset + 5];
        long byte6 = 0xffL & bytes[offset + 6];
        long byte7 = 0xffL & bytes[offset + 7];
        long bits;
        if (byteOrder == ByteOrder.MOTOROLA) {
            bits = (byte0 << 56) | (byte1 << 48) | (byte2 << 40)
                    | (byte3 << 32) | (byte4 << 24) | (byte5 << 16)
                    | (byte6 << 8) | (byte7 << 0);
        } else {
            bits = (byte7 << 56) | (byte6 << 48) | (byte5 << 40)
                    | (byte4 << 32) | (byte3 << 24) | (byte2 << 16)
                    | (byte1 << 8) | (byte0 << 0);
        }
        return Double.longBitsToDouble(bits);
    }

    public static double[] toDoubles(byte[] bytes, ByteOrder byteOrder) {
        return toDoubles(bytes, 0, bytes.length, byteOrder);
    }

    public static double[] toDoubles(byte[] bytes, int length,
            ByteOrder byteOrder) {
        return toDoubles(bytes, 0, length, byteOrder);
    }

    public static double[] toDoubles(byte[] bytes, int offset,
            int length, ByteOrder byteOrder) {
        double[] result = new double[length / 8];
        for (int i = 0; i < result.length; i++) {
            result[i] = toDouble(bytes, offset + 8 * i, byteOrder);
        }
        return result;
    }

    public static RationalNumber toRational(byte[] bytes, ByteOrder byteOrder) {
        return toRational(bytes, 0, byteOrder);
    }

    public static RationalNumber toRational(byte[] bytes, int offset,
            ByteOrder byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        int byte2 = 0xff & bytes[offset + 2];
        int byte3 = 0xff & bytes[offset + 3];
        int byte4 = 0xff & bytes[offset + 4];
        int byte5 = 0xff & bytes[offset + 5];
        int byte6 = 0xff & bytes[offset + 6];
        int byte7 = 0xff & bytes[offset + 7];
        int numerator;
        int divisor;
        if (byteOrder == ByteOrder.MOTOROLA) {
            numerator = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | byte3;
            divisor = (byte4 << 24) | (byte5 << 16) | (byte6 << 8) | byte7;
        } else {
            numerator = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | byte0;
            divisor = (byte7 << 24) | (byte6 << 16) | (byte5 << 8) | byte4;
        }
        return new RationalNumber(numerator, divisor);
    }

    public static RationalNumber[] toRationals(byte[] bytes,
            ByteOrder byteOrder) {
        return toRationals(bytes, 0, bytes.length, byteOrder);
    }

    public static RationalNumber[] toRationals(byte[] bytes,
            int length, ByteOrder byteOrder) {
        return toRationals(bytes, 0, length, byteOrder);
    }

    public static RationalNumber[] toRationals(byte[] bytes,
            int offset, int length, ByteOrder byteOrder) {
        RationalNumber[] result = new RationalNumber[length / 8];
        for (int i = 0; i < result.length; i++) {
            result[i] = toRational(bytes, offset + 8 * i, byteOrder);
        }
        return result;
    }
}
