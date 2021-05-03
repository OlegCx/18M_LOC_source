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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInterconnectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     */
    private String interconnectName;
    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     */
    private String bandwidth;
    /**
     * <p>
     * The location of the interconnect.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The ID of the LAG.
     * </p>
     */
    private String lagId;
    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @param interconnectName
     *        The name of the interconnect.
     */

    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @return The name of the interconnect.
     */

    public String getInterconnectName() {
        return this.interconnectName;
    }

    /**
     * <p>
     * The name of the interconnect.
     * </p>
     * 
     * @param interconnectName
     *        The name of the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withInterconnectName(String interconnectName) {
        setInterconnectName(interconnectName);
        return this;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     * 
     * @param bandwidth
     *        The port bandwidth, in Gbps. The possible values are 1 and 10.
     */

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     * 
     * @return The port bandwidth, in Gbps. The possible values are 1 and 10.
     */

    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * <p>
     * The port bandwidth, in Gbps. The possible values are 1 and 10.
     * </p>
     * 
     * @param bandwidth
     *        The port bandwidth, in Gbps. The possible values are 1 and 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withBandwidth(String bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     * 
     * @param location
     *        The location of the interconnect.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     * 
     * @return The location of the interconnect.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the interconnect.
     * </p>
     * 
     * @param location
     *        The location of the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @return The ID of the LAG.
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * <p>
     * The ID of the LAG.
     * </p>
     * 
     * @param lagId
     *        The ID of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     * 
     * @return The tags to associate with the interconnect.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the interconnect.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to associate with the interconnect.
     * </p>
     * 
     * @param tags
     *        The tags to associate with the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the interconnect.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     * 
     * @return The name of the service provider associated with the interconnect.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the service provider associated with the interconnect.
     * </p>
     * 
     * @param providerName
     *        The name of the service provider associated with the interconnect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInterconnectRequest withProviderName(String providerName) {
        setProviderName(providerName);
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
        if (getInterconnectName() != null)
            sb.append("InterconnectName: ").append(getInterconnectName()).append(",");
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInterconnectRequest == false)
            return false;
        CreateInterconnectRequest other = (CreateInterconnectRequest) obj;
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null)
            return false;
        if (other.getInterconnectName() != null && other.getInterconnectName().equals(this.getInterconnectName()) == false)
            return false;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode());
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public CreateInterconnectRequest clone() {
        return (CreateInterconnectRequest) super.clone();
    }

}
