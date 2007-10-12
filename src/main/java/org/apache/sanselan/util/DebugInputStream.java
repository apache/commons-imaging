/*
 * 
 * www.digilabs.biz
 * 
 * Created on Dec 31, 2005
 *
 */

package org.apache.sanselan.util;

import java.io.*;

public class DebugInputStream extends InputStream
{
	private final InputStream is;

	public DebugInputStream(InputStream is)
	{
		this.is = is;
	}

	private long bytes_read = 0;

	public int read() throws IOException
	{
		int result = is.read();
		bytes_read++;
		return result;
	}

	public long skip(long n) throws IOException
	{
		long result = is.skip(n);
		bytes_read += n;
		return result;
	}

	public int available() throws IOException
	{
		return is.available();
	}

	public void close() throws IOException
	{
		is.close();
	}

	public long getBytesRead()
	{
		return bytes_read;
	}
}
