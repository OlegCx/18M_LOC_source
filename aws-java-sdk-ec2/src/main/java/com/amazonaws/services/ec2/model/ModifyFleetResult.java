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
public class ModifyFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * </p>
     * 
     * @param returnValue
     *        Is <code>true</code> if the request succeeds, and an error otherwise.
     */

    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * </p>
     * 
     * @return Is <code>true</code> if the request succeeds, and an error otherwise.
     */

    public Boolean getReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * </p>
     * 
     * @param returnValue
     *        Is <code>true</code> if the request succeeds, and an error otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyFleetResult withReturn(Boolean returnValue) {
        setReturn(returnValue);
        return this;
    }

    /**
     * <p>
     * Is <code>true</code> if the request succeeds, and an error otherwise.
     * </p>
     * 
     * @return Is <code>true</code> if the request succeeds, and an error otherwise.
     */

    public Boolean isReturn() {
        return this.returnValue;
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
        if (getReturn() != null)
            sb.append("Return: ").append(getReturn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyFleetResult == false)
            return false;
        ModifyFleetResult other = (ModifyFleetResult) obj;
        if (other.getReturn() == null ^ this.getReturn() == null)
            return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode());
        return hashCode;
    }

    @Override
    public ModifyFleetResult clone() {
        try {
            return (ModifyFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
