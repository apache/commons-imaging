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

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

/**
 * Ant task of image conversion
 * 
 */
public class ImageConverterTask extends Task {

	/**path of the source image*/
	private String src;

	/**path of the destination image*/
	private String dst;
	
	/**image converter*/
	private final ImageConverter delegate;
	
	/**
	 * Constructor
	 */
	public ImageConverterTask() {
		super();
		this.delegate = new ImageConverter();
	}

	@Override
	public void execute() throws BuildException {
		if (src == null) {
			throw new BuildException("The src attribute cannot be null");
		}
		if (dst == null) {
			throw new BuildException("The dst attribute cannot be null");
		}
		final File srcFile = new File(getProject().getBaseDir(), src);
		final File dstFile = new File(getProject().getBaseDir(), dst);
		try {
			this.delegate.convertImage(srcFile, dstFile);
		} catch (Exception e) {
			throw new BuildException("The conversion of the image file " + src
					+ " failed", e);
		}
	}
	
	/**
	 * Sets the path of the destination image
	 * 
	 * @param dst
	 */
	public void setDst(String dst) {
		this.dst = dst;
	}

	/**
	 * Sets the path of the source image
	 * 
	 * @param src
	 */
	public void setSrc(String src) {
		this.src = src;
	}
	
	public void setSourceImageIndex(final int sourceImageIndex) {
		this.delegate.setSourceImageIndex(sourceImageIndex);
	}
	
	public void setIndexOfSmallestSourceImageComputationEnabled(
			boolean indexOfSmallestSourceImageComputationEnabled) {
		this.delegate.setIndexOfSmallestSourceImageComputationEnabled(indexOfSmallestSourceImageComputationEnabled);
	}
	
	public void setIndexOfBiggestSourceImageComputationEnabled(
			boolean indexOfBiggestSourceImageComputationEnabled) {
		this.delegate.setIndexOfBiggestSourceImageComputationEnabled(indexOfBiggestSourceImageComputationEnabled);
	}
	
	public void setSourceImageDuplicationAndRescaleEnabled(
			boolean sourceImageDuplicationAndRescaleEnabled) {
		this.delegate.setSourceImageDuplicationAndRescaleEnabled(sourceImageDuplicationAndRescaleEnabled);
	}
}
