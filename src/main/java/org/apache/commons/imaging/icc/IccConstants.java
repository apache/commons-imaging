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
package org.apache.commons.imaging.icc;

public final class IccConstants {
    public static final int IEC = (((0xff & 'I') << 24) | ((0xff & 'E') << 16)
            | ((0xff & 'C') << 8) | ((0xff & ' ') << 0));
    public static final int sRGB = (((0xff & 's') << 24) | ((0xff & 'R') << 16)
            | ((0xff & 'G') << 8) | ((0xff & 'B') << 0));

    private IccConstants() {
    }
}
