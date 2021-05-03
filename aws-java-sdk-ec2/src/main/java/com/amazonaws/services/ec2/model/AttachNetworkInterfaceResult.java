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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of AttachNetworkInterface.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachNetworkInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the network interface attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * The index of the network card.
     * </p>
     */
    private Integer networkCardIndex;

    /**
     * <p>
     * The ID of the network interface attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the network interface attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the network interface attachment.
     * </p>
     * 
     * @return The ID of the network interface attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the network interface attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the network interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachNetworkInterfaceResult withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @param networkCardIndex
     *        The index of the network card.
     */

    public void setNetworkCardIndex(Integer networkCardIndex) {
        this.networkCardIndex = networkCardIndex;
    }

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @return The index of the network card.
     */

    public Integer getNetworkCardIndex() {
        return this.networkCardIndex;
    }

    /**
     * <p>
     * The index of the network card.
     * </p>
     * 
     * @param networkCardIndex
     *        The index of the network card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachNetworkInterfaceResult withNetworkCardIndex(Integer networkCardIndex) {
        setNetworkCardIndex(networkCardIndex);
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getNetworkCardIndex() != null)
            sb.append("NetworkCardIndex: ").append(getNetworkCardIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachNetworkInterfaceResult == false)
            return false;
        AttachNetworkInterfaceResult other = (AttachNetworkInterfaceResult) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getNetworkCardIndex() == null ^ this.getNetworkCardIndex() == null)
            return false;
        if (other.getNetworkCardIndex() != null && other.getNetworkCardIndex().equals(this.getNetworkCardIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getNetworkCardIndex() == null) ? 0 : getNetworkCardIndex().hashCode());
        return hashCode;
    }

    @Override
    public AttachNetworkInterfaceResult clone() {
        try {
            return (AttachNetworkInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
