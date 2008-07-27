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
package org.apache.sanselan.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

import org.apache.sanselan.ImageReadException;

public class ZLibInflater extends BinaryFileFunctions
{
	public final byte[] inflate(byte bytes[]) throws IOException
	// slow, probably.
	{
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		InflaterInputStream zIn = new InflaterInputStream(in);
		return getStreamBytes(zIn);
	}

	public final byte[] deflate(byte bytes[]) throws IOException
	{
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		DeflaterInputStream zIn = new DeflaterInputStream(in);
		return getStreamBytes(zIn);
	}

}
