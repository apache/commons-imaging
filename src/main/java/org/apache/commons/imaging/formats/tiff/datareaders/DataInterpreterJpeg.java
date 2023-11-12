/* --------------------------------------------------------------------
 * Copyright (C) 2023  Gary W. Lucas.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---------------------------------------------------------------------
 */

package org.apache.commons.imaging.formats.tiff.datareaders;

import static org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants.EXIF_TAG_JPEGTABLES;
import static org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.PHOTOMETRIC_INTERPRETATION_VALUE_RGB;
import static org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_PHOTOMETRIC_INTERPRETATION;

import java.awt.image.BufferedImage;
import java.io.IOException;

import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.bytesource.ByteSource;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.jpeg.decoder.JpegDecoder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;

/**
 * Provides logic for obtaining image data from a JPEG-encoded TIFF strip
 * or tile (the "block") from the source file.
 */
class DataInterpreterJpeg {

    /**
     * Interpret the content of a TIFF strip or tile obtained from the
     * source file. The workingBuilder is an image builder that is
     * configured to receive the extracted data.
     * <p>
     * The dimensions of the workingBuilder may or may not be identical
     * to those of the source image. If the calling module is extracting
     * a partial image, the workingBuilder will be sized so that its
     * upper-left corner coordinate (row and column) and width and height
     * are all even multiples of the dimensions of the tile or strip
     * definition from the source. The reason for that approach
     * is to simplify some of the logic in the legacy code by
     * eliminating bounds-checking in the transfer loops.
     *
     * @param directory the source directory containing JPEG tables
     * @param workingBuilder the output image-builder to receive pixels.
     * @param xBlock column offset of the block within the workingBuilder
     * @param yBlock row offset of the block within the workingBuilder
     * @param blockWidth the width of the block (may be smaller than the
     * full width of the JPEG image obtained from the source data)
     * @param blockHeight the height of the block (may be smaller than the full
     * height of the JPEG image obtained from the source data)
     * @param compressed the raw bytes from the TIFF source file
     * @throws ImagingException in the event of an unsupported feature or
     * JPEG-specific encoding error
     * @throws IOException in the event of an unrecoverable I/O error
     */
    void intepretBlock(final TiffDirectory directory,
      final ImageBuilder workingBuilder,
      final int xBlock,
      final int yBlock,
      final int blockWidth,
      final int blockHeight,
      final byte[] compressed)
      throws ImagingException, IOException {
        // the data for the block.   The TIFF format can store some
        // of the internal JPEG tables in a separate TIFF field (tag) called
        // "JPEG Tables" which are used for all of the tiles in the file.
        // So we need to concatenate the field bytes into the
        // compressed sequence. Both the field bytes and compressed
        // arrays start and end with the sequences SOI (0xffd8)
        // and EOI (0xffd9).  To concatenate the two, we need to get rid
        // of the EOI from field bytes and SOI from compressed.
        if (compressed.length <= 4) {
            return;
        }

        byte[] concat;

        byte[] field = directory.getFieldValue(EXIF_TAG_JPEGTABLES, false);

        if (field == null || field.length == 0) {
            // The TIFF information was ommitted.
            // We will just pass the compressed sequence to the
            // decoder and let it throw the relevant exception.
            // There is a possibility that some non-standard
            // TIFF encoders might not use the JPEG Tables tag
            // but embed to coding values in the compressed sequence
            concat = compressed;
        } else {
            concat = new byte[field.length + compressed.length - 4];
            System.arraycopy(field, 0, concat, 0, field.length - 2);
            System.arraycopy(compressed, 2,
              concat, field.length - 2,
              compressed.length - 2);
        }

        final ByteSource bsArray = ByteSource.array(concat, "JPEGtile");

        // Set up the decoder.  In some cases, TIFF files may
        // use the RGB encoding (which is slightly unusual for JPEGs).
        // So check the photometric interpretation.  If it is
        // RGB, we make a special setting in the decoder.  Otherwise,
        // we let the decoder act according to the standard
        // JPEG rules.
        final JpegDecoder decoder = new JpegDecoder();

        final TiffField piField
          = directory.findField(TIFF_TAG_PHOTOMETRIC_INTERPRETATION);

        if (piField != null) {
            final int pi = piField.getIntValue();
            if (pi == PHOTOMETRIC_INTERPRETATION_VALUE_RGB) {
                decoder.setTiffRgb();
            }
        }

        final BufferedImage bImage = decoder.decode(bsArray);
        // a null result is not expected.  An exception would
        // be thrown if there was a formatting error
        final int iWidth = bImage.getWidth();
        final int iHeight = bImage.getHeight();
        final int[] argb = new int[iWidth * iHeight];
        bImage.getRGB(0, 0, iWidth, iHeight, argb, 0, iWidth);

        // Limit iHeight and iWidth in case the JPEG block
        // extends past the output image size
        final int i1 = iHeight > blockHeight ? blockHeight : iHeight;
        final int j1 = iWidth > blockWidth? blockWidth : iWidth;

        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                workingBuilder.setRgb(j + xBlock, i + yBlock, argb[i * iWidth + j]);
            }
        }
    }
}
