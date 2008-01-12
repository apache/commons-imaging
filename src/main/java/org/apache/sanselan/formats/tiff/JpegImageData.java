/**
 * 
 */
package org.apache.sanselan.formats.tiff;

public class JpegImageData extends TiffElement.DataElement
{
	public JpegImageData(int offset, int length, final byte data[])
	{
		super(offset, length, data);
	}

	public String getElementDescription(boolean verbose)
	{
		return "Jpeg image data: " + data.length + " bytes";
	}

}