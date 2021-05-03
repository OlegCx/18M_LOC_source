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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * DVB Network Information Table (NIT)
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DvbNitSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbNitSettings implements Serializable, Cloneable, StructuredPojo {

    /** The numeric value placed in the Network Information Table (NIT). */
    private Integer networkId;
    /**
     * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is
     * 256 characters.
     */
    private String networkName;
    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer repInterval;

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * 
     * @param networkId
     *        The numeric value placed in the Network Information Table (NIT).
     */

    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * 
     * @return The numeric value placed in the Network Information Table (NIT).
     */

    public Integer getNetworkId() {
        return this.networkId;
    }

    /**
     * The numeric value placed in the Network Information Table (NIT).
     * 
     * @param networkId
     *        The numeric value placed in the Network Information Table (NIT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbNitSettings withNetworkId(Integer networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is
     * 256 characters.
     * 
     * @param networkName
     *        The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum
     *        length is 256 characters.
     */

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is
     * 256 characters.
     * 
     * @return The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum
     *         length is 256 characters.
     */

    public String getNetworkName() {
        return this.networkName;
    }

    /**
     * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is
     * 256 characters.
     * 
     * @param networkName
     *        The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum
     *        length is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbNitSettings withNetworkName(String networkName) {
        setNetworkName(networkName);
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setRepInterval(Integer repInterval) {
        this.repInterval = repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getRepInterval() {
        return this.repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbNitSettings withRepInterval(Integer repInterval) {
        setRepInterval(repInterval);
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
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getNetworkName() != null)
            sb.append("NetworkName: ").append(getNetworkName()).append(",");
        if (getRepInterval() != null)
            sb.append("RepInterval: ").append(getRepInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbNitSettings == false)
            return false;
        DvbNitSettings other = (DvbNitSettings) obj;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getNetworkName() == null ^ this.getNetworkName() == null)
            return false;
        if (other.getNetworkName() != null && other.getNetworkName().equals(this.getNetworkName()) == false)
            return false;
        if (other.getRepInterval() == null ^ this.getRepInterval() == null)
            return false;
        if (other.getRepInterval() != null && other.getRepInterval().equals(this.getRepInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getNetworkName() == null) ? 0 : getNetworkName().hashCode());
        hashCode = prime * hashCode + ((getRepInterval() == null) ? 0 : getRepInterval().hashCode());
        return hashCode;
    }

    @Override
    public DvbNitSettings clone() {
        try {
            return (DvbNitSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.DvbNitSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
