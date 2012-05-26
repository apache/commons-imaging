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
class HuffmanTree {
    private final static class Node {
        boolean isEmpty = true;
        Object value = null;
    }

    private List<Node> nodes = new ArrayList<Node>();

    public final void insert(String pattern, Object value)
            throws HuffmanTreeException {
        int position = 0;
        Node node = growAndGetNode(position);
        if (node.value != null) {
            throw new HuffmanTreeException("Can't add child to a leaf");
        }
        for (int patternPosition = 0; patternPosition < pattern.length(); patternPosition++) {
            char nextChar = pattern.charAt(patternPosition);
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

    private Node growAndGetNode(int position) {
        while (position >= nodes.size()) {
            nodes.add(new Node());
        }
        Node node = nodes.get(position);
        node.isEmpty = false;
        return node;
    }

    public final Object decode(BitInputStreamFlexible bitStream)
            throws HuffmanTreeException {
        int position = 0;
        Node node = nodes.get(0);
        while (node.value == null) {
            int nextBit;
            try {
                nextBit = bitStream.readBits(1);
            } catch (IOException ioEx) {
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
            if (node.isEmpty) {
                throw new HuffmanTreeException("Invalid bit pattern");
            }
        }
        return node.value;
    }
}
