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
package org.apache.commons.imaging.common.itu_t4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.imaging.common.BitInputStreamFlexible;

/**
 * A Huffman tree implemented as 1 array for high locality of reference.
 */
class HuffmanTree<T> {
    private final List<Node<T>> nodes = new ArrayList<Node<T>>();
    
    private final static class Node<T> {
        boolean empty = true;
        T value;
    }

    public final void insert(final String pattern, final T value) throws HuffmanTreeException {
        int position = 0;
        Node node = growAndGetNode(position);
        if (node.value != null) {
            throw new HuffmanTreeException("Can't add child to a leaf");
        }
        for (int patternPosition = 0; patternPosition < pattern.length(); patternPosition++) {
            final char nextChar = pattern.charAt(patternPosition);
            if (nextChar == '0') {
                position = (position << 1) + 1;
            } else {
                position = (position + 1) << 1;
            }
            node = growAndGetNode(position);
            if (node.value != null) {
                throw new HuffmanTreeException("Can't add child to a leaf");
            }
        }
        node.value = value;
    }

    private Node<T> growAndGetNode(final int position) {
        while (position >= nodes.size()) {
            nodes.add(new Node<T>());
        }
        final Node<T> node = nodes.get(position);
        node.empty = false;
        return node;
    }

    public final T decode(final BitInputStreamFlexible bitStream) throws HuffmanTreeException {
        int position = 0;
        Node<T> node = nodes.get(0);
        while (node.value == null) {
            int nextBit;
            try {
                nextBit = bitStream.readBits(1);
            } catch (final IOException ioEx) {
                throw new HuffmanTreeException(
                        "Error reading stream for huffman tree", ioEx);
            }
            if (nextBit == 0) {
                position = (position << 1) + 1;
            } else {
                position = (position + 1) << 1;
            }
            if (position >= nodes.size()) {
                throw new HuffmanTreeException("Invalid bit pattern");
            }
            node = nodes.get(position);
            if (node.empty) {
                throw new HuffmanTreeException("Invalid bit pattern");
            }
        }
        return node.value;
    }
}
