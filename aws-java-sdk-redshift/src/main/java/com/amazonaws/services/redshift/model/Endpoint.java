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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a connection endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS address of the Cluster.
     * </p>
     */
    private String address;
    /**
     * <p>
     * The port that the database engine is listening on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Describes a connection endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcEndpoint> vpcEndpoints;

    /**
     * <p>
     * The DNS address of the Cluster.
     * </p>
     * 
     * @param address
     *        The DNS address of the Cluster.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The DNS address of the Cluster.
     * </p>
     * 
     * @return The DNS address of the Cluster.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * The DNS address of the Cluster.
     * </p>
     * 
     * @param address
     *        The DNS address of the Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        The port that the database engine is listening on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the database engine is listening on.
     * </p>
     * 
     * @return The port that the database engine is listening on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        The port that the database engine is listening on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Describes a connection endpoint.
     * </p>
     * 
     * @return Describes a connection endpoint.
     */

    public java.util.List<VpcEndpoint> getVpcEndpoints() {
        if (vpcEndpoints == null) {
            vpcEndpoints = new com.amazonaws.internal.SdkInternalList<VpcEndpoint>();
        }
        return vpcEndpoints;
    }

    /**
     * <p>
     * Describes a connection endpoint.
     * </p>
     * 
     * @param vpcEndpoints
     *        Describes a connection endpoint.
     */

    public void setVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        if (vpcEndpoints == null) {
            this.vpcEndpoints = null;
            return;
        }

        this.vpcEndpoints = new com.amazonaws.internal.SdkInternalList<VpcEndpoint>(vpcEndpoints);
    }

    /**
     * <p>
     * Describes a connection endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpoints(java.util.Collection)} or {@link #withVpcEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcEndpoints
     *        Describes a connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withVpcEndpoints(VpcEndpoint... vpcEndpoints) {
        if (this.vpcEndpoints == null) {
            setVpcEndpoints(new com.amazonaws.internal.SdkInternalList<VpcEndpoint>(vpcEndpoints.length));
        }
        for (VpcEndpoint ele : vpcEndpoints) {
            this.vpcEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes a connection endpoint.
     * </p>
     * 
     * @param vpcEndpoints
     *        Describes a connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        setVpcEndpoints(vpcEndpoints);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcEndpoints() != null)
            sb.append("VpcEndpoints: ").append(getVpcEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcEndpoints() == null ^ this.getVpcEndpoints() == null)
            return false;
        if (other.getVpcEndpoints() != null && other.getVpcEndpoints().equals(this.getVpcEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoints() == null) ? 0 : getVpcEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
