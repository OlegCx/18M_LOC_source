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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateVariableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the errors for the <code>BatchCreateVariable</code> request.
     * </p>
     */
    private java.util.List<BatchCreateVariableError> errors;

    /**
     * <p>
     * Provides the errors for the <code>BatchCreateVariable</code> request.
     * </p>
     * 
     * @return Provides the errors for the <code>BatchCreateVariable</code> request.
     */

    public java.util.List<BatchCreateVariableError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Provides the errors for the <code>BatchCreateVariable</code> request.
     * </p>
     * 
     * @param errors
     *        Provides the errors for the <code>BatchCreateVariable</code> request.
     */

    public void setErrors(java.util.Collection<BatchCreateVariableError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchCreateVariableError>(errors);
    }

    /**
     * <p>
     * Provides the errors for the <code>BatchCreateVariable</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Provides the errors for the <code>BatchCreateVariable</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVariableResult withErrors(BatchCreateVariableError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchCreateVariableError>(errors.length));
        }
        for (BatchCreateVariableError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the errors for the <code>BatchCreateVariable</code> request.
     * </p>
     * 
     * @param errors
     *        Provides the errors for the <code>BatchCreateVariable</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateVariableResult withErrors(java.util.Collection<BatchCreateVariableError> errors) {
        setErrors(errors);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateVariableResult == false)
            return false;
        BatchCreateVariableResult other = (BatchCreateVariableResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateVariableResult clone() {
        try {
            return (BatchCreateVariableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
