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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallRuleGroupPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFirewallRuleGroupPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the rule group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) for the rule group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) for the rule group.
     * </p>
     * 
     * @param arn
     *        The ARN (Amazon Resource Name) for the rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFirewallRuleGroupPolicyRequest withArn(String arn) {
        setArn(arn);
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
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFirewallRuleGroupPolicyRequest == false)
            return false;
        GetFirewallRuleGroupPolicyRequest other = (GetFirewallRuleGroupPolicyRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetFirewallRuleGroupPolicyRequest clone() {
        return (GetFirewallRuleGroupPolicyRequest) super.clone();
    }

}
