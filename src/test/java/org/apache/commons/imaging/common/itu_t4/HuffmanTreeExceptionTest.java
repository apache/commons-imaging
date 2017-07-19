package org.apache.commons.imaging.common.itu_t4;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class HuffmanTreeExceptionTest{

    @Test
    public void testCreatesHuffmanTreeExceptionTakingString() {
        HuffmanTreeException huffmanTreeException = new HuffmanTreeException("");
        HuffmanTreeException huffmanTreeExceptionTwo = new HuffmanTreeException("", huffmanTreeException);

        assertFalse(huffmanTreeExceptionTwo.equals(huffmanTreeException));
    }

}