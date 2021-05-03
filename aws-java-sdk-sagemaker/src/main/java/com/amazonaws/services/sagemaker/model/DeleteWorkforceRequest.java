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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteWorkforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkforceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the workforce.
     * </p>
     */
    private String workforceName;

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the workforce.
     */

    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @return The name of the workforce.
     */

    public String getWorkforceName() {
        return this.workforceName;
    }

    /**
     * <p>
     * The name of the workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkforceRequest withWorkforceName(String workforceName) {
        setWorkforceName(workforceName);
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
        if (getWorkforceName() != null)
            sb.append("WorkforceName: ").append(getWorkforceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkforceRequest == false)
            return false;
        DeleteWorkforceRequest other = (DeleteWorkforceRequest) obj;
        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null && other.getWorkforceName().equals(this.getWorkforceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkforceRequest clone() {
        return (DeleteWorkforceRequest) super.clone();
    }

}
