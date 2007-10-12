/*
 * 

 * 
 * Created on Dec 31, 2005
 *
 */

package org.apache.sanselan.util;

import java.io.IOException;
import java.io.OutputStream;

public class DebugOutputStream extends OutputStream
{
	private final OutputStream os;
	private long count = 0;

	public DebugOutputStream(final OutputStream os)
	{
		super();
		this.os = os;
	}

	public void write(int b) throws IOException
	{
		os.write(b);
		count++;
	}

	public void write(byte b[]) throws IOException
	{
		os.write(b);
		count += b.length;
	}

	public void write(byte b[], int off, int len) throws IOException
	{
		os.write(b, off, len);
		count += len;
	}

	public void flush() throws IOException
	{
		os.flush();
	}

	public void close() throws IOException
	{
		os.close();
	}

	public long count()
	{
		return count;
	}
}
