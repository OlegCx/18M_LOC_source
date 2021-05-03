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
 * Detaches a typed link from a specified source and target object inside a <a>BatchRead</a> operation. For more
 * information, see <a>DetachTypedLink</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchDetachTypedLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetachTypedLink implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to accept a typed link specifier as input.
     * </p>
     */
    private TypedLinkSpecifier typedLinkSpecifier;

    /**
     * <p>
     * Used to accept a typed link specifier as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Used to accept a typed link specifier as input.
     */

    public void setTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        this.typedLinkSpecifier = typedLinkSpecifier;
    }

    /**
     * <p>
     * Used to accept a typed link specifier as input.
     * </p>
     * 
     * @return Used to accept a typed link specifier as input.
     */

    public TypedLinkSpecifier getTypedLinkSpecifier() {
        return this.typedLinkSpecifier;
    }

    /**
     * <p>
     * Used to accept a typed link specifier as input.
     * </p>
     * 
     * @param typedLinkSpecifier
     *        Used to accept a typed link specifier as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetachTypedLink withTypedLinkSpecifier(TypedLinkSpecifier typedLinkSpecifier) {
        setTypedLinkSpecifier(typedLinkSpecifier);
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
        if (getTypedLinkSpecifier() != null)
            sb.append("TypedLinkSpecifier: ").append(getTypedLinkSpecifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetachTypedLink == false)
            return false;
        BatchDetachTypedLink other = (BatchDetachTypedLink) obj;
        if (other.getTypedLinkSpecifier() == null ^ this.getTypedLinkSpecifier() == null)
            return false;
        if (other.getTypedLinkSpecifier() != null && other.getTypedLinkSpecifier().equals(this.getTypedLinkSpecifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypedLinkSpecifier() == null) ? 0 : getTypedLinkSpecifier().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetachTypedLink clone() {
        try {
            return (BatchDetachTypedLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchDetachTypedLinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
