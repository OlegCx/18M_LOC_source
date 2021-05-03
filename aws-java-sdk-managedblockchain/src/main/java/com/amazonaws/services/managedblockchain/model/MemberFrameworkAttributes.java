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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes relevant to a member for the blockchain framework that the Managed Blockchain network uses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/MemberFrameworkAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberFrameworkAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger
     * Fabric.
     * </p>
     */
    private MemberFabricAttributes fabric;

    /**
     * <p>
     * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger
     * Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses
     *        Hyperledger Fabric.
     */

    public void setFabric(MemberFabricAttributes fabric) {
        this.fabric = fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger
     * Fabric.
     * </p>
     * 
     * @return Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses
     *         Hyperledger Fabric.
     */

    public MemberFabricAttributes getFabric() {
        return this.fabric;
    }

    /**
     * <p>
     * Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses Hyperledger
     * Fabric.
     * </p>
     * 
     * @param fabric
     *        Attributes of Hyperledger Fabric relevant to a member on a Managed Blockchain network that uses
     *        Hyperledger Fabric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberFrameworkAttributes withFabric(MemberFabricAttributes fabric) {
        setFabric(fabric);
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
        if (getFabric() != null)
            sb.append("Fabric: ").append(getFabric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberFrameworkAttributes == false)
            return false;
        MemberFrameworkAttributes other = (MemberFrameworkAttributes) obj;
        if (other.getFabric() == null ^ this.getFabric() == null)
            return false;
        if (other.getFabric() != null && other.getFabric().equals(this.getFabric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFabric() == null) ? 0 : getFabric().hashCode());
        return hashCode;
    }

    @Override
    public MemberFrameworkAttributes clone() {
        try {
            return (MemberFrameworkAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.MemberFrameworkAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
