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
package org.apache.commons.imaging.formats.png.scanline.filters;

// Encapsulate filtering in this class, instead of embedding the process

import java.util.Arrays;


// in ScanExpediter

/**
 * Filters (and also un-filters) pixel data in each scan-line using
 * filter method 0.
 * 
 * Each scan-line is fed into an {@code AdaptiveFilter} object, which
 * in turn manipulates the bytes and transforms them from filtered and
 * un-filtered forms.
 * 
 * @author Shukant Pal
 */
public class AdaptiveFilter {
    
    public enum FilterType {
      NONE, SUB, UP, AVG, PAETH;
    };
    
    /**
     * Scan-line on which this filter was invoked before.
     */
    private byte[] previous;

    /**
     * Scan-line on which this adaptive filter is working
     * on.
     */
    private byte[] working;
    
    /**
     * Bytes per pixel.
     */
    private final int bpp;
    
    /**
     * Set of filterer objects for this AdaptiveFilter.
     */
    private final Filterer filterSet[] = {
        new NoneFilterer(),
        new SubFilterer(),
        new UpFilterer(),
        new AvgFilterer(),
        new PaethFilterer(),
    };
    
    /**
     * Constructs a new {@code AdaptiveFilter} object for a PNG
     * image which stores each pixel in the given size.
     * 
     * @param bytesPerPixel 
     */
    public AdaptiveFilter(int bytesPerPixel) {
        this.bpp = bytesPerPixel;
        this.previous = null;
        this.working = null;
    }
    
    public byte[] filter(FilterType type, byte[] scanLine) {
        working = Arrays.copyOf(scanLine, scanLine.length);
        filterSet[type.ordinal()].filterScanline();
        previous = Arrays.copyOf(scanLine, scanLine.length);
        return working;
    }
    
    public byte[] unfilter(FilterType type, byte[] scanLine) {
        working = Arrays.copyOf(scanLine, scanLine.length);
        filterSet[type.ordinal()].unfilterScanline();
        previous = working;
        return working;// working=previous right now
    }
    
    public byte[] unfilter(int type, byte[] scanLine) {
        return unfilter(FilterType.values()[type], scanLine);
    }
    
    /**
     * {@code AdaptiveFilter} primarily uses the Filterer object
     * to actually handle scan-line operations.
     * 
     * A filterer object supports filtering and un-filtering a
     * scan-line (depending on its inherent type).
     */
    private abstract class Filterer {
        
        /**
         * Returns the byte at offset in the working scan-line, and
         * zero if offset is less than 0.
         * 
         * @param offset offset of byte in scan-line
         * @return Raw(offset) as defined by PNG specs
         */
        protected int raw(int offset) {
            return (offset < 0) ? 0 : working[offset] & 0xFF;
        }
        
        /**
         * Returns the byte at offset in the scan-line above the
         * working one.
         * 
         * If working scan-line is the first one, then returns
         * 0.
         * 
         * @param offset
         * @return Prior(offset) as defined by PNG specs
         */
        protected int prior(int offset) {
            if(previous != null)
                return (offset < 0) ? 0 : previous[offset] & 0xFF;
            return 0;
        }

        /**
         * Filters the scan-line for this filterer type.
         * 
         * @return 
         */
        abstract void filterScanline();
        
        /**
         * Un-filters the scan-line for this filterer type.
         */
        abstract void unfilterScanline();
        
    }
    
    private class NoneFilterer extends Filterer {

        @Override
        void filterScanline() {
        }

        @Override
        void unfilterScanline() {
        }
        
    }
    
    private class SubFilterer extends Filterer {

        @Override
        public void filterScanline() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        void unfilterScanline() {
           for (int x = 0; x < working.length; x++) {
               working[x] = (byte) ((working[x] + raw(x - bpp)) & 0xFF);
           }
        }
        
    }
    
    private class UpFilterer extends Filterer {

        @Override
        void filterScanline() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        void unfilterScanline() {
            for (int x = 0; x < working.length; x++) {
                working[x] = (byte) ((working[x] + prior(x)) & 0xFF);
            }
        }
        
    }
    
    private class AvgFilterer extends Filterer {

        @Override
        void filterScanline() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        void unfilterScanline() {
            for(int x = 0; x < working.length; x++) {
                final int average = (raw(x-bpp) + prior(x)) / 2;
                working[x] = (byte)((working[x] + average) & 0xFF);
            }
        }
        
    }
    
    private class PaethFilterer extends Filterer {
 
        /* Taken from PNG specs */
        private int paethPredictor(int a, int b, int c) {
            // ; a = left, b = above, c = upper left
            final int p = a + b - c; // ; initial estimate
            final int pa = Math.abs(p - a); // ; distances to a, b, c
            final int pb = Math.abs(p - b);
            final int pc = Math.abs(p - c);
            // ; return nearest of a,b,c,
            // ; breaking ties in order a,b,c.
            if ((pa <= pb) && (pa <= pc)) {
                return a;
            } else if (pb <= pc) {
                return b;
            } else {
                return c;
            }
        }
        
        @Override
        void filterScanline() {
            for(int x = working.length - 1; x >= 0; x--) {
                working[x] = (byte) ((working[x] -
                        paethPredictor(raw(x-bpp), prior(x), prior(x-bpp))) & 0xFF);
            }
        }

        @Override
        void unfilterScanline() {
            for(int x = 0; x < working.length; x++) {
                working[x] = (byte) ((working[x] +
                        paethPredictor(raw(x-bpp), prior(x), prior(x-bpp))) & 0xFF);
            }
        }
        
    }
    
}
