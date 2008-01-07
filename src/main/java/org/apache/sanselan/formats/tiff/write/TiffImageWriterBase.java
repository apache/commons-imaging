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
package org.apache.sanselan.formats.tiff.write;

import org.apache.sanselan.common.BinaryConstants;
import org.apache.sanselan.formats.tiff.constants.TiffConstants;

public abstract class TiffImageWriterBase
		implements
			TiffConstants,
			BinaryConstants
{
	public static final int DEFAULT_WRITE_BYTE_ORDER = BYTE_ORDER_INTEL;

	protected final int byteOrder;

	public TiffImageWriterBase()
	{
		this.byteOrder = DEFAULT_WRITE_BYTE_ORDER;
	}

	public TiffImageWriterBase(int byteOrder)
	{
		this.byteOrder = byteOrder;
	}

}
