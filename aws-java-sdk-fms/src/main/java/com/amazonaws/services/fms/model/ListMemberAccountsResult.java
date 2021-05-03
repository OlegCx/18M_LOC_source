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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListMemberAccounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMemberAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of account IDs.
     * </p>
     */
    private java.util.List<String> memberAccounts;
    /**
     * <p>
     * If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     * request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     * <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of account IDs.
     * </p>
     * 
     * @return An array of account IDs.
     */

    public java.util.List<String> getMemberAccounts() {
        return memberAccounts;
    }

    /**
     * <p>
     * An array of account IDs.
     * </p>
     * 
     * @param memberAccounts
     *        An array of account IDs.
     */

    public void setMemberAccounts(java.util.Collection<String> memberAccounts) {
        if (memberAccounts == null) {
            this.memberAccounts = null;
            return;
        }

        this.memberAccounts = new java.util.ArrayList<String>(memberAccounts);
    }

    /**
     * <p>
     * An array of account IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberAccounts(java.util.Collection)} or {@link #withMemberAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param memberAccounts
     *        An array of account IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMemberAccountsResult withMemberAccounts(String... memberAccounts) {
        if (this.memberAccounts == null) {
            setMemberAccounts(new java.util.ArrayList<String>(memberAccounts.length));
        }
        for (String ele : memberAccounts) {
            this.memberAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of account IDs.
     * </p>
     * 
     * @param memberAccounts
     *        An array of account IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMemberAccountsResult withMemberAccounts(java.util.Collection<String> memberAccounts) {
        setMemberAccounts(memberAccounts);
        return this;
    }

    /**
     * <p>
     * If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     * request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     * <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @param nextToken
     *        If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     *        request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     *        <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in
     *        the <code>NextToken</code> value in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     * request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     * <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @return If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     *         request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     *         <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response
     *         in the <code>NextToken</code> value in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     * request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     * <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @param nextToken
     *        If you have more member account IDs than the number that you specified for <code>MaxResults</code> in the
     *        request, the response includes a <code>NextToken</code> value. To list more IDs, submit another
     *        <code>ListMemberAccounts</code> request, and specify the <code>NextToken</code> value from the response in
     *        the <code>NextToken</code> value in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMemberAccountsResult withNextToken(String nextToken) {
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
        if (getMemberAccounts() != null)
            sb.append("MemberAccounts: ").append(getMemberAccounts()).append(",");
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

        if (obj instanceof ListMemberAccountsResult == false)
            return false;
        ListMemberAccountsResult other = (ListMemberAccountsResult) obj;
        if (other.getMemberAccounts() == null ^ this.getMemberAccounts() == null)
            return false;
        if (other.getMemberAccounts() != null && other.getMemberAccounts().equals(this.getMemberAccounts()) == false)
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

        hashCode = prime * hashCode + ((getMemberAccounts() == null) ? 0 : getMemberAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMemberAccountsResult clone() {
        try {
            return (ListMemberAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
