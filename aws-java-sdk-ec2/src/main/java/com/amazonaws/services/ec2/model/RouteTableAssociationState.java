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

/**
 * <p>
 * Describes the state of an association between a route table and a subnet or gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/RouteTableAssociationState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteTableAssociationState implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status message, if applicable.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @see RouteTableAssociationStateCode
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @return The state of the association.
     * @see RouteTableAssociationStateCode
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteTableAssociationStateCode
     */

    public RouteTableAssociationState withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteTableAssociationStateCode
     */

    public RouteTableAssociationState withState(RouteTableAssociationStateCode state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        The status message, if applicable.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     * 
     * @return The status message, if applicable.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message, if applicable.
     * </p>
     * 
     * @param statusMessage
     *        The status message, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteTableAssociationState withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTableAssociationState == false)
            return false;
        RouteTableAssociationState other = (RouteTableAssociationState) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public RouteTableAssociationState clone() {
        try {
            return (RouteTableAssociationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
