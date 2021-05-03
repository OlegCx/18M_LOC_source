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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetPortSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * A collection of port settings to be added to the fleet resource.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissionAuthorizations;
    /**
     * <p>
     * A collection of port settings to be removed from the fleet resource.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissionRevocations;

    /**
     * <p>
     * A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN
     *        value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN
     *         value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update port settings for. You can use either the fleet ID or ARN
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A collection of port settings to be added to the fleet resource.
     * </p>
     * 
     * @return A collection of port settings to be added to the fleet resource.
     */

    public java.util.List<IpPermission> getInboundPermissionAuthorizations() {
        return inboundPermissionAuthorizations;
    }

    /**
     * <p>
     * A collection of port settings to be added to the fleet resource.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        A collection of port settings to be added to the fleet resource.
     */

    public void setInboundPermissionAuthorizations(java.util.Collection<IpPermission> inboundPermissionAuthorizations) {
        if (inboundPermissionAuthorizations == null) {
            this.inboundPermissionAuthorizations = null;
            return;
        }

        this.inboundPermissionAuthorizations = new java.util.ArrayList<IpPermission>(inboundPermissionAuthorizations);
    }

    /**
     * <p>
     * A collection of port settings to be added to the fleet resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissionAuthorizations(java.util.Collection)} or
     * {@link #withInboundPermissionAuthorizations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        A collection of port settings to be added to the fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionAuthorizations(IpPermission... inboundPermissionAuthorizations) {
        if (this.inboundPermissionAuthorizations == null) {
            setInboundPermissionAuthorizations(new java.util.ArrayList<IpPermission>(inboundPermissionAuthorizations.length));
        }
        for (IpPermission ele : inboundPermissionAuthorizations) {
            this.inboundPermissionAuthorizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of port settings to be added to the fleet resource.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        A collection of port settings to be added to the fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionAuthorizations(java.util.Collection<IpPermission> inboundPermissionAuthorizations) {
        setInboundPermissionAuthorizations(inboundPermissionAuthorizations);
        return this;
    }

    /**
     * <p>
     * A collection of port settings to be removed from the fleet resource.
     * </p>
     * 
     * @return A collection of port settings to be removed from the fleet resource.
     */

    public java.util.List<IpPermission> getInboundPermissionRevocations() {
        return inboundPermissionRevocations;
    }

    /**
     * <p>
     * A collection of port settings to be removed from the fleet resource.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        A collection of port settings to be removed from the fleet resource.
     */

    public void setInboundPermissionRevocations(java.util.Collection<IpPermission> inboundPermissionRevocations) {
        if (inboundPermissionRevocations == null) {
            this.inboundPermissionRevocations = null;
            return;
        }

        this.inboundPermissionRevocations = new java.util.ArrayList<IpPermission>(inboundPermissionRevocations);
    }

    /**
     * <p>
     * A collection of port settings to be removed from the fleet resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissionRevocations(java.util.Collection)} or
     * {@link #withInboundPermissionRevocations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        A collection of port settings to be removed from the fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionRevocations(IpPermission... inboundPermissionRevocations) {
        if (this.inboundPermissionRevocations == null) {
            setInboundPermissionRevocations(new java.util.ArrayList<IpPermission>(inboundPermissionRevocations.length));
        }
        for (IpPermission ele : inboundPermissionRevocations) {
            this.inboundPermissionRevocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of port settings to be removed from the fleet resource.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        A collection of port settings to be removed from the fleet resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionRevocations(java.util.Collection<IpPermission> inboundPermissionRevocations) {
        setInboundPermissionRevocations(inboundPermissionRevocations);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getInboundPermissionAuthorizations() != null)
            sb.append("InboundPermissionAuthorizations: ").append(getInboundPermissionAuthorizations()).append(",");
        if (getInboundPermissionRevocations() != null)
            sb.append("InboundPermissionRevocations: ").append(getInboundPermissionRevocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetPortSettingsRequest == false)
            return false;
        UpdateFleetPortSettingsRequest other = (UpdateFleetPortSettingsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInboundPermissionAuthorizations() == null ^ this.getInboundPermissionAuthorizations() == null)
            return false;
        if (other.getInboundPermissionAuthorizations() != null
                && other.getInboundPermissionAuthorizations().equals(this.getInboundPermissionAuthorizations()) == false)
            return false;
        if (other.getInboundPermissionRevocations() == null ^ this.getInboundPermissionRevocations() == null)
            return false;
        if (other.getInboundPermissionRevocations() != null && other.getInboundPermissionRevocations().equals(this.getInboundPermissionRevocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInboundPermissionAuthorizations() == null) ? 0 : getInboundPermissionAuthorizations().hashCode());
        hashCode = prime * hashCode + ((getInboundPermissionRevocations() == null) ? 0 : getInboundPermissionRevocations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetPortSettingsRequest clone() {
        return (UpdateFleetPortSettingsRequest) super.clone();
    }

}
