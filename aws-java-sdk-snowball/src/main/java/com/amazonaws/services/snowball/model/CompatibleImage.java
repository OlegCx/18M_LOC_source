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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON-formatted object that describes a compatible Amazon Machine Image (AMI), including the ID and name for a Snow
 * device AMI. This AMI is compatible with the device's physical hardware requirements, and it should be able to be run
 * in an SBE1 instance on the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CompatibleImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompatibleImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for an individual Snow device AMI.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for an individual Snow device AMI.
     * </p>
     * 
     * @param amiId
     *        The unique identifier for an individual Snow device AMI.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The unique identifier for an individual Snow device AMI.
     * </p>
     * 
     * @return The unique identifier for an individual Snow device AMI.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The unique identifier for an individual Snow device AMI.
     * </p>
     * 
     * @param amiId
     *        The unique identifier for an individual Snow device AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleImage withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * 
     * @param name
     *        The optional name of a compatible image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * 
     * @return The optional name of a compatible image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * 
     * @param name
     *        The optional name of a compatible image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompatibleImage withName(String name) {
        setName(name);
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
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleImage == false)
            return false;
        CompatibleImage other = (CompatibleImage) obj;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CompatibleImage clone() {
        try {
            return (CompatibleImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.CompatibleImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
