/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/DeleteStreamingImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStreamingImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The streaming image.
     * </p>
     */
    private StreamingImage streamingImage;

    /**
     * <p>
     * The streaming image.
     * </p>
     * 
     * @param streamingImage
     *        The streaming image.
     */

    public void setStreamingImage(StreamingImage streamingImage) {
        this.streamingImage = streamingImage;
    }

    /**
     * <p>
     * The streaming image.
     * </p>
     * 
     * @return The streaming image.
     */

    public StreamingImage getStreamingImage() {
        return this.streamingImage;
    }

    /**
     * <p>
     * The streaming image.
     * </p>
     * 
     * @param streamingImage
     *        The streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStreamingImageResult withStreamingImage(StreamingImage streamingImage) {
        setStreamingImage(streamingImage);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamingImage() != null)
            sb.append("StreamingImage: ").append(getStreamingImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStreamingImageResult == false)
            return false;
        DeleteStreamingImageResult other = (DeleteStreamingImageResult) obj;
        if (other.getStreamingImage() == null ^ this.getStreamingImage() == null)
            return false;
        if (other.getStreamingImage() != null && other.getStreamingImage().equals(this.getStreamingImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingImage() == null) ? 0 : getStreamingImage().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStreamingImageResult clone() {
        try {
            return (DeleteStreamingImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
