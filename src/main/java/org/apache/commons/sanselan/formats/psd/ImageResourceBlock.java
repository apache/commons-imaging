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
package org.apache.commons.sanselan.formats.psd;

import java.io.UnsupportedEncodingException;

import org.apache.commons.sanselan.util.Debug;

class ImageResourceBlock
{
    protected final int id;
    protected final byte nameData[];
    protected final byte data[];

    public ImageResourceBlock(int ID, byte NameData[], byte Data[])
    {
        this.id = ID;
        this.nameData = NameData;
        this.data = Data;
    }

    public String getName() throws UnsupportedEncodingException
    {
        Debug.debug("getName", nameData.length);
        return new String(nameData, "ISO-8859-1");
    }
}