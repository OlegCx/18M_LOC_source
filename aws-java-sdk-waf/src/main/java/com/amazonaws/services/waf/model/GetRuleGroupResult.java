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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRuleGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     * </p>
     */
    private RuleGroup ruleGroup;

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     * </p>
     * 
     * @param ruleGroup
     *        Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     */

    public void setRuleGroup(RuleGroup ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     * </p>
     * 
     * @return Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     */

    public RuleGroup getRuleGroup() {
        return this.ruleGroup;
    }

    /**
     * <p>
     * Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     * </p>
     * 
     * @param ruleGroup
     *        Information about the <a>RuleGroup</a> that you specified in the <code>GetRuleGroup</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuleGroupResult withRuleGroup(RuleGroup ruleGroup) {
        setRuleGroup(ruleGroup);
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
        if (getRuleGroup() != null)
            sb.append("RuleGroup: ").append(getRuleGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleGroupResult == false)
            return false;
        GetRuleGroupResult other = (GetRuleGroupResult) obj;
        if (other.getRuleGroup() == null ^ this.getRuleGroup() == null)
            return false;
        if (other.getRuleGroup() != null && other.getRuleGroup().equals(this.getRuleGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleGroup() == null) ? 0 : getRuleGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleGroupResult clone() {
        try {
            return (GetRuleGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
