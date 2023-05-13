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

package org.apache.commons.imaging.test.util;

import java.util.ArrayList;

import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.icc.IccTag;
import org.openjdk.jol.info.ClassLayout;

public class PrintShallowObjectSizes {

    public static void print(final Class<?>... classes) {
        new PrintShallowObjectSizes().go(classes);
    }

    public static void main(final String[] args) {
        new PrintShallowObjectSizes().go(String.class,
                org.apache.commons.imaging.formats.jpeg.segments.SofnSegment.Component.class,
                org.apache.commons.imaging.formats.jpeg.segments.SosSegment.Component.class, RationalNumber.class,
                IccTag.class, ArrayList.class);
    }

    public void go(final Class<?>... classes) {
        for (final Class<?> cls : classes) {
            final ClassLayout classLayout = ClassLayout.parseClass(cls);
            System.out.println(classLayout.toPrintable());
            System.out.printf("%s shallow size = %,d bytes%n", cls, classLayout.instanceSize());
        }

    }
}
