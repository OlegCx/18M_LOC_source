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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * IAM policy assignment summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/IAMPolicyAssignmentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IAMPolicyAssignmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Assignment name.
     * </p>
     */
    private String assignmentName;
    /**
     * <p>
     * Assignment status.
     * </p>
     */
    private String assignmentStatus;

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @param assignmentName
     *        Assignment name.
     */

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @return Assignment name.
     */

    public String getAssignmentName() {
        return this.assignmentName;
    }

    /**
     * <p>
     * Assignment name.
     * </p>
     * 
     * @param assignmentName
     *        Assignment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IAMPolicyAssignmentSummary withAssignmentName(String assignmentName) {
        setAssignmentName(assignmentName);
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @see AssignmentStatus
     */

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @return Assignment status.
     * @see AssignmentStatus
     */

    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public IAMPolicyAssignmentSummary withAssignmentStatus(String assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * Assignment status.
     * </p>
     * 
     * @param assignmentStatus
     *        Assignment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public IAMPolicyAssignmentSummary withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
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
        if (getAssignmentName() != null)
            sb.append("AssignmentName: ").append(getAssignmentName()).append(",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: ").append(getAssignmentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IAMPolicyAssignmentSummary == false)
            return false;
        IAMPolicyAssignmentSummary other = (IAMPolicyAssignmentSummary) obj;
        if (other.getAssignmentName() == null ^ this.getAssignmentName() == null)
            return false;
        if (other.getAssignmentName() != null && other.getAssignmentName().equals(this.getAssignmentName()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentName() == null) ? 0 : getAssignmentName().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        return hashCode;
    }

    @Override
    public IAMPolicyAssignmentSummary clone() {
        try {
            return (IAMPolicyAssignmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.IAMPolicyAssignmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
