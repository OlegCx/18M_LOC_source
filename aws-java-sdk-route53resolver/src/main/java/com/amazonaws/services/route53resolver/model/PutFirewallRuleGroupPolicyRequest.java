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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutFirewallRuleGroupPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFirewallRuleGroupPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group that you want to share.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     * </p>
     */
    private String firewallRuleGroupPolicy;

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group that you want to share.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the rule group that you want to share.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group that you want to share.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the rule group that you want to share.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group that you want to share.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the rule group that you want to share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFirewallRuleGroupPolicyRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     * </p>
     * 
     * @param firewallRuleGroupPolicy
     *        The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     */

    public void setFirewallRuleGroupPolicy(String firewallRuleGroupPolicy) {
        this.firewallRuleGroupPolicy = firewallRuleGroupPolicy;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     * </p>
     * 
     * @return The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     */

    public String getFirewallRuleGroupPolicy() {
        return this.firewallRuleGroupPolicy;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     * </p>
     * 
     * @param firewallRuleGroupPolicy
     *        The AWS Identity and Access Management (AWS IAM) policy to attach to the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFirewallRuleGroupPolicyRequest withFirewallRuleGroupPolicy(String firewallRuleGroupPolicy) {
        setFirewallRuleGroupPolicy(firewallRuleGroupPolicy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getFirewallRuleGroupPolicy() != null)
            sb.append("FirewallRuleGroupPolicy: ").append(getFirewallRuleGroupPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFirewallRuleGroupPolicyRequest == false)
            return false;
        PutFirewallRuleGroupPolicyRequest other = (PutFirewallRuleGroupPolicyRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getFirewallRuleGroupPolicy() == null ^ this.getFirewallRuleGroupPolicy() == null)
            return false;
        if (other.getFirewallRuleGroupPolicy() != null && other.getFirewallRuleGroupPolicy().equals(this.getFirewallRuleGroupPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallRuleGroupPolicy() == null) ? 0 : getFirewallRuleGroupPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutFirewallRuleGroupPolicyRequest clone() {
        return (PutFirewallRuleGroupPolicyRequest) super.clone();
    }

}
