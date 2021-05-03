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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a specific approval on a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Approval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Approval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * </p>
     */
    private String approvalState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Approval withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * </p>
     * 
     * @param approvalState
     *        The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * @see ApprovalState
     */

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * </p>
     * 
     * @return The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * @see ApprovalState
     */

    public String getApprovalState() {
        return this.approvalState;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * </p>
     * 
     * @param approvalState
     *        The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalState
     */

    public Approval withApprovalState(String approvalState) {
        setApprovalState(approvalState);
        return this;
    }

    /**
     * <p>
     * The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * </p>
     * 
     * @param approvalState
     *        The state of the approval, APPROVE or REVOKE. REVOKE states are not stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalState
     */

    public Approval withApprovalState(ApprovalState approvalState) {
        this.approvalState = approvalState.toString();
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getApprovalState() != null)
            sb.append("ApprovalState: ").append(getApprovalState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Approval == false)
            return false;
        Approval other = (Approval) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getApprovalState() == null ^ this.getApprovalState() == null)
            return false;
        if (other.getApprovalState() != null && other.getApprovalState().equals(this.getApprovalState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getApprovalState() == null) ? 0 : getApprovalState().hashCode());
        return hashCode;
    }

    @Override
    public Approval clone() {
        try {
            return (Approval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
