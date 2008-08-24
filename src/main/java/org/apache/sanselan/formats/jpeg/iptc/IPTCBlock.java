/**
 * 
 */
package org.apache.sanselan.formats.jpeg.iptc;

public class IPTCBlock
{
	public final int blockType;
	public final byte[] blockNameBytes;
	public final byte[] blockData;

	public IPTCBlock(int blockType, byte[] blockNameBytes, byte[] blockData)
	{
		this.blockData = blockData;
		this.blockNameBytes = blockNameBytes;
		this.blockType = blockType;
	}

	public boolean isIPTCBlock()
	{
		return blockType == IPTCParser.IMAGE_RESOURCE_BLOCK_IPTC_DATA;
	}
}