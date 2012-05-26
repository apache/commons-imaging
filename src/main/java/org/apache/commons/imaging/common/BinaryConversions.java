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

public class BinaryConversions implements BinaryConstants {
    public static byte[] convertToByteArray(short[] values, int byteOrder) {
        return convertToByteArray(values, 0, values.length, byteOrder);
    }

    public static byte[] convertToByteArray(short[] values, int length,
            int byteOrder) {
        return convertToByteArray(values, 0, length, byteOrder);
    }

    public static byte[] convertToByteArray(short[] values, int offset,
            int length, int byteOrder) {
        byte[] result = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            short value = values[offset + i];
            int start = i * 2;
            if (byteOrder == BYTE_ORDER_MOTOROLA) {
                result[start + 0] = (byte) (value >> 8);
                result[start + 1] = (byte) (value >> 0);
            } else {
                result[start + 1] = (byte) (value >> 8);
                result[start + 0] = (byte) (value >> 0);
            }
        }
        return result;
    }

    public static byte[] convertToByteArray(int[] values, int byteOrder) {
        return convertToByteArray(values, 0, values.length, byteOrder);
    }

    public static byte[] convertToByteArray(int[] values, int length,
            int byteOrder) {
        return convertToByteArray(values, 0, length, byteOrder);
    }

    public static byte[] convertToByteArray(int[] values, int offset,
            int length, int byteOrder) {
        byte[] result = new byte[length * 4];
        for (int i = 0; i < length; i++) {
            int value = values[offset + i];
            int start = i * 4;
            if (byteOrder == BYTE_ORDER_MOTOROLA) {
                result[start + 0] = (byte) (value >> 24);
                result[start + 1] = (byte) (value >> 16);
                result[start + 2] = (byte) (value >> 8);
                result[start + 3] = (byte) (value >> 0);
            } else {
                result[start + 3] = (byte) (value >> 24);
                result[start + 2] = (byte) (value >> 16);
                result[start + 1] = (byte) (value >> 8);
                result[start + 0] = (byte) (value >> 0);
            }
        }
        return result;
    }

    public static byte[] convertToByteArray(float[] values, int byteOrder) {
        return convertToByteArray(values, 0, values.length, byteOrder);
    }

    public static byte[] convertToByteArray(float[] values, int length,
            int byteOrder) {
        return convertToByteArray(values, 0, length, byteOrder);
    }

    public static byte[] convertToByteArray(float[] values, int offset,
            int length, int byteOrder) {
        byte[] result = new byte[values.length * 4];
        for (int i = 0; i < values.length; i++) {
            float value = values[i];
            int bits = Float.floatToRawIntBits(value);
            int start = i * 4;
            if (byteOrder == BYTE_ORDER_INTEL) {
                result[start + 0] = (byte) (0xff & (bits >> 0));
                result[start + 1] = (byte) (0xff & (bits >> 8));
                result[start + 2] = (byte) (0xff & (bits >> 16));
                result[start + 3] = (byte) (0xff & (bits >> 24));
            } else {
                result[start + 3] = (byte) (0xff & (bits >> 0));
                result[start + 2] = (byte) (0xff & (bits >> 8));
                result[start + 1] = (byte) (0xff & (bits >> 16));
                result[start + 0] = (byte) (0xff & (bits >> 24));
            }
        }
        return result;
    }

    public static byte[] convertToByteArray(double[] values, int byteOrder) {
        return convertToByteArray(values, 0, values.length, byteOrder);
    }

    public static byte[] convertToByteArray(double[] values, int length,
            int byteOrder) {
        return convertToByteArray(values, 0, length, byteOrder);
    }

    public static byte[] convertToByteArray(double[] values, int offset,
            int length, int byteOrder) {
        byte[] result = new byte[length * 8];
        for (int i = 0; i < length; i++) {
            double value = values[offset + i];
            long bits = Double.doubleToRawLongBits(value);
            int start = i * 8;
            if (byteOrder == BYTE_ORDER_INTEL) {
                result[start + 0] = (byte) (0xff & (bits >> 0));
                result[start + 1] = (byte) (0xff & (bits >> 8));
                result[start + 2] = (byte) (0xff & (bits >> 16));
                result[start + 3] = (byte) (0xff & (bits >> 24));
                result[start + 4] = (byte) (0xff & (bits >> 32));
                result[start + 5] = (byte) (0xff & (bits >> 40));
                result[start + 6] = (byte) (0xff & (bits >> 48));
                result[start + 7] = (byte) (0xff & (bits >> 56));
            } else {
                result[start + 7] = (byte) (0xff & (bits >> 0));
                result[start + 6] = (byte) (0xff & (bits >> 8));
                result[start + 5] = (byte) (0xff & (bits >> 16));
                result[start + 4] = (byte) (0xff & (bits >> 24));
                result[start + 3] = (byte) (0xff & (bits >> 32));
                result[start + 2] = (byte) (0xff & (bits >> 40));
                result[start + 1] = (byte) (0xff & (bits >> 48));
                result[start + 0] = (byte) (0xff & (bits >> 56));
            }
        }
        return result;
    }

    public static byte[] convertToByteArray(RationalNumber[] values,
            int byteOrder) {
        return convertToByteArray(values, 0, values.length, byteOrder);
    }

    public static byte[] convertToByteArray(RationalNumber[] values,
            int length, int byteOrder) {
        return convertToByteArray(values, 0, length, byteOrder);
    }

    public static byte[] convertToByteArray(RationalNumber[] values,
            int offset, int length, int byteOrder) {
        byte[] result = new byte[length * 8];
        for (int i = 0; i < length; i++) {
            RationalNumber value = values[offset + i];
            int start = i * 8;
            if (byteOrder == BYTE_ORDER_MOTOROLA) {
                result[start + 0] = (byte) (value.numerator >> 24);
                result[start + 1] = (byte) (value.numerator >> 16);
                result[start + 2] = (byte) (value.numerator >> 8);
                result[start + 3] = (byte) (value.numerator >> 0);
                result[start + 4] = (byte) (value.divisor >> 24);
                result[start + 5] = (byte) (value.divisor >> 16);
                result[start + 6] = (byte) (value.divisor >> 8);
                result[start + 7] = (byte) (value.divisor >> 0);
            } else {
                result[start + 3] = (byte) (value.numerator >> 24);
                result[start + 2] = (byte) (value.numerator >> 16);
                result[start + 1] = (byte) (value.numerator >> 8);
                result[start + 0] = (byte) (value.numerator >> 0);
                result[start + 7] = (byte) (value.divisor >> 24);
                result[start + 6] = (byte) (value.divisor >> 16);
                result[start + 5] = (byte) (value.divisor >> 8);
                result[start + 4] = (byte) (value.divisor >> 0);
            }
        }
        return result;
    }

    public static short convertToShort(byte[] bytes, int byteOrder) {
        return convertToShort(bytes, 0, byteOrder);
    }

    public static short convertToShort(byte[] bytes, int offset, int byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        if (byteOrder == BYTE_ORDER_MOTOROLA) {
            return (short) ((byte0 << 8) | byte1);
        } else {
            return (short) ((byte1 << 8) | byte0);
        }
    }

    public static short[] convertToShortArray(byte[] bytes, int byteOrder) {
        return convertToShortArray(bytes, 0, bytes.length, byteOrder);
    }

    public static short[] convertToShortArray(byte[] bytes, int length,
            int byteOrder) {
        return convertToShortArray(bytes, 0, length, byteOrder);
    }

    public static short[] convertToShortArray(byte[] bytes, int offset,
            int length, int byteOrder) {
        short[] result = new short[length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = convertToShort(bytes, offset + 2 * i, byteOrder);
        }
        return result;
    }

    public static int convertToInt(byte[] bytes, int byteOrder) {
        return convertToInt(bytes, 0, byteOrder);
    }

    public static int convertToInt(byte[] bytes, int offset, int byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        int byte2 = 0xff & bytes[offset + 2];
        int byte3 = 0xff & bytes[offset + 3];
        if (byteOrder == BYTE_ORDER_MOTOROLA) {
            return (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | byte3;
        } else {
            return (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | byte0;
        }
    }

    public static int[] convertToIntArray(byte[] bytes, int byteOrder) {
        return convertToIntArray(bytes, 0, bytes.length, byteOrder);
    }

    public static int[] convertToIntArray(byte[] bytes, int length,
            int byteOrder) {
        return convertToIntArray(bytes, 0, length, byteOrder);
    }

    public static int[] convertToIntArray(byte[] bytes, int offset, int length,
            int byteOrder) {
        int[] result = new int[length / 4];
        for (int i = 0; i < result.length; i++) {
            result[i] = convertToInt(bytes, offset + 4 * i, byteOrder);
        }
        return result;
    }

    public static float convertToFloat(byte[] bytes, int byteOrder) {
        return convertToFloat(bytes, 0, byteOrder);
    }

    public static float convertToFloat(byte[] bytes, int offset, int byteOrder) {
        int byte0 = 0xff & bytes[offset + 0];
        int byte1 = 0xff & bytes[offset + 1];
        int byte2 = 0xff & bytes[offset + 2];
        int byte3 = 0xff & bytes[offset + 3];
        int bits;
        if (byteOrder == BYTE_ORDER_MOTOROLA) {
            bits = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | (byte3 << 0);
        } else {
            bits = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | (byte0 << 0);
        }
        return Float.intBitsToFloat(bits);
    }

    public static float[] convertToFloatArray(byte[] bytes, int byteOrder) {
        return convertToFloatArray(bytes, 0, bytes.length, byteOrder);
    }

    public static float[] convertToFloatArray(byte[] bytes, int length,
            int byteOrder) {
        return convertToFloatArray(bytes, 0, length, byteOrder);
    }

    public static float[] convertToFloatArray(byte[] bytes, int offset,
            int length, int byteOrder) {
        float[] result = new float[length / 4];
        for (int i = 0; i < result.length; i++) {
            result[i] = convertToFloat(bytes, offset + 4 * i, byteOrder);
        }
        return result;
    }

    public static double convertToDouble(byte[] bytes, int byteOrder) {
        return convertToDouble(bytes, 0, byteOrder);
    }

    public static double convertToDouble(byte[] bytes, int offset, int byteOrder) {
        long byte0 = 0xffL & bytes[offset + 0];
        long byte1 = 0xffL & bytes[offset + 1];
        long byte2 = 0xffL & bytes[offset + 2];
        long byte3 = 0xffL & bytes[offset + 3];
        long byte4 = 0xffL & bytes[offset + 4];
        long byte5 = 0xffL & bytes[offset + 5];
        long byte6 = 0xffL & bytes[offset + 6];
        long byte7 = 0xffL & bytes[offset + 7];
        long bits;
        if (byteOrder == BYTE_ORDER_MOTOROLA) {
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

    public static double[] convertToDoubleArray(byte[] bytes, int byteOrder) {
        return convertToDoubleArray(bytes, 0, bytes.length, byteOrder);
    }

    public static double[] convertToDoubleArray(byte[] bytes, int length,
            int byteOrder) {
        return convertToDoubleArray(bytes, 0, length, byteOrder);
    }

    public static double[] convertToDoubleArray(byte[] bytes, int offset,
            int length, int byteOrder) {
        double[] result = new double[length / 8];
        for (int i = 0; i < result.length; i++) {
            result[i] = convertToDouble(bytes, offset + 8 * i, byteOrder);
        }
        return result;
    }

    public static RationalNumber convertToRational(byte[] bytes, int byteOrder) {
        return convertToRational(bytes, 0, byteOrder);
    }

    public static RationalNumber convertToRational(byte[] bytes, int offset,
            int byteOrder) {
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
        if (byteOrder == BYTE_ORDER_MOTOROLA) {
            numerator = (byte0 << 24) | (byte1 << 16) | (byte2 << 8) | byte3;
            divisor = (byte4 << 24) | (byte5 << 16) | (byte6 << 8) | byte7;
        } else {
            numerator = (byte3 << 24) | (byte2 << 16) | (byte1 << 8) | byte0;
            divisor = (byte7 << 24) | (byte6 << 16) | (byte5 << 8) | byte4;
        }
        return new RationalNumber(numerator, divisor);
    }

    public static RationalNumber[] convertToRationalArray(byte[] bytes,
            int byteOrder) {
        return convertToRationalArray(bytes, 0, bytes.length, byteOrder);
    }

    public static RationalNumber[] convertToRationalArray(byte[] bytes,
            int length, int byteOrder) {
        return convertToRationalArray(bytes, 0, length, byteOrder);
    }

    public static RationalNumber[] convertToRationalArray(byte[] bytes,
            int offset, int length, int byteOrder) {
        RationalNumber[] result = new RationalNumber[length / 8];
        for (int i = 0; i < result.length; i++) {
            result[i] = convertToRational(bytes, offset + 8 * i, byteOrder);
        }
        return result;
    }
}
