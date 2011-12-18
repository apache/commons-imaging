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
package org.apache.commons.sanselan.icc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.apache.commons.sanselan.ImageReadException;
import org.apache.commons.sanselan.common.BinaryConstants;
import org.apache.commons.sanselan.common.BinaryInputStream;

public class IccTag implements BinaryConstants, IccConstants
{
    public final int signature;
    public final int offset, length;
    public final IccTagType fIccTagType;

    //        public final byte data[];

    public IccTag(int signature, int offset, int length, IccTagType fIccTagType)
    {
        this.signature = signature;
        this.offset = offset;
        this.length = length;
        this.fIccTagType = fIccTagType;
    }

    public byte data[] = null;
    private IccTagDataType itdt = null;
    private int data_type_signature;

    public void setData(byte bytes[]) throws ImageReadException, IOException
    {
        data = bytes;

        BinaryInputStream bis = new BinaryInputStream(new ByteArrayInputStream(
                bytes), BYTE_ORDER_NETWORK);
        data_type_signature = bis.read4Bytes("data type signature",
                "ICC: corrupt tag data");

        itdt = getIccTagDataType(data_type_signature);
        //        if (itdt != null)
        //        {
        //            System.out.println("\t\t\t" + "itdt: " + itdt.name);
        //        }

    }

    private IccTagDataType getIccTagDataType(int quad)
    {
        for (int i = 0; i < IccTagDataTypes.length; i++)
            if (IccTagDataTypes[i].signature == quad)
                return IccTagDataTypes[i];

        return null;
    }

    public void dump(String prefix) throws ImageReadException, IOException
    {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        dump(pw, prefix);

        pw.flush();
    }

    public void dump(PrintWriter pw, String prefix) throws ImageReadException,
            IOException
    {
        pw.println(prefix
                + "tag signature: "
                + Integer.toHexString(signature)
                + " ("
                + new String(new byte[]{
                        (byte) (0xff & (signature >> 24)),
                        (byte) (0xff & (signature >> 16)),
                        (byte) (0xff & (signature >> 8)),
                        (byte) (0xff & (signature >> 0)),
                }) + ")");

        if (data == null)
            pw.println(prefix + "data: " + data);
        else
        {
            pw.println(prefix + "data: " + data.length);

            pw.println(prefix
                    + "data type signature: "
                    + Integer.toHexString(data_type_signature)
                    + " ("
                    + new String(new byte[]{
                            (byte) (0xff & (data_type_signature >> 24)),
                            (byte) (0xff & (data_type_signature >> 16)),
                            (byte) (0xff & (data_type_signature >> 8)),
                            (byte) (0xff & (data_type_signature >> 0)),
                    }) + ")");

            if (itdt == null)
                pw.println(prefix + "IccTagType : " + "unknown");
            else
            {
                pw.println(prefix + "IccTagType : " + itdt.name);
                itdt.dump(prefix, data);
            }

        }

        pw.println("");
        pw.flush();

    }
}