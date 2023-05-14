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
package org.apache.commons.imaging;

import java.io.IOException;

/**
 * The root class for implementing custom exceptions in the Apache Commons Imaging component.
 */
public class ImagingException extends IOException {

    private static final long serialVersionUID = -1L;

    static String getType(final Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof Object[]) {
            return "[Object[]: " + ((Object[]) value).length + "]";
        }
        if (value instanceof char[]) {
            return "[char[]: " + ((char[]) value).length + "]";
        }
        if (value instanceof byte[]) {
            return "[byte[]: " + ((byte[]) value).length + "]";
        }
        if (value instanceof short[]) {
            return "[short[]: " + ((short[]) value).length + "]";
        }
        if (value instanceof int[]) {
            return "[int[]: " + ((int[]) value).length + "]";
        }
        if (value instanceof long[]) {
            return "[long[]: " + ((long[]) value).length + "]";
        }
        if (value instanceof float[]) {
            return "[float[]: " + ((float[]) value).length + "]";
        }
        if (value instanceof double[]) {
            return "[double[]: " + ((double[]) value).length + "]";
        }
        if (value instanceof boolean[]) {
            return "[boolean[]: " + ((boolean[]) value).length + "]";
        }
        return value.getClass().getName();
    }

    /**
     * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently
     * be initialized by a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for later retrieval by the {@link #getMessage()}
     *                method.
     */
    public ImagingException(final String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * <p>
     * Note that the detail message associated with {@code cause} is <em>not</em> automatically incorporated in this
     * exception's detail message.
     * </p>
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param data    data typed to build the message.
     */
    public ImagingException(final String message, final Object data) {
        super(message + ": " + data + " (" + getType(data) + ")");
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * <p>
     * Note that the detail message associated with {@code cause} is <em>not</em> automatically incorporated in this
     * exception's detail message.
     * </p>
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the {@link #getCause()} method). (A {@code null}
     *                value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public ImagingException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
