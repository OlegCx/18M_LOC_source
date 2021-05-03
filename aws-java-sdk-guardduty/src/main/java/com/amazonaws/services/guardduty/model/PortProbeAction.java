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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the PORT_PROBE action described in the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/PortProbeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortProbeAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * </p>
     */
    private Boolean blocked;
    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     */
    private java.util.List<PortProbeDetail> portProbeDetails;

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * </p>
     * 
     * @param blocked
     *        Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     */

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * </p>
     * 
     * @return Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     */

    public Boolean getBlocked() {
        return this.blocked;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * </p>
     * 
     * @param blocked
     *        Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeAction withBlocked(Boolean blocked) {
        setBlocked(blocked);
        return this;
    }

    /**
     * <p>
     * Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     * </p>
     * 
     * @return Indicates whether EC2 blocked the port probe to the instance, such as with an ACL.
     */

    public Boolean isBlocked() {
        return this.blocked;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * 
     * @return A list of objects related to port probe details.
     */

    public java.util.List<PortProbeDetail> getPortProbeDetails() {
        return portProbeDetails;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * 
     * @param portProbeDetails
     *        A list of objects related to port probe details.
     */

    public void setPortProbeDetails(java.util.Collection<PortProbeDetail> portProbeDetails) {
        if (portProbeDetails == null) {
            this.portProbeDetails = null;
            return;
        }

        this.portProbeDetails = new java.util.ArrayList<PortProbeDetail>(portProbeDetails);
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortProbeDetails(java.util.Collection)} or {@link #withPortProbeDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param portProbeDetails
     *        A list of objects related to port probe details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeAction withPortProbeDetails(PortProbeDetail... portProbeDetails) {
        if (this.portProbeDetails == null) {
            setPortProbeDetails(new java.util.ArrayList<PortProbeDetail>(portProbeDetails.length));
        }
        for (PortProbeDetail ele : portProbeDetails) {
            this.portProbeDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects related to port probe details.
     * </p>
     * 
     * @param portProbeDetails
     *        A list of objects related to port probe details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortProbeAction withPortProbeDetails(java.util.Collection<PortProbeDetail> portProbeDetails) {
        setPortProbeDetails(portProbeDetails);
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
        if (getBlocked() != null)
            sb.append("Blocked: ").append(getBlocked()).append(",");
        if (getPortProbeDetails() != null)
            sb.append("PortProbeDetails: ").append(getPortProbeDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortProbeAction == false)
            return false;
        PortProbeAction other = (PortProbeAction) obj;
        if (other.getBlocked() == null ^ this.getBlocked() == null)
            return false;
        if (other.getBlocked() != null && other.getBlocked().equals(this.getBlocked()) == false)
            return false;
        if (other.getPortProbeDetails() == null ^ this.getPortProbeDetails() == null)
            return false;
        if (other.getPortProbeDetails() != null && other.getPortProbeDetails().equals(this.getPortProbeDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlocked() == null) ? 0 : getBlocked().hashCode());
        hashCode = prime * hashCode + ((getPortProbeDetails() == null) ? 0 : getPortProbeDetails().hashCode());
        return hashCode;
    }

    @Override
    public PortProbeAction clone() {
        try {
            return (PortProbeAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.PortProbeActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
