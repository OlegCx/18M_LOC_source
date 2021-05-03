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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSipRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSipRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of SIP rules and rule details.
     * </p>
     */
    private java.util.List<SipRule> sipRules;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of SIP rules and rule details.
     * </p>
     * 
     * @return List of SIP rules and rule details.
     */

    public java.util.List<SipRule> getSipRules() {
        return sipRules;
    }

    /**
     * <p>
     * List of SIP rules and rule details.
     * </p>
     * 
     * @param sipRules
     *        List of SIP rules and rule details.
     */

    public void setSipRules(java.util.Collection<SipRule> sipRules) {
        if (sipRules == null) {
            this.sipRules = null;
            return;
        }

        this.sipRules = new java.util.ArrayList<SipRule>(sipRules);
    }

    /**
     * <p>
     * List of SIP rules and rule details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSipRules(java.util.Collection)} or {@link #withSipRules(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sipRules
     *        List of SIP rules and rule details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSipRulesResult withSipRules(SipRule... sipRules) {
        if (this.sipRules == null) {
            setSipRules(new java.util.ArrayList<SipRule>(sipRules.length));
        }
        for (SipRule ele : sipRules) {
            this.sipRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of SIP rules and rule details.
     * </p>
     * 
     * @param sipRules
     *        List of SIP rules and rule details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSipRulesResult withSipRules(java.util.Collection<SipRule> sipRules) {
        setSipRules(sipRules);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSipRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getSipRules() != null)
            sb.append("SipRules: ").append(getSipRules()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSipRulesResult == false)
            return false;
        ListSipRulesResult other = (ListSipRulesResult) obj;
        if (other.getSipRules() == null ^ this.getSipRules() == null)
            return false;
        if (other.getSipRules() != null && other.getSipRules().equals(this.getSipRules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipRules() == null) ? 0 : getSipRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSipRulesResult clone() {
        try {
            return (ListSipRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
