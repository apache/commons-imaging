package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Unit tests for class {@link HuffmanTreeException}.
 *
 * @date 13.07.2017
 * @see HuffmanTreeException
 *
 **/
public class HuffmanTreeExceptionTest{


    @Test
    public void testCreatesHuffmanTreeExceptionTakingString() {

        HuffmanTreeException huffmanTreeException = new HuffmanTreeException("");
        HuffmanTreeException huffmanTreeExceptionTwo = new HuffmanTreeException("", huffmanTreeException);

        assertFalse(huffmanTreeExceptionTwo.equals(huffmanTreeException));

    }


}