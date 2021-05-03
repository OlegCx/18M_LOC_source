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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceRouteTableAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the new association.
     * </p>
     */
    private String newAssociationId;
    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private RouteTableAssociationState associationState;

    /**
     * <p>
     * The ID of the new association.
     * </p>
     * 
     * @param newAssociationId
     *        The ID of the new association.
     */

    public void setNewAssociationId(String newAssociationId) {
        this.newAssociationId = newAssociationId;
    }

    /**
     * <p>
     * The ID of the new association.
     * </p>
     * 
     * @return The ID of the new association.
     */

    public String getNewAssociationId() {
        return this.newAssociationId;
    }

    /**
     * <p>
     * The ID of the new association.
     * </p>
     * 
     * @param newAssociationId
     *        The ID of the new association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteTableAssociationResult withNewAssociationId(String newAssociationId) {
        setNewAssociationId(newAssociationId);
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param associationState
     *        The state of the association.
     */

    public void setAssociationState(RouteTableAssociationState associationState) {
        this.associationState = associationState;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @return The state of the association.
     */

    public RouteTableAssociationState getAssociationState() {
        return this.associationState;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param associationState
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceRouteTableAssociationResult withAssociationState(RouteTableAssociationState associationState) {
        setAssociationState(associationState);
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
        if (getNewAssociationId() != null)
            sb.append("NewAssociationId: ").append(getNewAssociationId()).append(",");
        if (getAssociationState() != null)
            sb.append("AssociationState: ").append(getAssociationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceRouteTableAssociationResult == false)
            return false;
        ReplaceRouteTableAssociationResult other = (ReplaceRouteTableAssociationResult) obj;
        if (other.getNewAssociationId() == null ^ this.getNewAssociationId() == null)
            return false;
        if (other.getNewAssociationId() != null && other.getNewAssociationId().equals(this.getNewAssociationId()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNewAssociationId() == null) ? 0 : getNewAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationState() == null) ? 0 : getAssociationState().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceRouteTableAssociationResult clone() {
        try {
            return (ReplaceRouteTableAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
