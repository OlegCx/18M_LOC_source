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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single port range specification. This is used for source and destination port ranges in the stateless rule
 * <a>MatchAttributes</a>, <code>SourcePorts</code>, and <code>DestinationPorts</code> settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PortRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lower limit of the port range. This must be less than or equal to the <code>ToPort</code> specification.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code> specification.
     * </p>
     */
    private Integer toPort;

    /**
     * <p>
     * The lower limit of the port range. This must be less than or equal to the <code>ToPort</code> specification.
     * </p>
     * 
     * @param fromPort
     *        The lower limit of the port range. This must be less than or equal to the <code>ToPort</code>
     *        specification.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The lower limit of the port range. This must be less than or equal to the <code>ToPort</code> specification.
     * </p>
     * 
     * @return The lower limit of the port range. This must be less than or equal to the <code>ToPort</code>
     *         specification.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The lower limit of the port range. This must be less than or equal to the <code>ToPort</code> specification.
     * </p>
     * 
     * @param fromPort
     *        The lower limit of the port range. This must be less than or equal to the <code>ToPort</code>
     *        specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code> specification.
     * </p>
     * 
     * @param toPort
     *        The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code>
     *        specification.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code> specification.
     * </p>
     * 
     * @return The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code>
     *         specification.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code> specification.
     * </p>
     * 
     * @param toPort
     *        The upper limit of the port range. This must be greater than or equal to the <code>FromPort</code>
     *        specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortRange withToPort(Integer toPort) {
        setToPort(toPort);
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortRange == false)
            return false;
        PortRange other = (PortRange) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        return hashCode;
    }

    @Override
    public PortRange clone() {
        try {
            return (PortRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.PortRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
