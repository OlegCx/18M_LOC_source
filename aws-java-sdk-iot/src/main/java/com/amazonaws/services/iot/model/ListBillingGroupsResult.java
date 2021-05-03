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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBillingGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of billing groups.
     * </p>
     */
    private java.util.List<GroupNameAndArn> billingGroups;
    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of billing groups.
     * </p>
     * 
     * @return The list of billing groups.
     */

    public java.util.List<GroupNameAndArn> getBillingGroups() {
        return billingGroups;
    }

    /**
     * <p>
     * The list of billing groups.
     * </p>
     * 
     * @param billingGroups
     *        The list of billing groups.
     */

    public void setBillingGroups(java.util.Collection<GroupNameAndArn> billingGroups) {
        if (billingGroups == null) {
            this.billingGroups = null;
            return;
        }

        this.billingGroups = new java.util.ArrayList<GroupNameAndArn>(billingGroups);
    }

    /**
     * <p>
     * The list of billing groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingGroups(java.util.Collection)} or {@link #withBillingGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param billingGroups
     *        The list of billing groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsResult withBillingGroups(GroupNameAndArn... billingGroups) {
        if (this.billingGroups == null) {
            setBillingGroups(new java.util.ArrayList<GroupNameAndArn>(billingGroups.length));
        }
        for (GroupNameAndArn ele : billingGroups) {
            this.billingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of billing groups.
     * </p>
     * 
     * @param billingGroups
     *        The list of billing groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsResult withBillingGroups(java.util.Collection<GroupNameAndArn> billingGroups) {
        setBillingGroups(billingGroups);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupsResult withNextToken(String nextToken) {
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
        if (getBillingGroups() != null)
            sb.append("BillingGroups: ").append(getBillingGroups()).append(",");
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

        if (obj instanceof ListBillingGroupsResult == false)
            return false;
        ListBillingGroupsResult other = (ListBillingGroupsResult) obj;
        if (other.getBillingGroups() == null ^ this.getBillingGroups() == null)
            return false;
        if (other.getBillingGroups() != null && other.getBillingGroups().equals(this.getBillingGroups()) == false)
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

        hashCode = prime * hashCode + ((getBillingGroups() == null) ? 0 : getBillingGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBillingGroupsResult clone() {
        try {
            return (ListBillingGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
