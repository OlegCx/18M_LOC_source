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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateServiceRoleToAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateServiceRoleToAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /** The time when the service role was associated with the account. */
    private String associatedAt;

    /**
     * The time when the service role was associated with the account.
     * 
     * @param associatedAt
     *        The time when the service role was associated with the account.
     */

    public void setAssociatedAt(String associatedAt) {
        this.associatedAt = associatedAt;
    }

    /**
     * The time when the service role was associated with the account.
     * 
     * @return The time when the service role was associated with the account.
     */

    public String getAssociatedAt() {
        return this.associatedAt;
    }

    /**
     * The time when the service role was associated with the account.
     * 
     * @param associatedAt
     *        The time when the service role was associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateServiceRoleToAccountResult withAssociatedAt(String associatedAt) {
        setAssociatedAt(associatedAt);
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
        if (getAssociatedAt() != null)
            sb.append("AssociatedAt: ").append(getAssociatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateServiceRoleToAccountResult == false)
            return false;
        AssociateServiceRoleToAccountResult other = (AssociateServiceRoleToAccountResult) obj;
        if (other.getAssociatedAt() == null ^ this.getAssociatedAt() == null)
            return false;
        if (other.getAssociatedAt() != null && other.getAssociatedAt().equals(this.getAssociatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedAt() == null) ? 0 : getAssociatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AssociateServiceRoleToAccountResult clone() {
        try {
            return (AssociateServiceRoleToAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
