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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UnlabelParameterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnlabelParameterVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all labels deleted from the parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removedLabels;
    /**
     * <p>
     * The labels that are not attached to the given parameter version.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidLabels;

    /**
     * <p>
     * A list of all labels deleted from the parameter.
     * </p>
     * 
     * @return A list of all labels deleted from the parameter.
     */

    public java.util.List<String> getRemovedLabels() {
        if (removedLabels == null) {
            removedLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removedLabels;
    }

    /**
     * <p>
     * A list of all labels deleted from the parameter.
     * </p>
     * 
     * @param removedLabels
     *        A list of all labels deleted from the parameter.
     */

    public void setRemovedLabels(java.util.Collection<String> removedLabels) {
        if (removedLabels == null) {
            this.removedLabels = null;
            return;
        }

        this.removedLabels = new com.amazonaws.internal.SdkInternalList<String>(removedLabels);
    }

    /**
     * <p>
     * A list of all labels deleted from the parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemovedLabels(java.util.Collection)} or {@link #withRemovedLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param removedLabels
     *        A list of all labels deleted from the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionResult withRemovedLabels(String... removedLabels) {
        if (this.removedLabels == null) {
            setRemovedLabels(new com.amazonaws.internal.SdkInternalList<String>(removedLabels.length));
        }
        for (String ele : removedLabels) {
            this.removedLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all labels deleted from the parameter.
     * </p>
     * 
     * @param removedLabels
     *        A list of all labels deleted from the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionResult withRemovedLabels(java.util.Collection<String> removedLabels) {
        setRemovedLabels(removedLabels);
        return this;
    }

    /**
     * <p>
     * The labels that are not attached to the given parameter version.
     * </p>
     * 
     * @return The labels that are not attached to the given parameter version.
     */

    public java.util.List<String> getInvalidLabels() {
        if (invalidLabels == null) {
            invalidLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidLabels;
    }

    /**
     * <p>
     * The labels that are not attached to the given parameter version.
     * </p>
     * 
     * @param invalidLabels
     *        The labels that are not attached to the given parameter version.
     */

    public void setInvalidLabels(java.util.Collection<String> invalidLabels) {
        if (invalidLabels == null) {
            this.invalidLabels = null;
            return;
        }

        this.invalidLabels = new com.amazonaws.internal.SdkInternalList<String>(invalidLabels);
    }

    /**
     * <p>
     * The labels that are not attached to the given parameter version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidLabels(java.util.Collection)} or {@link #withInvalidLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param invalidLabels
     *        The labels that are not attached to the given parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionResult withInvalidLabels(String... invalidLabels) {
        if (this.invalidLabels == null) {
            setInvalidLabels(new com.amazonaws.internal.SdkInternalList<String>(invalidLabels.length));
        }
        for (String ele : invalidLabels) {
            this.invalidLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that are not attached to the given parameter version.
     * </p>
     * 
     * @param invalidLabels
     *        The labels that are not attached to the given parameter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnlabelParameterVersionResult withInvalidLabels(java.util.Collection<String> invalidLabels) {
        setInvalidLabels(invalidLabels);
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
        if (getRemovedLabels() != null)
            sb.append("RemovedLabels: ").append(getRemovedLabels()).append(",");
        if (getInvalidLabels() != null)
            sb.append("InvalidLabels: ").append(getInvalidLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnlabelParameterVersionResult == false)
            return false;
        UnlabelParameterVersionResult other = (UnlabelParameterVersionResult) obj;
        if (other.getRemovedLabels() == null ^ this.getRemovedLabels() == null)
            return false;
        if (other.getRemovedLabels() != null && other.getRemovedLabels().equals(this.getRemovedLabels()) == false)
            return false;
        if (other.getInvalidLabels() == null ^ this.getInvalidLabels() == null)
            return false;
        if (other.getInvalidLabels() != null && other.getInvalidLabels().equals(this.getInvalidLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemovedLabels() == null) ? 0 : getRemovedLabels().hashCode());
        hashCode = prime * hashCode + ((getInvalidLabels() == null) ? 0 : getInvalidLabels().hashCode());
        return hashCode;
    }

    @Override
    public UnlabelParameterVersionResult clone() {
        try {
            return (UnlabelParameterVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
