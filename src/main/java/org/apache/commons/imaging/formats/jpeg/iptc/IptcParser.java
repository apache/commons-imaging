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

package org.apache.commons.imaging.formats.jpeg.iptc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.ImagingConstants;
import org.apache.commons.imaging.common.BinaryFileParser;
import org.apache.commons.imaging.common.BinaryInputStream;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ByteConversions;
import org.apache.commons.imaging.common.ByteOrder;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.util.Debug;
import org.apache.commons.imaging.util.IoUtils;
import org.apache.commons.imaging.util.ParamMap;

public class IptcParser extends BinaryFileParser {
    private static final ByteOrder APP13_BYTE_ORDER = ByteOrder.NETWORK;

    public IptcParser() {
        setByteOrder(ByteOrder.NETWORK);
    }

    public boolean isPhotoshopJpegSegment(final byte segmentData[]) {
        if (!BinaryFileParser.startsWith(segmentData,
                JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING)) {
            return false;
        }

        final int index = JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.size();
        return (index + 4) <= segmentData.length &&
                ByteConversions.toInt(segmentData, index, APP13_BYTE_ORDER) == JpegConstants.CONST_8BIM;
    }

    /*
     * In practice, App13 segments are only used for Photoshop/IPTC metadata.
     * However, we should not treat App13 signatures without Photoshop's
     * signature as Photoshop/IPTC segments.
     * 
     * A Photoshop/IPTC App13 segment begins with the Photoshop Identification
     * string.
     * 
     * There follows 0-N blocks (Photoshop calls them "Image Resource Blocks").
     * 
     * Each block has the following structure:
     * 
     * 1. 4-byte type. This is always "8BIM" for blocks in a Photoshop App13
     * segment. 2. 2-byte id. IPTC data is stored in blocks with id 0x0404, aka.
     * IPTC_NAA_RECORD_IMAGE_RESOURCE_ID 3. Block name as a Pascal String. This
     * is padded to have an even length. 4. 4-byte size (in bytes). 5. Block
     * data. This is also padded to have an even length.
     * 
     * The block data consists of a 0-N records. A record has the following
     * structure:
     * 
     * 1. 2-byte prefix. The value is always 0x1C02 2. 1-byte record type. The
     * record types are documented by the IPTC. See IptcConstants. 3. 2-byte
     * record size (in bytes). 4. Record data, "record size" bytes long.
     * 
     * Record data (unlike block data) is NOT padded to have an even length.
     * 
     * Record data, for IPTC record, should always be ISO-8859-1. But according
     * to SANSELAN-33, this isn't always the case.
     * 
     * The exception is the first record in the block, which must always be a
     * record version record, whose value is a two-byte number; the value is
     * 0x02.
     * 
     * Some IPTC blocks are missing this first "record version" record, so we
     * don't require it.
     */
    public PhotoshopApp13Data parsePhotoshopSegment(final byte bytes[], final Map<String,Object> params)
            throws ImageReadException, IOException {
        final boolean strict = ParamMap.getParamBoolean(params,
                ImagingConstants.PARAM_KEY_STRICT, false);
        final boolean verbose = ParamMap.getParamBoolean(params,
                ImagingConstants.PARAM_KEY_VERBOSE, false);

        return parsePhotoshopSegment(bytes, verbose, strict);
    }

    public PhotoshopApp13Data parsePhotoshopSegment(final byte bytes[],
            final boolean verbose, final boolean strict) throws ImageReadException,
            IOException {
        final List<IptcRecord> records = new ArrayList<IptcRecord>();

        final List<IptcBlock> blocks = parseAllBlocks(bytes, verbose, strict);

        for (IptcBlock block : blocks) {
            // Ignore everything but IPTC data.
            if (!block.isIPTCBlock()) {
                continue;
            }

            records.addAll(parseIPTCBlock(block.blockData, verbose));
        }

        return new PhotoshopApp13Data(records, blocks);
    }

    protected List<IptcRecord> parseIPTCBlock(final byte bytes[], final boolean verbose)
            throws IOException {
        final List<IptcRecord> elements = new ArrayList<IptcRecord>();

        int index = 0;
        // Integer recordVersion = null;
        while (index + 1 < bytes.length) {
            final int tagMarker = 0xff & bytes[index++];
            if (verbose) {
                Debug.debug("tagMarker",
                        tagMarker + " (0x" + Integer.toHexString(tagMarker)
                                + ")");
            }

            if (tagMarker != IptcConstants.IPTC_RECORD_TAG_MARKER) {
                if (verbose) {
                    System.out.println("Unexpected record tag marker in IPTC data.");
                }
                return elements;
            }

            final int recordNumber = 0xff & bytes[index++];
            if (verbose) {
                Debug.debug(
                        "recordNumber",
                        recordNumber + " (0x"
                                + Integer.toHexString(recordNumber) + ")");
            }

            // int recordPrefix = convertByteArrayToShort("recordPrefix", index,
            // bytes);
            // if (verbose)
            // Debug.debug("recordPrefix", recordPrefix + " (0x"
            // + Integer.toHexString(recordPrefix) + ")");
            // index += 2;
            //
            // if (recordPrefix != IPTC_RECORD_PREFIX)
            // {
            // if (verbose)
            // System.out
            // .println("Unexpected record prefix in IPTC data!");
            // return elements;
            // }

            // throw new ImageReadException(
            // "Unexpected record prefix in IPTC data.");

            final int recordType = 0xff & bytes[index];
            if (verbose) {
                Debug.debug("recordType",
                        recordType + " (0x" + Integer.toHexString(recordType)
                                + ")");
            }
            index++;

            final int recordSize = toUInt16(bytes, index);
            index += 2;

            final boolean extendedDataset = recordSize > IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE;
            final int dataFieldCountLength = recordSize & 0x7fff;
            if (extendedDataset && verbose) {
                Debug.debug("extendedDataset. dataFieldCountLength: "
                        + dataFieldCountLength);
            }
            if (extendedDataset) {
                // ignore extended dataset and everything after.
                return elements;
            }

            final byte recordData[] = slice(bytes, index, recordSize);
            index += recordSize;

            // Debug.debug("recordSize", recordSize + " (0x"
            // + Integer.toHexString(recordSize) + ")");

            if (recordNumber != IptcConstants.IPTC_APPLICATION_2_RECORD_NUMBER) {
                continue;
            }

            if (recordType == 0) {
                if (verbose) {
                    System.out.println("ignore record version record! "
                            + elements.size());
                }
                // ignore "record version" record;
                continue;
            }
            // if (recordVersion == null)
            // {
            // // The first record in a JPEG/Photoshop IPTC block must be
            // // the record version.
            // if (recordType != 0)
            // throw new ImageReadException("Missing record version: "
            // + recordType);
            // recordVersion = new Integer(convertByteArrayToShort(
            // "recordNumber", recordData));
            //
            // if (recordSize != 2)
            // throw new ImageReadException(
            // "Invalid record version record size: " + recordSize);
            //
            // // JPEG/Photoshop IPTC metadata is always in Record version
            // // 2
            // if (recordVersion.intValue() != 2)
            // throw new ImageReadException(
            // "Invalid IPTC record version: " + recordVersion);
            //
            // // Debug.debug("recordVersion", recordVersion);
            // continue;
            // }

            final String value = new String(recordData, "ISO-8859-1");

            final IptcType iptcType = IptcTypeLookup.getIptcType(recordType);

            // Debug.debug("iptcType", iptcType);
            // debugByteArray("iptcData", iptcData);
            // Debug.debug();

            // if (recordType == IPTC_TYPE_CREDIT.type
            // || recordType == IPTC_TYPE_OBJECT_NAME.type)
            // {
            // this.debugByteArray("recordData", recordData);
            // Debug.debug("index", IPTC_TYPE_CREDIT.name);
            // }

            final IptcRecord element = new IptcRecord(iptcType, recordData, value);
            elements.add(element);
        }

        return elements;
    }

    protected List<IptcBlock> parseAllBlocks(final byte bytes[], final boolean verbose,
            final boolean strict) throws ImageReadException, IOException {
        final List<IptcBlock> blocks = new ArrayList<IptcBlock>();

        BinaryInputStream bis = null;
        boolean canThrow = false;
        try {
            bis = new BinaryInputStream(new ByteArrayInputStream(bytes), APP13_BYTE_ORDER);

            // Note that these are unsigned quantities. Name is always an even
            // number of bytes (including the 1st byte, which is the size.)
    
            final byte[] idString = bis.readBytes(
                    JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.size(),
                    "App13 Segment missing identification string");
            if (!JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.equals(idString)) {
                throw new ImageReadException("Not a Photoshop App13 Segment");
            }
    
            // int index = PHOTOSHOP_IDENTIFICATION_STRING.length;
    
            while (true) {
                final int imageResourceBlockSignature;
                try {
                    imageResourceBlockSignature = bis.read4Bytes(
                            "Image Resource Block missing identification string");
                } catch (final IOException ioEx) {
                    break;
                }
                if (imageResourceBlockSignature != JpegConstants.CONST_8BIM) {
                    throw new ImageReadException(
                            "Invalid Image Resource Block Signature");
                }
    
                final int blockType = bis
                        .read2Bytes("Image Resource Block missing type");
                if (verbose) {
                    Debug.debug("blockType",
                            blockType + " (0x" + Integer.toHexString(blockType)
                                    + ")");
                }
    
                final int blockNameLength = bis.readByte("Name length",
                        "Image Resource Block missing name length");
                if (verbose && blockNameLength > 0) {
                    Debug.debug("blockNameLength", blockNameLength + " (0x"
                            + Integer.toHexString(blockNameLength) + ")");
                }
                byte[] blockNameBytes;
                if (blockNameLength == 0) {
                    bis.readByte("Block name bytes", "Image Resource Block has invalid name");
                    blockNameBytes = new byte[0];
                } else {
                    try {
                        blockNameBytes = bis.readBytes(blockNameLength,
                                "Invalid Image Resource Block name");
                    } catch (final IOException ioEx) {
                        if (strict) {
                            throw ioEx;
                        }
                        break;
                    }
    
                    if (blockNameLength % 2 == 0) {
                        bis.readByte("Padding byte", "Image Resource Block missing padding byte");
                    }
                }
    
                final int blockSize = bis
                        .read4Bytes("Image Resource Block missing size");
                if (verbose) {
                    Debug.debug("blockSize",
                            blockSize + " (0x" + Integer.toHexString(blockSize)
                                    + ")");
                }
    
                /*
                 * doesn't catch cases where blocksize is invalid but is still less
                 * than bytes.length but will at least prevent OutOfMemory errors
                 */
                if (blockSize > bytes.length) {
                    throw new ImageReadException("Invalid Block Size : "
                            + blockSize + " > " + bytes.length);
                }
    
                final byte[] blockData;
                try {
                    blockData = bis.readBytes(blockSize, "Invalid Image Resource Block data");
                } catch (final IOException ioEx) {
                    if (strict) {
                        throw ioEx;
                    }
                    break;
                }
    
                blocks.add(new IptcBlock(blockType, blockNameBytes, blockData));
    
                if ((blockSize % 2) != 0) {
                    bis.readByte("Padding byte", "Image Resource Block missing padding byte");
                }
            }
    
            canThrow = true;
            return blocks;
        } finally {
            IoUtils.closeQuietly(canThrow, bis);
        }
    }

    // private void writeIPTCRecord(BinaryOutputStream bos, )

    public byte[] writePhotoshopApp13Segment(final PhotoshopApp13Data data)
            throws IOException, ImageWriteException {
        final ByteArrayOutputStream os = new ByteArrayOutputStream();
        final BinaryOutputStream bos = new BinaryOutputStream(os);

        JpegConstants.PHOTOSHOP_IDENTIFICATION_STRING.writeTo(bos);

        final List<IptcBlock> blocks = data.getRawBlocks();
        for (IptcBlock block : blocks) {
            bos.write4Bytes(JpegConstants.CONST_8BIM);

            if (block.blockType < 0 || block.blockType > 0xffff) {
                throw new ImageWriteException("Invalid IPTC block type.");
            }
            bos.write2Bytes(block.blockType);

            if (block.blockNameBytes.length > 255) {
                throw new ImageWriteException("IPTC block name is too long: "
                        + block.blockNameBytes.length);
            }
            bos.write(block.blockNameBytes.length);
            bos.write(block.blockNameBytes);
            if (block.blockNameBytes.length % 2 == 0) {
                bos.write(0); // pad to even size, including length byte.
            }

            if (block.blockData.length > IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE) {
                throw new ImageWriteException("IPTC block data is too long: "
                        + block.blockData.length);
            }
            bos.write4Bytes(block.blockData.length);
            bos.write(block.blockData);
            if (block.blockData.length % 2 == 1) {
                bos.write(0); // pad to even size
            }

        }

        bos.flush();
        return os.toByteArray();
    }

    public byte[] writeIPTCBlock(List<IptcRecord> elements)
            throws ImageWriteException, IOException {
        byte blockData[];
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BinaryOutputStream bos = null;
        boolean canThrow = false;
        try {
            bos = new BinaryOutputStream(baos,
                    getByteOrder());
    
            // first, right record version record
            bos.write(IptcConstants.IPTC_RECORD_TAG_MARKER);
            bos.write(IptcConstants.IPTC_APPLICATION_2_RECORD_NUMBER);
            bos.write(IptcTypes.RECORD_VERSION.type); // record version record
                                                      // type.
            bos.write2Bytes(2); // record version record size
            bos.write2Bytes(2); // record version value
    
            // make a copy of the list.
            elements = new ArrayList<IptcRecord>(elements);
    
            // sort the list. Records must be in numerical order.
            final Comparator<IptcRecord> comparator = new Comparator<IptcRecord>() {
                public int compare(final IptcRecord e1, final IptcRecord e2) {
                    return e2.iptcType.getType() - e1.iptcType.getType();
                }
            };
            Collections.sort(elements, comparator);
            // TODO: make sure order right
    
            // write the list.
            for (IptcRecord element : elements) {
                if (element.iptcType == IptcTypes.RECORD_VERSION) {
                    continue; // ignore
                }

                bos.write(IptcConstants.IPTC_RECORD_TAG_MARKER);
                bos.write(IptcConstants.IPTC_APPLICATION_2_RECORD_NUMBER);
                if (element.iptcType.getType() < 0
                        || element.iptcType.getType() > 0xff) {
                    throw new ImageWriteException("Invalid record type: "
                            + element.iptcType.getType());
                }
                bos.write(element.iptcType.getType());

                final byte recordData[] = element.value.getBytes("ISO-8859-1");
                if (!new String(recordData, "ISO-8859-1").equals(element.value)) {
                    throw new ImageWriteException(
                            "Invalid record value, not ISO-8859-1");
                }

                bos.write2Bytes(recordData.length);
                bos.write(recordData);
            }
            canThrow = true;
        } finally {
            IoUtils.closeQuietly(canThrow, bos);
        }

        blockData = baos.toByteArray();

        return blockData;
    }

}
