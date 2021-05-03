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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetGroupPolicy</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetGroupPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can
     * be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to
     * IAM.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The group the policy is associated with.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @return The group the policy is associated with.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The group the policy is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupPolicyResult withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupPolicyResult withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can
     * be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to
     * IAM.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.</p>
     *        <p>
     *        IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation
     *        templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before
     *        submitting it to IAM.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can
     * be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to
     * IAM.
     * </p>
     * 
     * @return The policy document.</p>
     *         <p>
     *         IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation
     *         templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format
     *         before submitting it to IAM.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation templates can
     * be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before submitting it to
     * IAM.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.</p>
     *        <p>
     *        IAM stores policies in JSON format. However, resources that were created using AWS CloudFormation
     *        templates can be formatted in YAML. AWS CloudFormation always converts a YAML policy to JSON format before
     *        submitting it to IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupPolicyResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupPolicyResult == false)
            return false;
        GetGroupPolicyResult other = (GetGroupPolicyResult) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupPolicyResult clone() {
        try {
            return (GetGroupPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
