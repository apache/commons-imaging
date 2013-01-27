package org.apache.commons.imaging.formats.jpeg.exif;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.common.IImageMetadata;
import org.apache.commons.imaging.formats.jpeg.JpegImageMetadata;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffConstants;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

public class MicrosoftTagTest extends ExifBaseTest {
    private static final String author = "author";
    private static final String comment = "comment";
    private static final String subject = "subject";
    private static final String title = "title";

    public void testWrite() throws Exception {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        TiffOutputSet exifSet = new TiffOutputSet();
        TiffOutputDirectory exif = exifSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, author);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, comment);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, subject);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, title);
        Map<String,Object> params = new TreeMap<String,Object>();
        params.put(TiffConstants.PARAM_KEY_EXIF, exifSet);
        byte[] bytes = Imaging.writeImageToBytes(image, ImageFormat.IMAGE_FORMAT_TIFF, params);
        checkFields(bytes);
    }
    
    private TiffImageMetadata toTiffMetadata(IImageMetadata metadata) throws Exception {
        if (metadata instanceof JpegImageMetadata) {
            return ((JpegImageMetadata)metadata).getExif();
        } else if (metadata instanceof TiffImageMetadata) {
            return ((TiffImageMetadata)metadata);
        } else {
            throw new Exception("bad metadata format");
        }
    }
    
    public void testRewrite() throws Exception {
        File imageWithExif = getImageWithExifData();
        TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(imageWithExif));
        ExifRewriter rewriter = new ExifRewriter();
        TiffOutputSet outputSet = metadata.getOutputSet();
        TiffOutputDirectory exif = outputSet.getOrCreateExifDirectory();
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR, author);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT, comment);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT, subject);
        exif.add(MicrosoftTagConstants.EXIF_TAG_XPTITLE, title);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        rewriter.updateExifMetadataLossy(imageWithExif, baos, outputSet);
        checkFields(baos.toByteArray());
    }
    
    private void checkFields(byte[] file) throws Exception {
        TiffImageMetadata metadata = toTiffMetadata(Imaging.getMetadata(file));
        assertEquals(author, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPAUTHOR));
        assertEquals(comment, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPCOMMENT));
        assertEquals(subject, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPSUBJECT));
        assertEquals(title, metadata.getFieldValue(MicrosoftTagConstants.EXIF_TAG_XPTITLE));
       
    }
}
