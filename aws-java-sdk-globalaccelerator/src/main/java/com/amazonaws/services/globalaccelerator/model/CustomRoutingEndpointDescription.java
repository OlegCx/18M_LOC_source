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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for an endpoint for a custom routing accelerator. Each endpoint group can include one or more
 * endpoints, which are virtual private cloud (VPC) subnets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/CustomRoutingEndpointDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomRoutingEndpointDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     */
    private String endpointId;

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *        ID.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @return An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *         ID.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID.
     * </p>
     * 
     * @param endpointId
     *        An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomRoutingEndpointDescription withEndpointId(String endpointId) {
        setEndpointId(endpointId);
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
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomRoutingEndpointDescription == false)
            return false;
        CustomRoutingEndpointDescription other = (CustomRoutingEndpointDescription) obj;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public CustomRoutingEndpointDescription clone() {
        try {
            return (CustomRoutingEndpointDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.CustomRoutingEndpointDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
