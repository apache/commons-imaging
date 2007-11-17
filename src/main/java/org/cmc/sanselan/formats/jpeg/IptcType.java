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
package org.cmc.sanselan.formats.jpeg;

public class IptcType implements JpegConstants
{
	public final int type;
	public final String name;

	public IptcType(int type, String name)
	{
		this.type = type;
		this.name = name;
	}

	public static final IptcType getIptcType(int type)
	{
		for (int i = 0; i < IPTC_TYPES.length; i++)
		{
			IptcType fIptcType = IPTC_TYPES[i];
			if (fIptcType.type == type)
				return fIptcType;
		}
		return IPTC_TYPE_Unknown;
	}
}