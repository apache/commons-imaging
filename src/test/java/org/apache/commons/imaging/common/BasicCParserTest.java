// package org.apache.commons.imaging.common;

// import java.io.ByteArrayInputStream;
// import java.io.IOException;

// import org.apache.commons.imaging.Imaging;
// import org.apache.commons.imaging.ImagingException;
// import org.apache.commons.imaging.formats.tiff.TiffCoverageLogger;
// import org.junit.jupiter.api.Test;

// // import static org.junit.jupiter.api.Assertions.assertThrows;
// import static org.junit.jupiter.api.Assertions.*;

// public class BasicCParserTest {
    
//     @Test
//     /**
//      * To pass this test the input value must be empty, which is why we initialize the 
//      * input string to the parser as an empty byte array (it's thus empty) and will 
//      * not enter nextToken()-for-loop and thus result in a return of null
//        */
//     public void testEmptyStreamReturnsNull() throws IOException, ImagingException {
//         BasicCParser p = new BasicCParser(new ByteArrayInputStream(new byte[0]));
//         String result = p.nextToken();
//         assertNull(result);
//     }

//     @Test
//     /**
//      * As there was no test case that caught the switch case statement of backslash 
//      * we need to first reach the switch case (the input must start with a quotation mark) 
//      * and then a backslash, then the string must be correctly terminated as to not get an exception
//        */
//     public void testBackSlashCase() throws IOException, ImagingException {
//         String input = "\"\\wow\"";
//         BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
//         assertEquals("\"\\wow\"", p.nextToken());
//     }

//     @Test
//     public void testQuotationWithBackslash() throws IOException, ImagingException {
//         String input = "\"\\\"\"";
//         BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
//         assertEquals("\"\\\"\"", p.nextToken());
//     }

//     @Test
//     public void testRawStringPrefixAndNewlineCausesSameException() throws IOException, ImagingException {
//         String input1 = "\"\r\"";
//         String input2 = "\"\n";
//         BasicCParser p1 = new BasicCParser(new ByteArrayInputStream(input1.getBytes()));
//         BasicCParser p2 = new BasicCParser(new ByteArrayInputStream(input2.getBytes()));
        
//         Exception e1 = assertThrows(ImagingException.class, () -> { p1.nextToken(); });
//         Exception e2 = assertThrows(ImagingException.class, () -> { p2.nextToken(); });

//         assertEquals(e1.getMessage(), e2.getMessage());
//     }

//     @Test
//     public void testValidIdentifier() throws IOException, ImagingException {
//         String input = "_abs?2485_";
//         BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
//         Character expected = '_';
//         assertEquals(expected, p.nextToken().charAt(0));
//     }

//     @Test
//     public void testTokenStartingWithTabCarriageReturnNewlineIgnored() throws IOException, ImagingException {
//         String input1 = "\t4";
//         String input2 = "\r5";
//         String input3 = "\n6";
//         BasicCParser p1 = new BasicCParser(new ByteArrayInputStream(input1.getBytes()));
//         BasicCParser p2 = new BasicCParser(new ByteArrayInputStream(input2.getBytes()));
//         BasicCParser p3 = new BasicCParser(new ByteArrayInputStream(input3.getBytes()));

//         String concat = p1.nextToken() + p2.nextToken() + p3.nextToken();

//         assertEquals("456", concat);
//     }

//     @Test
//     public void testInvalidCharacterException() throws IOException, ImagingException {
//         String input = "?abs?2485_";
//         BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
//         Exception e = assertThrows(ImagingException.class, () -> { p.nextToken(); });

//         String unhandled = e.getMessage().substring(0, 9);
//         assertEquals(unhandled, "Unhandled");
//     }
// }
