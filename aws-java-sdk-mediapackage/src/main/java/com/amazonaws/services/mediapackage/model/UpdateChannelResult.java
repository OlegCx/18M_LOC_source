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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/UpdateChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) assigned to the Channel. */
    private String arn;
    /** A short text description of the Channel. */
    private String description;

    private EgressAccessLogs egressAccessLogs;

    private HlsIngest hlsIngest;
    /** The ID of the Channel. */
    private String id;

    private IngressAccessLogs ingressAccessLogs;

    private java.util.Map<String, String> tags;

    /**
     * The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the Channel.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     * @return The Amazon Resource Name (ARN) assigned to the Channel.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the Channel.
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) assigned to the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @return A short text description of the Channel.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A short text description of the Channel.
     * 
     * @param description
     *        A short text description of the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param egressAccessLogs
     */

    public void setEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        this.egressAccessLogs = egressAccessLogs;
    }

    /**
     * @return
     */

    public EgressAccessLogs getEgressAccessLogs() {
        return this.egressAccessLogs;
    }

    /**
     * @param egressAccessLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        setEgressAccessLogs(egressAccessLogs);
        return this;
    }

    /**
     * @param hlsIngest
     */

    public void setHlsIngest(HlsIngest hlsIngest) {
        this.hlsIngest = hlsIngest;
    }

    /**
     * @return
     */

    public HlsIngest getHlsIngest() {
        return this.hlsIngest;
    }

    /**
     * @param hlsIngest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withHlsIngest(HlsIngest hlsIngest) {
        setHlsIngest(hlsIngest);
        return this;
    }

    /**
     * The ID of the Channel.
     * 
     * @param id
     *        The ID of the Channel.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the Channel.
     * 
     * @return The ID of the Channel.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the Channel.
     * 
     * @param id
     *        The ID of the Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param ingressAccessLogs
     */

    public void setIngressAccessLogs(IngressAccessLogs ingressAccessLogs) {
        this.ingressAccessLogs = ingressAccessLogs;
    }

    /**
     * @return
     */

    public IngressAccessLogs getIngressAccessLogs() {
        return this.ingressAccessLogs;
    }

    /**
     * @param ingressAccessLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withIngressAccessLogs(IngressAccessLogs ingressAccessLogs) {
        setIngressAccessLogs(ingressAccessLogs);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateChannelResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEgressAccessLogs() != null)
            sb.append("EgressAccessLogs: ").append(getEgressAccessLogs()).append(",");
        if (getHlsIngest() != null)
            sb.append("HlsIngest: ").append(getHlsIngest()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIngressAccessLogs() != null)
            sb.append("IngressAccessLogs: ").append(getIngressAccessLogs()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelResult == false)
            return false;
        UpdateChannelResult other = (UpdateChannelResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEgressAccessLogs() == null ^ this.getEgressAccessLogs() == null)
            return false;
        if (other.getEgressAccessLogs() != null && other.getEgressAccessLogs().equals(this.getEgressAccessLogs()) == false)
            return false;
        if (other.getHlsIngest() == null ^ this.getHlsIngest() == null)
            return false;
        if (other.getHlsIngest() != null && other.getHlsIngest().equals(this.getHlsIngest()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIngressAccessLogs() == null ^ this.getIngressAccessLogs() == null)
            return false;
        if (other.getIngressAccessLogs() != null && other.getIngressAccessLogs().equals(this.getIngressAccessLogs()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEgressAccessLogs() == null) ? 0 : getEgressAccessLogs().hashCode());
        hashCode = prime * hashCode + ((getHlsIngest() == null) ? 0 : getHlsIngest().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIngressAccessLogs() == null) ? 0 : getIngressAccessLogs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelResult clone() {
        try {
            return (UpdateChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
