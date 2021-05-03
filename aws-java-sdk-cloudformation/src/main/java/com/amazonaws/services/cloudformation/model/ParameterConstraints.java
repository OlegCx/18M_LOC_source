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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A set of criteria that AWS CloudFormation uses to validate parameter values. Although other constraints might be
 * defined in the stack template, AWS CloudFormation returns only the <code>AllowedValues</code> property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ParameterConstraints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterConstraints implements Serializable, Cloneable {

    /**
     * <p>
     * A list of values that are permitted for a parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowedValues;

    /**
     * <p>
     * A list of values that are permitted for a parameter.
     * </p>
     * 
     * @return A list of values that are permitted for a parameter.
     */

    public java.util.List<String> getAllowedValues() {
        if (allowedValues == null) {
            allowedValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowedValues;
    }

    /**
     * <p>
     * A list of values that are permitted for a parameter.
     * </p>
     * 
     * @param allowedValues
     *        A list of values that are permitted for a parameter.
     */

    public void setAllowedValues(java.util.Collection<String> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new com.amazonaws.internal.SdkInternalList<String>(allowedValues);
    }

    /**
     * <p>
     * A list of values that are permitted for a parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        A list of values that are permitted for a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withAllowedValues(String... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new com.amazonaws.internal.SdkInternalList<String>(allowedValues.length));
        }
        for (String ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that are permitted for a parameter.
     * </p>
     * 
     * @param allowedValues
     *        A list of values that are permitted for a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterConstraints withAllowedValues(java.util.Collection<String> allowedValues) {
        setAllowedValues(allowedValues);
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterConstraints == false)
            return false;
        ParameterConstraints other = (ParameterConstraints) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        return hashCode;
    }

    @Override
    public ParameterConstraints clone() {
        try {
            return (ParameterConstraints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
