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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/UpdateLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     * </p>
     */
    private PolicyDetails policyDetails;

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @param policyId
     *        The identifier of the lifecycle policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @return The identifier of the lifecycle policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @param policyId
     *        The identifier of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *         policy.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @return The desired activation state of the lifecycle policy after creation.
     * @see SettablePolicyStateValues
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public UpdateLifecyclePolicyRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The desired activation state of the lifecycle policy after creation.
     * </p>
     * 
     * @param state
     *        The desired activation state of the lifecycle policy after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettablePolicyStateValues
     */

    public UpdateLifecyclePolicyRequest withState(SettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * 
     * @return A description of the lifecycle policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the lifecycle policy.
     * </p>
     * 
     * @param description
     *        A description of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     * </p>
     * 
     * @param policyDetails
     *        The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     */

    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     * </p>
     * 
     * @return The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     */

    public PolicyDetails getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     * </p>
     * 
     * @param policyDetails
     *        The configuration of the lifecycle policy. You cannot update the policy type or the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLifecyclePolicyRequest withPolicyDetails(PolicyDetails policyDetails) {
        setPolicyDetails(policyDetails);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLifecyclePolicyRequest == false)
            return false;
        UpdateLifecyclePolicyRequest other = (UpdateLifecyclePolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLifecyclePolicyRequest clone() {
        return (UpdateLifecyclePolicyRequest) super.clone();
    }

}
