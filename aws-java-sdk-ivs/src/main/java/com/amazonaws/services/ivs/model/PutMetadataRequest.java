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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the channel into which metadata is inserted. This channel must have an active stream.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * Metadata to insert into the stream. Maximum: 1 KB per request.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * ARN of the channel into which metadata is inserted. This channel must have an active stream.
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel into which metadata is inserted. This channel must have an active stream.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * ARN of the channel into which metadata is inserted. This channel must have an active stream.
     * </p>
     * 
     * @return ARN of the channel into which metadata is inserted. This channel must have an active stream.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * ARN of the channel into which metadata is inserted. This channel must have an active stream.
     * </p>
     * 
     * @param channelArn
     *        ARN of the channel into which metadata is inserted. This channel must have an active stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * Metadata to insert into the stream. Maximum: 1 KB per request.
     * </p>
     * 
     * @param metadata
     *        Metadata to insert into the stream. Maximum: 1 KB per request.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata to insert into the stream. Maximum: 1 KB per request.
     * </p>
     * 
     * @return Metadata to insert into the stream. Maximum: 1 KB per request.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Metadata to insert into the stream. Maximum: 1 KB per request.
     * </p>
     * 
     * @param metadata
     *        Metadata to insert into the stream. Maximum: 1 KB per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetadataRequest withMetadata(String metadata) {
        setMetadata(metadata);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetadataRequest == false)
            return false;
        PutMetadataRequest other = (PutMetadataRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public PutMetadataRequest clone() {
        return (PutMetadataRequest) super.clone();
    }

}
