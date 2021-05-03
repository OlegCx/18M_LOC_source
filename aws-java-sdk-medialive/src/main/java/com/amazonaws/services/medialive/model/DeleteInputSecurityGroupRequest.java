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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for DeleteInputSecurityGroupRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DeleteInputSecurityGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInputSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Input Security Group to delete */
    private String inputSecurityGroupId;

    /**
     * The Input Security Group to delete
     * 
     * @param inputSecurityGroupId
     *        The Input Security Group to delete
     */

    public void setInputSecurityGroupId(String inputSecurityGroupId) {
        this.inputSecurityGroupId = inputSecurityGroupId;
    }

    /**
     * The Input Security Group to delete
     * 
     * @return The Input Security Group to delete
     */

    public String getInputSecurityGroupId() {
        return this.inputSecurityGroupId;
    }

    /**
     * The Input Security Group to delete
     * 
     * @param inputSecurityGroupId
     *        The Input Security Group to delete
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInputSecurityGroupRequest withInputSecurityGroupId(String inputSecurityGroupId) {
        setInputSecurityGroupId(inputSecurityGroupId);
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
        if (getInputSecurityGroupId() != null)
            sb.append("InputSecurityGroupId: ").append(getInputSecurityGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInputSecurityGroupRequest == false)
            return false;
        DeleteInputSecurityGroupRequest other = (DeleteInputSecurityGroupRequest) obj;
        if (other.getInputSecurityGroupId() == null ^ this.getInputSecurityGroupId() == null)
            return false;
        if (other.getInputSecurityGroupId() != null && other.getInputSecurityGroupId().equals(this.getInputSecurityGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSecurityGroupId() == null) ? 0 : getInputSecurityGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInputSecurityGroupRequest clone() {
        return (DeleteInputSecurityGroupRequest) super.clone();
    }

}
