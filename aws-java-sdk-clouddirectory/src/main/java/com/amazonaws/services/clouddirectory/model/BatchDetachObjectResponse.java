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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <a>DetachObject</a> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchDetachObjectResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetachObjectResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the detached object.
     * </p>
     */
    private String detachedObjectIdentifier;

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the detached object.
     * </p>
     * 
     * @param detachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the detached object.
     */

    public void setDetachedObjectIdentifier(String detachedObjectIdentifier) {
        this.detachedObjectIdentifier = detachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the detached object.
     * </p>
     * 
     * @return The <code>ObjectIdentifier</code> of the detached object.
     */

    public String getDetachedObjectIdentifier() {
        return this.detachedObjectIdentifier;
    }

    /**
     * <p>
     * The <code>ObjectIdentifier</code> of the detached object.
     * </p>
     * 
     * @param detachedObjectIdentifier
     *        The <code>ObjectIdentifier</code> of the detached object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachObjectResponse withDetachedObjectIdentifier(String detachedObjectIdentifier) {
        setDetachedObjectIdentifier(detachedObjectIdentifier);
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
        if (getDetachedObjectIdentifier() != null)
            sb.append("DetachedObjectIdentifier: ").append(getDetachedObjectIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetachObjectResponse == false)
            return false;
        BatchDetachObjectResponse other = (BatchDetachObjectResponse) obj;
        if (other.getDetachedObjectIdentifier() == null ^ this.getDetachedObjectIdentifier() == null)
            return false;
        if (other.getDetachedObjectIdentifier() != null && other.getDetachedObjectIdentifier().equals(this.getDetachedObjectIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetachedObjectIdentifier() == null) ? 0 : getDetachedObjectIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetachObjectResponse clone() {
        try {
            return (BatchDetachObjectResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchDetachObjectResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
