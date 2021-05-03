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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data replication intiation step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DataReplicationInitiationStep" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReplicationInitiationStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to query data initiation step name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Request to query data initiation status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Request to query data initiation step name.
     * </p>
     * 
     * @param name
     *        Request to query data initiation step name.
     * @see DataReplicationInitiationStepName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Request to query data initiation step name.
     * </p>
     * 
     * @return Request to query data initiation step name.
     * @see DataReplicationInitiationStepName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Request to query data initiation step name.
     * </p>
     * 
     * @param name
     *        Request to query data initiation step name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationInitiationStepName
     */

    public DataReplicationInitiationStep withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Request to query data initiation step name.
     * </p>
     * 
     * @param name
     *        Request to query data initiation step name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationInitiationStepName
     */

    public DataReplicationInitiationStep withName(DataReplicationInitiationStepName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Request to query data initiation status.
     * </p>
     * 
     * @param status
     *        Request to query data initiation status.
     * @see DataReplicationInitiationStepStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Request to query data initiation status.
     * </p>
     * 
     * @return Request to query data initiation status.
     * @see DataReplicationInitiationStepStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Request to query data initiation status.
     * </p>
     * 
     * @param status
     *        Request to query data initiation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationInitiationStepStatus
     */

    public DataReplicationInitiationStep withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Request to query data initiation status.
     * </p>
     * 
     * @param status
     *        Request to query data initiation status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataReplicationInitiationStepStatus
     */

    public DataReplicationInitiationStep withStatus(DataReplicationInitiationStepStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataReplicationInitiationStep == false)
            return false;
        DataReplicationInitiationStep other = (DataReplicationInitiationStep) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataReplicationInitiationStep clone() {
        try {
            return (DataReplicationInitiationStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DataReplicationInitiationStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
