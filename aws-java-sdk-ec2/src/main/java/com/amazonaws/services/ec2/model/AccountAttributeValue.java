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
 * Describes a value of an account attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AccountAttributeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAttributeValue implements Serializable, Cloneable {

    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value of the attribute.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @return The value of the attribute.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountAttributeValue withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
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
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountAttributeValue == false)
            return false;
        AccountAttributeValue other = (AccountAttributeValue) obj;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public AccountAttributeValue clone() {
        try {
            return (AccountAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
