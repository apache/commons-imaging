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
package org.cmc.sanselan.common;

import java.text.NumberFormat;

public class RationalNumber extends Number

{
	public final int numerator;
	public final int divisor;

	public RationalNumber(int numerator, int divisor)
	{
		this.numerator = numerator;
		this.divisor = divisor;
	}

	public double doubleValue()
	{
		return (double) numerator / (double) divisor;
	}

	public float floatValue()
	{
		return (float) numerator / (float) divisor;
	}

	public int intValue()
	{
		return (int) numerator / (int) divisor;
	}

	public long longValue()
	{
		return (long) numerator / (long) divisor;
	}

	public String toString()
	{
		if (divisor == 0)
			return "Invalid rational number; Numerator: " + numerator
					+ ", Divisor: " + divisor;
		if ((numerator % divisor) == 0)
			return "" + (numerator / divisor);
		return numerator + "/" + divisor;
	}

	public String toDisplayString()
	{
		if ((numerator % divisor) == 0)
			return "" + (numerator / divisor);
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(3);
		return nf.format((double) numerator / (double) divisor);
	}
}