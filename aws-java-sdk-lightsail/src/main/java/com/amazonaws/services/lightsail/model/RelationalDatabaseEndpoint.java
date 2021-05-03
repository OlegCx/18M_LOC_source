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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an endpoint for a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the port that the database is listening on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies the DNS address of the database.
     * </p>
     */
    private String address;

    /**
     * <p>
     * Specifies the port that the database is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database is listening on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database is listening on.
     * </p>
     * 
     * @return Specifies the port that the database is listening on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the port that the database is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database is listening on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEndpoint withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies the DNS address of the database.
     * </p>
     * 
     * @param address
     *        Specifies the DNS address of the database.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * Specifies the DNS address of the database.
     * </p>
     * 
     * @return Specifies the DNS address of the database.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * Specifies the DNS address of the database.
     * </p>
     * 
     * @param address
     *        Specifies the DNS address of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseEndpoint withAddress(String address) {
        setAddress(address);
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseEndpoint == false)
            return false;
        RelationalDatabaseEndpoint other = (RelationalDatabaseEndpoint) obj;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseEndpoint clone() {
        try {
            return (RelationalDatabaseEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
