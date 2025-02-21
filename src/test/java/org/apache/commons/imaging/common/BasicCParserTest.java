package org.apache.commons.imaging.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.formats.tiff.TiffCoverageLogger;
import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

public class BasicCParserTest {
    
    @Test
    /**
     * To pass this test the input value must be empty, which is why we initialize the 
     * input string to the parser as an empty byte array (it's thus empty) and will 
     * not enter nextToken()-for-loop and thus result in a return of null
       */
    public void testEmptyStreamReturnsNull() throws IOException, ImagingException {
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(new byte[0]));
        String result = p.nextToken();
        assertNull(result);
    }

    @Test
    /**
     * As there was no test case that caught the switch case statement of backslash 
     * we need to first reach the switch case (the input must start with a quotation mark) 
     * and then a backslash, then the string must be correctly terminated as to not get an exception
       */
    public void testBackSlashCase() throws IOException, ImagingException {
        String input = "\"\\wow\"";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
        assertEquals("\"\\wow\"", p.nextToken());
    }

    /**
     * Then we need to test the case when we are parsing a string and have seen a backslash 
     * and then the next character is a quotation such that we have "\""".
     * Then ending the string with another quotation we have a valid string.
       */
    @Test
    public void testQuotationWithBackslash() throws IOException, ImagingException {
        String input = "\"\\\"\"";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
        assertEquals("\"\\\"\"", p.nextToken());
    }

    /**
     * We want to check the cases when in a string, we have an indicator of a  
     * raw string or a new line - which should throw an ImagingException. The \r would 
     * cause the \n-exception to be thrown thus they throw the same exception
       */
    @Test
    public void testRawStringPrefixAndNewlineCausesSameException() throws IOException, ImagingException {
        String input1 = "\"\r\"";
        String input2 = "\"\n";
        BasicCParser p1 = new BasicCParser(new ByteArrayInputStream(input1.getBytes()));
        BasicCParser p2 = new BasicCParser(new ByteArrayInputStream(input2.getBytes()));
        
        Exception e1 = assertThrows(ImagingException.class, () -> { p1.nextToken(); });
        Exception e2 = assertThrows(ImagingException.class, () -> { p2.nextToken(); });

        assertEquals(e1.getMessage(), e2.getMessage());
    }

    /**
     * We want to test a valid identifier that begins with an underscore
     * There are two ways to indicate an identifier token, underscore and if
     * the first character is a letter or digit. The first case is never tested in the
     * original test suite. Thus is why this test exists.
       */
    @Test
    public void testValidIdentifier() throws IOException, ImagingException {
        String input = "_abs?2485_";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
        Character expected = '_';
        assertEquals(expected, p.nextToken().charAt(0));
    }

    /**
     * Then we have three inputs which should just be ignored - if an input
     * start with a tab, carriage return or newline (and is NOT IN a string)
     * then we just ignore them and return whatever's after them if that input
     * is valid.
       */
    @Test
    public void testTokenStartingWithTabCarriageReturnNewlineIgnored() throws IOException, ImagingException {
        String input1 = "\t4";
        String input2 = "\r5";
        String input3 = "\n6";
        BasicCParser p1 = new BasicCParser(new ByteArrayInputStream(input1.getBytes()));
        BasicCParser p2 = new BasicCParser(new ByteArrayInputStream(input2.getBytes()));
        BasicCParser p3 = new BasicCParser(new ByteArrayInputStream(input3.getBytes()));

        String concat = p1.nextToken() + p2.nextToken() + p3.nextToken();

        assertEquals("456", concat);
    }

    /**
     * Then we want to create a test which runs through the case of invalid or unhandled characters
     * which should throw an exception.
       */
    @Test
    public void testInvalidCharacterException() throws IOException, ImagingException {
        String input = "?abs?2485_";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
        Exception e = assertThrows(ImagingException.class, () -> { p.nextToken(); });

        String unhandled = e.getMessage().substring(0, 9);
        assertEquals(unhandled, "Unhandled");
    }

    /**
     * Create a test which checks an invalid string which did not terminate
     * correctly.
     * which should throw an exception.
     */
    @Test
    public void testInvalidString() throws IOException, ImagingException {
        String input = "\"";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));
        Exception e = assertThrows(ImagingException.class, () -> {
            p.nextToken();
        });
        String expectedMessage = "Unterminated string ends XMP file";

        assertEquals(expectedMessage, e.getMessage());
    }

    /**
     * Test that a string works with carriage return prefixing it
     */
    @Test
    public void testValidString() throws IOException, ImagingException {
        String input = "\r\"abc\"";
        BasicCParser p = new BasicCParser(new ByteArrayInputStream(input.getBytes()));

        assertEquals("\"abc\"", p.nextToken());
    }
}
